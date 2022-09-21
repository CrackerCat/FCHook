package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class GIF动图 {
  public static void HookVIP(final XC_LoadPackage.LoadPackageParam lpparam) {

    XposedHelpers.findAndHookMethod(
        "com.stub.StubApp",
        lpparam.classLoader,
        "a",
        Context.class,
        new XC_MethodHook() {

          @Override
          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            super.afterHookedMethod(param);

            Context context = (Context) param.args[0];

            ClassLoader classLoader = context.getClassLoader();

         XposedHelpers.findAndHookMethod(
            "com.bytedance.sdk.openadsdk.TTAdConfig",
            lpparam.classLoader,
            "getAppId",
            new XC_MethodHook() {

                protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(null);
                }
            });
  }});}}


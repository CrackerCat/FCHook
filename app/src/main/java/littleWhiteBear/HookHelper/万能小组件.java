package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class 万能小组件 {
  public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

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
                "com.growing.topwidgets.user.model.UserInfoModel$UserInfo",
                classLoader,
                "getVipStatus",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(1);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.bytedance.sdk.openadsdk.TTAdConfig",
                classLoader,
                "getAppId",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(null);
                  }
                });
          }
        });
  }
}

package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class 爱剪辑 {
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
                "com.shineyie.common.user.entity.VipInfo",
                classLoader,
                "isValid",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.shineyie.common.user.entity.VipInfo",
                classLoader,
                "getVip_type",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(1);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.shineyie.common.user.UserManager",
                classLoader,
                "isForeverVip",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                  }
                });


          }
        });
  }
}

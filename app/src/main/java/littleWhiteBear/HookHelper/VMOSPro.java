package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class VMOSPro {
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
                "com.vmos.pro.bean.UserBean",
                classLoader,
                "getNickName",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult("Siyu");
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.vmos.pro.bean.UserBean",
                classLoader,
                "isTasteMember",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.vmos.pro.account.AccountHelper",
                classLoader,
                "isVipVM",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.vmos.pro.account.AccountHelper",
                classLoader,
                "permanentMember",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.vmos.pro.bean.UserBean",
                classLoader,
                "isExists",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.vmos.pro.bean.UserBean",
                classLoader,
                "isAuthorFlag",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.vmos.pro.account.AccountHelper",
                classLoader,
                "notLogin",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(false);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.vmos.pro.account.AccountHelper",
                classLoader,
                "allowedDisplayAd",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(false);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.vmos.pro.account.AccountHelper",
                classLoader,
                "unlimited",
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

package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class 虚拟定位 {
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
                "ށ.ރ.ؠ.ރ.ރ.މ",
                classLoader,
                "getType",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(1);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "ށ.ރ.ؠ.ރ.ރ.މ",
                classLoader,
                "getProindate",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(4787107805000L);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "ށ.ރ.ؠ.ؠ.֏",
                classLoader,
                "ޅ",
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

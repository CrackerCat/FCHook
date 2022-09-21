package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;
import de.robv.android.xposed.XC_MethodHook.MethodHookParam;

public class 云注入Fuck {
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
                "com.cloudinject.feature.̖̗.̗.-$$Lambda$̗̗$gun6UnjIgu_95PB1m7IaUbOSVCA",
                classLoader,
                "run",
                XC_MethodReplacement.returnConstant(null));
          }
        });
  }
}

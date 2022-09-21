package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;

public class ES文件浏览器 {
  public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

    XposedHelpers.findAndHookMethod(
        "es.tv1",
        lpparam.classLoader,
        "t",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });
  }
}

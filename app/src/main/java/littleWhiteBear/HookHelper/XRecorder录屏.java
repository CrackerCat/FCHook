package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;

public class XRecorder录屏 {
  public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

    XposedHelpers.findAndHookMethod(
        "com.inshot.screenrecorder.iab.k$b",
        lpparam.classLoader,
        "d",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });
  }
}

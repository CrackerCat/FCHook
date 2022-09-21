package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;

public class 一甜相机 {
    public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

        XposedHelpers.findAndHookMethod(
            "com.kwai.m2u.vip.m",
            lpparam.classLoader,
            "x",
            new XC_MethodHook() {

                protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                }
            });

        XposedHelpers.findAndHookMethod(
            "com.kwai.m2u.vip.m",
            lpparam.classLoader,
            "n",
            new XC_MethodHook() {

                protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(4787107805000L);
                }
            });

        XposedHelpers.findAndHookMethod(
            "com.kwai.m2u.account.data.CurrentUser",
            lpparam.classLoader,
            "isUserLogin",
            new XC_MethodHook() {

                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                }
            });
    }
}

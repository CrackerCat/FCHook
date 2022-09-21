package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;

public class 表格Excel {
  public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

    XposedHelpers.findAndHookMethod(
        "com.yipeinet.excel.model.prop.UserModel",
        lpparam.classLoader,
        "isVip",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.yipeinet.excel.model.prop.UserModel",
        lpparam.classLoader,
        "isNormalForeverVip",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.yipeinet.excel.model.prop.UserModel",
        lpparam.classLoader,
        "isForeverVip",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.yipeinet.excel.model.prop.UserModel",
        lpparam.classLoader,
        "getVipTime",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult("2099-01-01");
          }
        });
  }
}

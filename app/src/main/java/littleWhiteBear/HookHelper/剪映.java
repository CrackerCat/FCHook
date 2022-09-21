package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;

public class 剪映 {
  public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

    XposedHelpers.findAndHookMethod(
        "com.vega.pay.data.x30_i",
        lpparam.classLoader,
        "getHasPurchased",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.vega.pay.data.x30_l",
        lpparam.classLoader,
        "isVip",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.vega.pay.data.VipInfo",
        lpparam.classLoader,
        "isVip",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.lm.components.subscribe.config.UserVipInfo",
        lpparam.classLoader,
        "isVipUser",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

XposedHelpers.findAndHookMethod(
        "com.bytedance.sdk.openadsdk.TTAdConfig",
        lpparam.classLoader,
        "getAppId",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(null);
          }
        });

    XposedHelpers.findAndHookMethod(
        "cn.everphoto.user.domain.entity.Profile",
        lpparam.classLoader,
        "isAdvancedMember",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });
  }
}

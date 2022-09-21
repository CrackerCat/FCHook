package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;

public class 七猫免费小说 {
  public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

    XposedHelpers.findAndHookMethod(
        "com.qimao.qmservice.reader.entity.CommonBook",
        lpparam.classLoader,
        "isBookVip",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.qimao.qmservice.reader.entity.CommonBook",
        lpparam.classLoader,
        "isBookInBookshelf",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.qimao.qmservice.ad.entity.AdDataConfig",
        lpparam.classLoader,
        "getAdvertiser",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(null);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.qimao.qmuser.model.entity.mine_v2.BaseInfo",
        lpparam.classLoader,
        "getYear_vip_show",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(1);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.qimao.qmuser.model.entity.mine_v2.BaseInfo",
        lpparam.classLoader,
        "isShowYearVip",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.qimao.qmuser.model.entity.mine_v2.BaseInfo",
        lpparam.classLoader,
        "getVip_show_type",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(0);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.qimao.qmreader.reader.viewmodel.SingleVipViewModel",
        lpparam.classLoader,
        "n",
        java.lang.String.class,
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "em0",
        lpparam.classLoader,
        "j0",
        android.content.Context.class,
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(true);
          }
        });

    XposedHelpers.findAndHookMethod(
        "com.qimao.qmservice.app.entity.AppUpdateResponse",
        lpparam.classLoader,
        "getUpdate_type",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(null);
          }
        });
  }
}

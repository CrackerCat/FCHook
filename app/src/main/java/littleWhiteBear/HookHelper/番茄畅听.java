package littleWhiteBear.HookHelper;

import android.os.Bundle;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import android.widget.Toast;
import android.content.Context;

public class 番茄畅听 {
    public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

        XposedHelpers.findAndHookMethod(
            "com.dragon.read.user.d",
            lpparam.classLoader,
            "j",
            new XC_MethodHook() {


                protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                }
            });

        XposedHelpers.findAndHookMethod(
            "com.dragon.read.user.d",
            lpparam.classLoader,
            "c",
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
    }
}

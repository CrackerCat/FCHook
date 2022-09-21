package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;

public class 简单水印 {

    
	public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

		XposedHelpers.findAndHookMethod(
			"com.xinliwangluo.doimage.prefs.AccountPref",
			lpparam.classLoader,
			"getIsPremium",
			new XC_MethodHook() {

				protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                param.setResult(1);
					
				}
			});
			
		XposedHelpers.findAndHookMethod(
			"com.xinliwangluo.doimage.prefs.AccountPref",
			lpparam.classLoader,
			"getNickname",		
			new XC_MethodHook() {

				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					param.setResult("浮川");
				}
			});
            
            
        XposedHelpers.findAndHookMethod(
            "com.xinliwangluo.doimage.ui.HomeActivity",
            lpparam.classLoader,
            "showOtherDeviceLoginTipDialog",

            new XC_MethodHook() {

                protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    XC_MethodReplacement.returnConstant(null);
                }
			});
			
		XposedHelpers.findAndHookMethod(
			"com.xinliwangluo.doimage.prefs.AccountPref",
			lpparam.classLoader,
			"getPremiumEndTime",
			
			new XC_MethodHook() {

				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					param.setResult("2099-01-01");
				}
			});
	
			
		XposedHelpers.findAndHookMethod(
			"com.xinliwangluo.doimage.prefs.AccountManagerHelper",
			lpparam.classLoader,
			"isVip",
			
			new XC_MethodHook() {

				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					param.setResult(true);
				}
			});
			
			
		XposedHelpers.findAndHookMethod(
			"com.xinliwangluo.doimage.prefs.AccountPref",
			lpparam.classLoader,
			"getAvatar",
			
			new XC_MethodHook() {

				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					param.setResult("https://tuchuangs.com/imgs/2022/09/18/865f543ef6fa8f64.png");
				}
			});
			
			
		XposedHelpers.findAndHookMethod(
			"com.xinliwangluo.doimage.prefs.AccountManagerHelper",
			lpparam.classLoader,
			"isLogin",
			new XC_MethodHook() {

				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					param.setResult(true);
				}
			});
					
		XposedHelpers.findAndHookMethod(
                        "com.xinliwangluo.doimage.ui.HomeActivity",
                     lpparam.classLoader,
                        "showOtherDeviceLoginTipDialog",
                        
                        XC_MethodReplacement.returnConstant(null));
                }
            
	
}

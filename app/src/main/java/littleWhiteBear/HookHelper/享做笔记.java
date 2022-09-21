package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;

public class 享做笔记 {
	public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

		XposedHelpers.findAndHookMethod(
			"com.newskyer.paint.core.PanelUserManager",
			lpparam.classLoader,
			"isPro",
			new XC_MethodHook() {

				protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                param.setResult(true);
					
				}
			});
			
		XposedHelpers.findAndHookMethod(
			"com.newskyer.paint.core.PanelUserManager",
			lpparam.classLoader,
			"getUserName",
			
			new XC_MethodHook() {

				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					param.setResult("浮川");
				}
			});
			
			
		XposedHelpers.findAndHookMethod(
			"com.newskyer.paint.core.PanelUserManager",
			lpparam.classLoader,
			"isLogin",
			new XC_MethodHook() {

				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					param.setResult(true);
				}
			});
			
	}
}

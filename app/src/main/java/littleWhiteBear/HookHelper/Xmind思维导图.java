package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;

public class Xmind思维导图 {
	public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

		XposedHelpers.findAndHookMethod(
			"net.xmind.donut.user.domain.SubStatus",
			lpparam.classLoader,
			"isValid",
			new XC_MethodHook() {

				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					param.setResult(true);
				}
			});
			
			
		XposedHelpers.findAndHookMethod(
			"net.xmind.donut.user.domain.SubStatus",
			lpparam.classLoader,
			"getExpireTime",
			new XC_MethodHook() {

				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					param.setResult(4092599349L);
				}
			});
			
	}
}

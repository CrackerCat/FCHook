package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;
import de.robv.android.xposed.XC_MethodHook.MethodHookParam;

public class 神奇脑波 {
	public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

		XposedHelpers.findAndHookMethod(
			"kotlin.coroutines.jvm.internal.Boxing",
			lpparam.classLoader,
			"boxBoolean",
			boolean.class,
			 XC_MethodReplacement.returnConstant(Boolean.TRUE));
								
				
	}		
	
}

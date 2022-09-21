package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class 次元壁纸 {
	public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

		XposedHelpers.findAndHookMethod(
			"com.wrapper.proxyapplication.WrapperProxyApplication",
			lpparam.classLoader,
			"attachBaseContext",
			Context.class,
			new XC_MethodHook() {

				@Override
				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					super.afterHookedMethod(param);

					Context context = (Context) param.args[0];

					ClassLoader classLoader = context.getClassLoader();

					XposedHelpers.findAndHookMethod(
						"cn.leancloud.LCCloud",
						classLoader,
						"isProductionMode",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(true);
							}
						});

					XposedHelpers.findAndHookMethod(
						"i2.DSrbd",
						classLoader,
						"isPro",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(true);
							}
						});

				}
			});
	}
}

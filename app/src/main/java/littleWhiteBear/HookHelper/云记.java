package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class 云记 {
	public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

		XposedHelpers.findAndHookMethod(
			"com.stub.StubApp",
			lpparam.classLoader,
			"a",
			Context.class,
			new XC_MethodHook() {

				@Override
				protected void afterHookedMethod(MethodHookParam param) throws Throwable {

					super.afterHookedMethod(param);

					Context context = (Context) param.args[0];

					ClassLoader classLoader = context.getClassLoader();

					XposedHelpers.findAndHookMethod(
						"com.jideos.biz_framework.utils.UserUtils",
						classLoader,
						"o",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(1);
							}
						});
						
						
					XposedHelpers.findAndHookMethod(
						"com.jideos.base.http.Bean.Privilege",
						classLoader,
						"getPrivilege",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(1);
							}
						});
						
						

					XposedHelpers.findAndHookMethod(
						"com.jideos.biz_framework.utils.UserUtils",
						classLoader,
						"x",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(true);
							}
						});

					XposedHelpers.findAndHookMethod(
						"com.jideos.biz_framework.utils.UserUtils",
						classLoader,
						"d",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(true);
							}
						});

					XposedHelpers.findAndHookMethod(
						"com.bytedance.sdk.openadsdk.TTAdConfig",
						classLoader,
						"getAppId",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(null);
							}
						});

					XposedHelpers.findAndHookMethod(
						"com.bytedance.sdk.openadsdk.TTAdConfig",
						classLoader,
						"getSdkInfo",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(null);
							}
						});

					XposedHelpers.findAndHookMethod(
						"com.qq.e.comm.managers.b",
						classLoader,
						"d",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(null);
							}
						});

					XposedHelpers.findAndHookMethod(
						"cn.admobiletop.adsuyi.ad.ADSuyiSplashAd",
						classLoader,
						"isAutoSkip",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(true);
							}
						});

					XposedHelpers.findAndHookMethod(
						"com.kwad.sdk.core.network.BaseResultData",
						classLoader,
						"isResultOk",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(false);
							}
						});
				}
			});
	}
}

package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class 迅游加速器 {
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
						"cn.wsds.gamemaster.ui.user.x",
						classLoader,
						"q",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(true);
							}
						});
						
						
					XposedHelpers.findAndHookMethod(
						"com.huawei.updatesdk.service.otaupdate.e",
						classLoader,
						"c",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult(true);
							}
						});
						
						

					XposedHelpers.findAndHookMethod(
						"cn.wsds.gamemaster.bean.SubaoTokenInfo",
						classLoader,
						"getVIPExpiredTime",
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult("2099-09-09");
							}
						});

					XposedHelpers.findAndHookMethod(
						"com.subao.vpn.VPNJni",
						classLoader,
						"getVIPValidTime",
                        int.class,
						new XC_MethodHook() {

							@Override
							protected void afterHookedMethod(MethodHookParam param) throws Throwable {

								param.setResult("2099-09-09");
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

			
	}
});}}

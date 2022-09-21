package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XC_MethodHook.MethodHookParam;

public class 大海影视 {
    public static void HookVIP(final XC_LoadPackage.LoadPackageParam lpparam) {

        XposedHelpers.findAndHookMethod(
            "com.stub.StubApp",
            lpparam.classLoader,
            "a",
            Context.class,
            new XC_MethodHook()
            {

                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    super.afterHookedMethod(param);

                    Context context = (Context) param.args[0];

                    ClassLoader classLoader = context.getClassLoader();

                    XposedHelpers.findAndHookMethod(
                        "com.ys.resemble.entity.MineUserInfo",
                        classLoader,
                        "getIs_vip",
                        new XC_MethodHook()
                        {

                            @Override
                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                                param.setResult(1);
                            }
                        }
                    );

                    XposedHelpers.findAndHookMethod(
                        "com.bytedance.sdk.openadsdk.TTAdConfig",
                        lpparam.classLoader,
                        "getAppId",
                        new XC_MethodHook()
                        {

                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                                param.setResult(null);
                            }
                        }
                    );

                    XposedHelpers.findAndHookMethod(
                        "com.ys.resemble.entity.MineUserInfo",
                        classLoader,
                        "getVip_validity",
                        new XC_MethodHook()
                        {

                            @Override
                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                                param.setResult(4092599349L);
                            }
                        }
                    );
                    XposedHelpers.findAndHookMethod(
                        "com.ys.resemble.entity.MineUserInfo",
                        classLoader,
                        "getInvited_count",
                        new XC_MethodHook()
                        {

                            @Override
                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                                param.setResult(5201314);
                            }
                        }
                    );


                    XposedHelpers.findAndHookMethod(
                        "com.ys.resemble.entity.UserInfoEntry",
                        classLoader,
                        "getLogin_type",
                        new XC_MethodHook()
                        {

                            @Override
                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                                param.setResult(1);
                            }
                        }
                    );

                    XposedHelpers.findAndHookMethod(
                        "me.goldze.mvvmhabit.http.BaseResponse",
                        classLoader,
                        "isOk",
                        new XC_MethodHook()
                        {

                            @Override
                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                                param.setResult(true);
                            }
                        }
                    );

                    XposedHelpers.findAndHookMethod(
                        "com.ys.resemble.entity.MineUserInfo",
                        classLoader,
                        "getNickname",
                        new XC_MethodHook()
                        {

                            @Override
                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                                param.setResult("BY:浮川");
                            }
                        }
                    );


                    XposedHelpers.findAndHookMethod(
                        "com.ys.resemble.entity.AdInfoDetailEntry",
                        classLoader,
                        "getSdk_ad_id",
                        new XC_MethodHook()
                        {

                            @Override
                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                                param.setResult(null);
                            }
                        }
                    );

                    XposedHelpers.findAndHookMethod("com.moqi.sdk.utils.i$a", classLoader, "run", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
                    XposedHelpers.findAndHookMethod("b.k.a.l.l", classLoader, "a", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
                    XposedHelpers.findAndHookMethod("com.moqi.sdk.utils.i", classLoader, "a", new Object[]{"android.content.Context,java.lang.String,java.lang.String",XC_MethodReplacement.returnConstant((Object) null)});

                }
            }
        );
    }
}

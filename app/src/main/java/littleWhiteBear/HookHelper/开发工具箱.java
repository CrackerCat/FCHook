package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import android.widget.TextView;
import android.content.DialogInterface;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XC_MethodHook.MethodHookParam;

public class 开发工具箱 {
    public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

        XposedHelpers.findAndHookMethod(
            "com.stub.StubApp",
            lpparam.classLoader,
            "a",
            Context.class,
            new XC_MethodHook() {

                private String claaz;

                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    super.afterHookedMethod(param);

                    Context context = (Context) param.args[0];

                    ClassLoader classLoader = context.getClassLoader();

                    XposedHelpers.findAndHookMethod(
                        "com.su.assistant.ui.main.O0oOOoO0",
                        classLoader,
                        "o000oOoO",
                        boolean.class,
                        new XC_MethodHook() {
                            @Override
                            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {

                                param.args[0] = true;
                            }
                        });

                    XposedHelpers.findAndHookMethod(
                        "OoO0o0Oo.O0oO0OOo",
                        classLoader,
                        "OOOO000o",
                        new XC_MethodHook() {

                            @Override
                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                                param.setResult(true);
                            }
                        });

                    XposedHelpers.findAndHookMethod(
                        "O0Oooo0O.oO00o0O0",
                        classLoader,
                        "o0O0O0O0",
                        new XC_MethodHook() {

                            @Override
                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                                param.setResult(true);
                            }
                        });

             

                    XposedHelpers.findAndHookMethod(
                        "oOO0oOo0.oOoo0o0O",
                        classLoader,
                        "O0oOOoO0",
                        java.lang.Throwable.class,
                        XC_MethodReplacement.returnConstant(false));
                }
            });
    }
    ;

}

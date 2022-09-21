package littleWhiteBear.HookHelper;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class 图凌 {
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
                "com.chan.cwallpaper.model.bean.TUser",
                classLoader,
                "getLocalVIP",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(true);
                  }
                });
                
            XposedHelpers.findAndHookMethod(
                "com.chan.cwallpaper.model.bean.TUser",
                classLoader,
                "getUserType",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(2);
                  }
                });
                
             XposedHelpers.findAndHookMethod(
                "com.chan.cwallpaper.utils.CUtils",
                classLoader,
                "z",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(false);
                  }
                });
                
            XposedHelpers.findAndHookMethod(
                "com.chan.cwallpaper.model.bean.MyUser",
                classLoader,
                "getVipTime",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult("永久会员");
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.chan.cwallpaper.model.bean.MyUser",
                classLoader,
                "getLevel",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(9999);
                  }
                });
                
                XposedHelpers.findAndHookMethod(
                "com.chan.cwallpaper.model.bean.MyUser",
                classLoader,
                "getDownloadCount",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(9999);
                  }
                });

            XposedHelpers.findAndHookMethod(
                "com.chan.cwallpaper.model.bean.MyUser",
                classLoader,
                "getPoint",
                new XC_MethodHook() {

                  @Override
                  protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    param.setResult(9999);
                  }
                });
          }
        });
  }
}

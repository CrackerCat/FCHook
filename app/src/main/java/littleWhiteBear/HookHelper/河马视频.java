package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;

public class 河马视频 {

	private ClassLoader classLoader;
    public static void HookVIP(final XC_LoadPackage.LoadPackageParam lpparam) {
       
    XposedHelpers.findAndHookMethod("com.stub.StubApp", lpparam.classLoader, "attachBaseContext", Context.class, new XC_MethodHook() {//或者a
    @Override                     
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {     
        super.afterHookedMethod(param);    
            Context context = (Context) param.args[0];
            ClassLoader classLoader = context.getClassLoader();
        XposedHelpers.findAndHookMethod("com.newfroyobt.tabcoentitry.UserInfo", lpparam.classLoader, "getFree_time", new Object[]{XC_MethodReplacement.returnConstant(new Long(4092599349L))});
        XposedHelpers.findAndHookMethod("com.newfroyobt.tabcoentitry.AdResp", lpparam.classLoader, "getAdspos", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
        XposedHelpers.findAndHookMethod("com.newfroyobt.tabcoentitry.AdResp", lpparam.classLoader, "getAdsconf", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
        XposedHelpers.findAndHookMethod("com.moqi.sdk.utils.i$a", lpparam.classLoader, "run", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
        XposedHelpers.findAndHookMethod("com.newfroyobt.tabcoentitry.SysConfigBean", lpparam.classLoader, "getUpgrade_info", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
        XposedHelpers.findAndHookMethod("com.newfroyobt.tabcoentitry.UserInfo", lpparam.classLoader, "getInvited_count", new Object[]{XC_MethodReplacement.returnConstant(new Integer(1314))});
        XposedHelpers.findAndHookMethod("com.newfroyobt.tabcoentitry.UserInfo", lpparam.classLoader, "getLogin_type", new Object[]{XC_MethodReplacement.returnConstant(new Integer(0))});
        XposedHelpers.findAndHookMethod("com.newfroyobt.tabcoentitry.UserInfo", lpparam.classLoader, "getNickname", new Object[]{XC_MethodReplacement.returnConstant("BY：浮川")});
        XposedHelpers.findAndHookMethod("com.newfroyobt.tabcoentitry.SysConf", lpparam.classLoader, "getFilm_notice", new Object[]{XC_MethodReplacement.returnConstant("Siyu")});
          }
        }
      );
   }  
  }

                                                
                                                

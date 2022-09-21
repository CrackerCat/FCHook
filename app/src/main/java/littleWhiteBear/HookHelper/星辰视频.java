package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;

public class 星辰视频  {

	private ClassLoader classLoader;
    public static void HookVIP(final XC_LoadPackage.LoadPackageParam lpparam) {

    XposedHelpers.findAndHookMethod("com.stub.StubApp", lpparam.classLoader, "attachBaseContext", Context.class, new XC_MethodHook() {//或者a
    @Override                     
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {     
        super.afterHookedMethod(param);    
            Context context = (Context) param.args[0];
            ClassLoader classLoader = context.getClassLoader();
            XposedHelpers.findAndHookMethod("me.goldze.mvvmhabit.http.BaseResponse", lpparam.classLoader, "isOk", new Object[]{XC_MethodReplacement.returnConstant(new Boolean(true))});
            XposedHelpers.findAndHookMethod("com.ys.resemble.entity.MineUserInfo", lpparam.classLoader, "getIs_vip", new Object[]{XC_MethodReplacement.returnConstant(new Integer(1))});
            XposedHelpers.findAndHookMethod("com.ys.resemble.entity.MineUserInfo", lpparam.classLoader, "getNickname", new Object[]{XC_MethodReplacement.returnConstant("BY：浮川")});
            XposedHelpers.findAndHookMethod("com.ys.resemble.entity.AdInfoDetailEntry", lpparam.classLoader, "getSdk_ad_id", new Object[]{XC_MethodReplacement.returnConstant("去广告")});
            XposedHelpers.findAndHookMethod("com.ys.resemble.entity.MineUserInfo", lpparam.classLoader, "getVip_validity", new Object[]{XC_MethodReplacement.returnConstant(new Long(4092599349L))});
            XposedHelpers.findAndHookMethod("com.ys.resemble.entity.MineUserInfo", lpparam.classLoader, "getInvited_count", new Object[]{XC_MethodReplacement.returnConstant(new Integer(1314))});
            XposedHelpers.findAndHookMethod("com.ys.resemble.entity.UserInfoEntry", lpparam.classLoader, "getLogin_type", new Object[]{XC_MethodReplacement.returnConstant(new Integer(1))});
            XposedHelpers.findAndHookMethod("com.ys.resemble.ui.homecontent.HomePageViewModel", lpparam.classLoader, "n", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
            XposedHelpers.findAndHookMethod("com.moqi.sdk.utils.i", lpparam.classLoader, "a", new Object[]{"android.content.Context,java.lang.String,java.lang.String",XC_MethodReplacement.returnConstant((Object) null)});                                                                                          
          }
        }
      );
   
}}
                                                
                                                

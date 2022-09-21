package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class 野马视频 {
    public static void HookVIP(final XC_LoadPackage.LoadPackageParam lpparam) {
      
        
        XposedHelpers.findAndHookMethod("com.newfroyobt.comentity.UserInfo", lpparam.classLoader, "getFree_time", new Object[]{XC_MethodReplacement.returnConstant(new Long(218330035200l))});
        XposedHelpers.findAndHookMethod("com.newfroyobt.comentity.AdResp", lpparam.classLoader, "getAdspos", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
        XposedHelpers.findAndHookMethod("com.newfroyobt.comentity.AdResp", lpparam.classLoader, "getAdsconf", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
        XposedHelpers.findAndHookMethod("com.moqi.sdk.utils.i$a", lpparam.classLoader, "run", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
        XposedHelpers.findAndHookMethod("com.newfroyobt.comentity.SysConfigBean", lpparam.classLoader, "getUpgrade_info", new Object[]{XC_MethodReplacement.returnConstant((Object) null)});
        XposedHelpers.findAndHookMethod("com.newfroyobt.comentity.UserInfo", lpparam.classLoader, "getInvited_count", new Object[]{XC_MethodReplacement.returnConstant(new Integer(6666))});
        XposedHelpers.findAndHookMethod("com.newfroyobt.comentity.UserInfo", lpparam.classLoader, "getLogin_type", new Object[]{XC_MethodReplacement.returnConstant(new Integer(0))});
        XposedHelpers.findAndHookMethod("com.newfroyobt.comentity.UserInfo", lpparam.classLoader, "getNickname", new Object[]{XC_MethodReplacement.returnConstant("BY：浮川")});
        XposedHelpers.findAndHookMethod("com.newfroyobt.comentity.SysConf", lpparam.classLoader, "getFilm_notice", new Object[]{XC_MethodReplacement.returnConstant("人间太市绘，不如山中做妖怪！")});
        }
    }


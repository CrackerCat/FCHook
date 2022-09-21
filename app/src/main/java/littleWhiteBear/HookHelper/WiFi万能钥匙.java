package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class WiFi万能钥匙 {

    public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam)  {
       
        XposedHelpers.findAndHookMethod("com.vip.common.b", lpparam.classLoader, "p", new Object[]{XC_MethodReplacement.returnConstant(new Boolean(true))});
        XposedHelpers.findAndHookMethod("com.vip.common.b", lpparam.classLoader, "q", new Object[]{XC_MethodReplacement.returnConstant(new Boolean(true))});
        XposedHelpers.findAndHookMethod("com.vip.common.b", lpparam.classLoader, "j", new Object[]{XC_MethodReplacement.returnConstant(new Boolean(true))});
        }
    
}

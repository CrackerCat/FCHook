package littleWhiteBear.HookHelper;

import android.widget.Toast;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import android.content.Context;

public class 模块激活 {
  public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

    XposedHelpers.findAndHookMethod(
        "littleWhiteBear.HookHelper.MainActivity",
        lpparam.classLoader,
        "isModuleActive",
        XC_MethodReplacement.returnConstant(true));
      
  }
}

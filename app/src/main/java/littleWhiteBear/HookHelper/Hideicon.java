package littleWhiteBear.HookHelper;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;


public class Hideicon {
    public static final boolean getEnable(ComponentName componentName,  Context context) {
        return !context.getPackageManager().queryIntentActivities(new Intent().setComponent(componentName), 65536).isEmpty();
    }

    public static final void setEnable(ComponentName componentName,  Context context, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        if (getEnable(componentName, context) != z) {
            packageManager.setComponentEnabledSetting(componentName, z ? 1 : 2, 1);
        }
    }

}

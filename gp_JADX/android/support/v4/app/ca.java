package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;

public final class ca {
    public static boolean m1403a(Activity activity, Intent intent) {
        if (VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
    }

    public static Intent m1401a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            Intent parentActivityIntent = activity.getParentActivityIntent();
            if (parentActivityIntent != null) {
                return parentActivityIntent;
            }
        }
        String b = m1404b(activity);
        if (b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, b);
        try {
            if (m1405b(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (NameNotFoundException e) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b + "' in manifest");
            return null;
        }
    }

    public static Intent m1402a(Context context, ComponentName componentName) {
        String b = m1405b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        if (m1405b(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String m1404b(Activity activity) {
        try {
            return m1405b(activity, activity.getComponentName());
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String m1405b(Context context, ComponentName componentName) {
        String str;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (VERSION.SDK_INT >= 16) {
            str = activityInfo.parentActivityName;
            if (str != null) {
                return str;
            }
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        str = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
        if (str == null) {
            return null;
        }
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        return str;
    }
}

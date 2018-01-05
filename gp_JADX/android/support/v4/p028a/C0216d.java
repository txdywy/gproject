package android.support.v4.p028a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;

public class C0216d {
    public static final Object f1218b = new Object();
    public static TypedValue f1219c;

    public static boolean m1114a(Context context, Intent[] intentArr) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, null);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    public static void m1113a(Context context, Intent intent, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static final Drawable m1112a(Context context, int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        int i2;
        synchronized (f1218b) {
            if (f1219c == null) {
                f1219c = new TypedValue();
            }
            context.getResources().getValue(i, f1219c, true);
            i2 = f1219c.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static final ColorStateList m1115b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static final int m1116c(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static int m1111a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }
}

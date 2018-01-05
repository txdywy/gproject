package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;

final class C0418j {
    public static final int[] f2440a = new int[]{16843531};

    public static C0419k m2631a(Activity activity, Drawable drawable, int i) {
        C0419k c0419k = new C0419k(activity);
        if (c0419k.f2441a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                c0419k.f2441a.invoke(actionBar, new Object[]{drawable});
                c0419k.f2442b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Throwable e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else if (c0419k.f2443c != null) {
            c0419k.f2443c.setImageDrawable(drawable);
        } else {
            Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
        }
        return c0419k;
    }

    public static C0419k m2632a(C0419k c0419k, Activity activity, int i) {
        if (c0419k == null) {
            c0419k = new C0419k(activity);
        }
        if (c0419k.f2441a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                c0419k.f2442b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Throwable e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return c0419k;
    }

    public static Drawable m2630a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f2440a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }
}

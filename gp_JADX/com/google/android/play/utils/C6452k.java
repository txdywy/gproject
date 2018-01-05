package com.google.android.play.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v4.view.r;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.play.e;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public final class C6452k {
    public static final Pattern f32425a = Pattern.compile(",");
    public static final String[] f32426b = new String[0];
    public static Boolean f32427c;

    public static boolean m29505a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television");
    }

    public static boolean m29504a() {
        Object[] objArr;
        CharSequence charSequence = Build.TAGS;
        if (charSequence == null || charSequence.length() == 0) {
            objArr = f32426b;
        } else {
            objArr = charSequence.indexOf(44) == -1 ? new String[]{charSequence} : f32425a.split(charSequence);
        }
        List asList = Arrays.asList(objArr);
        if (asList.contains("dev-keys") || asList.contains("test-keys")) {
            return true;
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public static boolean m29507b(Context context) {
        if (VERSION.SDK_INT >= 17 && context.getResources().getConfiguration().getLayoutDirection() != 0) {
            return false;
        }
        return true;
    }

    @TargetApi(17)
    public static void m29508c(Context context) {
        if (VERSION.SDK_INT >= 17) {
            context.getResources().getConfiguration().setLayoutDirection(Locale.US);
        }
    }

    public static int m29502a(int i, int i2, boolean z, int i3) {
        return z ? i3 : (i - i3) - i2;
    }

    public static int m29506b(int i, int i2, boolean z, int i3) {
        return C6452k.m29502a(i, i2, !z, i3);
    }

    public static int m29503a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return r.b(marginLayoutParams) + r.a(marginLayoutParams);
    }

    public static synchronized boolean m29509d(Context context) {
        boolean booleanValue;
        synchronized (C6452k.class) {
            if (f32427c == null) {
                if (VERSION.SDK_INT >= 21) {
                    f32427c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
                } else {
                    f32427c = Boolean.valueOf(false);
                }
            }
            booleanValue = f32427c.booleanValue();
        }
        return booleanValue;
    }

    public static int m29510e(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return resources.getDimensionPixelSize(e.play_status_bar_height);
    }
}

package com.google.android.finsky.dialogbuilder;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.bg;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.play.image.C1294w;

public final class C2820s {
    public final C1294w f15190a;

    public C2820s(C1294w c1294w) {
        this.f15190a = c1294w;
    }

    static void m14942a(TextView textView, int i, Bitmap bitmap) {
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        if (bitmap != null) {
            compoundDrawablesRelative[i] = new BitmapDrawable(textView.getResources(), bitmap);
        } else {
            compoundDrawablesRelative[i] = null;
        }
        bg.m2222a(textView, compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    static int m14941a(float f, View view) {
        return (int) TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics());
    }
}

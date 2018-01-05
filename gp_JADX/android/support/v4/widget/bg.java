package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.os.C0327a;
import android.widget.TextView;

public final class bg {
    public static final bm f2112a;

    public static void m2222a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        f2112a.mo479a(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void m2221a(TextView textView, int i) {
        f2112a.mo481b(textView, i);
    }

    static {
        if (C0327a.m1723c()) {
            f2112a = new bl();
        } else if (VERSION.SDK_INT >= 23) {
            f2112a = new bk();
        } else if (VERSION.SDK_INT >= 18) {
            f2112a = new bj();
        } else if (VERSION.SDK_INT >= 17) {
            f2112a = new bi();
        } else if (VERSION.SDK_INT >= 16) {
            f2112a = new bh();
        } else {
            f2112a = new bm();
        }
    }
}

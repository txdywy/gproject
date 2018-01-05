package com.google.android.finsky.av;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.as.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.installqueue.p;
import com.google.android.finsky.utils.i;

public static class com.google.android.finsky.av.a
{

    a() {
    }

    public static void a(Context p0, com.google.android.finsky.installqueue.p p1, TextView p2, TextView p3, ProgressBar p4) {
        com.google.android.finsky.av.a.a(p0, p1, p2, p3, p4, 0);
    }

    public static void a(Context p0, com.google.android.finsky.installqueue.p p1, TextView p2, TextView p3, ProgressBar p4, com.google.android.finsky.av.d p5) {
        if (p5 != 0) {
            if (p5.c != 0) {
                p5.c.cancel();
                p5.c = 0;
            }
            p5.d = 0;
            p5.e = 0;
        }
        v12 = Html.fromHtml(p0.getString(2131952081));
        v2 = Html.fromHtml(p0.getString(2131952080));
        p3.setText(" ");
        p2.setText(" ");
        if (p1.a != 2) {
            if (p1.a == 1) {
                p4.setIndeterminate(0);
                p4.setProgress(0);
            }
            else
                p4.setIndeterminate(1);
            if (p1.a == 3)
                p2.setText(2131952321);
            else if (com.google.android.finsky.as.a.a(p0))
                p2.setText(2131953278);
        }
        else {
            v13 = com.google.android.finsky.av.a.a(p1);
            if (v13 != 0)
                v9 = com.google.android.finsky.av.a.b(p1);
            else
                v9 = 0;
            if (v13 != 0) {
                p4.setIndeterminate(0);
                if (p5 == 0) {
                    p4.setMax(100);
                    p4.setProgress(v9);
                }
                else {
                    p4.setMax(10000);
                    p5.d = 1;
                    p5.i = p4.getProgress();
                    p5.j = (int)(p1.b * 10000 / p1.c);
                }
            }
            else
                p4.setIndeterminate(1);
            if (p1.d == 195)
                p2.setText(2131952073);
            else if (p1.d == 196)
                p2.setText(2131952074);
            else if (v13 != 0) {
                if (p5 == 0) {
                    com.google.android.finsky.av.a.a(v12, v9, p3);
                    com.google.android.finsky.av.a.a(v2, p0, p1.b, p1.c, p2);
                }
                else {
                    p5.e = 1;
                    p5.k = p5.f;
                    p5.l = v9;
                    p5.m = p5.g;
                    p5.n = p1.b;
                }
            }
            else
                p2.setText(2131952067);
            if (p5 != 0) {
                if (v13 == 0)
                    p5.b = 0;
                else {
                    v4 = com.google.android.finsky.utils.i.a();
                    if (p5.b == 0 || v9 >= 100)
                        p5.h = 2000;
                    else
                        p5.h = Math.min(2000, Math.max(300, v4 - p5.b));
                    p5.b = v4;
                    p5.p = 0;
                    p5.c = ValueAnimator.ofFloat(new float[2]{1065353216, 0});
                    p5.c.addUpdateListener(new com.google.android.finsky.av.c(p5, p4, v12, p3, v2, p0, p1.c, p2));
                    p5.c.setInterpolator(com.google.android.finsky.av.d.a);
                    p5.c.setDuration(p5.h);
                    p5.c.start();
                }
            }
        }
    }

    public static void a(com.google.android.finsky.installqueue.p p0, View p1, View p2, String p3, com.google.android.finsky.installer.k p4, com.google.android.finsky.d.w p5, com.google.android.finsky.d.ad p6) {
        if (p0.d == 196) {
            p2.setVisibility(0);
            p1.setOnClickListener(new com.google.android.finsky.av.b(p5, p6, p4, p3, p2));
        }
        else {
            p2.setVisibility(8);
            p1.setOnClickListener(0);
            p1.setClickable(0);
            p1.setFocusable(0);
        }
    }

    static void a(CharSequence p0, int p1, TextView p2) {
        v0 = new CharSequence[1];
        v0[0] = Integer.toString(p1);
        p2.setText(TextUtils.expandTemplate(p0, v0));
    }

    static void a(CharSequence p0, Context p1, long p2, long p4, TextView p6) {
        v0 = new CharSequence[2];
        v0[0] = Formatter.formatFileSize(p1, p2);
        v0[1] = Formatter.formatFileSize(p1, p4);
        p6.setText(TextUtils.expandTemplate(p0, v0));
    }

    public static boolean a(com.google.android.finsky.installqueue.p p0) {
        if (p0.b > 0 && p0.c > 0 && p0.b <= p0.c)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public static int b(com.google.android.finsky.installqueue.p p0) {
        return (int)(p0.b * 100 / p0.c);
    }

}

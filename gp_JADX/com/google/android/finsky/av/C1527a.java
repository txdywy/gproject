package com.google.android.finsky.av;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.C4678i;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.leakcanary.C7582R;

public final class C1527a {
    public static void m8949a(C3371p c3371p, View view, View view2, String str, C3300k c3300k, C2495w c2495w, ad adVar) {
        if (c3371p.f17279d == 196) {
            view2.setVisibility(0);
            view.setOnClickListener(new C1528b(c2495w, adVar, c3300k, str, view2));
            return;
        }
        view2.setVisibility(8);
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setFocusable(false);
    }

    public static void m8947a(Context context, C3371p c3371p, TextView textView, TextView textView2, ProgressBar progressBar) {
        C1527a.m8948a(context, c3371p, textView, textView2, progressBar, null);
    }

    public static void m8948a(Context context, C3371p c3371p, TextView textView, TextView textView2, ProgressBar progressBar, C1530d c1530d) {
        if (c1530d != null) {
            if (c1530d.f8249c != null) {
                c1530d.f8249c.cancel();
                c1530d.f8249c = null;
            }
            c1530d.f8250d = false;
            c1530d.f8251e = false;
        }
        CharSequence fromHtml = Html.fromHtml(context.getString(C7582R.string.download_progress_percentage));
        CharSequence fromHtml2 = Html.fromHtml(context.getString(C7582R.string.download_progress_bytes));
        textView2.setText(" ");
        textView.setText(" ");
        if (c3371p.f17276a != 2) {
            if (c3371p.f17276a == 1) {
                progressBar.setIndeterminate(false);
                progressBar.setProgress(0);
            } else {
                progressBar.setIndeterminate(true);
            }
            if (c3371p.f17276a == 3) {
                textView.setText(C7582R.string.installing);
                return;
            } else if (C1503a.m8830a(context)) {
                textView.setText(C7582R.string.tv_install_pending);
                return;
            } else {
                return;
            }
        }
        boolean a = C1527a.m8952a(c3371p);
        int b = a ? C1527a.m8953b(c3371p) : 0;
        if (a) {
            progressBar.setIndeterminate(false);
            if (c1530d == null) {
                progressBar.setMax(100);
                progressBar.setProgress(b);
            } else {
                progressBar.setMax(10000);
                c1530d.f8250d = true;
                c1530d.f8255i = progressBar.getProgress();
                c1530d.f8256j = (int) ((c3371p.f17277b * 10000) / c3371p.f17278c);
            }
        } else {
            progressBar.setIndeterminate(true);
        }
        int i = c3371p.f17279d;
        if (i == HprofParser.ROOT_PRIMITIVE_ARRAY_NODATA) {
            textView.setText(C7582R.string.download_paused_network);
        } else if (i == 196) {
            textView.setText(C7582R.string.download_paused_wifi);
        } else if (!a) {
            textView.setText(C7582R.string.download_in_progress);
        } else if (c1530d == null) {
            C1527a.m8950a(fromHtml, b, textView2);
            C1527a.m8951a(fromHtml2, context, c3371p.f17277b, c3371p.f17278c, textView);
        } else {
            c1530d.f8251e = true;
            c1530d.f8257k = c1530d.f8252f;
            c1530d.f8258l = b;
            c1530d.f8259m = c1530d.f8253g;
            c1530d.f8260n = c3371p.f17277b;
        }
        if (c1530d != null) {
            long j = c3371p.f17278c;
            if (a) {
                long a2 = C4678i.m21812a();
                if (c1530d.f8248b == 0 || b >= 100) {
                    c1530d.f8254h = 2000;
                } else {
                    c1530d.f8254h = Math.min(2000, Math.max(300, a2 - c1530d.f8248b));
                }
                c1530d.f8248b = a2;
                c1530d.f8262p = false;
                c1530d.f8249c = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                c1530d.f8249c.addUpdateListener(new C1529c(c1530d, progressBar, fromHtml, textView2, fromHtml2, context, j, textView));
                c1530d.f8249c.setInterpolator(C1530d.f8247a);
                c1530d.f8249c.setDuration(c1530d.f8254h);
                c1530d.f8249c.start();
                return;
            }
            c1530d.f8248b = 0;
        }
    }

    public static boolean m8952a(C3371p c3371p) {
        return c3371p.f17277b > 0 && c3371p.f17278c > 0 && c3371p.f17277b <= c3371p.f17278c;
    }

    public static int m8953b(C3371p c3371p) {
        return (int) ((c3371p.f17277b * 100) / c3371p.f17278c);
    }

    static void m8950a(CharSequence charSequence, int i, TextView textView) {
        textView.setText(TextUtils.expandTemplate(charSequence, new CharSequence[]{Integer.toString(i)}));
    }

    static void m8951a(CharSequence charSequence, Context context, long j, long j2, TextView textView) {
        textView.setText(TextUtils.expandTemplate(charSequence, new CharSequence[]{Formatter.formatFileSize(context, j), Formatter.formatFileSize(context, j2)}));
    }
}

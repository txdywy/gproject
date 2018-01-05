package com.google.android.finsky.layoutswitcher;

import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.frameworkviews.LinkTextView;
import com.google.android.finsky.providers.C3947d;
import com.squareup.leakcanary.C7582R;

public class C3166e {
    public final Handler f16384c;
    public final C1043h f16385d;
    public final View f16386e;
    public final ViewGroup f16387f;
    public int f16388g;
    public final int f16389h;
    public final int f16390i;
    public final int f16391j;
    public final OnClickListener f16392k;
    public int f16393l;
    public int f16394m;
    public C3736d f16395n;
    public volatile boolean f16396o;

    public C3166e(View view, int i, int i2, int i3, C1043h c1043h, int i4) {
        this.f16384c = new Handler();
        this.f16392k = new C3737f(this);
        this.f16396o = false;
        this.f16388g = i;
        this.f16389h = i2;
        this.f16390i = 0;
        this.f16391j = i3;
        this.f16386e = view;
        this.f16385d = c1043h;
        this.f16393l = i4;
        this.f16387f = (ViewGroup) this.f16386e.findViewById(this.f16388g);
        ((C1399i) C3947d.m18649a(C1399i.class)).mo1866a(this);
    }

    public C3166e(View view, C1043h c1043h) {
        this.f16384c = new Handler();
        this.f16392k = new C3737f(this);
        this.f16396o = false;
        this.f16388g = C7582R.id.strip;
        this.f16389h = C7582R.id.error_indicator;
        this.f16390i = 0;
        this.f16391j = C7582R.id.loading_indicator;
        this.f16386e = view;
        this.f16385d = c1043h;
        this.f16387f = (ViewGroup) this.f16386e.findViewById(this.f16388g);
        this.f16393l = 3;
        m16121a(false);
        m16122a(false, null);
        if (this.f16390i != 0) {
            m16124b(false);
        }
        mo3351a(false, false);
        ((C1399i) C3947d.m18649a(C1399i.class)).mo1866a(this);
    }

    public C3166e(View view, int i, int i2, C1043h c1043h, int i3) {
        this.f16384c = new Handler();
        this.f16392k = new C3737f(this);
        this.f16396o = false;
        this.f16388g = i;
        this.f16389h = C7582R.id.page_error_indicator;
        this.f16390i = C7582R.id.page_error_indicator_with_notifier;
        this.f16391j = i2;
        this.f16386e = view;
        this.f16385d = c1043h;
        this.f16393l = i3;
        this.f16387f = (ViewGroup) this.f16386e.findViewById(this.f16388g);
        ((C1399i) C3947d.m18649a(C1399i.class)).mo1866a(this);
    }

    public final void m16126a(int i) {
        this.f16396o = true;
        this.f16384c.postDelayed(new C3738g(this), (long) i);
    }

    public void mo3397a() {
        m16127a(2, null);
    }

    private final int m16123b() {
        if (this.f16390i == 0 || !this.f16395n.m17616a()) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m16127a(int r6, java.lang.CharSequence r7) {
        /*
        r5 = this;
        r2 = 1;
        r3 = 0;
        r5.f16396o = r3;
        r0 = r5.f16393l;
        if (r0 != r6) goto L_0x0015;
    L_0x0008:
        r0 = r5.f16393l;
        if (r0 != r2) goto L_0x0014;
    L_0x000c:
        r1 = r5.f16394m;
        r0 = r5.m16123b();
        if (r1 != r0) goto L_0x0019;
    L_0x0014:
        return;
    L_0x0015:
        r0 = r5.m16123b();
    L_0x0019:
        r1 = r5.f16393l;
        switch(r1) {
            case 0: goto L_0x0042;
            case 1: goto L_0x004f;
            case 2: goto L_0x005c;
            default: goto L_0x001e;
        };
    L_0x001e:
        switch(r6) {
            case 0: goto L_0x0061;
            case 1: goto L_0x0069;
            case 2: goto L_0x0073;
            case 3: goto L_0x0064;
            default: goto L_0x0021;
        };
    L_0x0021:
        r0 = new java.lang.IllegalStateException;
        r1 = 84;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Invalid mode ";
        r1 = r2.append(r1);
        r1 = r1.append(r6);
        r2 = "should be LOADING_MODE, ERROR_MODE, DATA_MODE, or BLANK_MODE";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0042:
        r5.m16121a(r3);
        r1 = 2;
        if (r6 == r1) goto L_0x001e;
    L_0x0048:
        r1 = r5;
    L_0x0049:
        r4 = r1;
        r1 = r3;
    L_0x004b:
        r4.mo3351a(r3, r1);
        goto L_0x001e;
    L_0x004f:
        r1 = r5.f16394m;
        if (r1 != 0) goto L_0x0058;
    L_0x0053:
        r1 = 0;
        r5.m16122a(r3, r1);
        goto L_0x001e;
    L_0x0058:
        r5.m16124b(r3);
        goto L_0x001e;
    L_0x005c:
        if (r6 != 0) goto L_0x0077;
    L_0x005e:
        r1 = r2;
        r4 = r5;
        goto L_0x004b;
    L_0x0061:
        r5.m16121a(r2);
    L_0x0064:
        r5.f16393l = r6;
        r5.f16394m = r0;
        goto L_0x0014;
    L_0x0069:
        if (r0 != 0) goto L_0x006f;
    L_0x006b:
        r5.m16122a(r2, r7);
        goto L_0x0064;
    L_0x006f:
        r5.m16124b(r2);
        goto L_0x0064;
    L_0x0073:
        r5.mo3351a(r2, r3);
        goto L_0x0064;
    L_0x0077:
        r1 = r5;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layoutswitcher.e.a(int, java.lang.CharSequence):void");
    }

    private final void m16121a(boolean z) {
        this.f16386e.findViewById(this.f16391j).setVisibility(z ? 0 : 8);
    }

    private final void m16122a(boolean z, CharSequence charSequence) {
        View findViewById = this.f16386e.findViewById(this.f16389h);
        findViewById.setVisibility(z ? 0 : 8);
        if (z) {
            TextView textView = (TextView) findViewById.findViewById(C7582R.id.error_msg);
            textView.setText(charSequence);
            if (textView instanceof LinkTextView) {
                LinkTextView linkTextView = (LinkTextView) textView;
                linkTextView.setContentDescription(charSequence);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        ((Button) findViewById.findViewById(C7582R.id.retry_button)).setOnClickListener(z ? this.f16392k : null);
    }

    private final void m16124b(boolean z) {
        ErrorIndicatorWithNotifyLayout errorIndicatorWithNotifyLayout = (ErrorIndicatorWithNotifyLayout) this.f16386e.findViewById(this.f16390i);
        Button button = (Button) errorIndicatorWithNotifyLayout.findViewById(C7582R.id.retry_button);
        if (z) {
            errorIndicatorWithNotifyLayout.setVisibility(0);
            if (((Boolean) C0954a.f5809E.m5760a()).booleanValue()) {
                errorIndicatorWithNotifyLayout.m17612a(C3735c.m17615a(1, 0));
            } else {
                errorIndicatorWithNotifyLayout.m17612a(C3735c.m17615a(5, 0));
            }
            button.setOnClickListener(this.f16392k);
            return;
        }
        errorIndicatorWithNotifyLayout.setVisibility(8);
        button.setOnClickListener(null);
    }

    public void mo3351a(boolean z, boolean z2) {
        if (this.f16388g > 0 && this.f16387f != null) {
            this.f16387f.setVisibility(z ? 0 : 8);
        }
    }
}

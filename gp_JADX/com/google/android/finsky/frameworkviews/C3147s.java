package com.google.android.finsky.frameworkviews;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.ai;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.finsky.utils.aj;

public final class C3147s {
    public final View f16278a;
    public final int f16279b = 2;
    public final int f16280c = 2;
    public final C3148t f16281d;

    public C3147s(View view, View view2) {
        aj.m21700a(view);
        this.f16278a = (View) aj.m21700a(view2);
        this.f16281d = new C3148t(view.getContext());
        View view3 = this.f16281d;
        view3.f16306t = view;
        DisplayMetrics displayMetrics = view3.f16303q.getResources().getDisplayMetrics();
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view3.f16285D = view.getMeasuredHeight();
        view3.f16304r = new PopupWindow(view3);
        view3.addView(view);
    }

    public final void m16052a(OnDismissListener onDismissListener) {
        C3148t c3148t = this.f16281d;
        if (c3148t.f16304r != null) {
            c3148t.f16304r.setOnDismissListener(onDismissListener);
        }
    }

    static int m16048a(int i, View view) {
        Object obj = ai.f1848a.mo400k(view) == 1 ? 1 : null;
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                if (obj == null) {
                    return 3;
                }
                return 4;
            case 4:
                if (obj == null) {
                    return 4;
                }
                return 3;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static boolean m16049a(int i) {
        return i == 1 || i == 2;
    }

    public final void m16051a(Rect rect) {
        boolean z = true;
        int i = this.f16279b;
        int i2 = this.f16280c;
        this.f16281d.m16057a(this.f16278a, rect, i, i2);
        int height;
        if (C3147s.m16049a(i)) {
            boolean z2;
            View view = this.f16281d;
            if (C3147s.m16049a(i)) {
                height = view.getHeight();
                if (height == 0) {
                    height = MeasureSpec.makeMeasureSpec(0, 0);
                    view.measure(height, height);
                    height = view.getMeasuredHeight();
                }
                z2 = i == 1 ? height < rect.top : height < (view.getResources().getDisplayMetrics().heightPixels - rect.height()) - rect.top;
            } else {
                z2 = true;
            }
            if (!z2) {
                if (i == 1) {
                    height = 2;
                } else {
                    height = 1;
                }
                this.f16281d.m16057a(this.f16278a, rect, height, i2);
            }
        } else {
            View view2 = this.f16281d;
            View view3 = this.f16278a;
            if (!C3147s.m16049a(i)) {
                int a = C3147s.m16048a(i, view3);
                height = view2.getWidth();
                if (height == 0) {
                    height = MeasureSpec.makeMeasureSpec(0, 0);
                    view2.measure(height, height);
                    height = view2.getMeasuredWidth();
                }
                int i3 = view2.getResources().getDisplayMetrics().widthPixels;
                if (a == 3) {
                    if (height >= rect.left) {
                        z = false;
                    }
                } else if (height >= (i3 - rect.width()) - rect.left) {
                    z = false;
                }
            }
            if (!z) {
                if (i == 3) {
                    height = 4;
                } else {
                    height = 3;
                }
                this.f16281d.m16057a(this.f16278a, rect, height, i2);
            }
        }
        C3148t c3148t = this.f16281d;
        if (!c3148t.f16286E || c3148t.f16285D <= c3148t.f16306t.getMeasuredHeight()) {
            c3148t.f16304r.setClippingEnabled(false);
            c3148t.f16304r.setAnimationStyle(c3148t.f16284C);
            c3148t.f16304r.setBackgroundDrawable(new BitmapDrawable(c3148t.f16303q.getResources(), ""));
            c3148t.f16304r.setOutsideTouchable(c3148t.f16305s);
            c3148t.f16304r.showAtLocation(c3148t.f16307u, 0, 0, 0);
        }
    }

    public final void m16050a() {
        C3148t c3148t = this.f16281d;
        c3148t.f16284C = 0;
        c3148t.f16304r.setAnimationStyle(c3148t.f16284C);
    }
}

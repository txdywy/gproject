package com.google.android.finsky.dialogbuilder.layout;

import android.content.Context;
import android.content.res.Resources;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.an;
import android.support.design.widget.aq;
import android.support.v4.view.p039b.C0343a;
import android.support.v4.view.p039b.C0344b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Interpolator;
import com.google.wireless.android.finsky.dfe.c.a.dn;
import com.squareup.leakcanary.C7582R;
import java.lang.ref.WeakReference;

public class FixedBottomSheetBehavior extends an {
    public static final dn f15136a = new dn();
    public static final Interpolator f15137b = new C0344b();
    public static final Interpolator f15138c = new C0343a();
    public final int f15139d;
    public final int f15140e;
    public int f15141f;
    public int f15142g;
    public boolean f15143h;
    public dn f15144i = f15136a;
    public WeakReference f15145j;
    public C2805g f15146k;

    public static FixedBottomSheetBehavior m14911a(ViewGroup viewGroup) {
        LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof aq) {
            an anVar = ((aq) layoutParams).f794a;
            if (anVar instanceof FixedBottomSheetBehavior) {
                return (FixedBottomSheetBehavior) anVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public FixedBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f15139d = resources.getInteger(17694720);
        this.f15140e = resources.getInteger(17694722) - this.f15139d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m14912a(android.support.design.widget.CoordinatorLayout r10, android.view.ViewGroup r11, int r12) {
        /*
        r9 = this;
        r8 = 1;
        r5 = 0;
        r0 = android.support.v4.view.ai.f1848a;
        r0 = r0.mo397i(r10);
        if (r0 == 0) goto L_0x0015;
    L_0x000a:
        r0 = android.support.v4.view.ai.f1848a;
        r0 = r0.mo397i(r11);
        if (r0 != 0) goto L_0x0015;
    L_0x0012:
        android.support.v4.view.ai.m1853i(r11);
    L_0x0015:
        r10.m460a(r11, r12);
        r1 = r10.getHeight();
        r0 = r9.f15142g;
        r0 = r1 - r0;
        r2 = java.lang.Math.max(r5, r0);
        r0 = 2131755396; // 0x7f100184 float:1.914167E38 double:1.0532271065E-314;
        r3 = r10.findViewById(r0);
        r0 = r9.f15143h;
        if (r0 != 0) goto L_0x0039;
    L_0x002f:
        r0 = (float) r2;
        r11.setTranslationY(r0);
        if (r3 == 0) goto L_0x0039;
    L_0x0035:
        r0 = (float) r2;
        r3.setTranslationY(r0);
    L_0x0039:
        r0 = r11.getHeight();
        r4 = r9.f15144i;
        r4 = r4.b;
        switch(r4) {
            case 1: goto L_0x00dc;
            case 2: goto L_0x00e2;
            default: goto L_0x0044;
        };
    L_0x0044:
        r9.f15142g = r0;
    L_0x0046:
        r0 = r9.f15142g;
        r0 = r1 - r0;
        r4 = java.lang.Math.max(r5, r0);
        if (r2 == r4) goto L_0x00a9;
    L_0x0050:
        r9.f15143h = r8;
        r0 = r9.f15146k;
        if (r0 != 0) goto L_0x005e;
    L_0x0056:
        r0 = new com.google.android.finsky.dialogbuilder.layout.g;
        r5 = 0;
        r0.<init>(r9, r5);
        r9.f15146k = r0;
    L_0x005e:
        r5 = r9.f15139d;
        r6 = r9.f15140e;
        r0 = 0;
        if (r1 <= 0) goto L_0x006e;
    L_0x0065:
        r0 = r2 - r4;
        r0 = java.lang.Math.abs(r0);
        r0 = (float) r0;
        r1 = (float) r1;
        r0 = r0 / r1;
    L_0x006e:
        r1 = (float) r6;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = java.lang.Math.min(r2, r0);
        r0 = r0 * r1;
        r0 = java.lang.Math.round(r0);
        r0 = r0 + r5;
        r1 = r11.animate();
        r2 = (float) r4;
        r1 = r1.translationY(r2);
        r2 = f15137b;
        r1 = r1.setInterpolator(r2);
        r6 = (long) r0;
        r1 = r1.setDuration(r6);
        r2 = r9.f15146k;
        r1.setListener(r2);
        if (r3 == 0) goto L_0x00a9;
    L_0x0096:
        r1 = r3.animate();
        r2 = (float) r4;
        r1 = r1.translationY(r2);
        r2 = f15137b;
        r1 = r1.setInterpolator(r2);
        r2 = (long) r0;
        r1.setDuration(r2);
    L_0x00a9:
        r0 = new android.graphics.Rect;
        r0.<init>();
        r10.getWindowVisibleDisplayFrame(r0);
        r1 = r0.bottom;
        r0 = r0.top;
        r1 = r1 - r0;
        r0 = r9.f15141f;
        r9.f15141f = r1;
        if (r0 == 0) goto L_0x00db;
    L_0x00bc:
        if (r1 == r0) goto L_0x00db;
    L_0x00be:
        r0 = r9.f15145j;
        if (r0 == 0) goto L_0x00db;
    L_0x00c2:
        r0 = r9.f15145j;
        r0 = r0.get();
        if (r0 == 0) goto L_0x00db;
    L_0x00ca:
        r0 = r9.f15145j;
        r0 = r0.get();
        r0 = (android.view.View) r0;
        r2 = r10.getHeight();
        r1 = r1 - r2;
        r1 = (float) r1;
        r0.setTranslationY(r1);
    L_0x00db:
        return r8;
    L_0x00dc:
        r4 = r9.f15142g;
        if (r4 >= r0) goto L_0x0046;
    L_0x00e0:
        goto L_0x0044;
    L_0x00e2:
        r9.f15142g = r1;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.dialogbuilder.layout.FixedBottomSheetBehavior.a(android.support.design.widget.CoordinatorLayout, android.view.ViewGroup, int):boolean");
    }

    public final /* synthetic */ boolean mo91a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        View findViewById = ((ViewGroup) view).findViewById(C7582R.id.footer_placeholder);
        if (findViewById != null) {
            findViewById.setMinimumHeight(view2.getHeight());
        }
        return true;
    }

    public final /* synthetic */ boolean mo92a(View view, View view2) {
        boolean z = view2.getId() == C7582R.id.footer_frame;
        if (z) {
            this.f15145j = new WeakReference(view2);
        }
        return z;
    }
}

package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.p154b.C2791f;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.dialogbuilder.p154b.C2793j;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.bs;
import com.squareup.leakcanary.C7582R;

public final class C2767g extends C1666l {
    public C2798j f15036a;
    public final bs f15037b;
    public final C2792h f15038c;
    public final C2791f f15039d;
    public final C2793j f15040e;

    public C2767g(LayoutInflater layoutInflater, bs bsVar, C2792h c2792h, C2791f c2791f, C2793j c2793j) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1823a(this);
        this.f15037b = bsVar;
        this.f15038c = c2792h;
        this.f15039d = c2791f;
        this.f15040e = c2793j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2378a(com.google.android.finsky.dialogbuilder.C2797e r14, android.view.View r15) {
        /*
        r13 = this;
        r15 = (com.google.android.finsky.dialogbuilder.layout.CheckedGroupView) r15;
        r10 = new com.google.android.finsky.dialogbuilder.a.h;
        r10.<init>(r13);
        r15.setCheckedChangeListener(r10);
        r0 = r13.f15037b;
        r11 = r0.f;
        r0 = 0;
        r8 = r0;
    L_0x0010:
        r0 = r13.f15037b;
        r0 = r0.b;
        r0 = r0.length;
        if (r8 >= r0) goto L_0x0102;
    L_0x0017:
        r0 = r13.f15037b;
        r0 = r0.b;
        r12 = r0[r8];
        r0 = r13.f;
        r1 = 2130969567; // 0x7f0403df float:1.754782E38 double:1.0528388554E-314;
        r2 = 0;
        r7 = r0.inflate(r1, r15, r2);
        r0 = r7;
        r0 = (android.widget.LinearLayout) r0;
        r1 = 0;
    L_0x002b:
        r2 = r0.getChildCount();
        if (r1 >= r2) goto L_0x00ed;
    L_0x0031:
        r2 = r0.getChildAt(r1);
        r2 = r2 instanceof com.google.android.finsky.dialogbuilder.layout.CheckedView;
        if (r2 == 0) goto L_0x00e9;
    L_0x0039:
        r0 = r0.getChildAt(r1);
        r0 = (com.google.android.finsky.dialogbuilder.layout.CheckedView) r0;
        r9 = r0;
    L_0x0040:
        if (r11 == 0) goto L_0x00f1;
    L_0x0042:
        r0 = 0;
        r9.setCheckMarkDrawable(r0);
    L_0x0046:
        r0 = r13.f15036a;
        r1 = r12.c;
        r2 = 0;
        r2 = new java.lang.Object[r2];
        r0.m14904a(r1, r9, r14, r2);
        r0 = r12.b;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x00fa;
    L_0x0056:
        r0 = 1;
    L_0x0057:
        if (r0 != 0) goto L_0x0062;
    L_0x0059:
        r0 = r12.b;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x00fd;
    L_0x005f:
        r0 = 1;
    L_0x0060:
        if (r0 == 0) goto L_0x008d;
    L_0x0062:
        r0 = 2131756938; // 0x7f10078a float:1.9144798E38 double:1.0532278683E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r12.h;
        if (r1 == 0) goto L_0x0079;
    L_0x006f:
        r1 = r13.f15036a;
        r2 = r12.h;
        r3 = 0;
        r3 = new java.lang.Object[r3];
        r1.m14904a(r2, r0, r14, r3);
    L_0x0079:
        r1 = 0;
        r0.setVisibility(r1);
        r3 = r12.f;
        r5 = r12.g;
        r6 = r13.f15040e;
        r2 = 2130837740; // 0x7f0200ec float:1.7280443E38 double:1.052773724E-314;
        r4 = 2130837742; // 0x7f0200ee float:1.7280447E38 double:1.052773725E-314;
        r1 = r0;
        com.google.android.finsky.dialogbuilder.C2798j.m14894a(r0, r1, r2, r3, r4, r5, r6);
    L_0x008d:
        r15.addView(r7);
        r0 = r9.getId();
        r1 = r10.f15041a;
        r0 = java.lang.Integer.valueOf(r0);
        r2 = java.lang.Integer.valueOf(r8);
        r1.put(r0, r2);
        r0 = 0;
        r10.m14834a(r12, r0);
        r0 = r13.f15037b;
        r0 = r0.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0100;
    L_0x00ad:
        r0 = 1;
    L_0x00ae:
        if (r0 == 0) goto L_0x00bd;
    L_0x00b0:
        r0 = r13.f15037b;
        r0 = r0.d;
        if (r8 != r0) goto L_0x00bd;
    L_0x00b6:
        r0 = r9.getId();
        r15.m14908a(r0);
    L_0x00bd:
        r0 = r12.d;
        if (r0 == 0) goto L_0x00e4;
    L_0x00c1:
        r0 = r13.f;
        r1 = 2130969587; // 0x7f0403f3 float:1.754786E38 double:1.0528388653E-314;
        r2 = 0;
        r0 = r0.inflate(r1, r15, r2);
        r0 = (android.widget.TextView) r0;
        r1 = r13.f15036a;
        r2 = r12.d;
        r3 = 0;
        r3 = new java.lang.Object[r3];
        r1.m14904a(r2, r0, r14, r3);
        r1 = r13.f15040e;
        r2 = r12.d;
        r2 = r2.e;
        r3 = 0;
        r1.m14878a(r0, r2, r3);
        r15.addView(r0);
    L_0x00e4:
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0010;
    L_0x00e9:
        r1 = r1 + 1;
        goto L_0x002b;
    L_0x00ed:
        r0 = 0;
        r9 = r0;
        goto L_0x0040;
    L_0x00f1:
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r9.setCompoundDrawables(r0, r1, r2, r3);
        goto L_0x0046;
    L_0x00fa:
        r0 = 0;
        goto L_0x0057;
    L_0x00fd:
        r0 = 0;
        goto L_0x0060;
    L_0x0100:
        r0 = 0;
        goto L_0x00ae;
    L_0x0102:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.dialogbuilder.a.g.a(com.google.android.finsky.dialogbuilder.e, android.view.View):void");
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_checkedgroup;
    }
}

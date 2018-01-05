package com.google.android.wallet.ui.expander;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.support.e.bc;
import android.support.e.bz;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.ui.common.C6756y;

@TargetApi(19)
public final class C6815i extends bz {
    public final Animator m31033b(ViewGroup viewGroup, bc bcVar, int i, bc bcVar2, int i2) {
        Animator b;
        if (VERSION.SDK_INT >= 21) {
            b = super.b(viewGroup, bcVar, i, bcVar2, i2);
        } else if (bcVar == null || bcVar2 == null) {
            b = null;
        } else {
            Animator b2 = b(bcVar2.b, bcVar);
            if (b2 != null) {
                C6815i.m31028a(bcVar2.b, b2);
            }
            b = b2;
        }
        if (b != null && (bcVar2.b instanceof C6756y)) {
            View innerFieldView = ((C6756y) bcVar2.b).getInnerFieldView();
            if (innerFieldView != null) {
                C6815i.m31028a(innerFieldView, b);
            }
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator m31032b(android.view.View r9, android.support.e.bc r10) {
        /*
        r8 = this;
        r2 = 0;
        r5 = 1;
        r3 = 0;
        r6 = 2;
        r0 = com.google.android.wallet.p383e.C6622f.summary_expander_transition_name;
        r0 = r9.getTag(r0);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x0078;
    L_0x000e:
        r1 = "alpha";
        r4 = new float[r6];
        r4 = {1065353216, 0};
        r1 = android.animation.ObjectAnimator.ofFloat(r9, r1, r4);
        r4 = -1;
        r7 = r0.hashCode();
        switch(r7) {
            case 1069289409: goto L_0x003b;
            case 1271870320: goto L_0x0027;
            case 1662640372: goto L_0x0031;
            default: goto L_0x0021;
        };
    L_0x0021:
        r0 = r4;
    L_0x0022:
        switch(r0) {
            case 0: goto L_0x0045;
            case 1: goto L_0x0045;
            case 2: goto L_0x004a;
            default: goto L_0x0025;
        };
    L_0x0025:
        r0 = r2;
    L_0x0026:
        return r0;
    L_0x0027:
        r7 = "optionViewComponents";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x0021;
    L_0x002f:
        r0 = r3;
        goto L_0x0022;
    L_0x0031:
        r7 = "summaryField";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x0021;
    L_0x0039:
        r0 = r5;
        goto L_0x0022;
    L_0x003b:
        r7 = "expandedField";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x0021;
    L_0x0043:
        r0 = r6;
        goto L_0x0022;
    L_0x0045:
        com.google.android.wallet.ui.expander.C6815i.m31029b(r9, r1);
        r0 = r1;
        goto L_0x0026;
    L_0x004a:
        r0 = new android.animation.AnimatorSet;
        r0.<init>();
        r2 = "y";
        r4 = new float[r6];
        r7 = r9.getTop();
        r7 = (float) r7;
        r4[r3] = r7;
        r7 = 0;
        r4[r5] = r7;
        r2 = android.animation.ObjectAnimator.ofFloat(r9, r2, r4);
        r4 = new android.animation.Animator[r6];
        r4[r3] = r1;
        r4[r5] = r2;
        r0.playTogether(r4);
        r1 = r8.q;
        r0.setInterpolator(r1);
        r2 = r8.p;
        r0.setDuration(r2);
        com.google.android.wallet.ui.expander.C6815i.m31029b(r9, r0);
        goto L_0x0026;
    L_0x0078:
        r0 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.expander.i.b(android.view.View, android.support.e.bc):android.animation.Animator");
    }

    public final Animator m31031a(ViewGroup viewGroup, bc bcVar, int i, bc bcVar2, int i2) {
        if (VERSION.SDK_INT >= 21) {
            return super.a(viewGroup, bcVar, i, bcVar2, i2);
        }
        if (bcVar == null || bcVar2 == null) {
            return null;
        }
        return a(bcVar2.b, bcVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator m31030a(android.view.View r9, android.support.e.bc r10) {
        /*
        r8 = this;
        r2 = 0;
        r5 = 1;
        r3 = 0;
        r6 = 2;
        r0 = com.google.android.wallet.p383e.C6622f.summary_expander_transition_name;
        r0 = r9.getTag(r0);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x0072;
    L_0x000e:
        r1 = "alpha";
        r4 = new float[r6];
        r4 = {0, 1065353216};
        r1 = android.animation.ObjectAnimator.ofFloat(r9, r1, r4);
        r4 = -1;
        r7 = r0.hashCode();
        switch(r7) {
            case 1069289409: goto L_0x003b;
            case 1271870320: goto L_0x0027;
            case 1662640372: goto L_0x0031;
            default: goto L_0x0021;
        };
    L_0x0021:
        r0 = r4;
    L_0x0022:
        switch(r0) {
            case 0: goto L_0x0045;
            case 1: goto L_0x0045;
            case 2: goto L_0x0047;
            default: goto L_0x0025;
        };
    L_0x0025:
        r0 = r2;
    L_0x0026:
        return r0;
    L_0x0027:
        r7 = "optionViewComponents";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x0021;
    L_0x002f:
        r0 = r3;
        goto L_0x0022;
    L_0x0031:
        r7 = "summaryField";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x0021;
    L_0x0039:
        r0 = r5;
        goto L_0x0022;
    L_0x003b:
        r7 = "expandedField";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x0021;
    L_0x0043:
        r0 = r6;
        goto L_0x0022;
    L_0x0045:
        r0 = r1;
        goto L_0x0026;
    L_0x0047:
        r0 = new android.animation.AnimatorSet;
        r0.<init>();
        r2 = "y";
        r4 = new float[r6];
        r7 = 0;
        r4[r3] = r7;
        r7 = r9.getTop();
        r7 = (float) r7;
        r4[r5] = r7;
        r2 = android.animation.ObjectAnimator.ofFloat(r9, r2, r4);
        r4 = new android.animation.Animator[r6];
        r4[r3] = r1;
        r4[r5] = r2;
        r0.playTogether(r4);
        r1 = r8.q;
        r0.setInterpolator(r1);
        r2 = r8.p;
        r0.setDuration(r2);
        goto L_0x0026;
    L_0x0072:
        r0 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.expander.i.a(android.view.View, android.support.e.bc):android.animation.Animator");
    }

    private static void m31028a(View view, Animator animator) {
        int visibility = view.getVisibility();
        if (visibility != 0) {
            view.setVisibility(0);
            animator.addListener(new C6816j(view, visibility));
        }
    }

    private static void m31029b(View view, Animator animator) {
        animator.addListener(new C6817k(view));
    }
}

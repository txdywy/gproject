package com.google.android.finsky.dialogbuilder.layout;

import android.os.Bundle;
import android.support.v4.view.ai;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1601a;
import com.google.wireless.android.finsky.dfe.c.a.bu;
import com.google.wireless.android.finsky.dfe.c.a.da;
import com.squareup.leakcanary.C7582R;

public final class C2812o extends C2806n {
    public View f15173a;
    public ViewGroup f15174b;
    public ViewGroup f15175c;

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.f15173a = a.findViewById(16908301);
        this.f15174b = (ViewGroup) a.findViewById(C7582R.id.content_frame);
        this.f15175c = (ViewGroup) a.findViewById(C7582R.id.footer_frame);
        return a;
    }

    protected final int mo968W() {
        return C7582R.layout.acquire_dialog;
    }

    public final void mo3140X() {
        if (m610k()) {
            int integer = m605i().getInteger(17694720);
            int i = (int) (((double) integer) * 0.5d);
            this.f15173a.setAlpha(0.0f);
            this.f15173a.setVisibility(0);
            this.f15173a.animate().alpha(1.0f).setDuration((long) integer).start();
            ab().animate().alpha(0.0f).translationX((float) (-this.f746R.getWidth())).setDuration((long) i).setListener(new C2813p(ab(), 4)).start();
            ad().animate().alpha(0.0f).translationX((float) (-this.f746R.getWidth())).setDuration((long) i).setListener(new C2813p(ad(), 4)).start();
        }
    }

    public final void mo3141Y() {
        this.f15173a.setVisibility(8);
        this.f15174b.setVisibility(0);
        this.f15175c.setVisibility(0);
    }

    private final int m14932a(float f) {
        return (int) TypedValue.applyDimension(1, f, m605i().getDisplayMetrics());
    }

    protected final void mo3142a(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, bu buVar, da daVar) {
        viewGroup2.setVisibility(0);
        viewGroup4.setVisibility(0);
        if (buVar == null) {
            buVar = new bu().a(0);
        }
        if (daVar != null) {
            int a = m14932a(daVar.b);
            int a2 = m14932a(daVar.c);
            int a3 = m14932a(daVar.d);
            int a4 = m14932a(daVar.e);
            ai.m1823a(viewGroup2, a, a2, a3, 0);
            ai.m1823a(viewGroup4, a, 0, a3, a4);
            if (((daVar.a & 16) != 0 ? 1 : null) != null) {
                C1601a.m9199a(m601g(), daVar.f, this.f746R, false);
            }
        }
        if (2 == buVar.b) {
            viewGroup.setVisibility(8);
            viewGroup3.setVisibility(8);
            return;
        }
        if (3 == buVar.b) {
            a = 0;
        } else if (1 == buVar.b) {
            a = -this.f746R.getWidth();
        } else {
            a = this.f746R.getWidth();
        }
        a2 = m605i().getInteger(17694720);
        a3 = (int) (((double) a2) * 0.5d);
        if (((buVar.a & 2) != 0 ? 1 : null) != null) {
            a2 = buVar.c;
        }
        if (((buVar.a & 4) != 0 ? 1 : null) != null) {
            a3 = buVar.d;
        }
        viewGroup.animate().alpha(0.0f).translationX((float) (-a)).setDuration((long) a3).setListener(new C2813p(viewGroup, 8)).start();
        viewGroup2.setTranslationX((float) a);
        viewGroup2.setAlpha(0.0f);
        viewGroup2.animate().translationX(0.0f).alpha(1.0f).setDuration((long) a2).start();
        viewGroup3.animate().alpha(0.0f).setDuration((long) a3).setListener(new C2813p(viewGroup3, 8)).start();
        viewGroup4.setAlpha(0.0f);
        viewGroup4.animate().alpha(1.0f).setDuration((long) a2).start();
    }
}

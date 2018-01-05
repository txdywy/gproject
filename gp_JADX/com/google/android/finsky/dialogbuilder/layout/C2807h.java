package com.google.android.finsky.dialogbuilder.layout;

import android.os.Bundle;
import android.support.v4.view.p039b.C0344b;
import android.support.v4.view.p039b.C0345c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.wireless.android.finsky.dfe.c.a.bu;
import com.google.wireless.android.finsky.dfe.c.a.da;
import com.google.wireless.android.finsky.dfe.c.a.dn;
import com.google.wireless.android.finsky.dfe.c.a.do;
import com.squareup.leakcanary.C7582R;

public final class C2807h extends C2806n {
    public static final Interpolator f15154a = new LinearInterpolator();
    public static final Interpolator f15155b = new C0344b();
    public static final Interpolator f15156c = new C0345c();
    public FixedBottomSheetBehavior af;
    public boolean ag;
    public FrameLayout f15157d;
    public View f15158e;
    public View f15159f;
    public ViewGroup f15160g;
    public boolean f15161h;
    public C1699k f15162i;

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.f15158e = a.findViewById(16908301);
        this.f15159f = a.findViewById(C7582R.id.touch_outside);
        this.f15160g = (ViewGroup) a.findViewById(C7582R.id.background);
        this.f15157d = (FrameLayout) a.findViewById(C7582R.id.design_bottom_sheet);
        this.af = FixedBottomSheetBehavior.m14911a(this.f15157d);
        this.f15159f.setOnClickListener(new C2808i(this));
        return a;
    }

    protected final int mo968W() {
        return C7582R.layout.bottom_sheet;
    }

    protected final void mo3142a(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, bu buVar, da daVar) {
        if (daVar != null) {
            do doVar = (do) daVar.m4921b(do.a);
            if (doVar != null) {
                FixedBottomSheetBehavior fixedBottomSheetBehavior = this.af;
                dn dnVar = doVar.b;
                if (dnVar == null) {
                    dnVar = FixedBottomSheetBehavior.f15136a;
                }
                fixedBottomSheetBehavior.f15144i = dnVar;
            }
        }
        viewGroup2.bringToFront();
        viewGroup4.bringToFront();
        C2807h.m14924b(viewGroup2);
        C2807h.m14925c(viewGroup);
        if (viewGroup4.getChildCount() > 0) {
            if (this.ag) {
                viewGroup4.setTranslationY(0.0f);
                C2807h.m14924b(viewGroup4);
                C2807h.m14925c(viewGroup3);
            } else {
                viewGroup4.setAlpha(1.0f);
                viewGroup4.setTranslationY((float) viewGroup4.getHeight());
                viewGroup4.animate().setDuration(300).setInterpolator(f15155b).translationY(0.0f);
                this.ag = true;
            }
        } else if (this.ag) {
            viewGroup3.animate().setInterpolator(f15156c).setDuration(100).translationY((float) viewGroup3.getHeight());
            this.ag = false;
        }
        ViewGroup viewGroup5 = (ViewGroup) viewGroup.getParent();
        this.f15160g.removeView(viewGroup2);
        viewGroup5.removeView(viewGroup);
        if (viewGroup2.getParent() == null) {
            viewGroup5.addView(viewGroup2);
        }
        if (viewGroup.getParent() == null) {
            this.f15160g.addView(viewGroup);
        }
        this.f15161h = true;
    }

    public final void mo3140X() {
        this.f15158e.setVisibility(0);
        this.f15161h = true;
    }

    public final void mo3141Y() {
        this.f15158e.setVisibility(8);
    }

    private static void m14924b(View view) {
        view.setAlpha(0.0f);
        view.animate().setStartDelay(83).setDuration(183).setInterpolator(f15154a).alpha(1.0f);
    }

    private static void m14925c(View view) {
        view.animate().setDuration(100).setInterpolator(f15154a).alpha(0.0f);
    }

    public final void m14929Z() {
        if (this.f15162i != null) {
            this.f15162i.mo2399a();
        }
    }
}

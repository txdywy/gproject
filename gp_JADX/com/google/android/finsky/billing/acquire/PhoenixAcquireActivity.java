package com.google.android.finsky.billing.acquire;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.dialogbuilder.layout.C2805g;
import com.google.android.finsky.dialogbuilder.layout.C2806n;
import com.google.android.finsky.dialogbuilder.layout.C2807h;
import com.google.android.finsky.dialogbuilder.layout.C2809j;
import com.google.android.finsky.dialogbuilder.layout.FixedBottomSheetBehavior;
import com.squareup.leakcanary.C7582R;

public class PhoenixAcquireActivity extends AcquireActivity {
    public C2807h al;
    public boolean am;

    protected final C2806n mo2376m() {
        this.al = new C2807h();
        this.al.f15162i = new C1700n(this);
        return this.al;
    }

    protected final int mo2373l() {
        return C7582R.layout.phoenix_activity;
    }

    public void finish() {
        if (this.am) {
            super.finish();
            overridePendingTransition(0, 0);
            return;
        }
        this.am = true;
        C2806n c2806n = this.al;
        if (c2806n.f15159f == null || !c2806n.f15161h) {
            c2806n.m14929Z();
            return;
        }
        c2806n.f15159f.animate().setDuration(150).setInterpolator(C2807h.f15154a).alpha(0.0f);
        FixedBottomSheetBehavior fixedBottomSheetBehavior = c2806n.af;
        View view = c2806n.f15157d;
        View ad = c2806n.ad();
        Runnable c2809j = new C2809j(c2806n);
        if (view != null) {
            int height = ((ViewGroup) view.getParent()).getHeight();
            view.animate().translationY((float) height).setInterpolator(FixedBottomSheetBehavior.f15138c).setDuration((long) fixedBottomSheetBehavior.f15139d).setListener(new C2805g(fixedBottomSheetBehavior, c2809j));
            if (ad != null) {
                ad.animate().translationY((float) ((height - view.getHeight()) - ad.getHeight())).setInterpolator(FixedBottomSheetBehavior.f15138c).setDuration((long) fixedBottomSheetBehavior.f15139d);
                return;
            }
            return;
        }
        c2809j.run();
    }
}

package com.google.android.finsky.billing.acquire;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.finsky.dialogbuilder.layout.FixedBottomSheetBehavior;
import com.google.android.finsky.dialogbuilder.layout.g;
import com.google.android.finsky.dialogbuilder.layout.h;
import com.google.android.finsky.dialogbuilder.layout.j;
import com.google.android.finsky.dialogbuilder.layout.n;

protected final class PhoenixAcquireActivity extends AcquireActivity
{

    public com.google.android.finsky.dialogbuilder.layout.h al;
    public boolean am;

    PhoenixAcquireActivity() {
        AcquireActivity();
    }

    public void finish() {
        if (this.am == 0) {
            this.am = 1;
            if (this.al.f == 0 || this.al.h == 0)
                this.al.Z();
            else {
                this.al.f.animate().setDuration(150).setInterpolator(com.google.android.finsky.dialogbuilder.layout.h.a).alpha(0);
                v3 = this.al.ad();
                v4 = new com.google.android.finsky.dialogbuilder.layout.j(this.al);
                if (this.al.d != 0) {
                    v0 = ((ViewGroup)this.al.d.getParent()).getHeight();
                    this.al.d.animate().translationY((float)v0).setInterpolator(FixedBottomSheetBehavior.c).setDuration((long)this.al.af.d).setListener(new com.google.android.finsky.dialogbuilder.layout.g(this.al.af, v4));
                    if (v3 != 0)
                        v3.animate().translationY((float)(v0 - this.al.d.getHeight() - v3.getHeight())).setInterpolator(FixedBottomSheetBehavior.c).setDuration((long)this.al.af.d);
                }
                else
                    v4.run();
            }
        }
        else {
            super.finish();
            this.overridePendingTransition(0, 0);
        }
    }

    protected final int l() {
        return 2130969194;
    }

    protected final com.google.android.finsky.dialogbuilder.layout.n m() {
        this.al = new com.google.android.finsky.dialogbuilder.layout.h();
        this.al.i = new com.google.android.finsky.billing.acquire.n(this);
        return this.al;
    }

}

package com.google.android.finsky.inlinedetails;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.squareup.leakcanary.C7582R;

public final class C3247b extends C3166e implements OnPreDrawListener {
    public boolean f16749a;
    public boolean f16750b;

    public C3247b(View view, C1043h c1043h) {
        super(view, C7582R.id.page_content, C7582R.id.page_error_indicator, C7582R.id.loading_indicator, c1043h, 2);
    }

    public final void mo3397a() {
        ViewGroup viewGroup = (ViewGroup) this.f.getParent();
        while (!(viewGroup instanceof InlineAppDetailsDialogRootFrameLayout)) {
            viewGroup = (ViewGroup) viewGroup.getParent();
        }
        InlineAppDetailsDialogRootFrameLayout inlineAppDetailsDialogRootFrameLayout = (InlineAppDetailsDialogRootFrameLayout) viewGroup;
        Runnable c3248c = new C3248c(this);
        if (!inlineAppDetailsDialogRootFrameLayout.f16744e || inlineAppDetailsDialogRootFrameLayout.f16745f) {
            inlineAppDetailsDialogRootFrameLayout.f16747h = c3248c;
        } else {
            c3248c.run();
        }
    }

    public final boolean onPreDraw() {
        if (!this.f16750b) {
            return true;
        }
        this.f16750b = false;
        ObjectAnimator.ofFloat(this.f, "alpha", new float[]{0.0f, 1.0f}).setDuration(1000).start();
        return false;
    }
}

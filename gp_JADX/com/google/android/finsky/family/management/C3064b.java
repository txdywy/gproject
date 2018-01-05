package com.google.android.finsky.family.management;

import android.view.View;
import android.view.View.OnClickListener;

final class C3064b implements OnClickListener {
    public final /* synthetic */ int f15960a;
    public final /* synthetic */ C3063a f15961b;

    C3064b(C3063a c3063a, int i) {
        this.f15961b = c3063a;
        this.f15960a = i;
    }

    public final void onClick(View view) {
        switch (this.f15960a) {
            case 1:
                this.f15961b.f15959d.mo3297c();
                return;
            case 2:
            case 3:
                this.f15961b.f15959d.ae_();
                return;
            case 4:
                this.f15961b.f15959d.af_();
                return;
            case 5:
                this.f15961b.f15959d.ag_();
                return;
            default:
                throw new IllegalStateException("Unknown view type on click " + this.f15960a);
        }
    }
}

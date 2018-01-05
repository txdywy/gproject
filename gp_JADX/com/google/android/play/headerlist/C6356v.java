package com.google.android.play.headerlist;

import android.view.View;
import android.view.View.OnClickListener;

final class C6356v implements OnClickListener {
    public final /* synthetic */ int f31918a;
    public final /* synthetic */ PlayHeaderListTabStrip f31919b;

    C6356v(PlayHeaderListTabStrip playHeaderListTabStrip, int i) {
        this.f31919b = playHeaderListTabStrip;
        this.f31918a = i;
    }

    public final void onClick(View view) {
        if (this.f31919b.f31878v != null) {
            this.f31919b.f31878v.m29150f(this.f31918a);
        }
        this.f31919b.f31874r = this.f31919b.f31882z;
        this.f31919b.m29105a(this.f31918a, true);
        this.f31919b.f31870n.setCurrentItem(this.f31918a);
        if (this.f31919b.f31878v != null) {
            this.f31919b.f31878v.m29151g(this.f31918a);
        }
    }
}

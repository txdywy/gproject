package com.google.android.finsky.activities.myapps;

import android.view.View;
import android.view.View.OnClickListener;

final class C1111k implements OnClickListener {
    public final /* synthetic */ C1110j f7020a;

    C1111k(C1110j c1110j) {
        this.f7020a = c1110j;
    }

    public final void onClick(View view) {
        int d = ((C1112l) view.getTag()).m3267d();
        ((C1109i) this.f7020a.f7019e.f7010f.get(d)).m6810a();
        ((C1109i) this.f7020a.f7019e.f7010f.get(this.f7020a.f7019e.f7005a)).m6810a();
        this.f7020a.f7019e.f7010f.get(d);
        this.f7020a.f7019e.f7005a = d;
    }
}

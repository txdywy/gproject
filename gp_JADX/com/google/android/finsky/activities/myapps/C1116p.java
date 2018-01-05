package com.google.android.finsky.activities.myapps;

import android.view.ViewGroup;
import com.google.android.finsky.bg.C1060p;

final class C1116p extends C1060p {
    public final /* synthetic */ C1115o f7051a;

    C1116p(C1115o c1115o, ViewGroup viewGroup) {
        this.f7051a = c1115o;
        super(viewGroup);
    }

    public final void onGlobalLayout() {
        if (this.f7051a.f7046v != null) {
            this.f7051a.f7046v.mo1293j(1704);
            this.f7051a.f7046v = null;
        }
        m6486a();
    }
}

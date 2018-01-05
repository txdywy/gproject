package com.google.android.finsky.family.library;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;

final class C3062m implements OnClickListener {
    public final /* synthetic */ C3060k f15957a;

    C3062m(C3060k c3060k) {
        this.f15957a = c3060k;
    }

    public final void onClick(View view) {
        C3057h c3057h = (C3057h) this.f15957a.a;
        int i = this.f15957a.f15948s;
        switch (i) {
            case 1:
            case 4:
                if (C1473m.f7980a.bn().mo2703a(c3057h.bn.getPackageManager(), i)) {
                    c3057h.bn.startActivity(C1473m.f7980a.bn().mo2684a(c3057h.bn, i, C1473m.f7980a.cZ()));
                    return;
                }
                c3057h.bp.mo3684b(i);
                return;
            default:
                c3057h.bp.mo3650a(C1473m.f7980a.dn(), null, false, c3057h.bw);
                return;
        }
    }
}

package com.google.android.finsky.billing.myaccount;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import java.util.ArrayList;

final class C2026o implements OnClickListener {
    public final /* synthetic */ C2027p f10467a;
    public final /* synthetic */ C2011l f10468b;

    C2026o(C2011l c2011l, C2027p c2027p) {
        this.f10468b = c2011l;
        this.f10467a = c2027p;
    }

    public final void onClick(View view) {
        this.f10468b.f10321q.m13379b(new C2475d(this.f10468b.f10310f).m13256a(2631));
        int intValue = ((Integer) this.f10467a.f10470b).intValue();
        this.f10468b.f10319o.remove(intValue);
        ((C2027p) this.f10468b.f10319o.get(intValue - 1)).f10471c = false;
        for (int i = 0; i < this.f10468b.f10320p.size(); i++) {
            boolean z;
            ArrayList arrayList = this.f10468b.f10319o;
            int i2 = intValue + i;
            Object obj = this.f10468b.f10320p.get(i);
            if (i == this.f10468b.f10320p.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(i2, new C2027p(1, obj, z));
        }
        this.f10468b.f3433a.m3638b();
    }
}

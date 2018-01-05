package com.google.android.finsky.detailspage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2475d;

final class C2654h implements OnClickListener {
    public int f14669a = 2;
    public int f14670b;
    public Intent f14671c;
    public final /* synthetic */ C2652f f14672d;

    C2654h(C2652f c2652f, int i, Intent intent) {
        this.f14672d = c2652f;
        this.f14670b = i;
        this.f14671c = intent;
    }

    public final void onClick(View view) {
        this.f14672d.J.m13379b(new C2475d(this.f14672d.I).m13256a(this.f14670b));
        if (C1473m.f7980a.bn().mo2702a(this.f14672d.t.getPackageManager())) {
            this.f14672d.t.startActivity(this.f14671c);
        } else {
            this.f14672d.z.mo3684b(this.f14669a);
        }
    }
}

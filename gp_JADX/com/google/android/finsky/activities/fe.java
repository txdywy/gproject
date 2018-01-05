package com.google.android.finsky.activities;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.C4678i;

final class fe implements OnClickListener {
    public final /* synthetic */ int f6783a;
    public final /* synthetic */ fa f6784b;

    fe(fa faVar, int i) {
        this.f6784b = faVar;
        this.f6783a = i;
    }

    public final void onClick(View view) {
        this.f6784b.m626a(false);
        C0954a.bk.m5763a(Long.valueOf(C4678i.m21812a() + fa.ak));
        ad adVar = this.f6784b;
        adVar.ap.m13379b(new C2475d(adVar).m13256a(2935));
        fa faVar = this.f6784b;
        int i = this.f6783a;
        C2162a bn = C1473m.f7980a.bn();
        if (bn.mo2702a(faVar.ao.getPackageManager())) {
            String str;
            switch (i) {
                case 0:
                    str = (String) C0955b.ej.m28964b();
                    break;
                case 1:
                    str = (String) C0955b.eh.m28964b();
                    break;
                case 2:
                    str = (String) C0955b.ei.m28964b();
                    break;
                default:
                    str = (String) C0955b.eg.m28964b();
                    break;
            }
            Context context = faVar.ao;
            faVar.ao.startActivity(bn.mo2683a(2, str, faVar.am));
            return;
        }
        faVar.aq.mo3684b(2);
    }
}

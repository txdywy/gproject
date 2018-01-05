package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.cx.C2460b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.p198f.C3027b;
import com.squareup.leakcanary.C7582R;

public final class am extends C0996o implements OnClickListener {
    public final Document f6063f;
    public final String f6064g = this.f6063f.m14625N().f13171k;
    public final C3026a f6065h;
    public final Fragment f6066i;
    public final C2460b f6067j;
    public final int f6068k;

    am(Context context, int i, Document document, ad adVar, Fragment fragment, C2495w c2495w, C3027b c3027b, C2460b c2460b) {
        super(context, i, c2495w, adVar);
        this.f6063f = document;
        this.f6066i = fragment;
        this.f6065h = c3027b.m15626a(this.f6064g);
        this.f6067j = c2460b;
        int i2 = (this.f6065h == null || !this.f6065h.m15623b()) ? 214 : 215;
        this.f6068k = i2;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.mo2588a(this.f6063f.f14885a.f12099f, this.a.getResources().getString(C7582R.string.refund), (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final void onClick(View view) {
        m5894c();
        String str = this.f6064g;
        String str2 = this.f6065h.f15830r;
        boolean z = this.f6068k == 215;
        ab abVar = this.f6066i.f730B;
        if (abVar.mo283a("refund_confirm") == null) {
            C1508k c1508k = new C1508k();
            c1508k.m8848a((int) C7582R.string.uninstall_refund_confirmation_body).m8860d((int) C7582R.string.yes).m8862e((int) C7582R.string.no);
            Bundle bundle = new Bundle();
            bundle.putString("package_name", str);
            bundle.putString("account_name", str2);
            bundle.putBoolean("try_uninstall", z);
            c1508k.m8851a(this.f6066i, 4, bundle);
            c1508k.mo2272a().m625a(abVar, "refund_confirm");
        }
    }

    public final int mo1200a() {
        return this.f6068k;
    }
}

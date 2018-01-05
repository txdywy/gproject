package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.cw.C2458e;
import com.google.android.finsky.cz.C2467a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public final class C1024t extends C0996o implements OnClickListener {
    public final Document f6273f;
    public final Fragment f6274g;
    public final Account f6275h;
    public final C1287h f6276i;
    public final C2457d f6277j;
    public final C2467a f6278k;
    public boolean f6279l;
    public C2454a f6280m;

    C1024t(Context context, int i, Document document, Account account, ad adVar, Fragment fragment, C2495w c2495w, C2454a c2454a, C1287h c1287h, C2457d c2457d, C2467a c2467a) {
        super(context, i, c2495w, adVar);
        this.f6273f = document;
        this.f6274g = fragment;
        this.f6275h = account;
        this.f6280m = c2454a;
        this.f6276i = c1287h;
        this.f6277j = c2457d;
        this.f6278k = c2467a;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        String string;
        int i = this.f6273f.f14885a.f12099f;
        if (this.f6280m == null) {
            string = this.a.getResources().getString(C7582R.string.cancel_preorder);
        } else {
            C2458e c2458e = new C2458e();
            if (this.a.getResources().getBoolean(C7582R.bool.use_wide_layout)) {
                this.f6277j.m13159b(this.f6280m, this.f6273f.f14885a.f12099f, c2458e);
            } else {
                this.f6277j.m13156a(this.f6280m, this.f6273f.f14885a.f12099f, c2458e);
            }
            string = c2458e.m13160a(this.a);
        }
        playActionButtonV2.mo2588a(i, string, (OnClickListener) this);
        playActionButtonV2.setEnabled(!this.f6279l);
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final void onClick(View view) {
        ab abVar = this.f6274g.f730B;
        if (abVar.mo283a("confirm_cancel_dialog") == null) {
            m5894c();
            String string = this.a.getResources().getString(C7582R.string.confirm_preorder_cancel, new Object[]{this.f6273f.f14885a.f12100g});
            C1508k c1508k = new C1508k();
            c1508k.m8852a(string).m8860d((int) C7582R.string.yes).m8862e((int) C7582R.string.no).m8849a(305, this.f6273f.f14885a.f12087D, 245, 246, this.c);
            Bundle bundle = new Bundle();
            bundle.putParcelable("doc", this.f6273f);
            bundle.putString("ownerAccountName", this.f6275h.name);
            c1508k.m8851a(this.f6274g, 7, bundle);
            c1508k.mo2272a().m625a(abVar, "confirm_cancel_dialog");
        }
    }

    public final int mo1200a() {
        if (this.f6280m != null) {
            return C1013j.m5980a(this.f6280m, this.f6273f.f14885a.f12099f);
        }
        return 235;
    }
}

package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.cw.C2458e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

final class ab extends C0996o implements OnClickListener {
    public final C3748a f6016f;
    public final Document f6017g;
    public final Account f6018h;
    public final Account f6019i;
    public final C2454a f6020j;
    public final C2162a f6021k;
    public final C3300k f6022l;
    public final C2266a f6023m;
    public final C2457d f6024n;

    ab(Context context, int i, C3748a c3748a, Document document, ad adVar, Account account, C2454a c2454a, C2495w c2495w, C2162a c2162a, C3300k c3300k, C2233o c2233o, C2266a c2266a, C2457d c2457d) {
        super(context, i, c2495w, adVar);
        this.f6017g = document;
        this.f6016f = c3748a;
        this.f6018h = account;
        this.f6020j = c2454a;
        this.f6019i = c2233o.m11642a(this.f6017g, this.f6018h);
        this.f6021k = c2162a;
        this.f6022l = c3300k;
        this.f6023m = c2266a;
        this.f6024n = c2457d;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        String str = "";
        Resources resources = this.a.getResources();
        if (this.f6017g.f14885a.f12099f == 3) {
            str = resources.getString(C7582R.string.download_now);
        } else if (this.f6020j != null) {
            C2458e c2458e = new C2458e();
            if (this.a.getResources().getBoolean(C7582R.bool.use_wide_layout)) {
                this.f6024n.m13159b(this.f6020j, this.f6017g.f14885a.f12099f, c2458e);
            } else {
                this.f6024n.m13156a(this.f6020j, this.f6017g.f14885a.f12099f, c2458e);
            }
            str = c2458e.m13160a(this.a);
        }
        playActionButtonV2.mo2588a(this.f6017g.f14885a.f12099f, str, (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final void onClick(View view) {
        if (this.f6017g.f14885a.f12099f == 3) {
            String str = this.f6017g.m14625N().f13171k;
            m5894c();
            if (this.f6023m.m11723e()) {
                this.f6022l.mo3462p(str);
                return;
            }
            C1508k c1508k = new C1508k();
            c1508k.m8848a((int) C7582R.string.network_error).m8860d((int) C7582R.string.ok);
            c1508k.mo2272a().m625a(this.f6016f.mo3708j(), "download_no_network_dialog");
        } else if (this.f6020j != null && this.f6017g.f14885a.f12099f == 4) {
            m5894c();
            if (this.f6021k.mo2703a(this.a.getPackageManager(), this.f6017g.f14885a.f12099f)) {
                this.a.startActivity(this.f6021k.mo2707b(this.a, this.f6017g, this.f6019i.name));
                return;
            }
            this.f6016f.mo3684b(this.f6017g.f14885a.f12099f);
        }
    }

    public final int mo1200a() {
        if (this.f6017g.f14885a.f12099f == 3) {
            return 2911;
        }
        if (this.f6020j != null) {
            return C1013j.m5980a(this.f6020j, this.f6017g.f14885a.f12099f);
        }
        return 0;
    }
}

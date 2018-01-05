package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.view.View.OnClickListener;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.cw.C2458e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ds.C2885b;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

final class ah extends C0996o {
    public final C3748a f6039f;
    public final Document f6040g;
    public final Account f6041h;
    public final Account f6042i;
    public final C2454a f6043j;
    public final String f6044k;
    public final boolean f6045l;
    public final C2457d f6046m;
    public final C2885b f6047n;

    ah(Context context, int i, C3748a c3748a, Document document, ad adVar, Account account, C2454a c2454a, String str, C2495w c2495w, boolean z, C2233o c2233o, C2457d c2457d, C2885b c2885b) {
        super(context, i, c2495w, adVar);
        this.f6040g = document;
        this.f6039f = c3748a;
        this.f6041h = account;
        this.f6043j = c2454a;
        this.f6044k = str;
        this.f6045l = z;
        this.f6042i = c2233o.m11642a(this.f6040g, this.f6041h);
        this.f6046m = c2457d;
        this.f6047n = c2885b;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        String string;
        OnClickListener a;
        int i = this.f6040g.f14885a.f12099f;
        Resources resources = this.a.getResources();
        if (this.f6040g.f14885a.f12099f == 3) {
            if (this.f6045l) {
                string = resources.getString(C7582R.string.play_game);
            } else {
                string = resources.getString(C7582R.string.open);
            }
        } else if (this.f6043j != null) {
            C2458e c2458e = new C2458e();
            if (this.a.getResources().getBoolean(C7582R.bool.use_wide_layout)) {
                this.f6046m.m13159b(this.f6043j, this.f6040g.f14885a.f12099f, c2458e);
            } else {
                this.f6046m.m13156a(this.f6043j, this.f6040g.f14885a.f12099f, c2458e);
            }
            string = c2458e.m13160a(this.a);
        } else {
            string = resources.getString(C1608h.m9258e(this.f6040g.f14885a.f12099f));
        }
        int i2 = this.f6040g.f14885a.f12099f;
        if (this.f6043j == null) {
            a = this.f6039f.mo3626a(this.f6040g, i2 == 3 ? this.f6041h : this.f6042i, this.d, this.c);
        } else {
            a = C1013j.m5982a(this.f6043j, i2, this.f6039f, this.f6044k, this.d, this.a, this.c);
        }
        playActionButtonV2.mo2588a(i, string, a);
        playActionButtonV2.setActionStyle(this.b);
        if (this.f6040g.f14885a.f12099f == 3 && this.f6047n.m15130c(this.f6040g.m14625N().f13171k)) {
            playActionButtonV2.setEnabled(false);
        }
        m5893b();
    }

    public final int mo1200a() {
        if (this.f6043j != null) {
            return C1013j.m5980a(this.f6043j, this.f6040g.f14885a.f12099f);
        }
        return 218;
    }
}

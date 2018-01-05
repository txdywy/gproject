package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.cw.C2458e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ds.C2885b;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.squareup.leakcanary.C7582R;

public final class C1021q extends C0996o {
    public final Document f6256f;
    public final C3748a f6257g;
    public final Account f6258h;
    public final String f6259i;
    public final C2454a f6260j;
    public final C1542f f6261k;
    public final C1611k f6262l;
    public final C2206c f6263m;
    public final C2233o f6264n;
    public final C2457d f6265o;
    public final C2885b f6266p;
    public int f6267q = 0;
    public boolean f6268r;

    C1021q(Context context, int i, Document document, String str, ad adVar, Account account, C3748a c3748a, C2454a c2454a, C2495w c2495w, C1542f c1542f, C1611k c1611k, C2206c c2206c, C2233o c2233o, C2457d c2457d, C2885b c2885b, boolean z) {
        super(context, i, c2495w, adVar);
        this.f6256f = document;
        this.f6257g = c3748a;
        this.f6258h = account;
        this.f6259i = str;
        this.f6260j = c2454a;
        this.f6261k = c1542f;
        this.f6262l = c1611k;
        this.f6263m = c2206c;
        this.f6264n = c2233o;
        this.f6265o = c2457d;
        this.f6266p = c2885b;
        this.f6268r = z;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        int i;
        String a;
        boolean z;
        if (this.f6256f.f14885a.f12099f == 3) {
            if (this.f6264n.m11642a(this.f6256f, this.f6258h) != null) {
                int i2 = 1;
            } else {
                z = false;
            }
            this.f6261k.m8974a((View) playActionButtonV2);
            if (this.f6266p.m15130c(this.f6256f.m14625N().f13171k)) {
                playActionButtonV2.setEnabled(false);
            }
        } else {
            z = false;
        }
        if (this.f6260j == null) {
            if (i2 != 0) {
                i = 221;
            } else {
                if (!this.f6256f.ah()) {
                    if (this.f6256f.f14885a.f12099f == 3) {
                        i = 221;
                    } else if (this.f6256f.f14885a.f12099f == 1) {
                        i = 225;
                    }
                }
                i = 200;
            }
            this.f6267q = i;
            m5893b();
        }
        if (this.f6260j != null) {
            C2458e c2458e = new C2458e();
            if (this.f6262l.m9286k(this.a.getResources())) {
                this.f6265o.m13159b(this.f6260j, this.f6256f.f14885a.f12099f, c2458e);
            } else {
                this.f6265o.m13156a(this.f6260j, this.f6256f.f14885a.f12099f, c2458e);
            }
            a = c2458e.m13160a(this.a);
        } else if (i2 != 0) {
            a = this.a.getString(C7582R.string.install);
        } else {
            if (!this.f6256f.ah()) {
                if (this.f6256f.f14885a.f12099f == 3) {
                    a = this.a.getString(C7582R.string.install);
                } else if (this.f6256f.f14885a.f12099f == 1) {
                    a = this.a.getString(C7582R.string.open);
                }
            }
            bl e = this.f6256f.m14649e(1);
            if (e == null || !e.aL_()) {
                a = "";
            } else {
                a = e.f11917g;
            }
        }
        int i3 = this.f6256f.f14885a.f12099f;
        OnClickListener onClickListener = null;
        i = this.f6256f.f14885a.f12099f;
        if (this.f6260j == null) {
            onClickListener = new C1022r(this, this.f6257g.mo3624a(this.f6258h, this.f6256f, 1, null, this.f6259i, this.f6267q, this.d, this.c));
        } else if (this.f6260j.f13230a != 15) {
            onClickListener = C1013j.m5982a(this.f6260j, i, this.f6257g, this.f6259i, this.d, this.a, this.c);
        } else if (i == 4) {
            onClickListener = new C1023s(this, this.f6256f);
        }
        playActionButtonV2.mo2588a(i3, a, onClickListener);
        playActionButtonV2.setActionStyle(this.b);
    }

    public final int mo1200a() {
        return this.f6267q;
    }
}

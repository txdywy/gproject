package com.google.android.finsky.activities.inlineappinstaller;

import android.accounts.Account;
import android.os.Bundle;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.utils.ParcelableProto;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C1090c extends C1089s implements C0657w, C1031w, C1003o {
    public final C2471a f6949a = C1473m.f7980a.aR();
    public C2719i f6950b;
    public Document f6951c;
    public String f6952d;
    public int f6953e = -1;
    public final List f6954f = new ArrayList();
    public C1254c f6955g;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f6955g = C1473m.f7980a.mo2112b(bundle2.getString("authAccount"));
        this.f6950b = new C2719i(this.f6955g, C1289l.m7694a(C1473m.f7980a.bn().mo2693a(((cv) ParcelableProto.m21673a(bundle2, "InlineConsumptionAppInstallerSidecar.mediaDoc")).f12099f)));
        this.f6950b.m11918a((C1031w) this);
        this.f6950b.m11917a((C0657w) this);
    }

    final void m6762a(Account account, Document document) {
        C3300k o = C1473m.f7980a.mo2256o();
        o.mo3439a(document.m14625N().f13171k, document.bV());
        o.mo3432a(document.f14885a.f12097d, document.m14653h(), account.name, document.f14885a.f12100g, 2, document.m14671z(), this.f6949a.m13184a("content_dependency"));
        C1473m.f7980a.bw().mo3481a((C1003o) this);
        m6758b(7, 0);
    }

    public final void m6765a(String str) {
        this.f6952d = str;
        m6758b(3, 0);
    }

    public final void m_() {
        this.f6951c = this.f6950b.m14722b();
        if (this.f6951c == null) {
            m6765a(m592c((int) C7582R.string.generic_get_app_error));
        } else {
            m6758b(5, 0);
        }
    }

    public final void g_() {
        super.g_();
        this.f6950b.m11918a((C1031w) this);
        this.f6950b.m11917a((C0657w) this);
    }

    public final void h_() {
        this.f6950b.m11922b((C1031w) this);
        this.f6950b.m11921b((C0657w) this);
        super.h_();
    }

    public final void mo1062a(VolleyError volleyError) {
        m6765a(m592c((int) C7582R.string.generic_get_app_error));
    }

    public final void mo1205a(C3369m c3369m) {
        if (c3369m.m16819a() != null && c3369m.m16819a().equals(this.f6951c.f14885a.f12097d)) {
            this.f6953e = c3369m.f17273c.f17153d;
            for (C1077e a : this.f6954f) {
                a.mo1407a(c3369m.f17273c.f17153d);
            }
        }
    }
}

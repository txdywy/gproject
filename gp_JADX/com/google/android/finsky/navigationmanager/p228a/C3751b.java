package com.google.android.finsky.navigationmanager.p228a;

import android.accounts.Account;
import android.support.v4.app.ad;
import android.view.View;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.activities.InlineAppDetailsDialog;
import com.google.android.finsky.ap.C1249a;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity;
import com.google.android.finsky.bj.C2104b;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.pagesystem.C1045b;

public final class C3751b extends C3749d {
    C3751b(C1036b c1036b, C0988c c0988c, C1542f c1542f, C2471a c2471a, C1249a c1249a, C1287h c1287h, C2171b c2171b, C2162a c2162a, C1461c c1461c, C1463g c1463g, C2104b c2104b, C1867w c1867w, ab abVar) {
        super(c1036b, c0988c, c1542f, c2471a, c1249a, c1287h, c2171b, c2162a, c1461c, c1463g, c2104b, c1867w, abVar);
    }

    public final boolean mo3695b(C2495w c2495w, boolean z) {
        this.b.onBackPressed();
        return true;
    }

    public final boolean mo3682a(C2495w c2495w, boolean z) {
        this.b.onBackPressed();
        return true;
    }

    public final boolean mo3720w() {
        return true;
    }

    public final boolean mo3620A() {
        return false;
    }

    public final boolean mo3722y() {
        return false;
    }

    public final void mo3637a(ad adVar) {
    }

    public final void mo3692b(String str, C2495w c2495w) {
        mo3676a(str, null, null, null, c2495w);
    }

    public final void mo3657a(Document document, C2495w c2495w) {
        mo3692b(document.f14885a.f12116w, c2495w);
    }

    public final void mo3653a(Document document, View view, C2495w c2495w) {
        mo3692b(document.f14885a.f12116w, c2495w);
    }

    public final void mo3725a(Document document, View[] viewArr, C2495w c2495w) {
        mo3692b(document.f14885a.f12116w, c2495w);
    }

    public final void mo3676a(String str, String str2, String str3, String str4, C2495w c2495w) {
        mo3666a(str, null, str2, str3, str4, !this.j.dj().mo2294a(12640608), c2495w);
    }

    public final void mo3666a(String str, ax axVar, String str2, String str3, String str4, boolean z, C2495w c2495w) {
        this.b.startActivity(this.n.mo2751a(this.b, str, str2, str3, str4, true, c2495w));
        if (z) {
            this.b.finish();
        }
    }

    public final void mo3673a(String str, String str2, int i, int i2, DfeToc dfeToc, com.google.android.finsky.p111d.ad adVar, C2495w c2495w) {
        c2495w.m13379b(new C2475d(adVar));
        this.b.startActivity(this.n.mo2747a(this.b, str, str2, i, c2495w));
        if (!this.j.dj().mo2294a(12640608)) {
            this.b.finish();
        }
    }

    protected final C1045b mo3724E() {
        return null;
    }

    public final void mo3631a(Account account, Document document, int i, C2731v c2731v, String str, boolean z, C2495w c2495w) {
        this.b.startActivityForResult(LightPurchaseFlowActivity.m10056a(account, document, null, i, c2731v, document.f14885a.f12087D, str, 0, null, false, 0, c2495w), 33);
    }

    public final void mo3633a(Account account, Document document, boolean z) {
        int i = 1;
        if (this.i.mo2700a(this.b, account, document, this.c, null, 1, null)) {
            i = 0;
        }
        if (i != 0 && z) {
            this.b.finish();
        }
    }

    public final void mo3675a(String str, String str2, String str3, String str4) {
        if (this.b == null || !(this.b instanceof InlineAppDetailsDialog)) {
            super.mo3675a(str, str2, str3, str4);
        } else {
            ((InlineAppDetailsDialog) this.b).m6125a(str, str2, str3);
        }
    }

    public final void mo3646a(DfeToc dfeToc, C2495w c2495w) {
        this.b.startActivity(this.n.mo2738a(this.b, c2495w));
        this.b.finish();
    }
}

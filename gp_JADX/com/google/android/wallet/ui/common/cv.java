package com.google.android.wallet.ui.common;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.view.View;
import com.google.a.a.a.a.b.a.b.a.aj;
import com.google.android.wallet.analytics.C6493a;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6513c;
import com.google.protobuf.nano.i;

public abstract class cv extends C6522i implements C6504m, cf, ch, C6527m, C6528w {
    public boolean aH = true;
    public C6513c aI;
    public C6512i aJ;
    public boolean aK = true;
    public LogContext aL;
    public C6504m aM;

    public abstract void mo5533W();

    public void mo5477b(Bundle bundle) {
        super.mo5477b(bundle);
        this.aK = ci.m30892f(this.bd);
        if (bundle != null) {
            this.aH = bundle.getBoolean("uiEnabled", true);
            this.aL = (LogContext) bundle.getParcelable("logContext");
            if (this.aL != null) {
                C6537a.m29701c(this.aL);
                return;
            }
            return;
        }
        long Y = mo5520Y();
        if (Y != 0) {
            this.aL = C6537a.m29676a(this.bh, Y);
        }
    }

    protected void mo5517a(Bundle bundle, View view) {
        C6665h Z = mo5521Z();
        if (Z != null) {
            Z.af = this;
        }
        cd cdVar = (cd) this.B.a("tagTooltipDialog");
        if (cdVar != null) {
            cdVar.af = this;
        }
    }

    public void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putBoolean("uiEnabled", this.aH);
        bundle.putParcelable("logContext", this.aL);
    }

    public void mo5537u() {
        super.u();
        mo5469a(4, Bundle.EMPTY);
        if (this.aL != null && this.aL.f32616f) {
            C6537a.m29701c(this.aL);
        }
    }

    public void mo5559v() {
        super.v();
        if (this.aL != null) {
            C6537a.m29698b(this.aL);
        }
    }

    public final LogContext as() {
        if (this.aL != null) {
            return this.aL;
        }
        return this.bh;
    }

    public final void mo5519b(boolean z) {
        if (this.aH != z) {
            this.aH = z;
            mo5533W();
        }
    }

    public final void m29835a(C6513c c6513c, C6512i c6512i) {
        this.aI = c6513c;
        this.aJ = c6512i;
    }

    public void mo5469a(int i, Bundle bundle) {
    }

    public final void mo5472a(View view, String str) {
        if (mo5521Z() == null) {
            p a = cw.m30919a(str, this.bc);
            a.af = this;
            a.a(this.B, "tagWebViewDialog");
        }
    }

    public C6504m getParentUiNode() {
        if (this.aM != null) {
            return this.aM;
        }
        if (this.F != null) {
            return (C6504m) this.F;
        }
        return (C6504m) h();
    }

    public final void mo5518a(aj ajVar) {
        if (this.B.a("tagTooltipDialog") == null) {
            int i = this.bc;
            Fragment cdVar = new cd();
            Bundle b = C6665h.m30137b(i);
            cdVar.f(b);
            b.putParcelable("tooltipProto", ParcelableProto.m29885a((i) ajVar));
            cdVar.a(this, -1);
            cdVar.af = this;
            cdVar.a(this.B, "tagTooltipDialog");
        }
    }

    public void setParentUiNode(C6504m c6504m) {
        this.aM = c6504m;
    }

    private final cw mo5521Z() {
        return (cw) this.B.a("tagWebViewDialog");
    }

    public final C6527m ap() {
        return this.aK ? this : null;
    }

    public final Account aq() {
        if (h() instanceof C6493a) {
            return ((C6493a) h()).mo5474b();
        }
        for (Fragment fragment = this; fragment != null; fragment = fragment.F) {
            if (fragment instanceof C6493a) {
                return ((C6493a) fragment).mo5474b();
            }
        }
        return null;
    }

    public final String ar() {
        Account aq = aq();
        return aq != null ? aq.name : null;
    }
}

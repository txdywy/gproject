package com.google.android.finsky.billing.lightpurchase.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.cr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.l;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.v;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.y.a;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.a.a.n;
import com.google.wireless.android.finsky.a.a.x;
import java.util.Map;

public final class com.google.android.finsky.billing.lightpurchase.a.g extends Fragment implements com.google.android.finsky.billing.common.t, com.google.android.finsky.billing.lightpurchase.a.f, com.google.android.finsky.billing.lightpurchase.a.k, com.google.android.finsky.billing.lightpurchase.a.q
{

    public final com.google.android.finsky.d.a a;
    public com.google.android.finsky.billing.lightpurchase.a.i b;
    public com.google.android.finsky.billing.v c;
    public String d;
    public int e;
    public String f;
    public int g;
    public com.google.android.finsky.d.w h;

    g() {
        Fragment();
        this.a = com.google.android.finsky.m.a.aR();
    }

    private final void a(Fragment p0) {
        v0 = this.j().a();
        v0.b(2131755313, p0);
        v0.a();
        v0.c();
    }

    private final void a(boolean p0) {
        if (p0 != 0)
            com.google.android.finsky.m.a.h(this.d).d = Boolean.valueOf(0);
        ((com.google.android.finsky.billing.lightpurchase.a.h)this.h()).b(1);
    }

    public final void W() {
        ((com.google.android.finsky.billing.lightpurchase.a.h)this.h()).b(0);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        return p0.inflate(2130968632, p1, 0);
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        if (this.b.ag <= this.g) {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(this.g);
            FinskyLog.a("Already received state instance %d, ignore.", v1);
            return;
        }
        this.g = this.b.ag;
        switch (this.b.l) {
            case 0:
                if (this.f == 0)
                    this.b.b(4, 0);
                else {
                    this.b.e = new com.google.android.finsky.dfemodel.i(this.b.b, com.google.android.finsky.api.l.a(this.f));
                    this.b.e.a(this.b);
                    this.b.e.a(this.b);
                    this.b.b(1, 0);
                }
                break;
            case 1:
                if (this.c == 0)
                    this.c = new com.google.android.finsky.billing.v();
                this.a(this.c);
                break;
            case 2:
                this.a(1);
                break;
            case 3:
                if (this.b.af == 1) {
                    if (this.b.l != 3 || this.b.af != 1)
                        throw new IllegalStateException(53 + "Invalid state: " + this.b.l + " with substate: " + this.b.af);
                    v0 = this.b.c.n;
                }
                else {
                    if (this.b.l != 3 || this.b.af == 1)
                        throw new IllegalStateException(53 + "Invalid state: " + this.b.l + " with substate: " + this.b.af);
                    v2 = this.h().getResources();
                    v3 = new com.google.wireless.android.finsky.a.a.x();
                    v0 = v2.getString(2131952688);
                    if (v0 == 0)
                        throw new NullPointerException();
                    v3.a = v3.a | 1;
                    v3.b = v0;
                    v3.a = v3.a | 4;
                    v3.d = 1;
                    v0 = new com.google.wireless.android.finsky.a.a.n();
                    v2 = v2.getString(2131952119);
                    if (v2 == 0)
                        throw new NullPointerException();
                    v0.a = v0.a | 1;
                    v0.b = v2;
                    if (this.b.d == 0)
                        throw new NullPointerException();
                    v0.a = v0.a | 2;
                    v0.c = this.b.d;
                    v0.d = v3;
                }
                v4 = new Bundle();
                v4.putString("authAccount", this.d);
                v4.putInt("ChallengeErrorFragment.backend", this.e);
                v4.putParcelable("ChallengeErrorFragment.challenge", ParcelableProto.a(v0));
                this.h.b(this.d).a(v4);
                v0 = new com.google.android.finsky.billing.lightpurchase.a.j();
                v0.f(v4);
                this.a(v0);
                break;
            case 4:
                this.b.b.e(this.b, this.b);
                this.b.b(1, 0);
                break;
            case 5:
                if (this.b.l != 5)
                    throw new IllegalStateException(26 + "Invalid state: " + this.b.l);
                v4 = new Bundle();
                v4.putString("authAccount", this.d);
                v4.putInt("AgeChallengeFragment.backend", this.e);
                v4.putParcelable("AgeChallengeFragment.challenge", ParcelableProto.a(this.b.c.d));
                this.h.b(this.d).a(v4);
                v0 = new com.google.android.finsky.billing.lightpurchase.a.a();
                v0.f(v4);
                this.a(v0);
                break;
            case 6:
                if (this.b.l != 6)
                    throw new IllegalStateException(26 + "Invalid state: " + this.b.l);
                v4 = new Bundle();
                v4.putString("authAccount", this.d);
                v4.putInt("SmsCodeFragment.backend", this.e);
                v4.putParcelable("SmsCodeFragment.challenge", ParcelableProto.a(this.b.c.e));
                this.h.b(this.d).a(v4);
                v0 = new com.google.android.finsky.billing.lightpurchase.a.o();
                v0.f(v4);
                this.a(v0);
                break;
            case 7:
                this.a(0);
                break;
            default:
                FinskyLog.e(29 + "Unexpected state: " + this.b.l, new Object[0]);
                break;
        }
    }

    public final void a(com.google.wireless.android.finsky.a.a.m p0) {
        this.b.c = p0;
        if (this.b.c.d != 0)
            this.b.b(5, 0);
        else {
            if (this.b.c.e == 0)
                throw new IllegalStateException("Received unknown challenge.");
            this.b.b(6, 0);
        }
    }

    public final void a(String p0) {
        this.b.b.h(p0, this.b, this.b);
        this.b.b(1, 0);
    }

    public final void a(String p0, String p1, String p2) {
        this.b.b.a(p0, p1, p2, this.b, this.b);
        this.b.b(1, 0);
    }

    public final void a(String p0, Map p1) {
        this.b.b.b(p0, p1, this.b, this.b);
        this.b.b(1, 0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.d = this.q.getString("authAccount");
        this.e = this.q.getInt("AgeVerificationHostFragment.backend");
        this.f = this.q.getString("AgeVerificationHostFragment.docid_str");
        if (p0 != 0) {
            this.g = p0.getInt("AgeVerificationHostFragment.last_state_instance");
            this.h = this.a.a(p0);
        }
        else
            this.h = this.a.a(this.q);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putInt("AgeVerificationHostFragment.last_state_instance", this.g);
        this.h.a(p0);
    }

    public final void g_() {
        super.g_();
        this.b = (com.google.android.finsky.billing.lightpurchase.a.i)this.B.a("AgeVerificationHostFragment.sidecar");
        if (this.b == 0) {
            v2 = new com.google.android.finsky.billing.lightpurchase.a.i();
            v3 = new Bundle();
            v3.putString("authAccount", this.d);
            this.h.b(this.d).a(v3);
            v2.f(v3);
            this.b = v2;
            this.B.a().a(this.b, "AgeVerificationHostFragment.sidecar").c();
        }
    }

    public final void u() {
        super.u();
        this.b.a(this);
    }

    public final void v() {
        super.v();
        this.b.a(0);
    }

}

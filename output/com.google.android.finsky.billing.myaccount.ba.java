package com.google.android.finsky.billing.myaccount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.em;
import com.android.volley.VolleyError;
import com.android.volley.w;
import com.google.android.finsky.api.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.pagesystem.b;
import com.google.wireless.android.finsky.dfe.nano.ba;

public final class com.google.android.finsky.billing.myaccount.ba extends com.google.android.finsky.billing.myaccount.e implements com.android.volley.x
{

    public final com.google.android.finsky.billing.myaccount.bb ag;
    public final com.android.volley.w ah;
    public final com.google.android.finsky.billing.myaccount.bf ai;
    public boolean aj;
    public com.google.wireless.android.finsky.dfe.nano.ba h;

    ba() {
        com.google.android.finsky.billing.myaccount.e();
        this.ag = new com.google.android.finsky.billing.myaccount.bb(this);
        this.ah = new com.google.android.finsky.billing.myaccount.be(this);
        this.ai = new com.google.android.finsky.billing.myaccount.bf(this);
    }

    public static com.google.android.finsky.billing.myaccount.ba a(int p0, com.google.android.finsky.d.w p1) {
        v0 = new com.google.android.finsky.billing.myaccount.ba();
        v0.a(p1);
        v0.a("mode", p0);
        return v0;
    }

    public final void a(VolleyError p0) {
        this.aj = 0;
        super.a(p0);
    }

    public final void a(com.google.wireless.android.finsky.dfe.nano.ba p0) {
        if (this.R != 0) {
            this.aj = 0;
            this.h = p0;
            this.cg_();
            this.O_();
        }
    }

    protected final void aa() {
        if (this.aj == 0) {
            this.aj = 1;
            this.bo.h(this, this);
        }
    }

    public final boolean ah() {
        if (this.h != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final android.support.v7.widget.em ai() {
        if (!this.a.containsKey("EmailAdapter.mode"))
            this.a.putInt("EmailAdapter.mode", this.q.getInt("mode"));
        return new com.google.android.finsky.billing.myaccount.an(this.h(), this.a, this, this.bw, this.h, this.ag, this.ai);
    }

    protected final int aj() {
        return 2131951656;
    }

    public final boolean am() {
        if ((com.google.android.finsky.billing.myaccount.an)this.f != 0) {
            if (((com.google.android.finsky.billing.myaccount.an)this.f).c() == 1) {
                ((com.google.android.finsky.billing.myaccount.an)this.f).f(0);
                v0 = 1;
            }
            else
                v0 = 0;
            if (v0 != 0) {
                v0 = 1;
                return v0;
            }
        }
        v0 = super.am();
        return v0;
    }

    public final boolean an() {
        if ((com.google.android.finsky.billing.myaccount.an)this.f != 0 && ((com.google.android.finsky.billing.myaccount.an)this.f).c() == 1)
            com.google.android.finsky.billing.myaccount.an.b(this.R);
        return 0;
    }

    protected final int ao() {
        return 27;
    }

    public final void b_(Object p0) {
        this.a((com.google.wireless.android.finsky.dfe.nano.ba)p0);
    }

    public final void cg_() {
        super.cg_();
        ((com.google.android.finsky.billing.myaccount.an)this.f).c = this.h.a;
        ((com.google.android.finsky.billing.myaccount.an)this.f).d = this.h.b;
        ((com.google.android.finsky.billing.myaccount.an)this.f).f = this.h.c;
        ((com.google.android.finsky.billing.myaccount.an)this.f).c(3);
    }

    public final void u() {
        super.u();
        this.aa();
    }

}

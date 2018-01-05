package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.support.v7.app.q;
import android.support.v7.app.y;
import android.support.v7.app.z;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.android.volley.x;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.payments.InstrumentManagerActivity;
import com.google.android.finsky.billing.payments.f;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.volley.e;
import com.google.wireless.android.finsky.dfe.c.a.au;
import com.google.wireless.android.finsky.dfe.c.a.aw;
import com.google.wireless.android.finsky.dfe.c.a.ax;
import com.google.wireless.android.finsky.dfe.c.a.ay;
import com.google.wireless.android.finsky.dfe.c.a.bc;
import com.google.wireless.android.finsky.dfe.c.a.bd;
import com.google.wireless.android.finsky.dfe.c.a.be;
import com.google.wireless.android.finsky.dfe.c.a.bi;
import com.google.wireless.android.finsky.dfe.c.a.bk;
import java.util.Stack;

final class com.google.android.finsky.billing.myaccount.af extends com.google.android.finsky.billing.common.s implements com.android.volley.w
{

    public com.google.android.finsky.d.a a;
    public com.google.android.finsky.d.w ah;
    public final Handler ai;
    public VolleyError aj;
    public com.google.wireless.android.finsky.dfe.c.a.be ak;
    public Stack al;
    public boolean am;
    public com.google.android.finsky.billing.myaccount.am an;
    public com.google.wireless.android.finsky.dfe.c.a.aw ao;
    public byte[] ap;
    public com.android.volley.x aq;
    public com.google.android.finsky.api.h b;
    public com.google.android.finsky.billing.common.i c;
    public com.google.android.finsky.dx.a d;
    public com.google.android.finsky.volley.e e;
    public com.google.android.finsky.billing.a.h f;
    public com.google.android.finsky.api.c g;

    af() {
        com.google.android.finsky.billing.common.s();
        this.ai = new Handler();
        this.al = new Stack();
        this.aq = new com.google.android.finsky.billing.myaccount.ag(this);
    }

    final void W() {
        this.am = 0;
        this.ap = 0;
    }

    public final void a(int p0, int p1, Intent p2) {
        switch (p0) {
            case 1150:
                this.ao = 0;
                if (p1 == -1) {
                    this.ap = p2.getByteArrayExtra("callback_data");
                    this.b(this.ao.d);
                }
                else
                    this.b(this.ao.e);
                break;
            default:
                super.a(p0, p1, p2);
                break;
        }
    }

    public final void a(VolleyError p0) {
        this.aj = p0;
        this.b(3, 0);
    }

    public final void a(com.google.wireless.android.finsky.dfe.c.a.au p0) {
        if (this.am != 0)
            FinskyLog.b("Ignoring incoming action with active chain", new Object[0]);
        else
            this.b(p0);
    }

    final void a(com.google.wireless.android.finsky.dfe.c.a.bc p0) {
        this.b(1, 0);
        if (p0 == 0)
            p0 = new com.google.wireless.android.finsky.dfe.c.a.bc();
        v0 = this.c.a(this.h(), this.g.b().name, com.google.android.finsky.billing.payments.f.a(0));
        if (v0 == 0)
            throw new NullPointerException();
        p0.a = p0.a | 4;
        p0.d = v0;
        if (this.ap != 0) {
            if (this.ap == 0)
                throw new NullPointerException();
            p0.a = p0.a | 2;
            p0.c = this.ap;
        }
        this.g.a(p0, this.aq, this);
    }

    public final void b(Bundle p0) {
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        this.g = this.b.a(this.q.getString("authAccount"));
        this.ah = this.a.a(this.q);
        super.b(p0);
    }

    final void b(com.google.wireless.android.finsky.dfe.c.a.au p0) {
        v0 = 0;
        while (true) {
            while (true) {
                if (p0 == 0) {
                    this.W();
                    return;
                }
                if (this.an != 0)
                    this.an.a();
                this.am = 1;
                if (p0.a == 0)
                    v1 = 1;
                else
                    v1 = 0;
                if (v1 != 0) {
                    if (p0.a == 0)
                        v0 = p0.b;
                    this.ao = v0;
                    this.startActivityForResult(InstrumentManagerActivity.a(this.g(), this.g.c(), this.ao.c, this.ao.b, Bundle.EMPTY, this.ah, 0), 1150);
                    return;
                }
                if (p0.a == 1) {
                    this.ai.postDelayed(new com.google.android.finsky.billing.myaccount.ah(this, p0), (long)p0.d().b);
                    return;
                }
                if (p0.a != 2)
                    break;
                Toast.makeText(this.g(), p0.e().b, 0).show();
                p0 = p0.e().c;
            }
            if (p0.a == 3) {
                if (p0.a == 3)
                    v0 = p0.e;
                this.a(v0.a);
                return;
            }
            if (p0.a == 4) {
                com.google.android.finsky.dx.a.b(this.g.c(), 7);
                this.e.a(new com.google.android.finsky.billing.myaccount.al(this), "locale_changed");
                this.f.a(this.g.c(), 0);
                return;
            }
            if (p0.a != 6)
                break;
            this.al.push(p0.f().b);
            this.b(2, 0);
            p0 = p0.f().c;
        }
        if (p0.a == 5) {
            if (p0.a == 5)
                v0 = p0.g;
            v1 = new android.support.v7.app.z(this.g()).a(v0.b).b(v0.c).a(v0.d, new com.google.android.finsky.billing.myaccount.ai(this, v0)).b(v0.e, new com.google.android.finsky.billing.myaccount.aj(this, v0));
            v1.a.p = new com.google.android.finsky.billing.myaccount.ak(this, v0);
            v1.a().show();
        }
        else if (p0.a == 7)
            this.h().finish();
    }

}

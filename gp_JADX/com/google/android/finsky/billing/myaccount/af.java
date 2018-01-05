package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C0434z;
import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1793i;
import com.google.android.finsky.billing.p151a.C1655h;
import com.google.android.finsky.billing.payments.C2043f;
import com.google.android.finsky.billing.payments.InstrumentManagerActivity;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.volley.C4774e;
import com.google.wireless.android.finsky.dfe.c.a.au;
import com.google.wireless.android.finsky.dfe.c.a.aw;
import com.google.wireless.android.finsky.dfe.c.a.bc;
import com.google.wireless.android.finsky.dfe.c.a.bd;
import com.google.wireless.android.finsky.dfe.c.a.be;
import com.google.wireless.android.finsky.dfe.c.a.bk;
import java.util.Stack;

public final class af extends C1089s implements C0657w {
    public C2471a f10183a;
    public C2495w ah;
    public final Handler ai = new Handler();
    public VolleyError aj;
    public be ak;
    public Stack al = new Stack();
    public boolean am;
    public am an;
    public aw ao;
    public byte[] ap;
    public C0660x aq = new ag(this);
    public C1287h f10184b;
    public C1793i f10185c;
    public C2910a f10186d;
    public C4774e f10187e;
    public C1655h f10188f;
    public C1254c f10189g;

    public final void mo136b(Bundle bundle) {
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1751a(this);
        Bundle bundle2 = this.f760q;
        this.f10189g = this.f10184b.mo2016a(bundle2.getString("authAccount"));
        this.ah = this.f10183a.m13179a(bundle2);
        super.mo136b(bundle);
    }

    final void m10582a(bc bcVar) {
        m6758b(1, 0);
        if (bcVar == null) {
            bcVar = new bc();
        }
        String a = this.f10185c.m9766a(m603h(), this.f10189g.mo1620b().name, C2043f.m10743a(null));
        if (a == null) {
            throw new NullPointerException();
        }
        bcVar.a |= 4;
        bcVar.d = a;
        if (this.ap != null) {
            byte[] bArr = this.ap;
            if (bArr == null) {
                throw new NullPointerException();
            }
            bcVar.a |= 2;
            bcVar.c = bArr;
        }
        this.f10189g.mo1565a(bcVar, this.aq, (C0657w) this);
    }

    public final void mo1062a(VolleyError volleyError) {
        this.aj = volleyError;
        m6758b(3, 0);
    }

    public final void m10581a(au auVar) {
        if (this.am) {
            FinskyLog.m21662b("Ignoring incoming action with active chain", new Object[0]);
        } else {
            m10584b(auVar);
        }
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        switch (i) {
            case 1150:
                aw awVar = this.ao;
                this.ao = null;
                if (i2 == -1) {
                    this.ap = intent.getByteArrayExtra("callback_data");
                    m10584b(awVar.d);
                    return;
                }
                m10584b(awVar.e);
                return;
            default:
                super.mo2342a(i, i2, intent);
                return;
        }
    }

    final void mo968W() {
        this.am = false;
        this.ap = null;
    }

    final void m10584b(au auVar) {
        bk bkVar = null;
        while (auVar != null) {
            if (this.an != null) {
                this.an.m10585a();
            }
            this.am = true;
            if (auVar.a == 0) {
                aw awVar;
                if (auVar.a == 0) {
                    awVar = auVar.b;
                }
                this.ao = awVar;
                startActivityForResult(InstrumentManagerActivity.m10735a(m601g(), this.f10189g.mo1636c(), this.ao.c, this.ao.b, Bundle.EMPTY, this.ah, 0), 1150);
                return;
            } else if (auVar.a == 1) {
                this.ai.postDelayed(new ah(this, auVar), (long) auVar.d().b);
                return;
            } else if (auVar.a == 2) {
                Toast.makeText(m601g(), auVar.e().b, 0).show();
                auVar = auVar.e().c;
            } else if (auVar.a == 3) {
                bd bdVar;
                if (auVar.a == 3) {
                    bdVar = auVar.e;
                }
                m10582a(bdVar.a);
                return;
            } else if (auVar.a == 4) {
                C2910a.m15176b(this.f10189g.mo1636c(), 7);
                this.f10187e.mo4380a(new al(this), "locale_changed");
                this.f10188f.m9407a(this.f10189g.mo1636c(), null);
                return;
            } else if (auVar.a == 6) {
                this.al.push(auVar.f().b);
                m6758b(2, 0);
                auVar = auVar.f().c;
            } else if (auVar.a == 5) {
                if (auVar.a == 5) {
                    bkVar = auVar.g;
                }
                C0434z b = new C0434z(m601g()).m2640a(bkVar.b).m2644b(bkVar.c).m2641a(bkVar.d, new ai(this, bkVar)).m2645b(bkVar.e, new aj(this, bkVar));
                b.f2507a.f2482p = new ak(this, bkVar);
                b.m2637a().show();
                return;
            } else if (auVar.a == 7) {
                m603h().finish();
                return;
            } else {
                return;
            }
        }
        mo968W();
    }
}

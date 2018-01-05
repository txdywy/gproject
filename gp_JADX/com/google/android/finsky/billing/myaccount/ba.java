package com.google.android.finsky.billing.myaccount;

import android.support.v7.widget.em;
import android.view.View;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.pagesystem.C1045b;
import com.squareup.leakcanary.C7582R;

public final class ba extends C1998e implements C0660x {
    public final bb ag = new bb(this);
    public final C0657w ah = new be(this);
    public final bf ai = new bf(this);
    public boolean aj;
    public com.google.wireless.android.finsky.dfe.nano.ba f10240h;

    public static ba m10604a(int i, C2495w c2495w) {
        C1045b baVar = new ba();
        baVar.mo2580a(c2495w);
        baVar.m6253a("mode", i);
        return baVar;
    }

    protected final em ai() {
        int i = this.f760q.getInt("mode");
        if (!this.a.containsKey("EmailAdapter.mode")) {
            this.a.putInt("EmailAdapter.mode", i);
        }
        return new an(m603h(), this.a, this, this.bw, this.f10240h, this.ag, this.ai);
    }

    protected final void aa() {
        if (!this.aj) {
            this.aj = true;
            this.bo.mo1654h(this, this);
        }
    }

    public final void mo979u() {
        super.mo979u();
        aa();
    }

    public final boolean am() {
        an anVar = (an) this.f;
        if (anVar != null) {
            int i;
            if (anVar.m10593c() == 1) {
                anVar.m10595f(0);
                i = 1;
            } else {
                i = 0;
            }
            if (i != 0) {
                return true;
            }
        }
        return super.am();
    }

    public final boolean an() {
        an anVar = (an) this.f;
        if (anVar != null) {
            View view = this.f746R;
            if (anVar.m10593c() == 1) {
                an.m10589b(view);
            }
        }
        return false;
    }

    public final boolean ah() {
        return this.f10240h != null;
    }

    protected final int aj() {
        return C7582R.string.account_email_page_title;
    }

    protected final int ao() {
        return 27;
    }

    public final void m10606a(com.google.wireless.android.finsky.dfe.nano.ba baVar) {
        if (this.f746R != null) {
            this.aj = false;
            this.f10240h = baVar;
            cg_();
            O_();
        }
    }

    public final void cg_() {
        super.cg_();
        an anVar = (an) this.f;
        com.google.wireless.android.finsky.dfe.nano.ba baVar = this.f10240h;
        anVar.f10200c = baVar.a;
        anVar.f10201d = baVar.b;
        anVar.f10203f = baVar.c;
        anVar.m3631c(3);
    }

    public final void mo1062a(VolleyError volleyError) {
        this.aj = false;
        super.mo1062a(volleyError);
    }

    public final /* synthetic */ void b_(Object obj) {
        m10606a((com.google.wireless.android.finsky.dfe.nano.ba) obj);
    }
}

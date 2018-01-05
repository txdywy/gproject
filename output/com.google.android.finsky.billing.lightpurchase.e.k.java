package com.google.android.finsky.billing.lightpurchase.e;

import android.accounts.Account;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.a.d;
import android.support.v4.app.Fragment;
import android.support.v4.widget.bg;
import android.support.v4.widget.bm;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.f;
import com.google.android.finsky.billing.lightpurchase.GiftEmailParams;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.ak;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.nano.ep;
import com.google.wireless.android.finsky.dfe.nano.er;
import com.google.wireless.android.finsky.dfe.nano.fd;

public final class com.google.android.finsky.billing.lightpurchase.e.k extends com.google.android.finsky.billing.lightpurchase.d.h implements View$OnClickListener, CompoundButton$OnCheckedChangeListener, com.google.android.finsky.d.ad
{

    public final com.google.android.finsky.d.t a;
    public TextView af;
    public View ag;
    public CheckBox ah;
    public View aj;
    public TextView ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public GiftEmailParams ap;
    public final com.google.wireless.android.a.a.a.a.ce aq;
    public int b;
    public int c;
    public com.google.wireless.android.finsky.dfe.nano.er d;
    public View e;
    public View f;
    public TextView g;
    public TextView h;
    public TextView i;

    k() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = com.google.android.finsky.m.a.aP();
        this.aq = com.google.android.finsky.d.j.a(710);
    }

    private final void a(LayoutInflater p0, ViewGroup p1, int p2, String[] p3, int p4) {
        v2 = 0;
        while (v2 < p3.length) {
            this.ak = (TextView)p0.inflate(p2, p1, 0);
            com.google.android.finsky.bg.ae.a(this.ak, com.google.android.finsky.billing.f.a(p3[v2], p4));
            p1.addView(this.ak);
            v2 = v2 + 1;
        }
        if (p3.length > 0)
            v0 = 0;
        else
            v0 = 8;
        p1.setVisibility(v0);
    }

    private final void ab() {
        v3 = 2130837708;
        v2 = 8;
        if (this.al != 0)
            v0 = 0;
        else
            v0 = 8;
        this.f.setVisibility(v0);
        if (this.af.getVisibility() == 0) {
            if (this.al != 0)
                v0 = 2130837708;
            else
                v0 = 2130837709;
            android.support.v4.widget.bg.a.a(this.af, v0);
        }
        else {
            v5 = this.i.getContext();
            if (this.al != 0)
                v0 = com.google.android.finsky.bg.h.a(v5, 2130837740, this.b);
            else
                v0 = com.google.android.finsky.bg.h.a(v5, 2130837742, this.b);
            if (this.q.getBoolean("CartDetailsStep.isPriceColorOverridden")) {
                if (this.al == 0)
                    v3 = 2130837709;
                v0 = android.support.v4.a.d.a(v5, v3);
            }
            android.support.v4.widget.bg.a(this.i, 0, 0, v0, 0);
        }
        if (this.ag != 0) {
            if (this.al != 0)
                v0 = 8;
            else
                v0 = 0;
            this.ag.setVisibility(v0);
        }
        if (this.aj != 0) {
            if (this.al == 0)
                v2 = 0;
            this.aj.setVisibility(v2);
        }
        if (this.al != 0) {
            if (this.g.getVisibility() == 0)
                this.Y().a(new com.google.android.finsky.d.p().a(714).b(this));
            if (this.h.getVisibility() == 0)
                this.Y().a(new com.google.android.finsky.d.p().a(716).b(this));
        }
        if (this.al != 0)
            v0 = 2131951873;
        else
            v0 = 2131951874;
        v3 = new Object[1];
        v3[0] = this.d.e;
        this.i.setContentDescription(this.a(v0, v3));
    }

    private final void ac() {
        if (this.al == 0)
            v0 = 1;
        else
            v0 = 0;
        this.al = v0;
        if (this.al != 0)
            this.Y().a(new com.google.android.finsky.d.p().a(715).b(this));
        this.ab();
    }

    public final void X() {
        if (this.an != 0) {
            this.a(712, 0);
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).aa();
        }
        else if (this.am != 0) {
            this.a(711, 0);
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ab();
        }
        else {
            this.a(712, 0);
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ad();
        }
    }

    final com.google.android.finsky.d.w Y() {
        return ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).am();
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v4 = com.google.android.finsky.bg.h.c(this.h(), this.b);
        v5 = v4.getDefaultColor();
        com.google.android.finsky.m.a.j(((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ai().name);
        v10 = p0.inflate(2130969064, p1, 0);
        v9 = (TextView)v10.findViewById(2131756147);
        v0 = (TextView)v10.findViewById(2131756148);
        v1 = (TextView)v10.findViewById(2131756149);
        this.i = (TextView)v10.findViewById(2131756151);
        this.af = (TextView)v10.findViewById(2131756150);
        v2 = (TextView)v10.findViewById(2131756168);
        v6 = (TextView)v10.findViewById(2131755755);
        v6.setVisibility(0);
        v6.setText(((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ai().name);
        this.f = v10.findViewById(2131756156);
        v7 = (TextView)v10.findViewById(2131755352);
        this.e = v10.findViewById(2131755740);
        v9.setText(this.d.b);
        if (this.d.a & 2)
            v3 = 1;
        else
            v3 = 0;
        if (v3 != 0) {
            v0.setText(this.d.c);
            v0.setVisibility(0);
        }
        if (this.d.a & 4)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0) {
            v1.setText(this.d.d);
            v1.setVisibility(0);
        }
        this.i.setText(this.d.e);
        this.i.setTextColor(v4);
        v0 = (TextView)v10.findViewById(2131755852);
        if (this.d.a & 32)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0) {
            v0.setText(this.d.i);
            v0.setVisibility(0);
        }
        else
            v0.setVisibility(8);
        v0 = (TextView)v10.findViewById(2131755853);
        if (this.d.a & 64)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0) {
            v0.setText(this.d.j);
            v0.setVisibility(0);
        }
        else
            v0.setVisibility(8);
        if (this.d.l != 0) {
            if (!TextUtils.isEmpty(this.d.l.d)) {
                this.af.setText(this.d.l.d);
                this.af.setVisibility(0);
            }
            if (this.d.l.r.length > 0) {
                v0 = (TextView)v10.findViewById(2131756152);
                com.google.android.finsky.bg.ae.a(v0, this.d.l.r[0].d);
                v0.setVisibility(0);
            }
            else {
                this.a(p0, (ViewGroup)v10.findViewById(2131756163), 2130969066, this.d.o, v5);
                v6.setText(((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ai().name);
                if (this.an == 0)
                    v0 = 1;
                else
                    v0 = 0;
                this.am = v0;
            }
        }
        else {
            this.af.setVisibility(8);
            com.google.android.finsky.bg.ae.a(v2, com.google.android.finsky.billing.f.a(this.d.q, v5));
            v2.setVisibility(0);
        }
        if (!com.google.android.finsky.dfemodel.q.b(this.c))
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            com.google.android.finsky.m.a.ar().a((FifeImageView)v10.findViewById(2131755855), this.d.w, this.c);
        this.a(p0, (ViewGroup)v10.findViewById(2131756153), 2130969065, this.d.m, v5);
        if (this.d.a & 256)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0) {
            v7.setVisibility(0);
            com.google.android.finsky.bg.ae.a(v7, com.google.android.finsky.billing.f.a(this.d.p, v5));
        }
        else
            v7.setVisibility(8);
        if (this.d.x != 0) {
            this.ah = (CheckBox)v10.findViewById(2131756155);
            this.ah.setText(this.d.x.b);
            this.ah.setChecked(this.d.x.c);
            this.ah.setOnCheckedChangeListener(this);
            this.ah.setVisibility(0);
        }
        if (this.d.v != 0 && this.d.v.length > 0) {
            v0 = (ViewGroup)v10.findViewById(2131756161);
            v0.setVisibility(0);
            v3 = 0;
            v4 = 0;
            while (v4 < this.d.v.length) {
                v11 = p0.inflate(2130969067, v0, 0);
                v1 = (TextView)v11.findViewById(2131755114);
                v1.setText(this.d.v[v4].c.g);
                if (this.d.v[v4].e != 0) {
                    if (v3 != 0)
                        throw new IllegalArgumentException("Multiple applied vouchers is not supported");
                    v1.setTypeface(v1.getTypeface(), 1);
                    v11.findViewById(2131755389).setVisibility(0);
                    v11.setOnClickListener(new com.google.android.finsky.billing.lightpurchase.e.l(this));
                    v1 = this.d.v[v4];
                }
                else {
                    v11.setOnClickListener(new com.google.android.finsky.billing.lightpurchase.e.m(this, this.d.v[v4].c.c));
                    v1 = v3;
                }
                v0.addView(v11);
                v4 = v4 + 1;
                v3 = v1;
            }
            v0 = (TextView)v10.findViewById(2131756160);
            v0.setVisibility(0);
            v0.setTextColor(v5);
            if (v3 == 0)
                v1 = 2131953387;
            else
                v1 = 2131953386;
            v0.setText(v1);
            v10.findViewById(2131756162).setVisibility(0);
            if (v3 != 0) {
                this.ag = v10.findViewById(2131756154);
                this.ag.setVisibility(0);
                this.ag.setOnClickListener(this);
                ((TextView)this.ag.findViewById(2131756691)).setText(v3.c.g);
                v0 = (TextView)this.ag.findViewById(2131756692);
                if (TextUtils.isEmpty(v3.d))
                    v0.setVisibility(8);
                else {
                    v2 = new Object[1];
                    v2[0] = v3.d;
                    v0.setText(this.a(2131951809, v2));
                }
                if (!TextUtils.isEmpty(v3.f))
                    v0.setContentDescription(v3.f);
                v0 = (TextView)this.ag.findViewById(2131756693);
                if (TextUtils.isEmpty(this.d.g))
                    v0.setVisibility(8);
                else {
                    v2 = new Object[1];
                    v2[0] = this.d.g;
                    v0.setText(this.a(2131951810, v2));
                }
            }
        }
        if (this.ap != 0) {
            v2 = new Object[1];
            v2[0] = this.ap.b;
            ((TextView)v10.findViewById(2131756165)).setText(this.a(2131953269, v2));
            v2 = new Object[1];
            v2[0] = this.ap.a;
            ((TextView)v10.findViewById(2131756166)).setText(this.a(2131952235, v2));
            v0 = (TextView)v10.findViewById(2131756167);
            if (!TextUtils.isEmpty(this.ap.c)) {
                v2 = new Object[1];
                v2[0] = this.ap.c;
                v0.setText(this.a(2131952494, v2));
                v0.setVisibility(0);
            }
            this.aj = v10.findViewById(2131756164);
        }
        this.g = (TextView)v10.findViewById(2131756157);
        this.h = (TextView)v10.findViewById(2131756159);
        v1 = v10.findViewById(2131756158);
        if (this.d.a & 2048)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0) {
            this.g.setText(this.d.y);
            this.g.setOnClickListener(this);
            this.g.setTextColor(v5);
        }
        else {
            this.g.setVisibility(8);
            v1.setVisibility(8);
        }
        if (this.d.a & 4096)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0) {
            this.h.setText(this.d.z);
            this.h.setOnClickListener(this);
            this.h.setTextColor(v5);
        }
        else {
            this.h.setVisibility(8);
            v1.setVisibility(8);
        }
        this.e.setOnClickListener(this);
        this.ab();
        com.google.android.finsky.m.a.aH().a(this.q, v10, v9, this.ak, this.i, this.af, v7, ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ao());
        return v10;
    }

    public final String a(Resources p0) {
        return this.d.r;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.b = this.q.getInt("CartDetailsStep.backend");
        this.c = this.q.getInt("CartDetailsStep.documentType");
        this.d = (com.google.wireless.android.finsky.dfe.nano.er)ParcelableProto.a(this.q, "CartDetailsStep.cart");
        this.an = this.q.getBoolean("CartDetailsStep.continueToInstrumentManager");
        this.ap = (GiftEmailParams)this.q.getParcelable("CartDetailsStep.giftEmailParams");
        if (p0 != 0) {
            this.al = p0.getBoolean("CartDetailsStep.expanded");
            this.ao = p0.getBoolean("CartDetailsStep.stepFragmentReadyLogged");
        }
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putBoolean("CartDetailsStep.expanded", this.al);
        p0.putBoolean("CartDetailsStep.stepFragmentReadyLogged", this.ao);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.aq;
    }

    public final void onCheckedChanged(CompoundButton p0, boolean p1) {
        if (p0 == this.ah)
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).a(Boolean.valueOf(p1));
    }

    public final void onClick(View p0) {
        if (p0 == this.e) {
            this.a(713, 0);
            com.google.android.finsky.bg.a.a(p0.getContext(), this.d.y, p0, 0);
            this.ac();
        }
        else if (p0 == this.g) {
            this.a(714, 0);
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ad();
        }
        else if (p0 == this.h) {
            this.a(716, 0);
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ae();
        }
        else if (p0 == this.ag) {
            this.a(717, 0);
            com.google.android.finsky.bg.a.a(p0.getContext(), this.c(2131953386), p0, 0);
            this.ac();
        }
    }

    public final void u() {
        super.u();
        v1 = new Object[1];
        v1[0] = this.d.e;
        v3 = new Object[2];
        v3[0] = this.d.b;
        v3[1] = this.a(2131951872, v1);
        com.google.android.finsky.bg.a.a(this.e.getContext(), this.a(2131952959, v3), this.e, 0);
        if (this.ag != 0)
            com.google.android.finsky.bg.a.a(this.ag.getContext(), ((TextView)this.ag.findViewById(2131756691)).getText(), this.ag, 0);
        if (this.ao == 0) {
            this.a.c(this.Y(), "purchase_fragment_cart_details");
            this.ao = 1;
        }
    }

}

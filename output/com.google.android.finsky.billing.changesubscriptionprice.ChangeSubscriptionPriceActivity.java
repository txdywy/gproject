package com.google.android.finsky.billing.changesubscriptionprice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.at.k;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.hf;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.w;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.c.a.at;

protected class ChangeSubscriptionPriceActivity extends com.google.android.finsky.billing.common.h implements View$OnClickListener, com.google.android.finsky.at.m, com.google.android.finsky.billing.common.t
{

    public com.google.android.play.image.w n;
    public com.google.android.finsky.billing.changesubscriptionprice.b o;
    public com.google.android.finsky.cv.a.hf p;
    public Document q;
    public PlayActionButtonV2 r;
    public TextView s;
    public TextView t;
    public View u;
    public View v;
    public View w;

    ChangeSubscriptionPriceActivity() {
        com.google.android.finsky.billing.common.h();
    }

    public static Intent a(Context p0, String p1, Document p2, com.google.android.finsky.cv.a.hf p3) {
        v0 = new Intent(p0, ChangeSubscriptionPriceActivity);
        v0.putExtra("document", p2);
        v0.putExtra("dialog", com.google.protobuf.nano.i.a(p3));
        com.google.android.finsky.billing.common.h.a(v0, p1);
        return v0;
    }

    public final void a(int p0, Bundle p1) {
        this.setResult(2);
        this.finish();
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        switch (p0.l) {
            case 0:
                break;
            case 1:
                this.w.setVisibility(8);
                this.s.setVisibility(8);
                this.v.setVisibility(8);
                this.t.setVisibility(8);
                this.u.setVisibility(0);
                break;
            case 2:
                this.w.setVisibility(8);
                this.u.setVisibility(8);
                this.t.setVisibility(0);
                this.t.setText(this.o.d.b);
                this.s.setVisibility(0);
                com.google.android.finsky.bg.ae.a(this.s, this.o.d.c);
                this.v.setVisibility(0);
                this.r.setText(this.o.d.d);
                break;
            case 3:
                new com.google.android.finsky.at.k().b(com.google.android.finsky.api.m.a(this, this.o.e)).d(2131952688).a(0, 0, 0).a().a(this.H_(), "ChangeSubscriptionPriceActivity.errorDialog");
                break;
            default:
                throw new IllegalStateException(35 + "Unhandled state change: " + p0.l);
        }
    }

    public final void b(int p0, Bundle p1) {
        this.a(p0, p1);
    }

    protected final int f() {
        return 5590;
    }

    public final void f_(int p0) {
    }

    public void onClick(View p0) {
        if (p0 == this.r) {
            if (this.o.l == 0) {
                this.o.b.a(this.o.c, this.o, this.o);
                this.o.b(1, 0);
            }
            else if (this.o.l == 2) {
                this.setResult(-1);
                this.finish();
            }
            else {
                FinskyLog.e("Button selected during unexpected sidecar state", new Object[0]);
                this.finish();
            }
        }
        else {
            FinskyLog.e("Unknown button selected", new Object[0]);
            this.finish();
        }
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        ((com.google.android.finsky.billing.changesubscriptionprice.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.changesubscriptionprice.a)).a(this);
        v1 = this.getIntent();
        if (v1.getParcelableExtra("document") == 0) {
            FinskyLog.e("Invalid intent arguments provided.", new Object[0]);
            this.setResult(1);
            this.finish();
            return;
        }
        if (v1.getByteArrayExtra("dialog") != 0) {
            this.q = (Document)v1.getParcelableExtra("document");
            this.p = (com.google.android.finsky.cv.a.hf)com.google.protobuf.nano.i.a(new com.google.android.finsky.cv.a.hf(), v1.getByteArrayExtra("dialog"));
            v1 = new Object[1];
            v1[0] = this.p;
            FinskyLog.a("Got dialog data: %s", v1);
            this.setContentView(2130968687);
            v0 = (PlayCardThumbnail)this.findViewById(2131755432);
            ((DocImageView)v0.getImageView()).a(this.q, this.n, DocImageView.a);
            v0.setOnClickListener(this);
            v0.setVisibility(0);
            this.u = this.findViewById(2131755430);
            this.w = this.findViewById(2131755431);
            this.v = this.findViewById(2131756143);
            this.r = (PlayActionButtonV2)this.findViewById(2131755791);
            this.r.a(3, this.p.g, this);
            this.t = (TextView)this.findViewById(2131755114);
            this.t.setText(this.p.b);
            ((TextView)this.findViewById(2131755435)).setText(this.p.d);
            ((TextView)this.findViewById(2131755436)).setText(this.p.e);
            this.s = (TextView)this.findViewById(2131755437);
            com.google.android.finsky.bg.ae.a(this.s, this.p.f);
            return;
        }
        FinskyLog.e("Invalid intent arguments provided.", new Object[0]);
        this.setResult(1);
        this.finish();
        return;
        this.q = (Document)v1.getParcelableExtra("document");
        try {
            this.p = (com.google.android.finsky.cv.a.hf)com.google.protobuf.nano.i.a(new com.google.android.finsky.cv.a.hf(), v1.getByteArrayExtra("dialog"));
            v1 = new Object[1];
            v1[0] = this.p;
            FinskyLog.a("Got dialog data: %s", v1);
        }
        catch (InvalidProtocolBufferNanoException ex) {
            FinskyLog.e("Can't parse incoming proto.", new Object[0]);
            this.setResult(1);
            this.finish();
            return;
        }
        this.setContentView(2130968687);
        v0 = (PlayCardThumbnail)this.findViewById(2131755432);
        ((DocImageView)v0.getImageView()).a(this.q, this.n, DocImageView.a);
        v0.setOnClickListener(this);
        v0.setVisibility(0);
        this.u = this.findViewById(2131755430);
        this.w = this.findViewById(2131755431);
        this.v = this.findViewById(2131756143);
        this.r = (PlayActionButtonV2)this.findViewById(2131755791);
        this.r.a(3, this.p.g, this);
        this.t = (TextView)this.findViewById(2131755114);
        this.t.setText(this.p.b);
        ((TextView)this.findViewById(2131755435)).setText(this.p.d);
        ((TextView)this.findViewById(2131755436)).setText(this.p.e);
        this.s = (TextView)this.findViewById(2131755437);
        com.google.android.finsky.bg.ae.a(this.s, this.p.f);
    }

    protected void onPause() {
        this.o.a(0);
        super.onPause();
    }

    protected void onStart() {
        super.onStart();
        this.o = (com.google.android.finsky.billing.changesubscriptionprice.b)this.H_().a("ChangeSubscriptionPriceActivity.sidecar");
        if (this.o == 0) {
            this.o = com.google.android.finsky.billing.changesubscriptionprice.b.a(this.B, this.q.d());
            this.H_().a().a(this.o, "ChangeSubscriptionPriceActivity.sidecar").c();
        }
        this.o.a(this);
    }

}

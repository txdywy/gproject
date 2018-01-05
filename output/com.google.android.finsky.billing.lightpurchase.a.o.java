package com.google.android.finsky.billing.lightpurchase.a;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.g;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.h;
import com.google.wireless.android.finsky.a.a.ac;
import com.google.wireless.android.finsky.a.a.ag;
import com.google.wireless.android.finsky.a.a.x;

public final class com.google.android.finsky.billing.lightpurchase.a.o extends com.google.android.finsky.billing.common.g implements View$OnClickListener
{

    public com.google.wireless.android.finsky.a.a.ag e;
    public EditText f;
    public View g;
    public PlayActionButtonV2 h;
    public PlayActionButtonV2 i;

    o() {
        com.google.android.finsky.billing.common.g();
    }

    private final com.google.android.finsky.billing.lightpurchase.a.q Y() {
        if (this.r instanceof com.google.android.finsky.billing.lightpurchase.a.q)
            v0 = (com.google.android.finsky.billing.lightpurchase.a.q)this.r;
        else {
            if (this.F instanceof com.google.android.finsky.billing.lightpurchase.a.q) {
                v0 = (com.google.android.finsky.billing.lightpurchase.a.q)this.F;
                return v0;
            }
            if (!(this.h() instanceof com.google.android.finsky.billing.lightpurchase.a.q))
                throw new IllegalStateException("No listener registered.");
            v0 = (com.google.android.finsky.billing.lightpurchase.a.q)this.h();
        }
        return v0;
    }

    protected final int W() {
        return 1403;
    }

    final void X() {
        if (!com.google.android.finsky.utils.h.a(this.f.getText()))
            v0 = 1;
        else
            v0 = 0;
        this.i.setEnabled(v0);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.g = p0.inflate(2130968634, p1, 0);
        if (TextUtils.isEmpty(this.e.b))
            throw new IllegalStateException("No title returned");
        ((TextView)this.g.findViewById(2131755114)).setText(this.e.b);
        v0 = (TextView)this.g.findViewById(2131755312);
        if (!TextUtils.isEmpty(this.e.c))
            v0.setText(Html.fromHtml(this.e.c));
        else
            v0.setVisibility(8);
        this.f = (EditText)this.g.findViewById(2131755353);
        com.google.android.finsky.bg.ae.a(this.h(), this.f, 6, 6);
        if (this.e.d == 0)
            throw new IllegalStateException("No SMS code field returned.");
        if (!TextUtils.isEmpty(this.e.d.d))
            this.f.setHint(this.e.d.d);
        if (!TextUtils.isEmpty(this.e.d.c))
            this.f.setText(this.e.d.c);
        this.f.addTextChangedListener(new com.google.android.finsky.billing.lightpurchase.a.p(this));
        v0 = (TextView)this.g.findViewById(2131755354);
        if (!TextUtils.isEmpty(this.e.d.e))
            v0.setText(this.e.d.e);
        else
            v0.setVisibility(8);
        v1 = this.q.getInt("SmsCodeFragment.backend");
        this.i = (PlayActionButtonV2)this.g.findViewById(2131755405);
        if (this.e.f != 0 && !TextUtils.isEmpty(this.e.f.b)) {
            this.i.a(v1, this.e.f.b, this);
            this.h = (PlayActionButtonV2)this.g.findViewById(2131755404);
            if (this.e.e != 0 && !TextUtils.isEmpty(this.e.e.b))
                this.h.a(v1, this.e.e.b, this);
            else
                this.h.setVisibility(8);
            this.X();
            return this.g;
        }
        throw new IllegalStateException("No submit button returned.");
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.e = (com.google.wireless.android.finsky.a.a.ag)ParcelableProto.a(this.q, "SmsCodeFragment.challenge");
    }

    public final void onClick(View p0) {
        if (p0 == this.h) {
            this.a(1405);
            this.Y().a(this.e.e.c);
        }
        else if (p0 == this.i) {
            this.a(1408);
            this.Y().a(this.e.f.c, this.e.d.f, this.f.getText().toString());
        }
    }

    public final void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.g.getContext(), this.e.b, this.g, 0);
    }

}

package com.google.android.finsky.billing.lightpurchase.a;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.billing.common.g;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.n;
import com.google.wireless.android.finsky.a.a.x;

public final class com.google.android.finsky.billing.lightpurchase.a.j extends com.google.android.finsky.billing.common.g implements View$OnClickListener
{

    public com.google.wireless.android.finsky.a.a.n e;
    public View f;
    public PlayActionButtonV2 g;
    public PlayActionButtonV2 h;

    j() {
        com.google.android.finsky.billing.common.g();
    }

    private final com.google.android.finsky.billing.lightpurchase.a.k X() {
        if (this.r instanceof com.google.android.finsky.billing.lightpurchase.a.k)
            v0 = (com.google.android.finsky.billing.lightpurchase.a.k)this.r;
        else {
            if (this.F instanceof com.google.android.finsky.billing.lightpurchase.a.k) {
                v0 = (com.google.android.finsky.billing.lightpurchase.a.k)this.F;
                return v0;
            }
            if (!(this.h() instanceof com.google.android.finsky.billing.lightpurchase.a.k))
                throw new IllegalStateException("No listener registered.");
            v0 = (com.google.android.finsky.billing.lightpurchase.a.k)this.h();
        }
        return v0;
    }

    protected final int W() {
        return 1406;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.f = p0.inflate(2130968631, p1, 0);
        if (TextUtils.isEmpty(this.e.b))
            throw new IllegalStateException("No title returned.");
        ((TextView)this.f.findViewById(2131755114)).setText(this.e.b);
        v0 = (TextView)this.f.findViewById(2131755334);
        if (!TextUtils.isEmpty(this.e.c))
            v0.setText(Html.fromHtml(this.e.c));
        else
            v0.setVisibility(8);
        v1 = this.q.getInt("ChallengeErrorFragment.backend");
        this.h = (PlayActionButtonV2)this.f.findViewById(2131755405);
        if (this.e.d != 0 && !TextUtils.isEmpty(this.e.d.b)) {
            this.h.a(v1, this.e.d.b, this);
            this.g = (PlayActionButtonV2)this.f.findViewById(2131755404);
            if (this.e.e != 0 && !TextUtils.isEmpty(this.e.e.b))
                this.g.a(v1, this.e.e.b, this);
            else
                this.g.setVisibility(8);
            return this.f;
        }
        throw new IllegalStateException("No submit button returned.");
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.e = (com.google.wireless.android.finsky.a.a.n)ParcelableProto.a(this.q, "ChallengeErrorFragment.challenge");
    }

    public final void onClick(View p0) {
        if (p0 == this.h) {
            this.a(1407);
            if (this.e.d.d != 0)
                this.X().W();
            else {
                if (this.e.d.e.length != 1)
                    throw new IllegalStateException("Unexpected submit button action.");
                this.X().a(this.e.d.e[0]);
            }
        }
        else {
            if (p0 != this.g)
                return;
            this.a(1409);
            if (this.e.e.d == 0)
                throw new IllegalStateException("Unexpected cancel button action.");
            this.X().W();
        }
    }

    public final void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.f.getContext(), this.e.b, this.f, 0);
    }

}

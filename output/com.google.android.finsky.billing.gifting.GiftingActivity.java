package com.google.android.finsky.billing.gifting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.jl;
import com.google.android.finsky.cv.a.jp;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.ParcelableProto;

public class GiftingActivity extends com.google.android.finsky.billing.common.h implements com.google.android.finsky.billing.common.t
{

    public com.google.android.finsky.billing.gifting.b n;
    public boolean o;
    public int p;
    public int q;
    public View r;
    public ProgressBar s;
    public FrameLayout t;
    public SendGiftLayout u;
    public ViewGroup v;
    public PlayActionButtonV2 w;

    GiftingActivity() {
        com.google.android.finsky.billing.common.h();
    }

    private final void a(View p0) {
        this.t.removeAllViews();
        this.t.addView(p0);
        this.w.setVisibility(0);
        this.r.setVisibility(0);
        this.s.setVisibility(4);
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        if (!(p0 instanceof com.google.android.finsky.billing.gifting.b)) {
            v0 = String.valueOf(p0.getClass().getName());
            if (v0.length() != 0)
                v0 = "Unexpected sidecar: ".concat(v0);
            else
                v0 = new String("Unexpected sidecar: ");
            throw new IllegalStateException(v0);
        }
        switch (this.n.l) {
            case 0:
                break;
            case 1:
                if (this.n.af == 1) {
                    this.E.a(new com.google.android.finsky.d.p().b(this).a(5552));
                    this.u.a(this, this.n.f, this.p, this.q);
                    this.w.a(this.p, this.n.f.f, new com.google.android.finsky.billing.gifting.c(this));
                    this.a(this.u);
                }
                else {
                    this.t.removeAllViews();
                    this.w.setVisibility(4);
                    this.r.setVisibility(0);
                    this.s.setVisibility(0);
                }
                break;
            case 2:
                this.startActivityForResult(this.n.W(), 1);
                this.o = 1;
                break;
            case 3:
                this.E.a(new com.google.android.finsky.d.p().b(this).a(5554));
                ((TextView)this.v.findViewById(2131755114)).setText(this.n.c(this));
                ((TextView)this.v.findViewById(2131755334)).setText(this.n.b(this));
                this.w.a(this.p, this.getString(2131952688), new com.google.android.finsky.billing.gifting.d(this));
                this.a(this.v);
                break;
            default:
                throw new IllegalStateException(37 + "Unknown GiftSidecar state:" + this.n.l);
        }
    }

    protected final int f() {
        return 5551;
    }

    public final void onActivityResult(int p0, int p1, Intent p2) {
        switch (p0) {
            case 1:
                this.finish();
                return;
            default:
                break;
        }
        throw new IllegalStateException(31 + "Unknown requestCode " + p0);
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130968961);
        v1 = this.getLayoutInflater();
        this.u = (SendGiftLayout)v1.inflate(2130969376, 0);
        this.v = (ViewGroup)v1.inflate(2130969070, 0);
        this.r = this.findViewById(2131755313);
        this.w = (PlayActionButtonV2)this.findViewById(2131755791);
        this.t = (FrameLayout)this.findViewById(2131756033);
        this.s = (ProgressBar)this.findViewById(2131755380);
        v0 = this.getIntent();
        this.p = v0.getIntExtra("GiftingActivity.backend", 0);
        this.q = v0.getIntExtra("GiftingActivity.documentType", 7);
        if (p0 != 0)
            this.o = p0.getBoolean("GiftingActivity.isGiftingComplete");
    }

    public void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putBoolean("GiftingActivity.isGiftingComplete", this.o);
    }

    public void onStart() {
        super.onStart();
        this.n = (com.google.android.finsky.billing.gifting.b)this.H_().a(2131755313);
        if (this.n == 0) {
            this.n = com.google.android.finsky.billing.gifting.b.a((com.google.android.finsky.cv.a.jl)ParcelableProto.a(this.getIntent(), "GiftingActivity.action"), this.B, this.E);
            this.H_().a().a(2131755313, this.n).c();
        }
        if (this.o == 0)
            this.n.a(this);
    }

    public void onStop() {
        super.onStop();
        if (this.n != 0)
            this.n.a(0);
    }

}

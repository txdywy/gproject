package com.google.android.finsky.billing.profile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.u;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.common.q;
import com.google.android.finsky.billing.payments.InstrumentManagerActivity;
import com.google.android.finsky.cv.a.ak;
import com.google.android.finsky.cv.a.al;
import com.google.android.finsky.cv.a.am;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;

protected class CatchAbandonmentActivity extends com.google.android.finsky.billing.common.h implements View$OnClickListener
{

    public com.google.android.finsky.billing.common.m n;
    public com.google.android.finsky.billing.common.q o;
    public com.google.android.finsky.bg.l p;
    public final com.google.android.finsky.d.ad q;
    public com.google.android.finsky.cv.a.am r;
    public PurchaseFlowConfig s;
    public int t;

    CatchAbandonmentActivity() {
        com.google.android.finsky.billing.common.h();
        this.q = new com.google.android.finsky.d.o(700);
    }

    public static Intent a(Context p0, com.google.android.finsky.cv.a.am p1, int p2, String p3, PurchaseFlowConfig p4, com.google.android.finsky.d.w p5) {
        if (p1 == 0)
            throw new IllegalArgumentException("CatchAbandonmentDialog is required");
        if (p3 == 0)
            throw new IllegalArgumentException("account name is required");
        v0 = new Intent(p0, CatchAbandonmentActivity);
        CatchAbandonmentActivity.a(v0, p3);
        v0.putExtra("LoggingFragmentActivity.serverLogsCookie", p1.j);
        v0.putExtra("CatchAbandonmentActivity.catchAbandonmentDialogData", ParcelableProto.a(p1));
        v0.putExtra("CatchAbandonmentActivity.backendId", p2);
        com.google.android.finsky.billing.common.m.a(v0, p4);
        p5.b(p3).a(v0);
        return v0;
    }

    private final void a(com.google.android.finsky.cv.a.al p0) {
        if (p0 == 0)
            this.finish();
        else {
            if (p0.a == 0)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                if (p0.a == 0)
                    v0 = p0.b;
                else
                    v0 = "";
                this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(v0)));
            }
            else if (p0.a == 1) {
                v0 = p0.aE_();
                this.startActivityForResult(InstrumentManagerActivity.a(this, this.B, v0.b, v0.c, Bundle.EMPTY, this.E, this.t), 1);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent p0) {
        v0 = new Rect();
        this.getWindow().getDecorView().getHitRect(v0);
        if (p0.getAction() == 0 && !v0.contains((int)p0.getX(), (int)p0.getY()))
            this.E.b(new com.google.android.finsky.d.d(this).a(601).a(this.C));
        return super.dispatchTouchEvent(p0);
    }

    protected final int f() {
        return 1360;
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return this.q;
    }

    public final void onActivityResult(int p0, int p1, Intent p2) {
        if (p1 == -1) {
            v0 = this.r.f.aE_().d;
            if (p0 == 1) {
                this.setResult(-1);
                this.E.a(new com.google.android.finsky.d.c(328).d(8).a(this.r.j));
                if (TextUtils.isEmpty(v0))
                    this.finish();
                else {
                    this.startActivity(this.o.a(this.B, 10, v0, this.E));
                    this.finish();
                }
            }
        }
        super.onActivityResult(p0, p1, p2);
    }

    public void onClick(View p0) {
        if (p0 == this.findViewById(2131755791)) {
            this.E.b(new com.google.android.finsky.d.d(this).a(1361).a(this.C));
            this.a(this.r.f);
        }
        else if (p0 == this.findViewById(2131755776)) {
            this.E.b(new com.google.android.finsky.d.d(this).a(1362).a(this.C));
            this.a(this.r.g);
        }
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        ((com.google.android.finsky.billing.profile.l)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.profile.l)).a(this);
        this.setContentView(2130968680);
        v1 = this.getIntent();
        this.r = (com.google.android.finsky.cv.a.am)ParcelableProto.a(v1, "CatchAbandonmentActivity.catchAbandonmentDialogData");
        v2 = v1.getIntExtra("CatchAbandonmentActivity.backendId", 0);
        this.t = v2;
        this.s = com.google.android.finsky.billing.common.m.a(v1);
        v1 = new Bundle();
        this.n.b(v1, this.s);
        v3 = (TextView)this.findViewById(2131755114);
        v3.setText(this.r.b);
        com.google.android.finsky.bg.a.a(this, v3.getText(), v3, 0);
        v4 = (TextView)this.findViewById(2131755312);
        com.google.android.finsky.bg.ae.a(v4, this.r.c);
        ((PlayActionButtonV2)this.findViewById(2131755791)).a(v2, this.r.d, this);
        if (!TextUtils.isEmpty(this.r.e)) {
            v0 = (PlayActionButtonV2)this.findViewById(2131755776);
            v0.a(v2, this.r.e, this);
            v0.setVisibility(0);
        }
        if (this.r.h != 0) {
            v0 = (FifeImageView)this.findViewById(2131755424);
            v0.setContentDescription(this.r.i);
            this.p.a(v0, this.r.h, -1);
        }
        this.n.a(v1, this.findViewById(2131755423), v3, v4, 0, 0, 0, 0);
    }

}

package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.finsky.as.b;
import com.google.android.finsky.as.e;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.PurchaseError;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.iab.w;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.e.ae;
import com.google.android.finsky.br.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.flushlogs.a;
import com.google.android.finsky.m;
import com.google.android.finsky.recoverymode.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.redirect.b;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;

protected class PurchaseActivity extends android.support.v7.app.aa implements com.google.android.finsky.billing.lightpurchase.ap, com.google.android.finsky.d.ad, com.google.android.gms.f.b
{

    public com.google.wireless.android.a.a.a.a.ce A;
    public final com.google.android.finsky.d.a q;
    public final com.google.android.finsky.as.b r;
    public final Rect s;
    public com.google.android.finsky.billing.iab.w t;
    public PurchaseParams u;
    public Account v;
    public com.google.android.finsky.d.w w;
    public Intent x;
    public int y;
    public Bundle z;

    PurchaseActivity() {
        android.support.v7.app.aa();
        this.q = com.google.android.finsky.m.a.aR();
        this.r = com.google.android.finsky.m.a.Q();
        this.s = new Rect();
        this.t = com.google.android.finsky.m.a.aE();
    }

    public static Intent a(Account p0, PurchaseParams p1, byte[] p2, Bundle p3) {
        v0 = new Intent(com.google.android.finsky.m.a.b, PurchaseActivity);
        v0.putExtra("PurchaseActivity.account", p0);
        v0.putExtra("PurchaseActivity.params", p1);
        v0.putExtra("PurchaseActivity.appDownloadSizeWarningArgs", p3);
        v0.putExtra("PurchaseActivity.serverLogsCookie", p2);
        return v0;
    }

    public static Intent a(Account p0, PurchaseParams p1, byte[] p2, Bundle p3, com.google.android.finsky.d.w p4) {
        if (p1 != 0 && p1.a != 0 && p1.a.c == 11 && com.google.android.finsky.m.a.j(p0.name).a(12640666))
            v0 = com.google.android.finsky.m.a.bo().a(p0, com.google.android.finsky.m.a.b, com.google.android.finsky.m.a.j(p0.name), 0, p4, p1, 0, 0, 1);
        else {
            v0 = PurchaseActivity.a(p0, p1, p2, p3);
            p4.a(p0).a(v0);
        }
        return v0;
    }

    private final void a(int p0, String p1) {
        v0 = this.l();
        if (v0 == 0) {
            this.y = 0;
            this.finish();
            return;
        }
        if (v0.ax instanceof com.google.android.finsky.billing.lightpurchase.e.ae)
            v0 = 0;
        else if (v0.c != 0) {
            if (v0.c.l == 7 || v0.c.l == 12) {
                if (p0 != 1)
                    v0 = 0;
                else
                    v0 = 1;
            }
            else if (v0.c.l == 1 && v0.c.af == 2)
                v0 = 0;
            else if (v0.c.l == 5) {
                if (p0 == 1) {
                    if (v0.c.aw != 0) {
                        v0.c.a(0);
                        v0 = 0;
                    }
                    else
                        v0 = 1;
                }
                else
                    v0 = 1;
            }
            else
                v0 = 1;
        }
        else
            v0 = 1;
        if (v0 != 0) {
            this.y = 0;
            this.finish();
        }
        else {
            v2 = new Object[1];
            v2[0] = p1;
            FinskyLog.a("PurchaseFragment not dismissable by %s, ignore.", v2);
        }
    }

    private final void o() {
        FinskyLog.a("Purchase fragment null.", new Object[0]);
        super.finish();
    }

    public final void a(int p0, Intent p1) {
    }

    protected void a(com.google.android.finsky.billing.lightpurchase.am p0) {
        if (p0.ak != 0) {
            this.x = new Intent();
            if (p0.c == 0)
                v0 = 0;
            else
                v0 = p0.c.ao;
            if (v0 != 0)
                this.x.putExtra("PurchaseActivity.topupResult", ParcelableProto.a(v0));
            this.x.putExtra("PurchaseActivity.postSuccessItemOpened", p0.am);
            this.y = -1;
            if (this.u.a.c == 11)
                this.t.a(this, com.google.android.finsky.dfemodel.q.a(this.u.a.b));
        }
        else if (p0.aj != 0) {
            v2 = new Object[2];
            v2[0] = Integer.valueOf(p0.aj.a);
            v2[1] = Integer.valueOf(p0.aj.b);
            FinskyLog.d("Purchase failed: %d / %d", v2);
            this.y = 0;
        }
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    public final void cS_() {
    }

    public boolean dispatchTouchEvent(MotionEvent p0) {
        this.getWindow().getDecorView().getHitRect(this.s);
        if (p0.getAction() == 0 && !this.s.contains((int)p0.getX(), (int)p0.getY())) {
            this.m().b(new com.google.android.finsky.d.d(this).a(601));
            this.a(2, "click outside");
        }
        return super.dispatchTouchEvent(p0);
    }

    public void finish() {
        v0 = this.l();
        if (v0 != 0) {
            this.m().a(new com.google.android.finsky.d.p().a(603).b(this));
            this.a(v0);
        }
        else
            FinskyLog.a("Purchase fragment null.", new Object[0]);
        if (this.x == 0)
            this.x = new Intent();
        this.m().a(this.x);
        this.setResult(this.y, this.x);
        super.finish();
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.A;
    }

    protected void k() {
        this.y = 0;
    }

    final com.google.android.finsky.billing.lightpurchase.am l() {
        return (com.google.android.finsky.billing.lightpurchase.am)this.H_().a(2131755313);
    }

    protected final com.google.android.finsky.d.w m() {
        v0 = this.l();
        if (v0 == 0)
            v0 = this.w;
        else
            v0 = v0.aJ;
        return v0;
    }

    public final void n() {
        this.finish();
    }

    public void onBackPressed() {
        this.m().b(new com.google.android.finsky.d.d(this).a(600));
        this.a(1, "back press");
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        v0 = com.google.android.finsky.m.a.bK();
        if (v0.b()) {
            v0.f();
            this.o();
        }
        else {
            v1 = this.getIntent();
            this.setContentView(this.getLayoutInflater().inflate(2130969060, 0));
            this.v = (Account)v1.getParcelableExtra("PurchaseActivity.account");
            if (this.w == 0)
                this.w = this.q.a(p0, v1);
            this.u = (PurchaseParams)v1.getParcelableExtra("PurchaseActivity.params");
            this.z = v1.getBundleExtra("PurchaseActivity.appDownloadSizeWarningArgs");
            this.A = com.google.android.finsky.d.j.a(700);
            this.A.e = new com.google.wireless.android.a.a.a.a.cf();
            this.A.e.a(this.u.b);
            this.A.e.a(this.u.d);
            com.google.android.finsky.d.j.a(this.A, v1.getByteArrayExtra("PurchaseActivity.serverLogsCookie"));
            if (p0 != 0) {
                this.y = p0.getInt("PurchaseActivity.resultCode");
                this.x = (Intent)p0.getParcelable("PurchaseActivity.resultData");
            }
            if (com.google.android.finsky.m.a.dj().a(12610657))
                com.google.android.wallet.redirect.b.a(this.getApplicationContext(), this);
            if (!com.google.android.finsky.m.a.O().a()) {
                this.startActivity(com.google.android.finsky.m.a.bo().e(this));
                this.o();
            }
        }
    }

    protected void onPause() {
        super.onPause();
        com.google.android.finsky.m.a.aX().a();
    }

    protected void onResume() {
        super.onResume();
        com.google.android.finsky.m.a.aX().c();
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        this.w.a(p0);
        p0.putParcelable("PurchaseActivity.resultData", this.x);
        p0.putInt("PurchaseActivity.resultCode", this.y);
    }

    protected void onStart() {
        super.onStart();
        this.r.a(new com.google.android.finsky.billing.lightpurchase.al(this));
    }

}

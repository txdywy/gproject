package com.google.android.finsky.activities.inlineappinstaller;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.finsky.api.l;
import com.google.android.finsky.br.a;
import com.google.android.finsky.br.b;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.p;

protected class InlineConsumptionAppInstallerActivity extends android.support.v7.app.aa implements com.google.android.finsky.activities.inlineappinstaller.b, com.google.android.finsky.d.ah
{

    public final com.google.android.finsky.d.a q;
    public final Rect r;
    public Account s;
    public com.google.android.finsky.cv.a.cv t;
    public boolean u;
    public com.google.android.finsky.d.w v;

    InlineConsumptionAppInstallerActivity() {
        android.support.v7.app.aa();
        this.q = com.google.android.finsky.m.a.aR();
        this.r = new Rect();
    }

    private final void c(int p0) {
        this.v.b(new com.google.android.finsky.d.d(this).a(p0));
    }

    private final void k() {
        this.setResult(0);
        this.finish();
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    public final void b(boolean p0) {
        this.u = p0;
        if (this.u != 0)
            com.google.android.finsky.m.a.bn().a(this, this.s, new Document(this.t), this.H_(), 0, 2, 0);
        this.finish();
    }

    public boolean dispatchTouchEvent(MotionEvent p0) {
        this.getWindow().getDecorView().getHitRect(this.r);
        if (p0.getAction() == 0 && !this.r.contains((int)p0.getX(), (int)p0.getY())) {
            this.c(601);
            this.k();
        }
        return super.dispatchTouchEvent(p0);
    }

    public void finish() {
        v0 = (com.google.android.finsky.activities.inlineappinstaller.a)this.H_().a(2131755313);
        if (v0 != 0) {
            if (this.u != 0)
                this.setResult(-1);
            else {
                if (v0.f != 0)
                    this.startActivity(com.google.android.finsky.m.a.bo().a(this, com.google.android.finsky.api.l.a(com.google.android.finsky.m.a.bn().a(this.t.f)), this.v));
                this.setResult(0);
            }
            this.v.a(new com.google.android.finsky.d.p().a(603).b(this));
        }
        super.finish();
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return com.google.android.finsky.d.j.a(5100);
    }

    public final void m() {
    }

    public final com.google.android.finsky.d.w n() {
        return this.v;
    }

    public final void o_() {
        FinskyLog.e("Not using impression id's.", new Object[0]);
    }

    public void onBackPressed() {
        this.c(600);
        this.k();
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(this.getLayoutInflater().inflate(2130969060, 0));
        v1 = this.getIntent();
        this.s = (Account)v1.getParcelableExtra("account");
        com.google.android.finsky.m.a.a(this.s);
        this.v = this.q.a(p0, v1).a(this.s);
        this.t = (com.google.android.finsky.cv.a.cv)ParcelableProto.a(v1, "mediaDoc");
        v0 = (com.google.wireless.android.finsky.dfe.nano.p)ParcelableProto.a(v1, "successInfo");
        if (p0 == 0) {
            this.v.a(new com.google.android.finsky.d.p().b(this));
            v1 = this.H_().a();
            v1.a(2131755313, com.google.android.finsky.activities.inlineappinstaller.a.a(this.s, this.t, v0));
            v1.c();
        }
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        this.v.a(p0);
    }

}

package com.google.android.finsky.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.support.v4.app.cr;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.api.l;
import com.google.android.finsky.api.m;
import com.google.android.finsky.at.k;
import com.google.android.finsky.aw.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.p;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ce.a;
import com.google.android.finsky.cj.c;
import com.google.android.finsky.ck.a;
import com.google.android.finsky.cq.d;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.flushlogs.a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.m;
import com.google.android.finsky.permissionui.AppSecurityPermissions;
import com.google.android.finsky.permissionui.a;
import com.google.android.finsky.permissionui.d;
import com.google.android.finsky.permissionui.e;
import com.google.android.finsky.permissionui.f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.x.a;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.k;
import com.google.wireless.android.a.a.a.a.ce;

protected class AppsPermissionsActivity extends android.support.v7.app.aa implements View$OnClickListener, com.android.volley.w, com.google.android.finsky.at.m, com.google.android.finsky.d.ah, com.google.android.finsky.dfemodel.w
{

    public final com.google.wireless.android.a.a.a.a.ce A;
    public com.google.android.finsky.d.w B;
    public final com.google.android.finsky.d.a q;
    public Document r;
    public AppSecurityPermissions s;
    public Bundle t;
    public com.google.android.finsky.dfemodel.i u;
    public Intent v;
    public String w;
    public String x;
    public boolean y;
    public boolean z;

    AppsPermissionsActivity() {
        android.support.v7.app.aa();
        this.q = com.google.android.finsky.m.a.aR();
        com.google.android.finsky.m.a.bD();
        com.google.android.finsky.m.a.aO();
        this.A = com.google.android.finsky.d.j.a(790);
    }

    private final void a(String p0) {
        v0 = new com.google.android.finsky.at.k();
        v0.a(p0).d(2131952688);
        v0.a().a(this.H_(), "AppsPermissionsActivity.errorDialog");
    }

    private final void c(int p0) {
        this.B.a(new com.google.android.finsky.d.p().a(p0).b(this));
    }

    private final void o() {
        this.v = new Intent();
        this.v.putExtra("AppsPermissionsActivity.doc", this.r);
        this.v.putExtra("AppsPermissionsActivity.appVersion", this.r.N().c);
        this.v.putExtra("AppsPermissionsActivity.appTitle", this.r.a.g);
        v6 = com.google.android.finsky.m.a.q();
        if (com.google.android.finsky.m.a.dj().a(12610205))
            v2 = com.google.android.finsky.m.a.d().c(this.r);
        else
            v2 = com.google.android.finsky.cj.c.a(this.r.N());
        if (this.r.N() != 0 && v6.d() && v6.e > 0 && v2 >= v6.e) {
            if (v2 < v6.f)
                v0 = 1;
            else
                v0 = 0;
            v0 = com.google.android.finsky.billing.p.a(v0, v6.a());
        }
        else
            v0 = 0;
        this.v.putExtra("AppsPermissionsActivity.appDownloadSizeWarningArguments", v0);
        this.v.putExtra("AppsPermissionsActivity.acceptedNewBuckets", 1);
        this.finish();
    }

    private final void p() {
        v7 = 0;
        if (com.google.android.finsky.m.a.bv().a(this.r))
            this.a(this.getString(2131951696));
        else if (this.y == 0) {
            if (!com.google.android.finsky.m.a.Y().a(this.r, com.google.android.finsky.m.a.dn(), com.google.android.finsky.m.a.ah().a(com.google.android.finsky.m.a.U().b(this.w))))
                this.a(com.google.android.finsky.m.a.ax().a(this.r));
            else if (com.google.android.play.utils.k.d(this))
                this.o();
            else if (Build$VERSION.SDK_INT >= 23) {
                if (this.r.ai() >= 23) {
                    if (this.z == 0)
                        this.o();
                    else {
                        this.findViewById(2131756070).setVisibility(0);
                        this.findViewById(2131755388).setVisibility(8);
                        v5 = this.r.N().g;
                        ((TextView)this.findViewById(2131755114)).setText(this.r.a.g);
                        v8 = (TextView)this.findViewById(2131755755);
                        v8.setVisibility(0);
                        v0 = (FifeImageView)this.findViewById(2131755855);
                        com.google.android.finsky.m.a.bR();
                        v1 = com.google.android.finsky.bg.af.a(this.r, v0.getWidth(), v0.getHeight(), DocImageView.a);
                        if (v1 != 0) {
                            com.google.android.finsky.m.a.ar().a(v0, v1.f, v1.i);
                            v0.setVisibility(0);
                        }
                        else
                            v0.setVisibility(8);
                        v0 = (TextView)this.findViewById(2131756200);
                        if (this.y != 0) {
                            if (this.t == 0) {
                                com.google.android.finsky.d.j.a(this.A, this.r.a.D);
                                this.c(793);
                            }
                            if (Build$VERSION.SDK_INT >= 23) {
                                v2 = (String)com.google.android.finsky.aa.b.B.b();
                                v1 = 2131952043;
                            }
                            else {
                                v2 = (String)com.google.android.finsky.aa.b.A.b();
                                v1 = 2131952044;
                            }
                            this.findViewById(2131756143).setVisibility(8);
                            if (!TextUtils.isEmpty(v2)) {
                                v10 = new Object[2];
                                v10[0] = this.r.a.g;
                                v10[1] = v2;
                                v0.setText(Html.fromHtml(this.getResources().getString(v1, v10)));
                                v0.setOnClickListener(new com.google.android.finsky.activities.a(this, v2));
                                v0.setVisibility(0);
                            }
                            else
                                v0.setVisibility(8);
                            if (Build$VERSION.SDK_INT >= 23 && this.r.ai() >= 23)
                                v6 = 1;
                            else
                                v6 = 0;
                            v1 = com.google.android.finsky.m.a.bU();
                            v0 = new com.google.android.finsky.permissionui.d(this, v1.b, v1.a, this.r.a.d, v5, v6);
                            v1 = this.r.N().d;
                            if (v6 != 0) {
                                v4 = new Object[1];
                                v4[0] = v1;
                                v8.setText(this.getResources().getString(2131953378, v4));
                            }
                            else {
                                v4 = new Object[1];
                                v4[0] = v1;
                                v8.setText(this.getResources().getString(2131953377, v4));
                            }
                        }
                        else {
                            if (this.t == 0) {
                                com.google.android.finsky.d.j.a(this.A, this.r.a.D);
                                this.c(791);
                            }
                            v0.setVisibility(8);
                            if (Build$VERSION.SDK_INT >= 23 && this.r.ai() >= 23)
                                v7 = 1;
                            v6 = com.google.android.finsky.m.a.aV().b(com.google.android.finsky.m.a.c(), this.r.a.d);
                            v1 = com.google.android.finsky.m.a.bU().a(this, this.r.a.d, v5, v6, v7);
                            if (com.google.android.finsky.m.a.dj().a(12622374) && !v1.b())
                                this.o();
                            if (v7 != 0)
                                v0 = 2131952485;
                            else if (v1.a() && v6 != 0)
                                v0 = 2131951695;
                            else
                                v0 = 2131952597;
                            v8.setText(v0);
                            v0 = (PlayActionButtonV2)this.findViewById(2131755791);
                            v0.a(3, this.x, this);
                            v0.setEnabled(1);
                            v0 = v1;
                        }
                        this.s.a(v0, this.r.a.g);
                        this.s.requestFocus();
                    }
                }
                else {
                    this.findViewById(2131756070).setVisibility(0);
                    this.findViewById(2131755388).setVisibility(8);
                    v5 = this.r.N().g;
                    ((TextView)this.findViewById(2131755114)).setText(this.r.a.g);
                    v8 = (TextView)this.findViewById(2131755755);
                    v8.setVisibility(0);
                    v0 = (FifeImageView)this.findViewById(2131755855);
                    com.google.android.finsky.m.a.bR();
                    v1 = com.google.android.finsky.bg.af.a(this.r, v0.getWidth(), v0.getHeight(), DocImageView.a);
                    if (v1 != 0) {
                        com.google.android.finsky.m.a.ar().a(v0, v1.f, v1.i);
                        v0.setVisibility(0);
                    }
                    else
                        v0.setVisibility(8);
                    v0 = (TextView)this.findViewById(2131756200);
                    if (this.y != 0) {
                        if (this.t == 0) {
                            com.google.android.finsky.d.j.a(this.A, this.r.a.D);
                            this.c(793);
                        }
                        if (Build$VERSION.SDK_INT >= 23) {
                            v2 = (String)com.google.android.finsky.aa.b.B.b();
                            v1 = 2131952043;
                        }
                        else {
                            v2 = (String)com.google.android.finsky.aa.b.A.b();
                            v1 = 2131952044;
                        }
                        this.findViewById(2131756143).setVisibility(8);
                        if (!TextUtils.isEmpty(v2)) {
                            v10 = new Object[2];
                            v10[0] = this.r.a.g;
                            v10[1] = v2;
                            v0.setText(Html.fromHtml(this.getResources().getString(v1, v10)));
                            v0.setOnClickListener(new com.google.android.finsky.activities.a(this, v2));
                            v0.setVisibility(0);
                        }
                        else
                            v0.setVisibility(8);
                        if (Build$VERSION.SDK_INT >= 23 && this.r.ai() >= 23)
                            v6 = 1;
                        else
                            v6 = 0;
                        v1 = com.google.android.finsky.m.a.bU();
                        v0 = new com.google.android.finsky.permissionui.d(this, v1.b, v1.a, this.r.a.d, v5, v6);
                        v1 = this.r.N().d;
                        if (v6 != 0) {
                            v4 = new Object[1];
                            v4[0] = v1;
                            v8.setText(this.getResources().getString(2131953378, v4));
                        }
                        else {
                            v4 = new Object[1];
                            v4[0] = v1;
                            v8.setText(this.getResources().getString(2131953377, v4));
                        }
                    }
                    else {
                        if (this.t == 0) {
                            com.google.android.finsky.d.j.a(this.A, this.r.a.D);
                            this.c(791);
                        }
                        v0.setVisibility(8);
                        if (Build$VERSION.SDK_INT >= 23 && this.r.ai() >= 23)
                            v7 = 1;
                        v6 = com.google.android.finsky.m.a.aV().b(com.google.android.finsky.m.a.c(), this.r.a.d);
                        v1 = com.google.android.finsky.m.a.bU().a(this, this.r.a.d, v5, v6, v7);
                        if (com.google.android.finsky.m.a.dj().a(12622374) && !v1.b())
                            this.o();
                        if (v7 != 0)
                            v0 = 2131952485;
                        else if (v1.a() && v6 != 0)
                            v0 = 2131951695;
                        else
                            v0 = 2131952597;
                        v8.setText(v0);
                        v0 = (PlayActionButtonV2)this.findViewById(2131755791);
                        v0.a(3, this.x, this);
                        v0.setEnabled(1);
                        v0 = v1;
                    }
                    this.s.a(v0, this.r.a.g);
                    this.s.requestFocus();
                }
            }
            else {
                this.findViewById(2131756070).setVisibility(0);
                this.findViewById(2131755388).setVisibility(8);
                v5 = this.r.N().g;
                ((TextView)this.findViewById(2131755114)).setText(this.r.a.g);
                v8 = (TextView)this.findViewById(2131755755);
                v8.setVisibility(0);
                v0 = (FifeImageView)this.findViewById(2131755855);
                com.google.android.finsky.m.a.bR();
                v1 = com.google.android.finsky.bg.af.a(this.r, v0.getWidth(), v0.getHeight(), DocImageView.a);
                if (v1 != 0) {
                    com.google.android.finsky.m.a.ar().a(v0, v1.f, v1.i);
                    v0.setVisibility(0);
                }
                else
                    v0.setVisibility(8);
                v0 = (TextView)this.findViewById(2131756200);
                if (this.y != 0) {
                    if (this.t == 0) {
                        com.google.android.finsky.d.j.a(this.A, this.r.a.D);
                        this.c(793);
                    }
                    if (Build$VERSION.SDK_INT >= 23) {
                        v2 = (String)com.google.android.finsky.aa.b.B.b();
                        v1 = 2131952043;
                    }
                    else {
                        v2 = (String)com.google.android.finsky.aa.b.A.b();
                        v1 = 2131952044;
                    }
                    this.findViewById(2131756143).setVisibility(8);
                    if (!TextUtils.isEmpty(v2)) {
                        v10 = new Object[2];
                        v10[0] = this.r.a.g;
                        v10[1] = v2;
                        v0.setText(Html.fromHtml(this.getResources().getString(v1, v10)));
                        v0.setOnClickListener(new com.google.android.finsky.activities.a(this, v2));
                        v0.setVisibility(0);
                    }
                    else
                        v0.setVisibility(8);
                    if (Build$VERSION.SDK_INT >= 23 && this.r.ai() >= 23)
                        v6 = 1;
                    else
                        v6 = 0;
                    v1 = com.google.android.finsky.m.a.bU();
                    v0 = new com.google.android.finsky.permissionui.d(this, v1.b, v1.a, this.r.a.d, v5, v6);
                    v1 = this.r.N().d;
                    if (v6 != 0) {
                        v4 = new Object[1];
                        v4[0] = v1;
                        v8.setText(this.getResources().getString(2131953378, v4));
                    }
                    else {
                        v4 = new Object[1];
                        v4[0] = v1;
                        v8.setText(this.getResources().getString(2131953377, v4));
                    }
                }
                else {
                    if (this.t == 0) {
                        com.google.android.finsky.d.j.a(this.A, this.r.a.D);
                        this.c(791);
                    }
                    v0.setVisibility(8);
                    if (Build$VERSION.SDK_INT >= 23 && this.r.ai() >= 23)
                        v7 = 1;
                    v6 = com.google.android.finsky.m.a.aV().b(com.google.android.finsky.m.a.c(), this.r.a.d);
                    v1 = com.google.android.finsky.m.a.bU().a(this, this.r.a.d, v5, v6, v7);
                    if (com.google.android.finsky.m.a.dj().a(12622374) && !v1.b())
                        this.o();
                    if (v7 != 0)
                        v0 = 2131952485;
                    else if (v1.a() && v6 != 0)
                        v0 = 2131951695;
                    else
                        v0 = 2131952597;
                    v8.setText(v0);
                    v0 = (PlayActionButtonV2)this.findViewById(2131755791);
                    v0.a(3, this.x, this);
                    v0.setEnabled(1);
                    v0 = v1;
                }
                this.s.a(v0, this.r.a.g);
                this.s.requestFocus();
            }
        }
        else {
            this.findViewById(2131756070).setVisibility(0);
            this.findViewById(2131755388).setVisibility(8);
            v5 = this.r.N().g;
            ((TextView)this.findViewById(2131755114)).setText(this.r.a.g);
            v8 = (TextView)this.findViewById(2131755755);
            v8.setVisibility(0);
            v0 = (FifeImageView)this.findViewById(2131755855);
            com.google.android.finsky.m.a.bR();
            v1 = com.google.android.finsky.bg.af.a(this.r, v0.getWidth(), v0.getHeight(), DocImageView.a);
            if (v1 != 0) {
                com.google.android.finsky.m.a.ar().a(v0, v1.f, v1.i);
                v0.setVisibility(0);
            }
            else
                v0.setVisibility(8);
            v0 = (TextView)this.findViewById(2131756200);
            if (this.y != 0) {
                if (this.t == 0) {
                    com.google.android.finsky.d.j.a(this.A, this.r.a.D);
                    this.c(793);
                }
                if (Build$VERSION.SDK_INT >= 23) {
                    v2 = (String)com.google.android.finsky.aa.b.B.b();
                    v1 = 2131952043;
                }
                else {
                    v2 = (String)com.google.android.finsky.aa.b.A.b();
                    v1 = 2131952044;
                }
                this.findViewById(2131756143).setVisibility(8);
                if (!TextUtils.isEmpty(v2)) {
                    v10 = new Object[2];
                    v10[0] = this.r.a.g;
                    v10[1] = v2;
                    v0.setText(Html.fromHtml(this.getResources().getString(v1, v10)));
                    v0.setOnClickListener(new com.google.android.finsky.activities.a(this, v2));
                    v0.setVisibility(0);
                }
                else
                    v0.setVisibility(8);
                if (Build$VERSION.SDK_INT >= 23 && this.r.ai() >= 23)
                    v6 = 1;
                else
                    v6 = 0;
                v1 = com.google.android.finsky.m.a.bU();
                v0 = new com.google.android.finsky.permissionui.d(this, v1.b, v1.a, this.r.a.d, v5, v6);
                v1 = this.r.N().d;
                if (v6 != 0) {
                    v4 = new Object[1];
                    v4[0] = v1;
                    v8.setText(this.getResources().getString(2131953378, v4));
                }
                else {
                    v4 = new Object[1];
                    v4[0] = v1;
                    v8.setText(this.getResources().getString(2131953377, v4));
                }
            }
            else {
                if (this.t == 0) {
                    com.google.android.finsky.d.j.a(this.A, this.r.a.D);
                    this.c(791);
                }
                v0.setVisibility(8);
                if (Build$VERSION.SDK_INT >= 23 && this.r.ai() >= 23)
                    v7 = 1;
                v6 = com.google.android.finsky.m.a.aV().b(com.google.android.finsky.m.a.c(), this.r.a.d);
                v1 = com.google.android.finsky.m.a.bU().a(this, this.r.a.d, v5, v6, v7);
                if (com.google.android.finsky.m.a.dj().a(12622374) && !v1.b())
                    this.o();
                if (v7 != 0)
                    v0 = 2131952485;
                else if (v1.a() && v6 != 0)
                    v0 = 2131951695;
                else
                    v0 = 2131952597;
                v8.setText(v0);
                v0 = (PlayActionButtonV2)this.findViewById(2131755791);
                v0.a(3, this.x, this);
                v0.setEnabled(1);
                v0 = v1;
            }
            this.s.a(v0, this.r.a.g);
            this.s.requestFocus();
        }
    }

    public final void a(int p0, Bundle p1) {
        this.finish();
    }

    public final void a(VolleyError p0) {
        this.a(com.google.android.finsky.api.m.a(this, p0));
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    public final void b(int p0, Bundle p1) {
    }

    public final void f_(int p0) {
    }

    public void finish() {
        this.c(603);
        if (this.v == 0) {
            v0 = new Intent();
            this.B.a(v0);
            this.setResult(0, v0);
        }
        else {
            this.B.a(this.v);
            this.setResult(-1, this.v);
        }
        super.finish();
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.A;
    }

    public final void m() {
    }

    public final void m_() {
        this.r = this.u.b();
        if (this.r == 0)
            this.a(this.getString(2131952398));
        else
            this.p();
    }

    public final com.google.android.finsky.d.w n() {
        return this.B;
    }

    public final void o_() {
        FinskyLog.e("Not using impression id's.", new Object[0]);
    }

    public void onClick(View p0) {
        this.B.b(new com.google.android.finsky.d.d(this).a(792));
        this.o();
    }

    protected void onCreate(Bundle p0) {
        this.t = p0;
        super.onCreate(p0);
        this.setContentView(2130969606);
        v1 = this.getIntent();
        this.w = v1.getStringExtra("AppsPermissionsActivity.accountName");
        this.y = v1.getBooleanExtra("AppsPermissionsActivity.showDetailedPermissions", 0);
        this.z = v1.getBooleanExtra("AppsPermissionsActivity.alwaysShowBucketedPermissions", 0);
        v0 = v1.getStringExtra("AppsPermissionsActivity.buttonText");
        if (TextUtils.isEmpty(v0))
            v0 = this.getString(2131951649);
        this.x = v0;
        v4 = v1.getStringExtra("AppsPermissionsActivity.docidStr");
        this.r = (Document)v1.getParcelableExtra("AppsPermissionsActivity.doc");
        this.s = (AppSecurityPermissions)this.findViewById(2131756072);
        if (this.r != 0)
            com.google.android.finsky.d.j.a(this.A, this.r.a.D);
        this.B = this.q.a(p0, v1).b(this.w);
        if (p0 == 0)
            this.B.a(new com.google.android.finsky.d.p().b(this));
        if (com.google.android.finsky.m.a.dj().a(12636164)) {
            if (this.r != 0 && this.r.N() != 0 && this.r.N().g.length != 0)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                this.p();
                return;
            }
        }
        this.findViewById(2131756070).setVisibility(8);
        this.findViewById(2131755388).setVisibility(0);
        this.c(213);
        this.u = new com.google.android.finsky.dfemodel.i(com.google.android.finsky.m.a.b(this.w), com.google.android.finsky.api.l.a(v4), 0, v4, 0);
        this.u.a(this);
        this.u.a(this);
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
        this.B.a(p0);
    }

    protected void onStart() {
        super.onStart();
        if (this.u != 0) {
            this.u.a(this);
            this.u.a(this);
        }
    }

    protected void onStop() {
        if (this.u != 0) {
            this.u.b(this);
            this.u.b(this);
        }
        super.onStop();
    }

}

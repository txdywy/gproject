package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ab;
import android.support.v4.app.cr;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.support.v4.view.ai;
import android.support.v4.view.at;
import android.support.v4.view.s;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.a;
import android.support.v7.app.aa;
import android.support.v7.app.ac;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.android.volley.r;
import com.google.android.finsky.a.c;
import com.google.android.finsky.a.d;
import com.google.android.finsky.a.e;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.at.b;
import com.google.android.finsky.at.k;
import com.google.android.finsky.az.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bb.b;
import com.google.android.finsky.bg.ad;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.common.d;
import com.google.android.finsky.billing.profile.t;
import com.google.android.finsky.billing.profile.u;
import com.google.android.finsky.billing.profile.v;
import com.google.android.finsky.billing.profile.x;
import com.google.android.finsky.bm.a;
import com.google.android.finsky.bm.c;
import com.google.android.finsky.bm.d;
import com.google.android.finsky.bm.e;
import com.google.android.finsky.bm.i;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.bn.c;
import com.google.android.finsky.br.a;
import com.google.android.finsky.br.b;
import com.google.android.finsky.br.c;
import com.google.android.finsky.cf.a.a;
import com.google.android.finsky.cf.a.f;
import com.google.android.finsky.cg.e;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.eu;
import com.google.android.finsky.cv.a.ip;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.g;
import com.google.android.finsky.frameworkviews.LinkTextView;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.l.a;
import com.google.android.finsky.l.b;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.layout.actionbar.a;
import com.google.android.finsky.layout.actionbar.f;
import com.google.android.finsky.layout.actionbar.g;
import com.google.android.finsky.layout.actionbar.h;
import com.google.android.finsky.layout.actionbar.m;
import com.google.android.finsky.layout.play.FinskyDrawerLayout;
import com.google.android.finsky.layout.play.z;
import com.google.android.finsky.layoutswitcher.ErrorIndicatorWithNotifyLayout;
import com.google.android.finsky.layoutswitcher.c;
import com.google.android.finsky.layoutswitcher.d;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.d;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.notification.b;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.j;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.r.a;
import com.google.android.finsky.recoverymode.a;
import com.google.android.finsky.stream.a.a;
import com.google.android.finsky.tos.e;
import com.google.android.finsky.uninstall.UninstallManagerActivity;
import com.google.android.finsky.uninstall.UninstallManagerActivityV2;
import com.google.android.finsky.uninstall.az;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.v.b;
import com.google.android.finsky.volley.e;
import com.google.android.libraries.play.entertainment.story.MediaPlayerOverlayView;
import com.google.android.play.dfe.api.d;
import com.google.android.play.drawer.a;
import com.google.android.play.drawer.b;
import com.google.android.play.drawer.g;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.android.play.utils.b.a;
import com.google.android.wallet.ui.common.a;
import com.google.android.youtube.player.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public final class MainActivity extends com.google.android.finsky.activities.b implements com.google.android.finsky.a.c, com.google.android.finsky.at.m, com.google.android.finsky.bm.f, com.google.android.finsky.pagesystem.e, com.google.android.finsky.pagesystem.g, com.google.android.finsky.v.d
{

    public com.google.android.finsky.navigationmanager.a G;
    public Bundle H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public ViewGroup M;
    public FinskyDrawerLayout N;
    public com.google.android.finsky.a.d O;
    public com.google.android.finsky.v.b P;
    public com.google.android.finsky.bm.e Q;
    public MediaPlayerOverlayView R;
    public com.google.android.play.drawer.b S;
    public final com.google.android.finsky.d.t T;
    public com.google.android.finsky.layout.actionbar.a U;
    public boolean V;
    public Menu W;
    public int X;
    public final com.google.android.finsky.notification.b Y;
    public final Runnable Z;
    public com.google.android.finsky.activities.fr aa;
    public com.google.android.finsky.activities.ft ab;
    public android.support.v7.widget.ff ac;
    public VolleyError ad;
    public com.google.android.finsky.cf.a.a ae;
    public final Handler c;
    public final com.google.android.finsky.d.a t;

    MainActivity() {
        com.google.android.finsky.activities.b();
        this.t = com.google.android.finsky.m.a.aR();
        this.K = -1;
        this.L = -1;
        this.c = new Handler();
        this.O = 0;
        com.google.android.finsky.m.a.au();
        this.T = com.google.android.finsky.m.a.aP();
        this.X = 2131755286;
        this.Y = new com.google.android.finsky.activities.eq(this);
        this.Z = new com.google.android.finsky.activities.er();
    }

    private final void I() {
        if (this.v()) {
            v1 = com.google.android.finsky.m.a.aN().dj();
            if (v1.a(12630046) && v1.a(12635663) && this.aa == 0 && this.ab == 0) {
                this.ac = new com.google.android.finsky.bg.ad();
                v3 = com.google.android.finsky.m.a.cn();
                v3.a(this.getResources(), this.ac);
                this.aa = new com.google.android.finsky.activities.fr(this, this.ac);
                v4 = new Integer[4];
                v4[0] = Integer.valueOf(com.google.android.finsky.m.a.h().a(0));
                v4[1] = (Integer)com.google.android.finsky.aa.b.iz.b();
                v4[2] = Integer.valueOf(2130969271);
                v4[3] = Integer.valueOf(5);
                com.google.android.finsky.utils.bb.a(this.aa, v4);
                if (v1.a(12642058)) {
                    this.ab = new com.google.android.finsky.activities.ft(this, this.ac);
                    v1 = new Integer[2];
                    v1[0] = Integer.valueOf(2130968883);
                    v1[1] = Integer.valueOf(v3.a());
                    com.google.android.finsky.utils.bb.a(this.ab, v1);
                }
            }
        }
    }

    private final void J() {
        v0 = new com.google.android.finsky.at.k();
        v0.a(0, 41, 0).a(2131953018).d(2131952688).a(0);
        v0.a().a(this.H_(), "restart_required");
    }

    private final boolean K() {
        v3 = this.G.g();
        if (v3 == 1 || v3 == 17 || v3 == 2 || v3 == 10 || v3 == 3 || v3 == 13 || v3 == 20 || v3 == 27 || v3 == 23 || v3 == 26 || v3 == 29)
            v1 = 1;
        else
            v1 = 0;
        v0 = this.G.k();
        if (v3 == 4 && v0 instanceof com.google.android.finsky.activities.gn && ((com.google.android.finsky.activities.gn)v0).k_.a(((com.google.android.finsky.activities.gn)v0).bF) != 0)
            v1 = 1;
        return v1;
    }

    private final void b(VolleyError p0) {
        if (this.x != 0)
            this.ad = p0;
        else {
            if (!this.G.y())
                this.G.c();
            if (this.z != 0)
                this.T.a(this.C, 1721, -1, "authentication_error");
            v1 = com.google.android.finsky.api.m.c(this, p0);
            v3 = this.findViewById(2131755379);
            v0 = (ErrorIndicatorWithNotifyLayout)this.findViewById(2131756223);
            v5 = new com.google.android.finsky.activities.ey(this);
            if (com.google.android.finsky.m.a.u().a()) {
                if (((Boolean)com.google.android.finsky.aa.a.E.a()).booleanValue())
                    v1 = 1;
                else
                    v1 = 5;
                v0.a(com.google.android.finsky.layoutswitcher.c.a(v1, 1), v5);
                v0.setVisibility(0);
                v3.setVisibility(8);
            }
            else {
                v3.setVisibility(0);
                v0.setVisibility(8);
                v0 = (TextView)v3.findViewById(2131755656);
                v0.setText(v1);
                if (v0 instanceof LinkTextView) {
                    ((LinkTextView)v0).setContentDescription(v1);
                    ((LinkTextView)v0).setMovementMethod(LinkMovementMethod.getInstance());
                }
                v3.findViewById(2131755568).setOnClickListener(v5);
            }
        }
    }

    private final void b(com.google.android.finsky.d.w p0) {
        v0 = 1;
        v1 = 0;
        this.u();
        this.D();
        v5 = this.getIntent();
        v3 = v5.getStringExtra("authAccount");
        if (v3 != 0) {
            v5.removeExtra("authAccount");
            v0 = new Object[1];
            v0[0] = FinskyLog.a(v3);
            FinskyLog.a("b/5160617: Switching account to %s due to intent", v0);
            this.a(v3, v5);
            return;
        }
        v3 = com.google.android.finsky.m.a.L().a("com.android.providers.downloads");
        if (v3 == 0) {
            FinskyLog.e("Cannot find com.android.providers.downloads", new Object[0]);
            v3 = 0;
        }
        else {
            if (v3.i == 0 && v3.j == 0) {
                v3 = 0;
                if (v3 != 0)
                    return;
                if (Build$VERSION.SDK_INT < 19) {
                    v0 = 0;
                    if (v0 == 0) {
                        if (v5.hasExtra("error_html_message")) {
                            if (v5.hasExtra("error_title"))
                                v1 = v5.getStringExtra("error_title");
                            v2 = v5.getStringExtra("error_html_message");
                            v4 = v5.getStringExtra("error_doc_id");
                            v6 = (String.valueOf(v2).length() + String.valueOf(v1).length() + String.valueOf(v4).length()) + v2 + v1 + v4.hashCode();
                            if (this.J != v6) {
                                this.a(v1, v2, v5.getIntExtra("error_return_code", -1), v4, this.t.a(v5.getExtras()));
                                this.J = v6;
                            }
                        }
                        if (this.N != 0)
                            this.N.d();
                        com.google.android.finsky.m.a.cd().a(this, p0, this.C, this.G, this.U.h, this.U.i);
                    }
                    return;
                }
                v3 = com.google.android.finsky.m.a.L().a("com.google.android.gms");
                if (v3 == 0) {
                    FinskyLog.e("Cannot find com.google.android.gms", new Object[0]);
                    v0 = 0;
                }
                else {
                    if (v3.i == 0 && v3.j == 0) {
                        v0 = 0;
                        if (v0 == 0) {
                            if (v5.hasExtra("error_html_message")) {
                                if (v5.hasExtra("error_title"))
                                    v1 = v5.getStringExtra("error_title");
                                v2 = v5.getStringExtra("error_html_message");
                                v4 = v5.getStringExtra("error_doc_id");
                                v6 = (String.valueOf(v2).length() + String.valueOf(v1).length() + String.valueOf(v4).length()) + v2 + v1 + v4.hashCode();
                                if (this.J != v6) {
                                    this.a(v1, v2, v5.getIntExtra("error_return_code", -1), v4, this.t.a(v5.getExtras()));
                                    this.J = v6;
                                }
                            }
                            if (this.N != 0)
                                this.N.d();
                            com.google.android.finsky.m.a.cd().a(this, p0, this.C, this.G, this.U.h, this.U.i);
                        }
                        return;
                    }
                    FinskyLog.c("Detected disabled com.google.android.gms", new Object[0]);
                    v3 = this.H_();
                    if (v3.a("gms_core_disabled") == 0) {
                        v4 = new com.google.android.finsky.at.k();
                        v4.a(0, 42, 0).a(2131952250).d(2131952688).e(2131951799).a(0);
                        v4.a().a(v3, "gms_core_disabled");
                    }
                }
                if (v0 == 0) {
                    if (v5.hasExtra("error_html_message")) {
                        if (v5.hasExtra("error_title"))
                            v1 = v5.getStringExtra("error_title");
                        v2 = v5.getStringExtra("error_html_message");
                        v4 = v5.getStringExtra("error_doc_id");
                        v6 = (String.valueOf(v2).length() + String.valueOf(v1).length() + String.valueOf(v4).length()) + v2 + v1 + v4.hashCode();
                        if (this.J != v6) {
                            this.a(v1, v2, v5.getIntExtra("error_return_code", -1), v4, this.t.a(v5.getExtras()));
                            this.J = v6;
                        }
                    }
                    if (this.N != 0)
                        this.N.d();
                    com.google.android.finsky.m.a.cd().a(this, p0, this.C, this.G, this.U.h, this.U.i);
                }
                return;
            }
            FinskyLog.c("Detected disabled com.android.providers.downloads", new Object[0]);
            v3 = this.H_();
            if (v3.a("download_manager_disabled") == 0) {
                v4 = new com.google.android.finsky.at.k();
                v4.a(0, 40, 0).a(2131952068).d(2131952688).e(2131951799).a(0);
                v4.a().a(v3, "download_manager_disabled");
            }
            v3 = 1;
        }
        if (v3 != 0)
            return;
        if (Build$VERSION.SDK_INT < 19) {
            v0 = 0;
            if (v0 == 0) {
                if (v5.hasExtra("error_html_message")) {
                    if (v5.hasExtra("error_title"))
                        v1 = v5.getStringExtra("error_title");
                    v2 = v5.getStringExtra("error_html_message");
                    v4 = v5.getStringExtra("error_doc_id");
                    v6 = (String.valueOf(v2).length() + String.valueOf(v1).length() + String.valueOf(v4).length()) + v2 + v1 + v4.hashCode();
                    if (this.J != v6) {
                        this.a(v1, v2, v5.getIntExtra("error_return_code", -1), v4, this.t.a(v5.getExtras()));
                        this.J = v6;
                    }
                }
                if (this.N != 0)
                    this.N.d();
                com.google.android.finsky.m.a.cd().a(this, p0, this.C, this.G, this.U.h, this.U.i);
            }
            return;
        }
        v3 = com.google.android.finsky.m.a.L().a("com.google.android.gms");
        if (v3 == 0) {
            FinskyLog.e("Cannot find com.google.android.gms", new Object[0]);
            v0 = 0;
        }
        else {
            if (v3.i == 0 && v3.j == 0) {
                v0 = 0;
                if (v0 == 0) {
                    if (v5.hasExtra("error_html_message")) {
                        if (v5.hasExtra("error_title"))
                            v1 = v5.getStringExtra("error_title");
                        v2 = v5.getStringExtra("error_html_message");
                        v4 = v5.getStringExtra("error_doc_id");
                        v6 = (String.valueOf(v2).length() + String.valueOf(v1).length() + String.valueOf(v4).length()) + v2 + v1 + v4.hashCode();
                        if (this.J != v6) {
                            this.a(v1, v2, v5.getIntExtra("error_return_code", -1), v4, this.t.a(v5.getExtras()));
                            this.J = v6;
                        }
                    }
                    if (this.N != 0)
                        this.N.d();
                    com.google.android.finsky.m.a.cd().a(this, p0, this.C, this.G, this.U.h, this.U.i);
                }
                return;
            }
            FinskyLog.c("Detected disabled com.google.android.gms", new Object[0]);
            v3 = this.H_();
            if (v3.a("gms_core_disabled") == 0) {
                v4 = new com.google.android.finsky.at.k();
                v4.a(0, 42, 0).a(2131952250).d(2131952688).e(2131951799).a(0);
                v4.a().a(v3, "gms_core_disabled");
            }
        }
        if (v0 == 0) {
            if (v5.hasExtra("error_html_message")) {
                if (v5.hasExtra("error_title"))
                    v1 = v5.getStringExtra("error_title");
                v2 = v5.getStringExtra("error_html_message");
                v4 = v5.getStringExtra("error_doc_id");
                v6 = (String.valueOf(v2).length() + String.valueOf(v1).length() + String.valueOf(v4).length()) + v2 + v1 + v4.hashCode();
                if (this.J != v6) {
                    this.a(v1, v2, v5.getIntExtra("error_return_code", -1), v4, this.t.a(v5.getExtras()));
                    this.J = v6;
                }
            }
            if (this.N != 0)
                this.N.d();
            com.google.android.finsky.m.a.cd().a(this, p0, this.C, this.G, this.U.h, this.U.i);
        }
    }

    public final com.google.android.finsky.v.b A() {
        if (this.P == 0)
            this.P = new com.google.android.finsky.v.b(this, (ViewGroup)this.findViewById(2131756222));
        return this.P;
    }

    public final void B() {
        if ((FinskyDrawerLayout.i()) || FinskyDrawerLayout.j())
            this.H();
    }

    public final void C() {
        this.U.a(1);
        android.support.v4.view.ai.c(this.M, 2);
    }

    final void D() {
        this.findViewById(2131755379).setVisibility(8);
        this.findViewById(2131756223).setVisibility(8);
    }

    public final void E() {
        if (this.S != 0) {
            v2 = this.K();
            if (v2 != 0)
                v0 = 0;
            else
                v0 = 1;
            this.S.a(v0, this.G.s());
            if (this.U.d != 0)
                this.U.d.setIdleModeDrawerIconState(v0);
            v3 = this.G_().a();
            if (v3 != 0) {
                if (v2 != 0 && this.N.ap != 0) {
                    if (this.N.l())
                        v0 = 2131952871;
                    else
                        v0 = 2131952875;
                    v3.b(v0);
                }
                else if (this.I != 0)
                    v3.b(2131952135);
                else
                    v3.b(0);
            }
        }
    }

    public final boolean F() {
        if (this.x == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final MediaPlayerOverlayView G() {
        if (this.R == 0) {
            v0 = (ViewGroup)this.findViewById(2131756222);
            this.R = (MediaPlayerOverlayView)LayoutInflater.from(this).inflate(2130969093, v0, 0);
            v0.addView(this.R);
            ((ViewGroup)this.findViewById(2131755320)).bringToFront();
        }
        return this.R;
    }

    public final FinskyDrawerLayout H() {
        if (this.N.ap == 0)
            this.N.a(this, this.H, this.C.a());
        if (FinskyDrawerLayout.j())
            this.N.b(1);
        return this.N;
    }

    public final Object T_() {
        this.c.removeCallbacks(this.Z);
        return super.T_();
    }

    public final void a() {
        this.G.a(1);
        if (this.M.getPaddingTop() != 0)
            android.support.v4.view.ai.a(this.M, android.support.v4.view.ai.a.l(this.M), 0, android.support.v4.view.ai.a.m(this.M), this.M.getPaddingBottom());
    }

    public final void a(int p0, int p1, int p2, boolean p3) {
        this.U.a(p0, p3);
        this.U.a(p1);
        this.N.a(p0, p2);
    }

    public final void a(int p0, int p1, boolean p2) {
        this.a(p0, p1, 0, p2);
    }

    public final void a(int p0, Bundle p1) {
        switch (p0) {
            case 32:
                break;
            case 40:
                FinskyLog.a("Attempting to enable download manager", new Object[0]);
                this.getPackageManager().setApplicationEnabledSetting("com.android.providers.downloads", 1, 0);
                this.J();
                break;
            case 41:
                FinskyLog.a("Shutting down after download manager or gms core re-enabled", new Object[0]);
                System.exit(0);
                break;
            case 42:
                FinskyLog.a("Attempting to enable gms core", new Object[0]);
                this.getPackageManager().setApplicationEnabledSetting("com.google.android.gms", 1, 0);
                this.J();
                break;
            case 47:
                v0 = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
                if (v0.resolveActivity(this.getPackageManager()) != 0)
                    this.startActivity(v0);
                break;
            case 48:
                v0 = new Intent("android.settings.MEMORY_CARD_SETTINGS");
                if (v0.resolveActivity(this.getPackageManager()) != 0)
                    this.startActivity(v0);
                break;
            default:
                if (this.G != 0)
                    this.G.a(p0, p1);
                break;
        }
    }

    public final void a(int p0, boolean p1) {
        this.a(p0, 0, p1);
    }

    public final void a(ViewGroup p0) {
        v1 = 1;
        if (p0 instanceof FinskyHeaderListLayout) {
            v0 = (FinskySearchToolbar)((FinskyHeaderListLayout)p0).getToolbar();
            if (v0 == 0 || v0.l()) {
                v0 = this.G;
                v1 = 0;
            }
            else {
                if (((FinskyHeaderListLayout)p0).getActionBarTranslationY() == 0)
                    v0 = 1;
                else
                    v0 = 0;
                if (v0 != 0) {
                    v1 = 2;
                    v0 = this.G;
                }
                else
                    v0 = this.G;
            }
            v0.c(v1);
        }
    }

    protected final void a(VolleyError p0) {
        if (p0 instanceof AuthFailureError && ((AuthFailureError)p0).a != 0) {
            this.v = 1;
            this.startActivityForResult(((AuthFailureError)p0).a, 22);
        }
        else {
            this.u();
            this.b(p0);
            v0 = this.H();
            v0.k();
            if (!DrawerLayout.g(v0.al))
                v0.e(v0.al);
        }
    }

    public final void a(com.google.android.finsky.a.d p0) {
        this.O = p0;
    }

    public final void a(com.google.android.finsky.d.w p0) {
        this.H().ad = p0;
    }

    public final void a(CharSequence p0, com.google.android.finsky.a.e p1) {
        this.I = 1;
        this.N.setDrawerLockMode(1);
        this.U.a(2, p0);
        this.U.b();
        this.U.x = p1;
        if (this.U.c != 0)
            this.U.o.c_(2130837689);
        this.U.a();
    }

    protected final void a(String p0, Intent p1) {
        super.a(p0, p1);
        if (this.U != 0) {
            this.U.a(0, 0);
            this.U.a(0);
        }
        if (this.N != 0)
            this.N.a(0, 0);
    }

    public final void a(String p0, View p1, com.google.android.finsky.d.ad p2, byte[] p3) {
        if (this.Q == 0)
            this.Q = new com.google.android.finsky.bm.e(this, this.getResources(), this.G.j(), this, (ViewGroup)this.findViewById(2131756222), this.C, com.google.android.finsky.m.a.bL().a);
        if (TextUtils.isEmpty(p0))
            FinskyLog.d("Tried to play video with empty id.", new Object[0]);
        else {
            if (TextUtils.equals(this.Q.i, p0)) {
                if (this.Q.g.a()) {
                    this.Q.l.b(new com.google.android.finsky.d.d(p2).a(6501));
                    this.Q.k.a(2, this.Q.j, this.Q.i, this.Q.m);
                }
                else {
                    this.Q.l.b(new com.google.android.finsky.d.d(p2).a(6500));
                    this.Q.k.a(this.Q.j, this.Q.i, this.Q.m);
                }
                if (this.Q.g.e == 0) {
                    FinskyLog.d("Try to pause/resume video without initial loading and construct fragment", new Object[0]);
                    return;
                }
                if (this.Q.g.a()) {
                    if (this.Q.g.f != 0) {
                        try {
                            this.Q.g.f.b();
                        }
                        catch (IllegalStateException ex) {
                        }
                    }
                    return;
                }
                if (this.Q.g.e == 0) {
                    FinskyLog.d("Cannot determine if video is paused with uninitialized fragment", new Object[0]);
                    v0 = 0;
                }
                else {
                    if (this.Q.g.a != 5) {
                        v0 = 0;
                        if (v0 != 0 && this.Q.g.f != 0)
                            this.Q.g.f.a();
                        return;
                    }
                    v0 = 1;
                }
                if (v0 != 0 && this.Q.g.f != 0)
                    this.Q.g.f.a();
                return;
            }
            this.Q.l.b(new com.google.android.finsky.d.d(p2).a(6500));
            if (this.Q.e())
                this.Q.f();
            v1 = p1.getParent();
            while (v1 != 0) {
                if (v1 instanceof RecyclerView) {
                    ((RecyclerView)v1).a(this.Q);
                    this.Q.a.add((RecyclerView)v1);
                }
                v1 = v1.getParent();
            }
            if (this.Q.a.isEmpty()) {
                v1 = new Object[1];
                v1[0] = p1.getClass().getName();
                FinskyLog.e("InlineVideoPlayer fail since anchor view %s doesn't have recycler parent", v1);
            }
            else {
                this.Q.i = p0;
                this.Q.m = p3;
                this.Q.h.a();
                this.Q.h.b = p1;
                this.Q.h.b.addOnAttachStateChangeListener(this.Q.h);
                this.Q.h.b.getViewTreeObserver().addOnScrollChangedListener(this.Q.h);
                this.Q.h.c = this.Q.d;
                this.Q.h.c.getWindowVisibleDisplayFrame(this.Q.h.e);
                this.Q.h.h = 1;
                this.Q.h.b();
            }
        }
    }

    public final void a(String p0, String p1, com.google.android.finsky.d.w p2) {
        if (!TextUtils.isEmpty(p1)) {
            if (this.x != 0)
                FinskyLog.d(p1, new Object[0]);
            else
                com.google.android.finsky.at.b.a(this.H_(), 0, p0, p1, p2, 0);
        }
        else
            FinskyLog.e("Unknown error with empty error message.", new Object[0]);
    }

    final boolean a(String p0, String p1, int p2, String p3, com.google.android.finsky.d.w p4) {
        v0 = 0;
        v2 = com.google.android.finsky.m.a.L().a(p3);
        switch (p2) {
            case 1:
                if (v2 != 0 && v2.g != 0)
                    v0 = 1;
                if (v0 != 0) {
                    this.a(p0, p1, p4);
                    return 1;
                }
                v0 = new com.google.android.finsky.at.k();
                v0.a(2131952315).d(2131952688).e(2131953292);
                v2 = new Bundle();
                v2.putString("error_package_name", p3);
                v0.a(0, 32, v2);
                v0.a().a(this.H_(), "mismatched_certificates");
                break;
            case 2:
                this.a(p0, p1, p4);
                break;
            case 3:
                if (com.google.android.finsky.m.a.dj().a(12610437)) {
                    v2 = new ArrayList();
                    v2.add(p3);
                    this.startActivity(UninstallManagerActivityV2.a(v2, this.C, 0));
                }
                else
                    this.startActivity(UninstallManagerActivity.a(this.G.u(), this.C));
                return 1;
            default:
                this.a(p0, p1, p4);
                break;
        }
        return 1;
    }

    public final void a_(com.google.android.finsky.d.w p0) {
        this.U.a(p0);
    }

    public final void b(int p0, Bundle p1) {
        switch (p0) {
            case 32:
                com.google.android.finsky.m.a.o().b(p1.getString("error_package_name"), 0);
                break;
            case 40:
                FinskyLog.a("Shutting down because download manager remains disabled", new Object[0]);
                System.exit(0);
                break;
            case 42:
                FinskyLog.a("Shutting down because gms core remains disabled", new Object[0]);
                System.exit(0);
                break;
            default:
                break;
        }
    }

    protected final void b(String p0) {
        com.google.android.finsky.m.a.a(com.google.android.finsky.m.a.bl().a.incrementAndGet(), com.google.android.finsky.m.a.bm().a.incrementAndGet());
        if (!com.google.android.finsky.m.a.dj().a(12629293))
            com.google.android.finsky.m.a.bk().a(0, p0);
        if (this.x != 0)
            FinskyLog.e("Should not be here after state was saved", new Object[0]);
        else {
            if (this.G != 0) {
                this.G.c();
                this.G.z();
            }
            if (this.M != 0) {
                v0 = new ArrayList();
                v2 = 0;
                while (v2 < this.M.getChildCount()) {
                    v4 = this.M.getChildAt(v2);
                    v5 = v4.getId();
                    if (v5 != 2131755378) {
                        if (v5 != 2131755379) {
                            if (v5 != 2131756223)
                                v0.add(v4);
                        }
                    }
                    v2 = v2 + 1;
                }
                v2 = 0;
                while (v2 < ((ArrayList)v0).size()) {
                    v1 = ((ArrayList)v0).get(v2);
                    v2 = v2 + 1;
                    this.M.removeView((View)v1);
                }
            }
            this.t();
        }
    }

    protected final void b(boolean p0) {
        this.T.a(this.C, 1708);
        super.b(p0);
        v0 = com.google.android.finsky.m.a.aD();
        v1 = com.google.android.finsky.m.a.ap();
        v2 = v1.c();
        v4 = System.currentTimeMillis();
        v3 = v0.b(v2);
        v0 = v0.b.a(v2);
        if (v3 == 0 && v0 == 0) {
            v1 = new Object[1];
            v1[0] = FinskyLog.a(v2);
            FinskyLog.b("Not checking for valid FOP because relevant experiments are disabled. (account=%s)", v1);
        }
        else if (!com.google.android.finsky.billing.profile.t.b(v2, v4)) {
            if (v3 != 0 && com.google.android.finsky.billing.profile.t.a(v2, v4) && v0 == 0) {
                v1 = new Object[1];
                v1[0] = FinskyLog.a(v2);
                FinskyLog.b("Not checking for valid FOP because snoozed. (account=%s)", v1);
            }
            else
                v1.b(new com.google.android.finsky.billing.profile.u(v2), new com.google.android.finsky.billing.profile.v());
        }
        if (p0 != 0 && (this.H == 0 || (this.G.y()) || this.G.k() == 0))
            this.b(this.t.a(this.getIntent().getExtras(), this.C));
        this.N.g();
        this.H = 0;
    }

    public final void c() {
        this.G.a(0);
        v1 = Math.max(FinskySearchToolbar.a(this), this.G_().a().c());
        if (this.M.getPaddingTop() != v1)
            android.support.v4.view.ai.a(this.M, android.support.v4.view.ai.a.l(this.M), v1, android.support.v4.view.ai.a.m(this.M), this.M.getPaddingBottom());
    }

    public final void c(int p0) {
        this.U.a(1, p0);
    }

    public final void c(String p0) {
        this.U.a(p0);
        v1 = this.G.B();
        if (v1 != 0) {
            v0 = this.G.D();
            if (v0 instanceof FinskyHeaderListLayout) {
                ((FinskyHeaderListLayout)v0).setActionBarTitleColor(v1.intValue());
                v1 = this.G.C().intValue();
                if (Color.alpha(v1) > 0)
                    ((FinskyHeaderListLayout)v0).setFloatingControlsBackground(new ColorDrawable(v1));
            }
            else {
                v0 = (FinskySearchToolbar)this.findViewById(this.X);
                if (v0 != 0)
                    v0.setTitleTextColor(v1.intValue());
            }
        }
    }

    public final void c_(int p0) {
        v0 = this.G_().a();
        if (v0 != 0) {
            if (p0 == 0)
                v0.c(this.S);
            else
                v0.a(p0);
        }
    }

    public final void d() {
        this.G.b(1);
    }

    public final void d(String p0) {
        if (com.google.android.finsky.m.a.dj().a(12624205)) {
            ((com.google.android.finsky.layout.actionbar.f)this.U.f.peek()).c = p0;
            this.U.a();
        }
    }

    public final void e() {
        this.G.b(0);
    }

    public final void f() {
        this.U.a(1, 0);
        if (this.O != 0)
            this.O.p_();
        android.support.v4.view.ai.c(this.M, 2);
    }

    public final void f_(int p0) {
    }

    public final void g() {
        if (this.U.a(Integer.valueOf(1))) {
            this.U.c();
            this.U.a();
        }
        else
            this.U.b(Integer.valueOf(1));
        if (this.O != 0)
            this.O.q_();
        android.support.v4.view.ai.c(this.M, 0);
    }

    public final void h() {
        this.I = 0;
        this.N.setDrawerLockMode(0);
        if (this.U.c != 0)
            this.U.o.c_(0);
        this.U.x = 0;
        if (this.U.a(Integer.valueOf(2))) {
            this.U.c();
            this.U.a();
        }
        else
            this.U.b(Integer.valueOf(2));
    }

    public final Toolbar i() {
        return (Toolbar)this.findViewById(this.X);
    }

    public final void j() {
        this.U.a(3, 0);
    }

    public final void k() {
        if (this.U.a(Integer.valueOf(3))) {
            this.U.c();
            this.U.a();
        }
        else
            this.U.b(Integer.valueOf(3));
    }

    public final com.google.android.finsky.a.c l() {
        return this;
    }

    public final void m() {
        this.onBackPressed();
    }

    protected void onActivityResult(int p0, int p1, Intent p2) {
        if (p0 == 31 && p1 == 40) {
            FinskyLog.a("b/5160617: Reinitialize with null accountafter user changed content level", new Object[0]);
            this.a(new com.google.android.finsky.activities.ew(this));
        }
        else {
            if (p0 == 34) {
                if (p2 != 0) {
                    v0 = (RedeemCodeResult)p2.getParcelableExtra("redeem_code_result");
                    if (v0 != 0 && v0.e != 0) {
                        if (v0.e.d != 0) {
                            if (!TextUtils.isEmpty(v0.e.d.d))
                                this.startActivity(com.google.android.finsky.m.a.bo().a(this, v0.e.d.d, 0, v0.e.d.H, this.C));
                            else
                                FinskyLog.e("Unexpected missing browseUrl", new Object[0]);
                        }
                        else
                            FinskyLog.e("Unexpected missing resolvedLink", new Object[0]);
                    }
                }
            }
            else if (p0 == 35) {
                if (p1 == -1)
                    v0 = 1;
                else
                    v0 = 0;
                com.google.android.finsky.m.a.dc().a(503, v0);
                if (v0 != 0) {
                    com.google.android.finsky.m.a.aq().a();
                    this.c.postDelayed(new com.google.android.finsky.activities.ex(this), 3000);
                }
            }
            else if (p0 != 51 && p0 == 52)
                com.google.android.finsky.m.a.aY().a(p2, this.G, this.C);
            super.onActivityResult(p0, p1, p2);
        }
    }

    public void onBackPressed() {
        if (this.N.ap != 0 && this.N.l())
            this.N.d();
        else if (!this.G.a(this.C, 0))
            super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration p0) {
        super.onConfigurationChanged(p0);
        this.N.onConfigurationChanged(p0);
    }

    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        if (com.google.android.finsky.m.a.bK().b()) {
            this.V = 1;
            this.finish();
        }
        else {
            if (p0 != 0)
                this.T.a = 1;
            this.T.a();
            com.google.android.finsky.m.a.dc().l();
            this.T.a(this.C, 1707);
            if (com.google.android.finsky.m.a.dj().a(12640732))
                this.setContentView(2130969090);
            else
                this.setContentView(2130969086);
            v1 = this.i();
            if (v1 instanceof FinskySearchToolbar)
                ((FinskySearchToolbar)v1).a(new com.google.android.finsky.layout.actionbar.m(this));
            this.H = p0;
            this.M = (ViewGroup)this.findViewById(2131755313);
            this.G = com.google.android.finsky.m.a.k().a(this);
            this.G.a(new com.google.android.finsky.activities.es(this));
            if (v1 instanceof FinskySearchToolbar)
                v0 = (FinskySearchToolbar)v1;
            else
                v0 = 0;
            this.a(v1);
            v1 = this.G_().a();
            if (this.U == 0)
                this.U = new com.google.android.finsky.layout.actionbar.a(this.G, this, this);
            else
                this.U.a(v0);
            this.S = new com.google.android.play.drawer.b(v1.g());
            v1.c(this.S);
            if (this.W != 0)
                this.U.a(this, this.W);
            this.E();
            if (p0 != 0) {
                this.G.b(p0);
                this.J = p0.getInt("last_shown_error_hash");
            }
            if (!this.G.y()) {
                this.u();
                this.D();
            }
            this.N = (FinskyDrawerLayout)this.findViewById(2131756221);
            if (FinskyDrawerLayout.i()) {
                v5 = this.C.a();
                this.N.O = this;
                this.N.ad = v5;
                if (p0 != 0 && p0.getBoolean("FinskyDrawerLayout.isDrawerOpened", 0))
                    v0 = 1;
                else
                    v0 = 0;
                if (v0 != 0)
                    this.N.a(this, p0, v5);
                else
                    this.N.aa.postDelayed(new com.google.android.finsky.layout.play.z(this.N, this, p0, v5), ((Long)com.google.android.finsky.aa.b.jm.b()).longValue());
            }
            else
                this.N.a(this, p0, this.C.a());
            this.setDefaultKeyMode(3);
            if (((Boolean)com.google.android.finsky.billing.common.d.c.a()).booleanValue() && !com.google.android.finsky.m.a.dj().a(12641184)) {
                v0 = new com.google.android.wallet.ui.common.a(this, 0);
                v0.a(LayoutInflater.from(this).inflate(2130969589, 0));
                v0.a(2131952688, new com.google.android.finsky.activities.et());
                v0.a().show();
            }
            if (com.google.android.finsky.m.a.dj().a(12637762))
                this.ae = new com.google.android.finsky.cf.a.a(this.M, new com.google.android.finsky.activities.ep(this), com.google.android.finsky.m.a.s().a, new com.google.android.finsky.activities.ev(this));
        }
    }

    public boolean onCreateOptionsMenu(Menu p0) {
        super.onCreateOptionsMenu(p0);
        this.getMenuInflater().inflate(2132082688, p0);
        if (com.google.android.finsky.m.a.dj().a(12624205)) {
            v0 = p0.findItem(2131756539);
            if (v0 != 0) {
                v0 = v0.getIcon();
                if (v0 != 0) {
                    v0.mutate();
                    v0.setColorFilter(-1, PorterDuff$Mode.SRC_ATOP);
                }
            }
        }
        this.U.a(this, p0);
        this.W = p0;
        return 1;
    }

    protected void onDestroy() {
        if (this.V != 0)
            super.onDestroy();
        else {
            if (this.N != 0) {
                if (this.N.aa != 0)
                    this.N.aa.removeCallbacksAndMessages(0);
                if (this.N.P != 0) {
                    this.N.P.b(this.N.af);
                    this.N.af = 0;
                }
            }
            if (this.aa != 0) {
                this.aa.cancel(1);
                this.aa = 0;
            }
            if (this.ab != 0) {
                this.ab.cancel(0);
                this.ab = 0;
            }
            this.ac = 0;
            this.ae = 0;
            this.G.i();
            super.onDestroy();
        }
    }

    public void onMultiWindowModeChanged(boolean p0) {
        super.onMultiWindowModeChanged(p0);
        if (p0 != 0)
            this.C.a(new com.google.android.finsky.d.c(546).a, 0);
        else
            this.C.a(new com.google.android.finsky.d.c(547).a, 0);
    }

    protected void onNewIntent(Intent p0) {
        this.setIntent(p0);
        this.ad = 0;
        v0 = this.t.a(p0.getExtras());
        if (v0 != 0 && "deep_link".equals(v0.b))
            this.C = v0;
        if (this.x == 0 && (this.A != 0 || !((Boolean)com.google.android.finsky.aa.b.hT.b()).booleanValue())) {
            this.b(this.t.a(p0.getExtras(), this.C));
            this.a(p0);
        }
        else {
            this.x = 0;
            super.onNewIntent(p0);
        }
    }

    public boolean onOptionsItemSelected(MenuItem p0) {
        v5 = 0;
        v7 = 1;
        v0 = p0.getItemId();
        if (v0 == 16908332) {
            if (this.K() && this.N.ap != 0) {
                this.N.k();
                if (DrawerLayout.g(this.N.al))
                    this.N.f(this.N.al);
                else
                    this.N.e(this.N.al);
            }
            else {
                this.N.d();
                if (!this.G.b(this.C, 0))
                    super.onBackPressed();
            }
        }
        else if (v0 == 2131756978) {
            if (this.U.x != 0) {
                this.U.x.c();
                v2 = this.U.x.b();
                if (v2 != 0)
                    v0 = 256;
                else
                    v0 = 257;
                com.google.android.finsky.m.a.dc().a(v0, 0, this.U.n.n());
                if (v2 != 0)
                    v0 = 2131953027;
                else
                    v0 = 2131953276;
                this.U.r.setTitle(v0);
            }
        }
        else if (v0 == 2131756979) {
            v0 = this.U.n.u();
            if (v0 == 0)
                FinskyLog.e("tried to operate on a null doc", new Object[0]);
            else if (v0.a.f != 3)
                FinskyLog.e("tried to operate on a non-apps doc.", new Object[0]);
            else {
                v4 = v0.a.c;
                if (!com.google.android.finsky.layout.actionbar.g.a(v4))
                    v0 = 1;
                else
                    v0 = 0;
                v1 = com.google.android.finsky.m.a.I().a(v4);
                if (v1.d != 0 && v1.d.b == 1)
                    v2 = 1;
                else
                    v2 = 0;
                if (v0 != 0)
                    v1 = 1;
                else
                    v1 = 2;
                com.google.android.finsky.m.a.I().b.a(v4, v1);
                if (v0 != 0 && !com.google.android.finsky.m.a.x().c() && !com.google.android.finsky.m.a.x().a())
                    new com.google.android.finsky.layout.actionbar.h().a(this.H_(), "auto_update_dialog");
                if (v0 != 0)
                    v0 = 1;
                else
                    v0 = 0;
                if (v2 != 0)
                    v5 = 1;
                com.google.android.finsky.m.a.dc().a(new com.google.android.finsky.d.c(403).b(Integer.valueOf(v0)).a(Integer.valueOf(v5)).a(v4).a, 0, -1);
            }
            this.U.d();
        }
        else if (v0 == 2131756980)
            Toast.makeText(this, "Environment indicator (not visible externally)", 0).show();
        else if (v0 == 2131756981)
            this.U.n.a(this, this.C);
        else if (com.google.android.finsky.m.a.dj().a(12624205) && v0 == 2131756539) {
            v4 = ((com.google.android.finsky.layout.actionbar.f)this.U.f.peek()).c;
            v6 = ((com.google.android.finsky.layout.actionbar.f)this.U.f.peek()).b;
            if (!TextUtils.isEmpty(v4)) {
                if (v6 != 0)
                    v6 = v6.toString();
                else
                    v6 = "";
                com.google.android.finsky.m.a.bn().a(this.U.e, this.U.n.n(), this.U.n.l(), v4, 0, v6);
            }
        }
        else
            v7 = super.onOptionsItemSelected(p0);
        return v7;
    }

    protected void onPause() {
        super.onPause();
        if (this.z != 0)
            this.T.a(this.C, 1721, -1, "user_interruption");
        this.T.a = 1;
        com.google.android.finsky.m.a.r().b(this.Y);
        v0 = com.google.android.finsky.uninstall.az.a();
        if (v0 != 0)
            v0.f = 0;
        this.K = com.google.android.finsky.m.a.bl().a.incrementAndGet();
        this.L = com.google.android.finsky.m.a.bm().a.incrementAndGet();
    }

    protected void onPostCreate(Bundle p0) {
        super.onPostCreate(p0);
        if (this.N.ap != 0)
            this.N.h();
    }

    protected void onPostResume() {
        super.onPostResume();
        if (this.ad != 0) {
            this.ad = 0;
            this.b(this.ad);
        }
    }

    protected void onResume() {
        this.T.a();
        super.onResume();
        com.google.android.finsky.m.a.r().a(this.Y);
        v0 = com.google.android.finsky.uninstall.az.a();
        if (v0 != 0)
            v0.f = this.Y;
        if (this.N.ap != 0)
            this.N.h();
    }

    protected void onSaveInstanceState(Bundle p0) {
        if (this.H != 0)
            p0.putAll(this.H);
        else
            this.G.a(p0);
        super.onSaveInstanceState(p0);
        p0.putInt("last_shown_error_hash", this.J);
        if (this.N.ap == 0) {
            p0.putBoolean("FinskyDrawerLayout.isAccountListExpanded", 0);
            p0.putBoolean("FinskyDrawerLayout.isDrawerOpened", 0);
        }
        else {
            this.N.k();
            p0.putBoolean("FinskyDrawerLayout.isAccountListExpanded", this.N.am.b());
            p0.putBoolean("FinskyDrawerLayout.isDrawerOpened", this.N.l());
        }
        v1 = new Bundle();
        this.N.ad.a(v1);
        p0.putBundle("FinskyDrawerLayout.LoggingContext", v1);
    }

    public boolean onSearchRequested() {
        v0 = 0;
        if (com.google.android.finsky.m.a.S().a()) {
            if (this.U.u != 0) {
                if (android.support.v4.view.s.d(this.U.u))
                    android.support.v4.view.s.c(this.U.u);
                else
                    android.support.v4.view.s.b(this.U.u);
                v2 = 1;
            }
            else
                v2 = 0;
            if (v2 != 0 || super.onSearchRequested())
                v0 = 1;
        }
        return v0;
    }

    protected void onStart() {
        this.T.a();
        this.T.a(this.C, 1702);
        super.onStart();
        if (com.google.android.finsky.m.a.B().b(com.google.android.finsky.m.a.db())) {
            FinskyLog.a("Reload home because of new enterprise acl consistency token.", new Object[0]);
            this.G.c();
            this.G.a(com.google.android.finsky.m.a.dn(), this.C);
        }
        if (com.google.android.finsky.m.a.dj().a(12627477))
            com.google.android.finsky.m.a.dc().a(0);
        if (this.ae != 0) {
            if (!com.google.android.finsky.cg.e.a.contains(this.ae))
                com.google.android.finsky.cg.e.a.add(this.ae);
            this.ae.b(this.ae.c.getContext().getApplicationContext());
        }
    }

    protected void onStop() {
        super.onStop();
        this.T.a(this.C, 1720);
        this.T.a = 1;
        this.c.post(this.Z);
        if (this.K == -1)
            this.K = com.google.android.finsky.m.a.bl().a.incrementAndGet();
        if (this.L == -1)
            this.L = com.google.android.finsky.m.a.bm().a.incrementAndGet();
        com.google.android.finsky.m.a.a(this.K, this.L);
        this.K = -1;
        this.L = -1;
        if (this.Q != 0) {
            if (this.Q.g.a())
                this.Q.k.a(6, this.Q.j, this.Q.i, this.Q.m);
            else
                this.Q.k.a(5, this.Q.j, this.Q.i, this.Q.m);
            this.Q.f();
            this.Q = 0;
        }
        if (this.ae != 0) {
            com.google.android.finsky.cg.e.a.remove(this.ae);
            this.ae.a();
        }
    }

    protected final boolean v() {
        v0 = 1;
        v2 = this.getIntent().getAction();
        if (("android.intent.action.SEARCH".equals(v2)) || ("com.google.android.gms.actions.SEARCH_ACTION".equals(v2)) || ("android.intent.action.VIEW".equals(v2)) || ("android.nfc.action.NDEF_DISCOVERED".equals(v2)) || ("afwapp.android.intent.action.VIEW".equals(v2)) || ("com.google.android.finsky.DETAILS".equals(v2)) || ("com.google.android.finsky.VIEW_MY_DOWNLOADS".equals(v2)) || ("com.google.android.finsky.VIEW_BROWSE".equals(v2)) || ("com.google.android.finsky.UNINSTALL_WIZARD_FOR_MY_DOWNLOADS".equals(v2)) || ("com.google.android.finsky.UNINSTALL_WIZARD_FOR_DETAILS".equals(v2)) || ("com.google.android.gms.actions.VIEW_REMOTE_ESCALATIONS".equals(v2)) || "com.google.android.finsky.PLAY_PASS_HOME".equals(v2))
            v2 = 1;
        else
            v2 = 0;
        if (v2 != 0)
            v0 = 0;
        return v0;
    }

    protected final void w() {
        if (!com.google.android.finsky.m.a.dj().a(12633657) && this.v()) {
            v0 = (String)com.google.android.finsky.aa.a.aR.b(com.google.android.finsky.m.a.db()).a();
            if (!TextUtils.isEmpty(v0)) {
                if (com.google.android.finsky.m.a.dj().a(12633894) && com.google.android.finsky.m.a.bk().a(v0)) {
                    this.I();
                    return;
                }
                v0 = Uri.parse(v0).buildUpon();
                v0.appendQueryParameter("nocache_isui", Boolean.toString(1));
                v0.appendQueryParameter("nocache_pwr", Boolean.toString(1));
                new com.google.android.finsky.dfemodel.g(com.google.android.finsky.m.a.ap(), v0.build().toString());
            }
        }
        this.I();
    }

    public final com.google.android.finsky.navigationmanager.a y_() {
        return this.G;
    }

    public final void z() {
        this.U.a(0, -1);
    }

}

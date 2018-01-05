package com.google.android.finsky.activities;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import com.android.volley.VolleyError;
import com.google.android.finsky.a.c;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.l;
import com.google.android.finsky.api.m;
import com.google.android.finsky.b.f;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.e;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.b;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dh.a;
import com.google.android.finsky.externalreferrer.d;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.frameworkviews.FullScreenDialogRootFrameLayout;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.d;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.v.b;
import com.google.android.play.utils.b.a;
import com.google.android.wallet.common.util.a;
import java.util.Iterator;
import java.util.Set;

public final class InlineAppDetailsDialog extends com.google.android.finsky.activities.b implements com.google.android.finsky.frameworkviews.v, com.google.android.finsky.pagesystem.e
{

    public com.google.android.finsky.activities.dx G;
    public View H;
    public String I;
    public boolean J;
    public com.google.android.finsky.navigationmanager.a K;
    public com.google.android.finsky.d.t L;
    public com.google.android.finsky.externalreferrer.d M;
    public boolean N;
    public final Rect O;
    public boolean P;
    public boolean Q;
    public ViewGroup R;
    public Bundle S;
    public BroadcastReceiver T;
    public boolean U;
    public Boolean V;
    public boolean W;

    InlineAppDetailsDialog() {
        com.google.android.finsky.activities.b();
        com.google.android.finsky.m.a.aJ();
        this.L = com.google.android.finsky.m.a.aP();
        this.O = new Rect();
    }

    private final boolean L() {
        if (this.E() && this.f("forced_inline"))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final boolean M() {
        if (!this.I()) {
            if (this.N())
                v0 = 12632776;
            else
                v0 = 12629616;
            if (com.google.android.finsky.m.a.dj().a(v0)) {
                v0 = 1;
                return v0;
            }
        }
        v0 = 0;
        return v0;
    }

    private final boolean N() {
        return "com.android.finsky.APP_DETAILS_DIALOG".equals(this.getIntent().getAction());
    }

    private final void O() {
        if (this.G != 0)
            this.C.b(new com.google.android.finsky.d.d(this.G).a(601));
    }

    public static Intent a(Uri p0, boolean p1, String p2, boolean p3) {
        v0 = 0;
        v2 = p0.getQueryParameter("referrer");
        v3 = p0.getQueryParameter("pcampaignid");
        v5 = new Intent(com.google.android.finsky.m.a.b, InlineAppDetailsDialog);
        if (p0 != 0)
            v5.putExtra("external_url", p0.toString());
        v5.putExtra("docid", p0.getQueryParameter("id"));
        v5.putExtra("referring_package", p2);
        if (!TextUtils.isEmpty(v2))
            v5.putExtra("referrer", v2);
        if (!TextUtils.isEmpty(v3))
            v5.putExtra("pcampaignid", v3);
        if ((p0.getBooleanQueryParameter("allow_update", 0)) || p3 != 0)
            v0 = 1;
        v5.putExtra("allow_update", v0);
        v5.putExtra("alley_oop_overlay", p1);
        if (com.google.android.finsky.m.a.dj().a(12635356))
            v5.putExtra("forced_inline", p3);
        return v5;
    }

    private final void a(String p0, String p1, String p2, Bundle p3) {
        v1 = Uri.parse("http://market.android.com/details").buildUpon();
        v1.appendQueryParameter("id", p0);
        if (!TextUtils.isEmpty(p1))
            v1.appendQueryParameter("referrer", p1);
        if (p3 != 0) {
            v2 = p3.keySet().iterator();
            while (v2.hasNext()) {
                v0 = (String)v2.next();
                v3 = p3.get(v0);
                if (v3 == 0) {
                    v4 = new Object[1];
                    v4[0] = v0;
                    FinskyLog.c("Null value associated with key %s in extra params", v4);
                }
                else if ((v3 instanceof Boolean) || (v3 instanceof Short) || (v3 instanceof Integer) || (v3 instanceof Long) || (v3 instanceof Double) || v3 instanceof String)
                    v1.appendQueryParameter(v0, v3.toString());
            }
        }
        v0 = v1.build().toString();
        this.C.a(new com.google.android.finsky.d.e(11).a(v0).c(p1).b(p0).d(p2));
        this.M.a(p1, p2, p0, "inline_install");
        v1 = com.google.android.finsky.m.a.dk();
        if (v1 != 0)
            v1.b(v0, 2);
    }

    private final void a(String p0, String p1, String p2, com.google.android.finsky.d.w p3) {
        v4 = this.e("docid");
        if (this.f("allow_update") && ((Boolean)com.google.android.finsky.aa.b.an.b()).booleanValue())
            v2 = 1;
        else
            v2 = 0;
        if (p2 == 0)
            p2 = com.google.android.finsky.m.a.bt().a(v4).a(com.google.android.finsky.m.a.cZ());
        v6 = new Object[2];
        v6[0] = FinskyLog.a(p2);
        v6[1] = v4;
        FinskyLog.a("Select %s for details of %s", v6);
        if (this.I())
            v0 = 0;
        else if (this.N())
            v0 = 7;
        else
            v0 = 6;
        v1 = new com.google.android.finsky.activities.dx();
        v1.b("docid", v4);
        v1.m_ = this.e("referrer");
        v1.g = p0;
        v1.h = p1;
        v1.c(p2);
        v1.d("InlineAppDetailsFragment.allow_update", v2);
        v1.a(p3);
        v1.d("InlineAppDetailsFragment.allow_latency_logging", this.M());
        v1.a("InlineAppDetailsFragment.page_type", v0);
        this.G = v1;
        v0 = this.H_().a();
        v0.a(2131755313, this.G);
        if (this.Q != 0)
            v0.e();
        else
            v0.c();
        if (this.z == 0)
            this.G.w_();
    }

    public final com.google.android.finsky.v.b A() {
        return 0;
    }

    protected void B() {
        if (this.M()) {
            if (this.N())
                v0 = 1728;
            else
                v0 = 1723;
            this.L.a(this.C, v0);
        }
    }

    protected boolean C() {
        return 0;
    }

    protected void D() {
        if (this.E() && !this.L())
            this.J = this.f("alley_oop_overlay");
        else
            this.J = 0;
        v4 = this.e("docid");
        if (TextUtils.isEmpty(v4)) {
            FinskyLog.d("Missing docid.", new Object[0]);
            this.finish();
        }
        else if (com.google.android.finsky.m.a.cY() == 0)
            this.y_().a(com.google.android.finsky.api.l.a(v4), 0, 0, 0, 0, 1, this.C);
        else {
            this.H();
            v0 = this.H_().a(2131755313);
            if (v0 != 0 && v0 instanceof com.google.android.finsky.activities.dx)
                this.G = (com.google.android.finsky.activities.dx)v0;
            else {
                this.N = 0;
                v5 = this.e("external_url");
                this.I = this.e("referring_package");
                if (TextUtils.isEmpty(this.I)) {
                    v0 = com.google.android.wallet.common.util.a.a(this);
                    if (v0 == 0 || TextUtils.equals("com.android.vending", v0)) {
                        com.google.android.finsky.m.a.G();
                        v0 = com.google.android.finsky.b.f.a(this);
                    }
                    this.I = v0;
                }
                if (this.J == 0 && !this.L() && !TextUtils.isEmpty(v5) && v5.startsWith("market:")) {
                    v0 = com.google.android.finsky.m.a.dk();
                    if (v0 != 0) {
                        this.F();
                        v0.b(v5, 1);
                    }
                    this.y_().a(Uri.parse(v5).buildUpon().scheme("http").authority("market.android.com").path("details").build(), this.I, this.C);
                }
                else {
                    if (this.J != 0 || (this.I()) || (this.L()) || (com.google.android.finsky.dh.a.b(this)) || ((Boolean)com.google.android.finsky.aa.b.ak.b()).booleanValue())
                        v0 = 1;
                    else
                        v0 = 0;
                    if (this.U != 0 && this.N() && com.google.android.finsky.m.a.dj().a(12636154))
                        v3 = 1;
                    else
                        v3 = 0;
                    if (v3 != 0)
                        this.C.a(new com.google.android.finsky.d.e(7).b(v4).d(this.I).e(this.I).a(1, v0));
                    if (v0 == 0) {
                        FinskyLog.c("Called from untrusted package.", new Object[0]);
                        this.finish();
                    }
                    else {
                        v1 = this.e("referrer");
                        if (!TextUtils.isEmpty(v1))
                            com.google.android.finsky.m.a.ap().b(v4, v1, new com.google.android.finsky.activities.dv(v4, v1), new com.google.android.finsky.activities.dw());
                        if (com.google.android.finsky.m.a.dj().a(12622681))
                            v0 = com.google.android.finsky.api.l.b(v4);
                        else
                            v0 = com.google.android.finsky.api.l.a(v4);
                        if (this.S == 0 && !this.I()) {
                            if (this.J != 0 || this.L()) {
                                v6 = new StringBuilder(v5);
                                if (!TextUtils.isEmpty(this.I))
                                    v6.append("&callerId=").append(this.I);
                                this.C.a(new com.google.android.finsky.d.e(11).a(v6.toString()).c(v1).b(v4).d(this.I));
                                this.M.a(v1, this.I, v4, "inline_install");
                            }
                            else
                                this.a(v4, v1, this.I, this.g("extra_logging_params"));
                        }
                        this.a(v0, 0, this.e("authAccount"), this.C);
                    }
                }
            }
        }
    }

    protected boolean E() {
        if (this.V == 0)
            this.V = Boolean.valueOf(this.getPackageName().equals(com.google.android.finsky.dh.a.a(this)));
        return this.V.booleanValue();
    }

    protected String F() {
        return this.getIntent().getAction();
    }

    protected final boolean G() {
        if (this.H != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final void H() {
        if (!this.G()) {
            if (this.Q != 0) {
                this.getWindow().setBackgroundDrawableResource(17170445);
                this.H = View.inflate(this, 2130968997, 0);
                ((FullScreenDialogRootFrameLayout)this.H).setListener(this);
                ((FullScreenDialogRootFrameLayout)this.H).setEnableCustomizedTapOutsideHandling(com.google.android.finsky.m.a.dj().a(12640681));
                this.R = (ViewGroup)this.H.findViewById(2131755313);
            }
            else
                this.H = View.inflate(this, 2130968996, 0);
            this.setContentView(this.H);
        }
    }

    protected boolean I() {
        return 0;
    }

    protected final void J() {
  4:    if (this.W != 0)
160:        return;
 19:    if (!com.google.android.finsky.m.a.dj().a(12630053))
160:        return;
 34:    if (!com.google.android.finsky.m.a.dj().a(12622681)) goto 163;
 46:    if (TextUtils.isEmpty(this.e("docid"))) goto 163;
 52:    if (this.E() && this.f("alley_oop_overlay"))
 62:        v0 = 1;
        else
161:        v0 = 0;
 63:    if (v0 != 0) goto 91;
 69:    if (this.L()) goto 91;
 73:    v3 = this.e("external_url");
 81:    if (TextUtils.isEmpty(v3)) goto 91;
 89:    if (v3.startsWith("market:")) goto 163;
 91:    if (v0 != 0) {
125:        v0 = 1;
126:        if (v0 != 0) {
128:            this.W = 1;
132:            com.google.android.finsky.m.a.aO();
157:            new com.google.android.finsky.dfemodel.i(com.google.android.finsky.m.a.ap(), com.google.android.finsky.api.l.b(com.google.android.finsky.api.l.b(this.e("docid"))));
            }
160:        return;
        }
 97:    if (this.I()) {
125:        v0 = 1;
126:        if (v0 != 0) {
128:            this.W = 1;
132:            com.google.android.finsky.m.a.aO();
157:            new com.google.android.finsky.dfemodel.i(com.google.android.finsky.m.a.ap(), com.google.android.finsky.api.l.b(com.google.android.finsky.api.l.b(this.e("docid"))));
            }
160:        return;
        }
103:    if (this.L()) {
125:        v0 = 1;
126:        if (v0 != 0) {
128:            this.W = 1;
132:            com.google.android.finsky.m.a.aO();
157:            new com.google.android.finsky.dfemodel.i(com.google.android.finsky.m.a.ap(), com.google.android.finsky.api.l.b(com.google.android.finsky.api.l.b(this.e("docid"))));
            }
160:        return;
        }
109:    if (com.google.android.finsky.dh.a.b(this)) {
125:        v0 = 1;
126:        if (v0 != 0) {
128:            this.W = 1;
132:            com.google.android.finsky.m.a.aO();
157:            new com.google.android.finsky.dfemodel.i(com.google.android.finsky.m.a.ap(), com.google.android.finsky.api.l.b(com.google.android.finsky.api.l.b(this.e("docid"))));
            }
160:        return;
        }
123:    if (!((Boolean)com.google.android.finsky.aa.b.ak.b()).booleanValue()) goto 163;
125:    v0 = 1;
126:    if (v0 != 0) {
128:        this.W = 1;
132:        com.google.android.finsky.m.a.aO();
157:        new com.google.android.finsky.dfemodel.i(com.google.android.finsky.m.a.ap(), com.google.android.finsky.api.l.b(com.google.android.finsky.api.l.b(this.e("docid"))));
        }
160:    return;
163:    v0 = 0;
164:    goto 126;
    }

    public final void K() {
        this.O();
    }

    public final void a(int p0, int p1, int p2, boolean p3) {
    }

    public final void a(int p0, int p1, boolean p2) {
    }

    public final void a(int p0, boolean p1) {
    }

    protected final void a(VolleyError p0) {
        if (this.z != 0 && this.M()) {
            if (this.N())
                v0 = 1732;
            else
                v0 = 1727;
            this.L.a(this.C, v0, -1, "authentication_error");
        }
        if (this.G != 0 && this.G.k())
            this.G.a(com.google.android.finsky.api.m.a(this.G.bn, p0));
    }

    public final void a(String p0, String p1, com.google.android.finsky.d.w p2) {
    }

    public final void a(String p0, String p1, String p2) {
        this.a(p0, p1, p2, this.C.a());
    }

    public final void a(boolean p0, Runnable p1) {
        v1 = 1;
        if (this.Q != 0) {
            if (this.R != 0) {
                if (p0 != 0) {
                    this.R.setVisibility(8);
                    v0 = 1;
                }
                else {
                    v0 = 0;
                    v2 = this.R.animate().alpha(0);
                    if (p1 != 0)
                        v2.setListener(new com.google.android.finsky.activities.du(p1));
                    v2.start();
                }
                this.N = 1;
                v1 = v0;
            }
        }
        else if (this.H != 0) {
            this.H.setVisibility(8);
            this.N = 1;
        }
        if (v1 != 0 && p1 != 0)
            p1.run();
    }

    public final void a_(com.google.android.finsky.d.w p0) {
    }

    protected final void b(boolean p0) {
        if (this.M()) {
            if (this.N())
                v0 = 1730;
            else
                v0 = 1725;
            this.L.a(this.C, v0);
        }
        super.b(p0);
        if (this.G != 0)
            this.G.w_();
    }

    public final void c(int p0) {
    }

    public final void c(String p0) {
    }

    public final void d(String p0) {
    }

    public boolean dispatchTouchEvent(MotionEvent p0) {
        if (this.P != 0 && this.Q == 0 && p0.getAction() == 0) {
            this.getWindow().getDecorView().getHitRect(this.O);
            if (!this.O.contains((int)p0.getX(), (int)p0.getY()))
                this.O();
        }
        return super.dispatchTouchEvent(p0);
    }

    protected String e(String p0) {
        return this.getIntent().getStringExtra(p0);
    }

    protected boolean f(String p0) {
        return this.getIntent().getBooleanExtra(p0, 0);
    }

    protected Bundle g(String p0) {
        return this.getIntent().getBundleExtra(p0);
    }

    public final com.google.android.finsky.a.c l() {
        return 0;
    }

    public final void m() {
        this.finish();
    }

    protected void onActivityResult(int p0, int p1, Intent p2) {
        if (p0 != 55) {
            if (p0 == 33) {
                if (p1 != -1) {
                    if (p1 != 0) {
                        this.finish();
                        return;
                    }
                    if (this.Q == 0) {
                        this.finish();
                        return;
                    }
                    if (!com.google.android.finsky.m.a.dj().a(12640676)) {
                        this.finish();
                        return;
                    }
                    this.R.animate().setListener(0).alpha(1065353216).start();
                    this.N = 0;
                    return;
                }
                this.setResult(-1);
                this.startActivity(this.G.x_());
                this.finish();
                return;
            }
            if (p0 != 20) {
                this.finish();
                return;
            }
            super.onActivityResult(p0, p1, p2);
        }
    }

    public void onBackPressed() {
        if (this.P != 0 && this.G != 0)
            this.C.b(new com.google.android.finsky.d.d(this.G).a(600));
        super.onBackPressed();
    }

    protected void onCreate(Bundle p0) {
        v2 = 0;
        super.onCreate(p0);
        if (p0 == 0 && !(this.getIntent().getFlags() & 1048576))
            v0 = 1;
        else
            v0 = 0;
        this.U = v0;
        this.M = com.google.android.finsky.m.a.E();
        v0 = com.google.android.finsky.m.a.dj();
        if (!v0.a(12630398))
            v2 = 1;
        this.P = v2;
        this.Q = v0.a(12631898);
        this.S = p0;
        if (this.M()) {
            if (this.S != 0)
                this.L.a = 1;
            this.L.a();
            com.google.android.finsky.m.a.dc().l();
        }
        this.B();
        if (!this.C())
            this.D();
    }

    protected void onPause() {
        super.onPause();
        if (this.T != 0) {
            this.unregisterReceiver(this.T);
            this.T = 0;
        }
        if (this.M()) {
            if (this.z != 0) {
                if (this.N())
                    v0 = 1732;
                else
                    v0 = 1727;
                this.L.a(this.C, v0, -1, "user_interruption");
            }
            this.L.a = 1;
        }
    }

    protected void onRestoreInstanceState(Bundle p0) {
        super.onRestoreInstanceState(p0);
        if (p0.getBoolean("dialog_hidden"))
            this.a(1, 0);
    }

    protected void onResume() {
        if (this.P != 0) {
            this.T = new com.google.android.finsky.activities.dt(this);
            this.registerReceiver(this.T, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        if (this.M())
            this.L.a();
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putBoolean("dialog_hidden", this.N);
    }

    protected void onStart() {
        if (this.M()) {
            this.L.a();
            if (this.N())
                v0 = 1729;
            else
                v0 = 1724;
            this.L.a(this.C, v0);
        }
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
        if (this.M()) {
            if (this.N())
                v0 = 1731;
            else
                v0 = 1726;
            this.L.a(this.C, v0);
            this.L.a = 1;
        }
    }

    protected final void t() {
        if (this.Q == 0)
            super.t();
    }

    protected final void u() {
        if (this.Q == 0)
            super.u();
    }

    protected final void w() {
        this.J();
    }

    public final com.google.android.finsky.navigationmanager.a y_() {
        if (this.K == 0)
            this.K = com.google.android.finsky.m.a.k().b(this);
        return this.K;
    }

    public final void z() {
    }

}

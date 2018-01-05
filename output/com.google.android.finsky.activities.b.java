package com.google.android.finsky.activities;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.cr;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.am.a;
import com.google.android.finsky.am.c;
import com.google.android.finsky.as.b;
import com.google.android.finsky.as.e;
import com.google.android.finsky.ba.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.br.b;
import com.google.android.finsky.by.c;
import com.google.android.finsky.cg.e;
import com.google.android.finsky.cs.e;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.e;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.deviceconfig.e;
import com.google.android.finsky.dg.a;
import com.google.android.finsky.dl.a;
import com.google.android.finsky.dp.c;
import com.google.android.finsky.dr.a;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.externalreferrer.d;
import com.google.android.finsky.flushlogs.a;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.l.a;
import com.google.android.finsky.m;
import com.google.android.finsky.o;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.recoverymode.a;
import com.google.android.finsky.setup.VpaService;
import com.google.android.finsky.tos.e;
import com.google.android.finsky.unauthenticated.UnauthenticatedMainActivity;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.be;
import com.google.android.finsky.volley.e;
import com.google.android.play.dfe.api.d;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.k;

public class com.google.android.finsky.activities.b extends android.support.v7.app.aa implements com.google.android.finsky.activities.s, com.google.android.finsky.pagesystem.i
{

    public static boolean F;
    public boolean A;
    public boolean B;
    public com.google.android.finsky.d.w C;
    public final com.google.android.finsky.dx.a D;
    public final com.google.android.finsky.accounts.a E;
    public final Handler c;
    public com.google.android.finsky.am.a q;
    public com.google.android.finsky.am.c r;
    public final com.google.android.finsky.cg.e s;
    public final com.google.android.finsky.d.a t;
    public boolean u;
    public boolean v;
    public Runnable w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        com.google.android.finsky.activities.b.F = 0;
    }

    b() {
        android.support.v7.app.aa();
        this.c = new Handler(Looper.getMainLooper());
        this.s = new com.google.android.finsky.cg.e();
        this.t = com.google.android.finsky.m.a.aR();
        this.u = 0;
        this.y = 0;
        this.z = 0;
        this.B = 0;
        this.D = com.google.android.finsky.m.a.au();
        this.E = com.google.android.finsky.m.a.U();
    }

    private static Bundle a(Context p0) {
        v0 = new Bundle();
        v0.putParcelable("pendingIntent", PendingIntent.getBroadcast(p0, 0, new Intent(), 0));
        v0.putString("introMessage", p0.getString(2131951661));
        v0.putBoolean("allowSkip", 0);
        return v0;
    }

    private final void k() {
        this.startActivityForResult(AccountManager.newChooseAccountIntent(com.google.android.finsky.m.a.da(), 0, this.E.c(), 1, 0, "androidmarket", 0, com.google.android.finsky.activities.b.a(this)), 23);
        this.C.a(new com.google.android.finsky.d.p().a(310));
    }

    static void s() {
        com.google.android.finsky.m.a.o().a();
        if (!((Boolean)com.google.android.finsky.aa.a.u.a()).booleanValue()) {
            v2 = new Object[1];
            v2[0] = Boolean.valueOf(com.google.android.finsky.m.a.bP().a());
            FinskyLog.a("Canceling holdoff. Provisioned=%b", v2);
            com.google.android.finsky.aa.a.u.a(Boolean.valueOf(1));
        }
    }

    protected final void a(Account p0, Intent p1, boolean p2, String p3) {
        this.w = 0;
        if (p0 == 0) {
            if (this.E.a(com.google.android.finsky.m.a.db()))
                p0 = com.google.android.finsky.m.a.da();
            else
                p0 = this.E.b();
        }
        this.b(p3);
        if (p1 != 0)
            this.setIntent(p1);
        else {
            v1 = new Intent(this, MainActivity);
            v1.setAction("android.intent.action.MAIN");
            this.setIntent(v1);
        }
        if (p2 != 0)
            com.google.android.finsky.m.a.bk().a(0, p3);
        com.google.android.finsky.m.a.a(0);
        com.google.android.finsky.m.a.U().c(p0);
        if (p0 == 0)
            this.x();
        else
            this.d(1);
    }

    protected final void a(Intent p0) {
        super.onNewIntent(p0);
    }

    protected void a(VolleyError p0) {
    }

    public final void a(Runnable p0) {
        if (this.x == 0)
            p0.run();
        else
            this.w = p0;
    }

    protected void a(String p0, Intent p1) {
        com.google.android.finsky.m.a.dc().a(new com.google.android.finsky.d.c(406).b(Integer.valueOf(0)).a(Integer.valueOf(0)).b(0).a, 0, -1);
        v0 = this.E.b(p0);
        if (v0 == 0) {
            v2 = new Object[1];
            v2[0] = FinskyLog.a(p0);
            throw new IllegalArgumentException(String.format("Error, could not switch to %s because the account could not be found on the device", v2));
        }
        this.a(v0, p1, 0, "account_switched");
    }

    public final void a_(String p0) {
        this.a(new com.google.android.finsky.activities.i(this, p0));
    }

    protected void b(String p0) {
    }

    public void b(boolean p0) {
        this.z = 0;
        this.A = 1;
    }

    final void c(boolean p0) {
        if (!com.google.android.finsky.m.a.dj().a(12625988))
            com.google.android.finsky.activities.b.s();
        else
            this.c.postDelayed(new com.google.android.finsky.activities.j(), (long)((Integer)com.google.android.finsky.aa.b.gG.b()).intValue());
        this.u();
        this.c.post(new com.google.android.finsky.activities.k(this, p0));
    }

    protected final void d(boolean p0) {
        v1 = 1;
        v3 = 0;
        this.t();
        this.z = 1;
        this.A = 0;
        v2 = this.q();
        if (v2 == 0) {
            if (com.google.android.finsky.dr.a.a(com.google.android.finsky.m.a.T(), com.google.android.finsky.m.a.O(), com.google.android.finsky.m.a.aN()) && com.google.android.finsky.dr.a.a(com.google.android.finsky.m.a.O(), com.google.android.finsky.m.a.aN())) {
                v0 = new Intent(this, UnauthenticatedMainActivity);
                this.C.a(0).a(v0);
                this.startActivity(v0);
                this.finish();
            }
            else
                AccountManager.get(this).addAccount(this.E.c()[0], "androidmarket", 0, com.google.android.finsky.activities.b.a(this), 0, new com.google.android.finsky.activities.g(this), 0);
            if (p0 != 0) {
                v0 = this.getIntent();
                if ("android.intent.action.VIEW".equals(v0.getAction())) {
                    v1 = v0.getDataString();
                    if (v1 != 0 && !v0.getBooleanExtra("dont_resolve_again", 0)) {
                        v0 = com.google.android.finsky.utils.be.a(Uri.parse(v1));
                        com.google.android.finsky.m.a.dc().a(new com.google.android.finsky.d.e(12).a(v0.toString()).b(0).c(com.google.android.finsky.m.a.E().a(v0)).d(0).a(0).a, -1);
                    }
                }
            }
        }
        else {
            if (!v2.equals(com.google.android.finsky.m.a.db()))
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                if (p0 != 0)
                    v3 = this.getIntent();
                this.a(v2, v3);
            }
            else {
                if (!this.E.a(v2)) {
                    if (p0 != 0)
                        v0 = this.getIntent();
                    else
                        v0 = 0;
                    this.a(0, v0, 0, "account_switched");
                }
                v2 = com.google.android.finsky.m.a.af();
                v3 = com.google.android.finsky.m.a.ag();
                if ((v2.a()) || v3.c())
                    v0 = 1;
                else
                    v0 = 0;
                if (v0 != 0) {
                    v2.b();
                    v3.d();
                    if (!v3.b("Phenotype", "enable_cache_clearing_ps_exp", com.google.android.finsky.m.a.cZ()) || !((Boolean)com.google.android.finsky.aa.a.aB.a()).booleanValue())
                        v1 = 0;
                    if ((com.google.android.finsky.m.a.dj().a(12642551)) || (((Boolean)com.google.android.finsky.aa.a.az.a()).booleanValue()) || v1 != 0 || ((Boolean)com.google.android.finsky.aa.b.ip.b()).booleanValue())
                        com.google.android.finsky.m.a.bk().a(new com.google.android.finsky.activities.l(this, p0), "stale_experiments");
                    else
                        this.e(p0);
                }
                else
                    this.e(p0);
            }
        }
    }

    final void e(boolean p0) {
        this.D.a(this.q());
        com.google.android.finsky.m.a.I().a(0);
        com.google.android.finsky.m.a.ah().a(0);
        v4 = com.google.android.finsky.m.a.ap();
        com.google.android.finsky.m.a.R().a(v4, 1, 1, new com.google.android.finsky.activities.m(this, new boolean[1], com.google.android.finsky.m.a.dj(), v4, com.google.android.finsky.m.a.db(), p0));
        this.w();
    }

    protected final void f(boolean p0) {
        v0 = com.google.android.finsky.m.a.dj();
        if (!v0.a(12632536) && !v0.a(12632718) && !v0.a(12633335))
            com.google.android.finsky.m.a.aq().a(new com.google.android.finsky.activities.p(), new com.google.android.finsky.activities.q(), 0);
        if (this.D.c(this.q())) {
            v0 = new boolean[1];
            v0[0] = 1;
            v1 = new com.google.android.finsky.activities.d(this, v0, p0);
            this.D.a(v1);
            new Handler(this.getMainLooper()).postDelayed(new com.google.android.finsky.activities.e(this, v0, v1, p0), 10000);
        }
        else
            this.g(p0);
    }

    final void g(boolean p0) {
        v0 = com.google.android.finsky.m.a.dn();
        if (v0 != 0 && com.google.android.finsky.m.a.S().a(this.q(), v0)) {
            this.r();
            v0 = 1;
        }
        else
            v0 = 0;
        if (v0 == 0) {
            v0 = new com.google.android.finsky.activities.f(this, p0);
            com.google.android.finsky.m.a.I().a(v0);
            com.google.android.finsky.m.a.ah().a(v0);
        }
    }

    public final com.google.android.finsky.d.w n() {
        return this.C;
    }

    public final void o() {
        this.finish();
    }

    public void onActivityResult(int p0, int p1, Intent p2) {
        switch (p0) {
            case 20:
                this.v = 0;
                if (p1 == 0) {
                    if (com.google.android.finsky.m.a.dj().a(12608498) && this.E.a().length > 1)
                        this.k();
                    else
                        this.finish();
                }
                else
                    this.u = 1;
                break;
            case 21:
                this.v = 0;
                if (this.E.b() == 0) {
                    FinskyLog.a("No new account added: Assume the user canceled and finish.", new Object[0]);
                    this.finish();
                }
                else {
                    this.C.a(new com.google.android.finsky.d.c(563));
                    this.u = 1;
                }
                break;
            case 22:
                if (p1 == 0)
                    this.k();
                else {
                    this.v = 0;
                    this.u = 1;
                }
                break;
            case 23:
                if (p1 == -1) {
                    v0 = p2.getStringExtra("authAccount");
                    if (v0 != 0) {
                        v2 = new Object[1];
                        v2[0] = FinskyLog.a(v0);
                        FinskyLog.a("b/5160617: Switch account to %s on resume", v2);
                        this.a_(v0);
                    }
                }
                else if (com.google.android.finsky.m.a.dj().a(12608498)) {
                    if (p1 == 0)
                        this.finish();
                }
                break;
            case 24:
                if (p1 == -1) {
                    com.google.android.finsky.m.a.Q().c = 1;
                    this.f(1);
                }
                else
                    this.finish();
                break;
            default:
                super.onActivityResult(p0, p1, p2);
                break;
        }
    }

    public void onCreate(Bundle p0) {
        ((com.google.android.finsky.o)com.google.android.finsky.providers.d.a(com.google.android.finsky.o)).a(this);
        v0 = com.google.android.finsky.m.a.bK();
        if (v0.b()) {
            super.onCreate(p0);
            v0.f();
            this.finish();
        }
        else {
            if (!this.getResources().getBoolean(2131492876))
                com.google.android.play.utils.k.c(this);
            if (p0 != 0) {
                this.v = p0.getBoolean("waiting_for_user_input");
                v0 = this.q();
                v1 = p0.getString("last_used_account");
                if (v0 == 0 || v1 != 0 && ((!v0.equals(v1)) || (com.google.android.finsky.m.a.af().a()) || com.google.android.finsky.m.a.ag().c()))
                    p0 = 0;
            }
            this.C = this.t.a(p0, this.getIntent(), this.y());
            super.onCreate(p0);
            if (!com.google.android.finsky.m.a.O().a()) {
                this.startActivity(com.google.android.finsky.m.a.bo().e(this));
                this.finish();
            }
            else {
                this.t();
                if (com.google.android.finsky.activities.b.F == 0) {
                    VpaService.a(com.google.android.finsky.m.a.b, com.google.android.finsky.m.a.I());
                    v0 = com.google.android.finsky.m.a.cj().a();
                    if (v0 != 0)
                        com.google.android.finsky.aa.a.aI.c();
                    if (v0 != 0 || com.google.android.finsky.m.a.cj().b()) {
                        FinskyLog.a("Diff version or system, clear token & cache", new Object[0]);
                        com.google.android.finsky.deviceconfig.e.a().a(com.google.android.finsky.m.a.ap());
                        com.google.android.finsky.m.a.bk().a(new com.google.android.finsky.activities.c(this), "system_or_phonesky_version_changed");
                    }
                    else
                        this.d(1);
                }
                else if (this.v == 0)
                    this.d(1);
                else
                    FinskyLog.a("Waiting for user to return from auth screen.", new Object[0]);
                com.google.android.finsky.activities.b.F = 1;
            }
        }
    }

    protected void onNewIntent(Intent p0) {
        super.onNewIntent(p0);
        this.setIntent(p0);
        v0 = 1;
        if ("android.intent.action.MAIN".equals(p0.getAction()) && p0.hasCategory("android.intent.category.LAUNCHER"))
            v0 = 0;
        this.d(v0);
    }

    protected void onPause() {
        super.onPause();
        com.google.android.finsky.m.a.aX().a();
    }

    public void onResume() {
        super.onResume();
        if (this.y != 0) {
            this.y = 0;
            this.c(this.B);
        }
        com.google.android.finsky.m.a.aX().c();
    }

    public void onSaveInstanceState(Bundle p0) {
        this.x = 1;
        p0.putBoolean("waiting_for_user_input", this.v);
        p0.putString("last_used_account", this.q());
        this.C.a(p0);
        super.onSaveInstanceState(p0);
    }

    public boolean onSearchRequested() {
        if (com.google.android.finsky.m.a.S().a() && super.onSearchRequested())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public void onStart() {
        super.onStart();
        com.google.android.finsky.cg.e.a();
        this.registerReceiver(this.s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.x = 0;
        if (this.q.a())
            this.r.b();
    }

    public void onStop() {
        super.onStop();
        this.unregisterReceiver(this.s);
        com.google.android.finsky.cg.e.a();
        this.x = 1;
    }

    public final boolean p() {
        return this.x;
    }

    final String q() {
        v0 = 0;
        v1 = this.getIntent().getStringExtra("authAccount");
        if (v1 != 0) {
            v2 = this.E.b(v1);
            if (v2 == 0) {
                v3 = new Object[1];
                v3[0] = v1;
                FinskyLog.e("This app was called with an intent that specified the account %s, which is not a valid account on this device", v3);
                this.finish();
            }
            else
                v0 = v2.name;
        }
        else {
            v1 = com.google.android.finsky.m.a.db();
            if (this.E.c(v1))
                v0 = v1;
            else {
                v1 = this.E.b();
                if (v1 != 0)
                    v0 = v1.name;
            }
        }
        return v0;
    }

    public void r() {
        this.v = 1;
        v0 = com.google.android.finsky.m.a.bo().a(this, this.q(), com.google.android.finsky.m.a.dn());
        v0.setFlags(67108864);
        this.startActivityForResult(v0, 20);
    }

    protected void t() {
        v0 = com.google.android.finsky.m.a.aN().dj();
        if (!v0.a(12639710) && (!v0.a(12639720) || this.getWindow().peekDecorView() != 0)) {
            v0 = this.getWindow().findViewById(2131755313);
            if ((ViewGroup)v0 != 0)
                ((ViewGroup)v0).findViewById(2131755378).setVisibility(0);
        }
    }

    protected void u() {
        v0 = this.getWindow().findViewById(2131755313);
        if ((ViewGroup)v0 != 0)
            ((ViewGroup)v0).findViewById(2131755378).setVisibility(8);
    }

    protected boolean v() {
        return 0;
    }

    protected void w() {
    }

    protected final void x() {
        this.w = 0;
        this.recreate();
    }

    protected com.google.android.finsky.d.w y() {
        return com.google.android.finsky.m.a.dd();
    }

    public void z_() {
        super.z_();
        this.x = 0;
        if (com.google.android.finsky.activities.r.b(this))
            com.google.android.finsky.activities.r.a(this.H_(), this);
        else
            com.google.android.finsky.activities.r.a(this.H_());
        if (this.w != 0)
            this.w.run();
        else if (this.u != 0) {
            this.u = 0;
            this.d(1);
        }
    }

}

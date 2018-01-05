package com.google.android.finsky.activities;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.aa;
import android.view.ViewGroup;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.am.C1226a;
import com.google.android.finsky.am.C1229c;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1550a;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.cg.C2278e;
import com.google.android.finsky.cs.C2376e;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dr.C2883a;
import com.google.android.finsky.dx.C1054h;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2476e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.pagesystem.C1035i;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.setup.VpaService;
import com.google.android.finsky.unauthenticated.UnauthenticatedMainActivity;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.be;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;

public class C1036b extends aa implements C1034s, C1035i {
    public static boolean f6313F = false;
    public boolean f6314A;
    public boolean f6315B = false;
    public C2495w f6316C;
    public final C2910a f6317D = C1473m.f7980a.au();
    public final C0986a f6318E = C1473m.f7980a.mo2041U();
    public final Handler f6319c = new Handler(Looper.getMainLooper());
    public C1226a f6320q;
    public C1229c f6321r;
    public final C2278e f6322s = new C2278e();
    public final C2471a f6323t = C1473m.f7980a.aR();
    public boolean f6324u = false;
    public boolean f6325v;
    public Runnable f6326w;
    public boolean f6327x;
    public boolean f6328y = false;
    public boolean f6329z = false;

    public void onCreate(Bundle bundle) {
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1701a(this);
        C3982a bK = C1473m.f7980a.bK();
        if (bK.mo3875b()) {
            super.onCreate(bundle);
            bK.mo3879f();
            finish();
            return;
        }
        if (!getResources().getBoolean(C7582R.bool.is_rtl_enabled)) {
            k.c(this);
        }
        if (bundle != null) {
            this.f6325v = bundle.getBoolean("waiting_for_user_input");
            String q = m6071q();
            String string = bundle.getString("last_used_account");
            if (q == null || (!(string == null || q.equals(string)) || C1473m.f7980a.af().mo2288a() || C1473m.f7980a.ag().mo2878c())) {
                bundle = null;
            }
        }
        this.f6316C = this.f6323t.m13181a(bundle, getIntent(), mo1289y());
        super.onCreate(bundle);
        if (C1473m.f7980a.mo2035O().m8838a()) {
            mo1250t();
            if (!f6313F) {
                VpaService.m19141a(C1473m.f7980a.f7981b, C1473m.f7980a.mo2029I());
                boolean a = C1473m.f7980a.cj().m14979a();
                if (a) {
                    C0954a.aI.m5765c();
                }
                boolean b = C1473m.f7980a.cj().m14980b();
                if (a || b) {
                    FinskyLog.m21659a("Diff version or system, clear token & cache", new Object[0]);
                    C2693e.m14552a().mo3112a(C1473m.f7980a.ap());
                    C1473m.f7980a.bk().mo4380a(new C1053c(this), "system_or_phonesky_version_changed");
                } else {
                    m6064d(true);
                }
            } else if (this.f6325v) {
                FinskyLog.m21659a("Waiting for user to return from auth screen.", new Object[0]);
            } else {
                m6064d(true);
            }
            f6313F = true;
            return;
        }
        startActivity(C1473m.f7980a.bo().mo2765e(this));
        finish();
    }

    public void onStart() {
        super.onStart();
        C2278e.m11747a();
        registerReceiver(this.f6322s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f6327x = false;
        if (this.f6320q.m7216a()) {
            this.f6321r.m7229b();
        }
    }

    public void z_() {
        super.z_();
        this.f6327x = false;
        if (C1129r.m6870b(this)) {
            C1129r.m6869a(H_(), this);
        } else {
            C1129r.m6868a(H_());
        }
        if (this.f6326w != null) {
            this.f6326w.run();
        } else if (this.f6324u) {
            this.f6324u = false;
            m6064d(true);
        }
    }

    public final void mo1229o() {
        finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f6327x = true;
        bundle.putBoolean("waiting_for_user_input", this.f6325v);
        bundle.putString("last_used_account", m6071q());
        this.f6316C.m13377a(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStop() {
        super.onStop();
        unregisterReceiver(this.f6322s);
        C2278e.m11747a();
        this.f6327x = true;
    }

    public void onResume() {
        super.onResume();
        if (this.f6328y) {
            this.f6328y = false;
            m6063c(this.f6315B);
        }
        C1473m.f7980a.aX().m16010c();
    }

    protected void onPause() {
        super.onPause();
        C1473m.f7980a.aX().m16007a();
    }

    public boolean onSearchRequested() {
        return C1473m.f7980a.mo2039S().m21204a() && super.onSearchRequested();
    }

    protected void mo1248a(VolleyError volleyError) {
    }

    public final boolean mo1232p() {
        return this.f6327x;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 20:
                this.f6325v = false;
                if (i2 != 0) {
                    this.f6324u = true;
                    return;
                } else if (!C1473m.f7980a.dj().mo2294a(12608498) || this.f6318E.mo1195a().length <= 1) {
                    finish();
                    return;
                } else {
                    mo1276k();
                    return;
                }
            case 21:
                this.f6325v = false;
                if (this.f6318E.mo1196b() == null) {
                    FinskyLog.m21659a("No new account added: Assume the user canceled and finish.", new Object[0]);
                    finish();
                    return;
                }
                this.f6316C.m13367a(new C2474c(563));
                this.f6324u = true;
                return;
            case 22:
                if (i2 == 0) {
                    mo1276k();
                    return;
                }
                this.f6325v = false;
                this.f6324u = true;
                return;
            case 23:
                if (i2 == -1) {
                    String stringExtra = intent.getStringExtra("authAccount");
                    if (stringExtra != null) {
                        FinskyLog.m21659a("b/5160617: Switch account to %s on resume", FinskyLog.m21655a(stringExtra));
                        a_(stringExtra);
                        return;
                    }
                    return;
                } else if (C1473m.f7980a.dj().mo2294a(12608498) && i2 == 0) {
                    finish();
                    return;
                } else {
                    return;
                }
            case 24:
                if (i2 == -1) {
                    C1473m.f7980a.mo2037Q().f8188c = true;
                    m6066f(true);
                    return;
                }
                finish();
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    public final void a_(String str) {
        m6059a(new C1074i(this, str));
    }

    private final void mo1276k() {
        startActivityForResult(AccountManager.newChooseAccountIntent(C1473m.f7980a.da(), null, this.f6318E.mo1185c(), true, null, "androidmarket", null, C1036b.m6053a((Context) this)), 23);
        this.f6316C.m13370a(new C2488p().m13340a(310));
    }

    protected void mo1266b(String str) {
    }

    protected final void m6057a(Intent intent) {
        super.onNewIntent(intent);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        boolean z = true;
        if ("android.intent.action.MAIN".equals(intent.getAction()) && intent.hasCategory("android.intent.category.LAUNCHER")) {
            z = false;
        }
        m6064d(z);
    }

    public void mo1249b(boolean z) {
        this.f6329z = false;
        this.f6314A = true;
    }

    protected final void m6056a(Account account, Intent intent, boolean z, String str) {
        this.f6326w = null;
        if (account == null) {
            if (this.f6318E.mo1194a(C1473m.f7980a.db())) {
                account = C1473m.f7980a.da();
            } else {
                account = this.f6318E.mo1196b();
            }
        }
        C1473m c1473m = C1473m.f7980a;
        mo1266b(str);
        if (intent != null) {
            setIntent(intent);
        } else {
            Intent intent2 = new Intent(this, MainActivity.class);
            intent2.setAction("android.intent.action.MAIN");
            setIntent(intent2);
        }
        if (z) {
            c1473m.bk().mo4380a(null, str);
        }
        c1473m.mo2057a(null);
        c1473m.mo2041U().mo1198c(account);
        if (account == null) {
            m6077x();
        } else {
            m6064d(true);
        }
    }

    final String m6071q() {
        String stringExtra = getIntent().getStringExtra("authAccount");
        if (stringExtra != null) {
            Account b = this.f6318E.mo1183b(stringExtra);
            if (b != null) {
                return b.name;
            }
            FinskyLog.m21669e("This app was called with an intent that specified the account %s, which is not a valid account on this device", stringExtra);
            finish();
            return null;
        }
        stringExtra = C1473m.f7980a.db();
        if (this.f6318E.mo1184c(stringExtra)) {
            return stringExtra;
        }
        Account b2 = this.f6318E.mo1196b();
        if (b2 != null) {
            return b2.name;
        }
        return null;
    }

    public void mo2504r() {
        this.f6325v = true;
        Intent a = C1473m.f7980a.bo().mo2746a((Context) this, m6071q(), C1473m.f7980a.dn());
        a.setFlags(67108864);
        startActivityForResult(a, 20);
    }

    final void m6063c(boolean z) {
        if (C1473m.f7980a.dj().mo2294a(12625988)) {
            this.f6319c.postDelayed(new C1093j(), (long) ((Integer) C0955b.gG.m28964b()).intValue());
        } else {
            C1036b.m6055s();
        }
        mo1251u();
        this.f6319c.post(new C1094k(this, z));
    }

    static void m6055s() {
        C1473m.f7980a.mo2256o().mo3428a();
        C0957n c0957n = C0954a.f5851u;
        if (!((Boolean) c0957n.m5760a()).booleanValue()) {
            FinskyLog.m21659a("Canceling holdoff. Provisioned=%b", Boolean.valueOf(C1473m.f7980a.bP().m14775a()));
            c0957n.m5763a(Boolean.valueOf(true));
        }
    }

    protected void mo1250t() {
        C1552e dj = C1473m.f7980a.aN().dj();
        if ((!dj.mo2294a(12639710) && !dj.mo2294a(12639720)) || getWindow().peekDecorView() != null) {
            ViewGroup viewGroup = (ViewGroup) getWindow().findViewById(C7582R.id.content_frame);
            if (viewGroup != null) {
                viewGroup.findViewById(C7582R.id.placeholder_loading).setVisibility(0);
            }
        }
    }

    protected void mo1251u() {
        ViewGroup viewGroup = (ViewGroup) getWindow().findViewById(C7582R.id.content_frame);
        if (viewGroup != null) {
            viewGroup.findViewById(C7582R.id.placeholder_loading).setVisibility(8);
        }
    }

    protected final void m6064d(boolean z) {
        boolean z2 = true;
        Intent intent = null;
        mo1250t();
        this.f6329z = true;
        this.f6314A = false;
        String q = m6071q();
        if (q == null) {
            Intent intent2;
            C1473m c1473m = C1473m.f7980a;
            if (C2883a.m15119a(c1473m.mo2040T(), c1473m.mo2035O(), c1473m.aN()) && C2883a.m15120a(c1473m.mo2035O(), c1473m.aN())) {
                intent2 = new Intent(this, UnauthenticatedMainActivity.class);
                this.f6316C.m13366a(null).m13376a(intent2);
                startActivity(intent2);
                finish();
            } else {
                AccountManager.get(this).addAccount(this.f6318E.mo1185c()[0], "androidmarket", null, C1036b.m6053a((Context) this), null, new C1066g(this), null);
            }
            if (z) {
                intent2 = getIntent();
                if ("android.intent.action.VIEW".equals(intent2.getAction())) {
                    String dataString = intent2.getDataString();
                    if (dataString != null && !intent2.getBooleanExtra("dont_resolve_again", false)) {
                        Uri a = be.m21799a(Uri.parse(dataString));
                        c1473m.dc().m13322a(new C2476e(12).m13262a(a.toString()).m13264b(null).m13265c(c1473m.mo2025E().m15594a(a)).m13266d(null).m13263a(null).f13346a, -1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z3;
        if (q.equals(C1473m.f7980a.db())) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            if (z) {
                intent = getIntent();
            }
            mo1264a(q, intent);
            return;
        }
        if (!this.f6318E.mo1194a(q)) {
            m6056a(null, z ? getIntent() : null, false, "account_switched");
        }
        C1550a af = C1473m.f7980a.af();
        C2376e ag = C1473m.f7980a.ag();
        if (af.mo2288a() || ag.mo2878c()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            af.mo2289b();
            ag.mo2879d();
            if (!(ag.mo2877b("Phenotype", "enable_cache_clearing_ps_exp", C1473m.f7980a.cZ()) && ((Boolean) C0954a.aB.m5760a()).booleanValue())) {
                z2 = false;
            }
            if (C1473m.f7980a.dj().mo2294a(12642551) || ((Boolean) C0954a.az.m5760a()).booleanValue() || r1 || ((Boolean) C0955b.ip.m28964b()).booleanValue()) {
                C1473m.f7980a.bk().mo4380a(new C1095l(this, z), "stale_experiments");
                return;
            }
        }
        m6065e(z);
    }

    final void m6065e(boolean z) {
        this.f6317D.m15183a(m6071q());
        C1473m.f7980a.mo2029I().m17248a(null);
        C1473m.f7980a.ah().mo2815a(null);
        boolean[] zArr = new boolean[1];
        C1254c ap = C1473m.f7980a.ap();
        C1473m.f7980a.mo2038R().m15108a(ap, true, true, new C1097m(this, zArr, C1473m.f7980a.dj(), ap, C1473m.f7980a.db(), z));
        mo1252w();
    }

    protected boolean mo1280v() {
        return false;
    }

    protected void mo1252w() {
    }

    protected final void m6066f(boolean z) {
        C1552e dj = C1473m.f7980a.dj();
        if (!(dj.mo2294a(12632536) || dj.mo2294a(12632718) || dj.mo2294a(12633335))) {
            C1473m.f7980a.aq().mo5377a(new C1126p(), new C1127q(), false);
        }
        if (this.f6317D.m15192c(m6071q())) {
            boolean[] zArr = new boolean[]{true};
            C1054h c1055d = new C1055d(this, zArr, z);
            this.f6317D.m15182a(c1055d);
            new Handler(getMainLooper()).postDelayed(new C1059e(this, zArr, c1055d, z), 10000);
            return;
        }
        m6067g(z);
    }

    final void m6067g(boolean z) {
        Object obj;
        DfeToc dn = C1473m.f7980a.dn();
        if (dn == null || !C1473m.f7980a.mo2039S().m21205a(m6071q(), dn)) {
            obj = null;
        } else {
            mo2504r();
            obj = 1;
        }
        if (obj == null) {
            Runnable c1065f = new C1065f(this, z);
            C1473m.f7980a.mo2029I().m17248a(c1065f);
            C1473m.f7980a.ah().mo2815a(c1065f);
        }
    }

    protected void mo1264a(String str, Intent intent) {
        C2482j dc = C1473m.f7980a.dc();
        Integer valueOf = Integer.valueOf(0);
        dc.m13320a(new C2474c(406).m13243b(valueOf).m13235a(Integer.valueOf(0)).m13244b(null).f13342a, null, -1);
        Account b = this.f6318E.mo1183b(str);
        if (b == null) {
            throw new IllegalArgumentException(String.format("Error, could not switch to %s because the account could not be found on the device", new Object[]{FinskyLog.m21655a(str)}));
        } else {
            m6056a(b, intent, false, "account_switched");
        }
    }

    private static Bundle m6053a(Context context) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("pendingIntent", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        bundle.putString("introMessage", context.getString(C7582R.string.account_required_external));
        bundle.putBoolean("allowSkip", false);
        return bundle;
    }

    public final void m6059a(Runnable runnable) {
        if (this.f6327x) {
            this.f6326w = runnable;
        } else {
            runnable.run();
        }
    }

    protected final void m6077x() {
        this.f6326w = null;
        recreate();
    }

    protected C2495w mo1289y() {
        return C1473m.f7980a.dd();
    }

    public final C2495w m6068n() {
        return this.f6316C;
    }
}

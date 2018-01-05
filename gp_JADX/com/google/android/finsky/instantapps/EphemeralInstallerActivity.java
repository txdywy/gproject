package com.google.android.finsky.instantapps;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ApplicationErrorReport.CrashInfo;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.os.C0327a;
import android.support.v7.app.aa;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.finsky.instantapps.appmanagement.C3403w;
import com.google.android.finsky.instantapps.install.C3501e;
import com.google.android.finsky.instantapps.p212d.C3373z;
import com.google.android.finsky.instantapps.p212d.C3425c;
import com.google.android.finsky.instantapps.p212d.C3433j;
import com.google.android.finsky.instantapps.p212d.C3434k;
import com.google.android.finsky.instantapps.p212d.C3436m;
import com.google.android.finsky.instantapps.p212d.C3438n;
import com.google.android.finsky.instantapps.p212d.C3449y;
import com.google.android.finsky.instantapps.p212d.ak;
import com.google.android.finsky.instantapps.p213a.C3377b;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.instantapps.p218e.C3452a;
import com.google.android.finsky.instantappsbackendclient.C3565a;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4680k;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.instantapps.p288b.C5261a;
import com.google.android.instantapps.common.atom.AtomId;
import com.google.android.instantapps.common.atom.AtomReference;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.loading.C5805a;
import com.google.android.instantapps.common.loading.ui.C3374f;
import com.google.android.instantapps.common.loading.ui.C5820e;
import com.google.android.instantapps.common.loading.ui.C5822h;
import com.google.android.instantapps.common.loading.ui.C5838x;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p217e.bk;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p221d.p222a.C5718h;
import com.google.android.instantapps.common.p221d.p222a.C5735z;
import com.google.android.instantapps.common.p221d.p222a.ad;
import com.google.android.instantapps.common.p221d.p222a.af;
import com.google.android.instantapps.common.p318g.C5771a;
import com.google.android.p306h.p307a.p308a.C5684u;
import com.squareup.leakcanary.C7582R;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p002a.C0002a;

public class EphemeralInstallerActivity extends aa implements C3373z, C3374f {
    public C5735z f17283A;
    public C3452a f17284B;
    public C5785k f17285C;
    public C3433j f17286D;
    public bf f17287E;
    public bf f17288F;
    public boolean f17289G;
    public C0002a f17290H;
    public bf f17291I;
    public af f17292J;
    public Handler f17293K;
    public C5820e f17294L;
    public C3438n f17295M;
    public C3425c f17296N;
    public C3436m f17297O;
    public SharedPreferences f17298P;
    public UncaughtExceptionHandler f17299q;
    public C5710a f17300r;
    public C3377b f17301s;
    public Executor f17302t;
    public C5771a f17303u;
    public C3600b f17304v;
    public C5718h f17305w;
    public bk f17306x;
    public com.google.android.finsky.instantapps.p212d.aa f17307y;
    public C3403w f17308z;

    private final void m16843o() {
        if (this.f17295M != null && this.f17295M.f17601o.get()) {
            C3438n c3438n = this.f17295M;
            c3438n.f17601o.set(false);
            C3501e c3501e = (C3501e) c3438n.f17602p.get();
            if (c3501e != null) {
                c3501e.mo3539b();
            }
        }
        this.f17295M = null;
        this.f17297O = null;
    }

    protected void onCreate(Bundle bundle) {
        long a = C4678i.m21812a();
        super.onCreate(bundle);
        PhenotypeUpdateService.m16867b(this);
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3506a(this);
        m16844p();
        C3436m a2 = C3434k.m16979a(getIntent());
        if (C0327a.m1722b()) {
            af c5710a;
            String str = a2.f17582b;
            SharedPreferences sharedPreferences = getSharedPreferences("EphemeralInstallerActivity-currentLoggingContext", 0);
            if (sharedPreferences.contains(str)) {
                long j = sharedPreferences.getLong(str, -1);
                if (j == -1) {
                    throw new RuntimeException("Launch logging context stored without context ID");
                }
                c5710a = new C5710a(this.f17300r, true, j);
            } else {
                c5710a = this.f17300r.m26982b();
                sharedPreferences.edit().clear().putLong(str, c5710a.m26983c()).apply();
            }
            this.f17292J = c5710a;
            c5710a = this.f17292J;
            C5684u c5684u = new C5684u();
            c5684u.f28831k = a2.f17582b;
            c5684u.f28824d = a2.m16986e();
            c5684u.f28825e = a2.m16987f();
            c5684u.f28821a = a2.m16988g();
            c5684u.f28830j = a2.m16984c();
            c5710a.mo5138a(c5684u);
            this.f17296N = this.f17286D.m16978a((Activity) this, this.f17292J);
            c5710a = this.f17292J;
            ad adVar = new ad(1650);
            adVar.f28914g = a;
            c5710a.mo5139a(adVar.m26987a());
            if (a2.m16983b()) {
                this.f17292J.mo5136a(1639);
            }
            this.f17298P = getSharedPreferences("lastInstantAppLaunchRequest", 0);
            this.f17293K = new Handler(getMainLooper());
            if (this.f17301s.mo3520a()) {
                m16842a(a2);
                return;
            }
            this.f17292J.mo5136a(1602);
            finish();
            return;
        }
        this.f17300r.mo5136a(1632);
        finish();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m16842a(C3434k.m16979a(intent));
    }

    protected void onResume() {
        super.onResume();
        m16844p();
    }

    protected void onPause() {
        super.onPause();
        Thread.setDefaultUncaughtExceptionHandler(this.f17299q);
        this.f17299q = null;
    }

    protected void onDestroy() {
        super.onDestroy();
        m16843o();
    }

    public final void mo3493c(int i) {
        if (i != 1 || this.f17296N == null) {
            m16852d(2511);
        } else {
            this.f17296N.m16969a(this.f17297O);
        }
    }

    public final void mo3494k() {
        this.f17292J.mo5136a(1603);
        if (!isFinishing()) {
            if (this.f17297O.f17584d) {
                finish();
                return;
            }
            C3403w c3403w = this.f17308z;
            c3403w.f17419a.edit().putBoolean(this.f17297O.m16986e(), true).apply();
            this.f17304v.m17195a(this.f17297O.m16986e(), false);
            try {
                C3436m c3436m = this.f17297O;
                if (c3436m.f17584d) {
                    throw new IllegalStateException("Launch intent has already been sent.");
                }
                c3436m.f17585e.sendIntent(this, 0, null, null, null);
                c3436m.f17584d = true;
                this.f17292J.mo5136a(1658);
                m16852d(2503);
                overridePendingTransition(0, 0);
            } catch (Throwable e) {
                af afVar = this.f17292J;
                ad adVar = new ad(1635);
                adVar.f28909b = new CrashInfo(e);
                afVar.mo5139a(adVar.m26987a());
                Log.e("EphemeralInstallerAct", "Failed to notify the platform of the successful install.", e);
            }
        }
    }

    public final void mo3495l() {
        this.f17294L.mo5166a(3);
        this.f17295M.m17002c();
    }

    private final void m16842a(C3436m c3436m) {
        if (!(this.f17297O == null || this.f17297O.f17582b.equals(c3436m.f17582b))) {
            m16843o();
        }
        this.f17297O = c3436m;
        C3436m c3436m2 = this.f17297O;
        Object obj = (c3436m2.f17581a != null && "android.intent.action.VIEW".equals(c3436m2.f17581a.getAction()) && c3436m2.f17581a.hasCategory("android.intent.category.BROWSABLE") && !c3436m2.f17581a.hasExtra("android.intent.extra.EPHEMERAL_SUCCESS") && c3436m2.f17581a.hasExtra("android.intent.extra.PACKAGE_NAME") && c3436m2.f17581a.hasExtra("android.intent.extra.VERSION_CODE") && c3436m2.f17581a.hasExtra("android.intent.extra.EPHEMERAL_FAILURE")) ? 1 : null;
        if (obj != null) {
            this.f17292J.mo5136a(2901);
            if (this.f17296N != null) {
                this.f17296N.m16969a(this.f17297O);
                return;
            }
            return;
        }
        c3436m2 = this.f17297O;
        obj = (c3436m2.m16982a() || (c3436m2.f17583c && c3436m2.f17581a.hasExtra("android.intent.extra.EPHEMERAL_HOSTNAME"))) ? 1 : null;
        if (obj == null) {
            Log.e("EphemeralInstallerAct", "Unrecognized intent; finishing.");
            m16852d(-1);
            return;
        }
        C5820e c5820e;
        String str = "EphemeralInstallerAct";
        String str2 = "Handling loading intent for token ";
        String valueOf = String.valueOf(this.f17297O.f17582b);
        Log.v(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.f17292J.mo5136a(1610);
        boolean b = this.f17297O.m16983b();
        ab H_ = H_();
        this.f17292J.mo5136a(1607);
        C5820e c5820e2 = (C5820e) H_.mo283a("loadingFragment");
        if (c5820e2 == null) {
            Fragment c5838x;
            this.f17283A.m27040a(this.f17292J);
            obj = b ? 2 : 1;
            af afVar = this.f17292J;
            switch (obj) {
                case 2:
                    c5838x = new C5838x();
                    break;
                default:
                    c5838x = new C5822h();
                    break;
            }
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            afVar.mo5137a(bundle2);
            bundle.putBundle("ARG_LOGGING_CONTEXT", bundle2);
            bundle.putBoolean("ARG_INITIALLY_HIDDEN", false);
            c5838x.m600f(bundle);
            this.f17292J.mo5136a(1609);
            H_.mo284a().mo326a(16908290, c5838x, "loadingFragment").mo339e();
            c5820e = c5838x;
        } else {
            this.f17292J.mo5136a(1608);
            c5820e = c5820e2;
        }
        if (c5820e instanceof C5822h) {
            C5805a.f29260a.mo3519a((C5822h) c5820e);
        }
        c5820e.mo5163Y();
        c5820e.mo5164Z();
        this.f17294L = c5820e;
        obj = this.f17297O.m16984c();
        if (!TextUtils.isEmpty(obj)) {
            this.f17294L.mo5171b(obj);
        }
        if (this.f17297O.m16982a()) {
            this.f17292J.mo5136a(1611);
            str = "EphemeralInstallerAct";
            str2 = "Handling install intent for token ";
            valueOf = String.valueOf(this.f17297O.f17582b);
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            Log.v(str, valueOf);
            String e = this.f17297O.m16986e();
            str = this.f17297O.f17581a.getStringExtra("android.intent.extra.SPLIT_NAME");
            int intValue = this.f17297O.m16987f().intValue();
            Integer valueOf2 = Integer.valueOf(intValue);
            long j = this.f17298P.getLong("launchTime", Long.MIN_VALUE);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j <= elapsedRealtime && j + 1000 >= elapsedRealtime && TextUtils.equals(this.f17298P.getString("splitNames", null), str) && TextUtils.equals(this.f17298P.getString("packageName", null), e) && this.f17298P.getInt("versionCode", -1) == valueOf2.intValue()) {
                Log.w("EphemeralInstallerAct", "Looks like we might be in a launch loop, cancelling launch.");
                obj = 1;
            } else {
                this.f17298P.edit().putString("packageName", e).putString("splitNames", str).putInt("versionCode", valueOf2.intValue()).putLong("launchTime", elapsedRealtime).apply();
                obj = null;
            }
            if (obj != null) {
                this.f17283A.m27041a(this.f17292J, 2504);
                finish();
                return;
            }
            this.f17294L.mo5168a(new AtomReference(new AtomId(e, ""), "", new byte[0]));
            Object[] a = TextUtils.isEmpty(str) ? new String[]{""} : C4680k.m21818a(str);
            if (this.f17289G) {
                this.f17302t.execute(new C3408b(this));
            }
            com.google.android.finsky.instantapps.p212d.aa aaVar = this.f17307y;
            this.f17295M = new C3438n((C3449y) com.google.android.finsky.instantapps.p212d.aa.m16948a((C3449y) aaVar.f17502a.mo1a(), 1), (C5785k) com.google.android.finsky.instantapps.p212d.aa.m16948a((C5785k) aaVar.f17503b.mo1a(), 2), (C3434k) com.google.android.finsky.instantapps.p212d.aa.m16948a((C3434k) aaVar.f17504c.mo1a(), 3), (Handler) com.google.android.finsky.instantapps.p212d.aa.m16948a((Handler) aaVar.f17505d.mo1a(), 4), (bf) com.google.android.finsky.instantapps.p212d.aa.m16948a((bf) aaVar.f17506e.mo1a(), 5), (ak) com.google.android.finsky.instantapps.p212d.aa.m16948a((ak) aaVar.f17507f.mo1a(), 6), (C3373z) com.google.android.finsky.instantapps.p212d.aa.m16948a(this, 7), (String) com.google.android.finsky.instantapps.p212d.aa.m16948a(this.f17297O.m16984c(), 8), (String) com.google.android.finsky.instantapps.p212d.aa.m16948a(e, 9), intValue, (List) com.google.android.finsky.instantapps.p212d.aa.m16948a(Arrays.asList(a), 11), (af) com.google.android.finsky.instantapps.p212d.aa.m16948a(this.f17292J, 12), this.f17297O.m16983b());
            this.f17292J.mo5136a(1651);
            this.f17295M.m17000a(false);
            return;
        }
        str = this.f17297O.f17582b;
        str2 = this.f17297O.m16986e();
        Log.v("EphemeralInstallerAct", new StringBuilder((String.valueOf(str).length() + 62) + String.valueOf(str2).length()).append("Loading intent, holding off on install for token ").append(str).append(" packageName:").append(str2).toString());
    }

    public final void mo3489a(Intent intent) {
        startActivityForResult(intent, 1);
        this.f17292J.mo5136a(1659);
    }

    public final void mo3491a(String str) {
        this.f17303u.f29178a = str;
        this.f17294L.mo5169a(str);
        if (((Boolean) this.f17288F.mo5158a()).booleanValue()) {
            PhenotypeUpdateService.m16866a((Context) this);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3492b(boolean r9) {
        /*
        r8 = this;
        r1 = 1;
        r2 = 0;
        r0 = new com.google.android.instantapps.common.e.b;
        r0.<init>();
        r3 = "";
        r0 = r0.mo5151a(r3);
        r3 = "";
        r0 = r0.mo5154b(r3);
        r0 = r0.mo5152a(r2);
        r0 = r0.mo5150a();
        r0 = r0.mo5155b(r2);
        r0 = r0.mo5156c(r2);
        r3 = r0.mo5157d(r2);
        r0 = r8.f17297O;
        r0 = r0.m16986e();
        if (r0 != 0) goto L_0x008f;
    L_0x002f:
        r0 = "";
    L_0x0031:
        r3 = r3.mo5151a(r0);
        r0 = r8.f17297O;
        r0 = r0.m16988g();
        if (r0 != 0) goto L_0x0096;
    L_0x003d:
        r0 = "";
    L_0x003f:
        r0 = r3.mo5154b(r0);
        r3 = r0.mo5152a(r9);
        r0 = r8.f17297O;
        r0 = r0.f17581a;
        r4 = "android.intent.extra.VERIFICATION_BUNDLE";
        r0 = r0.getBundleExtra(r4);
        if (r0 == 0) goto L_0x009d;
    L_0x0053:
        r4 = "com.google.android.gms.instantapps.IS_USER_CONFIRMED_LAUNCH";
        r0 = r0.getBoolean(r4, r2);
        if (r0 == 0) goto L_0x009d;
    L_0x005b:
        r0 = r1;
    L_0x005c:
        r0 = r3.mo5155b(r0);
        r3 = r8.f17297O;
        r3 = r3.m16983b();
        r0 = r0.mo5156c(r3);
        r3 = r8.f17308z;
        r4 = r8.f17297O;
        r4 = r4.m16986e();
        r3 = r3.m16903a(r4);
        r0 = r0.mo5157d(r3);
        r3 = r0.mo5153b();
        r4 = r8.f17306x;
        r5 = new com.google.android.finsky.instantapps.c;
        r5.<init>(r8);
        r0 = r3.mo5145c();
        if (r0 == 0) goto L_0x009f;
    L_0x008b:
        r5.mo3521a(r2);
    L_0x008e:
        return;
    L_0x008f:
        r0 = r8.f17297O;
        r0 = r0.m16986e();
        goto L_0x0031;
    L_0x0096:
        r0 = r8.f17297O;
        r0 = r0.m16988g();
        goto L_0x003f;
    L_0x009d:
        r0 = r2;
        goto L_0x005c;
    L_0x009f:
        r0 = r3.mo5146d();
        if (r0 != 0) goto L_0x0132;
    L_0x00a5:
        r0 = r3.mo5148f();
        if (r0 == 0) goto L_0x00af;
    L_0x00ab:
        r5.mo3521a(r2);
        goto L_0x008e;
    L_0x00af:
        r0 = r3.mo5149g();
        if (r0 == 0) goto L_0x00b9;
    L_0x00b5:
        r5.mo3521a(r2);
        goto L_0x008e;
    L_0x00b9:
        r0 = r4.f29113a;
        r0 = r0.mo5158a();
        r0 = (java.lang.CharSequence) r0;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x00ec;
    L_0x00c7:
        r6 = new java.util.HashSet;
        r0 = r4.f29113a;
        r0 = r0.mo5158a();
        r0 = (java.lang.String) r0;
        r7 = ",";
        r0 = r0.split(r7);
        r0 = java.util.Arrays.asList(r0);
        r6.<init>(r0);
        r0 = r3.mo5143a();
        r0 = r6.contains(r0);
        if (r0 == 0) goto L_0x00ec;
    L_0x00e8:
        r5.mo3521a(r2);
        goto L_0x008e;
    L_0x00ec:
        r0 = r3.mo5144b();
        if (r0 == 0) goto L_0x0130;
    L_0x00f2:
        r0 = r3.mo5144b();
        r0 = r0.toLowerCase();
        r6 = "chrome";
        r0 = r0.contains(r6);
        if (r0 == 0) goto L_0x0130;
    L_0x0102:
        r0 = r3.mo5147e();
        if (r0 == 0) goto L_0x0130;
    L_0x0108:
        r0 = r1;
    L_0x0109:
        if (r0 != 0) goto L_0x0124;
    L_0x010b:
        r0 = r3.mo5144b();
        if (r0 == 0) goto L_0x0122;
    L_0x0111:
        r0 = r3.mo5144b();
        r0 = r0.toLowerCase();
        r6 = "com.android.vending";
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x0122;
    L_0x0121:
        r2 = r1;
    L_0x0122:
        if (r2 == 0) goto L_0x0132;
    L_0x0124:
        r0 = r4.f29115c;
        r1 = new com.google.android.instantapps.common.e.bl;
        r1.<init>(r4, r3, r5);
        r0.execute(r1);
        goto L_0x008e;
    L_0x0130:
        r0 = r2;
        goto L_0x0109;
    L_0x0132:
        r5.mo3521a(r1);
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.instantapps.EphemeralInstallerActivity.b(boolean):void");
    }

    public final void mo3490a(C3565a c3565a) {
        this.f17284B.mo3532a(c3565a.f17840d, c3565a.f17837a);
        this.f17284B.mo3534b(c3565a.f17840d, c3565a.f17838b.toString());
        this.f17294L.mo5172c(c3565a.f17837a);
        af a = this.f17292J.mo5135a();
        a.mo5136a(1614);
        this.f17302t.execute(new C3471e(this, c3565a, a));
    }

    public final void mo3496m() {
        this.f17294L.mo5162X();
    }

    public final void mo3487a(int i, boolean z) {
        this.f17292J.mo5136a(1604);
        if (isFinishing()) {
            m16843o();
        } else if (this.f17297O == null || !this.f17297O.f17584d) {
            if (!(this.f17297O == null || this.f17297O.m16983b() || ((Long) this.f17287E.mo5158a()).longValue() <= 0)) {
                String stringExtra = getIntent().getStringExtra("android.intent.extra.PACKAGE_NAME");
                Long valueOf = Long.valueOf(((Long) this.f17287E.mo5158a()).longValue() + C4678i.m21812a());
                C1643x c3496g = new C3496g(stringExtra, valueOf);
                this.f17285C.m27188a(C5261a.m24088a(stringExtra, valueOf.longValue()), true, c3496g);
            }
            if (this.f17297O != null && this.f17297O.m16985d()) {
                try {
                    this.f17297O.m16981a(this);
                    this.f17292J.mo5136a(1606);
                } catch (Throwable e) {
                    Log.e("EphemeralInstallerAct", "Failed to notify the platform of the failed install.", e);
                }
                m16852d(i);
            } else if (z) {
                new Builder(this).setMessage(C7582R.string.inter_split_install_failure_message).setNegativeButton(C7582R.string.inter_split_install_cancel, new C3524j(this)).setPositiveButton(C7582R.string.inter_split_install_retry, new C3498i(this)).setCancelable(true).setOnCancelListener(new C3497h(this)).show();
                Log.i("EphemeralInstallerAct", "No failure intent sender, use default alert dialog for retryable failure");
            } else {
                Log.i("EphemeralInstallerAct", "No failure intent sender and failure is non-retryable, just finish");
                m16852d(i);
            }
        } else {
            m16852d(-1);
        }
    }

    final void m16852d(int i) {
        this.f17283A.m27041a(this.f17292J, i);
        m16843o();
        finish();
    }

    public final void mo3497n() {
        this.f17294L.aa();
    }

    public final void mo3488a(long j, long j2) {
        this.f17294L.mo5165a(((float) j) / ((float) j2));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2510;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean z;
            this.f17292J.mo5136a(1660);
            switch (i2) {
                case -1:
                    this.f17292J.mo5136a(610);
                    String stringExtra = intent.getStringExtra("authAccount");
                    this.f17303u.f29178a = stringExtra;
                    if (((Boolean) this.f17288F.mo5158a()).booleanValue()) {
                        PhenotypeUpdateService.m16866a((Context) this);
                    }
                    C3438n c3438n = this.f17295M;
                    c3438n.f17587a.m17006a(stringExtra);
                    c3438n.m17000a(true);
                    this.f17295M.m17002c();
                    return;
                case 0:
                    this.f17292J.mo5136a(611);
                    break;
                case 1:
                    this.f17292J.mo5136a(611);
                    i3 = 2509;
                    break;
                case 2:
                    this.f17292J.mo5136a(1906);
                    m16852d(2510);
                    return;
                default:
                    this.f17292J.mo5136a(611);
                    i3 = 2509;
                    break;
            }
            if (this.f17297O == null || this.f17297O.m16988g() == null || !this.f17297O.m16988g().toLowerCase().equals("com.android.vending")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                m16852d(i3);
            } else {
                mo3487a(i3, false);
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.f17283A.m27041a(this.f17292J, 2512);
    }

    private final void m16844p() {
        if (this.f17299q == null) {
            this.f17299q = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new C3450d(this));
        }
    }
}

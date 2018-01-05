package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aw;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.dfemodel.C2713b;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.externalreferrer.C3012d;
import com.google.android.finsky.frameworkviews.C1038v;
import com.google.android.finsky.frameworkviews.FullScreenDialogRootFrameLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2476e;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.wallet.common.util.a;
import com.squareup.leakcanary.C7582R;

public class InlineAppDetailsDialog extends C1036b implements C1038v, C1037e {
    public dx f6332G;
    public View f6333H;
    public String f6334I;
    public boolean f6335J;
    public C3748a f6336K;
    public C2492t f6337L = C1473m.f7980a.aP();
    public C3012d f6338M;
    public boolean f6339N;
    public final Rect f6340O = new Rect();
    public boolean f6341P;
    public boolean f6342Q;
    public ViewGroup f6343R;
    public Bundle f6344S;
    public BroadcastReceiver f6345T;
    public boolean f6346U;
    public Boolean f6347V;
    public boolean f6348W;

    public InlineAppDetailsDialog() {
        C1473m.f7980a.aJ();
    }

    public static Intent m6106a(Uri uri, boolean z, String str, boolean z2) {
        boolean z3 = false;
        String queryParameter = uri.getQueryParameter("id");
        Object queryParameter2 = uri.getQueryParameter("referrer");
        Object queryParameter3 = uri.getQueryParameter("pcampaignid");
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("allow_update", false);
        Intent intent = new Intent(C1473m.f7980a.f7981b, InlineAppDetailsDialog.class);
        if (uri != null) {
            intent.putExtra("external_url", uri.toString());
        }
        intent.putExtra("docid", queryParameter);
        intent.putExtra("referring_package", str);
        if (!TextUtils.isEmpty(queryParameter2)) {
            intent.putExtra("referrer", queryParameter2);
        }
        if (!TextUtils.isEmpty(queryParameter3)) {
            intent.putExtra("pcampaignid", queryParameter3);
        }
        queryParameter = "allow_update";
        if (booleanQueryParameter || z2) {
            z3 = true;
        }
        intent.putExtra(queryParameter, z3);
        intent.putExtra("alley_oop_overlay", z);
        if (C1473m.f7980a.dj().mo2294a(12635356)) {
            intent.putExtra("forced_inline", z2);
        }
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        boolean z = false;
        super.onCreate(bundle);
        boolean z2 = bundle == null && (getIntent().getFlags() & 1048576) == 0;
        this.f6346U = z2;
        this.f6338M = C1473m.f7980a.mo2025E();
        C1552e dj = C1473m.f7980a.dj();
        if (!dj.mo2294a(12630398)) {
            z = true;
        }
        this.f6341P = z;
        this.f6342Q = dj.mo2294a(12631898);
        this.f6344S = bundle;
        if (m6103M()) {
            if (this.f6344S != null) {
                this.f6337L.f13417a = true;
            }
            this.f6337L.m13355a();
            C1473m.f7980a.dc().m13335l();
        }
        mo1281B();
        if (!mo1282C()) {
            mo1283D();
        }
    }

    protected void mo1281B() {
        if (m6103M()) {
            int i;
            C2492t c2492t = this.f6337L;
            C2495w c2495w = this.C;
            if (m6104N()) {
                i = 1728;
            } else {
                i = 1723;
            }
            c2492t.m13350a(c2495w, i);
        }
    }

    protected boolean mo1282C() {
        return false;
    }

    protected void mo1283D() {
        if (!mo1284E() || m6102L()) {
            this.f6335J = false;
        } else {
            this.f6335J = mo1287f("alley_oop_overlay");
        }
        String e = mo1286e("docid");
        if (TextUtils.isEmpty(e)) {
            FinskyLog.m21667d("Missing docid.", new Object[0]);
            finish();
        } else if (C1473m.f7980a.cY() == null) {
            y_().mo3666a(C1289l.m7694a(e), null, null, null, null, true, this.f6316C);
        } else {
            m6116H();
            Fragment a = H_().mo281a((int) C7582R.id.content_frame);
            if (a == null || !(a instanceof dx)) {
                String a2;
                this.f6339N = false;
                String e2 = mo1286e("external_url");
                this.f6334I = mo1286e("referring_package");
                if (TextUtils.isEmpty(this.f6334I)) {
                    a2 = a.a(this);
                    if (a2 == null || TextUtils.equals("com.android.vending", a2)) {
                        C1473m.f7980a.mo2027G();
                        a2 = C1542f.m8971a((Context) this);
                    }
                    this.f6334I = a2;
                }
                if (this.f6335J || m6102L() || TextUtils.isEmpty(e2) || !e2.startsWith("market:")) {
                    boolean z;
                    String str;
                    boolean z2 = this.f6335J || mo1253I() || m6102L() || C2744a.m14792b((Activity) this) || ((Boolean) C0955b.ak.m28964b()).booleanValue();
                    if (this.f6346U && m6104N() && C1473m.f7980a.dj().mo2294a(12636154)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = this.f6334I;
                        this.C.m13369a(new C2476e(7).m13264b(e).m13266d(str).m13267e(str).m13261a(1, z2));
                    }
                    if (z2) {
                        String e3 = mo1286e("referrer");
                        if (!TextUtils.isEmpty(e3)) {
                            C1473m.f7980a.ap().mo1625b(e, e3, new dv(e, e3), new dw());
                        }
                        if (C1473m.f7980a.dj().mo2294a(12622681)) {
                            a2 = C1289l.m7696b(e);
                        } else {
                            a2 = C1289l.m7694a(e);
                        }
                        if (this.f6344S == null && !mo1253I()) {
                            if (this.f6335J || m6102L()) {
                                str = this.f6334I;
                                StringBuilder stringBuilder = new StringBuilder(e2);
                                if (!TextUtils.isEmpty(str)) {
                                    stringBuilder.append("&callerId=").append(str);
                                }
                                this.f6316C.m13369a(new C2476e(11).m13262a(stringBuilder.toString()).m13265c(e3).m13264b(e).m13266d(str));
                                this.f6338M.m15597a(e3, str, e, "inline_install");
                            } else {
                                m6107a(e, e3, this.f6334I, mo1288g("extra_logging_params"));
                            }
                        }
                        m6108a(a2, null, mo1286e("authAccount"), this.f6316C);
                        return;
                    }
                    FinskyLog.m21665c("Called from untrusted package.", new Object[0]);
                    finish();
                    return;
                }
                C2713b dk = C1473m.f7980a.dk();
                if (dk != null) {
                    mo1285F();
                    dk.m14713b(e2, 1);
                }
                y_().mo3635a(Uri.parse(e2).buildUpon().scheme("http").authority("market.android.com").path("details").build(), this.f6334I, this.f6316C);
                return;
            }
            this.f6332G = (dx) a;
        }
    }

    protected boolean mo1284E() {
        if (this.f6347V == null) {
            this.f6347V = Boolean.valueOf(getPackageName().equals(C2744a.m14784a((Activity) this)));
        }
        return this.f6347V.booleanValue();
    }

    private final boolean m6102L() {
        return mo1284E() && mo1287f("forced_inline");
    }

    private final boolean m6103M() {
        if (!mo1253I()) {
            long j;
            C1552e dj = C1473m.f7980a.dj();
            if (m6104N()) {
                j = 12632776;
            } else {
                j = 12629616;
            }
            if (dj.mo2294a(j)) {
                return true;
            }
        }
        return false;
    }

    private final boolean m6104N() {
        return "com.android.finsky.APP_DETAILS_DIALOG".equals(getIntent().getAction());
    }

    protected String mo1285F() {
        return getIntent().getAction();
    }

    protected String mo1286e(String str) {
        return getIntent().getStringExtra(str);
    }

    protected boolean mo1287f(String str) {
        return getIntent().getBooleanExtra(str, false);
    }

    protected Bundle mo1288g(String str) {
        return getIntent().getBundleExtra(str);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("dialog_hidden", this.f6339N);
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("dialog_hidden")) {
            m6126a(true, null);
        }
    }

    public final void m6125a(String str, String str2, String str3) {
        m6108a(str, str2, str3, this.f6316C.m13365a());
    }

    private final void m6108a(String str, String str2, String str3, C2495w c2495w) {
        int i;
        String e = mo1286e("docid");
        String e2 = mo1286e("referrer");
        boolean z = mo1287f("allow_update") && ((Boolean) C0955b.an.m28964b()).booleanValue();
        if (str3 == null) {
            str3 = C1473m.f7980a.bt().m15626a(e).m15620a(C1473m.f7980a.cZ());
        }
        FinskyLog.m21659a("Select %s for details of %s", FinskyLog.m21655a(str3), e);
        boolean M = m6103M();
        if (mo1253I()) {
            i = 0;
        } else if (m6104N()) {
            i = 7;
        } else {
            i = 6;
        }
        C1045b dxVar = new dx();
        dxVar.m6258b("docid", e);
        dxVar.m_ = e2;
        dxVar.f6684g = str;
        dxVar.f6685h = str2;
        dxVar.m6259c(str3);
        dxVar.m6262d("InlineAppDetailsFragment.allow_update", z);
        dxVar.mo2580a(c2495w);
        dxVar.m6262d("InlineAppDetailsFragment.allow_latency_logging", M);
        dxVar.m6253a("InlineAppDetailsFragment.page_type", i);
        this.f6332G = dxVar;
        aw a = H_().mo284a();
        a.mo325a((int) C7582R.id.content_frame, this.f6332G);
        if (this.f6342Q) {
            a.mo339e();
        } else {
            a.mo334c();
        }
        if (!this.f6329z) {
            this.f6332G.w_();
        }
    }

    protected final boolean m6115G() {
        return this.f6333H != null;
    }

    protected final void m6116H() {
        if (!m6115G()) {
            if (this.f6342Q) {
                getWindow().setBackgroundDrawableResource(17170445);
                this.f6333H = View.inflate(this, C7582R.layout.inline_app_dialog_fullscreen, null);
                FullScreenDialogRootFrameLayout fullScreenDialogRootFrameLayout = (FullScreenDialogRootFrameLayout) this.f6333H;
                fullScreenDialogRootFrameLayout.setListener(this);
                fullScreenDialogRootFrameLayout.setEnableCustomizedTapOutsideHandling(C1473m.f7980a.dj().mo2294a(12640681));
                this.f6343R = (ViewGroup) this.f6333H.findViewById(C7582R.id.content_frame);
            } else {
                this.f6333H = View.inflate(this, C7582R.layout.inline_app_dialog, null);
            }
            setContentView(this.f6333H);
        }
    }

    private final void m6107a(String str, String str2, String str3, Bundle bundle) {
        Builder buildUpon = Uri.parse("http://market.android.com/details").buildUpon();
        buildUpon.appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("referrer", str2);
        }
        if (bundle != null) {
            for (String str4 : bundle.keySet()) {
                Object obj = bundle.get(str4);
                if (obj == null) {
                    FinskyLog.m21665c("Null value associated with key %s in extra params", str4);
                } else if ((obj instanceof Boolean) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String)) {
                    buildUpon.appendQueryParameter(str4, obj.toString());
                }
            }
        }
        String str42 = buildUpon.build().toString();
        this.f6316C.m13369a(new C2476e(11).m13262a(str42).m13265c(str2).m13264b(str).m13266d(str3));
        this.f6338M.m15597a(str2, str3, str, "inline_install");
        C2713b dk = C1473m.f7980a.dk();
        if (dk != null) {
            dk.m14713b(str42, 2);
        }
    }

    protected final void mo1248a(VolleyError volleyError) {
        if (this.f6329z && m6103M()) {
            int i;
            C2492t c2492t = this.f6337L;
            C2495w c2495w = this.C;
            if (m6104N()) {
                i = 1732;
            } else {
                i = 1727;
            }
            c2492t.m13352a(c2495w, i, -1, "authentication_error");
        }
        if (this.f6332G != null && this.f6332G.m610k()) {
            C1045b c1045b = this.f6332G;
            c1045b.mo1345a(C1290m.m7702a(c1045b.bn, volleyError));
        }
    }

    protected void onStart() {
        if (m6103M()) {
            int i;
            this.f6337L.m13355a();
            C2492t c2492t = this.f6337L;
            C2495w c2495w = this.C;
            if (m6104N()) {
                i = 1729;
            } else {
                i = 1724;
            }
            c2492t.m13350a(c2495w, i);
        }
        super.onStart();
    }

    protected void onResume() {
        if (this.f6341P) {
            this.f6345T = new dt(this);
            registerReceiver(this.f6345T, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        if (m6103M()) {
            this.f6337L.m13355a();
        }
        super.onResume();
    }

    protected final void mo1249b(boolean z) {
        if (m6103M()) {
            int i;
            C2492t c2492t = this.f6337L;
            C2495w c2495w = this.C;
            if (m6104N()) {
                i = 1730;
            } else {
                i = 1725;
            }
            c2492t.m13350a(c2495w, i);
        }
        super.mo1249b(z);
        if (this.f6332G != null) {
            this.f6332G.w_();
        }
    }

    protected void onPause() {
        super.onPause();
        if (this.f6345T != null) {
            unregisterReceiver(this.f6345T);
            this.f6345T = null;
        }
        if (m6103M()) {
            if (this.f6329z) {
                int i;
                C2492t c2492t = this.f6337L;
                C2495w c2495w = this.C;
                if (m6104N()) {
                    i = 1732;
                } else {
                    i = 1727;
                }
                c2492t.m13352a(c2495w, i, -1, "user_interruption");
            }
            this.f6337L.f13417a = true;
        }
    }

    protected void onStop() {
        super.onStop();
        if (m6103M()) {
            int i;
            C2492t c2492t = this.f6337L;
            C2495w c2495w = this.C;
            if (m6104N()) {
                i = 1731;
            } else {
                i = 1726;
            }
            c2492t.m13350a(c2495w, i);
            this.f6337L.f13417a = true;
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i != 55) {
            if (i == 33) {
                if (i2 == -1) {
                    setResult(-1);
                    startActivity(this.f6332G.x_());
                } else if (i2 == 0 && this.f6342Q && C1473m.f7980a.dj().mo2294a(12640676)) {
                    this.f6343R.animate().setListener(null).alpha(1.0f).start();
                    this.f6339N = false;
                    return;
                }
            } else if (i == 20) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            finish();
        }
    }

    public final C3748a y_() {
        if (this.f6336K == null) {
            this.f6336K = C1473m.f7980a.mo2252k().mo3727b(this);
        }
        return this.f6336K;
    }

    public final C0950c mo1243l() {
        return null;
    }

    public final void mo1241c(String str) {
    }

    public final void mo1237a(int i, boolean z) {
    }

    public final void mo1236a(int i, int i2, boolean z) {
    }

    public final void mo1235a(int i, int i2, int i3, boolean z) {
    }

    public final void mo1242d(String str) {
    }

    public final void mo1246z() {
    }

    public final void mo1240c(int i) {
    }

    public final void a_(C2495w c2495w) {
    }

    public final void mo1244m() {
        finish();
    }

    public final void mo1238a(String str, String str2, C2495w c2495w) {
    }

    public final C4695b mo1234A() {
        return null;
    }

    protected final void mo1252w() {
        m6118J();
    }

    protected final void mo1250t() {
        if (!this.f6342Q) {
            super.mo1250t();
        }
    }

    protected final void mo1251u() {
        if (!this.f6342Q) {
            super.mo1251u();
        }
    }

    public void onBackPressed() {
        if (this.f6341P && this.f6332G != null) {
            this.f6316C.m13379b(new C2475d(this.f6332G).m13256a(600));
        }
        super.onBackPressed();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f6341P && !this.f6342Q && motionEvent.getAction() == 0) {
            getWindow().getDecorView().getHitRect(this.f6340O);
            if (!this.f6340O.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                m6105O();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void m6126a(boolean z, Runnable runnable) {
        boolean z2 = true;
        if (this.f6342Q) {
            if (this.f6343R != null) {
                boolean z3;
                if (z) {
                    this.f6343R.setVisibility(8);
                    z3 = true;
                } else {
                    z3 = false;
                    ViewPropertyAnimator alpha = this.f6343R.animate().alpha(0.0f);
                    if (runnable != null) {
                        alpha.setListener(new du(runnable));
                    }
                    alpha.start();
                }
                this.f6339N = true;
                z2 = z3;
            }
        } else if (this.f6333H != null) {
            this.f6333H.setVisibility(8);
            this.f6339N = true;
        }
        if (z2 && runnable != null) {
            runnable.run();
        }
    }

    protected boolean mo1253I() {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m6118J() {
        /*
        r6 = this;
        r2 = 0;
        r1 = 1;
        r0 = r6.f6348W;
        if (r0 != 0) goto L_0x00a0;
    L_0x0006:
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.dj();
        r4 = 12630053; // 0xc0b825 float:1.7698474E-38 double:6.2400753E-317;
        r0 = r0.mo2294a(r4);
        if (r0 == 0) goto L_0x00a0;
    L_0x0015:
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.dj();
        r4 = 12622681; // 0xc09b59 float:1.7688144E-38 double:6.236433E-317;
        r0 = r0.mo2294a(r4);
        if (r0 == 0) goto L_0x00a3;
    L_0x0024:
        r0 = "docid";
        r0 = r6.mo1286e(r0);
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x00a3;
    L_0x0030:
        r0 = r6.mo1284E();
        if (r0 == 0) goto L_0x00a1;
    L_0x0036:
        r0 = "alley_oop_overlay";
        r0 = r6.mo1287f(r0);
        if (r0 == 0) goto L_0x00a1;
    L_0x003e:
        r0 = r1;
    L_0x003f:
        if (r0 != 0) goto L_0x005b;
    L_0x0041:
        r3 = r6.m6102L();
        if (r3 != 0) goto L_0x005b;
    L_0x0047:
        r3 = "external_url";
        r3 = r6.mo1286e(r3);
        r4 = android.text.TextUtils.isEmpty(r3);
        if (r4 != 0) goto L_0x005b;
    L_0x0053:
        r4 = "market:";
        r3 = r3.startsWith(r4);
        if (r3 != 0) goto L_0x00a3;
    L_0x005b:
        if (r0 != 0) goto L_0x007d;
    L_0x005d:
        r0 = r6.mo1253I();
        if (r0 != 0) goto L_0x007d;
    L_0x0063:
        r0 = r6.m6102L();
        if (r0 != 0) goto L_0x007d;
    L_0x0069:
        r0 = com.google.android.finsky.dh.C2744a.m14792b(r6);
        if (r0 != 0) goto L_0x007d;
    L_0x006f:
        r0 = com.google.android.finsky.aa.C0955b.ak;
        r0 = r0.m28964b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x00a3;
    L_0x007d:
        r0 = r1;
    L_0x007e:
        if (r0 == 0) goto L_0x00a0;
    L_0x0080:
        r6.f6348W = r1;
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0.aO();
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.ap();
        r1 = "docid";
        r1 = r6.mo1286e(r1);
        r1 = com.google.android.finsky.api.C1289l.m7696b(r1);
        r2 = new com.google.android.finsky.dfemodel.i;
        r1 = com.google.android.finsky.api.C1289l.m7696b(r1);
        r2.<init>(r0, r1);
    L_0x00a0:
        return;
    L_0x00a1:
        r0 = r2;
        goto L_0x003f;
    L_0x00a3:
        r0 = r2;
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.InlineAppDetailsDialog.J():void");
    }

    public final void mo1247K() {
        m6105O();
    }

    private final void m6105O() {
        if (this.f6332G != null) {
            this.f6316C.m13379b(new C2475d(this.f6332G).m13256a(601));
        }
    }
}

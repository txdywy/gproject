package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.view.MotionEvent;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.as.C1504b;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.billing.lightpurchase.p118d.C1086a;
import com.google.android.finsky.billing.lightpurchase.p160e.ae;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.gms.p155f.C1693b;
import com.google.android.wallet.redirect.b;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;

public class PurchaseActivity extends aa implements ap, ad, C1693b {
    public ce f9636A;
    public final C2471a f9637q = C1473m.f7980a.aR();
    public final C1504b f9638r = C1473m.f7980a.mo2037Q();
    public final Rect f9639s = new Rect();
    public C1867w f9640t = C1473m.f7980a.aE();
    public PurchaseParams f9641u;
    public Account f9642v;
    public C2495w f9643w;
    public Intent f9644x;
    public int f9645y;
    public Bundle f9646z;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3982a bK = C1473m.f7980a.bK();
        if (bK.mo3875b()) {
            bK.mo3879f();
            m10040o();
            return;
        }
        Intent intent = getIntent();
        setContentView(getLayoutInflater().inflate(C7582R.layout.light_purchase_activity, null));
        this.f9642v = (Account) intent.getParcelableExtra("PurchaseActivity.account");
        if (this.f9643w == null) {
            this.f9643w = this.f9637q.m13180a(bundle, intent);
        }
        this.f9641u = (PurchaseParams) intent.getParcelableExtra("PurchaseActivity.params");
        this.f9646z = intent.getBundleExtra("PurchaseActivity.appDownloadSizeWarningArgs");
        this.f9636A = C2482j.m13283a(700);
        this.f9636A.e = new cf();
        this.f9636A.e.a(this.f9641u.f9286b);
        this.f9636A.e.a(this.f9641u.f9288d);
        C2482j.m13285a(this.f9636A, intent.getByteArrayExtra("PurchaseActivity.serverLogsCookie"));
        if (bundle != null) {
            this.f9645y = bundle.getInt("PurchaseActivity.resultCode");
            this.f9644x = (Intent) bundle.getParcelable("PurchaseActivity.resultData");
        }
        if (C1473m.f7980a.dj().mo2294a(12610657)) {
            b.a(getApplicationContext(), this);
        }
        if (!C1473m.f7980a.mo2035O().m8838a()) {
            startActivity(C1473m.f7980a.bo().mo2765e(this));
            m10040o();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f9643w.m13377a(bundle);
        bundle.putParcelable("PurchaseActivity.resultData", this.f9644x);
        bundle.putInt("PurchaseActivity.resultCode", this.f9645y);
    }

    protected void onStart() {
        super.onStart();
        this.f9638r.m8837a(new al(this));
    }

    protected void onResume() {
        super.onResume();
        C1473m.f7980a.aX().m16010c();
    }

    protected void onPause() {
        super.onPause();
        C1473m.f7980a.aX().m16007a();
    }

    protected void mo2495k() {
        this.f9645y = 0;
    }

    public void onBackPressed() {
        m10046m().m13379b(new C2475d(this).m13256a(600));
        m10039a(1, "back press");
    }

    private final void m10039a(int i, String str) {
        am l = m10045l();
        if (l != null) {
            int i2;
            if (l.ax instanceof ae) {
                i2 = 0;
            } else {
                if (l.f9754c != null) {
                    if (l.f9754c.f6948l == 7 || l.f9754c.f6948l == 12) {
                        if (i != 1) {
                            i2 = 0;
                        }
                    } else if (l.f9754c.f6948l == 1 && l.f9754c.af == 2) {
                        i2 = 0;
                    } else if (l.f9754c.f6948l == 5 && i == 1 && l.f9754c.aw != null) {
                        l.f9754c.m10394a(null);
                        i2 = 0;
                    }
                }
                i2 = 1;
            }
            if (i2 == 0) {
                FinskyLog.m21659a("PurchaseFragment not dismissable by %s, ignore.", str);
                return;
            }
        }
        this.f9645y = 0;
        finish();
    }

    final am m10045l() {
        return (am) H_().mo281a((int) C7582R.id.content_frame);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getWindow().getDecorView().getHitRect(this.f9639s);
        if (motionEvent.getAction() == 0 && !this.f9639s.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            m10046m().m13379b(new C2475d(this).m13256a(601));
            m10039a(2, "click outside");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void finish() {
        am l = m10045l();
        if (l != null) {
            m10046m().m13370a(new C2488p().m13340a(603).m13345b(this));
            mo2494a(l);
        } else {
            FinskyLog.m21659a("Purchase fragment null.", new Object[0]);
        }
        if (this.f9644x == null) {
            this.f9644x = new Intent();
        }
        m10046m().m13376a(this.f9644x);
        setResult(this.f9645y, this.f9644x);
        super.finish();
    }

    private final void m10040o() {
        FinskyLog.m21659a("Purchase fragment null.", new Object[0]);
        super.finish();
    }

    protected void mo2494a(am amVar) {
        if (amVar.ak) {
            C0757i c0757i;
            this.f9644x = new Intent();
            if (amVar.f9754c == null) {
                c0757i = null;
            } else {
                c0757i = amVar.f9754c.ao;
            }
            if (c0757i != null) {
                this.f9644x.putExtra("PurchaseActivity.topupResult", ParcelableProto.m21671a(c0757i));
            }
            this.f9644x.putExtra("PurchaseActivity.postSuccessItemOpened", amVar.am);
            this.f9645y = -1;
            ax axVar = this.f9641u.f9285a;
            if (axVar.f11834c == 11) {
                this.f9640t.m9994a((Activity) this, C2726q.m14749a(axVar.f11833b));
                return;
            }
            return;
        }
        if (amVar.aj != null) {
            FinskyLog.m21667d("Purchase failed: %d / %d", Integer.valueOf(amVar.aj.f9281a), Integer.valueOf(amVar.aj.f9282b));
            this.f9645y = 0;
        }
    }

    protected final C2495w m10046m() {
        C1086a l = m10045l();
        if (l == null) {
            return this.f9643w;
        }
        return l.aJ;
    }

    public final void mo2493n() {
        finish();
    }

    public static Intent m10037a(Account account, PurchaseParams purchaseParams, byte[] bArr, Bundle bundle) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, PurchaseActivity.class);
        intent.putExtra("PurchaseActivity.account", account);
        intent.putExtra("PurchaseActivity.params", purchaseParams);
        intent.putExtra("PurchaseActivity.appDownloadSizeWarningArgs", bundle);
        intent.putExtra("PurchaseActivity.serverLogsCookie", bArr);
        return intent;
    }

    @Deprecated
    public static Intent m10038a(Account account, PurchaseParams purchaseParams, byte[] bArr, Bundle bundle, C2495w c2495w) {
        if (purchaseParams == null || purchaseParams.f9285a == null || purchaseParams.f9285a.f11834c != 11 || !C1473m.f7980a.mo2249j(account.name).mo2294a(12640666)) {
            Intent a = m10037a(account, purchaseParams, bArr, bundle);
            c2495w.m13366a(account).m13376a(a);
            return a;
        }
        return C1473m.f7980a.bo().mo2726a(account, C1473m.f7980a.f7981b, C1473m.f7980a.mo2249j(account.name), null, c2495w, purchaseParams, null, false, true);
    }

    public ce getPlayStoreUiElement() {
        return this.f9636A;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("Not using tree impressions.", new Object[0]);
    }

    public final void cS_() {
    }

    public final void mo2396a(int i, Intent intent) {
    }
}

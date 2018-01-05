package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.billing.C2039p;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cj.C2286c;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.permissionui.AppSecurityPermissions;
import com.google.android.finsky.permissionui.C3874e;
import com.google.android.finsky.permissionui.C3878d;
import com.google.android.finsky.permissionui.C3879f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.k;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class AppsPermissionsActivity extends aa implements OnClickListener, C0657w, C0998m, ah, C1031w {
    public final ce f6293A;
    public C2495w f6294B;
    public final C2471a f6295q = C1473m.f7980a.aR();
    public Document f6296r;
    public AppSecurityPermissions f6297s;
    public Bundle f6298t;
    public C2719i f6299u;
    public Intent f6300v;
    public String f6301w;
    public String f6302x;
    public boolean f6303y;
    public boolean f6304z;

    public AppsPermissionsActivity() {
        C1473m.f7980a.bD();
        C1473m.f7980a.aO();
        this.f6293A = C2482j.m13283a(790);
    }

    protected void onCreate(Bundle bundle) {
        this.f6298t = bundle;
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.light_purchase_app_permissions);
        Intent intent = getIntent();
        this.f6301w = intent.getStringExtra("AppsPermissionsActivity.accountName");
        this.f6303y = intent.getBooleanExtra("AppsPermissionsActivity.showDetailedPermissions", false);
        this.f6304z = intent.getBooleanExtra("AppsPermissionsActivity.alwaysShowBucketedPermissions", false);
        String stringExtra = intent.getStringExtra("AppsPermissionsActivity.buttonText");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = getString(C7582R.string.accept);
        }
        this.f6302x = stringExtra;
        String stringExtra2 = intent.getStringExtra("AppsPermissionsActivity.docidStr");
        this.f6296r = (Document) intent.getParcelableExtra("AppsPermissionsActivity.doc");
        this.f6297s = (AppSecurityPermissions) findViewById(C7582R.id.app_permissions);
        if (this.f6296r != null) {
            C2482j.m13285a(this.f6293A, this.f6296r.f14885a.f12087D);
        }
        this.f6294B = this.f6295q.m13180a(bundle, intent).m13380b(this.f6301w);
        if (bundle == null) {
            this.f6294B.m13370a(new C2488p().m13345b(this));
        }
        if (C1473m.f7980a.dj().mo2294a(12636164)) {
            Document document = this.f6296r;
            boolean z = (document == null || document.m14625N() == null || document.m14625N().f13167g.length == 0) ? false : true;
            if (z) {
                m6027p();
                return;
            }
        }
        findViewById(C7582R.id.contents).setVisibility(8);
        findViewById(C7582R.id.loading_indicator).setVisibility(0);
        m6025c(213);
        this.f6299u = new C2719i(C1473m.f7980a.mo2112b(this.f6301w), C1289l.m7694a(stringExtra2), false, stringExtra2, null);
        this.f6299u.m11918a((C1031w) this);
        this.f6299u.m11917a((C0657w) this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f6294B.m13377a(bundle);
    }

    protected void onStart() {
        super.onStart();
        if (this.f6299u != null) {
            this.f6299u.m11918a((C1031w) this);
            this.f6299u.m11917a((C0657w) this);
        }
    }

    protected void onResume() {
        super.onResume();
        C1473m.f7980a.aX().m16010c();
    }

    protected void onPause() {
        super.onPause();
        C1473m.f7980a.aX().m16007a();
    }

    protected void onStop() {
        if (this.f6299u != null) {
            this.f6299u.m11922b((C1031w) this);
            this.f6299u.m11921b((C0657w) this);
        }
        super.onStop();
    }

    public void finish() {
        m6025c(603);
        if (this.f6300v == null) {
            Intent intent = new Intent();
            this.f6294B.m13376a(intent);
            setResult(0, intent);
        } else {
            this.f6294B.m13376a(this.f6300v);
            setResult(-1, this.f6300v);
        }
        super.finish();
    }

    public void onClick(View view) {
        this.f6294B.m13379b(new C2475d(this).m13256a(792));
        m6026o();
    }

    private final void m6026o() {
        long c;
        Bundle bundle;
        this.f6300v = new Intent();
        this.f6300v.putExtra("AppsPermissionsActivity.doc", this.f6296r);
        this.f6300v.putExtra("AppsPermissionsActivity.appVersion", this.f6296r.m14625N().f13163c);
        this.f6300v.putExtra("AppsPermissionsActivity.appTitle", this.f6296r.f14885a.f12100g);
        Intent intent = this.f6300v;
        String str = "AppsPermissionsActivity.appDownloadSizeWarningArguments";
        Document document = this.f6296r;
        C2266a q = C1473m.f7980a.mo2258q();
        long j = q.f11252e;
        long j2 = q.f11253f;
        C2441n N = document.m14625N();
        if (C1473m.f7980a.dj().mo2294a(12610205)) {
            c = C1473m.f7980a.mo2223d().m8962c(document);
        } else {
            c = C2286c.m11778a(document.m14625N());
        }
        if (N == null || !q.m11722d() || j <= 0 || c < j) {
            bundle = null;
        } else {
            bundle = C2039p.m10724a(c < j2, q.m11719a());
        }
        intent.putExtra(str, bundle);
        this.f6300v.putExtra("AppsPermissionsActivity.acceptedNewBuckets", true);
        finish();
    }

    public final void m_() {
        this.f6296r = this.f6299u.m14722b();
        if (this.f6296r == null) {
            m6024a(getString(C7582R.string.item_unavailable_message));
        } else {
            m6027p();
        }
    }

    private final void m6027p() {
        boolean z = false;
        if (C1473m.f7980a.bv().mo4394a(this.f6296r)) {
            m6024a(getString(C7582R.string.app_already_installed_other_user));
            return;
        }
        C3874e c3878d;
        if (!this.f6303y) {
            if (!C1473m.f7980a.mo2045Y().m11649a(this.f6296r, C1473m.f7980a.dn(), C1473m.f7980a.ah().mo2811a(C1473m.f7980a.mo2041U().mo1183b(this.f6301w)))) {
                m6024a(C1473m.f7980a.ax().m11783a(this.f6296r));
                return;
            } else if (k.d(this)) {
                m6026o();
                return;
            } else if (VERSION.SDK_INT >= 23 && this.f6296r.ai() >= 23 && !this.f6304z) {
                m6026o();
                return;
            }
        }
        findViewById(C7582R.id.contents).setVisibility(0);
        findViewById(C7582R.id.loading_indicator).setVisibility(8);
        String str = this.f6296r.f14885a.f12097d;
        String[] strArr = this.f6296r.m14625N().f13167g;
        ((TextView) findViewById(C7582R.id.title)).setText(this.f6296r.f14885a.f12100g);
        TextView textView = (TextView) findViewById(C7582R.id.account);
        textView.setVisibility(0);
        FifeImageView fifeImageView = (FifeImageView) findViewById(C7582R.id.application_icon);
        C1473m.f7980a.bR();
        bd a = af.m9220a(this.f6296r, fifeImageView.getWidth(), fifeImageView.getHeight(), DocImageView.f13711a);
        if (a != null) {
            C1473m.f7980a.ar().m9288a(fifeImageView, a.f11860f, a.f11863i);
            fifeImageView.setVisibility(0);
        } else {
            fifeImageView.setVisibility(8);
        }
        TextView textView2 = (TextView) findViewById(C7582R.id.detailed_footer_text);
        boolean z2;
        if (this.f6303y) {
            Object obj;
            int i;
            if (this.f6298t == null) {
                C2482j.m13285a(this.f6293A, this.f6296r.f14885a.f12087D);
                m6025c(793);
            }
            if (VERSION.SDK_INT >= 23) {
                obj = (String) C0955b.f5858B.m28964b();
                i = C7582R.string.detailed_optional_permissions_footer;
            } else {
                String str2 = (String) C0955b.f5857A.m28964b();
                i = C7582R.string.detailed_permissions_footer;
            }
            String str3 = this.f6296r.f14885a.f12100g;
            findViewById(C7582R.id.continue_button_bar).setVisibility(8);
            if (TextUtils.isEmpty(obj)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(Html.fromHtml(getResources().getString(i, new Object[]{str3, obj})));
                textView2.setOnClickListener(new C1049a(this, obj));
                textView2.setVisibility(0);
            }
            if (VERSION.SDK_INT < 23 || this.f6296r.ai() < 23) {
                z2 = false;
            } else {
                z2 = true;
            }
            C3879f bU = C1473m.f7980a.bU();
            c3878d = new C3878d(this, bU.f19303b, bU.f19302a, str, strArr, z2);
            String str4 = this.f6296r.m14625N().f13164d;
            if (z2) {
                textView.setText(getResources().getString(C7582R.string.version_may_request_access, new Object[]{str4}));
            } else {
                textView.setText(getResources().getString(C7582R.string.version_can_access, new Object[]{str4}));
            }
        } else {
            int i2;
            if (this.f6298t == null) {
                C2482j.m13285a(this.f6293A, this.f6296r.f14885a.f12087D);
                m6025c(791);
            }
            textView2.setVisibility(8);
            if (VERSION.SDK_INT >= 23 && this.f6296r.ai() >= 23) {
                z = true;
            }
            z2 = C1473m.f7980a.aV().m11998b(C1473m.f7980a.mo2169c(), str);
            C3874e a2 = C1473m.f7980a.bU().m18370a(this, str, strArr, z2, z);
            if (C1473m.f7980a.dj().mo2294a(12622374) && !a2.m18366b()) {
                m6026o();
            }
            if (z) {
                i2 = C7582R.string.may_request_access;
            } else if (a2.mo3828a() && z2) {
                i2 = C7582R.string.also_needs_access_to;
            } else {
                i2 = C7582R.string.needs_access_to;
            }
            textView.setText(i2);
            PlayActionButtonV2 playActionButtonV2 = (PlayActionButtonV2) findViewById(C7582R.id.continue_button);
            playActionButtonV2.mo2588a(3, this.f6302x, (OnClickListener) this);
            playActionButtonV2.setEnabled(true);
            c3878d = a2;
        }
        this.f6297s.m18358a(c3878d, this.f6296r.f14885a.f12100g);
        this.f6297s.requestFocus();
    }

    private final void m6025c(int i) {
        this.f6294B.m13370a(new C2488p().m13340a(i).m13345b(this));
    }

    public final void mo1062a(VolleyError volleyError) {
        m6024a(C1290m.m7702a(this, volleyError));
    }

    private final void m6024a(String str) {
        C1508k c1508k = new C1508k();
        c1508k.m8852a(str).m8860d((int) C7582R.string.ok);
        c1508k.mo2272a().m625a(H_(), "AppsPermissionsActivity.errorDialog");
    }

    public final void mo1202a(int i, Bundle bundle) {
        finish();
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
    }

    public ce getPlayStoreUiElement() {
        return this.f6293A;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("Not using tree impressions.", new Object[0]);
    }

    public final void o_() {
        FinskyLog.m21669e("Not using impression id's.", new Object[0]);
    }

    public final void mo1222m() {
    }

    public final C2495w mo1224n() {
        return this.f6294B;
    }
}

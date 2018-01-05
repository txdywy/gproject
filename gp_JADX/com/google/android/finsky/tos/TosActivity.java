package com.google.android.finsky.tos;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.instantapps.metrics.C3533f;
import com.google.android.finsky.instantapps.p220f.C3492q;
import com.google.android.finsky.p111d.C1464x;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.instantapps.C5260a;
import com.google.android.gms.instantapps.C5263b;
import com.google.wireless.android.finsky.dfe.nano.dl;
import com.squareup.leakcanary.C7582R;

public class TosActivity extends aa implements C1056b, C1634r {
    public C2910a f23331A;
    public C1461c f23332B;
    public C0986a f23333C;
    public C1464x f23334D;
    public String f23335q = null;
    public DfeToc f23336r = null;
    public CheckBox f23337s;
    public ButtonBar f23338t;
    public boolean f23339u;
    public C5058o f23340v;
    public C2495w f23341w;
    public Context f23342x;
    public C5263b f23343y;
    public C4569e f23344z;

    protected void onCreate(Bundle bundle) {
        ((C1446i) C3947d.m18649a(C1446i.class)).mo1963a(this);
        super.onCreate(bundle);
        this.f23341w = this.f23334D.dd();
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        if (bundle != null) {
            this.f23335q = bundle.getString("finsky.TosActivity.account");
            this.f23336r = (DfeToc) bundle.getParcelable("finsky.TosActivity.toc");
        }
        if (this.f23335q == null || this.f23336r == null) {
            FinskyLog.m21665c("Bad request to Terms of Service activity.", new Object[0]);
            finish();
            return;
        }
        Boolean bool;
        aa aaVar;
        this.f23341w.m13367a(new C2474c(3300));
        this.f23339u = C3492q.m17063a(this.f23335q, this.f23332B.dj(), (Integer) C0955b.jh.m28964b(), getPackageManager(), (Integer) C0955b.ji.m28964b());
        if (TextUtils.isEmpty(this.f23336r.f14881a.f31756D)) {
            bool = null;
            aaVar = this;
        } else {
            dl e = this.f23331A.m15195e(this.f23335q);
            if (e == null) {
                bool = null;
                aaVar = this;
            } else {
                bool = Boolean.valueOf(e.b);
                aaVar = this;
            }
        }
        aaVar.setContentView((int) C7582R.layout.terms_of_service);
        aaVar.f23338t = (ButtonBar) aaVar.findViewById(C7582R.id.button_bar);
        aaVar.f23338t.setPositiveButtonTitle((int) C7582R.string.accept);
        aaVar.f23338t.setNegativeButtonTitle((int) C7582R.string.decline);
        aaVar.f23338t.setClickListener(aaVar);
        ((TextView) aaVar.findViewById(C7582R.id.account_name)).setText(aaVar.f23333C.mo1187d(aaVar.f23335q));
        TextView textView = (TextView) aaVar.findViewById(C7582R.id.content);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml(aaVar.f23336r.f14881a.f31760c));
        aaVar.f23337s = (CheckBox) aaVar.findViewById(C7582R.id.email_opt_in);
        CharSequence charSequence = aaVar.f23336r.f14881a.f31756D;
        if (TextUtils.isEmpty(charSequence) || bool == null) {
            aaVar.f23337s.setVisibility(8);
        } else {
            aaVar.f23337s.setText(charSequence);
            aaVar.f23337s.setChecked(bool.booleanValue());
            aaVar.f23337s.setVisibility(0);
        }
        if (aaVar.f23339u) {
            ((TextView) aaVar.findViewById(C7582R.id.instant_apps_tos_title)).setVisibility(0);
            textView = (TextView) aaVar.findViewById(C7582R.id.instant_apps_tos_content);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(Html.fromHtml(aaVar.getString(C7582R.string.instant_apps_tos_content, new Object[]{C0955b.jj.m28964b()})));
            textView.setVisibility(0);
        }
        C5089p a = new C5089p(this).m23647a(C5260a.f26391c);
        bf bfVar = new bf(this);
        am.m23743b(true, "clientId must be non-negative");
        a.f25925j = 0;
        a.f25926k = this;
        a.f25924i = bfVar;
        this.f23340v = a.m23652b();
        if (this.f23339u) {
            this.f23341w.m13367a(new C2474c(3301));
            C3533f.m17116a(this, 2203);
            return;
        }
        C3533f.m17116a(this, 2204);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("finsky.TosActivity.account", this.f23335q);
        bundle.putParcelable("finsky.TosActivity.toc", this.f23336r);
    }

    public final void u_() {
        Boolean valueOf;
        if (this.f23337s.getVisibility() == 0) {
            valueOf = Boolean.valueOf(this.f23337s.isChecked());
        } else {
            valueOf = null;
        }
        if (this.f23332B.dj().mo2294a(12645831)) {
            C4569e c4569e = this.f23344z;
            String str = this.f23335q;
            DfeToc dfeToc = this.f23336r;
            c4569e.m21203a(str, dfeToc.f14881a.f31761d, valueOf, Boolean.valueOf(this.f23339u));
        } else {
            this.f23344z.m21203a(this.f23335q, this.f23336r.f14881a.f31761d, valueOf, null);
        }
        this.f23341w.m13367a(new C2474c(3302));
        C3533f.m17116a(this, 2205);
        if (this.f23339u) {
            AsyncTask c4568d;
            if (this.f23332B.dj().mo2294a(12646312)) {
                c4568d = new C4568d(this.f23343y, this.f23335q, this.f23342x, this, this.f23341w);
            } else if (this.f23340v.mo4562j()) {
                c4568d = new C4566b(this.f23343y, this.f23340v, this.f23335q, this, this.f23341w);
            } else {
                C3533f.m17116a(this, 2212);
                setResult(-1);
                finish();
                return;
            }
            this.f23341w.m13367a(new C2474c(3304));
            this.f23338t.setPositiveButtonEnabled(false);
            this.f23338t.setNegativeButtonEnabled(false);
            bb.m21792a(c4568d, new Void[0]);
        }
        setResult(-1);
        finish();
    }

    public final void v_() {
        this.f23341w.m13367a(new C2474c(3303));
        if (this.f23339u) {
            this.f23341w.m13367a(new C2474c(3305));
        }
        C3533f.m17116a(this, 2206);
        setResult(0);
        finish();
    }

    protected void onDestroy() {
        this.f23341w.m13367a(new C2474c(3308));
        if (this.f23339u) {
            C3533f.m17116a(this, 2214);
        } else {
            C3533f.m17116a(this, 2215);
        }
        super.onDestroy();
    }

    public final void mo2364a(ConnectionResult connectionResult) {
    }
}

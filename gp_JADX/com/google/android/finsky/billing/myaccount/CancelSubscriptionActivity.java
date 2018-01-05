package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.common.LightPurchaseButtonBarLayout;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.cv.p177a.ai;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.fw;
import com.squareup.leakcanary.C7582R;

public class CancelSubscriptionActivity extends C1647h implements OnClickListener, C1087t {
    public C2031u f10119G;
    public C2199l f10120n;
    public Account f10121o;
    public Document f10122p;
    public C2032v f10123q;
    public ai f10124r;
    public TextView f10125s;
    public TextView f10126t;
    public PlayActionButtonV2 f10127u;
    public PlayActionButtonV2 f10128v;
    public View f10129w;

    public static Intent m10502a(Context context, Account account, Document document, ai aiVar, C2495w c2495w) {
        if (account == null) {
            throw new IllegalArgumentException("account is required");
        } else if (document == null) {
            throw new IllegalArgumentException("document is required");
        } else if (aiVar == null) {
            throw new IllegalArgumentException("cancellation dialog is required");
        } else {
            Intent intent = new Intent(context, CancelSubscriptionActivity.class);
            intent.putExtra("CancelSubscriptionDialog.document", document);
            intent.putExtra("CancelSubscriptionDialog.account", account);
            intent.putExtra("CancelSubscriptionDialog.dialog", ParcelableProto.m21671a((C0757i) aiVar));
            c2495w.m13366a(account).m13376a(intent);
            C1647h.m9344a(intent, account.name);
            return intent;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1746a(this);
        Intent intent = getIntent();
        this.f10121o = (Account) intent.getParcelableExtra("CancelSubscriptionDialog.account");
        this.f10122p = (Document) intent.getParcelableExtra("CancelSubscriptionDialog.document");
        this.f10124r = (ai) ParcelableProto.m21672a(intent, "CancelSubscriptionDialog.dialog");
        setContentView((int) C7582R.layout.cancel_subscription_activity);
        this.f10129w = findViewById(C7582R.id.loading_indicator);
        this.f10125s = (TextView) findViewById(C7582R.id.title);
        this.f10126t = (TextView) findViewById(C7582R.id.message);
        this.f10127u = (PlayActionButtonV2) findViewById(C7582R.id.continue_button);
        this.f10128v = (PlayActionButtonV2) findViewById(C7582R.id.secondary_button);
        this.f10125s.setText(this.f10124r.f11796b);
        if (this.f10124r.aD_()) {
            this.f10126t.setText(this.f10124r.f11797c);
        }
        this.f10127u.mo2588a(0, this.f10124r.f11798d, (OnClickListener) this);
        this.f10128v.mo2588a(0, this.f10124r.f11799e, (OnClickListener) this);
        m10503a(this.f10124r.aD_(), true);
        ((LightPurchaseButtonBarLayout) findViewById(C7582R.id.continue_button_bar)).setShouldShowLogo(false);
    }

    protected void onStart() {
        super.onStart();
        this.f10123q = (C2032v) H_().mo283a("CancelSubscriptionDialog.sidecar");
        if (this.f10123q == null) {
            this.f10123q = C2032v.m10714a(this.B, this.f10122p.f14885a.f12096c, this.f10122p.m14646d());
            H_().mo284a().mo328a(this.f10123q, "CancelSubscriptionDialog.sidecar").mo334c();
        }
    }

    protected void onResume() {
        super.onResume();
        this.f10123q.m6757a((C1087t) this);
        if (this.f10119G == null) {
            C1601a.m9199a(this, this.f10125s.getText(), this.f10125s, false);
            return;
        }
        C2031u c2031u = this.f10119G;
        this.f10125s.getText();
        c2031u.m10713a();
    }

    protected void onPause() {
        this.f10123q.m6757a(null);
        super.onPause();
    }

    protected final int mo2368f() {
        return 304;
    }

    private final void m10503a(boolean z, boolean z2) {
        int i;
        int i2 = 0;
        TextView textView = this.f10126t;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f10127u.setVisibility(0);
        PlayActionButtonV2 playActionButtonV2 = this.f10128v;
        if (!z2) {
            i2 = 8;
        }
        playActionButtonV2.setVisibility(i2);
        this.f10129w.setVisibility(8);
    }

    private final C2474c m10504c(int i) {
        return new C2474c(i).m13236a(this.f10122p.f14885a.f12096c).m13213a(this.f10122p.m14646d()).m13241b(1);
    }

    public final void mo1423a(C1089s c1089s) {
        switch (this.f10123q.f6948l) {
            case 0:
                return;
            case 1:
                this.f10126t.setVisibility(8);
                this.f10127u.setVisibility(8);
                this.f10128v.setVisibility(8);
                this.f10129w.setVisibility(0);
                return;
            case 2:
                fw fwVar = this.f10123q.f10483e;
                this.E.m13367a(m10504c(851).m13210a(0).m13239a(true));
                this.f10120n.mo2796a(this.f10121o, "revoke", new C2030t(this), fwVar.a);
                return;
            case 3:
                Throwable th = this.f10123q.f10484f;
                this.E.m13367a(m10504c(851).m13210a(1).m13239a(false).m13238a(th));
                this.f10126t.setText(C1290m.m7702a(this, th));
                this.f10127u.m6000a(0, (int) C7582R.string.ok, (OnClickListener) this);
                m10503a(true, false);
                return;
            default:
                throw new IllegalStateException("Unhandled state change: " + c1089s.f6948l);
        }
    }

    public void onClick(View view) {
        if (view == this.f10127u) {
            if (this.f10123q.f6948l == 3) {
                this.E.m13379b(new C2475d(this).m13256a(2903));
                finish();
                return;
            }
            this.E.m13379b(new C2475d(this).m13256a(243));
            C0660x c0660x = this.f10123q;
            c0660x.f10480b.mo1585a(c0660x.f10481c, c0660x.f10482d, c0660x, (C0657w) c0660x);
            c0660x.m6758b(1, 0);
            this.E.m13367a(m10504c(850));
        } else if (view == this.f10128v) {
            this.E.m13379b(new C2475d(this).m13256a(244));
            finish();
        } else {
            String valueOf = String.valueOf(view);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unknown view clicked: ").append(valueOf).toString());
        }
    }
}

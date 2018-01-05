package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.common.LightPurchaseButtonBarLayout;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.b.w;
import com.squareup.leakcanary.C7582R;

public abstract class bo extends C1647h implements OnClickListener, C1087t {
    public bq f10130G;
    public C2199l f10131o;
    public Account f10132p;
    public Document f10133q;
    public br f10134r;
    public TextView f10135s;
    public TextView f10136t;
    public PlayActionButtonV2 f10137u;
    public PlayActionButtonV2 f10138v;
    public View f10139w;

    protected abstract void mo2563a(Intent intent);

    protected abstract void mo2564a(br brVar);

    protected abstract boolean mo2565a(TextView textView, TextView textView2, PlayActionButtonV2 playActionButtonV2, PlayActionButtonV2 playActionButtonV22);

    protected abstract int mo2368f();

    protected abstract int mo2566h();

    protected abstract int mo1274i();

    protected abstract int mo2567j();

    protected abstract int mo2568k();

    protected abstract String mo2569l();

    protected abstract int mo2570m();

    protected static Intent m10507a(Intent intent, Account account, Document document, C2495w c2495w) {
        if (account == null) {
            throw new IllegalArgumentException("account is required");
        } else if (document == null) {
            throw new IllegalArgumentException("document is required");
        } else {
            intent.putExtra("SubscriptionActionActivity.document", document);
            intent.putExtra("SubscriptionActionActivity.account", account);
            c2495w.m13366a(account).m13376a(intent);
            C1647h.m9344a(intent, account.name);
            return intent;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1754a(this);
        Intent intent = getIntent();
        this.f10132p = (Account) intent.getParcelableExtra("SubscriptionActionActivity.account");
        this.f10133q = (Document) intent.getParcelableExtra("SubscriptionActionActivity.document");
        mo2563a(intent);
        setContentView((int) C7582R.layout.cancel_subscription_activity);
        this.f10139w = findViewById(C7582R.id.loading_indicator);
        this.f10135s = (TextView) findViewById(C7582R.id.title);
        this.f10136t = (TextView) findViewById(C7582R.id.message);
        this.f10137u = (PlayActionButtonV2) findViewById(C7582R.id.continue_button);
        this.f10138v = (PlayActionButtonV2) findViewById(C7582R.id.secondary_button);
        m10508a(mo2565a(this.f10135s, this.f10136t, this.f10137u, this.f10138v), true);
        ((LightPurchaseButtonBarLayout) findViewById(C7582R.id.continue_button_bar)).setShouldShowLogo(false);
    }

    protected void onStart() {
        super.onStart();
        this.f10134r = (br) H_().mo283a("SubscriptionActionActivity.sidecar");
        if (this.f10134r == null) {
            this.f10134r = br.m10617a(this.B, this.f10133q.f14885a.f12096c, this.f10133q.m14646d());
            H_().mo284a().mo328a(this.f10134r, "SubscriptionActionActivity.sidecar").mo334c();
        }
    }

    protected void onResume() {
        super.onResume();
        this.f10134r.m6757a((C1087t) this);
        if (this.f10130G == null) {
            C1601a.m9199a(this, this.f10135s.getText(), this.f10135s, false);
            return;
        }
        bq bqVar = this.f10130G;
        this.f10135s.getText();
        bqVar.m10616a();
    }

    protected void onPause() {
        this.f10134r.m6757a(null);
        super.onPause();
    }

    private final void m10508a(boolean z, boolean z2) {
        int i;
        int i2 = 0;
        TextView textView = this.f10136t;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f10137u.setVisibility(0);
        PlayActionButtonV2 playActionButtonV2 = this.f10138v;
        if (!z2) {
            i2 = 8;
        }
        playActionButtonV2.setVisibility(i2);
        this.f10139w.setVisibility(8);
    }

    private final C2474c m10509c(int i) {
        return new C2474c(i).m13236a(this.f10133q.f14885a.f12096c).m13213a(this.f10133q.m14646d()).m13241b(1);
    }

    public final void mo1423a(C1089s c1089s) {
        switch (this.f10134r.f6948l) {
            case 0:
                return;
            case 1:
                this.f10136t.setVisibility(8);
                this.f10137u.setVisibility(8);
                this.f10138v.setVisibility(8);
                this.f10139w.setVisibility(0);
                return;
            case 2:
                int j = mo2567j();
                String l = mo2569l();
                int m = mo2570m();
                w wVar = this.f10134r.f10270e;
                this.E.m13367a(m10509c(j).m13210a(0).m13239a(true));
                this.f10131o.mo2796a(this.f10132p, l, new bp(this, m), wVar);
                return;
            case 3:
                Throwable th = this.f10134r.f10271f;
                this.E.m13367a(m10509c(mo2567j()).m13210a(1).m13239a(false).m13238a(th));
                this.f10136t.setText(C1290m.m7702a(this, th));
                this.f10137u.m6000a(0, (int) C7582R.string.ok, (OnClickListener) this);
                m10508a(true, false);
                return;
            default:
                throw new IllegalStateException("Unhandled state change: " + c1089s.f6948l);
        }
    }

    public void onClick(View view) {
        if (view == this.f10137u) {
            if (this.f10134r.f6948l == 3) {
                this.E.m13379b(new C2475d(this).m13256a(2903));
                finish();
                return;
            }
            this.E.m13379b(new C2475d(this).m13256a(mo2566h()));
            mo2564a(this.f10134r);
            this.E.m13367a(m10509c(mo2568k()));
        } else if (view == this.f10138v) {
            this.E.m13379b(new C2475d(this).m13256a(mo1274i()));
            finish();
        } else {
            String valueOf = String.valueOf(view);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unknown view clicked: ").append(valueOf).toString());
        }
    }
}

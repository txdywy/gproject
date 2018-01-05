package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
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
import com.google.android.finsky.cv.p177a.hv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.c.a.dy;
import com.google.wireless.android.finsky.dfe.c.a.dz;
import com.squareup.leakcanary.C7582R;

public class ReactivateSubscriptionActivity extends C1647h implements OnClickListener, C1087t {
    public bl f10145G;
    public C2199l f10146n;
    public Account f10147o;
    public Document f10148p;
    public bm f10149q;
    public hv f10150r;
    public TextView f10151s;
    public TextView f10152t;
    public PlayActionButtonV2 f10153u;
    public PlayActionButtonV2 f10154v;
    public View f10155w;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1748a(this);
        Intent intent = getIntent();
        this.f10147o = (Account) intent.getParcelableExtra("ReactivateSubscriptionDialog.account");
        this.f10148p = (Document) intent.getParcelableExtra("ReactivateSubscriptionDialog.document");
        this.f10150r = (hv) ParcelableProto.m21672a(intent, "ReactivateSubscriptionDialog.dialog");
        setContentView((int) C7582R.layout.cancel_subscription_activity);
        this.f10155w = findViewById(C7582R.id.loading_indicator);
        this.f10151s = (TextView) findViewById(C7582R.id.title);
        this.f10152t = (TextView) findViewById(C7582R.id.message);
        this.f10153u = (PlayActionButtonV2) findViewById(C7582R.id.continue_button);
        this.f10154v = (PlayActionButtonV2) findViewById(C7582R.id.secondary_button);
        this.f10151s.setText(this.f10150r.f12624b);
        if (this.f10150r.bl_()) {
            this.f10152t.setText(this.f10150r.f12625c);
        }
        this.f10153u.mo2588a(0, this.f10150r.f12626d, (OnClickListener) this);
        this.f10154v.mo2588a(0, this.f10150r.f12627e, (OnClickListener) this);
        m10532a(this.f10150r.bl_(), true);
        ((LightPurchaseButtonBarLayout) findViewById(C7582R.id.continue_button_bar)).setShouldShowLogo(false);
    }

    protected void onStart() {
        super.onStart();
        this.f10149q = (bm) H_().mo283a("ReactivateSubscriptionDialog.sidecar");
        if (this.f10149q == null) {
            this.f10149q = bm.m10613a(this.B, this.f10148p.m14646d());
            H_().mo284a().mo328a(this.f10149q, "ReactivateSubscriptionDialog.sidecar").mo334c();
        }
    }

    protected void onResume() {
        super.onResume();
        this.f10149q.m6757a((C1087t) this);
        if (this.f10145G == null) {
            C1601a.m9199a(this, this.f10151s.getText(), this.f10151s, false);
            return;
        }
        bl blVar = this.f10145G;
        this.f10151s.getText();
        blVar.m10612a();
    }

    protected void onPause() {
        this.f10149q.m6757a(null);
        super.onPause();
    }

    protected final int mo2368f() {
        return 330;
    }

    private final void m10532a(boolean z, boolean z2) {
        int i;
        int i2 = 0;
        TextView textView = this.f10152t;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f10153u.setVisibility(0);
        PlayActionButtonV2 playActionButtonV2 = this.f10154v;
        if (!z2) {
            i2 = 8;
        }
        playActionButtonV2.setVisibility(i2);
        this.f10155w.setVisibility(8);
    }

    private final C2474c m10533c(int i) {
        return new C2474c(i).m13236a(this.f10148p.f14885a.f12096c).m13213a(this.f10148p.m14646d());
    }

    public final void mo1423a(C1089s c1089s) {
        switch (this.f10149q.f6948l) {
            case 0:
                return;
            case 1:
                this.f10152t.setVisibility(8);
                this.f10153u.setVisibility(8);
                this.f10154v.setVisibility(8);
                this.f10155w.setVisibility(0);
                return;
            case 2:
                dz dzVar = this.f10149q.f10259d;
                this.E.m13367a(m10533c(1431).m13210a(0).m13239a(true));
                this.f10146n.mo2796a(this.f10147o, "reactivateSubscription", new bk(this), dzVar.a);
                return;
            case 3:
                Throwable th = this.f10149q.f10260e;
                this.E.m13367a(m10533c(1431).m13210a(1).m13239a(false).m13238a(th));
                this.f10152t.setText(C1290m.m7702a(this, th));
                this.f10153u.m6000a(0, (int) C7582R.string.ok, (OnClickListener) this);
                m10532a(true, false);
                return;
            default:
                throw new IllegalStateException("Unhandled state change: " + c1089s.f6948l);
        }
    }

    public void onClick(View view) {
        if (view == this.f10153u) {
            if (this.f10149q.f6948l == 3) {
                this.E.m13379b(new C2475d(this).m13256a(2903));
                finish();
                return;
            }
            this.E.m13379b(new C2475d(this).m13256a(2941));
            C0660x c0660x = this.f10149q;
            dy dyVar = new dy();
            dyVar.a = c0660x.f10258c;
            c0660x.f10257b.mo1566a(dyVar, c0660x, (C0657w) c0660x);
            c0660x.m6758b(1, 0);
            this.E.m13367a(m10533c(1430));
        } else if (view == this.f10154v) {
            this.E.m13379b(new C2475d(this).m13256a(2942));
            finish();
        } else {
            String valueOf = String.valueOf(view);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unknown view clicked: ").append(valueOf).toString());
        }
    }
}

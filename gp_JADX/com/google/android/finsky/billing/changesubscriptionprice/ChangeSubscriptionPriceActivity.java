package com.google.android.finsky.billing.changesubscriptionprice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.cv.p177a.hf;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.finsky.dfe.c.a.at;
import com.squareup.leakcanary.C7582R;

public class ChangeSubscriptionPriceActivity extends C1647h implements OnClickListener, C0998m, C1087t {
    public C1294w f9243n;
    public C1787b f9244o;
    public hf f9245p;
    public Document f9246q;
    public PlayActionButtonV2 f9247r;
    public TextView f9248s;
    public TextView f9249t;
    public View f9250u;
    public View f9251v;
    public View f9252w;

    public static Intent m9733a(Context context, String str, Document document, hf hfVar) {
        Intent intent = new Intent(context, ChangeSubscriptionPriceActivity.class);
        intent.putExtra("document", document);
        intent.putExtra("dialog", C0757i.m4909a((C0757i) hfVar));
        C1647h.m9344a(intent, str);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1350a) C3947d.m18649a(C1350a.class)).mo1731a(this);
        Intent intent = getIntent();
        if (intent.getParcelableExtra("document") == null || intent.getByteArrayExtra("dialog") == null) {
            FinskyLog.m21669e("Invalid intent arguments provided.", new Object[0]);
            setResult(1);
            finish();
            return;
        }
        this.f9246q = (Document) intent.getParcelableExtra("document");
        try {
            this.f9245p = (hf) C0757i.m4905a(new hf(), intent.getByteArrayExtra("dialog"));
            FinskyLog.m21659a("Got dialog data: %s", this.f9245p);
            setContentView((int) C7582R.layout.change_subscription_price_activity);
            PlayCardThumbnail playCardThumbnail = (PlayCardThumbnail) findViewById(C7582R.id.li_thumbnail_frame);
            ((DocImageView) playCardThumbnail.getImageView()).m13584a(this.f9246q, this.f9243n, DocImageView.f13711a);
            playCardThumbnail.setOnClickListener(this);
            playCardThumbnail.setVisibility(0);
            this.f9250u = findViewById(C7582R.id.loading_frame);
            this.f9252w = findViewById(C7582R.id.thumbnail_section);
            this.f9251v = findViewById(C7582R.id.continue_button_bar);
            this.f9247r = (PlayActionButtonV2) findViewById(C7582R.id.continue_button);
            this.f9247r.mo2588a(3, this.f9245p.f12552g, (OnClickListener) this);
            this.f9249t = (TextView) findViewById(C7582R.id.title);
            this.f9249t.setText(this.f9245p.f12547b);
            ((TextView) findViewById(C7582R.id.thumbnail_title)).setText(this.f9245p.f12549d);
            ((TextView) findViewById(C7582R.id.thumbnail_subtitle)).setText(this.f9245p.f12550e);
            this.f9248s = (TextView) findViewById(C7582R.id.body_html_text_view);
            ae.m9217a(this.f9248s, this.f9245p.f12551f);
        } catch (InvalidProtocolBufferNanoException e) {
            FinskyLog.m21669e("Can't parse incoming proto.", new Object[0]);
            setResult(1);
            finish();
        }
    }

    protected void onStart() {
        super.onStart();
        this.f9244o = (C1787b) H_().mo283a("ChangeSubscriptionPriceActivity.sidecar");
        if (this.f9244o == null) {
            this.f9244o = C1787b.m9738a(this.B, this.f9246q.m14646d());
            H_().mo284a().mo328a(this.f9244o, "ChangeSubscriptionPriceActivity.sidecar").mo334c();
        }
        this.f9244o.m6757a((C1087t) this);
    }

    protected void onPause() {
        this.f9244o.m6757a(null);
        super.onPause();
    }

    protected final int mo2368f() {
        return 5590;
    }

    public final void mo1202a(int i, Bundle bundle) {
        setResult(2);
        finish();
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        mo1202a(i, bundle);
    }

    public final void mo1423a(C1089s c1089s) {
        switch (c1089s.f6948l) {
            case 0:
                return;
            case 1:
                this.f9252w.setVisibility(8);
                this.f9248s.setVisibility(8);
                this.f9251v.setVisibility(8);
                this.f9249t.setVisibility(8);
                this.f9250u.setVisibility(0);
                return;
            case 2:
                at atVar = this.f9244o.f9256d;
                this.f9252w.setVisibility(8);
                this.f9250u.setVisibility(8);
                this.f9249t.setVisibility(0);
                this.f9249t.setText(atVar.b);
                this.f9248s.setVisibility(0);
                ae.m9217a(this.f9248s, atVar.c);
                this.f9251v.setVisibility(0);
                this.f9247r.setText(atVar.d);
                return;
            case 3:
                new C1508k().m8856b(C1290m.m7702a(this, this.f9244o.f9257e)).m8860d((int) C7582R.string.ok).m8851a(null, 0, null).mo2272a().m625a(H_(), "ChangeSubscriptionPriceActivity.errorDialog");
                return;
            default:
                throw new IllegalStateException("Unhandled state change: " + c1089s.f6948l);
        }
    }

    public void onClick(View view) {
        if (view != this.f9247r) {
            FinskyLog.m21669e("Unknown button selected", new Object[0]);
            finish();
        } else if (this.f9244o.f6948l == 0) {
            C0660x c0660x = this.f9244o;
            c0660x.f9254b.mo1564a(c0660x.f9255c, c0660x, (C0657w) c0660x);
            c0660x.m6758b(1, 0);
        } else if (this.f9244o.f6948l == 2) {
            setResult(-1);
            finish();
        } else {
            FinskyLog.m21669e("Button selected during unexpected sidecar state", new Object[0]);
            finish();
        }
    }
}

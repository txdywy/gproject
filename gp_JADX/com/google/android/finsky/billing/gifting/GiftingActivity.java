package com.google.android.finsky.billing.gifting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.cv.p177a.jl;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.utils.ParcelableProto;
import com.squareup.leakcanary.C7582R;

public class GiftingActivity extends C1647h implements C1087t {
    public C1836b f9418n;
    public boolean f9419o;
    public int f9420p;
    public int f9421q;
    public View f9422r;
    public ProgressBar f9423s;
    public FrameLayout f9424t;
    public SendGiftLayout f9425u;
    public ViewGroup f9426v;
    public PlayActionButtonV2 f9427w;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.gifting_activity);
        LayoutInflater layoutInflater = getLayoutInflater();
        this.f9425u = (SendGiftLayout) layoutInflater.inflate(C7582R.layout.send_gift, null);
        this.f9426v = (ViewGroup) layoutInflater.inflate(C7582R.layout.light_purchase_error_step, null);
        this.f9422r = findViewById(C7582R.id.content_frame);
        this.f9427w = (PlayActionButtonV2) findViewById(C7582R.id.continue_button);
        this.f9424t = (FrameLayout) findViewById(C7582R.id.content_frame_above_button);
        this.f9423s = (ProgressBar) findViewById(C7582R.id.progress_bar);
        Intent intent = getIntent();
        this.f9420p = intent.getIntExtra("GiftingActivity.backend", 0);
        this.f9421q = intent.getIntExtra("GiftingActivity.documentType", 7);
        if (bundle != null) {
            this.f9419o = bundle.getBoolean("GiftingActivity.isGiftingComplete");
        }
    }

    public void onStart() {
        super.onStart();
        this.f9418n = (C1836b) H_().mo281a((int) C7582R.id.content_frame);
        if (this.f9418n == null) {
            this.f9418n = C1836b.m9880a((jl) ParcelableProto.m21672a(getIntent(), "GiftingActivity.action"), this.B, this.E);
            H_().mo284a().mo325a((int) C7582R.id.content_frame, this.f9418n).mo334c();
        }
        if (!this.f9419o) {
            this.f9418n.m6757a((C1087t) this);
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f9418n != null) {
            this.f9418n.m6757a(null);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("GiftingActivity.isGiftingComplete", this.f9419o);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 1:
                finish();
                return;
            default:
                throw new IllegalStateException("Unknown requestCode " + i);
        }
    }

    public final void mo1423a(C1089s c1089s) {
        if (c1089s instanceof C1836b) {
            switch (this.f9418n.f6948l) {
                case 0:
                    return;
                case 1:
                    if (this.f9418n.af == 1) {
                        this.E.m13370a(new C2488p().m13345b(this).m13340a(5552));
                        this.f9425u.m9878a(this, this.f9418n.f9449f, this.f9420p, this.f9421q);
                        this.f9427w.mo2588a(this.f9420p, this.f9418n.f9449f.f12807f, new C1837c(this));
                        m9873a(this.f9425u);
                        return;
                    }
                    this.f9424t.removeAllViews();
                    this.f9427w.setVisibility(4);
                    this.f9422r.setVisibility(0);
                    this.f9423s.setVisibility(0);
                    return;
                case 2:
                    startActivityForResult(this.f9418n.mo968W(), 1);
                    this.f9419o = true;
                    return;
                case 3:
                    this.E.m13370a(new C2488p().m13345b(this).m13340a(5554));
                    ((TextView) this.f9426v.findViewById(C7582R.id.title)).setText(this.f9418n.m9887c(this));
                    ((TextView) this.f9426v.findViewById(C7582R.id.message)).setText(this.f9418n.m9885b((Context) this));
                    this.f9427w.mo2588a(this.f9420p, getString(C7582R.string.ok), new C1838d(this));
                    m9873a(this.f9426v);
                    return;
                default:
                    throw new IllegalStateException("Unknown GiftSidecar state:" + this.f9418n.f6948l);
            }
        }
        String str = "Unexpected sidecar: ";
        String valueOf = String.valueOf(c1089s.getClass().getName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    private final void m9873a(View view) {
        this.f9424t.removeAllViews();
        this.f9424t.addView(view);
        this.f9427w.setVisibility(0);
        this.f9422r.setVisibility(0);
        this.f9423s.setVisibility(4);
    }

    protected final int mo2368f() {
        return 5551;
    }
}

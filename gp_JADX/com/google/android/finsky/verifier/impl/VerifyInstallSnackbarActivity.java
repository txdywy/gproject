package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p011c.p012a.C0054l;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.p028a.C0221j;
import android.support.v7.app.aa;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.squareup.leakcanary.C7582R;

public final class VerifyInstallSnackbarActivity extends aa {
    public C0221j f24339q;
    public BroadcastReceiver f24340r;
    public da f24341s;
    public Handler f24342t;

    static void m22021a(Context context, boolean z) {
        Intent intent = new Intent(context, VerifyInstallSnackbarActivity.class);
        intent.setFlags(1342177280);
        intent.putExtra("verify_install_offline", z);
        context.startActivity(intent);
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24340r = new dc(this);
        this.f24339q = C0221j.m1129a((Context) this);
        this.f24339q.m1132a(this.f24340r, new IntentFilter("verify_install_complete"));
        this.f24339q.m1132a(this.f24340r, new IntentFilter("verify_install_dialog_shown"));
        this.f24339q.m1132a(this.f24340r, new IntentFilter("verify_install_safe"));
        this.f24342t = new Handler(Looper.getMainLooper());
        setContentView((int) C7582R.layout.verifier_scanning_transparent_activity);
        LinearLayout linearLayout = (LinearLayout) findViewById(C7582R.id.transparent_activity);
        linearLayout.setOnClickListener(new cu(this));
        View inflate = LayoutInflater.from(this).inflate(C7582R.layout.verifier_scanning_snackbar_content, null);
        Drawable e = C0259a.m1526e(C0054l.m66a(getResources(), C7582R.drawable.ic_play_protect_check_black_24dp, null));
        C0259a.m1514a(e.mutate(), C0216d.m1116c(this, C7582R.color.white));
        ((ImageView) inflate.findViewById(C7582R.id.verified)).setImageDrawable(e);
        inflate.setOnClickListener(new cw(this));
        this.f24341s = new da(linearLayout, inflate);
        this.f24341s.f659e.addOnAttachStateChangeListener(new cx(this));
        if (getIntent().getBooleanExtra("verify_install_offline", false)) {
            da daVar = this.f24341s;
            daVar.f24576l.setVisibility(8);
            daVar.f24575k.setVisibility(8);
            daVar.f24577m.setVisibility(0);
            daVar.f24578n.setText(C7582R.string.verify_app_install_offline);
            m22022k();
        }
        this.f24342t.post(new cy(this));
    }

    protected final void onDestroy() {
        super.onDestroy();
        if (this.f24339q != null) {
            this.f24339q.m1131a(this.f24340r);
            this.f24339q = null;
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onBackPressed() {
    }

    final void m22022k() {
        this.f24342t.postDelayed(new cz(this), 3000);
    }
}

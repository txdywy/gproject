package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.notification.C1061b;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.pagesystem.C1037e;
import com.squareup.leakcanary.C7582R;

public class InlineAppPostPurchaseDialog extends C1036b implements C1037e {
    public final C1061b f6349G = new ee(this);
    public C1473m f6350H;
    public ef f6351I;
    public Document f6352J;
    public C3748a f6353K;
    public boolean f6354L;
    public final C2471a f6355t = C1473m.f7980a.aR();

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6354L = C1473m.f7980a.dj().mo2294a(12641721);
        Intent intent = getIntent();
        this.f6352J = (Document) intent.getParcelableExtra("document");
        setContentView((int) C7582R.layout.inline_app_dialog);
        this.f6350H = C1473m.f7980a;
        this.f6353K = this.f6350H.mo2252k().mo3727b(this);
        ab H_ = H_();
        this.f6351I = (ef) H_.mo281a((int) C7582R.id.content_frame);
        if (this.f6351I == null) {
            String a = this.f6350H.bt().m15626a(this.f6352J.f14885a.f12096c).m15620a(this.f6350H.cZ());
            this.C = this.f6355t.m13180a(bundle, intent);
            this.f6351I = ef.m6499a(this.f6350H, this.f6352J, a, this.f6316C, (Intent) intent.getParcelableExtra("relaunchInitialDialogIntent"));
            aw a2 = H_.mo284a();
            a2.mo325a((int) C7582R.id.content_frame, this.f6351I);
            a2.mo334c();
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.f6354L && this.f6354L) {
            C1473m.f7980a.mo2259r().mo3776a(this.f6349G);
        }
    }

    protected void onPause() {
        super.onPause();
        if (this.f6354L) {
            C1473m.f7980a.mo2259r().mo3801b(this.f6349G);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i != 100) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            startActivity((Intent) getIntent().getParcelableExtra("relaunchInitialDialogIntent"));
            finish();
        }
    }

    public final C3748a y_() {
        return this.f6353K;
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
}

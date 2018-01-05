package com.google.android.finsky.instantappsquickinstall;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.C0656n;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.providers.C3947d;
import java.util.ArrayList;

@TargetApi(21)
public class InstantAppsInstallDialogActivity extends C1036b implements C3602i {
    public ValidatedQuickInstallRequest f17920G;
    public Document f17921H;
    public C3610h f17922I;
    public C0656n f17923J;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1396e) C3947d.m18649a(C1396e.class)).mo1857a(this);
        this.f17920G = (ValidatedQuickInstallRequest) getIntent().getParcelableExtra("validatedRequest");
        if (bundle != null && bundle.containsKey("document")) {
            this.f17921H = (Document) bundle.getParcelable("document");
        }
        C3610h c3610h = (C3610h) H_().mo283a("approvalDialog");
        if (c3610h == null) {
            c3610h = new C3610h();
            c3610h.m625a(H_(), "approvalDialog");
        }
        this.f17922I = c3610h;
    }

    protected void onStart() {
        super.onStart();
        if (this.f17922I.ag == null) {
            this.f17923J = C1473m.f7980a.ap().mo1599a(C1289l.m7694a(this.f17920G.f17930a), true, true, this.f17920G.f17930a, new ArrayList(), new C3604a(this), new C3605b(this));
        }
    }

    protected void onStop() {
        if (this.f17923J != null) {
            this.f17923J.mo1057f();
        }
        super.onStop();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f17921H != null) {
            bundle.putParcelable("document", this.f17921H);
        }
    }

    public final void mo3551h(boolean z) {
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("document", this.f17921H);
            setResult(-1, intent);
            finish();
            return;
        }
        finish();
    }
}

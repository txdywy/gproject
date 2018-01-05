package com.google.android.finsky.be;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2475d;
import com.squareup.leakcanary.C7582R;

final class C1596d implements OnClickListener {
    public final /* synthetic */ Intent f8484a;
    public final /* synthetic */ C1593a f8485b;

    C1596d(C1593a c1593a, Intent intent) {
        this.f8485b = c1593a;
        this.f8484a = intent;
    }

    public final void onClick(View view) {
        this.f8485b.ap = true;
        this.f8485b.bw.m13379b(new C2475d(this.f8485b.as));
        this.f8485b.f8480f.m7228a(this.f8485b.bu, this.f8485b.bw, this.f8484a);
        if (C1473m.f7980a.dj().mo2294a(12631833)) {
            Snackbar.m500a(this.f8485b.f746R, this.f8485b.m592c((int) C7582R.string.deeplink_loading_network_error_body_submitted), 0).m493a();
            this.f8485b.bp.mo3646a(this.f8485b.k_, this.f8485b.bw);
            return;
        }
        this.f8485b.aj();
    }
}

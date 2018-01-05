package com.google.android.finsky.cf.p116a;

import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0957n;
import com.squareup.leakcanary.C7582R;

final class C2270c implements OnClickListener {
    public final /* synthetic */ C0957n f11264a;
    public final /* synthetic */ int f11265b;
    public final /* synthetic */ C2269b f11266c;

    C2270c(C2269b c2269b, C0957n c0957n, int i) {
        this.f11266c = c2269b;
        this.f11264a = c0957n;
        this.f11265b = i;
    }

    public final void onClick(View view) {
        if (this.f11266c.f11263c.f11259f != null) {
            this.f11266c.f11263c.f11259f.mo1360b();
        }
        this.f11266c.f11263c.f11260g.m494a(3);
        this.f11264a.m5763a(Boolean.TRUE);
        this.f11266c.f11263c.f11258e.m11730a();
        this.f11266c.f11263c.f11260g = Snackbar.m499a(this.f11266c.f11263c.f11256c, (int) C7582R.string.network_notification_requested_txt, this.f11265b);
        this.f11266c.f11263c.f11260g.m493a();
    }
}

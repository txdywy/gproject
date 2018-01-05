package android.support.v7.widget;

import android.support.v4.view.by;
import android.view.View;

final class hm extends by {
    public boolean f3586a = false;
    public final /* synthetic */ int f3587b;
    public final /* synthetic */ hk f3588c;

    hm(hk hkVar, int i) {
        this.f3588c = hkVar;
        this.f3587b = i;
    }

    public final void mo440a(View view) {
        this.f3588c.f3567a.setVisibility(0);
    }

    public final void mo441b(View view) {
        if (!this.f3586a) {
            this.f3588c.f3567a.setVisibility(this.f3587b);
        }
    }

    public final void mo442c(View view) {
        this.f3586a = true;
    }
}

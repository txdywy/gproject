package android.support.v7.widget;

import android.support.v7.view.menu.C0466a;
import android.view.View;
import android.view.View.OnClickListener;

final class hl implements OnClickListener {
    public final C0466a f3584a = new C0466a(this.f3585b.f3567a.getContext(), this.f3585b.f3575i);
    public final /* synthetic */ hk f3585b;

    hl(hk hkVar) {
        this.f3585b = hkVar;
    }

    public final void onClick(View view) {
        if (this.f3585b.f3578l != null && this.f3585b.f3579m) {
            this.f3585b.f3578l.onMenuItemSelected(0, this.f3584a);
        }
    }
}

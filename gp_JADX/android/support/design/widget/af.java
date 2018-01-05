package android.support.design.widget;

import android.os.Bundle;
import android.support.v4.view.C0132b;
import android.support.v4.view.p038a.C0333b;
import android.view.View;

final class af extends C0132b {
    public final /* synthetic */ ad f725a;

    af(ad adVar) {
        this.f725a = adVar;
    }

    public final void mo67a(View view, C0333b c0333b) {
        super.mo67a(view, c0333b);
        if (this.f725a.f720b) {
            c0333b.m1765a(1048576);
            c0333b.m1785j(true);
            return;
        }
        c0333b.m1785j(false);
    }

    public final boolean mo131a(View view, int i, Bundle bundle) {
        if (i != 1048576 || !this.f725a.f720b) {
            return super.mo131a(view, i, bundle);
        }
        this.f725a.cancel();
        return true;
    }
}

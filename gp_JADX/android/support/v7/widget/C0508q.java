package android.support.v7.widget;

import android.content.Context;
import android.support.v7.p040a.C0394a;
import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.ad;
import android.view.View;

final class C0508q extends ad {
    public final /* synthetic */ C0502k f3650m;

    public C0508q(C0502k c0502k, Context context, C0471p c0471p, View view) {
        this.f3650m = c0502k;
        super(context, c0471p, view, true, C0394a.actionOverflowMenuStyle);
        m2788a(c0502k.f3625B);
    }

    protected final void mo927d() {
        if (this.f3650m.c != null) {
            this.f3650m.c.close();
        }
        this.f3650m.f3641x = null;
        super.mo927d();
    }
}

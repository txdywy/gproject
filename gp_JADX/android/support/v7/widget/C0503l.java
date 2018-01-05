package android.support.v7.widget;

import android.content.Context;
import android.support.v7.p040a.C0394a;
import android.support.v7.view.menu.C0485t;
import android.support.v7.view.menu.ad;
import android.support.v7.view.menu.ap;
import android.view.View;

final class C0503l extends ad {
    public final /* synthetic */ C0502k f3644m;

    public C0503l(C0502k c0502k, Context context, ap apVar, View view) {
        this.f3644m = c0502k;
        super(context, apVar, view, false, C0394a.actionOverflowMenuStyle);
        if (!((C0485t) apVar.getItem()).m2923f()) {
            this.f2684f = c0502k.f3626i == null ? (View) c0502k.h : c0502k.f3626i;
        }
        m2788a(c0502k.f3625B);
    }

    protected final void mo927d() {
        this.f3644m.f3642y = null;
        super.mo927d();
    }
}

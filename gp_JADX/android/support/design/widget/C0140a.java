package android.support.design.widget;

import android.support.v4.view.ae;
import android.support.v4.view.ai;
import android.support.v4.view.ca;
import android.view.View;

final class C0140a implements ae {
    public final /* synthetic */ AppBarLayout f714a;

    C0140a(AppBarLayout appBarLayout) {
        this.f714a = appBarLayout;
    }

    public final ca mo123a(View view, ca caVar) {
        View view2 = this.f714a;
        ca caVar2 = null;
        if (ai.f1848a.mo397i(view2)) {
            caVar2 = caVar;
        }
        if (!cr.m774a(view2.f573f, caVar2)) {
            view2.f573f = caVar2;
            view2.m411a();
        }
        return caVar;
    }
}

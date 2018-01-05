package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.layout.play.PlayCategoryCircleItemView;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.play.image.a;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.wireless.android.finsky.dfe.nano.ag;
import com.squareup.leakcanary.C7582R;

final class C1163g implements C1158a {
    public ad f7194a;
    public final /* synthetic */ C1161e f7195b;

    C1163g(C1161e c1161e) {
        this.f7195b = c1161e;
    }

    public final String mo1480a() {
        return "category_quick_links";
    }

    public final int mo1486c() {
        return this.f7195b.f7174j.length;
    }

    public final int mo1477a(int i) {
        return C7582R.layout.play_category_circle_item_view;
    }

    public final float mo1482b(int i) {
        return 1.0f;
    }

    public final boolean mo1484b() {
        return false;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        C1473m.f7980a.bR();
        return af.m9222a(this.f7195b.f7178n, this.f7195b.f7174j[i].d, this.f7195b.f7172h, i2, i3, yVar);
    }

    public final /* synthetic */ int mo1478a(View view) {
        return ((PlayCategoryCircleItemView) view).getIconWidth();
    }

    public final /* synthetic */ int mo1483b(View view) {
        return ((PlayCategoryCircleItemView) view).getIconWidth();
    }

    public final /* bridge */ /* synthetic */ float mo1485c(View view) {
        return 1.0f;
    }

    public final /* synthetic */ void mo1481a(View view, int i) {
        PlayCategoryCircleItemView playCategoryCircleItemView = (PlayCategoryCircleItemView) view;
        if (i < this.f7195b.f7174j.length) {
            ag agVar = this.f7195b.f7174j[i];
            C3748a c3748a = this.f7195b.f7168d;
            DfeToc dfeToc = this.f7195b.f7171g;
            ad adVar = this.f7194a;
            C2495w c2495w = this.f7195b.f7165A;
            playCategoryCircleItemView.f18706f = agVar.c;
            playCategoryCircleItemView.f18707g = agVar.g;
            playCategoryCircleItemView.f18708h = agVar.e;
            playCategoryCircleItemView.f18709i = c3748a;
            playCategoryCircleItemView.f18710j = dfeToc;
            playCategoryCircleItemView.f18703c = C1608h.m9243a(playCategoryCircleItemView.getContext(), agVar.g);
            bd bdVar = agVar.d;
            if (!(playCategoryCircleItemView.f18702b == null || bdVar == null)) {
                C1473m.f7980a.ar().m9288a(playCategoryCircleItemView.f18702b, bdVar.f11860f, bdVar.f11863i);
            }
            playCategoryCircleItemView.f18701a.setText(playCategoryCircleItemView.f18706f);
            playCategoryCircleItemView.setContentDescription(playCategoryCircleItemView.f18706f);
            C2482j.m13285a(playCategoryCircleItemView.getPlayStoreUiElement(), agVar.i);
            playCategoryCircleItemView.f18711k = adVar;
            playCategoryCircleItemView.f18712l = c2495w;
            playCategoryCircleItemView.getParentNode().mo1219a(playCategoryCircleItemView);
            playCategoryCircleItemView.f18703c = C1607g.m9236a(agVar.d, playCategoryCircleItemView.f18703c);
            playCategoryCircleItemView.f18702b.setBitmapTransformation(a.a(playCategoryCircleItemView.getResources(), playCategoryCircleItemView.f18703c));
        }
    }
}

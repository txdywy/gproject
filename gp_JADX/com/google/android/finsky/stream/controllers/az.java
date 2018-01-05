package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.controllers.view.JpkrFlatDealsAndPromosBannerItemView;
import com.google.android.finsky.stream.controllers.view.JpkrFlatDealsAndPromosClusterView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.x;
import com.google.android.play.image.y;

final class az implements C1158a {
    public final JpkrFlatDealsAndPromosClusterView f21887a;
    public final Document f21888b;
    public final int f21889c;
    public final int f21890d;
    public final C2720j f21891e;
    public final /* synthetic */ ay f21892f;

    public az(ay ayVar, JpkrFlatDealsAndPromosClusterView jpkrFlatDealsAndPromosClusterView, Document document, C2720j c2720j, int i, int i2) {
        this.f21892f = ayVar;
        this.f21887a = jpkrFlatDealsAndPromosClusterView;
        this.f21888b = document;
        this.f21889c = i;
        this.f21891e = c2720j;
        this.f21890d = i2;
    }

    public final String mo1480a() {
        return this.f21888b.f14885a.f12096c;
    }

    public final int mo1477a(int i) {
        return this.f21889c;
    }

    public final boolean mo1484b() {
        return this.f21891e.f14901t;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        return af.m9223a(this.f21892f.e, (Document) this.f21891e.m14679a(i, false), C1473m.f7980a.be(), i2, i3, yVar, iArr);
    }

    public final int mo1486c() {
        return this.f21891e.m14698m();
    }

    public final float mo1482b(int i) {
        return 0.5625f;
    }

    public final /* synthetic */ int mo1478a(View view) {
        return ((JpkrFlatDealsAndPromosBannerItemView) view).getImageView().getHeight();
    }

    public final /* synthetic */ int mo1483b(View view) {
        return ((JpkrFlatDealsAndPromosBannerItemView) view).getImageView().getWidth();
    }

    public final /* bridge */ /* synthetic */ float mo1485c(View view) {
        return 0.5625f;
    }

    public final /* synthetic */ void mo1481a(View view, int i) {
        OnClickListener onClickListener = (JpkrFlatDealsAndPromosBannerItemView) view;
        Document document = (Document) this.f21891e.m14679a(i, false);
        if (document != null) {
            C3748a c3748a = this.f21892f.f;
            ad parentOfChildren = this.f21887a.getParentOfChildren();
            C2495w c2495w = this.f21892f.i;
            int i2 = this.f21890d;
            onClickListener.f22904j = document;
            onClickListener.f22898d = 0.5625f;
            onClickListener.f22905k = c3748a;
            onClickListener.f22906l = c2495w;
            if (i2 <= 0) {
                FinskyLog.m21669e("Merch banner doesn't support non-positive number of columns: " + i2 + " passed", new Object[0]);
            } else {
                onClickListener.f22899e = i2;
            }
            OnClickListener a = onClickListener.f22905k.mo3625a(onClickListener, onClickListener.f22904j);
            byte[] bArr = document.f14885a.f12087D;
            af afVar = onClickListener.f22897c;
            bd a2 = af.m9220a(document, 0, 0, JpkrFlatDealsAndPromosBannerItemView.f22895a);
            onClickListener.f22896b.m9288a(onClickListener.f22900f, a2.f11860f, a2.f11863i);
            onClickListener.f22901g.setText(document.f14885a.f12100g);
            onClickListener.setOnClickListener(a);
            onClickListener.f22902h = C2482j.m13283a(530);
            C2482j.m13285a(onClickListener.f22902h, bArr);
            onClickListener.f22903i = parentOfChildren;
            onClickListener.getParentNode().mo1219a(onClickListener);
            onClickListener.requestLayout();
        }
    }
}

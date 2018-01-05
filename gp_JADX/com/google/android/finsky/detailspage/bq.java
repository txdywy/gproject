package com.google.android.finsky.detailspage;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.C2444q;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.PlayCardJpkrEditorialKeyPointView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class bq extends ck implements ad {
    public ce f14320d = C2482j.m13283a(1870);
    public OnClickListener f14321e;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.editorial_review_module;
    }

    public final boolean mo2979f() {
        return (this.b == null || ((bs) this.b).f14323a == null) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (C1473m.f7980a.dj().mo2294a(12631255) && z && document != null && document.aO() != null && this.b == null) {
            this.b = new bs();
            ((bs) this.b).f14323a = document.aO();
            ((bs) this.b).f14324b = document.f14885a.f12099f;
        }
    }

    public final void mo2976b(View view, int i) {
        EditorialReviewModuleLayout editorialReviewModuleLayout = (EditorialReviewModuleLayout) view;
        if (this.f14321e == null) {
            this.f14321e = new br(this);
        }
        C2444q c2444q = ((bs) this.b).f14323a;
        int i2 = ((bs) this.b).f14324b;
        OnClickListener onClickListener = this.f14321e;
        bd bdVar = c2444q.f13199g;
        if (bdVar != null) {
            C1473m.f7980a.ar().m9288a(editorialReviewModuleLayout.f13984c, bdVar.f11860f, bdVar.f11863i);
            if (bdVar.m12248e()) {
                try {
                    editorialReviewModuleLayout.f13984c.setColorFilter(Color.parseColor(bdVar.f11871q));
                } catch (IllegalArgumentException e) {
                    FinskyLog.m21669e("Invalid color for EditorialReview icon tint: %s", bdVar.f11871q);
                }
            }
        }
        editorialReviewModuleLayout.f13982a.setText(c2444q.f13197e);
        editorialReviewModuleLayout.f13983b.setText(c2444q.f13198f);
        String[] strArr = c2444q.f13194b;
        if (strArr.length != 0) {
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (editorialReviewModuleLayout.f13985d.getChildCount() <= i3) {
                    LayoutInflater.from(editorialReviewModuleLayout.getContext()).inflate(C7582R.layout.editorial_review_key_point_view, editorialReviewModuleLayout.f13985d, true);
                }
                PlayCardJpkrEditorialKeyPointView playCardJpkrEditorialKeyPointView = (PlayCardJpkrEditorialKeyPointView) editorialReviewModuleLayout.f13985d.getChildAt(i3);
                int i4 = i3 + 1;
                CharSequence charSequence = strArr[i3];
                playCardJpkrEditorialKeyPointView.f19424a.setText(Integer.toString(i4));
                playCardJpkrEditorialKeyPointView.f19425b.setText(charSequence);
            }
            ((MarginLayoutParams) editorialReviewModuleLayout.f13985d.getChildAt(strArr.length - 1).getLayoutParams()).bottomMargin = 0;
            if (editorialReviewModuleLayout.f13985d.getChildCount() > strArr.length) {
                editorialReviewModuleLayout.f13985d.removeViews(strArr.length, editorialReviewModuleLayout.f13985d.getChildCount() - strArr.length);
            }
        }
        editorialReviewModuleLayout.f13986e.setOnClickListener(onClickListener);
        editorialReviewModuleLayout.f13986e.setTextColor(editorialReviewModuleLayout.getResources().getColor(C1608h.m9241a(i2)));
    }

    public ce getPlayStoreUiElement() {
        return this.f14320d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}

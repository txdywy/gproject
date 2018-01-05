package com.google.android.finsky.detailspage;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.el;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.IAPSnippet;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class cv extends ck implements ad {
    public ce f14373d;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.iap_list_module;
    }

    public final boolean mo2979f() {
        return (this.b == null || ((cw) this.b).f14375b == null || ((cw) this.b).f14375b.isEmpty()) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (z && this.b == null) {
            String str;
            el[] elVarArr;
            C2600d cwVar = new cw();
            if (document.bY()) {
                str = document.f14885a.f12115v.f13110Q.f12286c;
            } else {
                str = null;
            }
            cwVar.f14374a = str;
            if (document.bY()) {
                elVarArr = document.f14885a.f12115v.f13110Q.f12285b;
            } else {
                elVarArr = el.aY_();
            }
            cwVar.f14375b = new ArrayList(elVarArr.length);
            for (el elVar : elVarArr) {
                cwVar.f14375b.add(new Document(elVar.f12289c));
            }
            this.b = cwVar;
        }
    }

    public final void mo2976b(View view, int i) {
        IAPListModuleLayout iAPListModuleLayout = (IAPListModuleLayout) view;
        CharSequence charSequence = ((cw) this.b).f14374a;
        List list = ((cw) this.b).f14375b;
        if (charSequence == null || charSequence.isEmpty()) {
            iAPListModuleLayout.f14022a.setVisibility(8);
        } else {
            iAPListModuleLayout.f14022a.setText(charSequence);
            iAPListModuleLayout.f14022a.setVisibility(0);
        }
        LayoutInflater layoutInflater = null;
        int size = list.size();
        int childCount = iAPListModuleLayout.f14023b.getChildCount();
        int i2 = 0;
        while (i2 < size) {
            View view2;
            LayoutInflater layoutInflater2;
            Document document = (Document) list.get(i2);
            if (i2 < childCount) {
                view2 = (IAPSnippet) iAPListModuleLayout.f14023b.getChildAt(i2);
                view2.setVisibility(0);
                layoutInflater2 = layoutInflater;
                Object obj = null;
            } else {
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(iAPListModuleLayout.getContext());
                }
                IAPSnippet iAPSnippet = (IAPSnippet) layoutInflater.inflate(C7582R.layout.iap_snippet, null);
                iAPSnippet.setVisibility(0);
                layoutInflater2 = layoutInflater;
                int i3 = 1;
            }
            view2.f18243c.setText(Integer.toString(i2 + 1));
            view2.f18241a.setText(document.f14885a.f12100g);
            bl e = document.m14649e(1);
            if (e != null) {
                view2.f18242b.setText(e.f11917g);
                view2.f18242b.setVisibility(0);
            } else {
                view2.f18242b.setVisibility(8);
            }
            view2.f18244d.setVisibility((i2 < size + -1 ? 1 : null) != null ? 0 : 8);
            if (obj != null) {
                iAPListModuleLayout.f14023b.addView(view2);
            }
            i2++;
            layoutInflater = layoutInflater2;
        }
        for (int size2 = list.size(); size2 < childCount; size2++) {
            iAPListModuleLayout.f14023b.getChildAt(size2).setVisibility(8);
        }
        getParentNode().mo1219a(this);
    }

    public ce getPlayStoreUiElement() {
        if (this.f14373d == null) {
            this.f14373d = C2482j.m13283a(1877);
        }
        return this.f14373d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}

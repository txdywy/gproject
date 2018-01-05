package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.ExtrasItemSnippet;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.b;
import com.squareup.leakcanary.C7582R;

public class ce extends ej implements C0999d, cg {
    public boolean f14356d;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.extras_content_list_module;
    }

    public final boolean mo2979f() {
        return super.mo2979f() && ((cf) this.b).e.m14698m() != 0;
    }

    public final void mo2976b(View view, int i) {
        ExtrasContentListModuleLayout extrasContentListModuleLayout = (ExtrasContentListModuleLayout) view;
        if (!extrasContentListModuleLayout.f14004a || this.f14356d) {
            this.f14356d = false;
            ad adVar = this.I;
            C3748a c3748a = this.z;
            C2711x c2711x = ((cf) this.b).e;
            Document document = ((cf) this.b).f14359a;
            C2495w c2495w = this.J;
            extrasContentListModuleLayout.f14004a = true;
            extrasContentListModuleLayout.f14008e = this;
            CharSequence charSequence = c2711x.f14908a.f14885a.f12100g;
            CharSequence charSequence2 = c2711x.f14908a.f14885a.f12101h;
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
            if (isEmpty && isEmpty2) {
                extrasContentListModuleLayout.f14005b.setVisibility(8);
            } else {
                extrasContentListModuleLayout.f14005b.setVisibility(0);
                extrasContentListModuleLayout.f14006c.setText(charSequence);
                extrasContentListModuleLayout.f14006c.setVisibility(isEmpty ? 8 : 0);
                extrasContentListModuleLayout.f14007d.setText(charSequence2);
                extrasContentListModuleLayout.f14007d.setVisibility(isEmpty2 ? 8 : 0);
            }
            b bVar = null;
            int m = c2711x.m14698m();
            int childCount = extrasContentListModuleLayout.getChildCount() - 1;
            LayoutInflater layoutInflater = null;
            int i2 = 0;
            while (i2 < m) {
                LayoutInflater layoutInflater2;
                Document document2 = (Document) c2711x.m14679a(i2, true);
                b bVar2;
                Object obj;
                LayoutInflater layoutInflater3;
                b bVar3;
                if (i2 < childCount) {
                    bVar2 = (ExtrasItemSnippet) extrasContentListModuleLayout.getChildAt(i2 + 1);
                    if (bVar2.getDocument() == document2) {
                        layoutInflater2 = layoutInflater;
                    } else {
                        obj = null;
                        layoutInflater3 = layoutInflater;
                        bVar3 = bVar2;
                        if (document2 != document) {
                            bVar2 = bVar3;
                        } else {
                            bVar2 = bVar;
                        }
                        bVar3.f18197h = document2;
                        bVar3.f18201l = c3748a;
                        bVar3.f18198i = extrasContentListModuleLayout;
                        bVar3.f18203n = adVar;
                        bVar3.f18204o = c2495w;
                        C2482j.m13285a(bVar3.f18202m, document2.f14885a.f12087D);
                        bVar3.f18203n.mo1219a(bVar3);
                        if (obj == null) {
                            extrasContentListModuleLayout.addView(bVar3);
                        } else {
                            bVar3.m17303a();
                        }
                        bVar3.setVisibility(0);
                        layoutInflater2 = layoutInflater3;
                        bVar = bVar2;
                    }
                } else {
                    if (layoutInflater == null) {
                        layoutInflater = LayoutInflater.from(extrasContentListModuleLayout.getContext());
                    }
                    obj = 1;
                    layoutInflater3 = layoutInflater;
                    bVar3 = (ExtrasItemSnippet) layoutInflater.inflate(C7582R.layout.extras_item_snippet, extrasContentListModuleLayout, false);
                    if (document2 != document) {
                        bVar2 = bVar;
                    } else {
                        bVar2 = bVar3;
                    }
                    bVar3.f18197h = document2;
                    bVar3.f18201l = c3748a;
                    bVar3.f18198i = extrasContentListModuleLayout;
                    bVar3.f18203n = adVar;
                    bVar3.f18204o = c2495w;
                    C2482j.m13285a(bVar3.f18202m, document2.f14885a.f12087D);
                    bVar3.f18203n.mo1219a(bVar3);
                    if (obj == null) {
                        bVar3.m17303a();
                    } else {
                        extrasContentListModuleLayout.addView(bVar3);
                    }
                    bVar3.setVisibility(0);
                    layoutInflater2 = layoutInflater3;
                    bVar = bVar2;
                }
                i2++;
                layoutInflater = layoutInflater2;
            }
            for (int i3 = m; i3 < childCount; i3++) {
                extrasContentListModuleLayout.getChildAt(i3 + 1).setVisibility(8);
            }
            if (!(bVar == null || bVar.m17306b())) {
                bVar.m17304a(0);
            }
            extrasContentListModuleLayout.refreshDrawableState();
        }
    }

    public final void mo3065b(Document document) {
        ((cf) this.b).f14359a = document;
    }

    protected final void aa_() {
        this.D.mo2814a((C0999d) this);
        super.aa_();
    }

    public final void mo2980h() {
        this.D.mo2819b(this);
        super.mo2980h();
    }

    private final void m14031b() {
        if (mo2979f()) {
            this.f14356d = true;
            this.u.mo3033a(this, false);
        }
    }

    public final void m_() {
        m14031b();
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        m14031b();
    }

    protected final /* synthetic */ ek mo3047a(Document document) {
        if (document.f14885a.f12098e != 6 || TextUtils.isEmpty(document.bs())) {
            return null;
        }
        ek cfVar = new cf();
        cfVar.d = document.bs();
        return cfVar;
    }
}

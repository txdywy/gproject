package com.google.android.finsky.stream.controllers.genericcluster;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.C4255t;
import com.google.android.finsky.stream.base.horizontalclusters.C4258a;
import com.google.android.finsky.stream.base.horizontalclusters.C4261c;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4260a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4264l;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4270c;
import com.google.android.finsky.stream.base.view.C4295c;
import com.google.android.finsky.stream.controllers.genericcluster.view.C4408b;
import com.google.android.finsky.stream.controllers.genericcluster.view.C4411a;
import com.google.android.finsky.stream.controllers.genericcluster.view.FlatGenericClusterView;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public final class C4409a extends C4258a implements ab, C4408b {
    public int f22363A;
    public final Context f22364e;
    public final C4808a f22365s;
    public final C4254d f22366t;
    public final Resources f22367u = this.f22364e.getResources();
    public final ao f22368v;
    public final ac f22369w;
    public C4411a f22370x;
    public float f22371y;
    public boolean f22372z;

    public C4409a(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, C1294w c1294w, C4254d c4254d, ao aoVar, ac acVar) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, afVar, C1600a.f8505a, false, c1294w);
        this.f22365s = c4808a;
        this.f22364e = context;
        this.f22366t = c4254d;
        this.f22368v = aoVar;
        this.f22369w = acVar;
    }

    public final void mo4050a(C2720j c2720j) {
        boolean z;
        float f;
        int i = 0;
        super.mo4050a(c2720j);
        C2711x c2711x = this.g;
        int i2 = c2711x.f14908a.f14885a.f12099f;
        if (i2 != 3) {
            if (i2 == 13) {
                z = true;
            } else {
                int m = c2711x.m14698m();
                if (m > 0) {
                    float a = C4409a.m20631a((Document) c2711x.m14679a(0, false));
                    int min = Math.min(m, this.f22367u.getInteger(C7582R.integer.flat_multiple_aspect_ratios_documents_max_count));
                    for (m = 1; m < min; m++) {
                        Document document = (Document) c2711x.m14679a(m, false);
                        int i3 = document.f14885a.f12098e;
                        if (Math.abs(a - C4409a.m20631a(document)) > 0.2f || i3 == 3) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            this.f22372z = z;
            this.f22363A = this.f22369w.m18478a(this.f22372z);
            i2 = this.f22363A;
            if (i2 != C7582R.layout.flat_card_mini_multi_aspect_ratio_lite || i2 == C7582R.layout.flat_card_mini_multi_aspect_ratio) {
                while (i < this.g.m14698m()) {
                    if (m20632d(i) != 1.441f) {
                        f = 1.0f;
                        break;
                    }
                    i++;
                }
                f = 1.441f;
            } else if (i2 == C7582R.layout.flat_card_mini || i2 == C7582R.layout.flat_card_mini_lite) {
                while (i < this.g.m14698m()) {
                    if (m20632d(i) == 1.441f) {
                        f = 1.441f;
                        break;
                    }
                    i++;
                }
                f = 1.0f;
            } else {
                throw new IllegalStateException("Card layout not supported");
            }
            this.f22371y = f;
        }
        z = false;
        this.f22372z = z;
        this.f22363A = this.f22369w.m18478a(this.f22372z);
        i2 = this.f22363A;
        if (i2 != C7582R.layout.flat_card_mini_multi_aspect_ratio_lite) {
        }
        while (i < this.g.m14698m()) {
            if (m20632d(i) != 1.441f) {
                f = 1.0f;
                break;
            }
            i++;
        }
        f = 1.441f;
        this.f22371y = f;
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.flat_card_generic_cluster;
    }

    public final void mo1510a(View view, int i) {
        C4411a c4411a;
        Bundle bundle;
        super.mo1510a(view, i);
        Document document = this.g.f14908a;
        FlatGenericClusterView flatGenericClusterView = (FlatGenericClusterView) view;
        C4411a c4411a2 = this.f22370x;
        if (c4411a2 == null) {
            c4411a = new C4411a();
        } else {
            c4411a = c4411a2;
        }
        c4411a.f22392h = C1542f.m8970a(document);
        c4411a.f22387c = this.f22363A;
        c4411a.f22386b = document.f14885a.f12099f;
        c4411a.f22388d = document.f14885a.f12100g;
        c4411a.f22389e = document.f14885a.f12101h;
        c4411a.f22393i = 0;
        c4411a.f22394j = document.f14885a.f12087D;
        c4411a.f22391g = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
        c4411a.f22390f = this.f22366t.m19769a(this.f22364e, document, document.m14638a(), null, false);
        c4411a.f22385a = m19771a(c4411a.f22385a);
        c4411a.f22395k = this.f22371y;
        this.f22370x = c4411a;
        if (this.D != null) {
            bundle = ((C4410b) this.D).f22373b;
        } else {
            bundle = null;
        }
        C4411a c4411a3 = this.f22370x;
        C4264l c4264l = this.f21522q;
        ad adVar = this.h;
        flatGenericClusterView.f22375b = c4411a3.f22387c;
        flatGenericClusterView.f22376c = c4411a3.f22395k;
        if (flatGenericClusterView.f22382i == null) {
            flatGenericClusterView.f22382i = new C4270c(flatGenericClusterView.getResources(), flatGenericClusterView.f22383j, flatGenericClusterView.f22375b, flatGenericClusterView.f22376c);
        } else {
            C4270c c4270c = flatGenericClusterView.f22382i;
            float f = flatGenericClusterView.f22376c;
            int i2 = flatGenericClusterView.f22375b;
            c4270c.f21554c = f;
            c4270c.f21553b = i2;
        }
        if (flatGenericClusterView.f22375b == C7582R.layout.flat_card_mini_multi_aspect_ratio_lite || flatGenericClusterView.f22375b == C7582R.layout.flat_card_mini_multi_aspect_ratio) {
            flatGenericClusterView.f22374a.setSupportsSnapping(false);
            flatGenericClusterView.f22374a.setChildPeekingAmount(0.0f);
            flatGenericClusterView.f22374a.setChildWidthPolicy(3);
        } else if (flatGenericClusterView.f22375b == C7582R.layout.flat_card_mini_lite || flatGenericClusterView.f22375b == C7582R.layout.flat_card_mini) {
            flatGenericClusterView.f22374a.mo3607z();
        } else {
            throw new IllegalStateException("Card layout not supported");
        }
        flatGenericClusterView.f22377d = this;
        flatGenericClusterView.f22378e = this;
        byte[] bArr = c4411a3.f22394j;
        if (flatGenericClusterView.f22380g == null) {
            flatGenericClusterView.f22380g = new C2473o(0);
        }
        if (!flatGenericClusterView.f22381h) {
            flatGenericClusterView.f22380g.m13200a(400, bArr, adVar);
        }
        if (flatGenericClusterView.f22379f != null) {
            C4295c c4295c = new C4295c();
            c4295c.f21657a = c4411a3.f22386b;
            c4295c.f21658b = c4411a3.f22388d;
            c4295c.f21659c = c4411a3.f22389e;
            c4295c.f21660d = c4411a3.f22390f;
            c4295c.f21661e = c4411a3.f22391g;
            c4295c.f21662f = c4411a3.f22392h;
            flatGenericClusterView.f22379f.setTextShade(c4411a3.f22393i);
            flatGenericClusterView.f22379f.mo3611a(c4295c, flatGenericClusterView);
            flatGenericClusterView.f22379f.setVisibility(0);
        }
        flatGenericClusterView.f22374a.m19813a(c4411a3.f22385a, bundle, flatGenericClusterView.f22382i, c4264l, flatGenericClusterView.f22378e, flatGenericClusterView, adVar);
        this.h.mo1219a(flatGenericClusterView.getPlayStoreUiElementNode());
    }

    public final void mo1511b(View view, int i) {
        FlatGenericClusterView flatGenericClusterView = (FlatGenericClusterView) view;
        if (this.D == null) {
            this.D = new C4410b();
            ((C4410b) this.D).f22373b = new Bundle();
        }
        ((C4410b) this.D).f22373b.clear();
        flatGenericClusterView.m20644a(((C4410b) this.D).f22373b);
        flatGenericClusterView.Z_();
    }

    protected final C4260a mo4108b(int i) {
        return new C4261c((Document) this.g.m14679a(i, false), this.f22365s, this, this.f22368v, this.i, this.f, this.f22363A, this.f22367u, this.d, i, this.f22372z, m20632d(i), this.f22371y, this.g.f14908a.f14885a.f12096c);
    }

    private static float m20631a(Document document) {
        bd a = C1600a.m9198a(document);
        if (a == null || a.f11859e == null || a.f11859e.f11878b == 0) {
            return C1617r.m9292a(document.f14885a.f12098e);
        }
        return ((float) a.f11859e.f11879c) / ((float) a.f11859e.f11878b);
    }

    public final void mo4194a(ad adVar) {
        this.f.mo3655a(this.g.f14908a, adVar, this.i);
    }

    public final void mo4195a(FlatGenericClusterView flatGenericClusterView) {
        if (this.D == null) {
            this.D = new C4410b();
            ((C4410b) this.D).f22373b = new Bundle();
        }
        ((C4410b) this.D).f22373b.clear();
        flatGenericClusterView.m20644a(((C4410b) this.D).f22373b);
    }

    public final void mo1448a(Document document, d dVar) {
        this.f22365s.m22589b(document.f14885a.f12096c);
        this.C.mo4087a(this, 0, 1, true);
    }

    private final float m20632d(int i) {
        Document document = (Document) this.g.m14679a(i, false);
        if (document == null) {
            return -1.0f;
        }
        return C1617r.m9292a(document.f14885a.f12098e);
    }

    public final /* synthetic */ C4255t mo4062s() {
        if (this.D == null) {
            this.D = new C4410b();
            ((C4410b) this.D).f22373b = new Bundle();
        }
        ((C4410b) this.D).a = m19772a(((C4410b) this.D).a);
        return (C4410b) this.D;
    }
}

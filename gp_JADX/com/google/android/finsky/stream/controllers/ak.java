package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.ix;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.playcard.C3903c;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.C4255t;
import com.google.android.finsky.stream.base.horizontalclusters.C4258a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4260a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4264l;
import com.google.android.finsky.stream.base.view.C4295c;
import com.google.android.finsky.stream.controllers.view.C4303e;
import com.google.android.finsky.stream.controllers.view.C4506d;
import com.google.android.finsky.stream.controllers.view.FlatCardScreenshotClusterViewV2;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public final class ak extends C4258a implements ab, C4303e {
    public final Context f21703e;
    public final ao f21704s;
    public final C4254d f21705t;
    public final C0002a f21706u;
    public final C4808a f21707v;
    public C4506d f21708w;
    public float f21709x;

    public ak(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, ao aoVar, af afVar, C4254d c4254d, boolean z, C1294w c1294w, C0002a c0002a) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, afVar, C1600a.f8505a, z, c1294w);
        this.f21703e = context;
        this.f21705t = c4254d;
        this.f21707v = c4808a;
        this.f21704s = aoVar;
        this.f21706u = c0002a;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f21709x = 0.5625f;
        ix aY = c2720j.f14908a.aY();
        ((C3903c) this.f21706u.mo1a()).m18552a(aY.f12748d, aY.f12746b, aY.f12747c);
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.flat_card_screenshot_cluster_v2;
    }

    public final void mo1510a(View view, int i) {
        C4506d c4506d;
        Bundle bundle;
        super.mo1510a(view, i);
        Document document = this.g.f14908a;
        FlatCardScreenshotClusterViewV2 flatCardScreenshotClusterViewV2 = (FlatCardScreenshotClusterViewV2) view;
        C4506d c4506d2 = this.f21708w;
        if (c4506d2 == null) {
            c4506d = new C4506d();
        } else {
            c4506d = c4506d2;
        }
        c4506d.f23107g = C1542f.m8970a(document);
        c4506d.f23102b = document.f14885a.f12099f;
        c4506d.f23103c = document.f14885a.f12100g;
        c4506d.f23104d = document.f14885a.f12101h;
        c4506d.f23108h = 0;
        c4506d.f23110j = document.f14885a.f12087D;
        c4506d.f23106f = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
        c4506d.f23105e = this.f21705t.m19769a(this.f21703e, document, document.m14638a(), null, false);
        c4506d.f23109i = 0.5625f;
        c4506d.f23101a = m19771a(c4506d.f23101a);
        this.f21708w = c4506d;
        if (this.D != null) {
            bundle = ((al) this.D).f21710b;
        } else {
            bundle = null;
        }
        C4506d c4506d3 = this.f21708w;
        C4264l c4264l = this.f21522q;
        ad adVar = this.h;
        flatCardScreenshotClusterViewV2.f22889e = this;
        flatCardScreenshotClusterViewV2.f22890f = this;
        byte[] bArr = c4506d3.f23110j;
        if (flatCardScreenshotClusterViewV2.f22892h == null) {
            flatCardScreenshotClusterViewV2.f22892h = new C2473o(0);
        }
        if (!flatCardScreenshotClusterViewV2.f22893i) {
            flatCardScreenshotClusterViewV2.f22892h.m13200a(466, bArr, adVar);
        }
        if (flatCardScreenshotClusterViewV2.f22891g != null) {
            C4295c c4295c = new C4295c();
            c4295c.f21657a = c4506d3.f23102b;
            c4295c.f21658b = c4506d3.f23103c;
            c4295c.f21659c = c4506d3.f23104d;
            c4295c.f21660d = c4506d3.f23105e;
            c4295c.f21661e = c4506d3.f23106f;
            c4295c.f21662f = c4506d3.f23107g;
            flatCardScreenshotClusterViewV2.f22891g.setTextShade(c4506d3.f23108h);
            flatCardScreenshotClusterViewV2.f22891g.mo3611a(c4295c, flatCardScreenshotClusterViewV2);
            flatCardScreenshotClusterViewV2.f22891g.setVisibility(0);
        }
        flatCardScreenshotClusterViewV2.f22888d = c4506d3.f23109i;
        flatCardScreenshotClusterViewV2.f22885a.m19813a(c4506d3.f23101a, bundle, flatCardScreenshotClusterViewV2, c4264l, flatCardScreenshotClusterViewV2.f22890f, flatCardScreenshotClusterViewV2, adVar);
        this.h.mo1219a(flatCardScreenshotClusterViewV2.getPlayStoreUiElementNode());
    }

    public final void mo1511b(View view, int i) {
        FlatCardScreenshotClusterViewV2 flatCardScreenshotClusterViewV2 = (FlatCardScreenshotClusterViewV2) view;
        if (this.D == null) {
            this.D = new al();
        }
        ((al) this.D).f21710b.clear();
        ((al) this.D).a.clear();
        flatCardScreenshotClusterViewV2.m21004a(((al) this.D).f21710b);
        flatCardScreenshotClusterViewV2.Z_();
    }

    protected final C4260a mo4108b(int i) {
        float f;
        Document document = (Document) this.g.m14679a(i, false);
        C4808a c4808a = this.f21707v;
        ao aoVar = this.f21704s;
        C2495w c2495w = this.i;
        C3748a c3748a = this.f;
        String str = this.g.f14908a.f14885a.f12096c;
        Document document2 = (Document) this.g.m14679a(i, false);
        if (document2 == null) {
            f = -1.0f;
        } else {
            f = C1617r.m9292a(document2.f14885a.f12098e);
        }
        return new by(document, c4808a, this, aoVar, c2495w, c3748a, i, str, f, this.f21709x, this.f21703e.getResources());
    }

    public final void mo4106a(ad adVar) {
        this.f.mo3655a(this.g.f14908a, adVar, this.i);
    }

    public final void mo4107a(FlatCardScreenshotClusterViewV2 flatCardScreenshotClusterViewV2) {
        if (this.D == null) {
            this.D = new al();
        }
        ((al) this.D).f21710b.clear();
        ((al) this.D).a.clear();
        flatCardScreenshotClusterViewV2.m21004a(((al) this.D).f21710b);
    }

    public final void mo1448a(Document document, d dVar) {
        this.f21707v.m22589b(document.f14885a.f12096c);
        this.C.mo4087a(this, 0, 1, true);
    }

    public final /* synthetic */ C4255t mo4062s() {
        if (this.D == null) {
            this.D = new al();
        }
        ((al) this.D).a = m19772a(((al) this.D).a);
        return (al) this.D;
    }
}

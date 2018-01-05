package com.google.android.finsky.stream.base;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.C3907h;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.view.C4296f;
import com.google.android.play.layout.d;

public abstract class C4253a extends C4252f implements C3907h {
    public final ao f21511a;
    public final ac f21512b;

    public C4253a(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, C1461c c1461c, ao aoVar, ac acVar) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c);
        this.f21511a = aoVar;
        this.f21512b = acVar;
    }

    public boolean mo4167b() {
        return false;
    }

    public void mo4063a(Document document, int i, View view) {
        d dVar = (d) view;
        if (dVar != null) {
            if (document == null) {
                dVar.d();
                return;
            }
            String str;
            Document document2 = this.g.f14908a;
            boolean a = mo4178a(document);
            if (document2 != null) {
                str = document2.f14885a.f12096c;
            } else {
                str = (String) this.g.m14697k().get(0);
            }
            int c = this.g.m14692c(i);
            this.f21511a.m18514a(dVar, document, c, str, this.f, a, this, this, true, mo4167b() ? c : -1, false, document.aZ(), this.i, null, this);
        }
    }

    public boolean mo4178a(Document document) {
        return ac.m18476a(this.o, document);
    }

    public void mo4064a(BucketRowLayout bucketRowLayout, int i) {
        boolean z = true;
        if (bucketRowLayout instanceof C4296f) {
            boolean z2;
            C4296f c4296f = (C4296f) bucketRowLayout;
            if (mo4151n() == -1 && i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c4296f.setIsFirstRow(z2);
            if (i != (mo1508a() - m19768c()) - 1) {
                z = false;
            }
            c4296f.setIsLastRow(z);
        }
    }

    public void c_(View view) {
        d dVar = (d) view;
        if (dVar != null) {
            ao.m18509b(dVar);
        }
    }

    public final int m19768c() {
        return mo4151n() == -1 ? 0 : 1;
    }

    public final void l_(int i) {
        this.f21498B = i;
    }
}

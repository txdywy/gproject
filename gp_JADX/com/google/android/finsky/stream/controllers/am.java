package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.view.C3688e;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public final class am implements C1158a {
    public int f21711a = C7582R.layout.flat_card_mini;
    public final C2720j f21712b;
    public final Document f21713c;
    public final ao f21714d;
    public final C3748a f21715e;
    public final C3688e f21716f;
    public final C2495w f21717g;
    public final C1294w f21718h;
    public final Context f21719i;
    public final C3028c f21720j;

    public am(Document document, C2720j c2720j, C3688e c3688e, Context context, C1294w c1294w, C3748a c3748a, C2495w c2495w, ao aoVar, C3028c c3028c) {
        this.f21713c = document;
        this.f21712b = c2720j;
        this.f21714d = aoVar;
        this.f21715e = c3748a;
        this.f21716f = c3688e;
        this.f21717g = c2495w;
        this.f21718h = c1294w;
        this.f21719i = context;
        this.f21720j = c3028c;
    }

    public final String mo1480a() {
        return this.f21713c.f14885a.f12096c;
    }

    public final int mo1486c() {
        return this.f21712b.m14698m();
    }

    public final int mo1477a(int i) {
        Document document = (Document) this.f21712b.m14679a(i, true);
        if (document.bB() && this.f21720j.m15634a(document)) {
            return C7582R.layout.flat_re_engagement_card;
        }
        return this.f21711a;
    }

    public final float mo1482b(int i) {
        Document document = (Document) this.f21712b.m14679a(i, false);
        if (document == null) {
            return -1.0f;
        }
        return C1617r.m9292a(document.f14885a.f12098e);
    }

    public final boolean mo1484b() {
        return !this.f21712b.mo3128h() && this.f21712b.f14901t;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        return af.m9223a(this.f21719i, (Document) this.f21712b.m14679a(i, false), this.f21718h, i2, i3, yVar, iArr);
    }

    public final /* synthetic */ int mo1478a(View view) {
        d dVar = (d) view;
        if (dVar.getThumbnail() != null) {
            return dVar.getThumbnail().getChildAt(0).getHeight();
        }
        return 0;
    }

    public final /* synthetic */ int mo1483b(View view) {
        d dVar = (d) view;
        if (dVar.getThumbnail() != null) {
            return dVar.getThumbnail().getChildAt(0).getWidth();
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ float mo1485c(View view) {
        return 0.0f;
    }

    public final /* synthetic */ void mo1481a(View view, int i) {
        d dVar = (d) view;
        dVar.setThumbnailAspectRatio(mo1482b(i));
        Document document = (Document) this.f21712b.m14679a(i, true);
        if (document == null) {
            dVar.b();
            return;
        }
        this.f21714d.m18515a(dVar, document, i, this.f21713c.f14885a.f12096c, this.f21715e, false, null, this.f21716f.getParentOfChildren(), false, -1, true, document.aZ(), this.f21717g, false, false, false);
    }
}

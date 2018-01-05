package com.google.android.finsky.stream.controllers;

import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.controllers.view.C4501r;
import com.google.android.finsky.stream.controllers.view.C4502s;
import com.google.android.play.image.x;
import com.google.android.play.image.y;

final class bk implements C1158a {
    public final C4501r f21934a;
    public final Document f21935b;
    public final int f21936c;
    public final C2720j f21937d;
    public final /* synthetic */ bj f21938e;

    public bk(bj bjVar, C4501r c4501r, Document document, C2720j c2720j, int i) {
        this.f21938e = bjVar;
        this.f21934a = c4501r;
        this.f21935b = document;
        this.f21936c = i;
        this.f21937d = c2720j;
    }

    public final String mo1480a() {
        return this.f21935b.f14885a.f12096c;
    }

    public final int mo1477a(int i) {
        return this.f21936c;
    }

    public final boolean mo1484b() {
        return this.f21937d.f14901t;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        return af.m9223a(this.f21938e.e, (Document) this.f21937d.m14679a(i, false), C1473m.f7980a.be(), i2, i3, yVar, iArr);
    }

    public final int mo1486c() {
        return this.f21937d.m14698m();
    }

    public final float mo1482b(int i) {
        Document document = (Document) this.f21937d.m14679a(i, false);
        if (document == null) {
            return -1.0f;
        }
        return C1617r.m9292a(document.f14885a.f12098e);
    }

    public final /* synthetic */ int mo1478a(View view) {
        return ((C4502s) view).getImageView().getHeight();
    }

    public final /* synthetic */ int mo1483b(View view) {
        return ((C4502s) view).getImageView().getWidth();
    }

    public final /* synthetic */ float mo1485c(View view) {
        return C1617r.m9292a(((C4502s) view).getDoc().f14885a.f12098e);
    }

    public final /* synthetic */ void mo1481a(View view, int i) {
        C4502s c4502s = (C4502s) view;
        Document document = (Document) this.f21937d.m14679a(i, false);
        if (document != null) {
            String str = this.f21935b.f14885a.f12096c;
            C3748a c3748a = this.f21938e.f;
            ad parentOfChildren = this.f21934a.getParentOfChildren();
            C2495w c2495w = this.f21938e.i;
            this.f21935b.m14638a();
            c4502s.mo4236a(str, document, c3748a, parentOfChildren, c2495w);
        }
    }
}

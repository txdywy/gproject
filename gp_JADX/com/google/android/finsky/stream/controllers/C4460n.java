package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.view.C3688e;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.layout.d;

public final class C4460n implements C1158a {
    public final Document f22682a;
    public int f22683b;
    public final C2720j f22684c;
    public final C3688e f22685d;
    public final Context f22686e;
    public final C4808a f22687f;
    public final C1294w f22688g;
    public final C3748a f22689h;
    public final C2495w f22690i;
    public final ab f22691j;
    public final boolean f22692k;
    public final boolean f22693l;
    public final ao f22694m;

    public C4460n(Document document, int i, boolean z, C2720j c2720j, C3688e c3688e, Context context, C4808a c4808a, C1294w c1294w, C3748a c3748a, boolean z2, ab abVar, C2495w c2495w, ao aoVar) {
        this.f22682a = document;
        this.f22683b = i;
        this.f22692k = z;
        this.f22684c = c2720j;
        this.f22685d = c3688e;
        this.f22686e = context;
        this.f22687f = c4808a;
        this.f22688g = c1294w;
        this.f22689h = c3748a;
        this.f22691j = abVar;
        this.f22690i = c2495w;
        this.f22693l = z2;
        this.f22694m = aoVar;
    }

    public final String mo1480a() {
        return this.f22682a.f14885a.f12096c;
    }

    public final int mo1477a(int i) {
        return this.f22683b;
    }

    public final boolean mo1484b() {
        return !this.f22684c.mo3128h() && this.f22684c.f14901t;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        return af.m9223a(this.f22686e, (Document) this.f22684c.m14679a(i, false), this.f22688g, i2, i3, yVar, iArr);
    }

    public final int mo1486c() {
        return this.f22684c.m14698m();
    }

    public final float mo1482b(int i) {
        Document document = (Document) this.f22684c.m14679a(i, false);
        if (document == null) {
            return -1.0f;
        }
        return C1617r.m9292a(document.f14885a.f12098e);
    }

    public final /* synthetic */ int mo1478a(View view) {
        return ((d) view).getThumbnail().getChildAt(0).getHeight();
    }

    public final /* synthetic */ int mo1483b(View view) {
        return ((d) view).getThumbnail().getChildAt(0).getWidth();
    }

    public final /* synthetic */ float mo1485c(View view) {
        Document document = (Document) ((d) view).getData();
        if (document == null) {
            return -1.0f;
        }
        return C1617r.m9292a(document.f14885a.f12098e);
    }

    public final /* synthetic */ void mo1481a(View view, int i) {
        d dVar = (d) view;
        dVar.setThumbnailAspectRatio(mo1482b(i));
        Document document = (Document) this.f22684c.m14679a(i, true);
        if (document == null) {
            dVar.b();
            return;
        }
        boolean be = document.be();
        ab abVar = this.f22691j;
        boolean z = be && abVar != null && this.f22687f.m22588a(document.f14885a.f12096c);
        ao aoVar = this.f22694m;
        String str = this.f22682a.f14885a.f12096c;
        C3748a c3748a = this.f22689h;
        if (!be) {
            abVar = null;
        }
        aoVar.m18515a(dVar, document, i, str, c3748a, z, abVar, this.f22685d.getParentOfChildren(), false, -1, true, document.aZ(), this.f22690i, false, this.f22692k, this.f22693l);
    }
}

package com.google.android.finsky.adapters;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.C1473m;
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
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.layout.d;

public final class C1159c implements C1158a {
    public final Document f7155a;
    public final int f7156b;
    public final C2720j f7157c;
    public final PlayCardClusterViewV2 f7158d;
    public final Context f7159e;
    public final C4808a f7160f;
    public final C1294w f7161g = C1473m.f7980a.be();
    public final C3748a f7162h;
    public final C2495w f7163i;
    public final ab f7164j;

    public C1159c(Document document, int i, C2720j c2720j, PlayCardClusterViewV2 playCardClusterViewV2, Context context, C4808a c4808a, C3748a c3748a, ab abVar, C2495w c2495w) {
        this.f7155a = document;
        this.f7156b = i;
        this.f7157c = c2720j;
        this.f7158d = playCardClusterViewV2;
        this.f7159e = context;
        this.f7160f = c4808a;
        this.f7162h = c3748a;
        this.f7164j = abVar;
        this.f7163i = c2495w;
    }

    public final String mo1480a() {
        return this.f7155a.f14885a.f12096c;
    }

    public final int mo1477a(int i) {
        return this.f7156b;
    }

    public final boolean mo1484b() {
        return !this.f7157c.mo3128h() && this.f7157c.f14901t;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        Document document = (Document) this.f7157c.m14679a(i, false);
        C1473m.f7980a.bR();
        return af.m9223a(this.f7159e, document, this.f7161g, i2, i3, yVar, iArr);
    }

    public final int mo1486c() {
        return this.f7157c.m14698m();
    }

    public final float mo1482b(int i) {
        Document document = (Document) this.f7157c.m14679a(i, false);
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
        Document document = (Document) this.f7157c.m14679a(i, true);
        if (document == null) {
            dVar.b();
            return;
        }
        boolean be = document.be();
        ab abVar = this.f7164j;
        boolean z = be && abVar != null && this.f7160f.m22588a(document.f14885a.f12096c);
        ao cr = C1473m.f7980a.cr();
        String str = this.f7155a.f14885a.f12096c;
        C3748a c3748a = this.f7162h;
        if (!be) {
            abVar = null;
        }
        cr.m18516a(dVar, document, i, str, c3748a, z, abVar, this.f7158d.getParentOfChildren(), false, true, document.aZ(), this.f7163i, null);
    }
}

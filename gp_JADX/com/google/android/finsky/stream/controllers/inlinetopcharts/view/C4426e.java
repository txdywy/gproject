package com.google.android.finsky.stream.controllers.inlinetopcharts.view;

import android.content.Context;
import android.support.v7.widget.ff;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.ea.C2962b;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.ao;
import com.google.android.libraries.bind.p117b.C1071a;
import com.google.android.libraries.bind.p117b.C5872c;
import com.google.android.play.utils.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class C4426e extends C2962b implements C4425k, C1071a {
    public final Context f22490c;
    public ad f22491d;
    public int f22492e;
    public C3748a f22493f;
    public C2495w f22494g;
    public ao f22495h;
    public C4421f f22496i;
    public List f22497j;
    public boolean f22498k;
    public ff f22499l;
    public final boolean f22500m;

    C4426e(Context context, C4421f c4421f, boolean z) {
        this.f22490c = context;
        this.f22496i = c4421f;
        this.f22498k = !k.b(this.f22490c);
        this.f22497j = new ArrayList();
        this.f22499l = new ff();
        this.f22500m = z;
    }

    public final void m20730c(int i) {
        C4427g c4427g;
        int a = C5872c.m27301a(this, i);
        int i2 = 0;
        while (i2 < this.f22497j.size()) {
            c4427g = (C4427g) this.f22497j.get(i2);
            if (!(c4427g.f22503c == null || i2 == a)) {
                c4427g.f22503c.mo1311a(false);
            }
            i2++;
        }
        c4427g = (C4427g) this.f22497j.get(a);
        if (c4427g.f22503c != null) {
            c4427g.f22503c.mo1311a(true);
        }
        this.f22492e = a;
    }

    public final int mo961a() {
        return this.f22497j.size();
    }

    protected final Object mo4201b(ViewGroup viewGroup, int i) {
        int a = C5872c.m27301a(this, i);
        boolean z = this.f22492e == a;
        C4427g c4427g = (C4427g) this.f22497j.get(a);
        C4428h c4428h = new C4428h(this.f22490c, this.f22493f, this.f22494g, this.f22495h, c4427g.f22505e, this, this.f22499l, this.f22500m, c4427g.f22504d);
        c4427g.f22503c = c4428h;
        viewGroup.addView(c4428h.mo1309a());
        c4428h.mo1311a(z);
        return c4428h;
    }

    protected final void mo4204e(int i) {
        C4427g c4427g = (C4427g) this.f22497j.get(C5872c.m27301a(this, i));
        c4427g.f22503c.m20737a(c4427g.f22502b);
    }

    public final int mo963b(Object obj) {
        gt gtVar = (gt) obj;
        for (int i = 0; i < this.f22497j.size(); i++) {
            if (gtVar == ((C4427g) this.f22497j.get(i)).f22503c) {
                return -1;
            }
        }
        return -2;
    }

    public final void mo4202b(ViewGroup viewGroup, int i, Object obj) {
        int a = C5872c.m27301a(this, i);
        if (a >= 0 && a < this.f22497j.size()) {
            C4428h c4428h = (C4428h) obj;
            C4427g c4427g = (C4427g) this.f22497j.get(a);
            c4427g.f22505e = c4428h.m20742c();
            viewGroup.removeView(c4428h.mo1309a());
            c4428h.mo1312b();
            c4427g.f22503c = null;
        }
    }

    public final boolean mo959a(View view, Object obj) {
        return ((gt) obj).mo1309a() == view;
    }

    public final boolean mo1381g() {
        return this.f22498k;
    }

    public final void mo1375a(boolean z) {
        if (this.f22498k != z) {
            this.f22498k = z;
            M_();
        }
    }

    public final void mo4203e() {
        this.f22496i.mo4198a();
    }

    public final /* synthetic */ CharSequence mo1371a(int i) {
        return ((C4427g) this.f22497j.get(C5872c.m27301a(this, i))).f22501a.c.toUpperCase(Locale.getDefault());
    }
}

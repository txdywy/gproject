package com.google.android.finsky.stream.base.horizontalclusters;

import android.content.Context;
import android.view.View;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4257k;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4260a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4262b;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4274i;
import com.google.android.play.image.C1294w;
import java.util.ArrayList;
import java.util.List;

public abstract class C4258a extends C4250b implements C0657w, C1031w, C4257k {
    public final af f21518a;
    public final int[] f21519b;
    public final C1294w f21520o;
    public List f21521p = new ArrayList();
    public C4265e f21522q;
    public List f21523r = new ArrayList();

    public C4258a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, int[] iArr, boolean z, C1294w c1294w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, z);
        this.f21518a = afVar;
        this.f21519b = iArr;
        this.f21520o = c1294w;
    }

    public abstract C4260a mo4108b(int i);

    public void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.g.m11918a((C1031w) this);
        this.g.m11917a((C0657w) this);
        this.f21522q = new C4265e(this.e, this.f21520o, this.f21521p, this.f21519b);
    }

    public void mo1510a(View view, int i) {
        int i2;
        List list = this.f21521p;
        List arrayList = new ArrayList();
        for (i2 = 0; i2 < list.size(); i2++) {
            arrayList.add((Document) list.get(i2));
        }
        for (i2 = list.size(); i2 < this.g.m14698m(); i2++) {
            arrayList.add((Document) this.g.m14679a(i2, false));
        }
        this.f21521p = arrayList;
        this.f21522q.f21546f = this.f21521p;
    }

    public final void mo4061q() {
        this.g.m11922b((C1031w) this);
        this.g.m11921b((C0657w) this);
    }

    public final C4274i m19771a(C4274i c4274i) {
        List arrayList;
        if (c4274i == null) {
            c4274i = new C4274i();
        }
        boolean z = !this.g.mo3128h() && this.g.f14901t;
        c4274i.f21572b = z;
        int m = this.g.m14698m();
        if (c4274i.f21571a == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = c4274i.f21571a;
        }
        if (this.D == null || ((C4259b) this.D).f21524a == null) {
            Object arrayList2 = new ArrayList();
        } else {
            List list = ((C4259b) this.D).f21524a;
        }
        for (int size = arrayList.size(); size < m; size++) {
            C4260a b = mo4108b(size);
            if (list.size() > size) {
                b.mo4072a((C4262b) list.get(size));
            }
            arrayList.add(b);
            this.f21523r.add(b);
        }
        c4274i.f21571a = arrayList;
        return c4274i;
    }

    public final List m19772a(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        list.clear();
        for (int i = 0; i < this.f21523r.size(); i++) {
            list.add(((C4260a) this.f21523r.get(i)).mo4074b());
        }
        return list;
    }

    public final void m_() {
        this.C.mo4087a(this, 0, 1, false);
    }

    public final void mo1062a(VolleyError volleyError) {
        this.C.mo4087a(this, 0, 1, false);
    }

    public final void mo4067c(int i) {
        this.g.m14679a(i, true);
    }
}

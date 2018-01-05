package com.google.android.finsky.stream.controllers;

import android.content.Context;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ee.C1016f;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4253a;
import com.google.android.finsky.stream.base.C4256g;
import com.squareup.leakcanary.C7582R;
import java.util.HashSet;
import java.util.Set;

public final class cj extends C4253a implements C1016f {
    public final C2974a f22017E;
    public Set f22018F = new HashSet();
    public int f22019G;
    public final ac f22020b;
    public int f22021s;

    public cj(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, C1461c c1461c, ao aoVar, ac acVar, C2974a c2974a) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c, aoVar, acVar);
        this.f22020b = acVar;
        this.f22017E = c2974a;
        this.D = new C4256g();
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f22017E.m15399a(this);
        this.f22021s = mo4095l();
        this.f22019G = this.g.m14698m();
    }

    public final void mo4061q() {
        this.f22017E.m15404b(this);
        super.mo4061q();
    }

    public final void mo1217a(String str, boolean z, boolean z2) {
        int i = 0;
        while (i < this.g.m14698m()) {
            Document document = (Document) this.g.m14679a(i, false);
            if (document != null && str.equals(document.f14885a.f12096c)) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            int i2 = i / this.f22021s;
            if (!z2) {
                if (z) {
                    this.f22018F.remove(str);
                } else {
                    this.f22018F.add(str);
                }
                this.C.mo4087a(this, i2, 1, true);
            } else if (!z) {
                int m = (this.g.m14698m() - 1) / this.f22021s;
                this.f22018F.remove(str);
                this.g.m14695e(i);
                i = (this.g.m14698m() - 1) / this.f22021s;
                int i3 = (i - i2) + 1;
                this.f22019G = this.g.m14698m();
                this.C.mo4087a(this, i2, i3, true);
                if (m > i || this.f22019G == 0) {
                    m19762r();
                    this.C.mo4088b(this, m, 1);
                }
            }
        }
    }

    protected final boolean mo4178a(Document document) {
        return this.f22018F.contains(document.f14885a.f12096c);
    }

    public final int mo4096m() {
        return C7582R.layout.collection_cluster_row;
    }

    protected final int mo4094d() {
        return this.f22020b.m18478a(false);
    }

    protected final int mo4095l() {
        return this.l;
    }

    protected final int mo4097o() {
        return 443;
    }

    public final boolean mo4179j() {
        return true;
    }
}

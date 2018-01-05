package com.google.android.finsky.dfemodel;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.cv.p177a.cv;
import com.google.wireless.android.finsky.dfe.nano.bu;
import com.google.wireless.android.finsky.dfe.nano.bx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C2718h extends C2335k implements C0660x {
    public bx f14922a;
    public final List f14923b;
    public final C1254c f14924c;

    public C2718h(C1254c c1254c, List list, boolean z) {
        this.f14924c = c1254c;
        this.f14923b = new ArrayList(list.size());
        for (C1283d c1283d : list) {
            this.f14923b.add(c1283d.f7576b);
        }
        c1254c.mo1605a(list, z, (C0660x) this, (C0657w) this);
    }

    public final List m14719b() {
        if (this.f14922a == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f14922a.a.length; i++) {
            cv cvVar = this.f14922a.a[i].b;
            if (cvVar == null) {
                new Object[1][0] = this.f14923b.get(i);
            } else {
                arrayList.add(new Document(cvVar));
            }
        }
        return arrayList;
    }

    public final List m14720c() {
        int i = 0;
        if (this.f14922a == null) {
            return Collections.emptyList();
        }
        int i2;
        int length;
        for (bu buVar : this.f14922a.a) {
            if (buVar.b == null) {
                i2 = 1;
                break;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(this.f14923b);
        length = this.f14922a.a.length;
        while (i < length) {
            cv cvVar = this.f14922a.a[i].b;
            if (cvVar != null) {
                arrayList.remove(cvVar.f12096c);
            }
            i++;
        }
        return arrayList;
    }

    public final boolean mo2861a() {
        return this.f14922a != null;
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f14922a = (bx) obj;
        m11927l();
    }
}

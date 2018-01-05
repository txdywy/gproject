package com.google.android.finsky.billing.payments;

import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.android.wallet.analytics.a.a;
import com.google.android.wallet.analytics.n;
import com.google.android.wallet.common.pub.a.b;
import com.google.h.c.b.a.e;
import com.google.wireless.android.a.a.a.a.af;
import com.google.wireless.android.a.a.a.a.bp;
import com.google.wireless.android.a.a.a.a.bu;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cw;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.List;

public final class C2044g implements b {
    public final ad f10513a;
    public final C2495w f10514b;

    public C2044g(ad adVar, C2495w c2495w) {
        this.f10513a = adVar;
        this.f10514b = c2495w;
        if (adVar == null) {
            throw new IllegalArgumentException("node cannot be null");
        }
    }

    public final void m10746a(a aVar) {
        C2495w c2495w = this.f10514b;
        C2474c c = new C2474c(aVar.a).m13212a(aVar.e).m13242b(aVar.d).m13210a(aVar.b).m13247c(aVar.f);
        if (aVar.g > 0) {
            c.m13246c(aVar.g);
        }
        if (aVar.k != null && aVar.k.length > 0) {
            c.m13240a(aVar.k);
        }
        CreditCardEntryAction creditCardEntryAction = aVar.h;
        if (creditCardEntryAction != null) {
            af afVar = new af();
            boolean z = creditCardEntryAction.a;
            afVar.a |= 1;
            afVar.b = z;
            afVar.c = creditCardEntryAction.b;
            afVar.a |= 2;
            z = creditCardEntryAction.c;
            afVar.a |= 4;
            afVar.d = z;
            z = creditCardEntryAction.d;
            afVar.a |= 8;
            afVar.e = z;
            z = creditCardEntryAction.e;
            afVar.a |= 16;
            afVar.f = z;
            z = creditCardEntryAction.f;
            afVar.a |= 32;
            afVar.g = z;
            afVar.h = creditCardEntryAction.g;
            afVar.a |= 64;
            z = creditCardEntryAction.h;
            afVar.a |= 128;
            afVar.i = z;
            z = creditCardEntryAction.i;
            afVar.a |= 256;
            afVar.j = z;
            z = creditCardEntryAction.j;
            afVar.a |= 512;
            afVar.k = z;
            z = creditCardEntryAction.k;
            afVar.a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
            afVar.l = z;
            afVar.m = creditCardEntryAction.l;
            afVar.a |= eq.FLAG_MOVED;
            z = creditCardEntryAction.m;
            afVar.a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
            afVar.n = z;
            z = creditCardEntryAction.n;
            afVar.a |= 8192;
            afVar.o = z;
            z = creditCardEntryAction.o;
            afVar.a |= 16384;
            afVar.p = z;
            long j = creditCardEntryAction.p;
            afVar.a |= 32768;
            afVar.q = j;
            z = creditCardEntryAction.q;
            afVar.a |= 65536;
            afVar.r = z;
            z = creditCardEntryAction.r;
            afVar.a |= 131072;
            afVar.s = z;
            int i = creditCardEntryAction.s;
            afVar.a |= 262144;
            afVar.t = i;
            i = creditCardEntryAction.u;
            afVar.a |= 524288;
            afVar.u = i;
            afVar.v = creditCardEntryAction.t;
            afVar.a |= 1048576;
            afVar.w = creditCardEntryAction.v;
            afVar.a |= 2097152;
            afVar.x = creditCardEntryAction.w;
            afVar.a |= 4194304;
            i = creditCardEntryAction.x;
            afVar.a |= 8388608;
            afVar.y = i;
            int i2 = creditCardEntryAction.y;
            afVar.a |= 16777216;
            afVar.z = i2;
            c.f13342a.f31676B = afVar;
        }
        WebViewPageLoadEvent webViewPageLoadEvent = aVar.j;
        if (webViewPageLoadEvent != null) {
            cw cwVar = new cw();
            String str = webViewPageLoadEvent.a;
            if (str == null) {
                throw new NullPointerException();
            }
            cwVar.a |= 1;
            cwVar.b = str;
            z = webViewPageLoadEvent.b;
            cwVar.a |= 2;
            cwVar.c = z;
            j = webViewPageLoadEvent.c;
            cwVar.a |= 4;
            cwVar.d = j;
            i = webViewPageLoadEvent.d;
            cwVar.a |= 16;
            cwVar.f = i;
            str = webViewPageLoadEvent.e;
            if (str == null) {
                throw new NullPointerException();
            }
            cwVar.a |= 32;
            cwVar.g = str;
            i = webViewPageLoadEvent.f;
            cwVar.a |= 64;
            cwVar.h = i;
            i = webViewPageLoadEvent.g;
            cwVar.a |= 128;
            cwVar.i = i;
            i = webViewPageLoadEvent.h;
            cwVar.a |= 256;
            cwVar.j = i;
            float f = webViewPageLoadEvent.i;
            cwVar.a |= 512;
            cwVar.k = f;
            float f2 = webViewPageLoadEvent.j;
            cwVar.a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
            cwVar.l = f2;
            c.f13342a.f31678D = cwVar;
        }
        e eVar = aVar.i;
        if (eVar != null) {
            c.f13342a.ae = eVar;
        }
        bo boVar = c.f13342a;
        if (!TextUtils.isEmpty(aVar.c)) {
            boVar.m29000c(aVar.c);
        }
        c2495w.m13371a(boVar, null);
    }

    public final void m10747a(com.google.android.wallet.common.pub.a.a.a aVar) {
        C2495w c2495w = this.f10514b;
        int size = aVar.a.size();
        if (size == 0) {
            throw new IllegalArgumentException("Click path must have at least one item");
        }
        List arrayList = new ArrayList(size + 1);
        for (int i = 0; i < size; i++) {
            arrayList.add(C2044g.m10745b((n) aVar.a.get(i)));
        }
        ad adVar = this.f10513a;
        do {
            arrayList.add(C2482j.m13284a(adVar.getPlayStoreUiElement()));
            adVar = adVar.getParentNode();
        } while (adVar != null);
        bp f = C2482j.m13311f();
        f.a = (ce[]) arrayList.toArray(new ce[arrayList.size()]);
        c2495w.m13372a(f, null);
    }

    public final void m10748a(com.google.android.wallet.common.pub.a.a.b bVar) {
        C2495w c2495w = this.f10514b;
        List arrayList = new ArrayList();
        for (ad adVar = this.f10513a; adVar != null; adVar = adVar.getParentNode()) {
            arrayList.add(adVar.getPlayStoreUiElement());
        }
        ce a = C2482j.m13286a(arrayList);
        ce ceVar = a;
        while (ceVar.f != null && ceVar.f.length != 0) {
            ceVar = ceVar.f[0];
        }
        if (ceVar.c != this.f10513a.getPlayStoreUiElement().c) {
            int i = ceVar.c;
            throw new IllegalStateException("Unexpected types in tree: " + i + " and " + this.f10513a.getPlayStoreUiElement().c);
        }
        ceVar.f = new ce[]{m10744a(bVar.a)};
        bu g = C2482j.m13312g();
        g.b = a;
        c2495w.m13373a(g, null);
    }

    private final ce m10744a(n nVar) {
        ce b = C2044g.m10745b(nVar);
        if (!(nVar.c == null || nVar.c.isEmpty())) {
            int size = nVar.c.size();
            b.f = new ce[size];
            for (int i = 0; i < size; i++) {
                b.f[i] = m10744a((n) nVar.c.get(i));
            }
        }
        return b;
    }

    private static ce m10745b(n nVar) {
        ce a = C2482j.m13283a(nVar.a);
        if (nVar.b != null && nVar.b.length > 0) {
            a.a(nVar.b);
        }
        return a;
    }
}

package com.google.android.finsky.billing.addresschallenge.p156a;

import android.util.Log;

final class C1726t implements aj {
    public final /* synthetic */ al f9007a;
    public final /* synthetic */ C1705y f9008b;
    public final /* synthetic */ C1727v f9009c;
    public final /* synthetic */ C1723r f9010d;

    C1726t(C1723r c1723r, al alVar, C1705y c1705y, C1727v c1727v) {
        this.f9010d = c1723r;
        this.f9007a = alVar;
        this.f9008b = c1705y;
        this.f9009c = c1727v;
    }

    public final void mo2419a() {
        String valueOf = String.valueOf(this.f9007a);
        Log.w("CacheData", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Request for key ").append(valueOf).append(" failed").toString());
        this.f9010d.f9003d.remove(this.f9007a.toString());
        this.f9010d.m9612b(this.f9007a.toString());
        C1723r.m9609a(this.f9008b);
    }

    public final /* synthetic */ void mo2420a(Object obj) {
        ah ahVar = (ah) obj;
        C1727v c1727v = this.f9009c;
        String str;
        String str2;
        String valueOf;
        if (ahVar == null) {
            str = "CacheData";
            str2 = "server returns null for key:";
            valueOf = String.valueOf(c1727v.f9011a);
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            c1727v.f9014d.f9004e.add(c1727v.f9011a);
            c1727v.f9014d.m9612b(c1727v.f9011a);
            C1723r.m9609a(c1727v.f9013c);
        } else if (ahVar.has(C1708c.ID.name().toLowerCase())) {
            if (c1727v.f9012b != null) {
                ahVar.m9544a((ah) c1727v.f9012b);
            }
            c1727v.f9014d.f9001b.m9545a(c1727v.f9011a, ahVar);
            c1727v.f9014d.m9612b(c1727v.f9011a);
            C1723r.m9609a(c1727v.f9013c);
        } else {
            str = "CacheData";
            str2 = "invalid or empty data returned for key: ";
            valueOf = String.valueOf(c1727v.f9011a);
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            c1727v.f9014d.f9004e.add(c1727v.f9011a);
            c1727v.f9014d.m9612b(c1727v.f9011a);
            C1723r.m9609a(c1727v.f9013c);
        }
        this.f9010d.f9002c.mo2417a(this.f9007a.toString(), ahVar.toString());
    }
}

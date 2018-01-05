package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class ab {
    public static final al f8805a = new am(an.DATA).m9555a(new C1707b().m9584a()).m9554a();
    public static final C1709d[] f8806b = new C1709d[]{C1709d.COUNTRY, C1709d.ADMIN_AREA, C1709d.LOCALITY, C1709d.DEPENDENT_LOCALITY};
    public String f8807c;
    public C1729x f8808d;
    public String f8809e;

    ab(C1729x c1729x, String str, String str2) {
        az.m9578a((Object) c1729x, "null data not allowed");
        this.f8807c = str;
        this.f8809e = str2;
        al a = ab.m9521a(new C1707b().m9586a("ZZ").m9584a());
        Object b = c1729x.mo2422b(a.toString());
        String valueOf = String.valueOf(a);
        az.m9578a(b, new StringBuilder(String.valueOf(valueOf).length() + 38).append("require data for default country key: ").append(valueOf).toString());
        this.f8808d = c1729x;
    }

    static al m9521a(C1704a c1704a) {
        return new am(an.DATA).m9555a(c1704a).m9554a();
    }

    final void m9526a(C1704a c1704a, C1705y c1705y) {
        az.m9578a(c1704a.f8784a, "null country not allowed");
        Queue linkedList = new LinkedList();
        for (C1709d a : f8806b) {
            String a2 = c1704a.m9517a(a);
            if (a2 == null) {
                break;
            }
            linkedList.add(a2);
        }
        if (linkedList.size() == 0) {
            throw new RuntimeException("Need at least country level info");
        }
        c1705y.mo2413a();
        m9527a(f8805a, linkedList, c1705y);
    }

    final void m9527a(al alVar, Queue queue, C1705y c1705y) {
        az.m9578a((Object) alVar, "Null key not allowed");
        az.m9578a((Object) queue, "Null subkeys not allowed");
        C1729x c1729x = this.f8808d;
        C1705y acVar = new ac(this, alVar, c1705y, queue);
        az.m9578a((Object) alVar, "Null lookup key not allowed");
        c1729x.f9016b.m9611a(alVar, (ah) c1729x.f9015a.get(alVar.toString()), acVar);
    }

    final boolean m9528a(String str) {
        if (str == null) {
            return true;
        }
        if (az.m9581c(this.f8808d.mo2422b(ab.m9521a(new C1707b().m9586a(this.f8809e).m9584a()).toString()).m9591b(C1708c.LANG)) == null || az.m9580b(str).equals(az.m9580b(str))) {
            return true;
        }
        return false;
    }

    final List m9525a(al alVar) {
        int i = 0;
        if (alVar.f8832b == an.EXAMPLES) {
            throw new RuntimeException("example key not allowed for getting region data");
        }
        az.m9578a((Object) alVar, "null regionKey not allowed");
        al b = m9523b(alVar);
        List arrayList = new ArrayList();
        String[] b2;
        if (b.equals(f8805a)) {
            b2 = ab.m9524b(this.f8808d.mo2422b(b.toString()).m9591b(C1708c.COUNTRIES));
            while (i < b2.length) {
                arrayList.add(new ar().m9562a(b2[i]).m9563b(b2[i]).m9561a());
                i++;
            }
            return arrayList;
        }
        C1714i a = this.f8808d.mo2421a(b.toString());
        if (a != null) {
            ao aoVar;
            String[] b3 = ab.m9524b(a.m9591b(C1708c.SUB_KEYS));
            if (this.f8807c == null || !az.m9579a(this.f8807c)) {
                aoVar = ao.LOCAL;
            } else {
                aoVar = ao.LATIN;
            }
            if (aoVar == ao.LOCAL) {
                b2 = ab.m9524b(a.m9591b(C1708c.SUB_NAMES));
            } else {
                b2 = ab.m9524b(a.m9591b(C1708c.SUB_LNAMES));
            }
            while (i < b3.length) {
                arrayList.add(new ar().m9562a(b3[i]).m9563b(i < b2.length ? b2[i] : b3[i]).m9561a());
                i++;
            }
        }
        return arrayList;
    }

    private static String[] m9524b(String str) {
        if (str == null || str.length() == 0) {
            return new String[0];
        }
        return str.split("~");
    }

    private final String m9522a(al alVar, String str) {
        for (aq aqVar : m9525a(alVar)) {
            if (aqVar.m9560a(str)) {
                return aqVar.f8849a;
            }
        }
        return null;
    }

    private final al m9523b(al alVar) {
        az.m9577a((Object) alVar);
        if (alVar.f8832b != an.DATA) {
            throw new RuntimeException("Only DATA keyType is supported");
        }
        String[] split = alVar.toString().split("/");
        if (split.length < 2) {
            return alVar;
        }
        StringBuilder stringBuilder = new StringBuilder(split[0]);
        int i = 1;
        while (i < split.length) {
            String str = null;
            if (i == 1 && split[i].contains("--")) {
                String[] split2 = split[i].split("--");
                split[i] = split2[0];
                str = split2[1];
            }
            String a = m9522a(new am(stringBuilder.toString()).m9554a(), split[i]);
            if (a == null) {
                while (i < split.length) {
                    stringBuilder.append("/").append(split[i]);
                    i++;
                }
                return new am(stringBuilder.toString()).m9554a();
            }
            stringBuilder.append("/").append(a);
            if (str != null) {
                stringBuilder.append("--").append(str);
            }
            i++;
        }
        return new am(stringBuilder.toString()).m9554a();
    }
}

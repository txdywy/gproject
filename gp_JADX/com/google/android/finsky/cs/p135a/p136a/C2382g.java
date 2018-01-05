package com.google.android.finsky.cs.p135a.p136a;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.clearcut.p279a.p280a.C5011a;
import com.google.android.gms.phenotype.core.C5524c;
import com.google.android.play.p179a.p352a.C6201l;
import com.google.d.a.b.a;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.h;
import java.util.ArrayList;
import java.util.Collections;

public final class C2382g {
    public static C6201l m12058a(C5524c c5524c, boolean z) {
        C0757i c0757i;
        C6201l a;
        int[] iArr = null;
        if (c5524c == null) {
            c0757i = iArr;
        } else {
            int length;
            int i;
            int i2;
            int i3;
            C0757i hVar = new h();
            int[] iArr2 = c5524c == null ? iArr : c5524c.f28379i;
            if (!(C5011a.m23176a(iArr2) && C5011a.m23176a(iArr))) {
                C0757i aVar = new a();
                aVar.c = new int[(C5011a.m23177b(iArr2) + C5011a.m23177b(iArr))];
                if (iArr2 != null) {
                    length = iArr2.length;
                    i = 0;
                    i2 = 0;
                    while (i < length) {
                        i3 = i2 + 1;
                        aVar.c[i2] = iArr2[i];
                        i++;
                        i2 = i3;
                    }
                }
                hVar.a = C0757i.m4909a(aVar);
            }
            if (c5524c != null) {
                i = (((Math.max(1, C5011a.m23175a(c5524c.f28380j)) + C5011a.m23175a(c5524c.f28375e)) + C5011a.m23175a(c5524c.f28376f)) + C5011a.m23175a(c5524c.f28377g)) + C5011a.m23175a(c5524c.f28378h);
            } else {
                i = 0;
            }
            Object arrayList = new ArrayList(i);
            if (c5524c != null) {
                if (!(c5524c.f28374d == null || c5524c.f28374d.length == 0)) {
                    arrayList.add(c5524c.f28374d);
                }
                if (c5524c.f28380j != null) {
                    for (Object obj : c5524c.f28380j) {
                        if (!(obj == null || obj.length == 0)) {
                            arrayList.add(obj);
                        }
                    }
                }
                hVar.d = z;
                if (z && c5524c.f28375e != null) {
                    Collections.addAll(arrayList, c5524c.f28375e);
                }
                if (c5524c.f28376f != null) {
                    Collections.addAll(arrayList, c5524c.f28376f);
                }
                if (c5524c.f28377g != null) {
                    Collections.addAll(arrayList, c5524c.f28377g);
                }
                if (c5524c.f28378h != null) {
                    Collections.addAll(arrayList, c5524c.f28378h);
                }
            }
            hVar.c = new byte[arrayList.size()][];
            ArrayList arrayList2 = (ArrayList) arrayList;
            length = arrayList2.size();
            i2 = 0;
            i3 = 0;
            while (i2 < length) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                int i4 = i3 + 1;
                hVar.c[i3] = (byte[]) obj2;
                i3 = i4;
            }
            c0757i = hVar;
        }
        if (c0757i != null) {
            try {
                a = C6201l.m28640a(C0757i.m4909a(c0757i));
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Error converting ExperimentTokens.", new Object[0]);
            }
        }
        return a;
    }
}

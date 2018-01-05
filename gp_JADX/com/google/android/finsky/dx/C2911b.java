package com.google.android.finsky.dx;

import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.ab.C0969a;
import com.google.android.finsky.cv.p177a.lh;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.be;
import com.google.wireless.android.finsky.dfe.nano.cq;
import com.google.wireless.android.finsky.dfe.nano.gy;

final class C2911b implements C0660x {
    public final /* synthetic */ String f15473a;
    public final /* synthetic */ int f15474b;
    public final /* synthetic */ C0957n f15475c;
    public final /* synthetic */ C2910a f15476d;

    C2911b(C2910a c2910a, String str, int i, C0957n c0957n) {
        this.f15476d = c2910a;
        this.f15473a = str;
        this.f15474b = i;
        this.f15475c = c0957n;
    }

    public final /* synthetic */ void b_(Object obj) {
        int size;
        String str = null;
        cq cqVar = (cq) obj;
        C0757i b = this.f15476d.m15190b(this.f15473a);
        C2910a c2910a;
        try {
            if (this.f15474b == 7 || b == null) {
                this.f15475c.m5763a(ab.m21685a(cqVar.a));
                this.f15476d.f15471h.put(this.f15473a, cqVar.a);
            } else {
                switch (this.f15474b) {
                    case 1:
                        b.a = null;
                        break;
                    case 2:
                        b.b = null;
                        break;
                    case 3:
                        b.c = null;
                        break;
                    case 4:
                        b.d = null;
                        break;
                    case 8:
                        b.e = null;
                        break;
                    case 9:
                        b.f = null;
                        break;
                    case 10:
                        b.h = null;
                        break;
                    case 11:
                        b.g = null;
                        break;
                    case 12:
                        b.i = null;
                        break;
                }
                gy gyVar = (gy) C0757i.m4905a(b, C0757i.m4909a(cqVar.a));
                this.f15475c.m5763a(ab.m21685a(gyVar));
                this.f15476d.f15471h.put(this.f15473a, gyVar);
            }
            C2910a.m15177c(this.f15473a, this.f15474b);
            C2910a.m15174a(this.f15473a, cqVar.b);
            c2910a = this.f15476d;
            be beVar = cqVar.a.h;
            String str2 = this.f15473a;
            if (beVar != null) {
                boolean z;
                if (beVar.c == null || beVar.c.length <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                lh[] lhVarArr = C2910a.m15178d(str2).f13009a;
                int length = lhVarArr.length;
                int i = 0;
                while (i < length) {
                    lh lhVar = lhVarArr[i];
                    if ("X-DFE-Content-Filter-Consistency-Token".equals(lhVar.f13012c)) {
                        str = lhVar.f13013d;
                        C0969a.m5794a(c2910a.f15466c, c2910a.f15468e, c2910a.f15467d, z, beVar, str);
                    } else {
                        i++;
                    }
                }
                C0969a.m5794a(c2910a.f15466c, c2910a.f15468e, c2910a.f15467d, z, beVar, str);
            }
            c2910a = this.f15476d;
            for (size = c2910a.f15465a.size() - 1; size >= 0; size--) {
                ((C1054h) c2910a.f15465a.get(size)).P_();
            }
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Failed parsing GetUserSettings response", new Object[0]);
            c2910a = this.f15476d;
            for (size = c2910a.f15465a.size() - 1; size >= 0; size--) {
                ((C1054h) c2910a.f15465a.get(size)).ce_();
            }
        }
    }
}

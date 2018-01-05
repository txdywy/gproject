package com.google.android.finsky.billing.p131e;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.finsky.dfe.c.a.al;

public final class C1821j {
    public final int f9392a;

    public C1821j(int i) {
        this.f9392a = i;
    }

    public static al m9830a(String str) {
        int b = C1821j.m9832b(str);
        Long l = (Long) C0954a.f5827W.m5777b(str).m5760a();
        long currentTimeMillis = System.currentTimeMillis();
        al alVar = new al();
        switch (b) {
            case 0:
                alVar.a(3);
                break;
            case 1:
                alVar.a(4);
                if (!(l == null || l.longValue() == 0)) {
                    long longValue = l.longValue();
                    alVar.a |= 2;
                    alVar.c = longValue;
                }
                alVar.a |= 4;
                alVar.d = currentTimeMillis;
                break;
            case 2:
                alVar.a(2);
                break;
            default:
                throw new IllegalArgumentException("Unexpected purchaseAuth specified " + b);
        }
        return alVar;
    }

    public static int m9832b(String str) {
        int intValue = ((Integer) C1814a.f9372b.m5777b(str).m5760a()).intValue();
        if (intValue == -1) {
            return ((Integer) C1815b.f9376a.m28964b()).intValue();
        }
        return intValue;
    }

    public final void m9833a(String str, int i, Integer num, String str2, C2495w c2495w) {
        C0957n b = C1814a.f9372b.m5777b(str);
        C0957n b2 = C1814a.f9373c.m5777b(str);
        b.m5763a(Integer.valueOf(i));
        b2.m5763a(Integer.valueOf(this.f9392a));
        c2495w.m13367a(new C2474c(400).m13243b(Integer.valueOf(i)).m13235a(num).m13244b(str2));
    }

    public static void m9831a(String str, boolean z, String str2, C2495w c2495w) {
        int i = 1;
        C0957n b = C1814a.f9375e.m5777b(str);
        boolean booleanValue = ((Boolean) b.m5760a()).booleanValue();
        if (booleanValue != z) {
            C2474c b2 = new C2474c(408).m13243b(Integer.valueOf(z ? 1 : 0));
            if (!booleanValue) {
                i = 0;
            }
            c2495w.m13367a(b2.m13235a(Integer.valueOf(i)).m13244b(str2));
            b.m5763a(Boolean.valueOf(z));
        }
    }
}

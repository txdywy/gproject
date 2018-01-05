package com.google.android.finsky.billing.e;

import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.dfe.c.a.al;

public final class com.google.android.finsky.billing.e.j
{

    public final int a;

    j(int p0) {
        this.a = p0;
    }

    public static com.google.wireless.android.finsky.dfe.c.a.al a(String p0) {
        v1 = com.google.android.finsky.billing.e.j.b(p0);
        v0 = (Long)com.google.android.finsky.aa.a.W.b(p0).a();
        v4 = new com.google.wireless.android.finsky.dfe.c.a.al();
        switch (v1) {
            case 0:
                v4.a(3);
                break;
            case 1:
                v4.a(4);
                if (v0 != 0) {
                    if (v0.longValue() != 0) {
                        v4.a = v4.a | 2;
                        v4.c = v0.longValue();
                    }
                }
                v4.a = v4.a | 4;
                v4.d = System.currentTimeMillis();
                break;
            case 2:
                v4.a(2);
                break;
            default:
                throw new IllegalArgumentException(45 + "Unexpected purchaseAuth specified " + v1);
        }
        return v4;
    }

    public static void a(String p0, boolean p1, String p2, com.google.android.finsky.d.w p3) {
        v1 = 1;
        v3 = com.google.android.finsky.billing.e.a.e.b(p0);
        v4 = ((Boolean)v3.a()).booleanValue();
        if (v4 != p1) {
            if (p1 != 0)
                v0 = 1;
            else
                v0 = 0;
            if (v4 == 0)
                v1 = 0;
            p3.a(new com.google.android.finsky.d.c(408).b(Integer.valueOf(v0)).a(Integer.valueOf(v1)).b(p2));
            v3.a(Boolean.valueOf(p1));
        }
    }

    public static int b(String p0) {
        v0 = ((Integer)com.google.android.finsky.billing.e.a.b.b(p0).a()).intValue();
        if (v0 == -1)
            v0 = ((Integer)com.google.android.finsky.billing.e.b.a.b()).intValue();
        return v0;
    }

    public final void a(String p0, int p1, Integer p2, String p3, com.google.android.finsky.d.w p4) {
        com.google.android.finsky.billing.e.a.b.b(p0).a(Integer.valueOf(p1));
        com.google.android.finsky.billing.e.a.c.b(p0).a(Integer.valueOf(this.a));
        p4.a(new com.google.android.finsky.d.c(400).b(Integer.valueOf(p1)).a(p2).b(p3));
    }

}

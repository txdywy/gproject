package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.os.SystemClock;
import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.d.d;
import com.google.android.finsky.billing.d.e;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.m;
import java.util.HashMap;
import java.util.Map;

public static class com.google.android.finsky.billing.lightpurchase.ar
{

    public static void a(Account p0, Document p1, com.google.android.finsky.billing.d.e p2, boolean p3, boolean p4, com.google.android.finsky.d.w p5) {
        com.google.android.finsky.billing.lightpurchase.ar.a(p0, p1, p2, p3, p4, 0, p5);
    }

    public static void a(Account p0, Document p1, com.google.android.finsky.billing.d.e p2, boolean p3, boolean p4, boolean p5, com.google.android.finsky.d.w p6) {
        com.google.android.finsky.billing.lightpurchase.ar.a(p0, p1, 0, p2, p3, p4, p5, p6);
    }

    public static void a(Account p0, Document p1, com.google.android.finsky.cv.a.ax p2, String p3, int p4, String p5, Map p6, com.google.android.finsky.billing.d.e p7, com.google.android.finsky.billing.d.d p8, boolean p9, boolean p10, com.google.android.finsky.d.w p11, InstallRequest p12) {
        com.google.android.finsky.billing.lightpurchase.ar.a(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, 0, p11, p12);
    }

    private static void a(Account p0, Document p1, com.google.android.finsky.cv.a.ax p2, String p3, int p4, String p5, Map p6, com.google.android.finsky.billing.d.e p7, com.google.android.finsky.billing.d.d p8, boolean p9, boolean p10, boolean p11, com.google.android.finsky.d.w p12, InstallRequest p13) {
        if (p2.c == 1 && p1 == 0)
            throw new IllegalArgumentException("A document is required for apps");
        if (p2.c == 1 && com.google.android.finsky.m.a.j(p0.name).a(12612611)) {
            v2 = com.google.android.finsky.m.a.L().a(p3);
            if (v2 != 0) {
                if (p6 == 0)
                    p6 = new HashMap();
                p6.put("pappi", "1");
                if (v2.g != 0)
                    p6.put("papps", "1");
            }
        }
        p12.a(new com.google.android.finsky.d.c(300).a(p3).a(p2).b(p4));
        if (p1 != 0)
            v2 = p1.N();
        else
            v2 = 0;
        com.google.android.finsky.m.a.b(p0.name).a(p3, p4, v2, p6, new com.google.android.finsky.billing.lightpurchase.as(SystemClock.elapsedRealtime(), p12, p3, p2, p4, p0, p1, p5, p9, p7, p13, p11, p10, p8), new com.google.android.finsky.billing.lightpurchase.au(p12, p3, p4, p10, p1, p7));
    }

    public static void a(Account p0, Document p1, Map p2, com.google.android.finsky.billing.d.e p3, boolean p4, boolean p5, boolean p6, com.google.android.finsky.d.w p7) {
        if (p2 == 0)
            v6 = new HashMap();
        else
            v6 = p2;
        v6.put("pcam", "0");
        com.google.android.finsky.billing.lightpurchase.ar.a(p0, p1, p1.d(), p1.a.c, 1, 0, v6, p3, 0, p4, p5, p6, p7, 0);
    }

}

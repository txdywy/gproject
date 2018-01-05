package com.google.android.finsky.stream.controllers.assist;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.utils.C4678i;

public final class C4310a {
    public final String f21761a;

    public C4310a(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        this.f21761a = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("/").append(str2).toString();
    }

    public final void m20031a() {
        C0954a.bp.m5777b(this.f21761a).m5763a(Long.valueOf(C4678i.m21812a()));
        C0957n c = m20030c();
        c.m5763a(Integer.valueOf(((Integer) c.m5760a()).intValue() + 1));
    }

    public final boolean m20032b() {
        return ((Integer) m20030c().m5760a()).intValue() > 0;
    }

    private final C0957n m20030c() {
        return C0954a.bq.m5777b(this.f21761a);
    }
}

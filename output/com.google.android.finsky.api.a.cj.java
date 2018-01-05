package com.google.android.finsky.api.a;

import com.google.android.finsky.cv.a.ax;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.c.a.w;
import com.google.wireless.android.finsky.dfe.nano.ew;
import com.google.wireless.android.finsky.dfe.nano.ez;
import java.util.Arrays;

public final class com.google.android.finsky.api.a.cj implements com.google.android.finsky.api.a.dc
{

    public String a;
    public final com.google.wireless.android.finsky.dfe.c.a.ac b;

    cj(com.google.wireless.android.finsky.dfe.c.a.ac p0) {
        this.b = p0;
    }

    public final String a(String p0) {
        v1 = 0;
        if (this.a == 0) {
            v2 = new StringBuilder(p0);
            if (this.b.b != 0) {
                if (this.b.b.c != 0)
                    v2.append("/docid=").append(this.b.b.c.d).append(",").append(this.b.b.c.c).append(",").append(this.b.b.c.b);
                if (this.b.c != 0 && this.b.c.h.length > 0) {
                    v2.append("/extra=");
                    Arrays.sort(this.b.c.h, new com.google.android.finsky.api.a.ck());
                    v0 = 0;
                    while (v0 < this.b.c.h.length) {
                        if (v0 != 0)
                            v2.append("&");
                        v2.append(this.b.c.h[v0].c).append("=");
                        if (this.b.c.h[v0].e())
                            v2.append(this.b.c.h[v0].d);
                        else if (this.b.c.h[v0].f())
                            v2.append(this.b.c.h[v0].e);
                        else if (this.b.c.h[v0].g())
                            v2.append(this.b.c.h[v0].f);
                        v0 = v0 + 1;
                    }
                }
            }
            if (this.b.a & 256)
                v1 = 1;
            if (v1 != 0) {
                v0 = String.valueOf(this.b.r);
                if (v0.length() != 0)
                    v0 = "/context=".concat(v0);
                else
                    v0 = new String("/context=");
                v2.append(v0);
            }
            else if (this.b.d())
                v2.append("/context=true");
            this.a = v2.toString();
        }
        return this.a;
    }

}

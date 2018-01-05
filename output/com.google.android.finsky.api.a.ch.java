package com.google.android.finsky.api.a;

import android.text.TextUtils;
import com.google.wireless.android.finsky.dfe.nano.bv;
import com.google.wireless.android.finsky.dfe.nano.bw;
import java.util.Arrays;

public final class com.google.android.finsky.api.a.ch implements com.google.android.finsky.api.a.dc
{

    public String a;
    public final com.google.wireless.android.finsky.dfe.nano.bv b;
    public final com.google.android.finsky.api.a.d c;

    ch(com.google.android.finsky.api.a.d p0, com.google.wireless.android.finsky.dfe.nano.bv p1) {
        this.c = p0;
        this.b = p1;
    }

    private final String a() {
        v16 = 0;
        v14 = 0;
        v12 = 0;
        v10 = 0;
        v8 = 0;
        v6 = 0;
        v4 = 0;
        v0 = this.b.b.length;
        v3 = 0;
        while (v3 < v0) {
            v16 = v16 * 31 + (long)this.b.b[v3].d.hashCode();
            v14 = v14 * 31 + (long)this.b.b[v3].e;
            v12 = v12 * 31 + (long)this.b.b[v3].g;
            v10 = v10 * 31 + this.b.b[v3].h;
            v8 = v8 * 31 + (long)Arrays.hashCode(this.b.b[v3].i);
            if (this.b.b[v3].f != 0)
                v2 = 1;
            else
                v2 = 0;
            v6 = v6 * 31 + (long)v2;
            if (this.b.b[v3].a == 0)
                v2 = this.b.b[v3].j;
            else
                v2 = 0;
            if (v2 != 0)
                v2 = 1;
            else
                v2 = 0;
            v0 = (long)v2;
            v4 = v4 * 31 + v0;
            v3 = v3 + 1;
        }
        return v16 + v14 + v12 + v10 + v8 + v6 + v4;
    }

    public final String a(String p0) {
        if (this.a == 0) {
            v0 = new StringBuilder(p0).append("/docidhash=").append(this.a());
            if (!TextUtils.isEmpty(this.c.K.q))
                v0.append("/nodeId=").append(this.c.K.q);
            this.a = v0.toString();
        }
        return this.a;
    }

}

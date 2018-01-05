package com.google.android.finsky.bo;

import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.bn.c;
import com.google.android.finsky.bn.e;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.wireless.android.a.a.a.a.bo;

public final synchronized class com.google.android.finsky.bo.a
{

    public final com.google.android.finsky.bn.b a;
    public final com.google.android.finsky.d.g b;
    public final com.google.android.finsky.d.a c;
    public final com.google.android.finsky.ba.c d;

    a(com.google.android.finsky.bn.b p0, com.google.android.finsky.d.g p1, com.google.android.finsky.d.a p2, com.google.android.finsky.ba.c p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public final synchronized long a(String p0, com.google.android.finsky.d.w p1, long p2, com.google.wireless.android.a.a.a.a.bo p4) {
        enter this;
        try {
            if (this.d.dj().a(12619996)) {
                p1.a(p4, 0);
                this.a.a(new com.google.android.finsky.bn.e(p0).a(p1.c()));
                v0 = p1.b();
            }
            else {
                try {
                    v0 = this.b.dc().a(p4, 0, p2);
                    this.a.e(p0, v0);
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    public final synchronized long a(String p0, com.google.wireless.android.a.a.a.a.bo p1) {
        enter this;
        try {
            v0 = this.a.a(p0);
            if (v0 != 0)
                v3 = this.c.a(v0.d());
            else {
                try {
                    v3 = this.c.a(0);
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            if (v0 != 0)
                v4 = v0.B;
            else
                v4 = -1;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.a(p0, v3, v4, p1);
    }

}

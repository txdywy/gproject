package com.google.android.agera;

import java.util.Arrays;

final synchronized class com.google.android.agera.o
{

    public static final Object[] a;
    public Object[] b;

    static {
        com.google.android.agera.o.a = new Object[0];
    }

    o() {
        this.b = com.google.android.agera.o.a;
    }

    final synchronized boolean a(Object p0) {
        v0 = 0;
        enter this;
        v1 = 0;
        try {
            while (v1 < this.b.length) {
                if (this.b[v1] == p0) {
                    this.b[v1] = 0;
                    this.b[v1 + 1] = 0;
                    v0 = 1;
                }
                v1 = v1 + 2;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    final synchronized boolean a(Object p0, Object p1) {
        v1 = 1;
        enter this;
        v3 = 0;
        v0 = 0;
        v2 = -1;
        v4 = 0;
        try {
            while (v3 < this.b.length) {
                if (this.b[v3] == 0)
                    v2 = v3;
                if (this.b[v3] == p0) {
                    v4 = v4 + 1;
                    if (this.b[v3 + 1] == p1) {
                        v0 = 1;
                        v2 = v3;
                    }
                }
                v3 = v3 + 2;
            }
            if (v2 == -1) {
                v2 = this.b.length;
                if (v2 < 2)
                    v3 = 2;
                else
                    v3 = v2 * 2;
                this.b = Arrays.copyOf(this.b, v3);
            }
            if (v0 == 0) {
                this.b[v2] = p0;
                this.b[v2 + 1] = p1;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        if (v4 != 0)
            v1 = 0;
        exit this;
        return v1;
    }

    final synchronized void b(Object p0, Object p1) {
        enter this;
        v0 = 0;
        try {
            while (v0 < this.b.length) {
                if (this.b[v0] == p0) {
                    if (this.b[v0 + 1] == p1) {
                        this.b[v0] = 0;
                        this.b[v0 + 1] = 0;
                    }
                }
                v0 = v0 + 2;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

}

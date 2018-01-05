package com.android.volley.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final synchronized class com.android.volley.a.f
{

    public static final Comparator e;
    public final List a;
    public final List b;
    public int c;
    public final int d;

    static {
        com.android.volley.a.f.e = new com.android.volley.a.g();
    }

    f(int p0) {
        this.a = new LinkedList();
        this.b = new ArrayList(64);
        this.c = 0;
        this.d = p0;
    }

    private final synchronized void a() {
        enter this;
        try {
            while (this.c > this.d) {
                v0 = (byte[])this.a.remove(0);
                this.b.remove(v0);
                this.c = this.c - v0.length;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(byte[] p0) {
        enter this;
        if (p0 != 0) {
            try {
                if (p0.length > this.d) {
                }
                else {
                    try {
                        this.a.add(p0);
                        v0 = Collections.binarySearch(this.b, p0, com.android.volley.a.f.e);
                        if (v0 < 0)
                            v0 = -v0 - 1;
                        this.b.add(v0, p0);
                        this.c = this.c + p0.length;
                        this.a();
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
        }
        exit this;
    }

    public final synchronized byte[] a(int p0) {
  0:    enter this;
  2:    v1 = 0;
  9:    if (v1 >= this.b.size()) goto 44;
 17:    v0 = (byte[])this.b.get(v1);
 20:    if (v0.length < p0) goto 40;
 26:    this.c = this.c - v0.length;
 30:    this.b.remove(v1);
 35:    this.a.remove(v0);
 38:    exit this;
 39:    return v0;
 42:    v1 = v1 + 1;
 43:    goto 3;
 44:    try {
 44:        v0 = new byte[p0];
        }
        catch (Throwable ex) {
 48:        exit this;
 49:        throw ex;
        }
 46:    goto 38;
 48:    exit this;
 49:    throw ex;
 51:    try
            run 3...38
        catch (Throwable ex) {
  3:        goto 47;
        }
    }

}

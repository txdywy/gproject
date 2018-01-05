package com.android.volley.a;

import com.android.volley.aa;
import com.android.volley.b;
import com.android.volley.j;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

final class com.android.volley.a.j
{

    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    j(String p0, com.android.volley.b p1) {
        if (p1.h != 0)
            v12 = p1.h;
        else
            v12 = com.android.volley.a.n.b(p1.g);
        com.android.volley.a.j(p0, p1.b, p1.c, p1.d, p1.e, p1.f, v12);
        this.a = (long)p1.a.length;
    }

    j(String p0, String p1, long p2, long p4, long p6, long p8, List p10) {
        this.b = p0;
        if ("".equals(p1))
            p1 = 0;
        this.c = p1;
        this.d = p2;
        this.e = p4;
        this.f = p6;
        this.g = p8;
        this.h = p10;
    }

    static com.android.volley.a.j a(com.android.volley.a.k p0) {
        if (com.android.volley.a.i.a(p0) != 538247942)
            throw new IOException();
        return new com.android.volley.a.j(com.android.volley.a.i.a(p0), com.android.volley.a.i.a(p0), com.android.volley.a.i.b(p0), com.android.volley.a.i.b(p0), com.android.volley.a.i.b(p0), com.android.volley.a.i.b(p0), com.android.volley.a.i.b(p0));
    }

    final boolean a(OutputStream p0) {
  5:    com.android.volley.a.i.a(p0, 538247942);
 10:    com.android.volley.a.i.a(p0, this.b);
 15:    if (this.c != 0) goto 96;
 17:    v0 = "";
 19:    com.android.volley.a.i.a(p0, v0);
 24:    com.android.volley.a.i.a(p0, this.d);
 29:    com.android.volley.a.i.a(p0, this.e);
 34:    com.android.volley.a.i.a(p0, this.f);
 39:    com.android.volley.a.i.a(p0, this.g);
 44:    if (this.h == 0) {
100:        com.android.volley.a.i.a(p0, 0);
103:        p0.flush();
106:        v0 = 1;
107:        return v0;
        }
 50:    com.android.volley.a.i.a(p0, this.h.size());
 53:    v3 = this.h.iterator();
 57:    while (v3.hasNext()) {
 67:        v0 = (com.android.volley.j)v3.next();
 71:        com.android.volley.a.i.a(p0, v0.a);
 76:        com.android.volley.a.i.a(p0, v0.b);
        }
 79:    goto 103;
 83:    v1 = new Object[1];
 89:    v1[0] = ex.toString();
 91:    com.android.volley.aa.b("%s", v1);
 94:    v0 = 0;
 95:    return v0;
 96:    v0 = this.c;
 98:    goto 19;
100:    com.android.volley.a.i.a(p0, 0);
103:    p0.flush();
106:    v0 = 1;
107:    return v0;
108:    try
            run 96...106
        catch (IOException ex) {
 96:        goto 80;
        }
109:    try
            run 5...79
        catch (IOException ex) {
  5:        goto 80;
        }
    }

}

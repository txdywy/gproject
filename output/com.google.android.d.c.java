package com.google.android.d;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.ZipException;

public final class com.google.android.d.c
{

    public String a;
    public long b;
    public long c;
    public int d;
    public int e;
    public long f;
    public int g;

    c(byte[] p0, InputStream p1) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        com.google.android.d.b.a(p1, p0, 0, p0.length);
        v0 = new com.google.android.d.a(p0);
        v1 = v0.a();
        if ((long)v1 != 33639248)
            com.google.android.d.d.a("Central Directory Entry", v1);
        v0.c = 8;
        v1 = v0.b() & 65535;
        if (v1 & 1)
            throw new ZipException(45 + "Invalid General Purpose Bit Flag: " + v1);
        this.d = v0.b() & 65535;
        v0.b();
        v0.b();
        v0.a();
        this.b = (long)v0.a() & 4294967295;
        this.c = (long)v0.a() & 4294967295;
        this.e = v0.b() & 65535;
        v1 = v0.b() & 65535;
        v2 = v0.b() & 65535;
        if (v1 >= 32768)
            this.g = this.g | 1;
        if (v2 >= 32768)
            this.g = this.g | 2;
        v0.c = 42;
        this.f = (long)v0.a() & 4294967295;
        v0 = new byte[this.e];
        com.google.android.d.b.a(p1, v0, 0, v0.length);
        if (com.google.android.d.c.a(v0))
            this.g = this.g | 16;
        try {
            this.a = new String(v0, 0, v0.length, "UTF-8");
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
        if (v1 > 0)
            com.google.android.d.b.a(p1, v1);
        if (v2 > 0)
            com.google.android.d.b.a(p1, v2);
    }

    private static boolean a(byte[] p0) {
        v0 = 0;
        v1 = 0;
        while (true) {
            if (v1 >= p0.length)
                return v0;
            if (p0[v1] == 0)
                break;
            v1 = v1 + 1;
        }
        v0 = 1;
        return v0;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

}

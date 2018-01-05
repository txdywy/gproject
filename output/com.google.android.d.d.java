package com.google.android.d;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

public final class com.google.android.d.d implements Closeable
{

    public RandomAccessFile a;
    public final LinkedHashMap b;
    public final List c;

    d(File p0) {
        this.b = new LinkedHashMap();
        this.c = new ArrayList();
        this.a = new RandomAccessFile(p0.getPath(), "r");
        this.a();
    }

    private final void a() {
        v0 = 0;
        v4 = this.a.length() - 22;
        if (v4 < 0)
            throw new ZipException(53 + "File too short to be a zip file: " + this.a.length());
        this.a.seek(0);
        if ((long)Integer.reverseBytes(this.a.readInt()) != 67324752)
            throw new ZipException("Not a zip archive");
        if (v4 - 65536 < 0)
            v2 = v4;
        else {
            v0 = v4 - 65536;
            v2 = v4;
        }
        while (true) {
            this.a.seek(v2);
            if ((long)Integer.reverseBytes(this.a.readInt()) == 101010256) {
                v0 = new byte[18];
                this.a.readFully(v0);
                v1 = new com.google.android.d.a(v0);
                v3 = v1.b() & 65535;
                v1.c = v1.c + 4;
                v6 = (long)v1.a() & 4294967295;
                if (v3 != (v1.b() & 65535) || (v1.b() & 65535) || v1.b() & 65535)
                    throw new ZipException("Spanned archives not supported");
                v0 = new com.google.android.d.e(this.a, v6);
                v1 = 0;
                while (v1 < v3) {
                    v5 = new com.google.android.d.c(new byte[46], new BufferedInputStream(v0, 4096));
                    if (v5.f >= v6)
                        throw new ZipException("Local file header offset is after central directory");
                    v0 = (com.google.android.d.c)this.b.put(v5.a, v5);
                    if (v0 != 0) {
                        v0.g = v0.g | 32;
                        v5.g = v5.g | 32;
                    }
                    this.c.add(v5);
                    v1 = v1 + 1;
                }
                return;
            }
            v2 = v2 - 1;
            if (v2 < v0)
                throw new ZipException("End Of Central Directory signature not found");
        }
    }

    static void a(String p0, int p1) {
        v2 = new Object[1];
        v2[0] = Integer.valueOf(p1);
        v1 = String.format("%08x", v2);
        throw new ZipException((String.valueOf(p0).length() + 26 + String.valueOf(v1).length()) + p0 + " signature not found; was " + v1);
    }

    public final InputStream a(com.google.android.d.c p0, boolean p1) {
        if (this.a == 0)
            throw new IllegalStateException("Zip file closed");
        if (p0.a == 0)
            throw new NullPointerException("entryName == null");
        v0 = this.b.get(p0.a);
        if ((com.google.android.d.c)v0 == 0)
            v2 = (com.google.android.d.c)this.b.get(String.valueOf(p0.a).concat("/"));
        else
            v2 = (com.google.android.d.c)v0;
        if (v2 == 0) {
            v0 = 0;
            return v0;
        }
        enter this.a;
        try {
            v0 = new com.google.android.d.e(this.a, v2.f);
            v4 = new DataInputStream(v0);
            v5 = Integer.reverseBytes(v4.readInt());
            if ((long)v5 != 67324752)
                com.google.android.d.d.a("Local File Header", v5);
            v4.skipBytes(2);
            v5 = Short.reverseBytes(v4.readShort()) & 65535;
            if (v5 & 1)
                throw new ZipException(45 + "Invalid General Purpose Bit Flag: " + v5);
            exit this.a;
        }
        catch (Throwable ex) {
            exit this.a;
            throw ex;
        }
        try {
            v4.skipBytes(18);
            v5 = Short.reverseBytes(v4.readShort()) & 65535;
            v6 = Short.reverseBytes(v4.readShort()) & 65535;
            v4.close();
            if (v5 != v2.e)
                v2.g = v2.g | 8;
            if (v6 >= 32768)
                v2.g = v2.g | 4;
            if (p1 != 0) {
                exit this.a;
                v0 = 0;
            }
            else {
                v0.skip((long)(v5 + v6));
                if (v2.d == 0) {
                    v0.b = v0.c + v2.c;
                    exit this.a;
                }
                else {
                    v0.b = v0.c + v2.b;
                    exit this.a;
                    v0 = new com.google.android.d.f(v0, new Inflater(1), Math.max(1024, (int)Math.min(v2.c, 4096)), v2);
                }
            }
        }
        catch (Throwable ex) {
            exit this.a;
            throw ex;
        }
        return v0;
    }

    public final void close() {
        if (this.a == 0)
            return;
        enter this.a;
        try {
            this.a = 0;
            this.a.close();
            exit this.a;
            return;
            exit this.a;
        }
        catch (Throwable ex) {
            exit this.a;
            throw ex;
        }
    }

}

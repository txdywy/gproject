package com.google.android.d;

import java.io.InputStream;
import java.io.RandomAccessFile;

public final class com.google.android.d.e extends InputStream
{

    public final RandomAccessFile a;
    public long b;
    public long c;

    e(RandomAccessFile p0, long p1) {
        InputStream();
        this.a = p0;
        this.c = p1;
        this.b = p0.length();
    }

    public final int available() {
        if (this.c < this.b)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final int read() {
        enter this.a;
        try {
            this.a.seek(this.c);
            v0 = this.a.read();
            if (v0 != -1)
                this.c = this.c + 1;
            exit this.a;
            return v0;
            exit this.a;
        }
        catch (Throwable ex) {
            exit this.a;
            throw ex;
        }
    }

    public final int read(byte[] p0, int p1, int p2) {
        enter this.a;
        try {
            if ((long)p2 > this.b - this.c)
                p2 = (int)(this.b - this.c);
            this.a.seek(this.c);
            v0 = this.a.read(p0, p1, p2);
            if (v0 > 0) {
                this.c = this.c + (long)v0;
                exit this.a;
            }
            else {
                v0 = -1;
                exit this.a;
            }
            return v0;
            exit this.a;
        }
        catch (Throwable ex) {
            exit this.a;
            throw ex;
        }
    }

    public final long skip(long p0) {
        if (p0 > this.b - this.c)
            p0 = this.b - this.c;
        this.c = this.c + p0;
        return p0;
    }

}

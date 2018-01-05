package com.google.android.d;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public final class com.google.android.d.f extends InflaterInputStream
{

    public final com.google.android.d.c a;
    public long b;

    f(InputStream p0, Inflater p1, int p2, com.google.android.d.c p3) {
        InflaterInputStream(p0, p1, p2);
        this.b = 0;
        this.a = p3;
    }

    public final int available() {
        if (super.available() == 0)
            v0 = 0;
        else
            v0 = (int)(this.a.c - this.b);
        return v0;
    }

    public final int read(byte[] p0, int p1, int p2) {
        try {
            v0 = super.read(p0, p1, p2);
        }
        catch (IOException ex) {
            throw new IOException((String.valueOf(this.a.a).length() + 56) + "Error reading data for " + this.a.a + " near offset " + this.b);
        }
        if (v0 != -1) {
            this.b = this.b + (long)v0;
            return v0;
        }
        if (this.a.c != this.b) {
            throw new IOException(76 + "Size mismatch on inflated file: " + this.b + " vs " + this.a.c);
            this.b = this.b + (long)v0;
        }
        return v0;
    }

}

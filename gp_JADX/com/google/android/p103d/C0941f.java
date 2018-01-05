package com.google.android.p103d;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

final class C0941f extends InflaterInputStream {
    public final C0938c f5748a;
    public long f5749b = 0;

    public C0941f(InputStream inputStream, Inflater inflater, int i, C0938c c0938c) {
        super(inputStream, inflater, i);
        this.f5748a = c0938c;
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f5749b += (long) read;
            } else if (this.f5748a.f5737c != this.f5749b) {
                long j = this.f5749b;
                throw new IOException("Size mismatch on inflated file: " + j + " vs " + this.f5748a.f5737c);
            }
            return read;
        } catch (IOException e) {
            String str = this.f5748a.f5735a;
            throw new IOException(new StringBuilder(String.valueOf(str).length() + 56).append("Error reading data for ").append(str).append(" near offset ").append(this.f5749b).toString());
        }
    }

    public final int available() {
        if (super.available() == 0) {
            return 0;
        }
        return (int) (this.f5748a.f5737c - this.f5749b);
    }
}

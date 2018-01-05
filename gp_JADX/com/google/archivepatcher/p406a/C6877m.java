package com.google.archivepatcher.p406a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public final class C6877m extends InputStream {
    public final RandomAccessFile f33983a;
    public long f33984b;
    public long f33985c;
    public long f33986d;
    public final long f33987e;

    public C6877m(File file) {
        this(file, file.length());
    }

    private C6877m(File file, long j) {
        this.f33984b = -1;
        this.f33983a = new RandomAccessFile(file, "r");
        this.f33987e = file.length();
        m31246a(0, j);
    }

    public final void m31246a(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("rangeOffset must be >= 0");
        } else if (j2 < 0) {
            throw new IllegalArgumentException("rangeLength must be >= 0");
        } else if (j + j2 > this.f33987e) {
            throw new IllegalArgumentException("Read range exceeds file length");
        } else if (j + j2 < 0) {
            throw new IllegalArgumentException("Insane input size not supported");
        } else {
            this.f33985c = j;
            this.f33986d = j2;
            this.f33984b = j;
            reset();
            this.f33984b = -1;
        }
    }

    public final int available() {
        long filePointer = this.f33986d - (this.f33983a.getFilePointer() - this.f33985c);
        if (filePointer > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) filePointer;
    }

    public final void close() {
        this.f33983a.close();
    }

    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        return this.f33983a.read();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        return this.f33983a.read(bArr, i, Math.min(i2, available));
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final long skip(long j) {
        if (j <= 0) {
            return 0;
        }
        int available = available();
        if (available <= 0) {
            return 0;
        }
        int min = (int) Math.min((long) available, j);
        this.f33983a.seek(this.f33983a.getFilePointer() + ((long) min));
        return (long) min;
    }

    public final boolean markSupported() {
        return true;
    }

    public final void mark(int i) {
        try {
            this.f33984b = this.f33983a.getFilePointer();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void reset() {
        if (this.f33984b < 0) {
            throw new IOException("mark not set");
        }
        this.f33983a.seek(this.f33984b);
    }
}

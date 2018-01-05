package com.google.android.p103d;

import java.io.InputStream;
import java.io.RandomAccessFile;

final class C0940e extends InputStream {
    public final RandomAccessFile f5745a;
    public long f5746b;
    public long f5747c;

    public C0940e(RandomAccessFile randomAccessFile, long j) {
        this.f5745a = randomAccessFile;
        this.f5747c = j;
        this.f5746b = randomAccessFile.length();
    }

    public final int available() {
        return this.f5747c < this.f5746b ? 1 : 0;
    }

    public final int read() {
        int read;
        synchronized (this.f5745a) {
            this.f5745a.seek(this.f5747c);
            read = this.f5745a.read();
            if (read != -1) {
                this.f5747c++;
            }
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read;
        synchronized (this.f5745a) {
            long j = this.f5746b - this.f5747c;
            if (((long) i2) > j) {
                i2 = (int) j;
            }
            this.f5745a.seek(this.f5747c);
            read = this.f5745a.read(bArr, i, i2);
            if (read > 0) {
                this.f5747c += (long) read;
            } else {
                read = -1;
            }
        }
        return read;
    }

    public final long skip(long j) {
        if (j > this.f5746b - this.f5747c) {
            j = this.f5746b - this.f5747c;
        }
        this.f5747c += j;
        return j;
    }
}

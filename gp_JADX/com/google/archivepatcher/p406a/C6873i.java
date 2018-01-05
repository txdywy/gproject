package com.google.archivepatcher.p406a;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public final class C6873i implements Closeable {
    public final C6870f f33970a = new C6870f();
    public final C6865a f33971b;
    public final byte[] f33972c = new byte[32768];

    public C6873i(OutputStream outputStream) {
        this.f33971b = new C6865a(outputStream);
    }

    public final long m31244a(InputStream inputStream, C6874j c6874j) {
        long j = this.f33971b.f33903a;
        if (c6874j == C6874j.COPY) {
            while (true) {
                int read = inputStream.read(this.f33972c);
                if (read < 0) {
                    break;
                }
                this.f33971b.write(this.f33972c, 0, read);
            }
        } else {
            C6870f c6870f = this.f33970a;
            boolean z = c6874j == C6874j.UNCOMPRESS_NOWRAP;
            if (z != c6870f.f33913a) {
                c6870f.m31241a();
                c6870f.f33913a = z;
            }
            c6870f = this.f33970a;
            OutputStream outputStream = this.f33971b;
            Inflater inflater = c6870f.f33916d;
            if (inflater == null) {
                inflater = new Inflater(c6870f.f33913a);
                if (c6870f.f33917e) {
                    c6870f.f33916d = inflater;
                }
            } else {
                inflater.reset();
            }
            InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream, inflater, c6870f.f33914b);
            byte[] bArr = new byte[c6870f.f33915c];
            while (true) {
                int read2 = inflaterInputStream.read(bArr);
                if (read2 < 0) {
                    break;
                }
                outputStream.write(bArr, 0, read2);
            }
            if (!c6870f.f33917e) {
                c6870f.m31241a();
            }
        }
        this.f33971b.flush();
        return this.f33971b.f33903a - j;
    }

    public final void close() {
        this.f33970a.m31241a();
        this.f33971b.close();
    }
}

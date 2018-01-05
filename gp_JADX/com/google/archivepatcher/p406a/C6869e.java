package com.google.archivepatcher.p406a;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public final class C6869e {
    public int f33906a = -1;
    public int f33907b = 0;
    public boolean f33908c = true;
    public int f33909d = 32768;
    public int f33910e = 32768;
    public Deflater f33911f = null;
    public boolean f33912g = false;

    public final void m31239a() {
        if (this.f33911f != null) {
            this.f33911f.end();
            this.f33911f = null;
        }
    }

    public final void m31240a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[this.f33909d];
        Deflater deflater = this.f33911f;
        if (deflater == null) {
            deflater = new Deflater(this.f33906a, this.f33908c);
            deflater.setStrategy(this.f33907b);
            if (this.f33912g) {
                this.f33911f = deflater;
            }
        } else {
            deflater.reset();
        }
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater, this.f33910e);
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                deflaterOutputStream.write(bArr, 0, read);
            } else {
                deflaterOutputStream.finish();
                deflaterOutputStream.flush();
                return;
            }
        }
    }
}

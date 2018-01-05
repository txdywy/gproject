package com.google.archivepatcher.p406a;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public final class C6878n extends OutputStream {
    public final RandomAccessFile f33988a;

    public C6878n(File file, long j) {
        this.f33988a = new RandomAccessFile(file, "rw");
        if (j >= 0) {
            this.f33988a.setLength(j);
            if (this.f33988a.length() != j) {
                throw new IOException("Unable to set the file size");
            }
        }
    }

    public final void write(int i) {
        this.f33988a.write(i);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f33988a.write(bArr, i, i2);
    }

    public final void flush() {
        this.f33988a.getChannel().force(true);
    }

    public final void close() {
        flush();
        this.f33988a.close();
    }
}

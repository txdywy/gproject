package org.chromium.net.impl;

import android.support.v7.widget.eq;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

final class aa implements ReadableByteChannel {
    public final InputStream f40750a;
    public final AtomicBoolean f40751b = new AtomicBoolean(true);

    private aa(InputStream inputStream) {
        this.f40750a = inputStream;
    }

    static ReadableByteChannel m38049a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        return new aa(inputStream);
    }

    public final int read(ByteBuffer byteBuffer) {
        int read;
        if (byteBuffer.hasArray()) {
            read = this.f40750a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read > 0) {
                byteBuffer.position(byteBuffer.position() + read);
            }
        } else {
            byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.f40750a.available(), eq.FLAG_APPEARED_IN_PRE_LAYOUT), byteBuffer.remaining()))];
            read = this.f40750a.read(bArr);
            if (read > 0) {
                byteBuffer.put(bArr, 0, read);
            }
        }
        return read;
    }

    public final boolean isOpen() {
        return this.f40751b.get();
    }

    public final void close() {
        if (this.f40751b.compareAndSet(true, false)) {
            this.f40750a.close();
        }
    }
}

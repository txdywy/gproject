package com.google.compression.brotli.wrapper.dec;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class C7088b {
    public final ReadableByteChannel f34674a;
    public final C7090d f34675b;
    public ByteBuffer f34676c;
    public boolean f34677d;
    public boolean f34678e;

    public C7088b(ReadableByteChannel readableByteChannel) {
        if (readableByteChannel == null) {
            throw new NullPointerException("source can not be null");
        }
        this.f34674a = readableByteChannel;
        this.f34675b = new C7090d();
    }

    public final void m32216a(String str) {
        try {
            m32217b();
        } catch (IOException e) {
        }
        throw new IOException(str);
    }

    final int m32215a() {
        while (true) {
            if (this.f34676c != null) {
                if (this.f34676c.hasRemaining()) {
                    return this.f34676c.remaining();
                }
                this.f34676c = null;
            }
            switch (this.f34675b.f34687c.ordinal()) {
                case 1:
                    return -1;
                case 2:
                    if (!this.f34678e || !this.f34675b.m32220a()) {
                        ByteBuffer byteBuffer = this.f34675b.f34686b;
                        byteBuffer.clear();
                        int read = this.f34674a.read(byteBuffer);
                        if (read == -1) {
                            m32216a("unexpected end of input");
                        }
                        this.f34675b.m32219a(read);
                        break;
                    }
                    this.f34676c = this.f34675b.m32221b();
                    break;
                    break;
                case 3:
                    this.f34676c = this.f34675b.m32221b();
                    break;
                case 4:
                    this.f34675b.m32219a(0);
                    break;
                default:
                    m32216a("corrupted input");
                    break;
            }
        }
    }

    final void m32217b() {
        if (!this.f34677d) {
            this.f34677d = true;
            this.f34675b.m32222c();
            this.f34674a.close();
        }
    }
}

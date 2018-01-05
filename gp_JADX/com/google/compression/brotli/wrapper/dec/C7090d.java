package com.google.compression.brotli.wrapper.dec;

import java.io.IOException;
import java.nio.ByteBuffer;

public final class C7090d {
    public final long[] f34685a = new long[3];
    public final ByteBuffer f34686b;
    public C7089c f34687c = C7089c.NEEDS_MORE_INPUT;
    public boolean f34688d = true;

    public C7090d() {
        this.f34685a[1] = 8192;
        this.f34686b = DecoderJNI.nativeCreate(this.f34685a);
        if (this.f34685a[0] == 0) {
            throw new IOException("failed to initialize native brotli decoder");
        }
    }

    public final void m32219a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("negative block length");
        } else if (this.f34685a[0] == 0) {
            throw new IllegalStateException("brotli decoder is already destroyed");
        } else if (this.f34687c != C7089c.NEEDS_MORE_INPUT && this.f34687c != C7089c.OK) {
            String valueOf = String.valueOf(this.f34687c);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 34).append("pushing input to decoder in ").append(valueOf).append(" state").toString());
        } else if (this.f34687c != C7089c.OK || i == 0) {
            this.f34688d = false;
            DecoderJNI.nativePush(this.f34685a, i);
            m32218d();
        } else {
            throw new IllegalStateException("pushing input to decoder in OK state");
        }
    }

    private final void m32218d() {
        long j = this.f34685a[1];
        if (j == 1) {
            this.f34687c = C7089c.DONE;
        } else if (j == 2) {
            this.f34687c = C7089c.NEEDS_MORE_INPUT;
        } else if (j == 3) {
            this.f34687c = C7089c.NEEDS_MORE_OUTPUT;
        } else if (j == 4) {
            this.f34687c = C7089c.OK;
        } else {
            this.f34687c = C7089c.ERROR;
        }
    }

    public final boolean m32220a() {
        return this.f34685a[2] != 0;
    }

    public final ByteBuffer m32221b() {
        if (this.f34685a[0] == 0) {
            throw new IllegalStateException("brotli decoder is already destroyed");
        } else if (this.f34687c == C7089c.NEEDS_MORE_OUTPUT || m32220a()) {
            this.f34688d = false;
            ByteBuffer b = DecoderJNI.nativePull(this.f34685a);
            m32218d();
            return b;
        } else {
            String valueOf = String.valueOf(this.f34687c);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 37).append("pulling output from decoder in ").append(valueOf).append(" state").toString());
        }
    }

    public final void m32222c() {
        if (this.f34685a[0] == 0) {
            throw new IllegalStateException("brotli decoder is already destroyed");
        }
        DecoderJNI.nativeDestroy(this.f34685a);
        this.f34685a[0] = 0;
    }

    protected final void finalize() {
        if (this.f34685a[0] != 0) {
            m32222c();
        }
        super.finalize();
    }
}

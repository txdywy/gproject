package com.google.protobuf;

import com.google.protobuf.CodedOutputStream.OutOfSpaceException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class ab extends CodedOutputStream {
    public final ByteBuffer f35092e;
    public final ByteBuffer f35093f;

    ab(ByteBuffer byteBuffer) {
        this.f35092e = byteBuffer;
        this.f35093f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position();
    }

    public final void mo6027a(int i, int i2) {
        mo6044c((i << 3) | i2);
    }

    public final void mo6040b(int i, int i2) {
        mo6027a(i, 0);
        mo6039b(i2);
    }

    public final void mo6045c(int i, int i2) {
        mo6027a(i, 0);
        mo6044c(i2);
    }

    public final void mo6049e(int i, int i2) {
        mo6027a(i, 5);
        mo6048e(i2);
    }

    public final void mo6028a(int i, long j) {
        mo6027a(i, 0);
        mo6033a(j);
    }

    public final void mo6046c(int i, long j) {
        mo6027a(i, 1);
        mo6047c(j);
    }

    public final void mo6032a(int i, boolean z) {
        int i2 = 0;
        mo6027a(i, 0);
        if (z) {
            i2 = 1;
        }
        mo6026a((byte) i2);
    }

    public final void mo6031a(int i, String str) {
        mo6027a(i, 2);
        mo6036a(str);
    }

    public final void mo6030a(int i, C7203j c7203j) {
        mo6027a(i, 2);
        mo6035a(c7203j);
    }

    public final void mo6029a(int i, cf cfVar) {
        mo6027a(i, 2);
        mo6034a(cfVar);
    }

    public final void mo6041b(int i, cf cfVar) {
        mo6027a(1, 3);
        mo6045c(2, i);
        mo6029a(3, cfVar);
        mo6027a(1, 4);
    }

    public final void mo6042b(int i, C7203j c7203j) {
        mo6027a(1, 3);
        mo6045c(2, i);
        mo6030a(3, c7203j);
        mo6027a(1, 4);
    }

    public final void mo6034a(cf cfVar) {
        mo6044c(cfVar.mo6115a());
        cfVar.mo6116a(this);
    }

    public final void mo6026a(byte b) {
        try {
            this.f35093f.put(b);
        } catch (Throwable e) {
            throw new OutOfSpaceException(e);
        }
    }

    public final void mo6035a(C7203j c7203j) {
        mo6044c(c7203j.mo6170a());
        c7203j.mo6174a((C7195i) this);
    }

    public final void mo6037a(byte[] bArr, int i) {
        mo6044c(i);
        mo6043b(bArr, 0, i);
    }

    public final void mo6039b(int i) {
        if (i >= 0) {
            mo6044c(i);
        } else {
            mo6033a((long) i);
        }
    }

    public final void mo6044c(int i) {
        while ((i & -128) != 0) {
            this.f35093f.put((byte) ((i & 127) | 128));
            i >>>= 7;
        }
        try {
            this.f35093f.put((byte) i);
        } catch (Throwable e) {
            throw new OutOfSpaceException(e);
        }
    }

    public final void mo6048e(int i) {
        try {
            this.f35093f.putInt(i);
        } catch (Throwable e) {
            throw new OutOfSpaceException(e);
        }
    }

    public final void mo6033a(long j) {
        while ((-128 & j) != 0) {
            this.f35093f.put((byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        try {
            this.f35093f.put((byte) ((int) j));
        } catch (Throwable e) {
            throw new OutOfSpaceException(e);
        }
    }

    public final void mo6047c(long j) {
        try {
            this.f35093f.putLong(j);
        } catch (Throwable e) {
            throw new OutOfSpaceException(e);
        }
    }

    public final void mo6043b(byte[] bArr, int i, int i2) {
        try {
            this.f35093f.put(bArr, i, i2);
        } catch (Throwable e) {
            throw new OutOfSpaceException(e);
        } catch (Throwable e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public final void mo6038a(byte[] bArr, int i, int i2) {
        mo6043b(bArr, i, i2);
    }

    public final void mo6036a(String str) {
        int position = this.f35093f.position();
        try {
            int o = CodedOutputStream.m32622o(str.length() * 3);
            int o2 = CodedOutputStream.m32622o(str.length());
            if (o2 == o) {
                o = this.f35093f.position() + o2;
                this.f35093f.position(o);
                m32726c(str);
                o2 = this.f35093f.position();
                this.f35093f.position(position);
                mo6044c(o2 - o);
                this.f35093f.position(o2);
                return;
            }
            mo6044c(Utf8.m32678a((CharSequence) str));
            m32726c(str);
        } catch (UnpairedSurrogateException e) {
            this.f35093f.position(position);
            m32643a(str, e);
        } catch (Throwable e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public final void mo6050h() {
        this.f35092e.position(this.f35093f.position());
    }

    public final int mo6024i() {
        return this.f35093f.remaining();
    }

    private final void m32726c(String str) {
        try {
            Utf8.m32680a((CharSequence) str, this.f35093f);
        } catch (Throwable e) {
            throw new OutOfSpaceException(e);
        }
    }
}

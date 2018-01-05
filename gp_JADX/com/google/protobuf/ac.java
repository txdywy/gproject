package com.google.protobuf;

import com.google.protobuf.CodedOutputStream.OutOfSpaceException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class ac extends CodedOutputStream {
    public final ByteBuffer f35094e;
    public final ByteBuffer f35095f;
    public final long f35096g;
    public final long f35097h;
    public final long f35098i;
    public final long f35099j = (this.f35098i - 10);
    public long f35100k = this.f35097h;

    ac(ByteBuffer byteBuffer) {
        this.f35094e = byteBuffer;
        this.f35095f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.f35096g = ea.m33359a(byteBuffer);
        this.f35097h = this.f35096g + ((long) byteBuffer.position());
        this.f35098i = this.f35096g + ((long) byteBuffer.limit());
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
        if (this.f35100k >= this.f35098i) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f35100k), Long.valueOf(this.f35098i), Integer.valueOf(1)}));
        }
        long j = this.f35100k;
        this.f35100k = 1 + j;
        ea.m33363a(j, b);
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
        long j;
        if (this.f35100k <= this.f35099j) {
            while ((i & -128) != 0) {
                j = this.f35100k;
                this.f35100k = j + 1;
                ea.m33363a(j, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            j = this.f35100k;
            this.f35100k = j + 1;
            ea.m33363a(j, (byte) i);
            return;
        }
        while (this.f35100k < this.f35098i) {
            if ((i & -128) == 0) {
                j = this.f35100k;
                this.f35100k = j + 1;
                ea.m33363a(j, (byte) i);
                return;
            }
            j = this.f35100k;
            this.f35100k = j + 1;
            ea.m33363a(j, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f35100k), Long.valueOf(this.f35098i), Integer.valueOf(1)}));
    }

    public final void mo6048e(int i) {
        this.f35095f.putInt((int) (this.f35100k - this.f35096g), i);
        this.f35100k += 4;
    }

    public final void mo6033a(long j) {
        long j2;
        if (this.f35100k <= this.f35099j) {
            while ((j & -128) != 0) {
                j2 = this.f35100k;
                this.f35100k = j2 + 1;
                ea.m33363a(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            j2 = this.f35100k;
            this.f35100k = j2 + 1;
            ea.m33363a(j2, (byte) ((int) j));
            return;
        }
        while (this.f35100k < this.f35098i) {
            if ((j & -128) == 0) {
                j2 = this.f35100k;
                this.f35100k = j2 + 1;
                ea.m33363a(j2, (byte) ((int) j));
                return;
            }
            j2 = this.f35100k;
            this.f35100k = j2 + 1;
            ea.m33363a(j2, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f35100k), Long.valueOf(this.f35098i), Integer.valueOf(1)}));
    }

    public final void mo6047c(long j) {
        this.f35095f.putLong((int) (this.f35100k - this.f35096g), j);
        this.f35100k += 8;
    }

    public final void mo6043b(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i && this.f35098i - ((long) i2) >= this.f35100k) {
            ea.f35383g.mo6212a(bArr, (long) i, this.f35100k, (long) i2);
            this.f35100k += (long) i2;
        } else if (bArr == null) {
            throw new NullPointerException("value");
        } else {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f35100k), Long.valueOf(this.f35098i), Integer.valueOf(i2)}));
        }
    }

    public final void mo6038a(byte[] bArr, int i, int i2) {
        mo6043b(bArr, i, i2);
    }

    public final void mo6036a(String str) {
        long j = this.f35100k;
        try {
            int o = CodedOutputStream.m32622o(str.length() * 3);
            int o2 = CodedOutputStream.m32622o(str.length());
            if (o2 == o) {
                o = ((int) (this.f35100k - this.f35096g)) + o2;
                this.f35095f.position(o);
                Utf8.m32680a((CharSequence) str, this.f35095f);
                o = this.f35095f.position() - o;
                mo6044c(o);
                this.f35100k = ((long) o) + this.f35100k;
                return;
            }
            o = Utf8.m32678a((CharSequence) str);
            mo6044c(o);
            m32753g(this.f35100k);
            Utf8.m32680a((CharSequence) str, this.f35095f);
            this.f35100k = ((long) o) + this.f35100k;
        } catch (UnpairedSurrogateException e) {
            this.f35100k = j;
            m32753g(this.f35100k);
            m32643a(str, e);
        } catch (Throwable e2) {
            throw new OutOfSpaceException(e2);
        } catch (Throwable e22) {
            throw new OutOfSpaceException(e22);
        }
    }

    public final void mo6050h() {
        this.f35094e.position((int) (this.f35100k - this.f35096g));
    }

    public final int mo6024i() {
        return (int) (this.f35098i - this.f35100k);
    }

    private final void m32753g(long j) {
        this.f35095f.position((int) (j - this.f35096g));
    }
}

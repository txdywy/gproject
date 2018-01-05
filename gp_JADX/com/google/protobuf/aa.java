package com.google.protobuf;

import com.google.protobuf.CodedOutputStream.OutOfSpaceException;
import java.io.OutputStream;

final class aa extends C7197x {
    public final OutputStream f35091i;

    aa(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f35091i = outputStream;
    }

    public final void mo6027a(int i, int i2) {
        mo6044c((i << 3) | i2);
    }

    public final void mo6040b(int i, int i2) {
        m32700v(20);
        m32696j(i, 0);
        if (i2 >= 0) {
            mo6025t(i2);
        } else {
            mo6023g((long) i2);
        }
    }

    public final void mo6045c(int i, int i2) {
        m32700v(20);
        m32696j(i, 0);
        mo6025t(i2);
    }

    public final void mo6049e(int i, int i2) {
        m32700v(14);
        m32696j(i, 5);
        m32698u(i2);
    }

    public final void mo6028a(int i, long j) {
        m32700v(20);
        m32696j(i, 0);
        mo6023g(j);
    }

    public final void mo6046c(int i, long j) {
        m32700v(18);
        m32696j(i, 1);
        m32694h(j);
    }

    public final void mo6032a(int i, boolean z) {
        int i2 = 0;
        m32700v(11);
        m32696j(i, 0);
        if (z) {
            i2 = 1;
        }
        m32692b((byte) i2);
    }

    public final void mo6031a(int i, String str) {
        mo6027a(i, 2);
        mo6036a(str);
    }

    public final void mo6030a(int i, C7203j c7203j) {
        mo6027a(i, 2);
        mo6035a(c7203j);
    }

    public final void mo6035a(C7203j c7203j) {
        mo6044c(c7203j.mo6170a());
        c7203j.mo6174a((C7195i) this);
    }

    public final void mo6037a(byte[] bArr, int i) {
        mo6044c(i);
        mo6043b(bArr, 0, i);
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
        if (this.g == this.f) {
            m32699j();
        }
        m32692b(b);
    }

    public final void mo6039b(int i) {
        if (i >= 0) {
            mo6044c(i);
        } else {
            mo6033a((long) i);
        }
    }

    public final void mo6044c(int i) {
        m32700v(10);
        mo6025t(i);
    }

    public final void mo6048e(int i) {
        m32700v(4);
        m32698u(i);
    }

    public final void mo6033a(long j) {
        m32700v(10);
        mo6023g(j);
    }

    public final void mo6047c(long j) {
        m32700v(8);
        m32694h(j);
    }

    public final void mo6036a(String str) {
        int i;
        try {
            int length = str.length() * 3;
            int o = CodedOutputStream.m32622o(length);
            if (o + length > this.f) {
                byte[] bArr = new byte[length];
                length = Utf8.m32679a(str, bArr, 0, length);
                mo6044c(length);
                mo6038a(bArr, 0, length);
                return;
            }
            if (length + o > this.f - this.g) {
                m32699j();
            }
            length = CodedOutputStream.m32622o(str.length());
            i = this.g;
            if (length == o) {
                this.g = i + length;
                o = Utf8.m32679a(str, this.e, this.g, this.f - this.g);
                this.g = i;
                length = (o - i) - length;
                mo6025t(length);
                this.g = o;
            } else {
                length = Utf8.m32678a((CharSequence) str);
                mo6025t(length);
                this.g = Utf8.m32679a(str, this.e, this.g, length);
            }
            this.h = length + this.h;
        } catch (UnpairedSurrogateException e) {
            this.h -= this.g - i;
            this.g = i;
            throw e;
        } catch (Throwable e2) {
            throw new OutOfSpaceException(e2);
        } catch (UnpairedSurrogateException e3) {
            m32643a(str, e3);
        }
    }

    public final void mo6050h() {
        if (this.g > 0) {
            m32699j();
        }
    }

    public final void mo6043b(byte[] bArr, int i, int i2) {
        if (this.f - this.g >= i2) {
            System.arraycopy(bArr, i, this.e, this.g, i2);
            this.g += i2;
        } else {
            int i3 = this.f - this.g;
            System.arraycopy(bArr, i, this.e, this.g, i3);
            int i4 = i + i3;
            i2 -= i3;
            this.g = this.f;
            this.h = i3 + this.h;
            m32699j();
            if (i2 <= this.f) {
                System.arraycopy(bArr, i4, this.e, 0, i2);
                this.g = i2;
            } else {
                this.f35091i.write(bArr, i4, i2);
            }
        }
        this.h += i2;
    }

    public final void mo6038a(byte[] bArr, int i, int i2) {
        mo6043b(bArr, i, i2);
    }

    private final void m32700v(int i) {
        if (this.f - this.g < i) {
            m32699j();
        }
    }

    private final void m32699j() {
        this.f35091i.write(this.e, 0, this.g);
        this.g = 0;
    }
}

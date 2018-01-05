package com.google.protobuf;

import android.support.v7.widget.eq;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends C7195i {
    public static final Logger f35080a = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean f35081b = ea.f35385i;
    public ad f35082c = this;
    public boolean f35083d;

    public class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(String str) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
        }
    }

    public static int m32578a(int i) {
        return i > eq.FLAG_APPEARED_IN_PRE_LAYOUT ? eq.FLAG_APPEARED_IN_PRE_LAYOUT : i;
    }

    public abstract void mo6026a(byte b);

    public abstract void mo6027a(int i, int i2);

    public abstract void mo6028a(int i, long j);

    public abstract void mo6029a(int i, cf cfVar);

    public abstract void mo6030a(int i, C7203j c7203j);

    public abstract void mo6031a(int i, String str);

    public abstract void mo6032a(int i, boolean z);

    public abstract void mo6033a(long j);

    public abstract void mo6034a(cf cfVar);

    public abstract void mo6035a(C7203j c7203j);

    public abstract void mo6036a(String str);

    abstract void mo6037a(byte[] bArr, int i);

    public abstract void mo6039b(int i);

    public abstract void mo6040b(int i, int i2);

    public abstract void mo6041b(int i, cf cfVar);

    public abstract void mo6042b(int i, C7203j c7203j);

    public abstract void mo6043b(byte[] bArr, int i, int i2);

    public abstract void mo6044c(int i);

    public abstract void mo6045c(int i, int i2);

    public abstract void mo6046c(int i, long j);

    public abstract void mo6047c(long j);

    public abstract void mo6048e(int i);

    public abstract void mo6049e(int i, int i2);

    public abstract void mo6050h();

    public abstract int mo6024i();

    public static CodedOutputStream m32581a(OutputStream outputStream, int i) {
        return new aa(outputStream, i);
    }

    public static CodedOutputStream m32583a(byte[] bArr) {
        return new C7230y(bArr, 0, bArr.length);
    }

    public static CodedOutputStream m32582a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C7231z(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (ea.f35384h) {
            return new ac(byteBuffer);
        } else {
            return new ab(byteBuffer);
        }
    }

    CodedOutputStream() {
    }

    public final void m32658d(int i, int i2) {
        mo6045c(i, mo6025t(i2));
    }

    public final void m32648b(int i, long j) {
        mo6028a(i, mo6023g(j));
    }

    public final void m32632a(int i, float f) {
        mo6049e(i, Float.floatToRawIntBits(f));
    }

    public final void m32631a(int i, double d) {
        mo6046c(i, Double.doubleToRawLongBits(d));
    }

    public final void m32657d(int i) {
        mo6044c(mo6025t(i));
    }

    public final void m32651b(long j) {
        mo6033a(mo6023g(j));
    }

    public final void m32630a(float f) {
        mo6048e(Float.floatToRawIntBits(f));
    }

    public final void m32629a(double d) {
        mo6047c(Double.doubleToRawLongBits(d));
    }

    public final void m32644a(boolean z) {
        mo6026a((byte) (z ? 1 : 0));
    }

    public static int m32605f(int i, int i2) {
        return m32620m(i) + m32621n(i2);
    }

    public static int m32611g(int i, int i2) {
        return m32620m(i) + m32622o(i2);
    }

    public static int m32614h(int i, int i2) {
        return m32620m(i) + m32622o(mo6025t(i2));
    }

    public static int m32604f(int i) {
        return m32620m(i) + 4;
    }

    public static int m32610g(int i) {
        return m32620m(i) + 4;
    }

    public static int m32596d(int i, long j) {
        return m32620m(i) + m32602e(j);
    }

    public static int m32601e(int i, long j) {
        return m32620m(i) + m32602e(j);
    }

    public static int m32606f(int i, long j) {
        return m32620m(i) + m32602e(mo6023g(j));
    }

    public static int m32613h(int i) {
        return m32620m(i) + 8;
    }

    public static int m32615i(int i) {
        return m32620m(i) + 8;
    }

    public static int m32617j(int i) {
        return m32620m(i) + 4;
    }

    public static int m32618k(int i) {
        return m32620m(i) + 8;
    }

    public static int m32619l(int i) {
        return m32620m(i) + 1;
    }

    public static int m32616i(int i, int i2) {
        return m32620m(i) + m32621n(i2);
    }

    public static int m32586b(int i, String str) {
        return m32620m(i) + m32589b(str);
    }

    public static int m32593c(int i, C7203j c7203j) {
        int m = m32620m(i);
        int a = c7203j.mo6170a();
        return m + (a + m32622o(a));
    }

    public static int m32579a(int i, bm bmVar) {
        int a;
        int m = m32620m(i);
        if (bmVar.f35227d != null) {
            a = bmVar.f35227d.mo6170a();
        } else if (bmVar.f35224a != null) {
            a = bmVar.f35224a.mo6170a();
        } else if (bmVar.f35226c != null) {
            a = bmVar.f35226c.mo6115a();
        } else {
            a = 0;
        }
        return (a + m32622o(a)) + m;
    }

    public static int m32592c(int i, cf cfVar) {
        return m32620m(i) + m32587b(cfVar);
    }

    public static int m32597d(int i, cf cfVar) {
        return ((m32620m(1) * 2) + m32611g(2, i)) + m32592c(3, cfVar);
    }

    public static int m32598d(int i, C7203j c7203j) {
        return ((m32620m(1) * 2) + m32611g(2, i)) + m32593c(3, c7203j);
    }

    public static int m32585b(int i, bm bmVar) {
        return ((m32620m(1) * 2) + m32611g(2, i)) + m32579a(3, bmVar);
    }

    public static int m32620m(int i) {
        return m32622o((i << 3) | 0);
    }

    public static int m32621n(int i) {
        if (i >= 0) {
            return m32622o(i);
        }
        return 10;
    }

    public static int m32622o(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return 4;
        }
        return 5;
    }

    public static int m32623p(int i) {
        return m32622o(mo6025t(i));
    }

    public static int m32577a() {
        return 4;
    }

    public static int m32584b() {
        return 4;
    }

    public static int m32599d(long j) {
        return m32602e(j);
    }

    public static int m32602e(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        long j2;
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j2 = j >>> 28;
        } else {
            j2 = j;
        }
        if ((-2097152 & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        if ((j2 & -16384) != 0) {
            return i + 1;
        }
        return i;
    }

    public static int m32608f(long j) {
        return m32602e(mo6023g(j));
    }

    public static int m32591c() {
        return 8;
    }

    public static int m32595d() {
        return 8;
    }

    public static int m32600e() {
        return 4;
    }

    public static int m32603f() {
        return 8;
    }

    public static int m32609g() {
        return 1;
    }

    public static int m32624q(int i) {
        return m32621n(i);
    }

    public static int m32589b(String str) {
        int a;
        try {
            a = Utf8.m32678a((CharSequence) str);
        } catch (UnpairedSurrogateException e) {
            a = str.getBytes(bb.f35208a).length;
        }
        return a + m32622o(a);
    }

    public static int m32580a(bm bmVar) {
        int a;
        if (bmVar.f35227d != null) {
            a = bmVar.f35227d.mo6170a();
        } else if (bmVar.f35224a != null) {
            a = bmVar.f35224a.mo6170a();
        } else if (bmVar.f35226c != null) {
            a = bmVar.f35226c.mo6115a();
        } else {
            a = 0;
        }
        return a + m32622o(a);
    }

    public static int m32588b(C7203j c7203j) {
        int a = c7203j.mo6170a();
        return a + m32622o(a);
    }

    public static int m32590b(byte[] bArr) {
        int length = bArr.length;
        return length + m32622o(length);
    }

    public static int m32587b(cf cfVar) {
        int a = cfVar.mo6115a();
        return a + m32622o(a);
    }

    static int m32625r(int i) {
        return m32622o(i) + i;
    }

    private static int mo6025t(int i) {
        return (i << 1) ^ (i >> 31);
    }

    private static long mo6023g(long j) {
        return (j << 1) ^ (j >> 63);
    }

    final void m32643a(String str, UnpairedSurrogateException unpairedSurrogateException) {
        f35080a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(bb.f35208a);
        try {
            mo6044c(bytes.length);
            mo6038a(bytes, 0, bytes.length);
        } catch (Throwable e) {
            throw new OutOfSpaceException(e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    @Deprecated
    public final void m32661e(int i, cf cfVar) {
        mo6027a(i, 3);
        cfVar.mo6116a(this);
        mo6027a(i, 4);
    }

    @Deprecated
    public static int m32607f(int i, cf cfVar) {
        return (m32620m(i) * 2) + cfVar.mo6115a();
    }

    @Deprecated
    public static int m32594c(cf cfVar) {
        return cfVar.mo6115a();
    }

    @Deprecated
    public static int m32626s(int i) {
        return m32622o(i);
    }
}

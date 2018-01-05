package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ap extends b {
    public static volatile ap[] f39882a;
    public String f39883b;
    public Integer f39884c;
    public Integer f39885d;
    public String f39886e;

    public static ap[] m37108d() {
        if (f39882a == null) {
            synchronized (C7219h.f35465b) {
                if (f39882a == null) {
                    f39882a = new ap[0];
                }
            }
        }
        return f39882a;
    }

    public ap() {
        this.f39883b = null;
        this.f39884c = null;
        this.f39885d = null;
        this.f39886e = null;
        this.aP = -1;
    }

    public final void m37110a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39883b != null) {
            codedOutputByteBufferNano.m33521a(1, this.f39883b);
        }
        if (this.f39884c != null) {
            codedOutputByteBufferNano.m33518a(2, this.f39884c.intValue());
        }
        if (this.f39885d != null) {
            codedOutputByteBufferNano.m33518a(3, this.f39885d.intValue());
        }
        if (this.f39886e != null) {
            codedOutputByteBufferNano.m33521a(4, this.f39886e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37111b() {
        int b = super.b();
        if (this.f39883b != null) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39883b);
        }
        if (this.f39884c != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f39884c.intValue());
        }
        if (this.f39885d != null) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f39885d.intValue());
        }
        if (this.f39886e != null) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f39886e);
        }
        return b;
    }

    public final /* synthetic */ i m37109a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39883b = c7213a.m33564f();
                    continue;
                case 16:
                    this.f39884c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f39885d = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 34:
                    this.f39886e = c7213a.m33564f();
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}

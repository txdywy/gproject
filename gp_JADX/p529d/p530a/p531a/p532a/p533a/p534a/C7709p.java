package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7709p extends b {
    public static volatile C7709p[] f40142a;
    public Integer f40143b;
    public aa f40144c;

    public static C7709p[] m37285d() {
        if (f40142a == null) {
            synchronized (C7219h.f35465b) {
                if (f40142a == null) {
                    f40142a = new C7709p[0];
                }
            }
        }
        return f40142a;
    }

    public C7709p() {
        this.f40143b = null;
        this.f40144c = null;
        this.aP = -1;
    }

    public final void m37287a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40143b != null) {
            codedOutputByteBufferNano.m33518a(1, this.f40143b.intValue());
        }
        if (this.f40144c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f40144c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37288b() {
        int b = super.b();
        if (this.f40143b != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f40143b.intValue());
        }
        if (this.f40144c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f40144c);
        }
        return b;
    }

    public final /* synthetic */ i m37286a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40143b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 18:
                    if (this.f40144c == null) {
                        this.f40144c = new aa();
                    }
                    c7213a.m33552a(this.f40144c);
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

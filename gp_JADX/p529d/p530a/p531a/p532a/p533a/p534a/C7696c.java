package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7696c extends b {
    public Long f40093a;
    public Boolean f40094b;
    public Integer f40095c;
    public String f40096d;

    public C7696c() {
        this.f40093a = null;
        this.f40094b = null;
        this.f40095c = null;
        this.f40096d = null;
        this.aP = -1;
    }

    public final void m37240a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40093a != null) {
            codedOutputByteBufferNano.m33531b(1, this.f40093a.longValue());
        }
        if (this.f40094b != null) {
            codedOutputByteBufferNano.m33522a(2, this.f40094b.booleanValue());
        }
        if (this.f40095c != null) {
            codedOutputByteBufferNano.m33518a(3, this.f40095c.intValue());
        }
        if (this.f40096d != null) {
            codedOutputByteBufferNano.m33521a(4, this.f40096d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37241b() {
        int b = super.b();
        if (this.f40093a != null) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f40093a.longValue());
        }
        if (this.f40094b != null) {
            this.f40094b.booleanValue();
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if (this.f40095c != null) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f40095c.intValue());
        }
        if (this.f40096d != null) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f40096d);
        }
        return b;
    }

    public final /* synthetic */ i m37239a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40093a = Long.valueOf(c7213a.m33568j());
                    continue;
                case 16:
                    this.f40094b = Boolean.valueOf(c7213a.m33563e());
                    continue;
                case 24:
                    this.f40095c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 34:
                    this.f40096d = c7213a.m33564f();
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

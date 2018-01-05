package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aa extends b {
    public Long f39819a;
    public String f39820b;

    public aa() {
        this.f39819a = null;
        this.f39820b = null;
        this.aP = -1;
    }

    public final void m37058a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39819a != null) {
            codedOutputByteBufferNano.m33535c(1, this.f39819a.longValue());
        }
        if (this.f39820b != null) {
            codedOutputByteBufferNano.m33521a(2, this.f39820b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37059b() {
        int b = super.b();
        if (this.f39819a != null) {
            this.f39819a.longValue();
            b += CodedOutputByteBufferNano.m33501d(1) + 8;
        }
        if (this.f39820b != null) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f39820b);
        }
        return b;
    }

    public final /* synthetic */ i m37057a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f39819a = Long.valueOf(c7213a.m33570l());
                    continue;
                case 18:
                    this.f39820b = c7213a.m33564f();
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

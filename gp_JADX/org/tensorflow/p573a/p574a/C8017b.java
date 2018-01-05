package org.tensorflow.p573a.p574a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C8017b extends b {
    public int f41060a;
    public C8016a f41061b;
    public C8018c f41062c;
    public C8019d f41063d;

    public C8017b() {
        this.f41060a = -1;
        this.f41060a = -1;
        this.f41061b = null;
        this.f41060a = -1;
        this.f41062c = null;
        this.f41060a = -1;
        this.f41063d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m38262a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f41060a == 0) {
            codedOutputByteBufferNano.m33532b(1, this.f41061b);
        }
        if (this.f41060a == 1) {
            codedOutputByteBufferNano.m33532b(2, this.f41062c);
        }
        if (this.f41060a == 2) {
            codedOutputByteBufferNano.m33532b(3, this.f41063d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m38263b() {
        int b = super.b();
        if (this.f41060a == 0) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f41061b);
        }
        if (this.f41060a == 1) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f41062c);
        }
        if (this.f41060a == 2) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f41063d);
        }
        return b;
    }

    public final /* synthetic */ i m38261a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f41061b == null) {
                        this.f41061b = new C8016a();
                    }
                    c7213a.m33552a(this.f41061b);
                    this.f41060a = 0;
                    continue;
                case 18:
                    if (this.f41062c == null) {
                        this.f41062c = new C8018c();
                    }
                    c7213a.m33552a(this.f41062c);
                    this.f41060a = 1;
                    continue;
                case 26:
                    if (this.f41063d == null) {
                        this.f41063d = new C8019d();
                    }
                    c7213a.m33552a(this.f41063d);
                    this.f41060a = 2;
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

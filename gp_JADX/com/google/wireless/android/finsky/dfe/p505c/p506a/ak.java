package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ak extends b {
    public int f37082a;
    public boolean f37083b;
    public int f37084c;
    public long f37085d;

    public final ak m35102a(boolean z) {
        this.f37082a |= 1;
        this.f37083b = z;
        return this;
    }

    public final ak m35100a(int i) {
        this.f37082a |= 2;
        this.f37084c = i;
        return this;
    }

    public final ak m35101a(long j) {
        this.f37082a |= 4;
        this.f37085d = j;
        return this;
    }

    public ak() {
        this.f37082a = 0;
        this.f37083b = false;
        this.f37084c = 0;
        this.f37085d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35103a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37082a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f37083b);
        }
        if ((this.f37082a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37084c);
        }
        if ((this.f37082a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f37085d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35104b() {
        int b = super.b();
        if ((this.f37082a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f37082a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37084c);
        }
        if ((this.f37082a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(3, this.f37085d);
        }
        return b;
    }

    public final /* synthetic */ i m35099a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37083b = c7213a.m33563e();
                    this.f37082a |= 1;
                    continue;
                case 16:
                    this.f37084c = c7213a.m33567i();
                    this.f37082a |= 2;
                    continue;
                case 24:
                    this.f37085d = c7213a.m33568j();
                    this.f37082a |= 4;
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

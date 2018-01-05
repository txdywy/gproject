package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ae extends b {
    public int f38316a;
    public ah f38317b;
    public ac f38318c;
    public af f38319d;

    public final ac m35982d() {
        if (this.f38316a == 1) {
            return this.f38318c;
        }
        return null;
    }

    public final af m35983e() {
        if (this.f38316a == 2) {
            return this.f38319d;
        }
        return null;
    }

    public ae() {
        this.f38316a = -1;
        this.f38316a = -1;
        this.f38317b = null;
        this.f38316a = -1;
        this.f38318c = null;
        this.f38316a = -1;
        this.f38319d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35980a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38316a == 0) {
            codedOutputByteBufferNano.m33532b(1, this.f38317b);
        }
        if (this.f38316a == 1) {
            codedOutputByteBufferNano.m33532b(2, this.f38318c);
        }
        if (this.f38316a == 2) {
            codedOutputByteBufferNano.m33532b(3, this.f38319d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35981b() {
        int b = super.b();
        if (this.f38316a == 0) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38317b);
        }
        if (this.f38316a == 1) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38318c);
        }
        if (this.f38316a == 2) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f38319d);
        }
        return b;
    }

    public final /* synthetic */ i m35979a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38317b == null) {
                        this.f38317b = new ah();
                    }
                    c7213a.m33552a(this.f38317b);
                    this.f38316a = 0;
                    continue;
                case 18:
                    if (this.f38318c == null) {
                        this.f38318c = new ac();
                    }
                    c7213a.m33552a(this.f38318c);
                    this.f38316a = 1;
                    continue;
                case 26:
                    if (this.f38319d == null) {
                        this.f38319d = new af();
                    }
                    c7213a.m33552a(this.f38319d);
                    this.f38316a = 2;
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

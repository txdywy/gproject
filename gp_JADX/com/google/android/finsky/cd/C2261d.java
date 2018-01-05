package com.google.android.finsky.cd;

import com.google.android.finsky.cv.p177a.bd;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2261d extends C0758b {
    public int f11229a;
    public int f11230b;
    public bd f11231c;
    public String f11232d;

    public C2261d() {
        this.f11229a = -1;
        this.f11229a = -1;
        this.f11230b = 0;
        this.f11229a = -1;
        this.f11231c = null;
        this.f11229a = -1;
        this.f11232d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11229a == 0) {
            codedOutputByteBufferNano.a(1, this.f11230b);
        }
        if (this.f11229a == 1) {
            codedOutputByteBufferNano.b(2, this.f11231c);
        }
        if (this.f11229a == 2) {
            codedOutputByteBufferNano.a(3, this.f11232d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11229a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f11230b);
        }
        if (this.f11229a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f11231c);
        }
        if (this.f11229a == 2) {
            return b + CodedOutputByteBufferNano.b(3, this.f11232d);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f11230b = aVar.i();
                    this.f11229a = 0;
                    continue;
                case 18:
                    if (this.f11231c == null) {
                        this.f11231c = new bd();
                    }
                    aVar.a(this.f11231c);
                    this.f11229a = 1;
                    continue;
                case 26:
                    this.f11232d = aVar.f();
                    this.f11229a = 2;
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}

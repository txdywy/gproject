package com.google.android.finsky.scheduler.p236a.p237a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4016e extends C0758b {
    public int f20167a;
    public boolean f20168b;
    public int f20169c;
    public long f20170d;
    public String f20171e;
    public byte[] f20172f;

    public C4016e() {
        this.f20167a = -1;
        this.f20167a = -1;
        this.f20168b = false;
        this.f20167a = -1;
        this.f20169c = 0;
        this.f20167a = -1;
        this.f20170d = 0;
        this.f20167a = -1;
        this.f20171e = "";
        this.f20167a = -1;
        this.f20172f = l.l;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f20167a == 0) {
            codedOutputByteBufferNano.a(1, this.f20168b);
        }
        if (this.f20167a == 1) {
            codedOutputByteBufferNano.a(2, this.f20169c);
        }
        if (this.f20167a == 2) {
            codedOutputByteBufferNano.b(3, this.f20170d);
        }
        if (this.f20167a == 3) {
            codedOutputByteBufferNano.a(4, this.f20171e);
        }
        if (this.f20167a == 4) {
            codedOutputByteBufferNano.a(5, this.f20172f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f20167a == 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if (this.f20167a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f20169c);
        }
        if (this.f20167a == 2) {
            b += CodedOutputByteBufferNano.f(3, this.f20170d);
        }
        if (this.f20167a == 3) {
            b += CodedOutputByteBufferNano.b(4, this.f20171e);
        }
        if (this.f20167a == 4) {
            return b + CodedOutputByteBufferNano.b(5, this.f20172f);
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
                    this.f20168b = aVar.e();
                    this.f20167a = 0;
                    continue;
                case 16:
                    this.f20169c = aVar.i();
                    this.f20167a = 1;
                    continue;
                case 24:
                    this.f20170d = aVar.j();
                    this.f20167a = 2;
                    continue;
                case 34:
                    this.f20171e = aVar.f();
                    this.f20167a = 3;
                    continue;
                case 42:
                    this.f20172f = aVar.g();
                    this.f20167a = 4;
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

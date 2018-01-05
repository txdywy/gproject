package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5683t extends C0758b {
    public String f28815a;
    public String f28816b;
    public String f28817c;
    public String f28818d;
    public String f28819e;
    public C5681r f28820f;

    public C5683t() {
        this.f28815a = null;
        this.f28816b = null;
        this.f28817c = null;
        this.f28818d = null;
        this.f28819e = null;
        this.f28820f = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28815a != null) {
            codedOutputByteBufferNano.a(1, this.f28815a);
        }
        if (this.f28816b != null) {
            codedOutputByteBufferNano.a(2, this.f28816b);
        }
        if (this.f28817c != null) {
            codedOutputByteBufferNano.a(3, this.f28817c);
        }
        if (this.f28818d != null) {
            codedOutputByteBufferNano.a(4, this.f28818d);
        }
        if (this.f28819e != null) {
            codedOutputByteBufferNano.a(5, this.f28819e);
        }
        if (this.f28820f != null) {
            codedOutputByteBufferNano.b(6, this.f28820f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28815a != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28815a);
        }
        if (this.f28816b != null) {
            b += CodedOutputByteBufferNano.b(2, this.f28816b);
        }
        if (this.f28817c != null) {
            b += CodedOutputByteBufferNano.b(3, this.f28817c);
        }
        if (this.f28818d != null) {
            b += CodedOutputByteBufferNano.b(4, this.f28818d);
        }
        if (this.f28819e != null) {
            b += CodedOutputByteBufferNano.b(5, this.f28819e);
        }
        if (this.f28820f != null) {
            return b + CodedOutputByteBufferNano.d(6, this.f28820f);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28815a = aVar.f();
                    continue;
                case 18:
                    this.f28816b = aVar.f();
                    continue;
                case 26:
                    this.f28817c = aVar.f();
                    continue;
                case 34:
                    this.f28818d = aVar.f();
                    continue;
                case 42:
                    this.f28819e = aVar.f();
                    continue;
                case 50:
                    if (this.f28820f == null) {
                        this.f28820f = new C5681r();
                    }
                    aVar.a(this.f28820f);
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

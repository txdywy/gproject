package com.google.android.libraries.performance.p328a.p329a.p330a.p331a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C5936c extends C0758b {
    public C5935b[] f29585a;
    public Integer f29586b;

    public C5936c() {
        this.f29585a = C5935b.cy_();
        this.f29586b = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f29585a != null && this.f29585a.length > 0) {
            for (C0757i c0757i : this.f29585a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f29586b != null) {
            codedOutputByteBufferNano.a(2, this.f29586b.intValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f29585a != null && this.f29585a.length > 0) {
            for (C0757i c0757i : this.f29585a) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if (this.f29586b != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f29586b.intValue());
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
                    int a2 = l.a(aVar, 10);
                    a = this.f29585a == null ? 0 : this.f29585a.length;
                    Object obj = new C5935b[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29585a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C5935b();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C5935b();
                    aVar.a(obj[a]);
                    this.f29585a = obj;
                    continue;
                case 16:
                    this.f29586b = Integer.valueOf(aVar.i());
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

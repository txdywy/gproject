package com.google.android.finsky.cd;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C2262e extends C0758b {
    public int f11233a;
    public String f11234b;
    public String f11235c;
    public C2260c[] f11236d;

    public C2262e() {
        this.f11233a = 0;
        this.f11234b = "";
        this.f11235c = "";
        this.f11236d = C2260c.an_();
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11233a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11234b);
        }
        if ((this.f11233a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11235c);
        }
        if (this.f11236d != null && this.f11236d.length > 0) {
            for (C0757i c0757i : this.f11236d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11233a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11234b);
        }
        if ((this.f11233a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11235c);
        }
        if (this.f11236d == null || this.f11236d.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f11236d) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(3, c0757i);
            }
        }
        return i;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f11234b = aVar.f();
                    this.f11233a |= 1;
                    continue;
                case 18:
                    this.f11235c = aVar.f();
                    this.f11233a |= 2;
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f11236d == null ? 0 : this.f11236d.length;
                    Object obj = new C2260c[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11236d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C2260c();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C2260c();
                    aVar.a(obj[a]);
                    this.f11236d = obj;
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

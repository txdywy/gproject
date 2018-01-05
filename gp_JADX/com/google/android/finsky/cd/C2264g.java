package com.google.android.finsky.cd;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C2264g extends C0758b {
    public String[] f11244a;

    public C2264g() {
        this.f11244a = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11244a != null && this.f11244a.length > 0) {
            for (String str : this.f11244a) {
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f11244a == null || this.f11244a.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f11244a.length) {
            String str = this.f11244a[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = l.a(aVar, 10);
                    a = this.f11244a == null ? 0 : this.f11244a.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11244a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f11244a = obj;
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

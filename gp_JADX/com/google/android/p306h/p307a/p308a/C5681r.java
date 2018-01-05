package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C5681r extends C0758b {
    public String f28811a;
    public String[] f28812b;

    public C5681r() {
        this.f28811a = null;
        this.f28812b = l.j;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28811a != null) {
            codedOutputByteBufferNano.a(1, this.f28811a);
        }
        if (this.f28812b != null && this.f28812b.length > 0) {
            for (String str : this.f28812b) {
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f28811a != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28811a);
        }
        if (this.f28812b == null || this.f28812b.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f28812b.length) {
            String str = this.f28812b[i];
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
                    this.f28811a = aVar.f();
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f28812b == null ? 0 : this.f28812b.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28812b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f28812b = obj;
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

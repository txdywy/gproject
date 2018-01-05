package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0868f extends C0758b {
    public String[] f5532a;
    public String[] f5533b;

    public C0868f() {
        this.f5532a = l.j;
        this.f5533b = l.j;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5532a != null && this.f5532a.length > 0) {
            for (String str : this.f5532a) {
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if (this.f5533b != null && this.f5533b.length > 0) {
            while (i < this.f5533b.length) {
                String str2 = this.f5533b[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(2, str2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo1128b();
        if (this.f5532a == null || this.f5532a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f5532a) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f5533b == null || this.f5533b.length <= 0) {
            return i;
        }
        i2 = 0;
        i3 = 0;
        while (i4 < this.f5533b.length) {
            String str2 = this.f5533b[i4];
            if (str2 != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.b(str2);
            }
            i4++;
        }
        return (i + i2) + (i3 * 1);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = l.a(aVar, 10);
                    a = this.f5532a == null ? 0 : this.f5532a.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5532a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f5532a = obj;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f5533b == null ? 0 : this.f5533b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5533b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f5533b = obj;
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

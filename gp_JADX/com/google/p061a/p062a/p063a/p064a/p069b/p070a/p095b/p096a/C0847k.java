package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0847k extends C0758b {
    public C0846j[] f5458a;
    public C0845i[] f5459b;
    public C0861y[] f5460c;

    public C0847k() {
        this.f5458a = C0846j.m5380a();
        this.f5459b = C0845i.m5376a();
        this.f5460c = C0861y.m5436a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5458a != null && this.f5458a.length > 0) {
            for (C0757i c0757i : this.f5458a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f5459b != null && this.f5459b.length > 0) {
            for (C0757i c0757i2 : this.f5459b) {
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(2, c0757i2);
                }
            }
        }
        if (this.f5460c != null && this.f5460c.length > 0) {
            while (i < this.f5460c.length) {
                C0757i c0757i3 = this.f5460c[i];
                if (c0757i3 != null) {
                    codedOutputByteBufferNano.b(3, c0757i3);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f5458a != null && this.f5458a.length > 0) {
            i = b;
            for (C0757i c0757i : this.f5458a) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i;
        }
        if (this.f5459b != null && this.f5459b.length > 0) {
            i = b;
            for (C0757i c0757i2 : this.f5459b) {
                if (c0757i2 != null) {
                    i += CodedOutputByteBufferNano.d(2, c0757i2);
                }
            }
            b = i;
        }
        if (this.f5460c != null && this.f5460c.length > 0) {
            while (i2 < this.f5460c.length) {
                C0757i c0757i3 = this.f5460c[i2];
                if (c0757i3 != null) {
                    b += CodedOutputByteBufferNano.d(3, c0757i3);
                }
                i2++;
            }
        }
        return b;
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
                    a = this.f5458a == null ? 0 : this.f5458a.length;
                    obj = new C0846j[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5458a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0846j();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0846j();
                    aVar.a(obj[a]);
                    this.f5458a = obj;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f5459b == null ? 0 : this.f5459b.length;
                    obj = new C0845i[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5459b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0845i();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0845i();
                    aVar.a(obj[a]);
                    this.f5459b = obj;
                    continue;
                case 26:
                    a2 = l.a(aVar, 26);
                    a = this.f5460c == null ? 0 : this.f5460c.length;
                    obj = new C0861y[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5460c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0861y();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0861y();
                    aVar.a(obj[a]);
                    this.f5460c = obj;
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

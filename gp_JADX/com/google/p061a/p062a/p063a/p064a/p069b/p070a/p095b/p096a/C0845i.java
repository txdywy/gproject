package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0845i extends C0758b {
    public static volatile C0845i[] f5449a;
    public C0844h[] f5450b;
    public C0844h[] f5451c;
    public C0856t[] f5452d;
    public C0848l[] f5453e;

    public static C0845i[] m5376a() {
        if (f5449a == null) {
            synchronized (h.b) {
                if (f5449a == null) {
                    f5449a = new C0845i[0];
                }
            }
        }
        return f5449a;
    }

    public C0845i() {
        this.f5450b = C0844h.m5372a();
        this.f5451c = C0844h.m5372a();
        this.f5452d = C0856t.m5418a();
        this.f5453e = C0848l.m5387a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5450b != null && this.f5450b.length > 0) {
            for (C0757i c0757i : this.f5450b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f5451c != null && this.f5451c.length > 0) {
            for (C0757i c0757i2 : this.f5451c) {
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(2, c0757i2);
                }
            }
        }
        if (this.f5452d != null && this.f5452d.length > 0) {
            for (C0757i c0757i22 : this.f5452d) {
                if (c0757i22 != null) {
                    codedOutputByteBufferNano.b(3, c0757i22);
                }
            }
        }
        if (this.f5453e != null && this.f5453e.length > 0) {
            while (i < this.f5453e.length) {
                C0757i c0757i3 = this.f5453e[i];
                if (c0757i3 != null) {
                    codedOutputByteBufferNano.b(4, c0757i3);
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
        if (this.f5450b != null && this.f5450b.length > 0) {
            i = b;
            for (C0757i c0757i : this.f5450b) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i;
        }
        if (this.f5451c != null && this.f5451c.length > 0) {
            i = b;
            for (C0757i c0757i2 : this.f5451c) {
                if (c0757i2 != null) {
                    i += CodedOutputByteBufferNano.d(2, c0757i2);
                }
            }
            b = i;
        }
        if (this.f5452d != null && this.f5452d.length > 0) {
            i = b;
            for (C0757i c0757i22 : this.f5452d) {
                if (c0757i22 != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i22);
                }
            }
            b = i;
        }
        if (this.f5453e != null && this.f5453e.length > 0) {
            while (i2 < this.f5453e.length) {
                C0757i c0757i3 = this.f5453e[i2];
                if (c0757i3 != null) {
                    b += CodedOutputByteBufferNano.d(4, c0757i3);
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
                    a = this.f5450b == null ? 0 : this.f5450b.length;
                    obj = new C0844h[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5450b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0844h();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0844h();
                    aVar.a(obj[a]);
                    this.f5450b = obj;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f5451c == null ? 0 : this.f5451c.length;
                    obj = new C0844h[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5451c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0844h();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0844h();
                    aVar.a(obj[a]);
                    this.f5451c = obj;
                    continue;
                case 26:
                    a2 = l.a(aVar, 26);
                    a = this.f5452d == null ? 0 : this.f5452d.length;
                    obj = new C0856t[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5452d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0856t();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0856t();
                    aVar.a(obj[a]);
                    this.f5452d = obj;
                    continue;
                case 34:
                    a2 = l.a(aVar, 34);
                    a = this.f5453e == null ? 0 : this.f5453e.length;
                    obj = new C0848l[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5453e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0848l();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0848l();
                    aVar.a(obj[a]);
                    this.f5453e = obj;
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

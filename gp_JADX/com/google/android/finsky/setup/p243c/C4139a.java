package com.google.android.finsky.setup.p243c;

import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import com.google.wireless.android.a.a.a.a.ck;

public final class C4139a extends C0758b {
    public C2470a[] f20885a;
    public int[] f20886b;

    public C4139a() {
        this.f20885a = C2470a.R_();
        this.f20886b = l.e;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f20885a != null && this.f20885a.length > 0) {
            for (C0757i c0757i : this.f20885a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f20886b != null && this.f20886b.length > 0) {
            while (i < this.f20886b.length) {
                codedOutputByteBufferNano.a(2, this.f20886b[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f20885a != null && this.f20885a.length > 0) {
            i = b;
            for (C0757i c0757i : this.f20885a) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i;
        }
        if (this.f20886b == null || this.f20886b.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f20886b.length) {
            i += CodedOutputByteBufferNano.c(this.f20886b[i2]);
            i2++;
        }
        return (b + i) + (this.f20886b.length * 1);
    }

    private final C4139a m19368b(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            int length;
            int a3;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = l.a(aVar, 10);
                    length = this.f20885a == null ? 0 : this.f20885a.length;
                    Object obj = new C2470a[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f20885a, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new C2470a();
                        aVar.a(obj[length]);
                        aVar.a();
                        length++;
                    }
                    obj[length] = new C2470a();
                    aVar.a(obj[length]);
                    this.f20885a = obj;
                    continue;
                case 16:
                    a3 = l.a(aVar, 16);
                    Object obj2 = new int[a3];
                    length = 0;
                    for (a2 = 0; a2 < a3; a2++) {
                        if (a2 != 0) {
                            aVar.a();
                        }
                        int o = aVar.o();
                        try {
                            obj2[length] = ck.a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e) {
                            aVar.e(o);
                            m4918a(aVar, a);
                        }
                    }
                    if (length != 0) {
                        a2 = this.f20886b == null ? 0 : this.f20886b.length;
                        if (a2 != 0 || length != obj2.length) {
                            Object obj3 = new int[(a2 + length)];
                            if (a2 != 0) {
                                System.arraycopy(this.f20886b, 0, obj3, 0, a2);
                            }
                            System.arraycopy(obj2, 0, obj3, a2, length);
                            this.f20886b = obj3;
                            break;
                        }
                        this.f20886b = obj2;
                        break;
                    }
                    continue;
                    break;
                case 18:
                    a = aVar.c(aVar.i());
                    a2 = aVar.o();
                    length = 0;
                    while (aVar.m() > 0) {
                        try {
                            ck.a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (length != 0) {
                        aVar.e(a2);
                        if (this.f20886b == null) {
                            a2 = 0;
                        } else {
                            a2 = this.f20886b.length;
                        }
                        Object obj4 = new int[(length + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f20886b, 0, obj4, 0, a2);
                        }
                        while (aVar.m() > 0) {
                            a3 = aVar.o();
                            try {
                                obj4[a2] = ck.a(aVar.i());
                                a2++;
                            } catch (IllegalArgumentException e3) {
                                aVar.e(a3);
                                m4918a(aVar, 16);
                            }
                        }
                        this.f20886b = obj4;
                    }
                    aVar.d(a);
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

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m19368b(aVar);
    }
}

package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class kp extends C0758b {
    public int[] f12948a;

    public kp() {
        this.f12948a = l.e;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kp)) {
            return false;
        }
        kp kpVar = (kp) obj;
        if (!h.a(this.f12948a, kpVar.f12948a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kpVar.aO);
        }
        if (kpVar.aO == null || kpVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12948a)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12948a != null && this.f12948a.length > 0) {
            for (int a : this.f12948a) {
                codedOutputByteBufferNano.a(1, a);
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f12948a == null || this.f12948a.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f12948a.length) {
            i2 += CodedOutputByteBufferNano.c(this.f12948a[i]);
            i++;
        }
        return (b + i2) + (this.f12948a.length * 1);
    }

    private final kp m12974b(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a2 = l.a(aVar, 8);
                    Object obj = new int[a2];
                    i = 0;
                    for (i2 = 0; i2 < a2; i2++) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int o = aVar.o();
                        try {
                            obj[i] = jt.m12905e(aVar.i());
                            i++;
                        } catch (IllegalArgumentException e) {
                            aVar.e(o);
                            m4918a(aVar, a);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f12948a == null ? 0 : this.f12948a.length;
                        if (i2 != 0 || i != obj.length) {
                            Object obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f12948a, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f12948a = obj2;
                            break;
                        }
                        this.f12948a = obj;
                        break;
                    }
                    continue;
                    break;
                case 10:
                    a = aVar.c(aVar.i());
                    i2 = aVar.o();
                    i = 0;
                    while (aVar.m() > 0) {
                        try {
                            jt.m12905e(aVar.i());
                            i++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (i != 0) {
                        aVar.e(i2);
                        if (this.f12948a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f12948a.length;
                        }
                        Object obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f12948a, 0, obj3, 0, i2);
                        }
                        while (aVar.m() > 0) {
                            a2 = aVar.o();
                            try {
                                obj3[i2] = jt.m12905e(aVar.i());
                                i2++;
                            } catch (IllegalArgumentException e3) {
                                aVar.e(a2);
                                m4918a(aVar, 8);
                            }
                        }
                        this.f12948a = obj3;
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
        return m12974b(aVar);
    }
}

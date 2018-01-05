package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ll extends C0758b {
    public lk[] f13022a;
    public lk[] f13023b;

    public ll() {
        this.f13022a = lk.bN_();
        this.f13023b = lk.bN_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ll)) {
            return false;
        }
        ll llVar = (ll) obj;
        if (!h.a(this.f13022a, llVar.f13022a)) {
            return false;
        }
        if (!h.a(this.f13023b, llVar.f13023b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(llVar.aO);
        }
        if (llVar.aO == null || llVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f13022a)) * 31) + h.a(this.f13023b)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f13022a != null && this.f13022a.length > 0) {
            for (C0757i c0757i : this.f13022a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f13023b != null && this.f13023b.length > 0) {
            while (i < this.f13023b.length) {
                C0757i c0757i2 = this.f13023b[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(2, c0757i2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f13022a != null && this.f13022a.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f13022a) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i2;
        }
        if (this.f13023b != null && this.f13023b.length > 0) {
            while (i < this.f13023b.length) {
                C0757i c0757i2 = this.f13023b[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(2, c0757i2);
                }
                i++;
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
                    a = this.f13022a == null ? 0 : this.f13022a.length;
                    obj = new lk[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13022a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lk();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new lk();
                    aVar.a(obj[a]);
                    this.f13022a = obj;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f13023b == null ? 0 : this.f13023b.length;
                    obj = new lk[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13023b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lk();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new lk();
                    aVar.a(obj[a]);
                    this.f13023b = obj;
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

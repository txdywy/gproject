package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ib extends C0758b {
    public cv f12647a;
    public cv[] f12648b;

    public ib() {
        this.f12647a = null;
        this.f12648b = cv.aS_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        if (this.f12647a == null) {
            if (ibVar.f12647a != null) {
                return false;
            }
        } else if (!this.f12647a.equals(ibVar.f12647a)) {
            return false;
        }
        if (!h.a(this.f12648b, ibVar.f12648b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ibVar.aO);
        }
        if (ibVar.aO == null || ibVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        cv cvVar = this.f12647a;
        hashCode = ((((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f12648b)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12647a != null) {
            codedOutputByteBufferNano.b(1, this.f12647a);
        }
        if (this.f12648b != null && this.f12648b.length > 0) {
            for (C0757i c0757i : this.f12648b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12647a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12647a);
        }
        if (this.f12648b == null || this.f12648b.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f12648b) {
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
                    if (this.f12647a == null) {
                        this.f12647a = new cv();
                    }
                    aVar.a(this.f12647a);
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f12648b == null ? 0 : this.f12648b.length;
                    Object obj = new cv[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12648b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cv();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new cv();
                    aVar.a(obj[a]);
                    this.f12648b = obj;
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

package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class lt extends C0758b {
    public static volatile lt[] f13058a;
    public cv f13059b;
    public bl[] f13060c;

    public static lt[] bQ_() {
        if (f13058a == null) {
            synchronized (h.b) {
                if (f13058a == null) {
                    f13058a = new lt[0];
                }
            }
        }
        return f13058a;
    }

    public lt() {
        this.f13059b = null;
        this.f13060c = bl.aK_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lt)) {
            return false;
        }
        lt ltVar = (lt) obj;
        if (this.f13059b == null) {
            if (ltVar.f13059b != null) {
                return false;
            }
        } else if (!this.f13059b.equals(ltVar.f13059b)) {
            return false;
        }
        if (!h.a(this.f13060c, ltVar.f13060c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ltVar.aO);
        }
        if (ltVar.aO == null || ltVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        cv cvVar = this.f13059b;
        hashCode = ((((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f13060c)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13059b != null) {
            codedOutputByteBufferNano.b(1, this.f13059b);
        }
        if (this.f13060c != null && this.f13060c.length > 0) {
            for (C0757i c0757i : this.f13060c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13059b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f13059b);
        }
        if (this.f13060c == null || this.f13060c.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f13060c) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(2, c0757i);
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
                    if (this.f13059b == null) {
                        this.f13059b = new cv();
                    }
                    aVar.a(this.f13059b);
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f13060c == null ? 0 : this.f13060c.length;
                    Object obj = new bl[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13060c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bl();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bl();
                    aVar.a(obj[a]);
                    this.f13060c = obj;
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

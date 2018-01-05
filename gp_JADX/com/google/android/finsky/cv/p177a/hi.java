package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class hi extends C0758b {
    public static volatile hi[] f12559a;
    public int f12560b;
    public String f12561c;
    public String f12562d;
    public bd[] f12563e;
    public String f12564f;
    public String f12565g;

    public static hi[] bi_() {
        if (f12559a == null) {
            synchronized (h.b) {
                if (f12559a == null) {
                    f12559a = new hi[0];
                }
            }
        }
        return f12559a;
    }

    public hi() {
        this.f12560b = 0;
        this.f12561c = "";
        this.f12562d = "";
        this.f12563e = bd.aH_();
        this.f12564f = "";
        this.f12565g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hi)) {
            return false;
        }
        hi hiVar = (hi) obj;
        if ((this.f12560b & 1) != (hiVar.f12560b & 1)) {
            return false;
        }
        if (!this.f12561c.equals(hiVar.f12561c)) {
            return false;
        }
        if ((this.f12560b & 2) != (hiVar.f12560b & 2)) {
            return false;
        }
        if (!this.f12562d.equals(hiVar.f12562d)) {
            return false;
        }
        if (!h.a(this.f12563e, hiVar.f12563e)) {
            return false;
        }
        if ((this.f12560b & 4) != (hiVar.f12560b & 4)) {
            return false;
        }
        if (!this.f12564f.equals(hiVar.f12564f)) {
            return false;
        }
        if ((this.f12560b & 8) != (hiVar.f12560b & 8)) {
            return false;
        }
        if (!this.f12565g.equals(hiVar.f12565g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hiVar.aO);
        }
        if (hiVar.aO == null || hiVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12561c.hashCode()) * 31) + this.f12562d.hashCode()) * 31) + h.a(this.f12563e)) * 31) + this.f12564f.hashCode()) * 31) + this.f12565g.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12560b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12561c);
        }
        if ((this.f12560b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12562d);
        }
        if (this.f12563e != null && this.f12563e.length > 0) {
            for (C0757i c0757i : this.f12563e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if ((this.f12560b & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12564f);
        }
        if ((this.f12560b & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f12565g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12560b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12561c);
        }
        if ((this.f12560b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12562d);
        }
        if (this.f12563e != null && this.f12563e.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f12563e) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if ((this.f12560b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12564f);
        }
        if ((this.f12560b & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(5, this.f12565g);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12561c = aVar.f();
                    this.f12560b |= 1;
                    continue;
                case 18:
                    this.f12562d = aVar.f();
                    this.f12560b |= 2;
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f12563e == null ? 0 : this.f12563e.length;
                    Object obj = new bd[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12563e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bd();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bd();
                    aVar.a(obj[a]);
                    this.f12563e = obj;
                    continue;
                case 34:
                    this.f12564f = aVar.f();
                    this.f12560b |= 4;
                    continue;
                case 42:
                    this.f12565g = aVar.f();
                    this.f12560b |= 8;
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

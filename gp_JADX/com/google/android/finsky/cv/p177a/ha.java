package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ha extends C0758b {
    public int f12525a;
    public boolean f12526b;
    public long f12527c;
    public long f12528d;
    public cv[] f12529e;
    public gm[] f12530f;

    public ha() {
        this.f12525a = 0;
        this.f12526b = false;
        this.f12527c = 0;
        this.f12528d = 0;
        this.f12529e = cv.aS_();
        this.f12530f = gm.bf_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ha)) {
            return false;
        }
        ha haVar = (ha) obj;
        if ((this.f12525a & 1) != (haVar.f12525a & 1)) {
            return false;
        }
        if (this.f12526b != haVar.f12526b) {
            return false;
        }
        if ((this.f12525a & 2) != (haVar.f12525a & 2)) {
            return false;
        }
        if (this.f12527c != haVar.f12527c) {
            return false;
        }
        if ((this.f12525a & 4) != (haVar.f12525a & 4)) {
            return false;
        }
        if (this.f12528d != haVar.f12528d) {
            return false;
        }
        if (!h.a(this.f12529e, haVar.f12529e)) {
            return false;
        }
        if (!h.a(this.f12530f, haVar.f12530f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(haVar.aO);
        }
        if (haVar.aO == null || haVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f12526b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31);
        long j = this.f12527c;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12528d;
        int a = ((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + h.a(this.f12529e)) * 31) + h.a(this.f12530f)) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + a;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f12525a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12526b);
        }
        if ((this.f12525a & 2) != 0) {
            codedOutputByteBufferNano.b(2, this.f12527c);
        }
        if ((this.f12525a & 4) != 0) {
            codedOutputByteBufferNano.b(3, this.f12528d);
        }
        if (this.f12530f != null && this.f12530f.length > 0) {
            for (C0757i c0757i : this.f12530f) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        if (this.f12529e != null && this.f12529e.length > 0) {
            while (i < this.f12529e.length) {
                C0757i c0757i2 = this.f12529e[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(5, c0757i2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f12525a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f12525a & 2) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f12527c);
        }
        if ((this.f12525a & 4) != 0) {
            b += CodedOutputByteBufferNano.f(3, this.f12528d);
        }
        if (this.f12530f != null && this.f12530f.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f12530f) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(4, c0757i);
                }
            }
            b = i2;
        }
        if (this.f12529e != null && this.f12529e.length > 0) {
            while (i < this.f12529e.length) {
                C0757i c0757i2 = this.f12529e[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(5, c0757i2);
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
                case 8:
                    this.f12526b = aVar.e();
                    this.f12525a |= 1;
                    continue;
                case 16:
                    this.f12527c = aVar.j();
                    this.f12525a |= 2;
                    continue;
                case 24:
                    this.f12528d = aVar.j();
                    this.f12525a |= 4;
                    continue;
                case 34:
                    a2 = l.a(aVar, 34);
                    a = this.f12530f == null ? 0 : this.f12530f.length;
                    obj = new gm[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12530f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new gm();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new gm();
                    aVar.a(obj[a]);
                    this.f12530f = obj;
                    continue;
                case 42:
                    a2 = l.a(aVar, 42);
                    a = this.f12529e == null ? 0 : this.f12529e.length;
                    obj = new cv[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12529e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cv();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new cv();
                    aVar.a(obj[a]);
                    this.f12529e = obj;
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

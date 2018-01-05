package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class aq extends C0758b {
    public int f30865a;
    public ag f30866b;
    public int f30867c;
    public ap[] f30868d;
    public long f30869e;
    public byte[][] f30870f;
    public ai f30871g;
    public ab f30872h;
    public long f30873i;

    public aq() {
        this.f30865a = 0;
        this.f30866b = null;
        this.f30867c = -1;
        this.f30868d = ap.m28591a();
        this.f30869e = 0;
        this.f30870f = l.k;
        this.f30871g = null;
        this.f30872h = null;
        this.f30873i = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        if (this.f30866b == null) {
            if (aqVar.f30866b != null) {
                return false;
            }
        } else if (!this.f30866b.equals(aqVar.f30866b)) {
            return false;
        }
        if ((this.f30865a & 1) != (aqVar.f30865a & 1)) {
            return false;
        }
        if (this.f30867c != aqVar.f30867c) {
            return false;
        }
        if (!h.a(this.f30868d, aqVar.f30868d)) {
            return false;
        }
        if ((this.f30865a & 2) != (aqVar.f30865a & 2)) {
            return false;
        }
        if (this.f30869e != aqVar.f30869e) {
            return false;
        }
        if (!h.a(this.f30870f, aqVar.f30870f)) {
            return false;
        }
        if (this.f30871g == null) {
            if (aqVar.f30871g != null) {
                return false;
            }
        } else if (!this.f30871g.equals(aqVar.f30871g)) {
            return false;
        }
        if (this.f30872h == null) {
            if (aqVar.f30872h != null) {
                return false;
            }
        } else if (!this.f30872h.equals(aqVar.f30872h)) {
            return false;
        }
        if ((this.f30865a & 4) != (aqVar.f30865a & 4)) {
            return false;
        }
        if (this.f30873i != aqVar.f30873i) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(aqVar.aO);
        }
        if (aqVar.aO == null || aqVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        ag agVar = this.f30866b;
        hashCode = (((((agVar == null ? 0 : agVar.hashCode()) + (hashCode * 31)) * 31) + this.f30867c) * 31) + h.a(this.f30868d);
        long j = this.f30869e;
        hashCode = (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + h.a(this.f30870f);
        ai aiVar = this.f30871g;
        hashCode = (aiVar == null ? 0 : aiVar.hashCode()) + (hashCode * 31);
        ab abVar = this.f30872h;
        hashCode = (abVar == null ? 0 : abVar.hashCode()) + (hashCode * 31);
        j = this.f30873i;
        hashCode = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f30866b != null) {
            codedOutputByteBufferNano.b(1, this.f30866b);
        }
        if ((this.f30865a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f30867c);
        }
        if (this.f30868d != null && this.f30868d.length > 0) {
            for (C0757i c0757i : this.f30868d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if ((this.f30865a & 2) != 0) {
            codedOutputByteBufferNano.b(4, this.f30869e);
        }
        if (this.f30870f != null && this.f30870f.length > 0) {
            while (i < this.f30870f.length) {
                byte[] bArr = this.f30870f[i];
                if (bArr != null) {
                    codedOutputByteBufferNano.a(5, bArr);
                }
                i++;
            }
        }
        if (this.f30871g != null) {
            codedOutputByteBufferNano.b(11, this.f30871g);
        }
        if (this.f30872h != null) {
            codedOutputByteBufferNano.b(12, this.f30872h);
        }
        if ((this.f30865a & 4) != 0) {
            codedOutputByteBufferNano.d(13, this.f30873i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f30866b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f30866b);
        }
        if ((this.f30865a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f30867c);
        }
        if (this.f30868d != null && this.f30868d.length > 0) {
            i = b;
            for (C0757i c0757i : this.f30868d) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if ((this.f30865a & 2) != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f30869e);
        }
        if (this.f30870f != null && this.f30870f.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f30870f.length) {
                byte[] bArr = this.f30870f[i2];
                if (bArr != null) {
                    i3++;
                    i += CodedOutputByteBufferNano.b(bArr);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f30871g != null) {
            b += CodedOutputByteBufferNano.d(11, this.f30871g);
        }
        if (this.f30872h != null) {
            b += CodedOutputByteBufferNano.d(12, this.f30872h);
        }
        if ((this.f30865a & 4) != 0) {
            return b + CodedOutputByteBufferNano.g(13, this.f30873i);
        }
        return b;
    }

    private final aq m28597b(a aVar) {
        while (true) {
            int a = aVar.a();
            int o;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30866b == null) {
                        this.f30866b = new ag();
                    }
                    aVar.a(this.f30866b);
                    continue;
                case 16:
                    this.f30865a |= 1;
                    o = aVar.o();
                    try {
                        this.f30867c = C6207r.m28661a(aVar.i());
                        this.f30865a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 26:
                    o = l.a(aVar, 26);
                    a = this.f30868d == null ? 0 : this.f30868d.length;
                    obj = new ap[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30868d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ap();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ap();
                    aVar.a(obj[a]);
                    this.f30868d = obj;
                    continue;
                case 32:
                    this.f30869e = aVar.j();
                    this.f30865a |= 2;
                    continue;
                case 42:
                    o = l.a(aVar, 42);
                    a = this.f30870f == null ? 0 : this.f30870f.length;
                    obj = new byte[(o + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f30870f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.g();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.g();
                    this.f30870f = obj;
                    continue;
                case 90:
                    if (this.f30871g == null) {
                        this.f30871g = new ai();
                    }
                    aVar.a(this.f30871g);
                    continue;
                case 98:
                    if (this.f30872h == null) {
                        this.f30872h = new ab();
                    }
                    aVar.a(this.f30872h);
                    continue;
                case 104:
                    long j = aVar.j();
                    this.f30873i = (-(j & 1)) ^ (j >>> 1);
                    this.f30865a |= 4;
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
        return m28597b(aVar);
    }
}

package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C2444q extends C0758b {
    public int f13193a;
    public String[] f13194b;
    public String f13195c;
    public eu f13196d;
    public String f13197e;
    public String f13198f;
    public bd f13199g;

    public C2444q() {
        this.f13193a = 0;
        this.f13194b = l.j;
        this.f13195c = "";
        this.f13196d = null;
        this.f13197e = "";
        this.f13198f = "";
        this.f13199g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2444q)) {
            return false;
        }
        C2444q c2444q = (C2444q) obj;
        if (!h.a(this.f13194b, c2444q.f13194b)) {
            return false;
        }
        if ((this.f13193a & 1) != (c2444q.f13193a & 1)) {
            return false;
        }
        if (!this.f13195c.equals(c2444q.f13195c)) {
            return false;
        }
        if (this.f13196d == null) {
            if (c2444q.f13196d != null) {
                return false;
            }
        } else if (!this.f13196d.equals(c2444q.f13196d)) {
            return false;
        }
        if ((this.f13193a & 2) != (c2444q.f13193a & 2)) {
            return false;
        }
        if (!this.f13197e.equals(c2444q.f13197e)) {
            return false;
        }
        if ((this.f13193a & 4) != (c2444q.f13193a & 4)) {
            return false;
        }
        if (!this.f13198f.equals(c2444q.f13198f)) {
            return false;
        }
        if (this.f13199g == null) {
            if (c2444q.f13199g != null) {
                return false;
            }
        } else if (!this.f13199g.equals(c2444q.f13199g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2444q.aO);
        }
        if (c2444q.aO == null || c2444q.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f13194b)) * 31) + this.f13195c.hashCode();
        eu euVar = this.f13196d;
        hashCode = (((((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31) + this.f13197e.hashCode()) * 31) + this.f13198f.hashCode();
        bd bdVar = this.f13199g;
        hashCode = ((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13194b != null && this.f13194b.length > 0) {
            for (String str : this.f13194b) {
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if ((this.f13193a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f13195c);
        }
        if (this.f13196d != null) {
            codedOutputByteBufferNano.b(3, this.f13196d);
        }
        if ((this.f13193a & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f13197e);
        }
        if ((this.f13193a & 4) != 0) {
            codedOutputByteBufferNano.a(5, this.f13198f);
        }
        if (this.f13199g != null) {
            codedOutputByteBufferNano.b(6, this.f13199g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f13194b == null || this.f13194b.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f13194b.length) {
                String str = this.f13194b[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if ((this.f13193a & 1) != 0) {
            i += CodedOutputByteBufferNano.b(2, this.f13195c);
        }
        if (this.f13196d != null) {
            i += CodedOutputByteBufferNano.d(3, this.f13196d);
        }
        if ((this.f13193a & 2) != 0) {
            i += CodedOutputByteBufferNano.b(4, this.f13197e);
        }
        if ((this.f13193a & 4) != 0) {
            i += CodedOutputByteBufferNano.b(5, this.f13198f);
        }
        if (this.f13199g != null) {
            return i + CodedOutputByteBufferNano.d(6, this.f13199g);
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
                    int a2 = l.a(aVar, 10);
                    a = this.f13194b == null ? 0 : this.f13194b.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13194b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f13194b = obj;
                    continue;
                case 18:
                    this.f13195c = aVar.f();
                    this.f13193a |= 1;
                    continue;
                case 26:
                    if (this.f13196d == null) {
                        this.f13196d = new eu();
                    }
                    aVar.a(this.f13196d);
                    continue;
                case 34:
                    this.f13197e = aVar.f();
                    this.f13193a |= 2;
                    continue;
                case 42:
                    this.f13198f = aVar.f();
                    this.f13193a |= 4;
                    continue;
                case 50:
                    if (this.f13199g == null) {
                        this.f13199g = new bd();
                    }
                    aVar.a(this.f13199g);
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

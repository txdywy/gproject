package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ac extends C0758b {
    public static volatile ac[] f11754a;
    public int f11755b;
    public String f11756c;
    public String f11757d;
    public bd[] f11758e;
    public bd f11759f;
    public String f11760g;
    public String f11761h;
    public String f11762i;
    public int[] f11763j;

    public static ac[] aA_() {
        if (f11754a == null) {
            synchronized (h.b) {
                if (f11754a == null) {
                    f11754a = new ac[0];
                }
            }
        }
        return f11754a;
    }

    public ac() {
        this.f11755b = 0;
        this.f11756c = "";
        this.f11757d = "";
        this.f11758e = bd.aH_();
        this.f11759f = null;
        this.f11760g = "";
        this.f11761h = "";
        this.f11762i = "";
        this.f11763j = l.e;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        if ((this.f11755b & 1) != (acVar.f11755b & 1)) {
            return false;
        }
        if (!this.f11756c.equals(acVar.f11756c)) {
            return false;
        }
        if ((this.f11755b & 2) != (acVar.f11755b & 2)) {
            return false;
        }
        if (!this.f11757d.equals(acVar.f11757d)) {
            return false;
        }
        if (!h.a(this.f11758e, acVar.f11758e)) {
            return false;
        }
        if (this.f11759f == null) {
            if (acVar.f11759f != null) {
                return false;
            }
        } else if (!this.f11759f.equals(acVar.f11759f)) {
            return false;
        }
        if ((this.f11755b & 4) != (acVar.f11755b & 4)) {
            return false;
        }
        if (!this.f11760g.equals(acVar.f11760g)) {
            return false;
        }
        if ((this.f11755b & 8) != (acVar.f11755b & 8)) {
            return false;
        }
        if (!this.f11761h.equals(acVar.f11761h)) {
            return false;
        }
        if ((this.f11755b & 16) != (acVar.f11755b & 16)) {
            return false;
        }
        if (!this.f11762i.equals(acVar.f11762i)) {
            return false;
        }
        if (!h.a(this.f11763j, acVar.f11763j)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(acVar.aO);
        }
        if (acVar.aO == null || acVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f11756c.hashCode()) * 31) + this.f11757d.hashCode()) * 31) + h.a(this.f11758e);
        bd bdVar = this.f11759f;
        hashCode = ((((((((((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f11760g.hashCode()) * 31) + this.f11761h.hashCode()) * 31) + this.f11762i.hashCode()) * 31) + h.a(this.f11763j)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f11755b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11756c);
        }
        if (this.f11758e != null && this.f11758e.length > 0) {
            for (C0757i c0757i : this.f11758e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if ((this.f11755b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11760g);
        }
        if ((this.f11755b & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f11757d);
        }
        if ((this.f11755b & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f11761h);
        }
        if (this.f11759f != null) {
            codedOutputByteBufferNano.b(6, this.f11759f);
        }
        if ((this.f11755b & 16) != 0) {
            codedOutputByteBufferNano.a(8, this.f11762i);
        }
        if (this.f11763j != null && this.f11763j.length > 0) {
            while (i < this.f11763j.length) {
                codedOutputByteBufferNano.a(9, this.f11763j[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if ((this.f11755b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11756c);
        }
        if (this.f11758e != null && this.f11758e.length > 0) {
            i = b;
            for (C0757i c0757i : this.f11758e) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i;
        }
        if ((this.f11755b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f11760g);
        }
        if ((this.f11755b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f11757d);
        }
        if ((this.f11755b & 8) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f11761h);
        }
        if (this.f11759f != null) {
            b += CodedOutputByteBufferNano.d(6, this.f11759f);
        }
        if ((this.f11755b & 16) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f11762i);
        }
        if (this.f11763j == null || this.f11763j.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f11763j.length) {
            i += CodedOutputByteBufferNano.c(this.f11763j[i2]);
            i2++;
        }
        return (b + i) + (this.f11763j.length * 1);
    }

    private final ac m12166b(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            int length;
            int a3;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f11756c = aVar.f();
                    this.f11755b |= 1;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    length = this.f11758e == null ? 0 : this.f11758e.length;
                    Object obj = new bd[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f11758e, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new bd();
                        aVar.a(obj[length]);
                        aVar.a();
                        length++;
                    }
                    obj[length] = new bd();
                    aVar.a(obj[length]);
                    this.f11758e = obj;
                    continue;
                case 26:
                    this.f11760g = aVar.f();
                    this.f11755b |= 4;
                    continue;
                case 34:
                    this.f11757d = aVar.f();
                    this.f11755b |= 2;
                    continue;
                case 42:
                    this.f11761h = aVar.f();
                    this.f11755b |= 8;
                    continue;
                case 50:
                    if (this.f11759f == null) {
                        this.f11759f = new bd();
                    }
                    aVar.a(this.f11759f);
                    continue;
                case 66:
                    this.f11762i = aVar.f();
                    this.f11755b |= 16;
                    continue;
                case 72:
                    a3 = l.a(aVar, 72);
                    Object obj2 = new int[a3];
                    length = 0;
                    for (a2 = 0; a2 < a3; a2++) {
                        if (a2 != 0) {
                            aVar.a();
                        }
                        int o = aVar.o();
                        try {
                            obj2[length] = ae.m12173a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e) {
                            aVar.e(o);
                            m4918a(aVar, a);
                        }
                    }
                    if (length != 0) {
                        a2 = this.f11763j == null ? 0 : this.f11763j.length;
                        if (a2 != 0 || length != obj2.length) {
                            Object obj3 = new int[(a2 + length)];
                            if (a2 != 0) {
                                System.arraycopy(this.f11763j, 0, obj3, 0, a2);
                            }
                            System.arraycopy(obj2, 0, obj3, a2, length);
                            this.f11763j = obj3;
                            break;
                        }
                        this.f11763j = obj2;
                        break;
                    }
                    continue;
                case 74:
                    a = aVar.c(aVar.i());
                    a2 = aVar.o();
                    length = 0;
                    while (aVar.m() > 0) {
                        try {
                            ae.m12173a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (length != 0) {
                        aVar.e(a2);
                        if (this.f11763j == null) {
                            a2 = 0;
                        } else {
                            a2 = this.f11763j.length;
                        }
                        Object obj4 = new int[(length + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f11763j, 0, obj4, 0, a2);
                        }
                        while (aVar.m() > 0) {
                            a3 = aVar.o();
                            try {
                                obj4[a2] = ae.m12173a(aVar.i());
                                a2++;
                            } catch (IllegalArgumentException e3) {
                                aVar.e(a3);
                                m4918a(aVar, 72);
                            }
                        }
                        this.f11763j = obj4;
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
        return m12166b(aVar);
    }
}

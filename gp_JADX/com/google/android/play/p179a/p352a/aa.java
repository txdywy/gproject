package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class aa extends C0758b {
    public static volatile aa[] f30725a;
    public int f30726b;
    public long f30727c;
    public int[] f30728d;
    public int[] f30729e;
    public int f30730f;
    public int f30731g;
    public int f30732h;
    public int f30733i;
    public int f30734j;

    private static int m28528a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum FlushReason");
        }
    }

    private static int m28529b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum Exception");
        }
    }

    public static aa[] cI_() {
        if (f30725a == null) {
            synchronized (h.b) {
                if (f30725a == null) {
                    f30725a = new aa[0];
                }
            }
        }
        return f30725a;
    }

    public aa() {
        m28534c();
    }

    public final aa m28534c() {
        this.f30726b = 0;
        this.f30727c = 0;
        this.f30728d = l.e;
        this.f30729e = l.e;
        this.f30730f = 0;
        this.f30731g = 0;
        this.f30732h = 0;
        this.f30733i = 0;
        this.f30734j = 0;
        this.aO = null;
        this.aP = -1;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        if ((this.f30726b & 1) != (aaVar.f30726b & 1)) {
            return false;
        }
        if (this.f30727c != aaVar.f30727c) {
            return false;
        }
        if (!h.a(this.f30728d, aaVar.f30728d)) {
            return false;
        }
        if (!h.a(this.f30729e, aaVar.f30729e)) {
            return false;
        }
        if ((this.f30726b & 2) != (aaVar.f30726b & 2)) {
            return false;
        }
        if (this.f30730f != aaVar.f30730f) {
            return false;
        }
        if ((this.f30726b & 4) != (aaVar.f30726b & 4)) {
            return false;
        }
        if (this.f30731g != aaVar.f30731g) {
            return false;
        }
        if ((this.f30726b & 8) != (aaVar.f30726b & 8)) {
            return false;
        }
        if (this.f30732h != aaVar.f30732h) {
            return false;
        }
        if ((this.f30726b & 16) != (aaVar.f30726b & 16)) {
            return false;
        }
        if (this.f30733i != aaVar.f30733i) {
            return false;
        }
        if ((this.f30726b & 32) != (aaVar.f30726b & 32)) {
            return false;
        }
        if (this.f30734j != aaVar.f30734j) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(aaVar.aO);
        }
        if (aaVar.aO == null || aaVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f30727c;
        int a = ((((((((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + h.a(this.f30728d)) * 31) + h.a(this.f30729e)) * 31) + this.f30730f) * 31) + this.f30731g) * 31) + this.f30732h) * 31) + this.f30733i) * 31) + this.f30734j) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + a;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f30726b & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f30727c);
        }
        if (this.f30728d != null && this.f30728d.length > 0) {
            for (int a : this.f30728d) {
                codedOutputByteBufferNano.a(2, a);
            }
        }
        if (this.f30729e != null && this.f30729e.length > 0) {
            while (i < this.f30729e.length) {
                codedOutputByteBufferNano.a(3, this.f30729e[i]);
                i++;
            }
        }
        if ((this.f30726b & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f30730f);
        }
        if ((this.f30726b & 4) != 0) {
            codedOutputByteBufferNano.a(5, this.f30731g);
        }
        if ((this.f30726b & 8) != 0) {
            codedOutputByteBufferNano.a(6, this.f30732h);
        }
        if ((this.f30726b & 16) != 0) {
            codedOutputByteBufferNano.a(7, this.f30733i);
        }
        if ((this.f30726b & 32) != 0) {
            codedOutputByteBufferNano.a(8, this.f30734j);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if ((this.f30726b & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f30727c);
        }
        if (this.f30728d != null && this.f30728d.length > 0) {
            int i3 = 0;
            for (int c : this.f30728d) {
                i3 += CodedOutputByteBufferNano.c(c);
            }
            b = (b + i3) + (this.f30728d.length * 1);
        }
        if (this.f30729e != null && this.f30729e.length > 0) {
            i = 0;
            while (i2 < this.f30729e.length) {
                i += CodedOutputByteBufferNano.c(this.f30729e[i2]);
                i2++;
            }
            b = (b + i) + (this.f30729e.length * 1);
        }
        if ((this.f30726b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f30730f);
        }
        if ((this.f30726b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f30731g);
        }
        if ((this.f30726b & 8) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f30732h);
        }
        if ((this.f30726b & 16) != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f30733i);
        }
        if ((this.f30726b & 32) != 0) {
            return b + CodedOutputByteBufferNano.d(8, this.f30734j);
        }
        return b;
    }

    private final aa m28530b(a aVar) {
        int a;
        int i;
        int o;
        while (true) {
            int a2 = aVar.a();
            Object obj;
            int i2;
            Object obj2;
            Object obj3;
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.f30727c = aVar.j();
                    this.f30726b |= 1;
                    continue;
                case 16:
                    a = l.a(aVar, 16);
                    obj = new int[a];
                    i = 0;
                    for (i2 = 0; i2 < a; i2++) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        o = aVar.o();
                        try {
                            obj[i] = aa.m28528a(aVar.i());
                            i++;
                        } catch (IllegalArgumentException e) {
                            aVar.e(o);
                            m4918a(aVar, a2);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f30728d == null ? 0 : this.f30728d.length;
                        if (i2 != 0 || i != obj.length) {
                            obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f30728d, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f30728d = obj2;
                            break;
                        }
                        this.f30728d = obj;
                        break;
                    }
                    continue;
                case 18:
                    a2 = aVar.c(aVar.i());
                    i2 = aVar.o();
                    i = 0;
                    while (aVar.m() > 0) {
                        try {
                            aa.m28528a(aVar.i());
                            i++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (i != 0) {
                        aVar.e(i2);
                        if (this.f30728d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f30728d.length;
                        }
                        obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f30728d, 0, obj3, 0, i2);
                        }
                        while (aVar.m() > 0) {
                            a = aVar.o();
                            try {
                                obj3[i2] = aa.m28528a(aVar.i());
                                i2++;
                            } catch (IllegalArgumentException e3) {
                                aVar.e(a);
                                m4918a(aVar, 16);
                            }
                        }
                        this.f30728d = obj3;
                    }
                    aVar.d(a2);
                    continue;
                case 24:
                    a = l.a(aVar, 24);
                    obj = new int[a];
                    i = 0;
                    for (i2 = 0; i2 < a; i2++) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        o = aVar.o();
                        try {
                            obj[i] = aa.m28529b(aVar.i());
                            i++;
                        } catch (IllegalArgumentException e4) {
                            aVar.e(o);
                            m4918a(aVar, a2);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f30729e == null ? 0 : this.f30729e.length;
                        if (i2 != 0 || i != obj.length) {
                            obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f30729e, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f30729e = obj2;
                            break;
                        }
                        this.f30729e = obj;
                        break;
                    }
                    continue;
                case 26:
                    a2 = aVar.c(aVar.i());
                    i2 = aVar.o();
                    i = 0;
                    while (aVar.m() > 0) {
                        try {
                            aa.m28529b(aVar.i());
                            i++;
                        } catch (IllegalArgumentException e5) {
                        }
                    }
                    if (i != 0) {
                        aVar.e(i2);
                        if (this.f30729e == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f30729e.length;
                        }
                        obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f30729e, 0, obj3, 0, i2);
                        }
                        while (aVar.m() > 0) {
                            a = aVar.o();
                            try {
                                obj3[i2] = aa.m28529b(aVar.i());
                                i2++;
                            } catch (IllegalArgumentException e6) {
                                aVar.e(a);
                                m4918a(aVar, 24);
                            }
                        }
                        this.f30729e = obj3;
                    }
                    aVar.d(a2);
                    continue;
                case 32:
                    this.f30730f = aVar.i();
                    this.f30726b |= 2;
                    continue;
                case 40:
                    this.f30731g = aVar.i();
                    this.f30726b |= 4;
                    continue;
                case 48:
                    this.f30732h = aVar.i();
                    this.f30726b |= 8;
                    continue;
                case 56:
                    this.f30733i = aVar.i();
                    this.f30726b |= 16;
                    continue;
                case 64:
                    this.f30726b |= 32;
                    i = aVar.o();
                    try {
                        this.f30734j = C6215z.m28692a(aVar.i());
                        this.f30726b |= 32;
                        continue;
                    } catch (IllegalArgumentException e7) {
                        aVar.e(i);
                        m4918a(aVar, a2);
                        break;
                    }
                default:
                    if (!super.m4918a(aVar, a2)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28530b(aVar);
    }
}

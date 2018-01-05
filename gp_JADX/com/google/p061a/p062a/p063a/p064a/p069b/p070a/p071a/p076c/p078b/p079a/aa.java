package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0801c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.HprofParser;

public final class aa extends C0758b {
    public C0811h f4829a;
    public String f4830b;
    public ad f4831c;
    public String f4832d;
    public int f4833e;
    public ad f4834f;
    public String f4835g;
    public String f4836h;
    public int f4837i;
    public int f4838j;
    public int f4839k;
    public int f4840l;
    public C0804a f4841m;
    public ab f4842n;
    public int[] f4843o;
    public C0801c f4844p;

    private static int m4976a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum RelativeReference");
        }
    }

    public aa() {
        this.f4829a = null;
        this.f4830b = "";
        this.f4831c = null;
        this.f4832d = "";
        this.f4833e = 0;
        this.f4834f = null;
        this.f4835g = "";
        this.f4836h = "";
        this.f4837i = 0;
        this.f4838j = 0;
        this.f4839k = 0;
        this.f4840l = 0;
        this.f4841m = null;
        this.f4842n = null;
        this.f4843o = l.e;
        this.f4844p = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4832d == null || this.f4832d.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f4832d);
        }
        if (this.f4833e != 0) {
            codedOutputByteBufferNano.a(3, this.f4833e);
        }
        if (this.f4837i != 0) {
            codedOutputByteBufferNano.a(4, this.f4837i);
        }
        if (this.f4838j != 0) {
            codedOutputByteBufferNano.a(5, this.f4838j);
        }
        if (this.f4839k != 0) {
            codedOutputByteBufferNano.a(6, this.f4839k);
        }
        if (this.f4840l != 0) {
            codedOutputByteBufferNano.a(7, this.f4840l);
        }
        if (!(this.f4830b == null || this.f4830b.equals(""))) {
            codedOutputByteBufferNano.a(8, this.f4830b);
        }
        if (this.f4831c != null) {
            codedOutputByteBufferNano.b(9, this.f4831c);
        }
        if (this.f4843o != null && this.f4843o.length > 0) {
            for (int a : this.f4843o) {
                codedOutputByteBufferNano.a(10, a);
            }
        }
        if (this.f4834f != null) {
            codedOutputByteBufferNano.b(11, this.f4834f);
        }
        if (!(this.f4835g == null || this.f4835g.equals(""))) {
            codedOutputByteBufferNano.a(12, this.f4835g);
        }
        if (!(this.f4836h == null || this.f4836h.equals(""))) {
            codedOutputByteBufferNano.a(13, this.f4836h);
        }
        if (this.f4841m != null) {
            codedOutputByteBufferNano.b(14, this.f4841m);
        }
        if (this.f4842n != null) {
            codedOutputByteBufferNano.b(15, this.f4842n);
        }
        if (this.f4844p != null) {
            codedOutputByteBufferNano.b(16, this.f4844p);
        }
        if (this.f4829a != null) {
            codedOutputByteBufferNano.b(17, this.f4829a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (!(this.f4832d == null || this.f4832d.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f4832d);
        }
        if (this.f4833e != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f4833e);
        }
        if (this.f4837i != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f4837i);
        }
        if (this.f4838j != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f4838j);
        }
        if (this.f4839k != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f4839k);
        }
        if (this.f4840l != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f4840l);
        }
        if (!(this.f4830b == null || this.f4830b.equals(""))) {
            b += CodedOutputByteBufferNano.b(8, this.f4830b);
        }
        if (this.f4831c != null) {
            b += CodedOutputByteBufferNano.d(9, this.f4831c);
        }
        if (this.f4843o != null && this.f4843o.length > 0) {
            int i2 = 0;
            while (i < this.f4843o.length) {
                i2 += CodedOutputByteBufferNano.c(this.f4843o[i]);
                i++;
            }
            b = (b + i2) + (this.f4843o.length * 1);
        }
        if (this.f4834f != null) {
            b += CodedOutputByteBufferNano.d(11, this.f4834f);
        }
        if (!(this.f4835g == null || this.f4835g.equals(""))) {
            b += CodedOutputByteBufferNano.b(12, this.f4835g);
        }
        if (!(this.f4836h == null || this.f4836h.equals(""))) {
            b += CodedOutputByteBufferNano.b(13, this.f4836h);
        }
        if (this.f4841m != null) {
            b += CodedOutputByteBufferNano.d(14, this.f4841m);
        }
        if (this.f4842n != null) {
            b += CodedOutputByteBufferNano.d(15, this.f4842n);
        }
        if (this.f4844p != null) {
            b += CodedOutputByteBufferNano.d(16, this.f4844p);
        }
        if (this.f4829a != null) {
            return b + CodedOutputByteBufferNano.d(17, this.f4829a);
        }
        return b;
    }

    private final aa m4977b(a aVar) {
        int a;
        while (true) {
            int a2 = aVar.a();
            int i;
            int i2;
            switch (a2) {
                case 0:
                    break;
                case 18:
                    this.f4832d = aVar.f();
                    continue;
                case 24:
                    this.f4833e = aVar.i();
                    continue;
                case 32:
                    this.f4837i = aVar.i();
                    continue;
                case 40:
                    this.f4838j = aVar.i();
                    continue;
                case 48:
                    this.f4839k = aVar.i();
                    continue;
                case 56:
                    this.f4840l = aVar.i();
                    continue;
                case 66:
                    this.f4830b = aVar.f();
                    continue;
                case 74:
                    if (this.f4831c == null) {
                        this.f4831c = new ad();
                    }
                    aVar.a(this.f4831c);
                    continue;
                case 80:
                    a = l.a(aVar, 80);
                    Object obj = new int[a];
                    i = 0;
                    for (i2 = 0; i2 < a; i2++) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int o = aVar.o();
                        try {
                            obj[i] = aa.m4976a(aVar.i());
                            i++;
                        } catch (IllegalArgumentException e) {
                            aVar.e(o);
                            m4918a(aVar, a2);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f4843o == null ? 0 : this.f4843o.length;
                        if (i2 != 0 || i != obj.length) {
                            Object obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f4843o, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f4843o = obj2;
                            break;
                        }
                        this.f4843o = obj;
                        break;
                    }
                    continue;
                case 82:
                    a2 = aVar.c(aVar.i());
                    i2 = aVar.o();
                    i = 0;
                    while (aVar.m() > 0) {
                        try {
                            aa.m4976a(aVar.i());
                            i++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (i != 0) {
                        aVar.e(i2);
                        if (this.f4843o == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f4843o.length;
                        }
                        Object obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f4843o, 0, obj3, 0, i2);
                        }
                        while (aVar.m() > 0) {
                            a = aVar.o();
                            try {
                                obj3[i2] = aa.m4976a(aVar.i());
                                i2++;
                            } catch (IllegalArgumentException e3) {
                                aVar.e(a);
                                m4918a(aVar, 80);
                            }
                        }
                        this.f4843o = obj3;
                    }
                    aVar.d(a2);
                    continue;
                case 90:
                    if (this.f4834f == null) {
                        this.f4834f = new ad();
                    }
                    aVar.a(this.f4834f);
                    continue;
                case 98:
                    this.f4835g = aVar.f();
                    continue;
                case 106:
                    this.f4836h = aVar.f();
                    continue;
                case 114:
                    if (this.f4841m == null) {
                        this.f4841m = new C0804a();
                    }
                    aVar.a(this.f4841m);
                    continue;
                case 122:
                    if (this.f4842n == null) {
                        this.f4842n = new ab();
                    }
                    aVar.a(this.f4842n);
                    continue;
                case 130:
                    if (this.f4844p == null) {
                        this.f4844p = new C0801c();
                    }
                    aVar.a(this.f4844p);
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    if (this.f4829a == null) {
                        this.f4829a = new C0811h();
                    }
                    aVar.a(this.f4829a);
                    continue;
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
        return m4977b(aVar);
    }
}

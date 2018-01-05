package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0799a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.al;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class ah extends C0758b {
    public C0811h f4880a;
    public int f4881b;
    public byte[] f4882c;
    public String f4883d;
    public al f4884e;
    public al f4885f;
    public String f4886g;
    public C0799a f4887h;
    public al[] f4888i;
    public ag f4889j;

    public ah() {
        this.f4880a = null;
        this.f4881b = 0;
        this.f4882c = l.l;
        this.f4883d = "";
        this.f4884e = null;
        this.f4885f = null;
        this.f4886g = "";
        this.f4887h = null;
        this.f4888i = al.m5297a();
        this.f4889j = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4881b != 0) {
            codedOutputByteBufferNano.a(2, this.f4881b);
        }
        if (!Arrays.equals(this.f4882c, l.l)) {
            codedOutputByteBufferNano.a(4, this.f4882c);
        }
        if (this.f4884e != null) {
            codedOutputByteBufferNano.b(5, this.f4884e);
        }
        if (this.f4885f != null) {
            codedOutputByteBufferNano.b(6, this.f4885f);
        }
        if (!(this.f4886g == null || this.f4886g.equals(""))) {
            codedOutputByteBufferNano.a(7, this.f4886g);
        }
        if (this.f4887h != null) {
            codedOutputByteBufferNano.b(8, this.f4887h);
        }
        if (!(this.f4883d == null || this.f4883d.equals(""))) {
            codedOutputByteBufferNano.a(10, this.f4883d);
        }
        if (this.f4880a != null) {
            codedOutputByteBufferNano.b(11, this.f4880a);
        }
        if (this.f4889j != null) {
            codedOutputByteBufferNano.b(12, this.f4889j);
        }
        if (this.f4888i != null && this.f4888i.length > 0) {
            for (C0757i c0757i : this.f4888i) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(13, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4881b != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f4881b);
        }
        if (!Arrays.equals(this.f4882c, l.l)) {
            b += CodedOutputByteBufferNano.b(4, this.f4882c);
        }
        if (this.f4884e != null) {
            b += CodedOutputByteBufferNano.d(5, this.f4884e);
        }
        if (this.f4885f != null) {
            b += CodedOutputByteBufferNano.d(6, this.f4885f);
        }
        if (!(this.f4886g == null || this.f4886g.equals(""))) {
            b += CodedOutputByteBufferNano.b(7, this.f4886g);
        }
        if (this.f4887h != null) {
            b += CodedOutputByteBufferNano.d(8, this.f4887h);
        }
        if (!(this.f4883d == null || this.f4883d.equals(""))) {
            b += CodedOutputByteBufferNano.b(10, this.f4883d);
        }
        if (this.f4880a != null) {
            b += CodedOutputByteBufferNano.d(11, this.f4880a);
        }
        if (this.f4889j != null) {
            b += CodedOutputByteBufferNano.d(12, this.f4889j);
        }
        if (this.f4888i == null || this.f4888i.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f4888i) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(13, c0757i);
            }
        }
        return i;
    }

    private final ah m5000b(a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    o = aVar.o();
                    try {
                        this.f4881b = af.m4996a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 34:
                    this.f4882c = aVar.g();
                    continue;
                case 42:
                    if (this.f4884e == null) {
                        this.f4884e = new al();
                    }
                    aVar.a(this.f4884e);
                    continue;
                case 50:
                    if (this.f4885f == null) {
                        this.f4885f = new al();
                    }
                    aVar.a(this.f4885f);
                    continue;
                case 58:
                    this.f4886g = aVar.f();
                    continue;
                case 66:
                    if (this.f4887h == null) {
                        this.f4887h = new C0799a();
                    }
                    aVar.a(this.f4887h);
                    continue;
                case 82:
                    this.f4883d = aVar.f();
                    continue;
                case 90:
                    if (this.f4880a == null) {
                        this.f4880a = new C0811h();
                    }
                    aVar.a(this.f4880a);
                    continue;
                case 98:
                    if (this.f4889j == null) {
                        this.f4889j = new ag();
                    }
                    aVar.a(this.f4889j);
                    continue;
                case 106:
                    o = l.a(aVar, 106);
                    a = this.f4888i == null ? 0 : this.f4888i.length;
                    Object obj = new al[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4888i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new al();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new al();
                    aVar.a(obj[a]);
                    this.f4888i = obj;
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
        return m5000b(aVar);
    }
}

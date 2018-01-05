package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0764d;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class at extends C0758b {
    public static volatile at[] f5416b;
    public int f5417a;
    public String f5418c;
    public String f5419d;
    public int f5420e;
    public C0764d f5421f;
    public String f5422g;
    public String f5423h;
    public byte[] f5424i;

    public static int m5343a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum CheckboxState");
        }
    }

    public static at[] m5344a() {
        if (f5416b == null) {
            synchronized (h.b) {
                if (f5416b == null) {
                    f5416b = new at[0];
                }
            }
        }
        return f5416b;
    }

    public final void m5348a(String str) {
        if (str == null) {
            this.f5419d = null;
            if (this.f5417a == 0) {
                this.f5417a = -1;
                return;
            }
            return;
        }
        this.f5417a = -1;
        this.f5419d = str;
        this.f5417a = 0;
    }

    public final C0764d m5351c() {
        if (this.f5417a == 2) {
            return this.f5421f;
        }
        return null;
    }

    public final String m5352d() {
        if (this.f5417a == 3) {
            return this.f5422g;
        }
        return "";
    }

    public final void m5350b(String str) {
        if (str == null) {
            this.f5422g = null;
            if (this.f5417a == 3) {
                this.f5417a = -1;
                return;
            }
            return;
        }
        this.f5417a = -1;
        this.f5422g = str;
        this.f5417a = 3;
    }

    public at() {
        this.f5417a = -1;
        this.f5418c = "";
        this.f5417a = -1;
        this.f5417a = -1;
        this.f5417a = -1;
        this.f5421f = null;
        this.f5417a = -1;
        this.f5423h = "";
        this.f5424i = l.l;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5418c == null || this.f5418c.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5418c);
        }
        if (this.f5417a == 0) {
            codedOutputByteBufferNano.a(2, this.f5419d);
        }
        if (!(this.f5423h == null || this.f5423h.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5423h);
        }
        if (this.f5417a == 1) {
            codedOutputByteBufferNano.a(5, this.f5420e);
        }
        if (!Arrays.equals(this.f5424i, l.l)) {
            codedOutputByteBufferNano.a(6, this.f5424i);
        }
        if (this.f5417a == 2) {
            codedOutputByteBufferNano.b(7, this.f5421f);
        }
        if (this.f5417a == 3) {
            codedOutputByteBufferNano.a(8, this.f5422g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5418c == null || this.f5418c.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5418c);
        }
        if (this.f5417a == 0) {
            b += CodedOutputByteBufferNano.b(2, this.f5419d);
        }
        if (!(this.f5423h == null || this.f5423h.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5423h);
        }
        if (this.f5417a == 1) {
            b += CodedOutputByteBufferNano.d(5, this.f5420e);
        }
        if (!Arrays.equals(this.f5424i, l.l)) {
            b += CodedOutputByteBufferNano.b(6, this.f5424i);
        }
        if (this.f5417a == 2) {
            b += CodedOutputByteBufferNano.d(7, this.f5421f);
        }
        if (this.f5417a == 3) {
            return b + CodedOutputByteBufferNano.b(8, this.f5422g);
        }
        return b;
    }

    private final at m5345b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f5418c = aVar.f();
                    continue;
                case 18:
                    this.f5419d = aVar.f();
                    this.f5417a = 0;
                    continue;
                case 26:
                    this.f5423h = aVar.f();
                    continue;
                case 40:
                    this.f5417a = 1;
                    int o = aVar.o();
                    try {
                        this.f5420e = at.m5343a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 50:
                    this.f5424i = aVar.g();
                    continue;
                case 58:
                    if (this.f5421f == null) {
                        this.f5421f = new C0764d();
                    }
                    aVar.a(this.f5421f);
                    this.f5417a = 2;
                    continue;
                case 66:
                    this.f5422g = aVar.f();
                    this.f5417a = 3;
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
        return m5345b(aVar);
    }
}

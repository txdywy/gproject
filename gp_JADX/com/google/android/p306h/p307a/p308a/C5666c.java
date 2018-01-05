package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C5666c extends C0758b {
    public static volatile C5666c[] f28726a;
    public String f28727b;
    public Long f28728c;
    public Long f28729d;
    public Long f28730e;
    public Long f28731f;
    public Long f28732g;
    public Long f28733h;
    public Long f28734i;
    public Long f28735j;
    public Long f28736k;
    public Long f28737l;
    public Long f28738m;
    public Long f28739n;
    public C5667d[] f28740o;

    public static C5666c[] m26858a() {
        if (f28726a == null) {
            synchronized (h.b) {
                if (f28726a == null) {
                    f28726a = new C5666c[0];
                }
            }
        }
        return f28726a;
    }

    public C5666c() {
        this.f28727b = null;
        this.f28728c = null;
        this.f28729d = null;
        this.f28730e = null;
        this.f28731f = null;
        this.f28732g = null;
        this.f28733h = null;
        this.f28734i = null;
        this.f28735j = null;
        this.f28736k = null;
        this.f28737l = null;
        this.f28738m = null;
        this.f28739n = null;
        this.f28740o = C5667d.m26862a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28727b != null) {
            codedOutputByteBufferNano.a(1, this.f28727b);
        }
        if (this.f28728c != null) {
            codedOutputByteBufferNano.b(2, this.f28728c.longValue());
        }
        if (this.f28729d != null) {
            codedOutputByteBufferNano.b(3, this.f28729d.longValue());
        }
        if (this.f28730e != null) {
            codedOutputByteBufferNano.b(4, this.f28730e.longValue());
        }
        if (this.f28732g != null) {
            codedOutputByteBufferNano.b(5, this.f28732g.longValue());
        }
        if (this.f28733h != null) {
            codedOutputByteBufferNano.b(6, this.f28733h.longValue());
        }
        if (this.f28734i != null) {
            codedOutputByteBufferNano.b(7, this.f28734i.longValue());
        }
        if (this.f28735j != null) {
            codedOutputByteBufferNano.b(8, this.f28735j.longValue());
        }
        if (this.f28736k != null) {
            codedOutputByteBufferNano.b(9, this.f28736k.longValue());
        }
        if (this.f28737l != null) {
            codedOutputByteBufferNano.b(10, this.f28737l.longValue());
        }
        if (this.f28738m != null) {
            codedOutputByteBufferNano.b(11, this.f28738m.longValue());
        }
        if (this.f28739n != null) {
            codedOutputByteBufferNano.b(12, this.f28739n.longValue());
        }
        if (this.f28731f != null) {
            codedOutputByteBufferNano.b(13, this.f28731f.longValue());
        }
        if (this.f28740o != null && this.f28740o.length > 0) {
            for (C0757i c0757i : this.f28740o) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(14, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28727b != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28727b);
        }
        if (this.f28728c != null) {
            b += CodedOutputByteBufferNano.f(2, this.f28728c.longValue());
        }
        if (this.f28729d != null) {
            b += CodedOutputByteBufferNano.f(3, this.f28729d.longValue());
        }
        if (this.f28730e != null) {
            b += CodedOutputByteBufferNano.f(4, this.f28730e.longValue());
        }
        if (this.f28732g != null) {
            b += CodedOutputByteBufferNano.f(5, this.f28732g.longValue());
        }
        if (this.f28733h != null) {
            b += CodedOutputByteBufferNano.f(6, this.f28733h.longValue());
        }
        if (this.f28734i != null) {
            b += CodedOutputByteBufferNano.f(7, this.f28734i.longValue());
        }
        if (this.f28735j != null) {
            b += CodedOutputByteBufferNano.f(8, this.f28735j.longValue());
        }
        if (this.f28736k != null) {
            b += CodedOutputByteBufferNano.f(9, this.f28736k.longValue());
        }
        if (this.f28737l != null) {
            b += CodedOutputByteBufferNano.f(10, this.f28737l.longValue());
        }
        if (this.f28738m != null) {
            b += CodedOutputByteBufferNano.f(11, this.f28738m.longValue());
        }
        if (this.f28739n != null) {
            b += CodedOutputByteBufferNano.f(12, this.f28739n.longValue());
        }
        if (this.f28731f != null) {
            b += CodedOutputByteBufferNano.f(13, this.f28731f.longValue());
        }
        if (this.f28740o == null || this.f28740o.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f28740o) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(14, c0757i);
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
                    this.f28727b = aVar.f();
                    continue;
                case 16:
                    this.f28728c = Long.valueOf(aVar.j());
                    continue;
                case 24:
                    this.f28729d = Long.valueOf(aVar.j());
                    continue;
                case 32:
                    this.f28730e = Long.valueOf(aVar.j());
                    continue;
                case 40:
                    this.f28732g = Long.valueOf(aVar.j());
                    continue;
                case 48:
                    this.f28733h = Long.valueOf(aVar.j());
                    continue;
                case 56:
                    this.f28734i = Long.valueOf(aVar.j());
                    continue;
                case 64:
                    this.f28735j = Long.valueOf(aVar.j());
                    continue;
                case 72:
                    this.f28736k = Long.valueOf(aVar.j());
                    continue;
                case 80:
                    this.f28737l = Long.valueOf(aVar.j());
                    continue;
                case 88:
                    this.f28738m = Long.valueOf(aVar.j());
                    continue;
                case 96:
                    this.f28739n = Long.valueOf(aVar.j());
                    continue;
                case 104:
                    this.f28731f = Long.valueOf(aVar.j());
                    continue;
                case 114:
                    int a2 = l.a(aVar, 114);
                    a = this.f28740o == null ? 0 : this.f28740o.length;
                    Object obj = new C5667d[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28740o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C5667d();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C5667d();
                    aVar.a(obj[a]);
                    this.f28740o = obj;
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

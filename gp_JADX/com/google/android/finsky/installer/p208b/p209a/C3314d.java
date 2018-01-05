package com.google.android.finsky.installer.p208b.p209a;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C3314d extends C0758b {
    public int f17131a;
    public C2470a f17132b;
    public String f17133c;
    public int f17134d;
    public C3312b[] f17135e;
    public int f17136f;
    public String f17137g;
    public String f17138h;
    public int f17139i;
    public es f17140j;
    public String f17141k;
    public boolean f17142l;
    public boolean f17143m;
    public boolean f17144n;
    public C3317g f17145o;
    public String f17146p;
    public String f17147q;
    public String[] f17148r;
    public String f17149s;

    public final C3314d m16662a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f17131a |= 1;
        this.f17133c = str;
        return this;
    }

    public final C3314d m16661a(int i) {
        this.f17131a |= 2;
        this.f17134d = i;
        return this;
    }

    public final C3314d m16666b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f17131a |= 16;
        this.f17138h = str;
        return this;
    }

    public final C3314d m16667c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f17131a |= eq.FLAG_MOVED;
        this.f17147q = str;
        return this;
    }

    public C3314d() {
        this.f17131a = 0;
        this.f17132b = null;
        this.f17133c = "";
        this.f17134d = 0;
        this.f17135e = C3312b.ak_();
        this.f17136f = 0;
        this.f17137g = "";
        this.f17138h = "";
        this.f17139i = 2;
        this.f17140j = null;
        this.f17141k = "";
        this.f17142l = false;
        this.f17143m = false;
        this.f17144n = false;
        this.f17145o = null;
        this.f17146p = "";
        this.f17147q = "";
        this.f17148r = l.j;
        this.f17149s = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f17132b != null) {
            codedOutputByteBufferNano.b(1, this.f17132b);
        }
        if ((this.f17131a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f17133c);
        }
        if ((this.f17131a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f17134d);
        }
        if (this.f17135e != null && this.f17135e.length > 0) {
            for (C0757i c0757i : this.f17135e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        if ((this.f17131a & 4) != 0) {
            codedOutputByteBufferNano.a(5, this.f17136f);
        }
        if ((this.f17131a & 8) != 0) {
            codedOutputByteBufferNano.a(6, this.f17137g);
        }
        if ((this.f17131a & 16) != 0) {
            codedOutputByteBufferNano.a(7, this.f17138h);
        }
        if ((this.f17131a & 32) != 0) {
            codedOutputByteBufferNano.a(8, this.f17139i);
        }
        if (this.f17140j != null) {
            codedOutputByteBufferNano.b(9, this.f17140j);
        }
        if ((this.f17131a & 64) != 0) {
            codedOutputByteBufferNano.a(10, this.f17141k);
        }
        if ((this.f17131a & 128) != 0) {
            codedOutputByteBufferNano.a(11, this.f17142l);
        }
        if ((this.f17131a & 256) != 0) {
            codedOutputByteBufferNano.a(12, this.f17143m);
        }
        if ((this.f17131a & 512) != 0) {
            codedOutputByteBufferNano.a(13, this.f17144n);
        }
        if (this.f17145o != null) {
            codedOutputByteBufferNano.b(15, this.f17145o);
        }
        if ((this.f17131a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(16, this.f17146p);
        }
        if ((this.f17131a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(17, this.f17147q);
        }
        if (this.f17148r != null && this.f17148r.length > 0) {
            while (i < this.f17148r.length) {
                String str = this.f17148r[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(18, str);
                }
                i++;
            }
        }
        if ((this.f17131a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.a(19, this.f17149s);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f17132b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f17132b);
        }
        if ((this.f17131a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f17133c);
        }
        if ((this.f17131a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f17134d);
        }
        if (this.f17135e != null && this.f17135e.length > 0) {
            i = b;
            for (C0757i c0757i : this.f17135e) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(4, c0757i);
                }
            }
            b = i;
        }
        if ((this.f17131a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f17136f);
        }
        if ((this.f17131a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f17137g);
        }
        if ((this.f17131a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f17138h);
        }
        if ((this.f17131a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f17139i);
        }
        if (this.f17140j != null) {
            b += CodedOutputByteBufferNano.d(9, this.f17140j);
        }
        if ((this.f17131a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(10, this.f17141k);
        }
        if ((this.f17131a & 128) != 0) {
            b += CodedOutputByteBufferNano.d(11) + 1;
        }
        if ((this.f17131a & 256) != 0) {
            b += CodedOutputByteBufferNano.d(12) + 1;
        }
        if ((this.f17131a & 512) != 0) {
            b += CodedOutputByteBufferNano.d(13) + 1;
        }
        if (this.f17145o != null) {
            b += CodedOutputByteBufferNano.d(15, this.f17145o);
        }
        if ((this.f17131a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.b(16, this.f17146p);
        }
        if ((this.f17131a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.b(17, this.f17147q);
        }
        if (this.f17148r != null && this.f17148r.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f17148r.length) {
                String str = this.f17148r[i2];
                if (str != null) {
                    i3++;
                    i += CodedOutputByteBufferNano.b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 2);
        }
        if ((this.f17131a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            return b + CodedOutputByteBufferNano.b(19, this.f17149s);
        }
        return b;
    }

    public static C3314d m16660a(byte[] bArr) {
        return (C3314d) C0757i.m4905a(new C3314d(), bArr);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f17132b == null) {
                        this.f17132b = new C2470a();
                    }
                    aVar.a(this.f17132b);
                    continue;
                case 18:
                    this.f17133c = aVar.f();
                    this.f17131a |= 1;
                    continue;
                case 24:
                    this.f17134d = aVar.i();
                    this.f17131a |= 2;
                    continue;
                case 34:
                    a2 = l.a(aVar, 34);
                    a = this.f17135e == null ? 0 : this.f17135e.length;
                    obj = new C3312b[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f17135e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C3312b();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C3312b();
                    aVar.a(obj[a]);
                    this.f17135e = obj;
                    continue;
                case 40:
                    this.f17136f = aVar.i();
                    this.f17131a |= 4;
                    continue;
                case 50:
                    this.f17137g = aVar.f();
                    this.f17131a |= 8;
                    continue;
                case 58:
                    this.f17138h = aVar.f();
                    this.f17131a |= 16;
                    continue;
                case 64:
                    this.f17139i = aVar.i();
                    this.f17131a |= 32;
                    continue;
                case 74:
                    if (this.f17140j == null) {
                        this.f17140j = new es();
                    }
                    aVar.a(this.f17140j);
                    continue;
                case 82:
                    this.f17141k = aVar.f();
                    this.f17131a |= 64;
                    continue;
                case 88:
                    this.f17142l = aVar.e();
                    this.f17131a |= 128;
                    continue;
                case 96:
                    this.f17143m = aVar.e();
                    this.f17131a |= 256;
                    continue;
                case 104:
                    this.f17144n = aVar.e();
                    this.f17131a |= 512;
                    continue;
                case 122:
                    if (this.f17145o == null) {
                        this.f17145o = new C3317g();
                    }
                    aVar.a(this.f17145o);
                    continue;
                case 130:
                    this.f17146p = aVar.f();
                    this.f17131a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f17147q = aVar.f();
                    this.f17131a |= eq.FLAG_MOVED;
                    continue;
                case 146:
                    a2 = l.a(aVar, 146);
                    a = this.f17148r == null ? 0 : this.f17148r.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f17148r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f17148r = obj;
                    continue;
                case 154:
                    this.f17149s = aVar.f();
                    this.f17131a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
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

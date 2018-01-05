package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class ez extends b {
    public int f38867a;
    public int f38868b;
    public String f38869c;
    public int f38870d;
    public String f38871e;
    public String f38872f;
    public String[] f38873g;
    public ew[] f38874h;
    public int f38875i;
    public String f38876j;
    public boolean f38877k;
    public boolean f38878l;
    public boolean f38879m;
    public String f38880n;

    public ez() {
        this.f38867a = 0;
        this.f38868b = 0;
        this.f38869c = "";
        this.f38870d = 0;
        this.f38871e = "";
        this.f38872f = "";
        this.f38873g = C7222l.f35477j;
        this.f38874h = ew.m36372d();
        this.f38875i = 0;
        this.f38876j = "";
        this.f38877k = false;
        this.f38878l = false;
        this.f38879m = false;
        this.f38880n = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36388a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f38867a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38868b);
        }
        if ((this.f38867a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38869c);
        }
        if ((this.f38867a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f38870d);
        }
        if ((this.f38867a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38871e);
        }
        if ((this.f38867a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38872f);
        }
        if (this.f38873g != null && this.f38873g.length > 0) {
            for (String str : this.f38873g) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(6, str);
                }
            }
        }
        if (this.f38874h != null && this.f38874h.length > 0) {
            while (i < this.f38874h.length) {
                i iVar = this.f38874h[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(7, iVar);
                }
                i++;
            }
        }
        if ((this.f38867a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f38875i);
        }
        if ((this.f38867a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f38876j);
        }
        if ((this.f38867a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(10, this.f38877k);
        }
        if ((this.f38867a & 256) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f38878l);
        }
        if ((this.f38867a & 512) != 0) {
            codedOutputByteBufferNano.m33522a(12, this.f38879m);
        }
        if ((this.f38867a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f38880n);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36389b() {
        int i = 0;
        int b = super.b();
        if ((this.f38867a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38868b);
        }
        if ((this.f38867a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38869c);
        }
        if ((this.f38867a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f38870d);
        }
        if ((this.f38867a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38871e);
        }
        if ((this.f38867a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38872f);
        }
        if (this.f38873g != null && this.f38873g.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f38873g) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f38874h != null && this.f38874h.length > 0) {
            while (i < this.f38874h.length) {
                i iVar = this.f38874h[i];
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(7, iVar);
                }
                i++;
            }
        }
        if ((this.f38867a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f38875i);
        }
        if ((this.f38867a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f38876j);
        }
        if ((this.f38867a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33501d(10) + 1;
        }
        if ((this.f38867a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 1;
        }
        if ((this.f38867a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33501d(12) + 1;
        }
        if ((this.f38867a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(13, this.f38880n);
        }
        return b;
    }

    private final ez m36386b(C7213a c7213a) {
        int a;
        while (true) {
            int a2 = c7213a.m33550a();
            Object obj;
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.f38868b = c7213a.m33567i();
                    this.f38867a |= 1;
                    continue;
                case 18:
                    this.f38869c = c7213a.m33564f();
                    this.f38867a |= 2;
                    continue;
                case 24:
                    this.f38870d = c7213a.m33567i();
                    this.f38867a |= 4;
                    continue;
                case 34:
                    this.f38871e = c7213a.m33564f();
                    this.f38867a |= 8;
                    continue;
                case 42:
                    this.f38872f = c7213a.m33564f();
                    this.f38867a |= 16;
                    continue;
                case 50:
                    a = C7222l.m33624a(c7213a, 50);
                    a2 = this.f38873g == null ? 0 : this.f38873g.length;
                    obj = new String[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f38873g, 0, obj, 0, a2);
                    }
                    while (a2 < obj.length - 1) {
                        obj[a2] = c7213a.m33564f();
                        c7213a.m33550a();
                        a2++;
                    }
                    obj[a2] = c7213a.m33564f();
                    this.f38873g = obj;
                    continue;
                case 58:
                    a = C7222l.m33624a(c7213a, 58);
                    a2 = this.f38874h == null ? 0 : this.f38874h.length;
                    obj = new ew[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f38874h, 0, obj, 0, a2);
                    }
                    while (a2 < obj.length - 1) {
                        obj[a2] = new ew();
                        c7213a.m33552a(obj[a2]);
                        c7213a.m33550a();
                        a2++;
                    }
                    obj[a2] = new ew();
                    c7213a.m33552a(obj[a2]);
                    this.f38874h = obj;
                    continue;
                case 64:
                    this.f38867a |= 32;
                    a = c7213a.m33573o();
                    try {
                        this.f38875i = ev.m36370a(c7213a.m33567i());
                        this.f38867a |= 32;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(a);
                        a(c7213a, a2);
                        break;
                    }
                case 74:
                    this.f38876j = c7213a.m33564f();
                    this.f38867a |= 64;
                    continue;
                case 80:
                    this.f38877k = c7213a.m33563e();
                    this.f38867a |= 128;
                    continue;
                case 88:
                    this.f38878l = c7213a.m33563e();
                    this.f38867a |= 256;
                    continue;
                case 96:
                    this.f38879m = c7213a.m33563e();
                    this.f38867a |= 512;
                    continue;
                case 106:
                    this.f38880n = c7213a.m33564f();
                    this.f38867a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                default:
                    if (!super.a(c7213a, a2)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m36387a(C7213a c7213a) {
        return m36386b(c7213a);
    }
}

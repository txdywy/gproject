package com.google.wireless.android.finsky.dfe.nano;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.a.co;
import com.google.android.finsky.cv.a.ha;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class ch extends b {
    public static volatile ch[] f38549a;
    public int f38550b;
    public dv f38551c;
    public String f38552d;
    public String f38553e;
    public String f38554f;
    public String f38555g;
    public String f38556h;
    public String f38557i;
    public String f38558j;
    public String f38559k;
    public String f38560l;
    public String f38561m;
    public String f38562n;
    public String f38563o;
    public co f38564p;
    public String f38565q;
    public ha f38566r;
    public String f38567s;

    public static ch[] m36154d() {
        if (f38549a == null) {
            synchronized (C7219h.f35465b) {
                if (f38549a == null) {
                    f38549a = new ch[0];
                }
            }
        }
        return f38549a;
    }

    public ch() {
        this.f38550b = 0;
        this.f38551c = null;
        this.f38552d = "";
        this.f38553e = "";
        this.f38554f = "";
        this.f38555g = "";
        this.f38556h = "";
        this.f38557i = "";
        this.f38558j = "";
        this.f38559k = "";
        this.f38560l = "";
        this.f38561m = "";
        this.f38562n = "";
        this.f38563o = "";
        this.f38564p = null;
        this.f38565q = "";
        this.f38566r = null;
        this.f38567s = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36156a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38551c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38551c);
        }
        codedOutputByteBufferNano.m33521a(2, this.f38552d);
        if ((this.f38550b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38553e);
        }
        if ((this.f38550b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38554f);
        }
        if ((this.f38550b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38555g);
        }
        if ((this.f38550b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38558j);
        }
        if ((this.f38550b & 256) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f38561m);
        }
        if ((this.f38550b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f38563o);
        }
        if (this.f38564p != null) {
            codedOutputByteBufferNano.m33532b(9, this.f38564p);
        }
        if ((this.f38550b & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f38565q);
        }
        if ((this.f38550b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(11, this.f38556h);
        }
        if ((this.f38550b & 64) != 0) {
            codedOutputByteBufferNano.m33521a(12, this.f38559k);
        }
        if ((this.f38550b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f38557i);
        }
        if ((this.f38550b & 128) != 0) {
            codedOutputByteBufferNano.m33521a(14, this.f38560l);
        }
        if ((this.f38550b & 512) != 0) {
            codedOutputByteBufferNano.m33521a(15, this.f38562n);
        }
        if (this.f38566r != null) {
            codedOutputByteBufferNano.m33532b(16, this.f38566r);
        }
        if ((this.f38550b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33521a(17, this.f38567s);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36157b() {
        int b = super.b();
        if (this.f38551c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38551c);
        }
        b += CodedOutputByteBufferNano.m33493b(2, this.f38552d);
        if ((this.f38550b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38553e);
        }
        if ((this.f38550b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38554f);
        }
        if ((this.f38550b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38555g);
        }
        if ((this.f38550b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f38558j);
        }
        if ((this.f38550b & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f38561m);
        }
        if ((this.f38550b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f38563o);
        }
        if (this.f38564p != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f38564p);
        }
        if ((this.f38550b & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f38565q);
        }
        if ((this.f38550b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f38556h);
        }
        if ((this.f38550b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(12, this.f38559k);
        }
        if ((this.f38550b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f38557i);
        }
        if ((this.f38550b & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(14, this.f38560l);
        }
        if ((this.f38550b & 512) != 0) {
            b += CodedOutputByteBufferNano.m33493b(15, this.f38562n);
        }
        if (this.f38566r != null) {
            b += CodedOutputByteBufferNano.m33503d(16, this.f38566r);
        }
        if ((this.f38550b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(17, this.f38567s);
        }
        return b;
    }

    public final /* synthetic */ i m36155a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38551c == null) {
                        this.f38551c = new dv();
                    }
                    c7213a.m33552a(this.f38551c);
                    continue;
                case 18:
                    this.f38552d = c7213a.m33564f();
                    continue;
                case 26:
                    this.f38553e = c7213a.m33564f();
                    this.f38550b |= 1;
                    continue;
                case 34:
                    this.f38554f = c7213a.m33564f();
                    this.f38550b |= 2;
                    continue;
                case 42:
                    this.f38555g = c7213a.m33564f();
                    this.f38550b |= 4;
                    continue;
                case 50:
                    this.f38558j = c7213a.m33564f();
                    this.f38550b |= 32;
                    continue;
                case 58:
                    this.f38561m = c7213a.m33564f();
                    this.f38550b |= 256;
                    continue;
                case 66:
                    this.f38563o = c7213a.m33564f();
                    this.f38550b |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 74:
                    if (this.f38564p == null) {
                        this.f38564p = new co();
                    }
                    c7213a.m33552a(this.f38564p);
                    continue;
                case 82:
                    this.f38565q = c7213a.m33564f();
                    this.f38550b |= eq.FLAG_MOVED;
                    continue;
                case 90:
                    this.f38556h = c7213a.m33564f();
                    this.f38550b |= 8;
                    continue;
                case 98:
                    this.f38559k = c7213a.m33564f();
                    this.f38550b |= 64;
                    continue;
                case 106:
                    this.f38557i = c7213a.m33564f();
                    this.f38550b |= 16;
                    continue;
                case 114:
                    this.f38560l = c7213a.m33564f();
                    this.f38550b |= 128;
                    continue;
                case 122:
                    this.f38562n = c7213a.m33564f();
                    this.f38550b |= 512;
                    continue;
                case 130:
                    if (this.f38566r == null) {
                        this.f38566r = new ha();
                    }
                    c7213a.m33552a(this.f38566r);
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f38567s = c7213a.m33564f();
                    this.f38550b |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}

package com.google.wireless.android.p356a.p357a.p358a.p359a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class br extends b {
    public int f35822a;
    public String f35823b;
    public int f35824c;
    public String f35825d;
    public int f35826e;
    public boolean f35827f;
    public boolean f35828g;
    public byte[] f35829h;
    public String f35830i;
    public String f35831j;
    public boolean f35832k;
    public String f35833l;
    public int f35834m;
    public bs f35835n;
    public int f35836o;

    public final br m34220a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f35822a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
        this.f35833l = str;
        return this;
    }

    public br() {
        this.f35822a = 0;
        this.f35823b = "";
        this.f35824c = 0;
        this.f35825d = "";
        this.f35826e = 0;
        this.f35827f = false;
        this.f35828g = false;
        this.f35829h = C7222l.f35479l;
        this.f35830i = "";
        this.f35831j = "";
        this.f35832k = false;
        this.f35833l = "";
        this.f35834m = 0;
        this.f35835n = null;
        this.f35836o = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34221a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35822a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f35823b);
        }
        if ((this.f35822a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35824c);
        }
        if ((this.f35822a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f35825d);
        }
        if ((this.f35822a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35826e);
        }
        if ((this.f35822a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f35827f);
        }
        if ((this.f35822a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f35828g);
        }
        if ((this.f35822a & 64) != 0) {
            codedOutputByteBufferNano.m33523a(7, this.f35829h);
        }
        if ((this.f35822a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f35830i);
        }
        if ((this.f35822a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f35831j);
        }
        if ((this.f35822a & 512) != 0) {
            codedOutputByteBufferNano.m33522a(10, this.f35832k);
        }
        if ((this.f35822a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(11, this.f35833l);
        }
        if ((this.f35822a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33518a(12, this.f35834m);
        }
        if (this.f35835n != null) {
            codedOutputByteBufferNano.m33532b(13, this.f35835n);
        }
        if ((this.f35822a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33518a(14, this.f35836o);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34222b() {
        int b = super.b();
        if ((this.f35822a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35823b);
        }
        if ((this.f35822a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35824c);
        }
        if ((this.f35822a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f35825d);
        }
        if ((this.f35822a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35826e);
        }
        if ((this.f35822a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f35822a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f35822a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33494b(7, this.f35829h);
        }
        if ((this.f35822a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f35830i);
        }
        if ((this.f35822a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f35831j);
        }
        if ((this.f35822a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33501d(10) + 1;
        }
        if ((this.f35822a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f35833l);
        }
        if ((this.f35822a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33502d(12, this.f35834m);
        }
        if (this.f35835n != null) {
            b += CodedOutputByteBufferNano.m33503d(13, this.f35835n);
        }
        if ((this.f35822a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(14, this.f35836o);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.br m34218b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            case 26: goto L_0x0058;
            case 32: goto L_0x0065;
            case 40: goto L_0x0072;
            case 48: goto L_0x007f;
            case 58: goto L_0x008d;
            case 66: goto L_0x009b;
            case 74: goto L_0x00a9;
            case 80: goto L_0x00b7;
            case 90: goto L_0x00c5;
            case 96: goto L_0x00d3;
            case 106: goto L_0x00e1;
            case 112: goto L_0x00f3;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f35823b = r0;
        r0 = r6.f35822a;
        r0 = r0 | 1;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x001b:
        r1 = r6.f35822a;
        r1 = r1 | 2;
        r6.f35822a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            case 2: goto L_0x004f;
            case 3: goto L_0x004f;
            case 4: goto L_0x004f;
            case 5: goto L_0x004f;
            case 6: goto L_0x004f;
            case 7: goto L_0x004f;
            case 8: goto L_0x004f;
            case 9: goto L_0x004f;
            case 10: goto L_0x004f;
            case 11: goto L_0x004f;
            case 12: goto L_0x004f;
            case 13: goto L_0x004f;
            case 14: goto L_0x004f;
            case 15: goto L_0x004f;
            case 16: goto L_0x004f;
            case 17: goto L_0x004f;
            case 18: goto L_0x004f;
            case 19: goto L_0x004f;
            case 20: goto L_0x004f;
            case 21: goto L_0x004f;
            case 22: goto L_0x004f;
            case 23: goto L_0x004f;
            case 24: goto L_0x004f;
            case 25: goto L_0x004f;
            case 26: goto L_0x004f;
            case 27: goto L_0x004f;
            case 28: goto L_0x004f;
            case 29: goto L_0x004f;
            default: goto L_0x002c;
        };	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x002c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = " is not a valid enum ResolvedType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x004f:
        r6.f35824c = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f35822a;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f35822a = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33564f();
        r6.f35825d = r0;
        r0 = r6.f35822a;
        r0 = r0 | 4;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r7.m33560d();
        r6.f35826e = r0;
        r0 = r6.f35822a;
        r0 = r0 | 8;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.m33563e();
        r6.f35827f = r0;
        r0 = r6.f35822a;
        r0 = r0 | 16;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x007f:
        r0 = r7.m33563e();
        r6.f35828g = r0;
        r0 = r6.f35822a;
        r0 = r0 | 32;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x008d:
        r0 = r7.m33565g();
        r6.f35829h = r0;
        r0 = r6.f35822a;
        r0 = r0 | 64;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x009b:
        r0 = r7.m33564f();
        r6.f35830i = r0;
        r0 = r6.f35822a;
        r0 = r0 | 128;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x00a9:
        r0 = r7.m33564f();
        r6.f35831j = r0;
        r0 = r6.f35822a;
        r0 = r0 | 256;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x00b7:
        r0 = r7.m33563e();
        r6.f35832k = r0;
        r0 = r6.f35822a;
        r0 = r0 | 512;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x00c5:
        r0 = r7.m33564f();
        r6.f35833l = r0;
        r0 = r6.f35822a;
        r0 = r0 | 1024;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x00d3:
        r0 = r7.m33560d();
        r6.f35834m = r0;
        r0 = r6.f35822a;
        r0 = r0 | 2048;
        r6.f35822a = r0;
        goto L_0x0000;
    L_0x00e1:
        r0 = r6.f35835n;
        if (r0 != 0) goto L_0x00ec;
    L_0x00e5:
        r0 = new com.google.wireless.android.a.a.a.a.bs;
        r0.<init>();
        r6.f35835n = r0;
    L_0x00ec:
        r0 = r6.f35835n;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00f3:
        r1 = r6.f35822a;
        r1 = r1 | 4096;
        r6.f35822a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x011f }
        switch(r2) {
            case 0: goto L_0x0128;
            case 1: goto L_0x0128;
            case 2: goto L_0x0128;
            default: goto L_0x0104;
        };	 Catch:{ IllegalArgumentException -> 0x011f }
    L_0x0104:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x011f }
        r4 = 55;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x011f }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x011f }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x011f }
        r4 = " is not a valid enum ResolvedDeepLinkRequest";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x011f }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x011f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x011f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x011f }
    L_0x011f:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0128:
        r6.f35836o = r2;	 Catch:{ IllegalArgumentException -> 0x011f }
        r2 = r6.f35822a;	 Catch:{ IllegalArgumentException -> 0x011f }
        r2 = r2 | 4096;
        r6.f35822a = r2;	 Catch:{ IllegalArgumentException -> 0x011f }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.br.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.br");
    }

    public final /* synthetic */ i m34219a(C7213a c7213a) {
        return m34218b(c7213a);
    }
}

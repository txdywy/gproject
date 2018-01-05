package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class dl extends C0758b {
    public static volatile dl[] f12152a;
    public int f12153b;
    public int f12154c;
    public int f12155d;
    public long f12156e;
    public long f12157f;
    public gs f12158g;
    public String f12159h;

    public static dl[] aU_() {
        if (f12152a == null) {
            synchronized (h.b) {
                if (f12152a == null) {
                    f12152a = new dl[0];
                }
            }
        }
        return f12152a;
    }

    public final dl m12431a(int i) {
        this.f12154c = i;
        this.f12153b |= 1;
        return this;
    }

    public final dl m12436b(int i) {
        this.f12153b |= 2;
        this.f12155d = i;
        return this;
    }

    public final dl m12432a(long j) {
        this.f12153b |= 4;
        this.f12156e = j;
        return this;
    }

    public final dl m12437b(long j) {
        this.f12153b |= 8;
        this.f12157f = j;
        return this;
    }

    public dl() {
        this.f12153b = 0;
        this.f12154c = 0;
        this.f12155d = 0;
        this.f12156e = 0;
        this.f12157f = 0;
        this.f12158g = null;
        this.f12159h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        dl dlVar = (dl) obj;
        if ((this.f12153b & 1) != (dlVar.f12153b & 1)) {
            return false;
        }
        if (this.f12154c != dlVar.f12154c) {
            return false;
        }
        if ((this.f12153b & 2) != (dlVar.f12153b & 2)) {
            return false;
        }
        if (this.f12155d != dlVar.f12155d) {
            return false;
        }
        if ((this.f12153b & 4) != (dlVar.f12153b & 4)) {
            return false;
        }
        if (this.f12156e != dlVar.f12156e) {
            return false;
        }
        if ((this.f12153b & 8) != (dlVar.f12153b & 8)) {
            return false;
        }
        if (this.f12157f != dlVar.f12157f) {
            return false;
        }
        if (this.f12158g == null) {
            if (dlVar.f12158g != null) {
                return false;
            }
        } else if (!this.f12158g.equals(dlVar.f12158g)) {
            return false;
        }
        if ((this.f12153b & 16) != (dlVar.f12153b & 16)) {
            return false;
        }
        if (!this.f12159h.equals(dlVar.f12159h)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dlVar.aO);
        }
        if (dlVar.aO == null || dlVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12154c) * 31) + this.f12155d;
        long j = this.f12156e;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12157f;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        gs gsVar = this.f12158g;
        hashCode = ((((gsVar == null ? 0 : gsVar.hashCode()) + (hashCode * 31)) * 31) + this.f12159h.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12153b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12154c);
        }
        if ((this.f12153b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12155d);
        }
        if ((this.f12153b & 4) != 0) {
            codedOutputByteBufferNano.b(3, this.f12156e);
        }
        if ((this.f12153b & 16) != 0) {
            codedOutputByteBufferNano.a(4, this.f12159h);
        }
        if ((this.f12153b & 8) != 0) {
            codedOutputByteBufferNano.b(5, this.f12157f);
        }
        if (this.f12158g != null) {
            codedOutputByteBufferNano.b(6, this.f12158g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12153b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12154c);
        }
        if ((this.f12153b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12155d);
        }
        if ((this.f12153b & 4) != 0) {
            b += CodedOutputByteBufferNano.f(3, this.f12156e);
        }
        if ((this.f12153b & 16) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12159h);
        }
        if ((this.f12153b & 8) != 0) {
            b += CodedOutputByteBufferNano.f(5, this.f12157f);
        }
        if (this.f12158g != null) {
            return b + CodedOutputByteBufferNano.d(6, this.f12158g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.dl m12430b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            case 24: goto L_0x0058;
            case 34: goto L_0x0065;
            case 40: goto L_0x0072;
            case 50: goto L_0x007f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f12153b;
        r1 = r1 | 1;
        r6.f12153b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum FileType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r6.f12154c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f12153b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f12153b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.i();
        r6.f12155d = r0;
        r0 = r6.f12153b;
        r0 = r0 | 2;
        r6.f12153b = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.j();
        r6.f12156e = r0;
        r0 = r6.f12153b;
        r0 = r0 | 4;
        r6.f12153b = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r7.f();
        r6.f12159h = r0;
        r0 = r6.f12153b;
        r0 = r0 | 16;
        r6.f12153b = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.j();
        r6.f12157f = r0;
        r0 = r6.f12153b;
        r0 = r0 | 8;
        r6.f12153b = r0;
        goto L_0x0000;
    L_0x007f:
        r0 = r6.f12158g;
        if (r0 != 0) goto L_0x008a;
    L_0x0083:
        r0 = new com.google.android.finsky.cv.a.gs;
        r0.<init>();
        r6.f12158g = r0;
    L_0x008a:
        r0 = r6.f12158g;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.dl.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.dl");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12430b(aVar);
    }
}

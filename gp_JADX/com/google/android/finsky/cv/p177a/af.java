package com.google.android.finsky.cv.p177a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class af extends C0758b {
    public int f11769a;
    public String f11770b;
    public String f11771c;
    public String f11772d;
    public int f11773e;
    public String f11774f;
    public int f11775g;
    public String f11776h;
    public String f11777i;
    public String f11778j;
    public String f11779k;
    public C2437j f11780l;
    public String f11781m;
    public go f11782n;
    public String f11783o;

    public af() {
        this.f11769a = 0;
        this.f11770b = "";
        this.f11771c = "";
        this.f11772d = "";
        this.f11773e = 0;
        this.f11774f = "";
        this.f11775g = 0;
        this.f11776h = "";
        this.f11777i = "";
        this.f11778j = "";
        this.f11779k = "";
        this.f11780l = null;
        this.f11781m = "";
        this.f11782n = null;
        this.f11783o = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        if ((this.f11769a & 1) != (afVar.f11769a & 1)) {
            return false;
        }
        if (!this.f11770b.equals(afVar.f11770b)) {
            return false;
        }
        if ((this.f11769a & 2) != (afVar.f11769a & 2)) {
            return false;
        }
        if (!this.f11771c.equals(afVar.f11771c)) {
            return false;
        }
        if ((this.f11769a & 4) != (afVar.f11769a & 4)) {
            return false;
        }
        if (!this.f11772d.equals(afVar.f11772d)) {
            return false;
        }
        if ((this.f11769a & 8) != (afVar.f11769a & 8)) {
            return false;
        }
        if (this.f11773e != afVar.f11773e) {
            return false;
        }
        if ((this.f11769a & 16) != (afVar.f11769a & 16)) {
            return false;
        }
        if (!this.f11774f.equals(afVar.f11774f)) {
            return false;
        }
        if ((this.f11769a & 32) != (afVar.f11769a & 32)) {
            return false;
        }
        if (this.f11775g != afVar.f11775g) {
            return false;
        }
        if ((this.f11769a & 64) != (afVar.f11769a & 64)) {
            return false;
        }
        if (!this.f11776h.equals(afVar.f11776h)) {
            return false;
        }
        if ((this.f11769a & 128) != (afVar.f11769a & 128)) {
            return false;
        }
        if (!this.f11777i.equals(afVar.f11777i)) {
            return false;
        }
        if ((this.f11769a & 256) != (afVar.f11769a & 256)) {
            return false;
        }
        if (!this.f11778j.equals(afVar.f11778j)) {
            return false;
        }
        if ((this.f11769a & 512) != (afVar.f11769a & 512)) {
            return false;
        }
        if (!this.f11779k.equals(afVar.f11779k)) {
            return false;
        }
        if (this.f11780l == null) {
            if (afVar.f11780l != null) {
                return false;
            }
        } else if (!this.f11780l.equals(afVar.f11780l)) {
            return false;
        }
        if ((this.f11769a & MemoryMappedFileBuffer.DEFAULT_PADDING) != (afVar.f11769a & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (!this.f11781m.equals(afVar.f11781m)) {
            return false;
        }
        if (this.f11782n == null) {
            if (afVar.f11782n != null) {
                return false;
            }
        } else if (!this.f11782n.equals(afVar.f11782n)) {
            return false;
        }
        if ((this.f11769a & eq.FLAG_MOVED) != (afVar.f11769a & eq.FLAG_MOVED)) {
            return false;
        }
        if (!this.f11783o.equals(afVar.f11783o)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(afVar.aO);
        }
        if (afVar.aO == null || afVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f11770b.hashCode()) * 31) + this.f11771c.hashCode()) * 31) + this.f11772d.hashCode()) * 31) + this.f11773e) * 31) + this.f11774f.hashCode()) * 31) + this.f11775g) * 31) + this.f11776h.hashCode()) * 31) + this.f11777i.hashCode()) * 31) + this.f11778j.hashCode()) * 31) + this.f11779k.hashCode();
        C2437j c2437j = this.f11780l;
        hashCode = (((c2437j == null ? 0 : c2437j.hashCode()) + (hashCode * 31)) * 31) + this.f11781m.hashCode();
        go goVar = this.f11782n;
        hashCode = ((((goVar == null ? 0 : goVar.hashCode()) + (hashCode * 31)) * 31) + this.f11783o.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11769a & 1) != 0) {
            codedOutputByteBufferNano.a(4, this.f11770b);
        }
        if ((this.f11769a & 2) != 0) {
            codedOutputByteBufferNano.a(5, this.f11771c);
        }
        if ((this.f11769a & 4) != 0) {
            codedOutputByteBufferNano.a(6, this.f11772d);
        }
        if ((this.f11769a & 8) != 0) {
            codedOutputByteBufferNano.a(7, this.f11773e);
        }
        if ((this.f11769a & 16) != 0) {
            codedOutputByteBufferNano.a(17, this.f11774f);
        }
        if ((this.f11769a & 32) != 0) {
            codedOutputByteBufferNano.a(27, this.f11775g);
        }
        if ((this.f11769a & 64) != 0) {
            codedOutputByteBufferNano.a(28, this.f11776h);
        }
        if ((this.f11769a & 128) != 0) {
            codedOutputByteBufferNano.a(29, this.f11777i);
        }
        if ((this.f11769a & 256) != 0) {
            codedOutputByteBufferNano.a(30, this.f11778j);
        }
        if ((this.f11769a & 512) != 0) {
            codedOutputByteBufferNano.a(31, this.f11779k);
        }
        if (this.f11780l != null) {
            codedOutputByteBufferNano.b(32, this.f11780l);
        }
        if ((this.f11769a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(33, this.f11781m);
        }
        if (this.f11782n != null) {
            codedOutputByteBufferNano.b(34, this.f11782n);
        }
        if ((this.f11769a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(35, this.f11783o);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11769a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f11770b);
        }
        if ((this.f11769a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f11771c);
        }
        if ((this.f11769a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f11772d);
        }
        if ((this.f11769a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f11773e);
        }
        if ((this.f11769a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(17, this.f11774f);
        }
        if ((this.f11769a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(27, this.f11775g);
        }
        if ((this.f11769a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(28, this.f11776h);
        }
        if ((this.f11769a & 128) != 0) {
            b += CodedOutputByteBufferNano.b(29, this.f11777i);
        }
        if ((this.f11769a & 256) != 0) {
            b += CodedOutputByteBufferNano.b(30, this.f11778j);
        }
        if ((this.f11769a & 512) != 0) {
            b += CodedOutputByteBufferNano.b(31, this.f11779k);
        }
        if (this.f11780l != null) {
            b += CodedOutputByteBufferNano.d(32, this.f11780l);
        }
        if ((this.f11769a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.b(33, this.f11781m);
        }
        if (this.f11782n != null) {
            b += CodedOutputByteBufferNano.d(34, this.f11782n);
        }
        if ((this.f11769a & eq.FLAG_MOVED) != 0) {
            return b + CodedOutputByteBufferNano.b(35, this.f11783o);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.af m12175b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 34: goto L_0x000e;
            case 42: goto L_0x001b;
            case 50: goto L_0x0028;
            case 56: goto L_0x0035;
            case 138: goto L_0x0042;
            case 216: goto L_0x004f;
            case 226: goto L_0x008e;
            case 234: goto L_0x009c;
            case 242: goto L_0x00aa;
            case 250: goto L_0x00b8;
            case 258: goto L_0x00c6;
            case 266: goto L_0x00d8;
            case 274: goto L_0x00e6;
            case 282: goto L_0x00f8;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f11770b = r0;
        r0 = r6.f11769a;
        r0 = r0 | 1;
        r6.f11769a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.f();
        r6.f11771c = r0;
        r0 = r6.f11769a;
        r0 = r0 | 2;
        r6.f11769a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.f();
        r6.f11772d = r0;
        r0 = r6.f11769a;
        r0 = r0 | 4;
        r6.f11769a = r0;
        goto L_0x0000;
    L_0x0035:
        r0 = r7.i();
        r6.f11773e = r0;
        r0 = r6.f11769a;
        r0 = r0 | 8;
        r6.f11769a = r0;
        goto L_0x0000;
    L_0x0042:
        r0 = r7.f();
        r6.f11774f = r0;
        r0 = r6.f11769a;
        r0 = r0 | 16;
        r6.f11769a = r0;
        goto L_0x0000;
    L_0x004f:
        r1 = r6.f11769a;
        r1 = r1 | 32;
        r6.f11769a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x007b }
        switch(r2) {
            case 0: goto L_0x0084;
            case 1: goto L_0x0084;
            case 2: goto L_0x0084;
            case 3: goto L_0x0084;
            case 4: goto L_0x0084;
            default: goto L_0x0060;
        };	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x0060:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = " is not a valid enum BookType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x007b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0084:
        r6.f11775g = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r6.f11769a;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2 | 32;
        r6.f11769a = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        goto L_0x0000;
    L_0x008e:
        r0 = r7.f();
        r6.f11776h = r0;
        r0 = r6.f11769a;
        r0 = r0 | 64;
        r6.f11769a = r0;
        goto L_0x0000;
    L_0x009c:
        r0 = r7.f();
        r6.f11777i = r0;
        r0 = r6.f11769a;
        r0 = r0 | 128;
        r6.f11769a = r0;
        goto L_0x0000;
    L_0x00aa:
        r0 = r7.f();
        r6.f11778j = r0;
        r0 = r6.f11769a;
        r0 = r0 | 256;
        r6.f11769a = r0;
        goto L_0x0000;
    L_0x00b8:
        r0 = r7.f();
        r6.f11779k = r0;
        r0 = r6.f11769a;
        r0 = r0 | 512;
        r6.f11769a = r0;
        goto L_0x0000;
    L_0x00c6:
        r0 = r6.f11780l;
        if (r0 != 0) goto L_0x00d1;
    L_0x00ca:
        r0 = new com.google.android.finsky.cv.a.j;
        r0.<init>();
        r6.f11780l = r0;
    L_0x00d1:
        r0 = r6.f11780l;
        r7.a(r0);
        goto L_0x0000;
    L_0x00d8:
        r0 = r7.f();
        r6.f11781m = r0;
        r0 = r6.f11769a;
        r0 = r0 | 1024;
        r6.f11769a = r0;
        goto L_0x0000;
    L_0x00e6:
        r0 = r6.f11782n;
        if (r0 != 0) goto L_0x00f1;
    L_0x00ea:
        r0 = new com.google.android.finsky.cv.a.go;
        r0.<init>();
        r6.f11782n = r0;
    L_0x00f1:
        r0 = r6.f11782n;
        r7.a(r0);
        goto L_0x0000;
    L_0x00f8:
        r0 = r7.f();
        r6.f11783o = r0;
        r0 = r6.f11769a;
        r0 = r0 | 2048;
        r6.f11769a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.af.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.af");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12175b(aVar);
    }
}

package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class gi extends C0758b {
    public int f12443a;
    public String f12444b;
    public int f12445c;
    public bd f12446d;
    public String f12447e;
    public String f12448f;
    public String f12449g;
    public gh f12450h;
    public gg f12451i;
    public gg f12452j;
    public byte[] f12453k;

    public gi() {
        this.f12443a = 0;
        this.f12444b = "";
        this.f12445c = 0;
        this.f12446d = null;
        this.f12447e = "";
        this.f12448f = "";
        this.f12449g = "";
        this.f12450h = null;
        this.f12451i = null;
        this.f12452j = null;
        this.f12453k = l.l;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gi)) {
            return false;
        }
        gi giVar = (gi) obj;
        if ((this.f12443a & 1) != (giVar.f12443a & 1)) {
            return false;
        }
        if (!this.f12444b.equals(giVar.f12444b)) {
            return false;
        }
        if ((this.f12443a & 2) != (giVar.f12443a & 2)) {
            return false;
        }
        if (this.f12445c != giVar.f12445c) {
            return false;
        }
        if (this.f12446d == null) {
            if (giVar.f12446d != null) {
                return false;
            }
        } else if (!this.f12446d.equals(giVar.f12446d)) {
            return false;
        }
        if ((this.f12443a & 4) != (giVar.f12443a & 4)) {
            return false;
        }
        if (!this.f12447e.equals(giVar.f12447e)) {
            return false;
        }
        if ((this.f12443a & 8) != (giVar.f12443a & 8)) {
            return false;
        }
        if (!this.f12448f.equals(giVar.f12448f)) {
            return false;
        }
        if ((this.f12443a & 16) != (giVar.f12443a & 16)) {
            return false;
        }
        if (!this.f12449g.equals(giVar.f12449g)) {
            return false;
        }
        if (this.f12450h == null) {
            if (giVar.f12450h != null) {
                return false;
            }
        } else if (!this.f12450h.equals(giVar.f12450h)) {
            return false;
        }
        if (this.f12451i == null) {
            if (giVar.f12451i != null) {
                return false;
            }
        } else if (!this.f12451i.equals(giVar.f12451i)) {
            return false;
        }
        if (this.f12452j == null) {
            if (giVar.f12452j != null) {
                return false;
            }
        } else if (!this.f12452j.equals(giVar.f12452j)) {
            return false;
        }
        if ((this.f12443a & 32) != (giVar.f12443a & 32)) {
            return false;
        }
        if (!Arrays.equals(this.f12453k, giVar.f12453k)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(giVar.aO);
        }
        if (giVar.aO == null || giVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12444b.hashCode()) * 31) + this.f12445c;
        bd bdVar = this.f12446d;
        hashCode = (((((((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f12447e.hashCode()) * 31) + this.f12448f.hashCode()) * 31) + this.f12449g.hashCode();
        gh ghVar = this.f12450h;
        hashCode = (ghVar == null ? 0 : ghVar.hashCode()) + (hashCode * 31);
        gg ggVar = this.f12451i;
        hashCode = (ggVar == null ? 0 : ggVar.hashCode()) + (hashCode * 31);
        ggVar = this.f12452j;
        hashCode = ((((ggVar == null ? 0 : ggVar.hashCode()) + (hashCode * 31)) * 31) + Arrays.hashCode(this.f12453k)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12443a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12444b);
        }
        if ((this.f12443a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12445c);
        }
        if (this.f12446d != null) {
            codedOutputByteBufferNano.b(3, this.f12446d);
        }
        if ((this.f12443a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12447e);
        }
        if ((this.f12443a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f12448f);
        }
        if ((this.f12443a & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f12449g);
        }
        if (this.f12450h != null) {
            codedOutputByteBufferNano.b(7, this.f12450h);
        }
        if (this.f12451i != null) {
            codedOutputByteBufferNano.b(8, this.f12451i);
        }
        if (this.f12452j != null) {
            codedOutputByteBufferNano.b(9, this.f12452j);
        }
        if ((this.f12443a & 32) != 0) {
            codedOutputByteBufferNano.a(10, this.f12453k);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12443a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12444b);
        }
        if ((this.f12443a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12445c);
        }
        if (this.f12446d != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12446d);
        }
        if ((this.f12443a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12447e);
        }
        if ((this.f12443a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12448f);
        }
        if ((this.f12443a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f12449g);
        }
        if (this.f12450h != null) {
            b += CodedOutputByteBufferNano.d(7, this.f12450h);
        }
        if (this.f12451i != null) {
            b += CodedOutputByteBufferNano.d(8, this.f12451i);
        }
        if (this.f12452j != null) {
            b += CodedOutputByteBufferNano.d(9, this.f12452j);
        }
        if ((this.f12443a & 32) != 0) {
            return b + CodedOutputByteBufferNano.b(10, this.f12453k);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.gi m12645b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0069;
            case 42: goto L_0x0076;
            case 50: goto L_0x0084;
            case 58: goto L_0x0092;
            case 66: goto L_0x00a4;
            case 74: goto L_0x00b6;
            case 82: goto L_0x00c8;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f12444b = r0;
        r0 = r6.f12443a;
        r0 = r0 | 1;
        r6.f12443a = r0;
        goto L_0x0000;
    L_0x001b:
        r1 = r6.f12443a;
        r1 = r1 | 2;
        r6.f12443a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            case 2: goto L_0x004f;
            case 3: goto L_0x004f;
            default: goto L_0x002c;
        };	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x002c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = 61;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = " is not a valid enum NotificationCenterMessageIcon";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x004f:
        r6.f12445c = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f12443a;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f12443a = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
    L_0x0058:
        r0 = r6.f12446d;
        if (r0 != 0) goto L_0x0063;
    L_0x005c:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f12446d = r0;
    L_0x0063:
        r0 = r6.f12446d;
        r7.a(r0);
        goto L_0x0000;
    L_0x0069:
        r0 = r7.f();
        r6.f12447e = r0;
        r0 = r6.f12443a;
        r0 = r0 | 4;
        r6.f12443a = r0;
        goto L_0x0000;
    L_0x0076:
        r0 = r7.f();
        r6.f12448f = r0;
        r0 = r6.f12443a;
        r0 = r0 | 8;
        r6.f12443a = r0;
        goto L_0x0000;
    L_0x0084:
        r0 = r7.f();
        r6.f12449g = r0;
        r0 = r6.f12443a;
        r0 = r0 | 16;
        r6.f12443a = r0;
        goto L_0x0000;
    L_0x0092:
        r0 = r6.f12450h;
        if (r0 != 0) goto L_0x009d;
    L_0x0096:
        r0 = new com.google.android.finsky.cv.a.gh;
        r0.<init>();
        r6.f12450h = r0;
    L_0x009d:
        r0 = r6.f12450h;
        r7.a(r0);
        goto L_0x0000;
    L_0x00a4:
        r0 = r6.f12451i;
        if (r0 != 0) goto L_0x00af;
    L_0x00a8:
        r0 = new com.google.android.finsky.cv.a.gg;
        r0.<init>();
        r6.f12451i = r0;
    L_0x00af:
        r0 = r6.f12451i;
        r7.a(r0);
        goto L_0x0000;
    L_0x00b6:
        r0 = r6.f12452j;
        if (r0 != 0) goto L_0x00c1;
    L_0x00ba:
        r0 = new com.google.android.finsky.cv.a.gg;
        r0.<init>();
        r6.f12452j = r0;
    L_0x00c1:
        r0 = r6.f12452j;
        r7.a(r0);
        goto L_0x0000;
    L_0x00c8:
        r0 = r7.g();
        r6.f12453k = r0;
        r0 = r6.f12443a;
        r0 = r0 | 32;
        r6.f12443a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.gi.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.gi");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12645b(aVar);
    }
}

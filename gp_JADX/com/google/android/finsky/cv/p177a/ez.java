package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ez extends C0758b {
    public static volatile ez[] f12337a;
    public int f12338b;
    public int f12339c;
    public bd f12340d;
    public String f12341e;
    public ai f12342f;

    public static ez[] ba_() {
        if (f12337a == null) {
            synchronized (h.b) {
                if (f12337a == null) {
                    f12337a = new ez[0];
                }
            }
        }
        return f12337a;
    }

    public ez() {
        this.f12338b = 0;
        this.f12339c = 0;
        this.f12340d = null;
        this.f12341e = "";
        this.f12342f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        if ((this.f12338b & 1) != (ezVar.f12338b & 1)) {
            return false;
        }
        if (this.f12339c != ezVar.f12339c) {
            return false;
        }
        if (this.f12340d == null) {
            if (ezVar.f12340d != null) {
                return false;
            }
        } else if (!this.f12340d.equals(ezVar.f12340d)) {
            return false;
        }
        if ((this.f12338b & 2) != (ezVar.f12338b & 2)) {
            return false;
        }
        if (!this.f12341e.equals(ezVar.f12341e)) {
            return false;
        }
        if (this.f12342f == null) {
            if (ezVar.f12342f != null) {
                return false;
            }
        } else if (!this.f12342f.equals(ezVar.f12342f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ezVar.aO);
        }
        if (ezVar.aO == null || ezVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12339c;
        bd bdVar = this.f12340d;
        hashCode = (((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f12341e.hashCode();
        ai aiVar = this.f12342f;
        hashCode = ((aiVar == null ? 0 : aiVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12338b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12339c);
        }
        if (this.f12340d != null) {
            codedOutputByteBufferNano.b(2, this.f12340d);
        }
        if ((this.f12338b & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12341e);
        }
        if (this.f12342f != null) {
            codedOutputByteBufferNano.b(4, this.f12342f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12338b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12339c);
        }
        if (this.f12340d != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12340d);
        }
        if ((this.f12338b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12341e);
        }
        if (this.f12342f != null) {
            return b + CodedOutputByteBufferNano.d(4, this.f12342f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.ez m12557b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x005c;
            case 34: goto L_0x0069;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f12338b;
        r1 = r1 | 1;
        r6.f12338b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Type";
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
        r6.f12339c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f12338b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f12338b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r6.f12340d;
        if (r0 != 0) goto L_0x0056;
    L_0x004f:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f12340d = r0;
    L_0x0056:
        r0 = r6.f12340d;
        r7.a(r0);
        goto L_0x0000;
    L_0x005c:
        r0 = r7.f();
        r6.f12341e = r0;
        r0 = r6.f12338b;
        r0 = r0 | 2;
        r6.f12338b = r0;
        goto L_0x0000;
    L_0x0069:
        r0 = r6.f12342f;
        if (r0 != 0) goto L_0x0074;
    L_0x006d:
        r0 = new com.google.android.finsky.cv.a.ai;
        r0.<init>();
        r6.f12342f = r0;
    L_0x0074:
        r0 = r6.f12342f;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.ez.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.ez");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12557b(aVar);
    }
}

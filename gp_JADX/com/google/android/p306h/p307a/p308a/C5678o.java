package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5678o extends C0758b {
    public String f28784a;
    public C5676m f28785b;
    public C5677n f28786c;
    public Long f28787d;
    public C5670g f28788e;
    public Integer f28789f;
    public C5683t f28790g;
    public Integer f28791h;
    public Integer f28792i;
    public Integer f28793j;
    public C5675l[] f28794k;
    public Boolean f28795l;
    public Boolean f28796m;
    public C5680q f28797n;
    public C5665b f28798o;
    public C5673j f28799p;
    public C5674k f28800q;

    public C5678o() {
        this.f28784a = null;
        this.f28785b = null;
        this.f28786c = null;
        this.f28787d = null;
        this.f28788e = null;
        this.f28790g = null;
        this.f28794k = C5675l.m26891a();
        this.f28795l = null;
        this.f28796m = null;
        this.f28797n = null;
        this.f28798o = null;
        this.f28799p = null;
        this.f28800q = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28784a != null) {
            codedOutputByteBufferNano.a(1, this.f28784a);
        }
        if (this.f28785b != null) {
            codedOutputByteBufferNano.b(2, this.f28785b);
        }
        if (this.f28786c != null) {
            codedOutputByteBufferNano.b(3, this.f28786c);
        }
        if (this.f28787d != null) {
            codedOutputByteBufferNano.b(4, this.f28787d.longValue());
        }
        if (this.f28788e != null) {
            codedOutputByteBufferNano.b(5, this.f28788e);
        }
        if (this.f28789f != null) {
            codedOutputByteBufferNano.a(6, this.f28789f.intValue());
        }
        if (this.f28790g != null) {
            codedOutputByteBufferNano.b(7, this.f28790g);
        }
        if (this.f28791h != null) {
            codedOutputByteBufferNano.a(8, this.f28791h.intValue());
        }
        if (this.f28792i != null) {
            codedOutputByteBufferNano.a(9, this.f28792i.intValue());
        }
        if (this.f28793j != null) {
            codedOutputByteBufferNano.a(10, this.f28793j.intValue());
        }
        if (this.f28794k != null && this.f28794k.length > 0) {
            for (C0757i c0757i : this.f28794k) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(11, c0757i);
                }
            }
        }
        if (this.f28795l != null) {
            codedOutputByteBufferNano.a(12, this.f28795l.booleanValue());
        }
        if (this.f28796m != null) {
            codedOutputByteBufferNano.a(13, this.f28796m.booleanValue());
        }
        if (this.f28797n != null) {
            codedOutputByteBufferNano.b(14, this.f28797n);
        }
        if (this.f28798o != null) {
            codedOutputByteBufferNano.b(15, this.f28798o);
        }
        if (this.f28799p != null) {
            codedOutputByteBufferNano.b(16, this.f28799p);
        }
        if (this.f28800q != null) {
            codedOutputByteBufferNano.b(17, this.f28800q);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28784a != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28784a);
        }
        if (this.f28785b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f28785b);
        }
        if (this.f28786c != null) {
            b += CodedOutputByteBufferNano.d(3, this.f28786c);
        }
        if (this.f28787d != null) {
            b += CodedOutputByteBufferNano.f(4, this.f28787d.longValue());
        }
        if (this.f28788e != null) {
            b += CodedOutputByteBufferNano.d(5, this.f28788e);
        }
        if (this.f28789f != null) {
            b += CodedOutputByteBufferNano.d(6, this.f28789f.intValue());
        }
        if (this.f28790g != null) {
            b += CodedOutputByteBufferNano.d(7, this.f28790g);
        }
        if (this.f28791h != null) {
            b += CodedOutputByteBufferNano.d(8, this.f28791h.intValue());
        }
        if (this.f28792i != null) {
            b += CodedOutputByteBufferNano.d(9, this.f28792i.intValue());
        }
        if (this.f28793j != null) {
            b += CodedOutputByteBufferNano.d(10, this.f28793j.intValue());
        }
        if (this.f28794k != null && this.f28794k.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f28794k) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(11, c0757i);
                }
            }
            b = i;
        }
        if (this.f28795l != null) {
            this.f28795l.booleanValue();
            b += CodedOutputByteBufferNano.d(12) + 1;
        }
        if (this.f28796m != null) {
            this.f28796m.booleanValue();
            b += CodedOutputByteBufferNano.d(13) + 1;
        }
        if (this.f28797n != null) {
            b += CodedOutputByteBufferNano.d(14, this.f28797n);
        }
        if (this.f28798o != null) {
            b += CodedOutputByteBufferNano.d(15, this.f28798o);
        }
        if (this.f28799p != null) {
            b += CodedOutputByteBufferNano.d(16, this.f28799p);
        }
        if (this.f28800q != null) {
            return b + CodedOutputByteBufferNano.d(17, this.f28800q);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.p306h.p307a.p308a.C5678o m26901b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0016;
            case 26: goto L_0x0027;
            case 32: goto L_0x0038;
            case 42: goto L_0x0043;
            case 48: goto L_0x0054;
            case 58: goto L_0x008a;
            case 64: goto L_0x009c;
            case 72: goto L_0x00d3;
            case 80: goto L_0x010a;
            case 90: goto L_0x0141;
            case 96: goto L_0x0181;
            case 104: goto L_0x018d;
            case 114: goto L_0x0199;
            case 122: goto L_0x01ab;
            case 130: goto L_0x01bd;
            case 138: goto L_0x01cf;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.f();
        r7.f28784a = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = r7.f28785b;
        if (r0 != 0) goto L_0x0021;
    L_0x001a:
        r0 = new com.google.android.h.a.a.m;
        r0.<init>();
        r7.f28785b = r0;
    L_0x0021:
        r0 = r7.f28785b;
        r8.a(r0);
        goto L_0x0001;
    L_0x0027:
        r0 = r7.f28786c;
        if (r0 != 0) goto L_0x0032;
    L_0x002b:
        r0 = new com.google.android.h.a.a.n;
        r0.<init>();
        r7.f28786c = r0;
    L_0x0032:
        r0 = r7.f28786c;
        r8.a(r0);
        goto L_0x0001;
    L_0x0038:
        r2 = r8.j();
        r0 = java.lang.Long.valueOf(r2);
        r7.f28787d = r0;
        goto L_0x0001;
    L_0x0043:
        r0 = r7.f28788e;
        if (r0 != 0) goto L_0x004e;
    L_0x0047:
        r0 = new com.google.android.h.a.a.g;
        r0.<init>();
        r7.f28788e = r0;
    L_0x004e:
        r0 = r7.f28788e;
        r8.a(r0);
        goto L_0x0001;
    L_0x0054:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x007a }
        switch(r3) {
            case 0: goto L_0x0082;
            case 1: goto L_0x0082;
            case 2: goto L_0x0082;
            case 3: goto L_0x0082;
            case 4: goto L_0x0082;
            default: goto L_0x005f;
        };	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x005f:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007a }
        r5 = 43;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007a }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x007a }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x007a }
        r5 = " is not a valid enum OptInUxType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x007a }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x007a }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x007a }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x007a:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0082:
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalArgumentException -> 0x007a }
        r7.f28789f = r3;	 Catch:{ IllegalArgumentException -> 0x007a }
        goto L_0x0001;
    L_0x008a:
        r0 = r7.f28790g;
        if (r0 != 0) goto L_0x0095;
    L_0x008e:
        r0 = new com.google.android.h.a.a.t;
        r0.<init>();
        r7.f28790g = r0;
    L_0x0095:
        r0 = r7.f28790g;
        r8.a(r0);
        goto L_0x0001;
    L_0x009c:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00c2 }
        switch(r3) {
            case 0: goto L_0x00cb;
            case 1: goto L_0x00cb;
            case 2: goto L_0x00cb;
            case 3: goto L_0x00cb;
            case 4: goto L_0x00cb;
            case 5: goto L_0x00cb;
            default: goto L_0x00a7;
        };	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00a7:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r5 = 36;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r5 = " is not a valid enum Type";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00c2:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00cb:
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r7.f28791h = r3;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        goto L_0x0001;
    L_0x00d3:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00f9 }
        switch(r3) {
            case 1: goto L_0x0102;
            case 2: goto L_0x0102;
            case 3: goto L_0x0102;
            case 4: goto L_0x0102;
            case 5: goto L_0x0102;
            case 6: goto L_0x0102;
            default: goto L_0x00de;
        };	 Catch:{ IllegalArgumentException -> 0x00f9 }
    L_0x00de:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00f9 }
        r5 = 55;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00f9 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00f9 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00f9 }
        r5 = " is not a valid enum OptInPositiveActionText";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00f9 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00f9 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00f9 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00f9 }
    L_0x00f9:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0102:
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalArgumentException -> 0x00f9 }
        r7.f28792i = r3;	 Catch:{ IllegalArgumentException -> 0x00f9 }
        goto L_0x0001;
    L_0x010a:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0130 }
        switch(r3) {
            case 1: goto L_0x0139;
            case 2: goto L_0x0139;
            case 3: goto L_0x0139;
            case 4: goto L_0x0139;
            case 5: goto L_0x0139;
            case 6: goto L_0x0139;
            default: goto L_0x0115;
        };	 Catch:{ IllegalArgumentException -> 0x0130 }
    L_0x0115:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0130 }
        r5 = 55;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0130 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0130 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0130 }
        r5 = " is not a valid enum OptInNegativeActionText";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0130 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0130 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0130 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0130 }
    L_0x0130:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0139:
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalArgumentException -> 0x0130 }
        r7.f28793j = r3;	 Catch:{ IllegalArgumentException -> 0x0130 }
        goto L_0x0001;
    L_0x0141:
        r0 = 90;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f28794k;
        if (r0 != 0) goto L_0x016d;
    L_0x014b:
        r0 = r1;
    L_0x014c:
        r2 = r2 + r0;
        r2 = new com.google.android.p306h.p307a.p308a.C5675l[r2];
        if (r0 == 0) goto L_0x0156;
    L_0x0151:
        r3 = r7.f28794k;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0156:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0171;
    L_0x015b:
        r3 = new com.google.android.h.a.a.l;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0156;
    L_0x016d:
        r0 = r7.f28794k;
        r0 = r0.length;
        goto L_0x014c;
    L_0x0171:
        r3 = new com.google.android.h.a.a.l;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f28794k = r2;
        goto L_0x0001;
    L_0x0181:
        r0 = r8.e();
        r0 = java.lang.Boolean.valueOf(r0);
        r7.f28795l = r0;
        goto L_0x0001;
    L_0x018d:
        r0 = r8.e();
        r0 = java.lang.Boolean.valueOf(r0);
        r7.f28796m = r0;
        goto L_0x0001;
    L_0x0199:
        r0 = r7.f28797n;
        if (r0 != 0) goto L_0x01a4;
    L_0x019d:
        r0 = new com.google.android.h.a.a.q;
        r0.<init>();
        r7.f28797n = r0;
    L_0x01a4:
        r0 = r7.f28797n;
        r8.a(r0);
        goto L_0x0001;
    L_0x01ab:
        r0 = r7.f28798o;
        if (r0 != 0) goto L_0x01b6;
    L_0x01af:
        r0 = new com.google.android.h.a.a.b;
        r0.<init>();
        r7.f28798o = r0;
    L_0x01b6:
        r0 = r7.f28798o;
        r8.a(r0);
        goto L_0x0001;
    L_0x01bd:
        r0 = r7.f28799p;
        if (r0 != 0) goto L_0x01c8;
    L_0x01c1:
        r0 = new com.google.android.h.a.a.j;
        r0.<init>();
        r7.f28799p = r0;
    L_0x01c8:
        r0 = r7.f28799p;
        r8.a(r0);
        goto L_0x0001;
    L_0x01cf:
        r0 = r7.f28800q;
        if (r0 != 0) goto L_0x01da;
    L_0x01d3:
        r0 = new com.google.android.h.a.a.k;
        r0.<init>();
        r7.f28800q = r0;
    L_0x01da:
        r0 = r7.f28800q;
        r8.a(r0);
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.h.a.a.o.b(com.google.protobuf.nano.a):com.google.android.h.a.a.o");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m26901b(aVar);
    }
}

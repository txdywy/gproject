package com.google.protobuf.nano;

import java.lang.reflect.Array;
import java.util.List;

public final class C7215d extends C7214c {
    public final int f35453f = 0;
    public final int f35454g = 0;

    public C7215d(Class cls) {
        super(8, cls, 395706712);
    }

    protected final Object mo6226a(C7213a c7213a) {
        try {
            switch (this.a) {
                case 1:
                    return Double.valueOf(Double.longBitsToDouble(c7213a.m33570l()));
                case 2:
                    return Float.valueOf(Float.intBitsToFloat(c7213a.m33569k()));
                case 3:
                    return Long.valueOf(c7213a.m33568j());
                case 4:
                    return Long.valueOf(c7213a.m33568j());
                case 5:
                    return Integer.valueOf(c7213a.m33567i());
                case 6:
                    return Long.valueOf(c7213a.m33570l());
                case 7:
                    return Integer.valueOf(c7213a.m33569k());
                case 8:
                    return Boolean.valueOf(c7213a.m33563e());
                case 9:
                    return c7213a.m33564f();
                case 12:
                    return c7213a.m33565g();
                case 13:
                    return Integer.valueOf(c7213a.m33567i());
                case 14:
                    return Integer.valueOf(c7213a.m33567i());
                case 15:
                    return Integer.valueOf(c7213a.m33569k());
                case 16:
                    return Long.valueOf(c7213a.m33570l());
                case 17:
                    int i = c7213a.m33567i();
                    return Integer.valueOf((-(i & 1)) ^ (i >>> 1));
                case 18:
                    long j = c7213a.m33568j();
                    return Long.valueOf((-(j & 1)) ^ (j >>> 1));
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        }
        throw new IllegalArgumentException("Error reading extension field", e);
    }

    protected final void mo6227a(C7221k c7221k, List list) {
        if (c7221k.f35466a == this.f35453f) {
            byte[] bArr = c7221k.f35467b;
            list.add(mo6226a(C7213a.m33546a(bArr, 0, bArr.length)));
            return;
        }
        bArr = c7221k.f35467b;
        C7213a a = C7213a.m33546a(bArr, 0, bArr.length);
        try {
            a.m33558c(a.m33567i());
            while (!a.m33572n()) {
                list.add(mo6226a(a));
            }
        } catch (Throwable e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        }
    }

    protected final void mo6228a(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        try {
            codedOutputByteBufferNano.m33539e(this.c);
            switch (this.a) {
                case 1:
                    codedOutputByteBufferNano.m33513a(((Double) obj).doubleValue());
                    return;
                case 2:
                    codedOutputByteBufferNano.m33514a(((Float) obj).floatValue());
                    return;
                case 3:
                    codedOutputByteBufferNano.m33533b(((Long) obj).longValue());
                    return;
                case 4:
                    codedOutputByteBufferNano.m33533b(((Long) obj).longValue());
                    return;
                case 5:
                    codedOutputByteBufferNano.m33515a(((Integer) obj).intValue());
                    return;
                case 6:
                    codedOutputByteBufferNano.m33538d(((Long) obj).longValue());
                    return;
                case 7:
                    codedOutputByteBufferNano.m33541g(((Integer) obj).intValue());
                    return;
                case 8:
                    codedOutputByteBufferNano.m33527a(((Boolean) obj).booleanValue());
                    return;
                case 9:
                    codedOutputByteBufferNano.m33526a((String) obj);
                    return;
                case 12:
                    codedOutputByteBufferNano.m33528a((byte[]) obj);
                    return;
                case 13:
                    codedOutputByteBufferNano.m33539e(((Integer) obj).intValue());
                    return;
                case 14:
                    codedOutputByteBufferNano.m33539e(((Integer) obj).intValue());
                    return;
                case 15:
                    codedOutputByteBufferNano.m33541g(((Integer) obj).intValue());
                    return;
                case 16:
                    codedOutputByteBufferNano.m33538d(((Long) obj).longValue());
                    return;
                case 17:
                    codedOutputByteBufferNano.m33529b(((Integer) obj).intValue());
                    return;
                case 18:
                    codedOutputByteBufferNano.m33524a(((Long) obj).longValue());
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo6230c(java.lang.Object r7, com.google.protobuf.nano.CodedOutputByteBufferNano r8) {
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.c;
        r2 = r6.f35453f;
        if (r1 != r2) goto L_0x000b;
    L_0x0007:
        super.mo6230c(r7, r8);
    L_0x000a:
        return;
    L_0x000b:
        r1 = r6.c;
        r2 = r6.f35454g;
        if (r1 != r2) goto L_0x00f2;
    L_0x0011:
        r1 = java.lang.reflect.Array.getLength(r7);
        r2 = r6.m33584d(r7);
        r3 = r6.c;	 Catch:{ IOException -> 0x0043 }
        r8.m33539e(r3);	 Catch:{ IOException -> 0x0043 }
        r8.m33539e(r2);	 Catch:{ IOException -> 0x0043 }
        r2 = r6.a;	 Catch:{ IOException -> 0x0043 }
        switch(r2) {
            case 1: goto L_0x0092;
            case 2: goto L_0x006e;
            case 3: goto L_0x00c2;
            case 4: goto L_0x00da;
            case 5: goto L_0x009e;
            case 6: goto L_0x007a;
            case 7: goto L_0x0056;
            case 8: goto L_0x004a;
            case 9: goto L_0x0026;
            case 10: goto L_0x0026;
            case 11: goto L_0x0026;
            case 12: goto L_0x0026;
            case 13: goto L_0x00b6;
            case 14: goto L_0x00e6;
            case 15: goto L_0x0062;
            case 16: goto L_0x0086;
            case 17: goto L_0x00aa;
            case 18: goto L_0x00ce;
            default: goto L_0x0026;
        };	 Catch:{ IOException -> 0x0043 }
    L_0x0026:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0043 }
        r1 = r6.a;	 Catch:{ IOException -> 0x0043 }
        r2 = 27;
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0043 }
        r3.<init>(r2);	 Catch:{ IOException -> 0x0043 }
        r2 = "Unpackable type ";
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x0043 }
        r1 = r2.append(r1);	 Catch:{ IOException -> 0x0043 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0043 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0043 }
        throw r0;	 Catch:{ IOException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r1.<init>(r0);
        throw r1;
    L_0x004a:
        if (r0 >= r1) goto L_0x000a;
    L_0x004c:
        r2 = java.lang.reflect.Array.getBoolean(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33527a(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x004a;
    L_0x0056:
        if (r0 >= r1) goto L_0x000a;
    L_0x0058:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33541g(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x0056;
    L_0x0062:
        if (r0 >= r1) goto L_0x000a;
    L_0x0064:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33541g(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x0062;
    L_0x006e:
        if (r0 >= r1) goto L_0x000a;
    L_0x0070:
        r2 = java.lang.reflect.Array.getFloat(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33514a(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x006e;
    L_0x007a:
        if (r0 >= r1) goto L_0x000a;
    L_0x007c:
        r2 = java.lang.reflect.Array.getLong(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33538d(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x007a;
    L_0x0086:
        if (r0 >= r1) goto L_0x000a;
    L_0x0088:
        r2 = java.lang.reflect.Array.getLong(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33538d(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x0086;
    L_0x0092:
        if (r0 >= r1) goto L_0x000a;
    L_0x0094:
        r2 = java.lang.reflect.Array.getDouble(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33513a(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x0092;
    L_0x009e:
        if (r0 >= r1) goto L_0x000a;
    L_0x00a0:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33515a(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x009e;
    L_0x00aa:
        if (r0 >= r1) goto L_0x000a;
    L_0x00ac:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33529b(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00aa;
    L_0x00b6:
        if (r0 >= r1) goto L_0x000a;
    L_0x00b8:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33539e(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00b6;
    L_0x00c2:
        if (r0 >= r1) goto L_0x000a;
    L_0x00c4:
        r2 = java.lang.reflect.Array.getLong(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33533b(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00c2;
    L_0x00ce:
        if (r0 >= r1) goto L_0x000a;
    L_0x00d0:
        r2 = java.lang.reflect.Array.getLong(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33524a(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00ce;
    L_0x00da:
        if (r0 >= r1) goto L_0x000a;
    L_0x00dc:
        r2 = java.lang.reflect.Array.getLong(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33533b(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00da;
    L_0x00e6:
        if (r0 >= r1) goto L_0x000a;
    L_0x00e8:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.m33539e(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00e6;
    L_0x00f2:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.c;
        r2 = r6.f35453f;
        r3 = r6.f35454g;
        r4 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Unexpected repeated extension tag ";
        r4 = r5.append(r4);
        r1 = r4.append(r1);
        r4 = ", unequal to both non-packed variant ";
        r1 = r1.append(r4);
        r1 = r1.append(r2);
        r2 = " and packed variant ";
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.d.c(java.lang.Object, com.google.protobuf.nano.CodedOutputByteBufferNano):void");
    }

    private final int m33584d(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        int i2;
        int c;
        switch (this.a) {
            case 1:
            case 6:
            case 16:
                return length * 8;
            case 2:
            case 7:
            case 15:
                return length * 4;
            case 3:
                i2 = 0;
                while (i2 < length) {
                    c = CodedOutputByteBufferNano.m33500c(Array.getLong(obj, i2)) + i;
                    i2++;
                    i = c;
                }
                return i;
            case 4:
                i2 = 0;
                while (i2 < length) {
                    c = CodedOutputByteBufferNano.m33500c(Array.getLong(obj, i2)) + i;
                    i2++;
                    i = c;
                }
                return i;
            case 5:
                i2 = 0;
                while (i2 < length) {
                    c = CodedOutputByteBufferNano.m33498c(Array.getInt(obj, i2)) + i;
                    i2++;
                    i = c;
                }
                return i;
            case 8:
                return length;
            case 13:
                i2 = 0;
                while (i2 < length) {
                    c = CodedOutputByteBufferNano.m33507f(Array.getInt(obj, i2)) + i;
                    i2++;
                    i = c;
                }
                return i;
            case 14:
                i2 = 0;
                while (i2 < length) {
                    c = CodedOutputByteBufferNano.m33507f(Array.getInt(obj, i2)) + i;
                    i2++;
                    i = c;
                }
                return i;
            case 17:
                i2 = 0;
                while (i2 < length) {
                    c = CodedOutputByteBufferNano.m33507f(CodedOutputByteBufferNano.m33510h(Array.getInt(obj, i2))) + i;
                    i2++;
                    i = c;
                }
                return i;
            case 18:
                i2 = 0;
                while (i2 < length) {
                    c = CodedOutputByteBufferNano.m33500c(CodedOutputByteBufferNano.m33506e(Array.getLong(obj, i2))) + i;
                    i2++;
                    i = c;
                }
                return i;
            default:
                throw new IllegalArgumentException("Unexpected non-packable type " + this.a);
        }
    }

    protected final int mo6225a(Object obj) {
        if (this.c == this.f35453f) {
            return super.mo6225a(obj);
        }
        if (this.c == this.f35454g) {
            int d = m33584d(obj);
            return (d + CodedOutputByteBufferNano.m33507f(d)) + CodedOutputByteBufferNano.m33507f(this.c);
        }
        int i = this.c;
        int i2 = this.f35453f;
        throw new IllegalArgumentException("Unexpected repeated extension tag " + i + ", unequal to both non-packed variant " + i2 + " and packed variant " + this.f35454g);
    }

    protected final int mo6229b(Object obj) {
        int i = this.c >>> 3;
        switch (this.a) {
            case 1:
                ((Double) obj).doubleValue();
                return CodedOutputByteBufferNano.m33501d(i) + 8;
            case 2:
                ((Float) obj).floatValue();
                return CodedOutputByteBufferNano.m33501d(i) + 4;
            case 3:
                return CodedOutputByteBufferNano.m33508f(i, ((Long) obj).longValue());
            case 4:
                return CodedOutputByteBufferNano.m33505e(i, ((Long) obj).longValue());
            case 5:
                return CodedOutputByteBufferNano.m33502d(i, ((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return CodedOutputByteBufferNano.m33501d(i) + 8;
            case 7:
                ((Integer) obj).intValue();
                return CodedOutputByteBufferNano.m33501d(i) + 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return CodedOutputByteBufferNano.m33501d(i) + 1;
            case 9:
                return CodedOutputByteBufferNano.m33493b(i, (String) obj);
            case 12:
                return CodedOutputByteBufferNano.m33494b(i, (byte[]) obj);
            case 13:
                return CodedOutputByteBufferNano.m33504e(i, ((Integer) obj).intValue());
            case 14:
                return CodedOutputByteBufferNano.m33501d(i) + CodedOutputByteBufferNano.m33507f(((Integer) obj).intValue());
            case 15:
                ((Integer) obj).intValue();
                return CodedOutputByteBufferNano.m33501d(i) + 4;
            case 16:
                ((Long) obj).longValue();
                return CodedOutputByteBufferNano.m33501d(i) + 8;
            case 17:
                return CodedOutputByteBufferNano.m33501d(i) + CodedOutputByteBufferNano.m33507f(CodedOutputByteBufferNano.m33510h(((Integer) obj).intValue()));
            case 18:
                return CodedOutputByteBufferNano.m33509g(i, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException("Unknown type " + this.a);
        }
    }
}

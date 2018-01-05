package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class cj implements de {
    public final long f35253a;
    public final long f35254b;
    public final ByteBuffer buffer;
    public final int f35255c;
    public final int f35256d;
    public final int f35257e;
    public final cl f35258f;
    public final az f35259g;
    public final az f35260h;
    public final cp f35261i;
    public final bp f35262j;
    public final cf f35263k;
    public final du f35264l;
    public final boolean f35265m;
    public final aj f35266n;
    public final boolean f35267o;
    public final boolean f35268p;
    public final ca f35269q;
    public final az f35270r;
    public final long[] f35271s;
    public final int[] f35272t;

    private cj(ByteBuffer byteBuffer, long j, long j2, int i, int i2, int i3, boolean z, boolean z2, Class cls, az azVar, az azVar2, cp cpVar, bp bpVar, du duVar, aj ajVar, ca caVar, az azVar3, cf cfVar, long[] jArr, int[] iArr) {
        cl cmVar;
        this.buffer = byteBuffer;
        this.f35253a = j;
        this.f35254b = j2;
        this.f35255c = i;
        this.f35256d = i2;
        this.f35257e = i3;
        if (z) {
            cmVar = new cm(this);
        } else {
            cmVar = new ck(this);
        }
        this.f35258f = cmVar;
        this.f35259g = azVar;
        this.f35260h = azVar2;
        this.f35261i = cpVar;
        this.f35262j = bpVar;
        this.f35264l = duVar;
        boolean z3 = ajVar != null && ajVar.mo6107a(cls);
        this.f35265m = z3;
        this.f35266n = ajVar;
        this.f35267o = at.class.isAssignableFrom(cls);
        this.f35268p = z2;
        this.f35263k = cfVar;
        this.f35269q = caVar;
        this.f35270r = azVar3;
        this.f35271s = jArr;
        this.f35272t = iArr;
    }

    static cj m33083a(Class cls, cd cdVar, cp cpVar, bp bpVar, du duVar, aj ajVar, ca caVar) {
        if (cdVar instanceof cw) {
            int i;
            int i2;
            int i3;
            int[] iArr;
            cw cwVar = (cw) cdVar;
            boolean z = cwVar.mo6165a() == ct.PROTO3;
            if (cwVar.f35290b.f35296e == 0) {
                i = 0;
                i2 = 0;
                i3 = 0;
            } else {
                i = cwVar.f35290b.f35299h;
                i2 = cwVar.f35290b.f35300i;
                i3 = (i2 - i) + 1;
            }
            i3 *= 16;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 + 8);
            long a = ea.m33359a(allocateDirect);
            if ((7 & a) != 0) {
                a = (a & -8) + 8;
            }
            long j = ((long) i3) + a;
            long[] jArr = cwVar.f35290b.f35301j > 0 ? new long[cwVar.f35290b.f35301j] : null;
            if (cwVar.f35290b.f35302k > 0) {
                iArr = new int[cwVar.f35290b.f35302k];
            } else {
                iArr = null;
            }
            cx cxVar = cwVar.f35290b;
            if (cxVar.m33147a()) {
                int i4 = cxVar.f35310s;
                i3 = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int i7;
                    long j2;
                    if (i6 >= ((i4 - i) << 4)) {
                        j2 = ((long) i6) + a;
                        m33088a(cxVar, j2);
                        i4 = cxVar.f35312u;
                        if (i4 == ao.MAP.ordinal()) {
                            i4 = i5 + 1;
                            jArr[i5] = j2;
                        } else if (i4 < 18 || i4 > 49) {
                            i4 = i5;
                        } else {
                            i4 = i3 + 1;
                            iArr[i3] = (int) ((long) (m33082a(j2) & 1048575));
                            i3 = i4;
                            i4 = i5;
                        }
                        if (!cxVar.m33147a()) {
                            break;
                        }
                        i5 = i4;
                        i4 = i3;
                        i3 = cxVar.f35310s;
                    } else {
                        long j3 = 16 + (((long) i6) + a);
                        for (j2 = ((long) i6) + a; j2 < j3; j2 += 8) {
                            ea.f35383g.mo6213b(j2);
                        }
                        i7 = i4;
                        i4 = i3;
                        i3 = i7;
                    }
                    i6 += 16;
                    i7 = i3;
                    i3 = i4;
                    i4 = i7;
                }
            }
            return new cj(allocateDirect, a, j, cwVar.f35290b.f35296e, i, i2, true, z, cls, cxVar.m33150d(), cxVar.m33151e(), cpVar, bpVar, duVar, ajVar, caVar, cxVar.m33152f(), cwVar.f35289a, jArr, iArr);
        }
        throw new NoSuchMethodError();
    }

    static cj m33098b(Class cls, cd cdVar, cp cpVar, bp bpVar, du duVar, aj ajVar, ca caVar) {
        if (cdVar instanceof cw) {
            int[] iArr;
            cw cwVar = (cw) cdVar;
            boolean equals = ct.PROTO3.equals(cwVar.mo6165a());
            int i = cwVar.f35290b.f35296e;
            int i2 = i * 16;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 + 8);
            long a = ea.m33359a(allocateDirect);
            if ((7 & a) != 0) {
                a = (a & -8) + 8;
            }
            long j = ((long) i2) + a;
            long[] jArr = cwVar.f35290b.f35301j > 0 ? new long[cwVar.f35290b.f35301j] : null;
            if (cwVar.f35290b.f35302k > 0) {
                iArr = new int[cwVar.f35290b.f35302k];
            } else {
                iArr = null;
            }
            int i3 = 0;
            i2 = 0;
            cx cxVar = cwVar.f35290b;
            long j2 = a;
            while (cxVar.m33147a()) {
                m33088a(cxVar, j2);
                int i4 = cxVar.f35312u;
                if (i4 == ao.MAP.f35168Z) {
                    i4 = i3 + 1;
                    jArr[i3] = j2;
                    i3 = i4;
                } else if (i4 >= 18 && i4 <= 49) {
                    i4 = i2 + 1;
                    iArr[i2] = (int) ((long) (m33082a(j2) & 1048575));
                    i2 = i4;
                }
                j2 += 16;
            }
            i3 = -1;
            int i5 = -1;
            if (i > 0) {
                i3 = cwVar.f35290b.f35299h;
                i5 = cwVar.f35290b.f35300i;
            }
            return new cj(allocateDirect, a, j, i, i3, i5, false, equals, cls, cxVar.m33150d(), cxVar.m33151e(), cpVar, bpVar, duVar, ajVar, caVar, cxVar.m33152f(), cwVar.f35289a, jArr, iArr);
        }
        throw new NoSuchMethodError();
    }

    private static void m33088a(cx cxVar, long j) {
        int i;
        int i2;
        int a;
        int i3;
        int i4 = 1;
        int i5 = 0;
        Object obj;
        Field field;
        if (cxVar.m33148b()) {
            i = cxVar.f35313v * 2;
            obj = cxVar.f35293b[i];
            if (obj instanceof Field) {
                field = (Field) obj;
            } else {
                field = cx.m33140a(cxVar.f35294c, (String) obj);
                cxVar.f35293b[i] = field;
            }
            i = (int) ea.f35383g.m33392a(field);
            i2 = (cxVar.f35313v * 2) + 1;
            obj = cxVar.f35293b[i2];
            if (obj instanceof Field) {
                field = (Field) obj;
            } else {
                field = cx.m33140a(cxVar.f35294c, (String) obj);
                cxVar.f35293b[i2] = field;
            }
            a = (int) ea.f35383g.m33392a(field);
            i2 = i;
            i = 0;
        } else {
            i2 = (int) ea.f35383g.m33392a(cxVar.f35315x);
            if (cxVar.m33149c()) {
                i = (cxVar.f35314w / 32) + (cxVar.f35297f * 2);
                obj = cxVar.f35293b[i];
                if (obj instanceof Field) {
                    field = (Field) obj;
                } else {
                    field = cx.m33140a(cxVar.f35294c, (String) obj);
                    cxVar.f35293b[i] = field;
                }
                a = (int) ea.f35383g.m33392a(field);
                i = cxVar.f35314w % 32;
            } else {
                a = 0;
                i = 0;
            }
        }
        ea.m33364a(j, cxVar.f35310s);
        long j2 = 4 + j;
        if ((cxVar.f35311t & 512) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i3 != 0) {
            i3 = 536870912;
        } else {
            i3 = 0;
        }
        if ((cxVar.f35311t & 256) == 0) {
            i4 = 0;
        }
        if (i4 != 0) {
            i5 = 268435456;
        }
        ea.m33364a(j2, ((i5 | i3) | (cxVar.f35312u << 20)) | i2);
        ea.m33364a(8 + j, a | (i << 20));
    }

    public final Object mo6156a() {
        return this.f35261i.mo6164a(this.f35263k);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6159a(java.lang.Object r12, java.lang.Object r13) {
        /*
        r11 = this;
        r3 = 1;
        r10 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r2 = 0;
        r0 = r11.f35253a;
    L_0x0007:
        r4 = r11.f35254b;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 >= 0) goto L_0x01d2;
    L_0x000d:
        r4 = m33082a(r0);
        r5 = r4 & r10;
        r6 = (long) r5;
        r5 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r4 = r4 & r5;
        r4 = r4 >>> 20;
        switch(r4) {
            case 0: goto L_0x0021;
            case 1: goto L_0x0035;
            case 2: goto L_0x0047;
            case 3: goto L_0x005b;
            case 4: goto L_0x006f;
            case 5: goto L_0x0081;
            case 6: goto L_0x0095;
            case 7: goto L_0x00a8;
            case 8: goto L_0x00bb;
            case 9: goto L_0x00d2;
            case 10: goto L_0x00e9;
            case 11: goto L_0x0100;
            case 12: goto L_0x0113;
            case 13: goto L_0x0126;
            case 14: goto L_0x0139;
            case 15: goto L_0x014e;
            case 16: goto L_0x0161;
            case 17: goto L_0x0176;
            case 18: goto L_0x018d;
            case 19: goto L_0x018d;
            case 20: goto L_0x018d;
            case 21: goto L_0x018d;
            case 22: goto L_0x018d;
            case 23: goto L_0x018d;
            case 24: goto L_0x018d;
            case 25: goto L_0x018d;
            case 26: goto L_0x018d;
            case 27: goto L_0x018d;
            case 28: goto L_0x018d;
            case 29: goto L_0x018d;
            case 30: goto L_0x018d;
            case 31: goto L_0x018d;
            case 32: goto L_0x018d;
            case 33: goto L_0x018d;
            case 34: goto L_0x018d;
            case 35: goto L_0x018d;
            case 36: goto L_0x018d;
            case 37: goto L_0x018d;
            case 38: goto L_0x018d;
            case 39: goto L_0x018d;
            case 40: goto L_0x018d;
            case 41: goto L_0x018d;
            case 42: goto L_0x018d;
            case 43: goto L_0x018d;
            case 44: goto L_0x018d;
            case 45: goto L_0x018d;
            case 46: goto L_0x018d;
            case 47: goto L_0x018d;
            case 48: goto L_0x018d;
            case 49: goto L_0x018d;
            case 50: goto L_0x019b;
            case 51: goto L_0x01a9;
            case 52: goto L_0x01a9;
            case 53: goto L_0x01a9;
            case 54: goto L_0x01a9;
            case 55: goto L_0x01a9;
            case 56: goto L_0x01a9;
            case 57: goto L_0x01a9;
            case 58: goto L_0x01a9;
            case 59: goto L_0x01a9;
            case 60: goto L_0x01a9;
            case 61: goto L_0x01a9;
            case 62: goto L_0x01a9;
            case 63: goto L_0x01a9;
            case 64: goto L_0x01a9;
            case 65: goto L_0x01a9;
            case 66: goto L_0x01a9;
            case 67: goto L_0x01a9;
            case 68: goto L_0x01a9;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r3;
    L_0x001d:
        if (r4 != 0) goto L_0x01cd;
    L_0x001f:
        r0 = r2;
    L_0x0020:
        return r0;
    L_0x0021:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x0033;
    L_0x0027:
        r4 = com.google.protobuf.ea.m33374b(r12, r6);
        r6 = com.google.protobuf.ea.m33374b(r13, r6);
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 == 0) goto L_0x001c;
    L_0x0033:
        r4 = r2;
        goto L_0x001d;
    L_0x0035:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x0045;
    L_0x003b:
        r4 = com.google.protobuf.ea.m33358a(r12, r6);
        r5 = com.google.protobuf.ea.m33358a(r13, r6);
        if (r4 == r5) goto L_0x001c;
    L_0x0045:
        r4 = r2;
        goto L_0x001d;
    L_0x0047:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x0059;
    L_0x004d:
        r4 = com.google.protobuf.ea.m33374b(r12, r6);
        r6 = com.google.protobuf.ea.m33374b(r13, r6);
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 == 0) goto L_0x001c;
    L_0x0059:
        r4 = r2;
        goto L_0x001d;
    L_0x005b:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x006d;
    L_0x0061:
        r4 = com.google.protobuf.ea.m33374b(r12, r6);
        r6 = com.google.protobuf.ea.m33374b(r13, r6);
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 == 0) goto L_0x001c;
    L_0x006d:
        r4 = r2;
        goto L_0x001d;
    L_0x006f:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x007f;
    L_0x0075:
        r4 = com.google.protobuf.ea.m33358a(r12, r6);
        r5 = com.google.protobuf.ea.m33358a(r13, r6);
        if (r4 == r5) goto L_0x001c;
    L_0x007f:
        r4 = r2;
        goto L_0x001d;
    L_0x0081:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x0093;
    L_0x0087:
        r4 = com.google.protobuf.ea.m33374b(r12, r6);
        r6 = com.google.protobuf.ea.m33374b(r13, r6);
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 == 0) goto L_0x001c;
    L_0x0093:
        r4 = r2;
        goto L_0x001d;
    L_0x0095:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x00a5;
    L_0x009b:
        r4 = com.google.protobuf.ea.m33358a(r12, r6);
        r5 = com.google.protobuf.ea.m33358a(r13, r6);
        if (r4 == r5) goto L_0x001c;
    L_0x00a5:
        r4 = r2;
        goto L_0x001d;
    L_0x00a8:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x00b8;
    L_0x00ae:
        r4 = com.google.protobuf.ea.m33381c(r12, r6);
        r5 = com.google.protobuf.ea.m33381c(r13, r6);
        if (r4 == r5) goto L_0x001c;
    L_0x00b8:
        r4 = r2;
        goto L_0x001d;
    L_0x00bb:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x00cf;
    L_0x00c1:
        r4 = com.google.protobuf.ea.m33385f(r12, r6);
        r5 = com.google.protobuf.ea.m33385f(r13, r6);
        r4 = com.google.protobuf.dg.m33255a(r4, r5);
        if (r4 != 0) goto L_0x001c;
    L_0x00cf:
        r4 = r2;
        goto L_0x001d;
    L_0x00d2:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x00e6;
    L_0x00d8:
        r4 = com.google.protobuf.ea.m33385f(r12, r6);
        r5 = com.google.protobuf.ea.m33385f(r13, r6);
        r4 = com.google.protobuf.dg.m33255a(r4, r5);
        if (r4 != 0) goto L_0x001c;
    L_0x00e6:
        r4 = r2;
        goto L_0x001d;
    L_0x00e9:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x00fd;
    L_0x00ef:
        r4 = com.google.protobuf.ea.m33385f(r12, r6);
        r5 = com.google.protobuf.ea.m33385f(r13, r6);
        r4 = com.google.protobuf.dg.m33255a(r4, r5);
        if (r4 != 0) goto L_0x001c;
    L_0x00fd:
        r4 = r2;
        goto L_0x001d;
    L_0x0100:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x0110;
    L_0x0106:
        r4 = com.google.protobuf.ea.m33358a(r12, r6);
        r5 = com.google.protobuf.ea.m33358a(r13, r6);
        if (r4 == r5) goto L_0x001c;
    L_0x0110:
        r4 = r2;
        goto L_0x001d;
    L_0x0113:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x0123;
    L_0x0119:
        r4 = com.google.protobuf.ea.m33358a(r12, r6);
        r5 = com.google.protobuf.ea.m33358a(r13, r6);
        if (r4 == r5) goto L_0x001c;
    L_0x0123:
        r4 = r2;
        goto L_0x001d;
    L_0x0126:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x0136;
    L_0x012c:
        r4 = com.google.protobuf.ea.m33358a(r12, r6);
        r5 = com.google.protobuf.ea.m33358a(r13, r6);
        if (r4 == r5) goto L_0x001c;
    L_0x0136:
        r4 = r2;
        goto L_0x001d;
    L_0x0139:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x014b;
    L_0x013f:
        r4 = com.google.protobuf.ea.m33374b(r12, r6);
        r6 = com.google.protobuf.ea.m33374b(r13, r6);
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 == 0) goto L_0x001c;
    L_0x014b:
        r4 = r2;
        goto L_0x001d;
    L_0x014e:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x015e;
    L_0x0154:
        r4 = com.google.protobuf.ea.m33358a(r12, r6);
        r5 = com.google.protobuf.ea.m33358a(r13, r6);
        if (r4 == r5) goto L_0x001c;
    L_0x015e:
        r4 = r2;
        goto L_0x001d;
    L_0x0161:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x0173;
    L_0x0167:
        r4 = com.google.protobuf.ea.m33374b(r12, r6);
        r6 = com.google.protobuf.ea.m33374b(r13, r6);
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 == 0) goto L_0x001c;
    L_0x0173:
        r4 = r2;
        goto L_0x001d;
    L_0x0176:
        r4 = r11.m33102c(r12, r13, r0);
        if (r4 == 0) goto L_0x018a;
    L_0x017c:
        r4 = com.google.protobuf.ea.m33385f(r12, r6);
        r5 = com.google.protobuf.ea.m33385f(r13, r6);
        r4 = com.google.protobuf.dg.m33255a(r4, r5);
        if (r4 != 0) goto L_0x001c;
    L_0x018a:
        r4 = r2;
        goto L_0x001d;
    L_0x018d:
        r4 = com.google.protobuf.ea.m33385f(r12, r6);
        r5 = com.google.protobuf.ea.m33385f(r13, r6);
        r4 = com.google.protobuf.dg.m33255a(r4, r5);
        goto L_0x001d;
    L_0x019b:
        r4 = com.google.protobuf.ea.m33385f(r12, r6);
        r5 = com.google.protobuf.ea.m33385f(r13, r6);
        r4 = com.google.protobuf.dg.m33255a(r4, r5);
        goto L_0x001d;
    L_0x01a9:
        r4 = m33097b(r0);
        r5 = r4 & r10;
        r8 = (long) r5;
        r5 = com.google.protobuf.ea.m33358a(r12, r8);
        r4 = r4 & r10;
        r8 = (long) r4;
        r4 = com.google.protobuf.ea.m33358a(r13, r8);
        if (r5 != r4) goto L_0x01ca;
    L_0x01bc:
        r4 = com.google.protobuf.ea.m33385f(r12, r6);
        r5 = com.google.protobuf.ea.m33385f(r13, r6);
        r4 = com.google.protobuf.dg.m33255a(r4, r5);
        if (r4 != 0) goto L_0x001c;
    L_0x01ca:
        r4 = r2;
        goto L_0x001d;
    L_0x01cd:
        r4 = 16;
        r0 = r0 + r4;
        goto L_0x0007;
    L_0x01d2:
        r0 = r11.f35264l;
        r0 = r0.mo6195b(r12);
        r1 = r11.f35264l;
        r1 = r1.mo6195b(r13);
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x01e7;
    L_0x01e4:
        r0 = r2;
        goto L_0x0020;
    L_0x01e7:
        r0 = r11.f35265m;
        if (r0 == 0) goto L_0x01fd;
    L_0x01eb:
        r0 = r11.f35266n;
        r0 = r0.mo6103a(r12);
        r1 = r11.f35266n;
        r1 = r1.mo6103a(r13);
        r0 = r0.equals(r1);
        goto L_0x0020;
    L_0x01fd:
        r0 = r3;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.cj.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6155a(java.lang.Object r12) {
        /*
        r11 = this;
        r5 = 37;
        r2 = 0;
        r0 = r11.f35253a;
        r9 = r0;
        r0 = r2;
        r2 = r9;
    L_0x0008:
        r6 = r11.f35254b;
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 >= 0) goto L_0x0283;
    L_0x000e:
        r1 = m33082a(r2);
        r4 = com.google.protobuf.ea.f35383g;
        r4 = r4.mo6205a(r2);
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r6 = r6 & r1;
        r6 = (long) r6;
        r8 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r1 = r1 & r8;
        r1 = r1 >>> 20;
        switch(r1) {
            case 0: goto L_0x002c;
            case 1: goto L_0x003d;
            case 2: goto L_0x004a;
            case 3: goto L_0x0057;
            case 4: goto L_0x0064;
            case 5: goto L_0x006d;
            case 6: goto L_0x007a;
            case 7: goto L_0x0083;
            case 8: goto L_0x0090;
            case 9: goto L_0x009f;
            case 10: goto L_0x00af;
            case 11: goto L_0x00bd;
            case 12: goto L_0x00c7;
            case 13: goto L_0x00d1;
            case 14: goto L_0x00db;
            case 15: goto L_0x00e9;
            case 16: goto L_0x00f3;
            case 17: goto L_0x0101;
            case 18: goto L_0x0111;
            case 19: goto L_0x0111;
            case 20: goto L_0x0111;
            case 21: goto L_0x0111;
            case 22: goto L_0x0111;
            case 23: goto L_0x0111;
            case 24: goto L_0x0111;
            case 25: goto L_0x0111;
            case 26: goto L_0x0111;
            case 27: goto L_0x0111;
            case 28: goto L_0x0111;
            case 29: goto L_0x0111;
            case 30: goto L_0x0111;
            case 31: goto L_0x0111;
            case 32: goto L_0x0111;
            case 33: goto L_0x0111;
            case 34: goto L_0x0111;
            case 35: goto L_0x0111;
            case 36: goto L_0x0111;
            case 37: goto L_0x0111;
            case 38: goto L_0x0111;
            case 39: goto L_0x0111;
            case 40: goto L_0x0111;
            case 41: goto L_0x0111;
            case 42: goto L_0x0111;
            case 43: goto L_0x0111;
            case 44: goto L_0x0111;
            case 45: goto L_0x0111;
            case 46: goto L_0x0111;
            case 47: goto L_0x0111;
            case 48: goto L_0x0111;
            case 49: goto L_0x0111;
            case 50: goto L_0x011f;
            case 51: goto L_0x012d;
            case 52: goto L_0x0145;
            case 53: goto L_0x0159;
            case 54: goto L_0x016d;
            case 55: goto L_0x0181;
            case 56: goto L_0x0191;
            case 57: goto L_0x01a5;
            case 58: goto L_0x01b5;
            case 59: goto L_0x01c9;
            case 60: goto L_0x01df;
            case 61: goto L_0x01f3;
            case 62: goto L_0x0207;
            case 63: goto L_0x0217;
            case 64: goto L_0x0227;
            case 65: goto L_0x0237;
            case 66: goto L_0x024b;
            case 67: goto L_0x025b;
            case 68: goto L_0x026f;
            default: goto L_0x0025;
        };
    L_0x0025:
        r4 = r0;
    L_0x0026:
        r0 = 16;
        r0 = r0 + r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0008;
    L_0x002c:
        r0 = r0 * 53;
        r6 = com.google.protobuf.ea.m33384e(r12, r6);
        r6 = java.lang.Double.doubleToLongBits(r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x003d:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33382d(r12, r6);
        r1 = java.lang.Float.floatToIntBits(r1);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x004a:
        r0 = r0 * 53;
        r6 = com.google.protobuf.ea.m33374b(r12, r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0057:
        r0 = r0 * 53;
        r6 = com.google.protobuf.ea.m33374b(r12, r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0064:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33358a(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x006d:
        r0 = r0 * 53;
        r6 = com.google.protobuf.ea.m33374b(r12, r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x007a:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33358a(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0083:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33381c(r12, r6);
        r1 = com.google.protobuf.bb.m32992a(r1);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0090:
        r1 = r0 * 53;
        r0 = com.google.protobuf.ea.m33385f(r12, r6);
        r0 = (java.lang.String) r0;
        r0 = r0.hashCode();
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x009f:
        r1 = com.google.protobuf.ea.m33385f(r12, r6);
        if (r1 == 0) goto L_0x02a5;
    L_0x00a5:
        r1 = r1.hashCode();
    L_0x00a9:
        r0 = r0 * 53;
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x00af:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33385f(r12, r6);
        r1 = r1.hashCode();
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x00bd:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33358a(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x00c7:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33358a(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x00d1:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33358a(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x00db:
        r0 = r0 * 53;
        r6 = com.google.protobuf.ea.m33374b(r12, r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x00e9:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33358a(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x00f3:
        r0 = r0 * 53;
        r6 = com.google.protobuf.ea.m33374b(r12, r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0101:
        r1 = com.google.protobuf.ea.m33385f(r12, r6);
        if (r1 == 0) goto L_0x02a2;
    L_0x0107:
        r1 = r1.hashCode();
    L_0x010b:
        r0 = r0 * 53;
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0111:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33385f(r12, r6);
        r1 = r1.hashCode();
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x011f:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33385f(r12, r6);
        r1 = r1.hashCode();
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x012d:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x0133:
        r0 = r0 * 53;
        r6 = m33096b(r12, r6);
        r6 = java.lang.Double.doubleToLongBits(r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0145:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x014b:
        r0 = r0 * 53;
        r1 = m33101c(r12, r6);
        r1 = java.lang.Float.floatToIntBits(r1);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0159:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x015f:
        r0 = r0 * 53;
        r6 = m33104e(r12, r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x016d:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x0173:
        r0 = r0 * 53;
        r6 = m33104e(r12, r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0181:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x0187:
        r0 = r0 * 53;
        r1 = m33103d(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0191:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x0197:
        r0 = r0 * 53;
        r6 = m33104e(r12, r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x01a5:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x01ab:
        r0 = r0 * 53;
        r1 = m33103d(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x01b5:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x01bb:
        r0 = r0 * 53;
        r1 = m33105f(r12, r6);
        r1 = com.google.protobuf.bb.m32992a(r1);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x01c9:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x01cf:
        r1 = r0 * 53;
        r0 = com.google.protobuf.ea.m33385f(r12, r6);
        r0 = (java.lang.String) r0;
        r0 = r0.hashCode();
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x01df:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x01e5:
        r1 = com.google.protobuf.ea.m33385f(r12, r6);
        r0 = r0 * 53;
        r1 = r1.hashCode();
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x01f3:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x01f9:
        r0 = r0 * 53;
        r1 = com.google.protobuf.ea.m33385f(r12, r6);
        r1 = r1.hashCode();
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0207:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x020d:
        r0 = r0 * 53;
        r1 = m33103d(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0217:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x021d:
        r0 = r0 * 53;
        r1 = m33103d(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0227:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x022d:
        r0 = r0 * 53;
        r1 = m33103d(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0237:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x023d:
        r0 = r0 * 53;
        r6 = m33104e(r12, r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x024b:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x0251:
        r0 = r0 * 53;
        r1 = m33103d(r12, r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x025b:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x0261:
        r0 = r0 * 53;
        r6 = m33104e(r12, r6);
        r1 = com.google.protobuf.bb.m32991a(r6);
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x026f:
        r1 = m33095a(r12, r4, r2);
        if (r1 == 0) goto L_0x0025;
    L_0x0275:
        r1 = com.google.protobuf.ea.m33385f(r12, r6);
        r0 = r0 * 53;
        r1 = r1.hashCode();
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x0026;
    L_0x0283:
        r0 = r0 * 53;
        r1 = r11.f35264l;
        r1 = r1.mo6195b(r12);
        r1 = r1.hashCode();
        r0 = r0 + r1;
        r1 = r11.f35265m;
        if (r1 == 0) goto L_0x02a1;
    L_0x0294:
        r0 = r0 * 53;
        r1 = r11.f35266n;
        r1 = r1.mo6103a(r12);
        r1 = r1.hashCode();
        r0 = r0 + r1;
    L_0x02a1:
        return r0;
    L_0x02a2:
        r1 = r5;
        goto L_0x010b;
    L_0x02a5:
        r1 = r5;
        goto L_0x00a9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.cj.a(java.lang.Object):int");
    }

    public final void mo6161b(Object obj, Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException();
        }
        for (long j = this.f35253a; j < this.f35254b; j += 16) {
            int a = m33082a(j);
            long j2 = (long) (1048575 & a);
            int a2 = ea.f35383g.mo6205a(j);
            switch ((a & 267386880) >>> 20) {
                case 0:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33366a(obj, j2, ea.m33384e(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 1:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33367a(obj, j2, ea.m33382d(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 2:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33369a(obj, j2, ea.m33374b(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 3:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33369a(obj, j2, ea.m33374b(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 4:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33368a(obj, j2, ea.m33358a(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 5:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33369a(obj, j2, ea.m33374b(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 6:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33368a(obj, j2, ea.m33358a(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 7:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33371a(obj, j2, ea.m33381c(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 8:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33370a(obj, j2, ea.m33385f(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 9:
                    m33093a(obj, obj2, j);
                    break;
                case 10:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33370a(obj, j2, ea.m33385f(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 11:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33368a(obj, j2, ea.m33358a(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 12:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33368a(obj, j2, ea.m33358a(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 13:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33368a(obj, j2, ea.m33358a(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 14:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33369a(obj, j2, ea.m33374b(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 15:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33368a(obj, j2, ea.m33358a(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 16:
                    if (!m33106g(obj2, j)) {
                        break;
                    }
                    ea.m33369a(obj, j2, ea.m33374b(obj2, j2));
                    m33107h(obj, j);
                    break;
                case 17:
                    m33093a(obj, obj2, j);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f35262j.mo6144a(obj, obj2, j2);
                    break;
                case 50:
                    dg.m33251a(this.f35269q, obj, obj2, j2);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m33095a(obj2, a2, j)) {
                        break;
                    }
                    ea.m33370a(obj, j2, ea.m33385f(obj2, j2));
                    m33099b(obj, a2, j);
                    break;
                case 60:
                    m33100b(obj, obj2, j);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m33095a(obj2, a2, j)) {
                        break;
                    }
                    ea.m33370a(obj, j2, ea.m33385f(obj2, j2));
                    m33099b(obj, a2, j);
                    break;
                case 68:
                    m33100b(obj, obj2, j);
                    break;
                default:
                    break;
            }
        }
        if (!this.f35268p) {
            dg.m33252a(this.f35264l, obj, obj2);
            if (this.f35265m) {
                dg.m33250a(this.f35266n, obj, obj2);
            }
        }
    }

    private final void m33093a(Object obj, Object obj2, long j) {
        long a = (long) (m33082a(j) & 1048575);
        if (m33106g(obj2, j)) {
            Object f = ea.m33385f(obj, a);
            Object f2 = ea.m33385f(obj2, a);
            if (f != null && f2 != null) {
                ea.m33370a(obj, a, bb.m32994a(f, f2));
                m33107h(obj, j);
            } else if (f2 != null) {
                ea.m33370a(obj, a, f2);
                m33107h(obj, j);
            }
        }
    }

    private static void m33100b(Object obj, Object obj2, long j) {
        int a = m33082a(j);
        int a2 = ea.f35383g.mo6205a(j);
        long j2 = (long) (a & 1048575);
        if (m33095a(obj2, a2, j)) {
            Object f = ea.m33385f(obj, j2);
            Object f2 = ea.m33385f(obj2, j2);
            if (f != null && f2 != null) {
                ea.m33370a(obj, j2, bb.m32994a(f, f2));
                m33099b(obj, a2, j);
            } else if (f2 != null) {
                ea.m33370a(obj, j2, f2);
                m33099b(obj, a2, j);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6160b(java.lang.Object r11) {
        /*
        r10 = this;
        r9 = 1;
        r4 = 0;
        r0 = r10.f35253a;
        r2 = r0;
        r1 = r4;
    L_0x0006:
        r6 = r10.f35254b;
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x03a3;
    L_0x000c:
        r0 = m33082a(r2);
        r5 = com.google.protobuf.ea.f35383g;
        r5 = r5.mo6205a(r2);
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r6 = r6 & r0;
        r6 = (long) r6;
        r8 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r0 = r0 & r8;
        r0 = r0 >>> 20;
        switch(r0) {
            case 0: goto L_0x002c;
            case 1: goto L_0x0037;
            case 2: goto L_0x0042;
            case 3: goto L_0x0051;
            case 4: goto L_0x0060;
            case 5: goto L_0x006f;
            case 6: goto L_0x007a;
            case 7: goto L_0x0085;
            case 8: goto L_0x0090;
            case 9: goto L_0x00ad;
            case 10: goto L_0x00bd;
            case 11: goto L_0x00cf;
            case 12: goto L_0x00df;
            case 13: goto L_0x00ef;
            case 14: goto L_0x00fb;
            case 15: goto L_0x0107;
            case 16: goto L_0x0117;
            case 17: goto L_0x0127;
            case 18: goto L_0x0139;
            case 19: goto L_0x0143;
            case 20: goto L_0x014d;
            case 21: goto L_0x0157;
            case 22: goto L_0x0161;
            case 23: goto L_0x016b;
            case 24: goto L_0x0175;
            case 25: goto L_0x017f;
            case 26: goto L_0x0189;
            case 27: goto L_0x0193;
            case 28: goto L_0x019d;
            case 29: goto L_0x01a7;
            case 30: goto L_0x01b1;
            case 31: goto L_0x01bb;
            case 32: goto L_0x01c5;
            case 33: goto L_0x01cf;
            case 34: goto L_0x01d9;
            case 35: goto L_0x01e3;
            case 36: goto L_0x01ed;
            case 37: goto L_0x01f7;
            case 38: goto L_0x0201;
            case 39: goto L_0x020b;
            case 40: goto L_0x0215;
            case 41: goto L_0x021f;
            case 42: goto L_0x0229;
            case 43: goto L_0x0233;
            case 44: goto L_0x023d;
            case 45: goto L_0x0247;
            case 46: goto L_0x0251;
            case 47: goto L_0x025b;
            case 48: goto L_0x0265;
            case 49: goto L_0x026f;
            case 50: goto L_0x0279;
            case 51: goto L_0x028a;
            case 52: goto L_0x0296;
            case 53: goto L_0x02a2;
            case 54: goto L_0x02b2;
            case 55: goto L_0x02c2;
            case 56: goto L_0x02d2;
            case 57: goto L_0x02de;
            case 58: goto L_0x02ea;
            case 59: goto L_0x02f6;
            case 60: goto L_0x0314;
            case 61: goto L_0x0324;
            case 62: goto L_0x0336;
            case 63: goto L_0x0346;
            case 64: goto L_0x0356;
            case 65: goto L_0x0362;
            case 66: goto L_0x036e;
            case 67: goto L_0x037e;
            case 68: goto L_0x038e;
            default: goto L_0x0023;
        };
    L_0x0023:
        r0 = r4;
    L_0x0024:
        r5 = r1 + r0;
        r0 = 16;
        r0 = r0 + r2;
        r2 = r0;
        r1 = r5;
        goto L_0x0006;
    L_0x002c:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0032:
        r0 = com.google.protobuf.CodedOutputStream.m32618k(r5);
        goto L_0x0024;
    L_0x0037:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x003d:
        r0 = com.google.protobuf.CodedOutputStream.m32617j(r5);
        goto L_0x0024;
    L_0x0042:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0048:
        r6 = com.google.protobuf.ea.m33374b(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32596d(r5, r6);
        goto L_0x0024;
    L_0x0051:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0057:
        r6 = com.google.protobuf.ea.m33374b(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32601e(r5, r6);
        goto L_0x0024;
    L_0x0060:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0066:
        r0 = com.google.protobuf.ea.m33358a(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32605f(r5, r0);
        goto L_0x0024;
    L_0x006f:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0075:
        r0 = com.google.protobuf.CodedOutputStream.m32613h(r5);
        goto L_0x0024;
    L_0x007a:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0080:
        r0 = com.google.protobuf.CodedOutputStream.m32604f(r5);
        goto L_0x0024;
    L_0x0085:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x008b:
        r0 = com.google.protobuf.CodedOutputStream.m32619l(r5);
        goto L_0x0024;
    L_0x0090:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0096:
        r0 = com.google.protobuf.ea.m33385f(r11, r6);
        r6 = r0 instanceof com.google.protobuf.C7203j;
        if (r6 == 0) goto L_0x00a5;
    L_0x009e:
        r0 = (com.google.protobuf.C7203j) r0;
        r0 = com.google.protobuf.CodedOutputStream.m32593c(r5, r0);
        goto L_0x0024;
    L_0x00a5:
        r0 = (java.lang.String) r0;
        r0 = com.google.protobuf.CodedOutputStream.m32586b(r5, r0);
        goto L_0x0024;
    L_0x00ad:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x00b3:
        r0 = com.google.protobuf.ea.m33385f(r11, r6);
        r0 = com.google.protobuf.dg.m33241a(r5, r0);
        goto L_0x0024;
    L_0x00bd:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x00c3:
        r0 = com.google.protobuf.ea.m33385f(r11, r6);
        r0 = (com.google.protobuf.C7203j) r0;
        r0 = com.google.protobuf.CodedOutputStream.m32593c(r5, r0);
        goto L_0x0024;
    L_0x00cf:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x00d5:
        r0 = com.google.protobuf.ea.m33358a(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32611g(r5, r0);
        goto L_0x0024;
    L_0x00df:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x00e5:
        r0 = com.google.protobuf.ea.m33358a(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32616i(r5, r0);
        goto L_0x0024;
    L_0x00ef:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x00f5:
        r0 = com.google.protobuf.CodedOutputStream.m32610g(r5);
        goto L_0x0024;
    L_0x00fb:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0101:
        r0 = com.google.protobuf.CodedOutputStream.m32615i(r5);
        goto L_0x0024;
    L_0x0107:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x010d:
        r0 = com.google.protobuf.ea.m33358a(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32614h(r5, r0);
        goto L_0x0024;
    L_0x0117:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x011d:
        r6 = com.google.protobuf.ea.m33374b(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32606f(r5, r6);
        goto L_0x0024;
    L_0x0127:
        r0 = r10.m33106g(r11, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x012d:
        r0 = com.google.protobuf.ea.m33385f(r11, r6);
        r0 = (com.google.protobuf.cf) r0;
        r0 = com.google.protobuf.CodedOutputStream.m32607f(r5, r0);
        goto L_0x0024;
    L_0x0139:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33277i(r5, r0, r4);
        goto L_0x0024;
    L_0x0143:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33275h(r5, r0, r4);
        goto L_0x0024;
    L_0x014d:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33243a(r5, r0, r4);
        goto L_0x0024;
    L_0x0157:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33257b(r5, r0, r4);
        goto L_0x0024;
    L_0x0161:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33269e(r5, r0, r4);
        goto L_0x0024;
    L_0x016b:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33277i(r5, r0, r4);
        goto L_0x0024;
    L_0x0175:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33275h(r5, r0, r4);
        goto L_0x0024;
    L_0x017f:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33279j(r5, r0, r4);
        goto L_0x0024;
    L_0x0189:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33242a(r5, r0);
        goto L_0x0024;
    L_0x0193:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33256b(r5, r0);
        goto L_0x0024;
    L_0x019d:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33261c(r5, r0);
        goto L_0x0024;
    L_0x01a7:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33271f(r5, r0, r4);
        goto L_0x0024;
    L_0x01b1:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33266d(r5, r0, r4);
        goto L_0x0024;
    L_0x01bb:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33275h(r5, r0, r4);
        goto L_0x0024;
    L_0x01c5:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33277i(r5, r0, r4);
        goto L_0x0024;
    L_0x01cf:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33273g(r5, r0, r4);
        goto L_0x0024;
    L_0x01d9:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33262c(r5, r0, r4);
        goto L_0x0024;
    L_0x01e3:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33277i(r5, r0, r9);
        goto L_0x0024;
    L_0x01ed:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33275h(r5, r0, r9);
        goto L_0x0024;
    L_0x01f7:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33243a(r5, r0, r9);
        goto L_0x0024;
    L_0x0201:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33257b(r5, r0, r9);
        goto L_0x0024;
    L_0x020b:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33269e(r5, r0, r9);
        goto L_0x0024;
    L_0x0215:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33277i(r5, r0, r9);
        goto L_0x0024;
    L_0x021f:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33275h(r5, r0, r9);
        goto L_0x0024;
    L_0x0229:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33279j(r5, r0, r9);
        goto L_0x0024;
    L_0x0233:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33271f(r5, r0, r9);
        goto L_0x0024;
    L_0x023d:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33266d(r5, r0, r9);
        goto L_0x0024;
    L_0x0247:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33275h(r5, r0, r9);
        goto L_0x0024;
    L_0x0251:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33277i(r5, r0, r9);
        goto L_0x0024;
    L_0x025b:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33273g(r5, r0, r9);
        goto L_0x0024;
    L_0x0265:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33262c(r5, r0, r9);
        goto L_0x0024;
    L_0x026f:
        r0 = m33086a(r11, r6);
        r0 = com.google.protobuf.dg.m33265d(r5, r0);
        goto L_0x0024;
    L_0x0279:
        r0 = r10.f35269q;
        r6 = com.google.protobuf.ea.m33385f(r11, r6);
        r7 = r10.f35270r;
        r7.m32978a(r5);
        r0 = r0.mo6154e(r6);
        goto L_0x0024;
    L_0x028a:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0290:
        r0 = com.google.protobuf.CodedOutputStream.m32618k(r5);
        goto L_0x0024;
    L_0x0296:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x029c:
        r0 = com.google.protobuf.CodedOutputStream.m32617j(r5);
        goto L_0x0024;
    L_0x02a2:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x02a8:
        r6 = m33104e(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32596d(r5, r6);
        goto L_0x0024;
    L_0x02b2:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x02b8:
        r6 = m33104e(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32601e(r5, r6);
        goto L_0x0024;
    L_0x02c2:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x02c8:
        r0 = m33103d(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32605f(r5, r0);
        goto L_0x0024;
    L_0x02d2:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x02d8:
        r0 = com.google.protobuf.CodedOutputStream.m32613h(r5);
        goto L_0x0024;
    L_0x02de:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x02e4:
        r0 = com.google.protobuf.CodedOutputStream.m32604f(r5);
        goto L_0x0024;
    L_0x02ea:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x02f0:
        r0 = com.google.protobuf.CodedOutputStream.m32619l(r5);
        goto L_0x0024;
    L_0x02f6:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x02fc:
        r0 = com.google.protobuf.ea.m33385f(r11, r6);
        r6 = r0 instanceof com.google.protobuf.C7203j;
        if (r6 == 0) goto L_0x030c;
    L_0x0304:
        r0 = (com.google.protobuf.C7203j) r0;
        r0 = com.google.protobuf.CodedOutputStream.m32593c(r5, r0);
        goto L_0x0024;
    L_0x030c:
        r0 = (java.lang.String) r0;
        r0 = com.google.protobuf.CodedOutputStream.m32586b(r5, r0);
        goto L_0x0024;
    L_0x0314:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x031a:
        r0 = com.google.protobuf.ea.m33385f(r11, r6);
        r0 = com.google.protobuf.dg.m33241a(r5, r0);
        goto L_0x0024;
    L_0x0324:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x032a:
        r0 = com.google.protobuf.ea.m33385f(r11, r6);
        r0 = (com.google.protobuf.C7203j) r0;
        r0 = com.google.protobuf.CodedOutputStream.m32593c(r5, r0);
        goto L_0x0024;
    L_0x0336:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x033c:
        r0 = m33103d(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32611g(r5, r0);
        goto L_0x0024;
    L_0x0346:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x034c:
        r0 = m33103d(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32616i(r5, r0);
        goto L_0x0024;
    L_0x0356:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x035c:
        r0 = com.google.protobuf.CodedOutputStream.m32610g(r5);
        goto L_0x0024;
    L_0x0362:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0368:
        r0 = com.google.protobuf.CodedOutputStream.m32615i(r5);
        goto L_0x0024;
    L_0x036e:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0374:
        r0 = m33103d(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32614h(r5, r0);
        goto L_0x0024;
    L_0x037e:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0384:
        r6 = m33104e(r11, r6);
        r0 = com.google.protobuf.CodedOutputStream.m32606f(r5, r6);
        goto L_0x0024;
    L_0x038e:
        r0 = m33095a(r11, r5, r2);
        if (r0 == 0) goto L_0x03a0;
    L_0x0394:
        r0 = com.google.protobuf.ea.m33385f(r11, r6);
        r0 = (com.google.protobuf.cf) r0;
        r0 = com.google.protobuf.CodedOutputStream.m32607f(r5, r0);
        goto L_0x0024;
    L_0x03a0:
        r0 = r4;
        goto L_0x0024;
    L_0x03a3:
        r0 = r10.f35264l;
        r2 = r0.mo6195b(r11);
        r0 = r0.mo6203f(r2);
        r3 = r1 + r0;
        r0 = r10.f35265m;
        if (r0 == 0) goto L_0x0407;
    L_0x03b3:
        r0 = r10.f35266n;
        r2 = r0.mo6103a(r11);
        r1 = r4;
    L_0x03ba:
        r0 = r2.f35114a;
        r0 = r0.m33290b();
        if (r4 >= r0) goto L_0x03db;
    L_0x03c2:
        r0 = r2.f35114a;
        r5 = r0.m33291b(r4);
        r0 = r5.getKey();
        r0 = (com.google.protobuf.an) r0;
        r5 = r5.getValue();
        r0 = com.google.protobuf.am.m32907a(r0, r5);
        r0 = r0 + r1;
        r4 = r4 + 1;
        r1 = r0;
        goto L_0x03ba;
    L_0x03db:
        r0 = r2.f35114a;
        r0 = r0.m33292c();
        r4 = r0.iterator();
        r2 = r1;
    L_0x03e6:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0404;
    L_0x03ec:
        r0 = r4.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (com.google.protobuf.an) r1;
        r0 = r0.getValue();
        r0 = com.google.protobuf.am.m32907a(r1, r0);
        r1 = r2 + r0;
        r2 = r1;
        goto L_0x03e6;
    L_0x0404:
        r0 = r3 + r2;
    L_0x0406:
        return r0;
    L_0x0407:
        r0 = r3;
        goto L_0x0406;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.cj.b(java.lang.Object):int");
    }

    private static List m33086a(Object obj, long j) {
        return (List) ea.m33385f(obj, j);
    }

    public final void mo6158a(Object obj, eq eqVar) {
        Iterator it;
        Entry entry;
        long j;
        int a;
        int a2;
        Entry entry2;
        if (eqVar.mo6051a() == er.DESCENDING) {
            m33090a(this.f35264l, obj, eqVar);
            am a3 = this.f35265m ? this.f35266n.mo6103a(obj) : null;
            if (a3 == null) {
                it = null;
            } else if (a3.f35116c) {
                Object blVar = new bl(a3.f35114a.m33294d().iterator());
            } else {
                it = a3.f35114a.m33294d().iterator();
            }
            entry = (it == null || !it.hasNext()) ? null : (Entry) it.next();
            j = this.f35254b - 16;
            while (j >= this.f35253a) {
                a = m33082a(j);
                a2 = ea.f35383g.mo6205a(j);
                entry2 = entry;
                while (entry2 != null && this.f35266n.mo6102a(entry2) > a2) {
                    this.f35266n.mo6110b(entry2);
                    if (it.hasNext()) {
                        entry = (Entry) it.next();
                    } else {
                        entry = null;
                    }
                    entry2 = entry;
                }
                switch ((267386880 & a) >>> 20) {
                    case 0:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6053a(a2, ea.m33384e(obj, (long) (1048575 & a)));
                        break;
                    case 1:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6054a(a2, ea.m33382d(obj, (long) (1048575 & a)));
                        break;
                    case 2:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6056a(a2, ea.m33374b(obj, (long) (1048575 & a)));
                        break;
                    case 3:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6071c(a2, ea.m33374b(obj, (long) (1048575 & a)));
                        break;
                    case 4:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6070c(a2, ea.m33358a(obj, (long) (1048575 & a)));
                        break;
                    case 5:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6076d(a2, ea.m33374b(obj, (long) (1048575 & a)));
                        break;
                    case 6:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6075d(a2, ea.m33358a(obj, (long) (1048575 & a)));
                        break;
                    case 7:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6063a(a2, ea.m33381c(obj, (long) (1048575 & a)));
                        break;
                    case 8:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        m33087a(a2, ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                        break;
                    case 9:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6059a(a2, ea.m33385f(obj, (long) (1048575 & a)));
                        break;
                    case 10:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6058a(a2, (C7203j) ea.m33385f(obj, (long) (1048575 & a)));
                        break;
                    case 11:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6079e(a2, ea.m33358a(obj, (long) (1048575 & a)));
                        break;
                    case 12:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6065b(a2, ea.m33358a(obj, (long) (1048575 & a)));
                        break;
                    case 13:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6055a(a2, ea.m33358a(obj, (long) (1048575 & a)));
                        break;
                    case 14:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6066b(a2, ea.m33374b(obj, (long) (1048575 & a)));
                        break;
                    case 15:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6082f(a2, ea.m33358a(obj, (long) (1048575 & a)));
                        break;
                    case 16:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6080e(a2, ea.m33374b(obj, (long) (1048575 & a)));
                        break;
                    case 17:
                        if (!m33106g(obj, j)) {
                            break;
                        }
                        eqVar.mo6067b(a2, ea.m33385f(obj, (long) (1048575 & a)));
                        break;
                    case 18:
                        dg.m33249a(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 19:
                        dg.m33260b(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 20:
                        dg.m33264c(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 21:
                        dg.m33268d(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 22:
                        dg.m33276h(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 23:
                        dg.m33272f(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 24:
                        dg.m33281k(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 25:
                        dg.m33284n(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 26:
                        dg.m33248a(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                        break;
                    case 27:
                        dg.m33263c(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                        break;
                    case 28:
                        dg.m33259b(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                        break;
                    case 29:
                        dg.m33278i(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 30:
                        dg.m33283m(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 31:
                        dg.m33282l(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 32:
                        dg.m33274g(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 33:
                        dg.m33280j(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 34:
                        dg.m33270e(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                        break;
                    case 35:
                        dg.m33249a(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 36:
                        dg.m33260b(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 37:
                        dg.m33264c(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 38:
                        dg.m33268d(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 39:
                        dg.m33276h(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 40:
                        dg.m33272f(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 41:
                        dg.m33281k(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 42:
                        dg.m33284n(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 43:
                        dg.m33278i(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 44:
                        dg.m33283m(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 45:
                        dg.m33282l(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 46:
                        dg.m33274g(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 47:
                        dg.m33280j(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 48:
                        dg.m33270e(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                        break;
                    case 49:
                        dg.m33267d(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                        break;
                    case 50:
                        m33091a(eqVar, a2, ea.m33385f(obj, (long) (1048575 & a)));
                        break;
                    case 51:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6053a(a2, m33096b(obj, (long) (1048575 & a)));
                        break;
                    case 52:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6054a(a2, m33101c(obj, (long) (1048575 & a)));
                        break;
                    case 53:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6056a(a2, m33104e(obj, (long) (1048575 & a)));
                        break;
                    case 54:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6071c(a2, m33104e(obj, (long) (1048575 & a)));
                        break;
                    case 55:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6070c(a2, m33103d(obj, (long) (1048575 & a)));
                        break;
                    case 56:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6076d(a2, m33104e(obj, (long) (1048575 & a)));
                        break;
                    case 57:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6075d(a2, m33103d(obj, (long) (1048575 & a)));
                        break;
                    case 58:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6063a(a2, m33105f(obj, (long) (1048575 & a)));
                        break;
                    case 59:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        m33087a(a2, ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                        break;
                    case 60:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6059a(a2, ea.m33385f(obj, (long) (1048575 & a)));
                        break;
                    case 61:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6058a(a2, (C7203j) ea.m33385f(obj, (long) (1048575 & a)));
                        break;
                    case 62:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6079e(a2, m33103d(obj, (long) (1048575 & a)));
                        break;
                    case 63:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6065b(a2, m33103d(obj, (long) (1048575 & a)));
                        break;
                    case 64:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6055a(a2, m33103d(obj, (long) (1048575 & a)));
                        break;
                    case 65:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6066b(a2, m33104e(obj, (long) (1048575 & a)));
                        break;
                    case 66:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6082f(a2, m33103d(obj, (long) (1048575 & a)));
                        break;
                    case 67:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6080e(a2, m33104e(obj, (long) (1048575 & a)));
                        break;
                    case 68:
                        if (!m33095a(obj, a2, j)) {
                            break;
                        }
                        eqVar.mo6067b(a2, ea.m33385f(obj, (long) (1048575 & a)));
                        break;
                    default:
                        break;
                }
                j -= 16;
                entry = entry2;
            }
            while (entry != null) {
                this.f35266n.mo6110b(entry);
                entry = it.hasNext() ? (Entry) it.next() : null;
            }
            return;
        }
        am a4 = this.f35265m ? this.f35266n.mo6103a(obj) : null;
        it = a4 == null ? null : a4.m32918b();
        entry = (it == null || !it.hasNext()) ? null : (Entry) it.next();
        j = this.f35253a;
        while (j < this.f35254b) {
            a = m33082a(j);
            a2 = ea.f35383g.mo6205a(j);
            entry2 = entry;
            while (entry2 != null && this.f35266n.mo6102a(entry2) <= a2) {
                this.f35266n.mo6110b(entry2);
                if (it.hasNext()) {
                    entry = (Entry) it.next();
                } else {
                    entry = null;
                }
                entry2 = entry;
            }
            switch ((267386880 & a) >>> 20) {
                case 0:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6053a(a2, ea.m33384e(obj, (long) (1048575 & a)));
                    break;
                case 1:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6054a(a2, ea.m33382d(obj, (long) (1048575 & a)));
                    break;
                case 2:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6056a(a2, ea.m33374b(obj, (long) (1048575 & a)));
                    break;
                case 3:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6071c(a2, ea.m33374b(obj, (long) (1048575 & a)));
                    break;
                case 4:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6070c(a2, ea.m33358a(obj, (long) (1048575 & a)));
                    break;
                case 5:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6076d(a2, ea.m33374b(obj, (long) (1048575 & a)));
                    break;
                case 6:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6075d(a2, ea.m33358a(obj, (long) (1048575 & a)));
                    break;
                case 7:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6063a(a2, ea.m33381c(obj, (long) (1048575 & a)));
                    break;
                case 8:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    m33087a(a2, ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                    break;
                case 9:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6059a(a2, ea.m33385f(obj, (long) (1048575 & a)));
                    break;
                case 10:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6058a(a2, (C7203j) ea.m33385f(obj, (long) (1048575 & a)));
                    break;
                case 11:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6079e(a2, ea.m33358a(obj, (long) (1048575 & a)));
                    break;
                case 12:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6065b(a2, ea.m33358a(obj, (long) (1048575 & a)));
                    break;
                case 13:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6055a(a2, ea.m33358a(obj, (long) (1048575 & a)));
                    break;
                case 14:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6066b(a2, ea.m33374b(obj, (long) (1048575 & a)));
                    break;
                case 15:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6082f(a2, ea.m33358a(obj, (long) (1048575 & a)));
                    break;
                case 16:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6080e(a2, ea.m33374b(obj, (long) (1048575 & a)));
                    break;
                case 17:
                    if (!m33106g(obj, j)) {
                        break;
                    }
                    eqVar.mo6067b(a2, ea.m33385f(obj, (long) (1048575 & a)));
                    break;
                case 18:
                    dg.m33249a(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 19:
                    dg.m33260b(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 20:
                    dg.m33264c(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 21:
                    dg.m33268d(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 22:
                    dg.m33276h(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 23:
                    dg.m33272f(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 24:
                    dg.m33281k(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 25:
                    dg.m33284n(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 26:
                    dg.m33248a(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                    break;
                case 27:
                    dg.m33263c(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                    break;
                case 28:
                    dg.m33259b(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                    break;
                case 29:
                    dg.m33278i(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 30:
                    dg.m33283m(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 31:
                    dg.m33282l(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 32:
                    dg.m33274g(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 33:
                    dg.m33280j(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 34:
                    dg.m33270e(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, false);
                    break;
                case 35:
                    dg.m33249a(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 36:
                    dg.m33260b(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 37:
                    dg.m33264c(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 38:
                    dg.m33268d(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 39:
                    dg.m33276h(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 40:
                    dg.m33272f(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 41:
                    dg.m33281k(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 42:
                    dg.m33284n(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 43:
                    dg.m33278i(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 44:
                    dg.m33283m(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 45:
                    dg.m33282l(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 46:
                    dg.m33274g(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 47:
                    dg.m33280j(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 48:
                    dg.m33270e(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar, true);
                    break;
                case 49:
                    dg.m33267d(ea.f35383g.mo6205a(j), (List) ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                    break;
                case 50:
                    m33091a(eqVar, a2, ea.m33385f(obj, (long) (1048575 & a)));
                    break;
                case 51:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6053a(a2, m33096b(obj, (long) (1048575 & a)));
                    break;
                case 52:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6054a(a2, m33101c(obj, (long) (1048575 & a)));
                    break;
                case 53:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6056a(a2, m33104e(obj, (long) (1048575 & a)));
                    break;
                case 54:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6071c(a2, m33104e(obj, (long) (1048575 & a)));
                    break;
                case 55:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6070c(a2, m33103d(obj, (long) (1048575 & a)));
                    break;
                case 56:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6076d(a2, m33104e(obj, (long) (1048575 & a)));
                    break;
                case 57:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6075d(a2, m33103d(obj, (long) (1048575 & a)));
                    break;
                case 58:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6063a(a2, m33105f(obj, (long) (1048575 & a)));
                    break;
                case 59:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    m33087a(a2, ea.m33385f(obj, (long) (1048575 & a)), eqVar);
                    break;
                case 60:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6059a(a2, ea.m33385f(obj, (long) (1048575 & a)));
                    break;
                case 61:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6058a(a2, (C7203j) ea.m33385f(obj, (long) (1048575 & a)));
                    break;
                case 62:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6079e(a2, m33103d(obj, (long) (1048575 & a)));
                    break;
                case 63:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6065b(a2, m33103d(obj, (long) (1048575 & a)));
                    break;
                case 64:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6055a(a2, m33103d(obj, (long) (1048575 & a)));
                    break;
                case 65:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6066b(a2, m33104e(obj, (long) (1048575 & a)));
                    break;
                case 66:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6082f(a2, m33103d(obj, (long) (1048575 & a)));
                    break;
                case 67:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6080e(a2, m33104e(obj, (long) (1048575 & a)));
                    break;
                case 68:
                    if (!m33095a(obj, a2, j)) {
                        break;
                    }
                    eqVar.mo6067b(a2, ea.m33385f(obj, (long) (1048575 & a)));
                    break;
                default:
                    break;
            }
            j = 16 + j;
            entry = entry2;
        }
        while (entry != null) {
            this.f35266n.mo6110b(entry);
            entry = it.hasNext() ? (Entry) it.next() : null;
        }
        m33090a(this.f35264l, obj, eqVar);
    }

    private final void m33091a(eq eqVar, int i, Object obj) {
        if (obj != null) {
            ca caVar = this.f35269q;
            this.f35270r.m32978a(i);
            eqVar.mo6057a(i, caVar.mo6150b(), this.f35269q.mo6151b(obj));
        }
    }

    private static void m33090a(du duVar, Object obj, eq eqVar) {
        duVar.mo6191a(duVar.mo6195b(obj), eqVar);
    }

    public final void mo6157a(Object obj, cz czVar, ah ahVar) {
        if (ahVar == null) {
            throw new NullPointerException();
        }
        m33089a(this.f35264l, this.f35266n, obj, czVar, ahVar);
    }

    private final void m33089a(du duVar, aj ajVar, Object obj, cz czVar, ah ahVar) {
        Throwable th;
        Object obj2 = null;
        am amVar = null;
        while (true) {
            int p;
            Object obj3;
            int a = czVar.mo6261a();
            long a2 = this.f35258f.mo6163a(a);
            int a3;
            Object a4;
            if (a2 >= 0) {
                try {
                    a3 = m33082a(a2);
                    List a5;
                    switch ((267386880 & a3) >>> 20) {
                        case 0:
                            ea.m33366a(obj, (long) (1048575 & a3), czVar.mo6272d());
                            m33107h(obj, a2);
                            continue;
                        case 1:
                            ea.m33367a(obj, (long) (1048575 & a3), czVar.mo6274e());
                            m33107h(obj, a2);
                            continue;
                        case 2:
                            ea.m33369a(obj, (long) (1048575 & a3), czVar.mo6278g());
                            m33107h(obj, a2);
                            continue;
                        case 3:
                            ea.m33369a(obj, (long) (1048575 & a3), czVar.mo6276f());
                            m33107h(obj, a2);
                            continue;
                        case 4:
                            ea.m33368a(obj, (long) (1048575 & a3), czVar.mo6280h());
                            m33107h(obj, a2);
                            continue;
                        case 5:
                            ea.m33369a(obj, (long) (1048575 & a3), czVar.mo6282i());
                            m33107h(obj, a2);
                            continue;
                        case 6:
                            ea.m33368a(obj, (long) (1048575 & a3), czVar.mo6284j());
                            m33107h(obj, a2);
                            continue;
                        case 7:
                            ea.m33371a(obj, (long) (1048575 & a3), czVar.mo6287k());
                            m33107h(obj, a2);
                            continue;
                        case 8:
                            m33092a(obj, a3, czVar);
                            m33107h(obj, a2);
                            continue;
                        case 9:
                            if (!m33106g(obj, a2)) {
                                ea.m33370a(obj, (long) (1048575 & a3), czVar.mo6262a((Class) this.f35259g.m32978a(a), ahVar));
                                m33107h(obj, a2);
                                break;
                            }
                            ea.m33370a(obj, (long) (1048575 & a3), bb.m32994a(ea.m33385f(obj, (long) (1048575 & a3)), czVar.mo6262a((Class) this.f35259g.m32978a(a), ahVar)));
                            continue;
                        case 10:
                            ea.m33370a(obj, (long) (1048575 & a3), czVar.mo6292n());
                            m33107h(obj, a2);
                            continue;
                        case 11:
                            ea.m33368a(obj, (long) (1048575 & a3), czVar.mo6294o());
                            m33107h(obj, a2);
                            continue;
                        case 12:
                            p = czVar.mo6296p();
                            bd bdVar = (bd) this.f35260h.m32978a(a);
                            if (bdVar != null && bdVar.m33001a(p) == null) {
                                obj2 = dg.m33246a(a, p, obj2, duVar);
                                break;
                            }
                            ea.m33368a(obj, (long) (1048575 & a3), p);
                            m33107h(obj, a2);
                            continue;
                        case 13:
                            ea.m33368a(obj, (long) (1048575 & a3), czVar.mo6298q());
                            m33107h(obj, a2);
                            continue;
                        case 14:
                            ea.m33369a(obj, (long) (1048575 & a3), czVar.mo6300r());
                            m33107h(obj, a2);
                            continue;
                        case 15:
                            ea.m33368a(obj, (long) (1048575 & a3), czVar.mo6301s());
                            m33107h(obj, a2);
                            continue;
                        case 16:
                            ea.m33369a(obj, (long) (1048575 & a3), czVar.mo6302t());
                            m33107h(obj, a2);
                            continue;
                        case 17:
                            if (!m33106g(obj, a2)) {
                                ea.m33370a(obj, (long) (1048575 & a3), czVar.mo6267b((Class) this.f35259g.m32978a(a), ahVar));
                                m33107h(obj, a2);
                                break;
                            }
                            ea.m33370a(obj, (long) (1048575 & a3), bb.m32994a(ea.m33385f(obj, (long) (1048575 & a3)), czVar.mo6267b((Class) this.f35259g.m32978a(a), ahVar)));
                            continue;
                        case 18:
                            czVar.mo6263a(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 19:
                            czVar.mo6268b(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 20:
                            czVar.mo6273d(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 21:
                            czVar.mo6270c(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 22:
                            czVar.mo6275e(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 23:
                            czVar.mo6277f(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 24:
                            czVar.mo6279g(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 25:
                            czVar.mo6281h(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 26:
                            if (!m33094a(a3)) {
                                czVar.mo6283i(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                                break;
                            } else {
                                czVar.mo6285j(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                                continue;
                            }
                        case 27:
                            czVar.mo6264a(this.f35262j.mo6143a(obj, (long) (1048575 & a3)), (Class) this.f35259g.m32978a(a), ahVar);
                            continue;
                        case 28:
                            czVar.mo6286k(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 29:
                            czVar.mo6289l(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 30:
                            a5 = this.f35262j.mo6143a(obj, (long) (1048575 & a3));
                            czVar.mo6291m(a5);
                            obj2 = dg.m33247a(a, a5, (bd) this.f35260h.m32978a(a), obj2, duVar);
                            continue;
                        case 31:
                            czVar.mo6293n(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 32:
                            czVar.mo6295o(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 33:
                            czVar.mo6297p(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 34:
                            czVar.mo6299q(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 35:
                            czVar.mo6263a(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 36:
                            czVar.mo6268b(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 37:
                            czVar.mo6273d(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 38:
                            czVar.mo6270c(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 39:
                            czVar.mo6275e(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 40:
                            czVar.mo6277f(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 41:
                            czVar.mo6279g(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 42:
                            czVar.mo6281h(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 43:
                            czVar.mo6289l(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 44:
                            a5 = this.f35262j.mo6143a(obj, (long) (1048575 & a3));
                            czVar.mo6291m(a5);
                            obj2 = dg.m33247a(a, a5, (bd) this.f35260h.m32978a(a), obj2, duVar);
                            continue;
                        case 45:
                            czVar.mo6293n(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 46:
                            czVar.mo6295o(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 47:
                            czVar.mo6297p(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 48:
                            czVar.mo6299q(this.f35262j.mo6143a(obj, (long) (1048575 & a3)));
                            continue;
                        case 49:
                            czVar.mo6269b(this.f35262j.mo6143a(obj, (long) (1048575 & a3)), (Class) this.f35259g.m32978a(a), ahVar);
                            continue;
                        case 50:
                            this.f35270r.m32978a(a);
                            a2 = (long) (m33082a(a2) & 1048575);
                            Object f = ea.m33385f(obj, a2);
                            if (f == null) {
                                a4 = this.f35269q.mo6147a();
                                ea.m33370a(obj, a2, a4);
                            } else if (this.f35269q.mo6152c(f)) {
                                a4 = this.f35269q.mo6147a();
                                this.f35269q.mo6148a(a4, f);
                                ea.m33370a(obj, a2, a4);
                            } else {
                                a4 = f;
                            }
                            czVar.mo6265a(this.f35269q.mo6149a(a4), this.f35269q.mo6150b(), ahVar);
                            continue;
                        case 51:
                            ea.m33370a(obj, (long) (1048575 & a3), Double.valueOf(czVar.mo6272d()));
                            m33099b(obj, a, a2);
                            continue;
                        case 52:
                            ea.m33370a(obj, (long) (1048575 & a3), Float.valueOf(czVar.mo6274e()));
                            m33099b(obj, a, a2);
                            continue;
                        case 53:
                            ea.m33370a(obj, (long) (1048575 & a3), Long.valueOf(czVar.mo6278g()));
                            m33099b(obj, a, a2);
                            continue;
                        case 54:
                            ea.m33370a(obj, (long) (1048575 & a3), Long.valueOf(czVar.mo6276f()));
                            m33099b(obj, a, a2);
                            continue;
                        case 55:
                            ea.m33370a(obj, (long) (1048575 & a3), Integer.valueOf(czVar.mo6280h()));
                            m33099b(obj, a, a2);
                            continue;
                        case 56:
                            ea.m33370a(obj, (long) (1048575 & a3), Long.valueOf(czVar.mo6282i()));
                            m33099b(obj, a, a2);
                            continue;
                        case 57:
                            ea.m33370a(obj, (long) (1048575 & a3), Integer.valueOf(czVar.mo6284j()));
                            m33099b(obj, a, a2);
                            continue;
                        case 58:
                            ea.m33370a(obj, (long) (1048575 & a3), Boolean.valueOf(czVar.mo6287k()));
                            m33099b(obj, a, a2);
                            continue;
                        case 59:
                            m33092a(obj, a3, czVar);
                            m33099b(obj, a, a2);
                            continue;
                        case 60:
                            if (m33095a(obj, a, a2)) {
                                ea.m33370a(obj, (long) (a3 & 1048575), bb.m32994a(ea.m33385f(obj, (long) (1048575 & a3)), czVar.mo6262a((Class) this.f35259g.m32978a(a), ahVar)));
                            } else {
                                ea.m33370a(obj, (long) (1048575 & a3), czVar.mo6262a((Class) this.f35259g.m32978a(a), ahVar));
                                m33107h(obj, a2);
                            }
                            m33099b(obj, a, a2);
                            continue;
                        case 61:
                            ea.m33370a(obj, (long) (1048575 & a3), czVar.mo6292n());
                            m33099b(obj, a, a2);
                            continue;
                        case 62:
                            ea.m33370a(obj, (long) (1048575 & a3), Integer.valueOf(czVar.mo6294o()));
                            m33099b(obj, a, a2);
                            continue;
                        case 63:
                            ea.m33370a(obj, (long) (1048575 & a3), Integer.valueOf(czVar.mo6296p()));
                            m33099b(obj, a, a2);
                            continue;
                        case 64:
                            ea.m33370a(obj, (long) (1048575 & a3), Integer.valueOf(czVar.mo6298q()));
                            m33099b(obj, a, a2);
                            continue;
                        case 65:
                            ea.m33370a(obj, (long) (1048575 & a3), Long.valueOf(czVar.mo6300r()));
                            m33099b(obj, a, a2);
                            continue;
                        case 66:
                            ea.m33370a(obj, (long) (1048575 & a3), Integer.valueOf(czVar.mo6301s()));
                            m33099b(obj, a, a2);
                            continue;
                        case 67:
                            ea.m33370a(obj, (long) (1048575 & a3), Long.valueOf(czVar.mo6302t()));
                            m33099b(obj, a, a2);
                            continue;
                        case 68:
                            ea.m33370a(obj, (long) (1048575 & a3), czVar.mo6267b((Class) this.f35259g.m32978a(a), ahVar));
                            m33099b(obj, a, a2);
                            continue;
                        default:
                            if (obj2 == null) {
                                try {
                                    a4 = duVar.mo6194b();
                                } catch (InvalidWireTypeException e) {
                                    a4 = obj2;
                                    break;
                                }
                            }
                            a4 = obj2;
                            try {
                                if (duVar.m33313a(a4, czVar)) {
                                    obj2 = a4;
                                    continue;
                                } else {
                                    if (this.f35271s != null) {
                                        obj3 = a4;
                                        for (long a6 : this.f35271s) {
                                            obj3 = m33085a(obj, a6, obj3, duVar);
                                        }
                                    } else {
                                        obj3 = a4;
                                    }
                                    if (obj3 != null) {
                                        duVar.mo6198b(obj, obj3);
                                        return;
                                    }
                                    return;
                                }
                            } catch (InvalidWireTypeException e2) {
                                break;
                            }
                    }
                    try {
                        duVar.mo6193a();
                        if (a4 == null) {
                            obj2 = duVar.mo6199c(obj);
                        } else {
                            obj2 = a4;
                        }
                        if (!duVar.m33313a(obj2, czVar)) {
                            if (this.f35271s != null) {
                                obj3 = obj2;
                                for (long a62 : this.f35271s) {
                                    obj3 = m33085a(obj, a62, obj3, duVar);
                                }
                            } else {
                                obj3 = obj2;
                            }
                            if (obj3 != null) {
                                duVar.mo6198b(obj, obj3);
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj2 = a4;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else if (a == Integer.MAX_VALUE) {
                if (this.f35271s != null) {
                    obj3 = obj2;
                    for (long a622 : this.f35271s) {
                        obj3 = m33085a(obj, a622, obj3, duVar);
                    }
                } else {
                    obj3 = obj2;
                }
                if (obj3 != null) {
                    duVar.mo6198b(obj, obj3);
                    return;
                }
                return;
            } else {
                if (this.f35265m) {
                    a4 = ajVar.mo6105a(ahVar, this.f35263k, a);
                } else {
                    a4 = null;
                }
                if (a4 != null) {
                    am b;
                    if (amVar == null) {
                        b = ajVar.mo6108b(obj);
                    } else {
                        b = amVar;
                    }
                    obj2 = ajVar.mo6104a();
                    amVar = b;
                } else {
                    duVar.mo6193a();
                    if (obj2 == null) {
                        obj2 = duVar.mo6199c(obj);
                    }
                    if (!duVar.m33313a(obj2, czVar)) {
                        if (this.f35271s != null) {
                            obj3 = obj2;
                            for (long a6222 : this.f35271s) {
                                obj3 = m33085a(obj, a6222, obj3, duVar);
                            }
                        } else {
                            obj3 = obj2;
                        }
                        if (obj3 != null) {
                            duVar.mo6198b(obj, obj3);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        if (this.f35271s != null) {
            obj3 = obj2;
            for (long a62222 : this.f35271s) {
                obj3 = m33085a(obj, a62222, obj3, duVar);
            }
        } else {
            obj3 = obj2;
        }
        if (obj3 != null) {
            duVar.mo6198b(obj, obj3);
        }
        throw th;
    }

    public final void mo6162c(Object obj) {
        int i = 0;
        if (this.f35271s != null) {
            for (long a : this.f35271s) {
                long a2 = (long) (m33082a(a2) & 1048575);
                Object f = ea.m33385f(obj, a2);
                if (f != null) {
                    ea.m33370a(obj, a2, this.f35269q.mo6153d(f));
                }
            }
        }
        if (this.f35272t != null) {
            int[] iArr = this.f35272t;
            int length = iArr.length;
            while (i < length) {
                this.f35262j.mo6145b(obj, (long) iArr[i]);
                i++;
            }
        }
        this.f35264l.mo6201d(obj);
        if (this.f35265m) {
            this.f35266n.mo6112c(obj);
        }
    }

    private final Object m33085a(Object obj, long j, Object obj2, du duVar) {
        int a = ea.f35383g.mo6205a(j);
        Object f = ea.m33385f(obj, (long) (m33082a(j) & 1048575));
        if (f == null) {
            return obj2;
        }
        bd bdVar = (bd) this.f35260h.m32978a(a);
        if (bdVar == null) {
            return obj2;
        }
        return m33084a(a, this.f35269q.mo6149a(f), bdVar, obj2, duVar);
    }

    private final Object m33084a(int i, Map map, bd bdVar, Object obj, du duVar) {
        ca caVar = this.f35269q;
        this.f35270r.m32978a(i);
        by b = caVar.mo6150b();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (bdVar.m33001a(((Integer) entry.getValue()).intValue()) == null) {
                if (obj == null) {
                    obj = duVar.mo6194b();
                }
                C7223o b2 = C7203j.m33203b(bx.m33045a(b, entry.getKey(), entry.getValue()));
                try {
                    bx.m33046a(b2.f35480a, b, entry.getKey(), entry.getValue());
                    duVar.mo6189a(obj, i, b2.m33625a());
                    it.remove();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    private static void m33087a(int i, Object obj, eq eqVar) {
        if (obj instanceof String) {
            eqVar.mo6060a(i, (String) obj);
        } else {
            eqVar.mo6058a(i, (C7203j) obj);
        }
    }

    private final void m33092a(Object obj, int i, cz czVar) {
        if (m33094a(i)) {
            ea.m33370a(obj, (long) (i & 1048575), czVar.mo6290m());
        } else if (this.f35267o) {
            ea.m33370a(obj, (long) (i & 1048575), czVar.mo6288l());
        } else {
            ea.m33370a(obj, (long) (i & 1048575), czVar.mo6292n());
        }
    }

    private static int m33082a(long j) {
        return ea.f35383g.mo6205a(4 + j);
    }

    private static int m33097b(long j) {
        return ea.f35383g.mo6205a(8 + j);
    }

    private static boolean m33094a(int i) {
        return (536870912 & i) != 0;
    }

    private static double m33096b(Object obj, long j) {
        return ((Double) ea.m33385f(obj, j)).doubleValue();
    }

    private static float m33101c(Object obj, long j) {
        return ((Float) ea.m33385f(obj, j)).floatValue();
    }

    private static int m33103d(Object obj, long j) {
        return ((Integer) ea.m33385f(obj, j)).intValue();
    }

    private static long m33104e(Object obj, long j) {
        return ((Long) ea.m33385f(obj, j)).longValue();
    }

    private static boolean m33105f(Object obj, long j) {
        return ((Boolean) ea.m33385f(obj, j)).booleanValue();
    }

    private final boolean m33102c(Object obj, Object obj2, long j) {
        return m33106g(obj, j) == m33106g(obj2, j);
    }

    private final boolean m33106g(Object obj, long j) {
        if (this.f35268p) {
            int a;
            a = m33082a(j);
            long j2 = (long) (a & 1048575);
            switch ((a & 267386880) >>> 20) {
                case 0:
                    if (ea.m33384e(obj, j2) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    return ea.m33382d(obj, j2) != 0.0f;
                case 2:
                    return ea.m33374b(obj, j2) != 0;
                case 3:
                    return ea.m33374b(obj, j2) != 0;
                case 4:
                    return ea.m33358a(obj, j2) != 0;
                case 5:
                    return ea.m33374b(obj, j2) != 0;
                case 6:
                    return ea.m33358a(obj, j2) != 0;
                case 7:
                    return ea.m33381c(obj, j2);
                case 8:
                    Object f = ea.m33385f(obj, j2);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    } else {
                        if (f instanceof C7203j) {
                            return !C7203j.f35320a.equals(f);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                case 9:
                    return ea.m33385f(obj, j2) != null;
                case 10:
                    return !C7203j.f35320a.equals(ea.m33385f(obj, j2));
                case 11:
                    return ea.m33358a(obj, j2) != 0;
                case 12:
                    return ea.m33358a(obj, j2) != 0;
                case 13:
                    return ea.m33358a(obj, j2) != 0;
                case 14:
                    return ea.m33374b(obj, j2) != 0;
                case 15:
                    return ea.m33358a(obj, j2) != 0;
                case 16:
                    return ea.m33374b(obj, j2) != 0;
                case 17:
                    return ea.m33385f(obj, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        a = m33097b(j);
        return (ea.m33358a(obj, (long) (a & 1048575)) & (1 << (a >>> 20))) != 0;
    }

    private final void m33107h(Object obj, long j) {
        if (!this.f35268p) {
            int b = m33097b(j);
            long j2 = (long) (b & 1048575);
            ea.m33368a(obj, j2, ea.m33358a(obj, j2) | (1 << (b >>> 20)));
        }
    }

    private static boolean m33095a(Object obj, int i, long j) {
        return ea.m33358a(obj, (long) (m33097b(j) & 1048575)) == i;
    }

    private static void m33099b(Object obj, int i, long j) {
        ea.m33368a(obj, (long) (m33097b(j) & 1048575), i);
    }
}

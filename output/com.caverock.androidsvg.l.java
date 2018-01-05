package com.caverock.androidsvg;

public final class com.caverock.androidsvg.l
{

    public static long b;
    public static final float[] c;
    public static final float[] d;
    public int a;

    static {
        com.caverock.androidsvg.l.b = 922337203685477580;
        com.caverock.androidsvg.l.c = new float[39]{1065353216, 1092616192, 1120403456, 1148846080, 1176256512, 1203982336, 1232348160, 1259902592, 1287568416, 1315859240, 1343554297, 1371161527, 1399379109, 1427211495, 1454761505, 1482907561, 1510874058, 1538368188, 1566444395, 1594541859, 1621981420, 1649989415, 1678214776, 1705601046, 1733542428, 1761892689, 1789226918, 1817103247, 1845575481, 1872858888, 1900671690, 1929146236, 1956496814, 1984247577, 2012644575, 2040140556, 2067830734, 2096152002, 2123789977};
        com.caverock.androidsvg.l.d = new float[39]{1065353216, 1036831949, 1008981770, 981668463, 953267991, 925353388, 897988541, 869711765, 841731191, 814313567, 786163455, 758115327, 730643660, 702623251, 674505948, 646978941, 619091349, 590903210, 563319535, 535567946, 507307272, 479665568, 452053249, 423718298, 396017173, 368547464, 340136454, 312374482, 285050806, 256561912, 228737632, 201445043, 172994847, 145106764, 117763133, 89435438, 61482021, 34086122, 7136238};
    }

    l() {
    }

    public final float a(String p0, int p1, int p2) {
  0:    v2 = 0;
  1:    v8 = 0;
  3:    v7 = 0;
  4:    v6 = 0;
  5:    v5 = 0;
  6:    v4 = 0;
  7:    v3 = 0;
 12:    this.a = p1;
 20:    if (this.a >= p2) {
 22:        v2 = 2143289344;
 24:        return v2;
        }
 35:    switch (p0.charAt(this.a)) {
            case 43:
 35:            goto 80;
            case 44:
 35:            goto 38;
            case 45:
 35:            goto 79;
            default:
        }
 48:    if (this.a >= p2) goto 160;
 56:    v11 = p0.charAt(this.a);
 62:    if (v11 != 48) goto 94;
 64:    if (v7 == 0)
 66:        v6 = v6 + 1;
        else
 91:        v5 = v5 + 1;
 76:    this.a = this.a + 1;
 78:    goto 42;
 79:    v2 = 1;
 88:    this.a = this.a + 1;
 90:    goto 38;
 96:    if (v11 < 49) goto 147;
100:    if (v11 > 57) goto 147;
103:    while (v5 > 0) {
109:        if (v8 > com.caverock.androidsvg.l.b) {
111:            v2 = 2143289344;
113:            return v2;
            }
116:        v8 = v8 * 10;
117:        v5 = v5 - 1;
        }
124:    if (v8 > com.caverock.androidsvg.l.b) {
126:        v2 = 2143289344;
128:        return v2;
        }
135:    v8 = v8 * 10 + (long)(v11 - 48);
136:    v7 = v7 + v5 + 1;
142:    if (v8 < 0) {
144:        v2 = 2143289344;
146:        return v2;
        }
143:    goto 68;
149:    if (v11 != 46) goto 160;
151:    if (v4 != 0) goto 160;
157:    v3 = this.a - this.a;
158:    v4 = 1;
159:    goto 68;
160:    if (v4 != 0 && this.a == v3 + 1) {
170:        v2 = 2143289344;
172:        return v2;
        }
174:    if (v7 == 0) {
176:        if (v6 == 0) {
178:            v2 = 2143289344;
180:            return v2;
            }
182:        v7 = 1;
        }
183:    if (v4 != 0)
186:        v5 = v3 - v6 - v7;
194:    if (this.a >= p2) goto 429;
202:    v3 = p0.charAt(this.a);
208:    if (v3 == 69) goto 214;
212:    if (v3 != 101) goto 429;
214:    v3 = 0;
225:    this.a = this.a + 1;
233:    if (this.a == p2) {
235:        v2 = 2143289344;
237:        return v2;
        }
249:    switch (p0.charAt(this.a)) {
            case 43:
249:            goto 313;
            case 44:
249:            goto 252;
            case 45:
249:            goto 312;
            case 46:
249:            goto 252;
            case 47:
249:            goto 252;
            case 48:
249:            goto 329;
            case 49:
249:            goto 329;
            case 50:
249:            goto 329;
            case 51:
249:            goto 329;
            case 52:
249:            goto 329;
            case 53:
249:            goto 329;
            case 54:
249:            goto 329;
            case 55:
249:            goto 329;
            case 56:
249:            goto 329;
            case 57:
249:            goto 329;
            default:
        }
261:    this.a = this.a - 1;
265:    v6 = 0;
266:    v3 = 1;
268:    if (v3 != 0) goto 429;
274:    v3 = 0;
281:    if (this.a >= p2) {
355:        if (this.a == this.a) {
357:            v2 = 2143289344;
359:            return v2;
            }
361:        if (v6 != 0)
364:            v4 = v5 - v3;
            else
382:            v4 = v5 + v3;
369:        if (v4 + v7 > 39 || v4 + v7 < -44)
377:            v2 = 2143289344;
            else {
384:            v3 = (float)v8;
389:            if (v8 != 0) {
391:                if (v4 > 0)
397:                    v3 = v3 * com.caverock.androidsvg.l.c[v4];
403:                else if (v4 < 0) {
407:                    if (v4 < -38) {
416:                        v3 = (float)((double)v3 * 4307583784117748259);
417:                        v4 = v4 + 20;
                        }
424:                    v3 = v3 * com.caverock.androidsvg.l.d[-v4];
                    }
                }
398:            if (v2 != 0)
400:                v2 = -v3;
                else
426:                v2 = v3;
            }
379:        return v2;
        }
289:    v4 = p0.charAt(this.a);
295:    if (v4 < 48) {
355:        if (this.a == this.a) {
357:            v2 = 2143289344;
359:            return v2;
            }
361:        if (v6 != 0)
364:            v4 = v5 - v3;
            else
382:            v4 = v5 + v3;
369:        if (v4 + v7 > 39 || v4 + v7 < -44)
377:            v2 = 2143289344;
            else {
384:            v3 = (float)v8;
389:            if (v8 != 0) {
391:                if (v4 > 0)
397:                    v3 = v3 * com.caverock.androidsvg.l.c[v4];
403:                else if (v4 < 0) {
407:                    if (v4 < -38) {
416:                        v3 = (float)((double)v3 * 4307583784117748259);
417:                        v4 = v4 + 20;
                        }
424:                    v3 = v3 * com.caverock.androidsvg.l.d[-v4];
                    }
                }
398:            if (v2 != 0)
400:                v2 = -v3;
                else
426:                v2 = v3;
            }
379:        return v2;
        }
299:    if (v4 > 57) {
355:        if (this.a == this.a) {
357:            v2 = 2143289344;
359:            return v2;
            }
361:        if (v6 != 0)
364:            v4 = v5 - v3;
            else
382:            v4 = v5 + v3;
369:        if (v4 + v7 > 39 || v4 + v7 < -44)
377:            v2 = 2143289344;
            else {
384:            v3 = (float)v8;
389:            if (v8 != 0) {
391:                if (v4 > 0)
397:                    v3 = v3 * com.caverock.androidsvg.l.c[v4];
403:                else if (v4 < 0) {
407:                    if (v4 < -38) {
416:                        v3 = (float)((double)v3 * 4307583784117748259);
417:                        v4 = v4 + 20;
                        }
424:                    v3 = v3 * com.caverock.androidsvg.l.d[-v4];
                    }
                }
398:            if (v2 != 0)
400:                v2 = -v3;
                else
426:                v2 = v3;
            }
379:        return v2;
        }
306:    if ((long)v3 > com.caverock.androidsvg.l.b) {
308:        v2 = 2143289344;
310:        return v2;
        }
307:    goto 335;
312:    v3 = 1;
321:    this.a = this.a + 1;
325:    v6 = v3;
326:    v3 = 0;
328:    goto 268;
331:    v6 = 0;
332:    v3 = 0;
334:    goto 268;
339:    v3 = v3 * 10 + v4 - 48;
348:    this.a = this.a + 1;
350:    goto 275;
355:    if (this.a == this.a) {
357:        v2 = 2143289344;
359:        return v2;
        }
361:    if (v6 != 0)
364:        v4 = v5 - v3;
        else
382:        v4 = v5 + v3;
369:    if (v4 + v7 > 39 || v4 + v7 < -44)
377:        v2 = 2143289344;
        else {
384:        v3 = (float)v8;
389:        if (v8 != 0) {
391:            if (v4 > 0)
397:                v3 = v3 * com.caverock.androidsvg.l.c[v4];
403:            else if (v4 < 0) {
407:                if (v4 < -38) {
416:                    v3 = (float)((double)v3 * 4307583784117748259);
417:                    v4 = v4 + 20;
                    }
424:                v3 = v3 * com.caverock.androidsvg.l.d[-v4];
                }
            }
398:        if (v2 != 0)
400:            v2 = -v3;
            else
426:            v2 = v3;
        }
379:    return v2;
429:    v4 = v5;
430:    goto 365;
    }

}

package com.google.android.finsky.bg;

public final class com.google.android.finsky.bg.ab
{

    public final float a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    ab(boolean p0, int p1, int p2, int p3) {
        this.a = 1048576000;
        this.b = p0;
        this.c = p1;
        this.d = p2;
        this.e = p3;
    }

    private static int b(com.google.android.finsky.bg.ac p0, int p1, int p2) {
        v1 = 0;
        v2 = 0;
        while (v1 < p0.getPeekableChildCount()) {
            v0 = p0.a(v1) + p2;
            if (v0 < p1)
                v0 = p1 - v0;
            else
                v0 = p2;
            p0.a(v1, v0);
            v2 = v2 + v0;
            v1 = v1 + 1;
        }
        return v2;
    }

    public final void a(com.google.android.finsky.bg.ac p0, int p1, int p2) {
  0:    p0.bX_();
  3:    v7 = p0.getPeekableChildCount();
  7:    v3 = 0;
  9:    v4 = p1;
 11:    while (v3 < v7) {
 19:        v5 = p0.a(v3) + v4;
 22:        if (v5 > p2) {
 30:            if (v3 == v7 - 1 && v5 - p1 <= p2 && !p0.b()) {
 49:                v6 = v5 - p1;
 50:                v4 = 0;
 51:                v2 = 0;
                }
                else {
147:                v6 = v4;
148:                v4 = 1;
149:                v2 = p1;
                }
 53:            if (v4 != 0) {
 57:                v7 = p0.a(v3);
 63:                v8 = p0.b(v3);
 77:                v4 = Math.round((float)v7 * this.a);
 90:                v2 = Math.round((float)v7 * (1065353216 - this.a));
104:                v5 = (int)Math.round((double)v8 + (double)(v7 - v8 * 2) / 4613937818241073152);
105:                if (v4 <= v8)
107:                    v4 = v5;
111:                if (v4 + v6 <= p2) {
115:                    if (v2 >= v8 + v7 - v8 * 2)
117:                        v2 = v7 - v5;
126:                    v2 = p2 - Math.min(v2 + v6, p2);
                    }
                    else {
172:                    v2 = p2 - (v6 - Math.round((float)p0.a(v3 - 1) * this.a));
174:                    v3 = v3 - 1;
                    }
130:                if (v2 >= 10)
142:                    com.google.android.finsky.bg.ab.b(p0, 0, v2 / (v3 * 2 + 1) * 2);
                }
181:            else if (this.b != 0) {
183:                v3 = v6 + v2;
187:                if (v3 > p2) {
191:                    v3 = v3 - v2 * 2;
193:                    v5 = 0;
                    }
                    else
267:                    v5 = v2;
196:                if (v7 == 1)
202:                    v4 = this.c;
253:                else if (v7 == 2)
259:                    v4 = this.d;
                    else
265:                    v4 = 0;
203:                if (v4 > 0)
212:                    v2 = com.google.android.finsky.bg.ab.b(p0, v4, 0) + v3;
                    else
263:                    v2 = v3;
219:                if (p2 - v2 < this.e && p2 - v2 > 10)
233:                    v2 = com.google.android.finsky.bg.ab.b(p0, v4, (p2 - v2) / v7) + v3;
236:                if (v2 > p2)
238:                    p0.bX_();
                    else
261:                    v3 = v2;
248:                p0.a_((p2 - v3) / 2 + v5, (p2 - v3) / 2 + v5);
                }
145:            return;
            }
 24:        v3 = v3 + 1;
 26:        v4 = v5;
        }
 27:    goto 269;
 30:    if (v3 == v7 - 1 && v5 - p1 <= p2 && !p0.b()) {
 49:        v6 = v5 - p1;
 50:        v4 = 0;
 51:        v2 = 0;
        }
        else {
147:        v6 = v4;
148:        v4 = 1;
149:        v2 = p1;
        }
 53:    if (v4 != 0) {
 57:        v7 = p0.a(v3);
 63:        v8 = p0.b(v3);
 77:        v4 = Math.round((float)v7 * this.a);
 90:        v2 = Math.round((float)v7 * (1065353216 - this.a));
104:        v5 = (int)Math.round((double)v8 + (double)(v7 - v8 * 2) / 4613937818241073152);
105:        if (v4 <= v8)
107:            v4 = v5;
111:        if (v4 + v6 <= p2) {
115:            if (v2 >= v8 + v7 - v8 * 2)
117:                v2 = v7 - v5;
126:            v2 = p2 - Math.min(v2 + v6, p2);
            }
            else {
172:            v2 = p2 - (v6 - Math.round((float)p0.a(v3 - 1) * this.a));
174:            v3 = v3 - 1;
            }
130:        if (v2 >= 10)
142:            com.google.android.finsky.bg.ab.b(p0, 0, v2 / (v3 * 2 + 1) * 2);
        }
181:    else if (this.b != 0) {
183:        v3 = v6 + v2;
187:        if (v3 > p2) {
191:            v3 = v3 - v2 * 2;
193:            v5 = 0;
            }
            else
267:            v5 = v2;
196:        if (v7 == 1)
202:            v4 = this.c;
253:        else if (v7 == 2)
259:            v4 = this.d;
            else
265:            v4 = 0;
203:        if (v4 > 0)
212:            v2 = com.google.android.finsky.bg.ab.b(p0, v4, 0) + v3;
            else
263:            v2 = v3;
219:        if (p2 - v2 < this.e && p2 - v2 > 10)
233:            v2 = com.google.android.finsky.bg.ab.b(p0, v4, (p2 - v2) / v7) + v3;
236:        if (v2 > p2)
238:            p0.bX_();
            else
261:            v3 = v2;
248:        p0.a_((p2 - v3) / 2 + v5, (p2 - v3) / 2 + v5);
        }
145:    return;
269:    v6 = v4;
270:    v4 = 0;
271:    v2 = p1;
273:    goto 53;
    }

}

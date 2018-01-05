package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.Path;
import android.graphics.Path$FillType;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.graphics.Typeface;
import android.os.Build$VERSION;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

final class com.caverock.androidsvg.cf
{

    public static HashSet n;
    public Canvas a;
    public com.caverock.androidsvg.r b;
    public float c;
    public boolean d;
    public com.caverock.androidsvg.v e;
    public com.caverock.androidsvg.v f;
    public com.caverock.androidsvg.q g;
    public com.caverock.androidsvg.cm h;
    public Stack i;
    public Stack j;
    public Stack k;
    public Stack l;
    public Stack m;

    static {
        com.caverock.androidsvg.cf.n = 0;
    }

    cf(Canvas p0, com.caverock.androidsvg.r p1, float p2) {
        this.a = p0;
        this.c = p2;
        this.b = p1;
    }

    private final float a(com.caverock.androidsvg.bx p0) {
        v0 = new com.caverock.androidsvg.cp(this);
        this.a(p0, v0);
        return v0.a;
    }

    private static int a(float p0) {
        v0 = 255;
        if ((int)(1132462080 * p0) < 0)
            v0 = 0;
        else if ((int)(1132462080 * p0) <= 255)
            v0 = (int)(1132462080 * p0);
        return v0;
    }

    private static Matrix a(com.caverock.androidsvg.r p0, com.caverock.androidsvg.r p1, com.caverock.androidsvg.m p2) {
        v3 = new Matrix();
        if (p2 == 0 || p2.a == 0)
            v0 = v3;
        else {
            v1 = -p1.a;
            v2 = -p1.b;
            if (p2.equals(com.caverock.androidsvg.m.c)) {
                v3.preTranslate(p0.a, p0.b);
                v3.preScale(p0.c / p1.c, p0.d / p1.d);
                v3.preTranslate(v1, v2);
                v0 = v3;
            }
            else {
                if (p2.b == com.caverock.androidsvg.o.b)
                    v0 = Math.max(p0.c / p1.c, p0.d / p1.d);
                else
                    v0 = Math.min(p0.c / p1.c, p0.d / p1.d);
                switch (p2.a.ordinal()) {
                    case 2:
                        v1 = v1 - (p1.c - p0.c / v0) / 1073741824;
                        break;
                    case 3:
                        v1 = v1 - (p1.c - p0.c / v0);
                        break;
                    case 4:
                        break;
                    case 5:
                        v1 = v1 - (p1.c - p0.c / v0) / 1073741824;
                        break;
                    case 6:
                        v1 = v1 - (p1.c - p0.c / v0);
                        break;
                    case 7:
                        break;
                    case 8:
                        v1 = v1 - (p1.c - p0.c / v0) / 1073741824;
                        break;
                    case 9:
                        v1 = v1 - (p1.c - p0.c / v0);
                        break;
                    default:
                        break;
                }
                switch (p2.a.ordinal()) {
                    case 4:
                        v2 = v2 - (p1.d - p0.d / v0) / 1073741824;
                        break;
                    case 5:
                        v2 = v2 - (p1.d - p0.d / v0) / 1073741824;
                        break;
                    case 6:
                        v2 = v2 - (p1.d - p0.d / v0) / 1073741824;
                        break;
                    case 7:
                        v2 = v2 - (p1.d - p0.d / v0);
                        break;
                    case 8:
                        v2 = v2 - (p1.d - p0.d / v0);
                        break;
                    case 9:
                        v2 = v2 - (p1.d - p0.d / v0);
                        break;
                    default:
                        break;
                }
                v3.preTranslate(p0.a, p0.b);
                v3.preScale(v0, v0);
                v3.preTranslate(v1, v2);
                v0 = v3;
            }
        }
        return v0;
    }

    private final Path a(com.caverock.androidsvg.ar p0) {
        if (p0.f == 0 && p0.g == 0) {
            v2 = 0;
            v1 = 0;
        }
        else if (p0.f == 0) {
            v1 = p0.g.b(this);
            v2 = v1;
        }
        else if (p0.g == 0) {
            v1 = p0.f.a(this);
            v2 = v1;
        }
        else {
            v2 = p0.f.a(this);
            v1 = p0.g.b(this);
        }
        v13 = Math.min(v2, p0.c.a(this) / 1073741824);
        v15 = Math.min(v1, p0.d.b(this) / 1073741824);
        if (p0.a != 0)
            v2 = p0.a.a(this);
        else
            v2 = 0;
        if (p0.b != 0)
            v5 = p0.b.b(this);
        else
            v5 = 0;
        v1 = p0.c.a(this);
        v3 = p0.d.b(this);
        if (p0.n == 0)
            p0.n = new com.caverock.androidsvg.r(v2, v5, v1, v3);
        v12 = v2 + v1;
        v1 = new Path();
        if (v13 == 0 || v15 == 0) {
            v1.moveTo(v2, v5);
            v1.lineTo(v12, v5);
            v1.lineTo(v12, v5 + v3);
            v1.lineTo(v2, v5 + v3);
            v1.lineTo(v2, v5);
        }
        else {
            v1.moveTo(v2, v5 + v15);
            v1.cubicTo(v2, v5 + v15 - v15 * 1057841801, v2 + v13 - v13 * 1057841801, v5, v2 + v13, v5);
            v1.lineTo(v12 - v13, v5);
            v1.cubicTo(v12 - v13 + v13 * 1057841801, v5, v12, v5 + v15 - v15 * 1057841801, v12, v5 + v15);
            v1.lineTo(v12, v5 + v3 - v15);
            v1.cubicTo(v12, v5 + v3 - v15 + v15 * 1057841801, v12 - v13 + v13 * 1057841801, v5 + v3, v12 - v13, v5 + v3);
            v1.lineTo(v2 + v13, v5 + v3);
            v1.cubicTo(v2 + v13 - v13 * 1057841801, v5 + v3, v2, v5 + v3 - v15 + v15 * 1057841801, v2, v5 + v3 - v15);
            v1.lineTo(v2, v5 + v15);
        }
        v1.close();
        return v1;
    }

    private final Path a(com.caverock.androidsvg.t p0) {
        if (p0.a != 0)
            v13 = p0.a.a(this);
        else
            v13 = 0;
        if (p0.b != 0)
            v7 = p0.b.b(this);
        else
            v7 = 0;
        v1 = p0.c.c(this);
        v17 = v13 - v1;
        v3 = v7 - v1;
        v4 = v13 + v1;
        v12 = v7 + v1;
        if (p0.n == 0)
            p0.n = new com.caverock.androidsvg.r(v17, v3, 1073741824 * v1, 1073741824 * v1);
        v21 = v1 * 1057841801;
        v1 = new Path();
        v1.moveTo(v13, v3);
        v1.cubicTo(v13 + v21, v3, v4, v7 - v21, v4, v7);
        v1.cubicTo(v4, v7 + v21, v13 + v21, v12, v13, v12);
        v1.cubicTo(v13 - v21, v12, v17, v7 + v21, v17, v7);
        v1.cubicTo(v17, v7 - v21, v13 - v21, v3, v13, v3);
        v1.close();
        return v1;
    }

    private final Path a(com.caverock.androidsvg.y p0) {
        if (p0.a != 0)
            v13 = p0.a.a(this);
        else
            v13 = 0;
        if (p0.b != 0)
            v7 = p0.b.b(this);
        else
            v7 = 0;
        v1 = p0.c.a(this);
        v2 = p0.d.b(this);
        v17 = v13 - v1;
        v4 = v13 + v1;
        if (p0.n == 0)
            p0.n = new com.caverock.androidsvg.r(v17, v7 - v2, 1073741824 * v1, 1073741824 * v2);
        v21 = v1 * 1057841801;
        v1 = new Path();
        v1.moveTo(v13, v7 - v2);
        v1.cubicTo(v13 + v21, v7 - v2, v4, v7 - v2 * 1057841801, v4, v7);
        v1.cubicTo(v4, v7 + v2 * 1057841801, v13 + v21, v7 + v2, v13, v7 + v2);
        v1.cubicTo(v13 - v21, v7 + v2, v17, v7 + v2 * 1057841801, v17, v7);
        v1.cubicTo(v17, v7 - v2 * 1057841801, v13 - v21, v7 - v2, v13, v7 - v2);
        v1.close();
        return v1;
    }

    private static Typeface a(String p0, Integer p1, com.caverock.androidsvg.ax p2) {
        v1 = 1;
        if (p2 == com.caverock.androidsvg.ax.b)
            v0 = 1;
        else
            v0 = 0;
        if (p1.intValue() > 500) {
            if (v0 != 0)
                v1 = 3;
        }
        else if (v0 != 0)
            v1 = 2;
        else
            v1 = 0;
        if (p0.equals("serif"))
            v0 = Typeface.create(Typeface.SERIF, v1);
        else if (p0.equals("sans-serif"))
            v0 = Typeface.create(Typeface.SANS_SERIF, v1);
        else if (p0.equals("monospace"))
            v0 = Typeface.create(Typeface.MONOSPACE, v1);
        else if (p0.equals("cursive"))
            v0 = Typeface.create(Typeface.SANS_SERIF, v1);
        else if (p0.equals("fantasy"))
            v0 = Typeface.create(Typeface.SANS_SERIF, v1);
        else
            v0 = 0;
        return v0;
    }

    private final com.caverock.androidsvg.cm a(com.caverock.androidsvg.bm p0, com.caverock.androidsvg.cm p1) {
        v2 = new ArrayList();
        v1 = p0;
        while (true) {
            if (v1 instanceof com.caverock.androidsvg.bk)
                v2.add(0, (com.caverock.androidsvg.bk)v1);
            if (v1.u == 0)
                break;
            v1 = (com.caverock.androidsvg.bm)v1.u;
        }
        v0 = (ArrayList)v2;
        v2 = 0;
        while (v2 < v0.size()) {
            v1 = v0.get(v2);
            v2 = v2 + 1;
            this.a(p1, (com.caverock.androidsvg.bk)v1);
        }
        p1.g = this.g.b.w;
        if (p1.g == 0)
            p1.g = this.b;
        p1.f = this.b;
        p1.i = this.h.i;
        return p1;
    }

    private final String a(String p0, boolean p1, boolean p2) {
        if (this.h.h != 0)
            v0 = p0.replaceAll("[\\n\\t]", " ");
        else {
            v0 = p0.replaceAll("\\n", "").replaceAll("\\t", " ");
            if (p1 != 0)
                v0 = v0.replaceAll("^\\s+", "");
            if (p2 != 0)
                v0 = v0.replaceAll("\\s+$", "");
            v0 = v0.replaceAll("\\s{2,}", " ");
        }
        return v0;
    }

    private static List a(com.caverock.androidsvg.ap p0) {
        v0 = 2;
        v2 = 0;
        if (p0.a.length < 2)
            v0 = 0;
        else {
            v1 = new ArrayList();
            v4 = new com.caverock.androidsvg.ch(p0.a[0], p0.a[1], 0, 0);
            v3 = 0;
            while (v0 < p0.a.length) {
                v3 = p0.a[v0];
                v2 = p0.a[v0 + 1];
                v4.a(v3, v2);
                v1.add(v4);
                v0 = v0 + 2;
                v4 = new com.caverock.androidsvg.ch(v3, v2, v3 - v4.a, v2 - v4.b);
            }
            if (p0 instanceof com.caverock.androidsvg.aq) {
                if (v3 != p0.a[0] && v2 != p0.a[1]) {
                    v4.a(p0.a[0], p0.a[1]);
                    v1.add(v4);
                    v3 = new com.caverock.androidsvg.ch(p0.a[0], p0.a[1], p0.a[0] - v4.a, p0.a[1] - v4.b);
                    v3.a((com.caverock.androidsvg.ch)v1.get(0));
                    v1.add(v3);
                    v1.set(0, v3);
                }
            }
            else
                v1.add(v4);
            v0 = v1;
        }
        return v0;
    }

    private final void a(float p0, float p1, float p2, float p3) {
        v1 = p0 + p2;
        v0 = p1 + p3;
        if (this.h.a.w != 0) {
            p0 = p0 + this.h.a.w.d.a(this);
            p1 = p1 + this.h.a.w.a.b(this);
            v1 = v1 - this.h.a.w.b.a(this);
            v0 = v0 - this.h.a.w.c.b(this);
        }
        this.a.clipRect(p0, p1, v1, v0);
    }

    static void a(float p0, float p1, float p2, float p3, float p4, boolean p5, boolean p6, float p7, float p8, com.caverock.androidsvg.an p9) {
        com.caverock.androidsvg.cf.b(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    private final void a(Path p0) {
        if (this.h.a.L == com.caverock.androidsvg.bd.b) {
            v0 = this.a.getMatrix();
            v1 = new Path();
            p0.transform(v0, v1);
            this.a.setMatrix(new Matrix());
            v2 = this.h.e.getShader();
            v3 = new Matrix();
            if (v2 != 0) {
                v2.getLocalMatrix(v3);
                v4 = new Matrix(v3);
                v4.postConcat(v0);
                v2.setLocalMatrix(v4);
            }
            this.a.drawPath(v1, this.h.e);
            this.a.setMatrix(v0);
            if (v2 != 0)
                v2.setLocalMatrix(v3);
        }
        else
            this.a.drawPath(p0, this.h.e);
    }

    private final void a(com.caverock.androidsvg.ab p0) {
  3:    v5 = 0;
 10:    if (this.h.a.x == 0 && this.h.a.y == 0 && this.h.a.z == 0)
 28:        return;
 35:    if (this.h.a.x == 0) goto 192;
 45:    v0 = p0.t.b(this.h.a.x);
 49:    if (v0 == 0) goto 177;
 53:    v1 = (com.caverock.androidsvg.ah)v0;
 60:    if (this.h.a.y == 0) goto 210;
 70:    v0 = p0.t.b(this.h.a.y);
 74:    if (v0 == 0) goto 195;
 78:    v3 = (com.caverock.androidsvg.ah)v0;
 85:    if (this.h.a.z == 0) goto 228;
 95:    v0 = p0.t.b(this.h.a.z);
 99:    if (v0 == 0) goto 213;
103:    v4 = (com.caverock.androidsvg.ah)v0;
106:    if (p0 instanceof com.caverock.androidsvg.al)
119:        v5 = new com.caverock.androidsvg.cg(((com.caverock.androidsvg.al)p0).a).a;
232:    else if (p0 instanceof com.caverock.androidsvg.ag) {
238:        if (((com.caverock.androidsvg.ag)p0).a != 0)
242:            v0 = ((com.caverock.androidsvg.ag)p0).a.a(this);
            else
309:            v0 = 0;
248:        if (((com.caverock.androidsvg.ag)p0).b != 0)
252:            v6 = ((com.caverock.androidsvg.ag)p0).b.b(this);
            else
311:            v6 = 0;
258:        if (((com.caverock.androidsvg.ag)p0).c != 0)
262:            v7 = ((com.caverock.androidsvg.ag)p0).c.a(this);
            else
313:            v7 = 0;
268:        if (((com.caverock.androidsvg.ag)p0).d != 0)
272:            v5 = ((com.caverock.androidsvg.ag)p0).d.b(this);
279:        v9 = new ArrayList(2);
291:        v9.add(new com.caverock.androidsvg.ch(v0, v6, v7 - v0, v5 - v6));
303:        v9.add(new com.caverock.androidsvg.ch(v7, v5, v7 - v0, v5 - v6));
306:        v5 = v9;
        }
        else
321:        v5 = com.caverock.androidsvg.cf.a((com.caverock.androidsvg.ap)p0);
120:    if (v5 == 0)
 28:        return;
122:    v6 = v5.size();
126:    if (v6 == 0)
 28:        return;
140:    this.h.a.z = 0;
142:    this.h.a.y = 0;
144:    this.h.a.x = 0;
146:    if (v1 != 0)
154:        this.a(v1, (com.caverock.androidsvg.ch)v5.get(0));
157:    if (v3 != 0) {
159:        v1 = 1;
160:        while (v1 < v6 - 1) {
170:            this.a(v3, (com.caverock.androidsvg.ch)v5.get(v1));
175:            v1 = v1 + 1;
            }
        }
176:    goto 324;
179:    v1 = new Object[1];
187:    v1[0] = this.h.a.x;
189:    com.caverock.androidsvg.cf.b("Marker reference '%s' not found", v1);
192:    v1 = 0;
193:    goto 54;
197:    v3 = new Object[1];
205:    v3[0] = this.h.a.y;
207:    com.caverock.androidsvg.cf.b("Marker reference '%s' not found", v3);
210:    v3 = 0;
211:    goto 79;
215:    v4 = new Object[1];
223:    v4[0] = this.h.a.z;
225:    com.caverock.androidsvg.cf.b("Marker reference '%s' not found", v4);
228:    v4 = 0;
229:    goto 104;
324:    if (v4 != 0)
334:        this.a(v4, (com.caverock.androidsvg.ch)v5.get(v6 - 1));
    }

    private final void a(com.caverock.androidsvg.ah p0, com.caverock.androidsvg.ch p1) {
  0:    v4 = 1077936128;
  4:    v1 = 0;
  5:    this.d();
 10:    if (p0.f == 0) goto 332;
 22:    if (Float.isNaN(p0.f.floatValue())) {
 28:        if (p1.c != 0 || p1.d != 0)
 50:            v0 = (float)Math.toDegrees(Math.atan2((double)p1.d, (double)p1.c));
            else
332:            v0 = 0;
        }
        else
248:        v0 = p0.f.floatValue();
 53:    if (p0.a != 0)
 55:        v2 = 1065353216;
        else
262:        v2 = this.h.a.g.a(this.c);
 61:    this.h = this.c(p0);
 65:    v8 = new Matrix();
 72:    v8.preTranslate(p1.a, p1.b);
 75:    v8.preRotate(v0);
 78:    v8.preScale(v2, v2);
 83:    if (p0.b != 0)
 87:        v0 = p0.b.a(this);
        else
268:        v0 = 0;
 93:    if (p0.c != 0)
 97:        v2 = p0.c.b(this);
        else
271:        v2 = 0;
103:    if (p0.d != 0)
107:        v3 = p0.d.a(this);
        else
274:        v3 = 1077936128;
113:    if (p0.e != 0)
117:        v4 = p0.e.b(this);
123:    if (p0.w != 0) {
129:        v7 = v3 / p0.w.c;
135:        v6 = v4 / p0.w.d;
139:        if (p0.v != 0)
141:            v5 = p0.v;
            else
277:            v5 = com.caverock.androidsvg.m.d;
149:        if (!v5.equals(com.caverock.androidsvg.m.c)) {
155:            if (v5.b == com.caverock.androidsvg.o.b)
157:                v6 = Math.max(v7, v6);
                else
281:                v6 = Math.min(v7, v6);
161:            v7 = v6;
            }
166:        v8.preTranslate(-v0 * v7, -v2 * v6);
171:        this.a.concat(v8);
190:        switch (v5.a.ordinal()) {
                case 2:
289:                v0 = 0 - (v3 - p0.w.c * v7) / 1073741824;
334:                break;
                case 3:
294:                v0 = 0 - (v3 - p0.w.c * v7);
334:                break;
                case 4:
193:                v0 = 0;
334:                break;
                case 5:
289:                v0 = 0 - (v3 - p0.w.c * v7) / 1073741824;
334:                break;
                case 6:
294:                v0 = 0 - (v3 - p0.w.c * v7);
334:                break;
                case 7:
193:                v0 = 0;
334:                break;
                case 8:
289:                v0 = 0 - (v3 - p0.w.c * v7) / 1073741824;
334:                break;
                case 9:
294:                v0 = 0 - (v3 - p0.w.c * v7);
334:                break;
                default:
193:                v0 = 0;
334:                break;
            }
200:        switch (v5.a.ordinal()) {
                case 4:
300:                v1 = 0 - (v4 - p0.w.d * v6) / 1073741824;
334:                break;
                case 5:
300:                v1 = 0 - (v4 - p0.w.d * v6) / 1073741824;
334:                break;
                case 6:
300:                v1 = 0 - (v4 - p0.w.d * v6) / 1073741824;
334:                break;
                case 7:
304:                v1 = 0 - (v4 - p0.w.d * v6);
334:                break;
                case 8:
304:                v1 = 0 - (v4 - p0.w.d * v6);
334:                break;
                case 9:
304:                v1 = 0 - (v4 - p0.w.d * v6);
334:                break;
                default:
334:                break;
            }
213:        if (!this.h.a.v.booleanValue())
215:            this.a(v0, v1, v3, v4);
218:        v8.reset();
221:        v8.preScale(v7, v6);
226:        this.a.concat(v8);
        }
        else {
308:        v8.preTranslate(-v0, -v2);
313:        this.a.concat(v8);
326:        if (!this.h.a.v.booleanValue())
328:            this.a(0, 0, v3, v4);
        }
234:    this.a(p0, 0);
237:    if (this.g())
239:        this.b(p0);
242:    this.e();
    }

    private final void a(com.caverock.androidsvg.be p0, com.caverock.androidsvg.af p1, com.caverock.androidsvg.af p2) {
        this.a(p0, p1, p2, p0.w, p0.v);
    }

    private final void a(com.caverock.androidsvg.bi p0) {
        this.j.push(p0);
        this.k.push(this.a.getMatrix());
    }

    private final void a(com.caverock.androidsvg.bi p0, boolean p1) {
        if (p1 != 0)
            this.a(p0);
        v1 = p0.a().iterator();
        while (v1.hasNext())
            this.b((com.caverock.androidsvg.bm)v1.next());
        if (p1 != 0)
            this.f();
    }

    private final void a(com.caverock.androidsvg.bj p0) {
        if (p0.u != 0 && p0.n != 0) {
            v2 = new Matrix();
            if (((Matrix)this.k.peek()).invert(v2)) {
                v3 = new float[8];
                v3[0] = p0.n.a;
                v3[1] = p0.n.b;
                v3[2] = p0.n.a();
                v3[3] = p0.n.b;
                v3[4] = p0.n.a();
                v3[5] = p0.n.b();
                v3[6] = p0.n.a;
                v3[7] = p0.n.b();
                v2.preConcat(this.a.getMatrix());
                v2.mapPoints(v3);
                v2 = new RectF(v3[0], v3[1], v3[0], v3[1]);
                v0 = 2;
                while (v0 <= 6) {
                    if (v3[v0] < v2.left)
                        v2.left = v3[v0];
                    if (v3[v0] > v2.right)
                        v2.right = v3[v0];
                    if (v3[v0 + 1] < v2.top)
                        v2.top = v3[v0 + 1];
                    if (v3[v0 + 1] > v2.bottom)
                        v2.bottom = v3[v0 + 1];
                    v0 = v0 + 2;
                }
                v0 = (com.caverock.androidsvg.bj)this.j.peek();
                if (v0.n == 0)
                    v0.n = com.caverock.androidsvg.r.a(v2.left, v2.top, v2.right, v2.bottom);
                else {
                    v1 = com.caverock.androidsvg.r.a(v2.left, v2.top, v2.right, v2.bottom);
                    if (v1.a < v0.n.a)
                        v0.n.a = v1.a;
                    if (v1.b < v0.n.b)
                        v0.n.b = v1.b;
                    if (v1.a() > v0.n.a())
                        v0.n.c = v1.a() - v0.n.a;
                    if (v1.b() > v0.n.b())
                        v0.n.d = v1.b() - v0.n.b;
                }
            }
        }
    }

    private final void a(com.caverock.androidsvg.bj p0, Path p1) {
 10:    if (!(this.h.a.b instanceof com.caverock.androidsvg.ak)) {
876:        this.a.drawPath(p1, this.h.d);
879:        return;
        }
 28:    v2 = this.g.b(((com.caverock.androidsvg.ak)this.h.a.b).a);
 34:    if (!(v2 instanceof com.caverock.androidsvg.ao)) {
876:        this.a.drawPath(p1, this.h.d);
879:        return;
        }
 36:    v2 = (com.caverock.androidsvg.ao)v2;
 40:    if (v2.a != 0 && v2.a.booleanValue())
 51:        v4 = 1;
        else
145:        v4 = 0;
 54:    if (v2.h == 0) goto 79;
 58:    v5 = v2.h;
 62:    v3 = v2.t.b(v5);
 66:    if (v3 != 0) goto 147;
 71:    v6 = new Object[1];
 74:    v6[0] = v5;
 76:    com.caverock.androidsvg.cf.a("Pattern reference '%s' not found", v6);
 79:    if (v4 != 0) {
 83:        if (v2.d != 0)
 89:            v3 = v2.d.a(this);
            else
269:            v3 = 0;
 95:        if (v2.e != 0)
101:            v4 = v2.e.b(this);
            else
272:            v4 = 0;
107:        if (v2.f != 0)
113:            v5 = v2.f.a(this);
            else
275:            v5 = 0;
119:        if (v2.g != 0)
125:            v6 = v2.g.b(this);
            else
278:            v6 = 0;
129:        v8 = v6;
130:        v9 = v5;
131:        v5 = v4;
132:        v6 = v3;
        }
        else {
283:        if (v2.d != 0)
291:            v3 = v2.d.a(this, 1065353216);
            else
385:            v3 = 0;
297:        if (v2.e != 0)
305:            v4 = v2.e.a(this, 1065353216);
            else
387:            v4 = 0;
311:        if (v2.f != 0)
319:            v5 = v2.f.a(this, 1065353216);
            else
389:            v5 = 0;
325:        if (v2.g != 0)
333:            v6 = v2.g.a(this, 1065353216);
            else
391:            v6 = 0;
379:        v8 = v6 * p0.n.d;
380:        v9 = v5 * p0.n.c;
381:        v5 = v4 * p0.n.d + p0.n.b;
382:        v6 = v3 * p0.n.c + p0.n.a;
        }
136:    if (v9 == 0)
143:        return;
141:    if (v8 == 0)
143:        return;
142:    goto 393;
149:    if (v3 instanceof com.caverock.androidsvg.ao) goto 160;
156:    com.caverock.androidsvg.cf.b("Pattern href attributes must point to other pattern elements", new Object[0]);
159:    goto 79;
160:    if (v3 != v2) goto 174;
165:    v6 = new Object[1];
168:    v6[0] = v5;
170:    com.caverock.androidsvg.cf.b("Circular reference in pattern href attribute '%s'", v6);
173:    goto 79;
174:    v3 = (com.caverock.androidsvg.ao)v3;
178:    if (v2.a == 0)
182:        v2.a = v3.a;
186:    if (v2.b == 0)
190:        v2.b = v3.b;
194:    if (v2.c == 0)
198:        v2.c = v3.c;
202:    if (v2.d == 0)
206:        v2.d = v3.d;
210:    if (v2.e == 0)
214:        v2.e = v3.e;
218:    if (v2.f == 0)
222:        v2.f = v3.f;
226:    if (v2.g == 0)
230:        v2.g = v3.g;
238:    if (v2.i.isEmpty())
242:        v2.i = v3.i;
246:    if (v2.w == 0)
250:        v2.w = v3.w;
254:    if (v2.v == 0)
258:        v2.v = v3.v;
262:    if (v3.h == 0) goto 79;
266:    v5 = v3.h;
267:    goto 60;
395:    if (v2.v != 0)
399:        v4 = v2.v;
        else
644:        v4 = com.caverock.androidsvg.m.d;
400:    this.d();
409:    this.a.clipPath(p1);
414:    v3 = new com.caverock.androidsvg.cm();
423:    this.a(v3, com.caverock.androidsvg.av.a());
433:    v3.a.v = Boolean.valueOf(0);
443:    this.h = this.a(v2, v3);
447:    v3 = p0.n;
451:    if (v2.c != 0) {
459:        this.a.concat(v2.c);
464:        v7 = new Matrix();
473:        if (v2.c.invert(v7)) {
477:            v10 = new float[8];
486:            v10[0] = p0.n.a;
495:            v10[1] = p0.n.b;
506:            v10[2] = p0.n.a();
515:            v10[3] = p0.n.b;
526:            v10[4] = p0.n.a();
537:            v10[5] = p0.n.b();
546:            v10[6] = p0.n.a;
557:            v10[7] = p0.n.b();
559:            v7.mapPoints(v10);
576:            v7 = new RectF(v10[0], v10[1], v10[0], v10[1]);
579:            v3 = 2;
580:            while (v3 <= 6) {
589:                if (v10[v3] < v7.left)
593:                    v7.left = v10[v3];
601:                if (v10[v3] > v7.right)
605:                    v7.right = v10[v3];
615:                if (v10[v3 + 1] < v7.top)
621:                    v7.top = v10[v3 + 1];
631:                if (v10[v3 + 1] > v7.bottom)
637:                    v7.bottom = v10[v3 + 1];
639:                v3 = v3 + 2;
                }
664:            v3 = new com.caverock.androidsvg.r(v7.left, v7.top, v7.right - v7.left, v7.bottom - v7.top);
            }
        }
703:    v12 = new com.caverock.androidsvg.r(0, 0, v9, v8);
706:    v7 = v5 + (float)Math.floor((double)((v3.b - v5) / v8)) * v8;
707:    while (true) {
709:        if (v7 >= v3.b()) {
859:            this.e();
862:            return;
            }
711:        v5 = v6 + (float)Math.floor((double)((v3.a - v6) / v9)) * v9;
712:        while (v5 < v3.a()) {
716:            v12.a = v5;
718:            v12.b = v7;
720:            this.d();
735:            if (!this.h.a.v.booleanValue())
747:                this.a(v12.a, v12.b, v12.c, v12.d);
752:            if (v2.w != 0)
764:                this.a.concat(com.caverock.androidsvg.cf.a(v12, v2.w, v4));
                else {
797:                if (v2.b == 0 || v2.b.booleanValue())
807:                    v3 = 1;
                    else
837:                    v3 = 0;
812:                this.a.translate(v5, v7);
815:                if (v3 == 0)
833:                    this.a.scale(p0.n.c, p0.n.d);
                }
773:            v14 = v2.i.iterator();
777:            while (v14.hasNext())
791:                this.b((com.caverock.androidsvg.bm)v14.next());
839:            if (this.g())
843:                this.b(v2);
846:            this.e();
851:            v5 = v5 + v9;
            }
856:        v7 = v7 + v8;
        }
    }

    private final void a(com.caverock.androidsvg.bj p0, com.caverock.androidsvg.r p1) {
        if (this.h.a.E != 0) {
            v0 = p0.t.b(this.h.a.E);
            if (v0 == 0) {
                v2 = new Object[1];
                v2[0] = this.h.a.E;
                com.caverock.androidsvg.cf.b("ClipPath reference '%s' not found", v2);
            }
            else if (((com.caverock.androidsvg.u)v0).i.isEmpty())
                this.a.clipRect(0, 0, 0, 0);
            else {
                if (((com.caverock.androidsvg.u)v0).a == 0 || ((com.caverock.androidsvg.u)v0).a.booleanValue())
                    v2 = 1;
                else
                    v2 = 0;
                if (p0 instanceof com.caverock.androidsvg.ac && v2 == 0) {
                    v2 = new Object[1];
                    v2[0] = p0.getClass().getSimpleName();
                    com.caverock.androidsvg.cf.a("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", v2);
                }
                else {
                    this.i.push(this.h);
                    this.h = (com.caverock.androidsvg.cm)this.h.clone();
                    v1 = new Matrix();
                    if (v2 == 0) {
                        v2 = new Matrix();
                        v2.preTranslate(p1.a, p1.b);
                        v2.preScale(p1.c, p1.d);
                        this.a.concat(v2);
                        v4 = new Matrix();
                        if (v2.invert(v4))
                            v1.postConcat(v4);
                    }
                    if (((com.caverock.androidsvg.u)v0).b != 0) {
                        this.a.concat(((com.caverock.androidsvg.u)v0).b);
                        v4 = new Matrix();
                        if (((com.caverock.androidsvg.u)v0).b.invert(v4))
                            v1.postConcat(v4);
                    }
                    this.h = this.c((com.caverock.androidsvg.u)v0);
                    this.d((com.caverock.androidsvg.u)v0);
                    v2 = new Path();
                    v4 = ((com.caverock.androidsvg.u)v0).i.iterator();
                    while (v4.hasNext())
                        this.a((com.caverock.androidsvg.bm)v4.next(), 1, v2, new Matrix());
                    this.a.clipPath(v2);
                    this.h = (com.caverock.androidsvg.cm)this.i.pop();
                    this.a.concat(v1);
                }
            }
        }
    }

    private final void a(com.caverock.androidsvg.bm p0, boolean p1, Path p2, Matrix p3) {
        v2 = 0;
        if (!this.k())
            return;
        this.a.save(1);
        this.i.push(this.h);
        this.h = (com.caverock.androidsvg.cm)this.h.clone();
        if (p0 instanceof com.caverock.androidsvg.cd) {
            if (p1 != 0) {
                this.a(this.h, (com.caverock.androidsvg.cd)p0);
                if (this.k() && this.c()) {
                    if (((com.caverock.androidsvg.cd)p0).b != 0)
                        p3.preConcat(((com.caverock.androidsvg.cd)p0).b);
                    v0 = ((com.caverock.androidsvg.cd)p0).t.b(((com.caverock.androidsvg.cd)p0).a);
                    if (v0 == 0) {
                        v1 = new Object[1];
                        v1[0] = ((com.caverock.androidsvg.cd)p0).a;
                        com.caverock.androidsvg.cf.b("Use reference '%s' not found", v1);
                    }
                    else {
                        this.d((com.caverock.androidsvg.cd)p0);
                        this.a(v0, 0, p2, p3);
                    }
                }
            }
            else
                com.caverock.androidsvg.cf.b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
        }
        else if (p0 instanceof com.caverock.androidsvg.al) {
            this.a(this.h, (com.caverock.androidsvg.al)p0);
            if (this.k() && this.c()) {
                if (((com.caverock.androidsvg.al)p0).e != 0)
                    p3.preConcat(((com.caverock.androidsvg.al)p0).e);
                v0 = new com.caverock.androidsvg.ci(((com.caverock.androidsvg.al)p0).a);
                if (((com.caverock.androidsvg.al)p0).n == 0)
                    ((com.caverock.androidsvg.al)p0).n = com.caverock.androidsvg.cf.b(v0.a);
                this.d((com.caverock.androidsvg.al)p0);
                p2.setFillType(this.m());
                p2.addPath(v0.a, p3);
            }
        }
        else if (p0 instanceof com.caverock.androidsvg.bv) {
            p0 = (com.caverock.androidsvg.bv)p0;
            this.a(this.h, p0);
            if (this.k()) {
                if (p0.a != 0)
                    p3.preConcat(p0.a);
                if (p0.b == 0 || p0.b.size() == 0)
                    v1 = 0;
                else
                    v1 = ((com.caverock.androidsvg.af)p0.b.get(0)).a(this);
                if (p0.c == 0 || p0.c.size() == 0)
                    v3 = 0;
                else
                    v3 = ((com.caverock.androidsvg.af)p0.c.get(0)).b(this);
                if (p0.d == 0 || p0.d.size() == 0)
                    v4 = 0;
                else
                    v4 = ((com.caverock.androidsvg.af)p0.d.get(0)).a(this);
                if (p0.e != 0 && p0.e.size() != 0)
                    v2 = ((com.caverock.androidsvg.af)p0.e.get(0)).b(this);
                if (this.h.a.u != com.caverock.androidsvg.ba.a) {
                    v0 = this.a(p0);
                    if (this.h.a.u == com.caverock.androidsvg.ba.b)
                        v1 = v1 - v0 / 1073741824;
                    else
                        v1 = v1 - v0;
                }
                if (p0.n == 0) {
                    v0 = new com.caverock.androidsvg.cn(this, v1, v3);
                    this.a(p0, v0);
                    p0.n = new com.caverock.androidsvg.r(v0.c.left, v0.c.top, v0.c.width(), v0.c.height());
                }
                this.d(p0);
                v0 = new Path();
                this.a(p0, new com.caverock.androidsvg.cl(this, v1 + v4, v2 + v3, v0));
                p2.setFillType(this.m());
                p2.addPath(v0, p3);
            }
        }
        else if (p0 instanceof com.caverock.androidsvg.ab) {
            p0 = (com.caverock.androidsvg.ab)p0;
            this.a(this.h, p0);
            if (!this.k()) {
                this.a.restore();
                this.h = (com.caverock.androidsvg.cm)this.i.pop();
                return;
            }
            if (!this.c()) {
                this.a.restore();
                this.h = (com.caverock.androidsvg.cm)this.i.pop();
                return;
            }
            if (p0.e != 0)
                p3.preConcat(p0.e);
            if (p0 instanceof com.caverock.androidsvg.ar)
                v0 = this.a((com.caverock.androidsvg.ar)p0);
            else if (p0 instanceof com.caverock.androidsvg.t)
                v0 = this.a((com.caverock.androidsvg.t)p0);
            else if (p0 instanceof com.caverock.androidsvg.y)
                v0 = this.a((com.caverock.androidsvg.y)p0);
            else {
                if (!(p0 instanceof com.caverock.androidsvg.ap)) {
                    this.a.restore();
                    this.h = (com.caverock.androidsvg.cm)this.i.pop();
                    return;
                }
                v0 = this.b((com.caverock.androidsvg.ap)p0);
            }
            this.d(p0);
            p2.setFillType(v0.getFillType());
            p2.addPath(v0, p3);
        }
        else {
            v1 = new Object[1];
            v1[0] = p0.getClass().getSimpleName();
            com.caverock.androidsvg.cf.b("Invalid %s element found in clipPath definition", v1);
        }
        this.a.restore();
        this.h = (com.caverock.androidsvg.cm)this.i.pop();
    }

    private final void a(com.caverock.androidsvg.br p0) {
 14:    v4 = p0.i.iterator();
 22:    if (!v4.hasNext())
175:        return;
 28:    v0 = (com.caverock.androidsvg.bm)v4.next();
 32:    if (!(v0 instanceof com.caverock.androidsvg.bf)) goto 18;
 41:    if (((com.caverock.androidsvg.bf)v0).c() != 0) goto 18;
 43:    v5 = ((com.caverock.androidsvg.bf)v0).d();
 47:    if (v5 == 0) goto 61;
 53:    if (v5.isEmpty()) goto 18;
 59:    if (!v5.contains(Locale.getDefault().getLanguage())) goto 18;
 61:    v5 = ((com.caverock.androidsvg.bf)v0).b();
 65:    if (v5 == 0) goto 88;
 69:    if (com.caverock.androidsvg.cf.n == 0)
 71:        com.caverock.androidsvg.cf.i();
 78:    if (v5.isEmpty()) goto 18;
 86:    if (!com.caverock.androidsvg.cf.n.containsAll(v5)) goto 18;
 88:    v5 = ((com.caverock.androidsvg.bf)v0).e();
 92:    if (v5 == 0) goto 121;
 98:    if (v5.isEmpty()) goto 18;
100:    if (this.g.c == 0) goto 18;
102:    v5 = v5.iterator();
110:    if (v5.hasNext()) {
112:        v5.next();
120:        throw new NoSuchMethodError();
        }
121:    v1 = ((com.caverock.androidsvg.bf)v0).f();
125:    if (v1 == 0) {
172:        this.b(v0);
175:        return;
        }
131:    if (!v1.isEmpty() && this.g.c != 0) {
135:        v1 = v1.iterator();
143:        if (v1.hasNext()) {
145:            v1.next();
154:            this.h.a.q.intValue();
163:            String.valueOf(this.h.a.r);
171:            throw new NoSuchMethodError();
            }
172:        this.b(v0);
175:        return;
        }
134:    goto 18;
    }

    private final void a(com.caverock.androidsvg.bx p0, com.caverock.androidsvg.co p1) {
        if (this.k()) {
            v9 = p0.i.iterator();
            v1 = 1;
            while (v9.hasNext()) {
                v0 = (com.caverock.androidsvg.bm)v9.next();
                if (v0 instanceof com.caverock.androidsvg.cb) {
                    v2 = ((com.caverock.androidsvg.cb)v0).a;
                    if (!v9.hasNext())
                        v0 = 1;
                    else
                        v0 = 0;
                    p1.a(this.a(v2, v1, v0));
                }
                else if (p1.a((com.caverock.androidsvg.bx)v0)) {
                    if (v0 instanceof com.caverock.androidsvg.by) {
                        this.d();
                        this.a(this.h, (com.caverock.androidsvg.by)v0);
                        if (this.k()) {
                            if (this.c()) {
                                v1 = ((com.caverock.androidsvg.by)v0).t.b(((com.caverock.androidsvg.by)v0).a);
                                if (v1 == 0) {
                                    v2 = new Object[1];
                                    v2[0] = ((com.caverock.androidsvg.by)v0).a;
                                    com.caverock.androidsvg.cf.b("TextPath reference '%s' not found", v2);
                                }
                                else {
                                    v6 = new com.caverock.androidsvg.ci(((com.caverock.androidsvg.al)v1).a).a;
                                    if (((com.caverock.androidsvg.al)v1).e != 0)
                                        v6.transform(((com.caverock.androidsvg.al)v1).e);
                                    if (((com.caverock.androidsvg.by)v0).b != 0)
                                        v1 = ((com.caverock.androidsvg.by)v0).b.a(this, new PathMeasure(v6, 0).getLength());
                                    else
                                        v1 = 0;
                                    v2 = this.j();
                                    if (v2 != com.caverock.androidsvg.ba.a) {
                                        v7 = this.a((com.caverock.androidsvg.by)v0);
                                        if (v2 == com.caverock.androidsvg.ba.b)
                                            v2 = v1 - v7 / 1073741824;
                                        else
                                            v2 = v1 - v7;
                                    }
                                    else
                                        v2 = v1;
                                    this.c((com.caverock.androidsvg.bj)((com.caverock.androidsvg.by)v0).c);
                                    this.a((com.caverock.androidsvg.by)v0, new com.caverock.androidsvg.cj(this, v6, v2));
                                    if (this.g())
                                        this.b((com.caverock.androidsvg.by)v0);
                                }
                            }
                        }
                        this.e();
                    }
                    else if (v0 instanceof com.caverock.androidsvg.bu) {
                        this.d();
                        v0 = (com.caverock.androidsvg.bu)v0;
                        this.a(this.h, v0);
                        if (this.k()) {
                            if (p1 instanceof com.caverock.androidsvg.ck) {
                                if (v0.b == 0 || v0.b.size() == 0)
                                    v2 = ((com.caverock.androidsvg.ck)p1).c;
                                else
                                    v2 = ((com.caverock.androidsvg.af)v0.b.get(0)).a(this);
                                if (v0.c == 0 || v0.c.size() == 0)
                                    v6 = ((com.caverock.androidsvg.ck)p1).d;
                                else
                                    v6 = ((com.caverock.androidsvg.af)v0.c.get(0)).b(this);
                                if (v0.d == 0 || v0.d.size() == 0)
                                    v7 = 0;
                                else
                                    v7 = ((com.caverock.androidsvg.af)v0.d.get(0)).a(this);
                                if (v0.e == 0 || v0.e.size() == 0)
                                    v1 = 0;
                                else
                                    v1 = ((com.caverock.androidsvg.af)v0.e.get(0)).b(this);
                                v8 = v2;
                                v2 = v1;
                            }
                            else {
                                v2 = 0;
                                v7 = 0;
                                v6 = 0;
                                v8 = 0;
                            }
                            this.c((com.caverock.androidsvg.bj)v0.a);
                            if (p1 instanceof com.caverock.androidsvg.ck) {
                                ((com.caverock.androidsvg.ck)p1).c = v7 + v8;
                                ((com.caverock.androidsvg.ck)p1).d = v2 + v6;
                            }
                            this.a(v0, p1);
                            if (this.g())
                                this.b(v0);
                        }
                        this.e();
                    }
                    else if (v0 instanceof com.caverock.androidsvg.bt) {
                        this.d();
                        v1 = (com.caverock.androidsvg.bt)v0;
                        this.a(this.h, v1);
                        if (this.k()) {
                            this.c((com.caverock.androidsvg.bj)v1.b);
                            v0 = v0.t.b(v1.a);
                            if (v0 != 0 && v0 instanceof com.caverock.androidsvg.bx) {
                                v1 = new StringBuilder();
                                this.a((com.caverock.androidsvg.bx)v0, v1);
                                if (v1.length() > 0)
                                    p1.a(v1.toString());
                            }
                            else {
                                v2 = new Object[1];
                                v2[0] = v1.a;
                                com.caverock.androidsvg.cf.b("Tref reference '%s' not found", v2);
                            }
                        }
                        this.e();
                    }
                }
                v1 = 0;
            }
        }
    }

    private final void a(com.caverock.androidsvg.bx p0, StringBuilder p1) {
        v4 = p0.i.iterator();
        v1 = 1;
        while (v4.hasNext()) {
            v0 = (com.caverock.androidsvg.bm)v4.next();
            if (v0 instanceof com.caverock.androidsvg.bx)
                this.a((com.caverock.androidsvg.bx)v0, p1);
            else if (v0 instanceof com.caverock.androidsvg.cb) {
                v5 = ((com.caverock.androidsvg.cb)v0).a;
                if (!v4.hasNext())
                    v0 = 1;
                else
                    v0 = 0;
                p1.append(this.a(v5, v1, v0));
            }
            v1 = 0;
        }
    }

    private final void a(com.caverock.androidsvg.cm p0, com.caverock.androidsvg.bk p1) {
        if (p1.u == 0)
            v0 = 1;
        else
            v0 = 0;
        p0.a.A = Boolean.TRUE;
        if (v0 != 0)
            v0 = Boolean.TRUE;
        else
            v0 = Boolean.FALSE;
        p0.a.v = v0;
        p0.a.w = 0;
        p0.a.E = 0;
        p0.a.m = Float.valueOf(1065353216);
        p0.a.C = com.caverock.androidsvg.v.b;
        p0.a.D = Float.valueOf(1065353216);
        p0.a.G = 0;
        p0.a.H = 0;
        p0.a.I = Float.valueOf(1065353216);
        p0.a.J = 0;
        p0.a.K = Float.valueOf(1065353216);
        p0.a.L = com.caverock.androidsvg.bd.a;
        if (p1.q != 0)
            this.a(p0, p1.q);
        if (this.g.e.a == 0 || this.g.e.a.isEmpty())
            v0 = 1;
        else
            v0 = 0;
        if (v0 == 0)
            v0 = 1;
        else
            v0 = 0;
        if (v0 == 0) {
            if (p1.r != 0)
                this.a(p0, p1.r);
            return;
        }
        v4 = this.g.e.a.iterator();
        while (true) {
            if (!v4.hasNext()) {
                if (p1.r != 0)
                    this.a(p0, p1.r);
                return;
            }
            v1 = (com.caverock.androidsvg.g)v4.next();
            v6 = new ArrayList();
            v0 = p1.u;
            while (v0 != 0) {
                v6.add(0, v0);
                v0 = ((com.caverock.androidsvg.bm)v0).u;
            }
            v0 = v6.size() - 1;
            if (v1.a.a() == 1)
                v0 = com.caverock.androidsvg.a.a(v1.a.a(0), v6, v0, p1);
            else
                v0 = com.caverock.androidsvg.a.a(v1.a, v1.a.a() - 1, v6, v0, p1);
            if (v0 != 0)
                this.a(p0, v1.b);
        }
    }

    private static void a(com.caverock.androidsvg.cm p0, boolean p1, com.caverock.androidsvg.bn p2) {
        if (p1 != 0)
            v0 = p0.a.d;
        else
            v0 = p0.a.f;
        v1 = v0.floatValue();
        if (p2 instanceof com.caverock.androidsvg.v)
            v0 = ((com.caverock.androidsvg.v)p2).a;
        else {
            if (!(p2 instanceof com.caverock.androidsvg.w))
                return;
            v0 = p0.a.n.a;
        }
        v0 = v0 | com.caverock.androidsvg.cf.a(v1) << 24;
        if (p1 != 0)
            p0.d.setColor(v0);
        else
            p0.e.setColor(v0);
    }

    private static void a(com.caverock.androidsvg.z p0, String p1) {
        while (true) {
            v2 = p0.t.b(p1);
            if (v2 == 0)
                break;
            if (!(v2 instanceof com.caverock.androidsvg.z)) {
                com.caverock.androidsvg.cf.b("Gradient href attributes must point to other gradient elements", new Object[0]);
                return;
            }
            if (v2 == p0) {
                v2 = new Object[1];
                v2[0] = p1;
                com.caverock.androidsvg.cf.b("Circular reference in gradient href attribute '%s'", v2);
                return;
            }
            if (p0.b == 0)
                p0.b = ((com.caverock.androidsvg.z)v2).b;
            if (p0.c == 0)
                p0.c = ((com.caverock.androidsvg.z)v2).c;
            if (p0.d == 0)
                p0.d = ((com.caverock.androidsvg.z)v2).d;
            if (p0.a.isEmpty())
                p0.a = ((com.caverock.androidsvg.z)v2).a;
            try {
                if (p0 instanceof com.caverock.androidsvg.bl) {
                    if (((com.caverock.androidsvg.bl)p0).f == 0)
                        ((com.caverock.androidsvg.bl)p0).f = ((com.caverock.androidsvg.bl)v2).f;
                    if (((com.caverock.androidsvg.bl)p0).g == 0)
                        ((com.caverock.androidsvg.bl)p0).g = ((com.caverock.androidsvg.bl)v2).g;
                    if (((com.caverock.androidsvg.bl)p0).h == 0)
                        ((com.caverock.androidsvg.bl)p0).h = ((com.caverock.androidsvg.bl)v2).h;
                    if (((com.caverock.androidsvg.bl)p0).i == 0)
                        ((com.caverock.androidsvg.bl)p0).i = ((com.caverock.androidsvg.bl)v2).i;
                }
                else {
                    try {
                        if (((com.caverock.androidsvg.bp)p0).f == 0)
                            ((com.caverock.androidsvg.bp)p0).f = ((com.caverock.androidsvg.bp)v2).f;
                        if (((com.caverock.androidsvg.bp)p0).g == 0)
                            ((com.caverock.androidsvg.bp)p0).g = ((com.caverock.androidsvg.bp)v2).g;
                        if (((com.caverock.androidsvg.bp)p0).h == 0)
                            ((com.caverock.androidsvg.bp)p0).h = ((com.caverock.androidsvg.bp)v2).h;
                        if (((com.caverock.androidsvg.bp)p0).i == 0)
                            ((com.caverock.androidsvg.bp)p0).i = ((com.caverock.androidsvg.bp)v2).i;
                        if (((com.caverock.androidsvg.bp)p0).j == 0)
                            ((com.caverock.androidsvg.bp)p0).j = ((com.caverock.androidsvg.bp)v2).j;
                    }
                    catch (ClassCastException ex) {
                    }
                }
            }
            catch (ClassCastException ex) {
            }
            if (((com.caverock.androidsvg.z)v2).e == 0)
                return;
            p1 = ((com.caverock.androidsvg.z)v2).e;
        }
        v2 = new Object[1];
        v2[0] = p1;
        com.caverock.androidsvg.cf.a("Gradient reference '%s' not found", v2);
    }

    static void a(String p0, Object[] p1) {
        Log.w("SVGAndroidRenderer", String.format(p0, p1));
    }

    private final void a(boolean p0, com.caverock.androidsvg.r p1, com.caverock.androidsvg.ak p2) {
        v12 = this.g.b(p2.a);
        if (v12 == 0) {
            v6 = new Object[2];
            if (p0 != 0)
                v4 = "Fill";
            else
                v4 = "Stroke";
            v6[0] = v4;
            v6[1] = p2.a;
            com.caverock.androidsvg.cf.b("%s reference '%s' not found", v6);
            if (p2.b != 0)
                com.caverock.androidsvg.cf.a(this.h, p0, p2.b);
            else if (p0 != 0)
                this.h.b = 0;
            else
                this.h.c = 0;
        }
        else {
            if (v12 instanceof com.caverock.androidsvg.bl) {
                v4 = (com.caverock.androidsvg.bl)v12;
                if (v4.e != 0)
                    com.caverock.androidsvg.cf.a(v4, v4.e);
                if (v4.b != 0 && v4.b.booleanValue())
                    v9 = 1;
                else
                    v9 = 0;
                if (p0 != 0)
                    v15 = this.h.d;
                else
                    v15 = this.h.e;
                if (v9 != 0) {
                    if (v4.f != 0)
                        v5 = v4.f.a(this);
                    else
                        v5 = 0;
                    if (v4.g != 0)
                        v6 = v4.g.b(this);
                    else
                        v6 = 0;
                    if (v4.h != 0)
                        v7 = v4.h.a(this);
                    else
                        v7 = this.b().c;
                    if (v4.i != 0)
                        v8 = v4.i.b(this);
                    else
                        v8 = 0;
                }
                else {
                    if (v4.f != 0)
                        v5 = v4.f.a(this, 1065353216);
                    else
                        v5 = 0;
                    if (v4.g != 0)
                        v6 = v4.g.a(this, 1065353216);
                    else
                        v6 = 0;
                    if (v4.h != 0)
                        v7 = v4.h.a(this, 1065353216);
                    else
                        v7 = 1065353216;
                    if (v4.i != 0)
                        v8 = v4.i.a(this, 1065353216);
                    else
                        v8 = 0;
                }
                this.d();
                this.h = this.c(v4);
                v16 = new Matrix();
                if (v9 == 0) {
                    v16.preTranslate(p1.a, p1.b);
                    v16.preScale(p1.c, p1.d);
                }
                if (v4.c != 0)
                    v16.preConcat(v4.c);
                v17 = v4.a.size();
                if (v17 == 0) {
                    this.e();
                    if (p0 != 0)
                        this.h.b = 0;
                    else
                        this.h.c = 0;
                }
                else {
                    v9 = new int[v17];
                    v10 = new float[v17];
                    v18 = v4.a.iterator();
                    v14 = 0;
                    v13 = -1082130432;
                    while (v18.hasNext()) {
                        v11 = (com.caverock.androidsvg.au)(com.caverock.androidsvg.bm)v18.next();
                        if (v14 == 0 || v11.a.floatValue() >= v13) {
                            v10[v14] = v11.a.floatValue();
                            v13 = v11.a.floatValue();
                        }
                        else
                            v10[v14] = v13;
                        this.d();
                        this.a(this.h, v11);
                        v11 = (com.caverock.androidsvg.v)this.h.a.C;
                        if (v11 == 0)
                            v11 = com.caverock.androidsvg.v.b;
                        v9[v14] = v11.a | com.caverock.androidsvg.cf.a(this.h.a.D.floatValue()) << 24;
                        this.e();
                        v14 = v14 + 1;
                    }
                    if (v5 == v7) {
                        if (v6 == v8 || v17 == 1) {
                            this.e();
                            v15.setColor(v9[v17 - 1]);
                        }
                        else {
                            v11 = Shader$TileMode.CLAMP;
                            if (v4.d != 0) {
                                if (v4.d == com.caverock.androidsvg.aa.b)
                                    v11 = Shader$TileMode.MIRROR;
                                else if (v4.d == com.caverock.androidsvg.aa.c)
                                    v11 = Shader$TileMode.REPEAT;
                            }
                            this.e();
                            v4 = new LinearGradient(v5, v6, v7, v8, v9, v10, v11);
                            v4.setLocalMatrix(v16);
                            v15.setShader(v4);
                        }
                    }
                }
            }
            if (v12 instanceof com.caverock.androidsvg.bp)
                this.a(p0, p1, (com.caverock.androidsvg.bp)v12);
            if (v12 instanceof com.caverock.androidsvg.at) {
                v12 = (com.caverock.androidsvg.at)v12;
                if (p0 != 0) {
                    if (com.caverock.androidsvg.cf.a(v12.q, 2147483648)) {
                        this.h.a.b = v12.q.H;
                        if (v12.q.H != 0)
                            v4 = 1;
                        else
                            v4 = 0;
                        this.h.b = v4;
                    }
                    if (com.caverock.androidsvg.cf.a(v12.q, 4294967296))
                        this.h.a.d = v12.q.I;
                    if (com.caverock.androidsvg.cf.a(v12.q, 6442450944))
                        com.caverock.androidsvg.cf.a(this.h, p0, this.h.a.b);
                }
                else {
                    if (com.caverock.androidsvg.cf.a(v12.q, 2147483648)) {
                        this.h.a.e = v12.q.H;
                        if (v12.q.H != 0)
                            v4 = 1;
                        else
                            v4 = 0;
                        this.h.c = v4;
                    }
                    if (com.caverock.androidsvg.cf.a(v12.q, 4294967296))
                        this.h.a.f = v12.q.I;
                    if (com.caverock.androidsvg.cf.a(v12.q, 6442450944))
                        com.caverock.androidsvg.cf.a(this.h, p0, this.h.a.e);
                }
            }
        }
    }

    private final void a(boolean p0, com.caverock.androidsvg.r p1, com.caverock.androidsvg.bp p2) {
        if (p2.e != 0)
            com.caverock.androidsvg.cf.a(p2, p2.e);
        if (p2.b != 0 && p2.b.booleanValue())
            v5 = 1;
        else
            v5 = 0;
        if (p0 != 0)
            v9 = this.h.d;
        else
            v9 = this.h.e;
        if (v5 != 0) {
            v3 = new com.caverock.androidsvg.af(1112014848, com.caverock.androidsvg.cc.i);
            if (p2.f != 0)
                v1 = p2.f.a(this);
            else
                v1 = v3.a(this);
            if (p2.g != 0)
                v2 = p2.g.b(this);
            else
                v2 = v3.b(this);
            if (p2.h != 0)
                v3 = p2.h.c(this);
            else
                v3 = v3.c(this);
            v4 = v3;
            v3 = v2;
            v2 = v1;
        }
        else {
            if (p2.f != 0)
                v1 = p2.f.a(this, 1065353216);
            else
                v1 = 1056964608;
            if (p2.g != 0)
                v2 = p2.g.a(this, 1065353216);
            else
                v2 = 1056964608;
            if (p2.h != 0)
                v3 = p2.h.a(this, 1065353216);
            else
                v3 = 1056964608;
            v4 = v3;
            v3 = v2;
            v2 = v1;
        }
        this.d();
        this.h = this.c(p2);
        v10 = new Matrix();
        if (v5 == 0) {
            v10.preTranslate(p1.a, p1.b);
            v10.preScale(p1.c, p1.d);
        }
        if (p2.c != 0)
            v10.preConcat(p2.c);
        v11 = p2.a.size();
        if (v11 == 0) {
            this.e();
            if (p0 != 0)
                this.h.b = 0;
            else
                this.h.c = 0;
        }
        else {
            v5 = new int[v11];
            v6 = new float[v11];
            v12 = p2.a.iterator();
            v8 = 0;
            v7 = -1082130432;
            while (v12.hasNext()) {
                v1 = (com.caverock.androidsvg.au)(com.caverock.androidsvg.bm)v12.next();
                if (v8 == 0 || v1.a.floatValue() >= v7) {
                    v6[v8] = v1.a.floatValue();
                    v7 = v1.a.floatValue();
                }
                else
                    v6[v8] = v7;
                this.d();
                this.a(this.h, v1);
                v1 = (com.caverock.androidsvg.v)this.h.a.C;
                if (v1 == 0)
                    v1 = com.caverock.androidsvg.v.b;
                v5[v8] = v1.a | com.caverock.androidsvg.cf.a(this.h.a.D.floatValue()) << 24;
                this.e();
                v8 = v8 + 1;
            }
            if (v4 == 0 || v11 == 1) {
                this.e();
                v9.setColor(v5[v11 - 1]);
            }
            else {
                v7 = Shader$TileMode.CLAMP;
                if (p2.d != 0) {
                    if (p2.d == com.caverock.androidsvg.aa.b)
                        v7 = Shader$TileMode.MIRROR;
                    else if (p2.d == com.caverock.androidsvg.aa.c)
                        v7 = Shader$TileMode.REPEAT;
                }
                this.e();
                v1 = new RadialGradient(v2, v3, v4, v5, v6, v7);
                v1.setLocalMatrix(v10);
                v9.setShader(v1);
            }
        }
    }

    private static boolean a(com.caverock.androidsvg.av p0, long p1) {
        if (p0.a & p1)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final Path b(com.caverock.androidsvg.ap p0) {
        v1 = new Path();
        v1.moveTo(p0.a[0], p0.a[1]);
        v0 = 2;
        while (v0 < p0.a.length) {
            v1.lineTo(p0.a[v0], p0.a[v0 + 1]);
            v0 = v0 + 2;
        }
        if (p0 instanceof com.caverock.androidsvg.aq)
            v1.close();
        if (p0.n == 0)
            p0.n = com.caverock.androidsvg.cf.b(v1);
        v1.setFillType(this.m());
        return v1;
    }

    private static com.caverock.androidsvg.r b(Path p0) {
        v0 = new RectF();
        p0.computeBounds(v0, 1);
        return new com.caverock.androidsvg.r(v0.left, v0.top, v0.width(), v0.height());
    }

    private static void b(float p0, float p1, float p2, float p3, float p4, boolean p5, boolean p6, float p7, float p8, com.caverock.androidsvg.an p9) {
        if (p0 != p7 || p1 != p8) {
            if (p2 == 0 || p3 == 0) {
                p9.b(p7, p8);
                return;
            }
            v9 = Math.abs(p2);
            v8 = Math.abs(p3);
            v4 = Math.toRadians((double)p4 % 4645040803167600640);
            v14 = Math.cos((double)(float)v4);
            v16 = Math.sin((double)(float)v4);
            v18 = v14 * (double)(p0 - p7) / 4611686018427387904 + v16 * (double)(p1 - p8) / 4611686018427387904;
            v20 = (double)(p0 - p7) / 4611686018427387904 * -v16 + (double)(p1 - p8) / 4611686018427387904 * v14;
            v10 = v18 * v18 / (double)(v9 * v9) + v20 * v20 / (double)(v8 * v8);
            if (v10 > 4607182418800017408) {
                v9 = v9 * (float)Math.sqrt(v10);
                v8 = v8 * (float)Math.sqrt(v10);
                v10 = (double)(v9 * v9);
                v12 = v8;
                v13 = v9;
                v8 = (double)(v8 * v8);
            }
            else {
                v10 = (double)(v9 * v9);
                v12 = v8;
                v13 = v9;
                v8 = (double)(v8 * v8);
            }
            if (p5 == p6)
                v6 = -4616189618054758400;
            else
                v6 = 4607182418800017408;
            v4 = (v10 * v8 - v10 * v20 * v20 - v8 * v18 * v18) / (v8 * v18 * v18 + v10 * v20 * v20);
            if (v4 < 0)
                v4 = 0;
            v4 = Math.sqrt(v4) * v6;
            v8 = (double)(p0 + p7) / 4611686018427387904 + v14 * (double)v13 * v20 / (double)v12 * v4 - v16 * v4 * -((double)v12 * v18 / (double)v13);
            v10 = (double)(p1 + p8) / 4611686018427387904 + v14 * v4 * -((double)v12 * v18 / (double)v13) + v16 * (double)v13 * v20 / (double)v12 * v4;
            v14 = (v18 - (double)v13 * v20 / (double)v12 * v4) / (double)v13;
            v16 = (v20 - v4 * -((double)v12 * v18 / (double)v13)) / (double)v12;
            v6 = (-v18 - (double)v13 * v20 / (double)v12 * v4) / (double)v13;
            v18 = (-v20 - v4 * -((double)v12 * v18 / (double)v13)) / (double)v12;
            if (v16 < 0)
                v4 = -4616189618054758400;
            else
                v4 = 4607182418800017408;
            v20 = Math.toDegrees(v4 * Math.acos(v14 / Math.sqrt(v14 * v14 + v16 * v16)));
            if (v14 * v18 - v6 * v16 < 0)
                v4 = -4616189618054758400;
            else
                v4 = 4607182418800017408;
            v4 = Math.toDegrees(v4 * Math.acos((v16 * v18 + v14 * v6) / Math.sqrt((v14 * v14 + v16 * v16) * (v6 * v6 + v18 * v18))));
            if (p6 == 0 && v4 > 0)
                v4 = v4 - 4645040803167600640;
            else if (p6 != 0 && v4 < 0)
                v4 = v4 + 4645040803167600640;
            v14 = (int)Math.ceil(Math.abs(v4 % 4645040803167600640) / 4636033603912859648);
            v15 = (float)(Math.toRadians(v4 % 4645040803167600640) / (double)v14);
            v16 = 4608683618675807573 * Math.sin((double)v15 / 4611686018427387904) / (4607182418800017408 + Math.cos((double)v15 / 4611686018427387904));
            v18 = new float[v14 * 6];
            v5 = 0;
            v4 = 0;
            while (v4 < v14) {
                v20 = (double)((float)v4 * v15) + Math.toRadians(v20 % 4645040803167600640);
                v22 = Math.cos(v20);
                v24 = Math.sin(v20);
                v19 = v5 + 1;
                v18[v5] = (float)(v22 - v16 * v24);
                v5 = v19 + 1;
                v18[v19] = (float)(v22 * v16 + v24);
                v22 = Math.cos(v20 + (double)v15);
                v20 = Math.sin(v20 + (double)v15);
                v19 = v5 + 1;
                v18[v5] = (float)(v16 * v20 + v22);
                v5 = v19 + 1;
                v18[v19] = (float)(v20 - v16 * v22);
                v19 = v5 + 1;
                v18[v5] = (float)v22;
                v5 = v19 + 1;
                v18[v19] = (float)v20;
                v4 = v4 + 1;
            }
            v4 = new Matrix();
            v4.postScale(v13, v12);
            v4.postRotate(p4);
            v4.postTranslate((float)v8, (float)v10);
            v4.mapPoints(v18);
            v18[v18.length - 2] = p7;
            v18[v18.length - 1] = p8;
            v11 = 0;
            while (v11 < v18.length) {
                p9.a(v18[v11], v18[v11 + 1], v18[v11 + 2], v18[v11 + 3], v18[v11 + 4], v18[v11 + 5]);
                v11 = v11 + 6;
            }
        }
    }

    private final void b(com.caverock.androidsvg.bj p0) {
        if (this.h.a.G == 0) {
            this.e();
            return;
        }
        if (this.h.i == 0) {
            this.e();
            return;
        }
        this.h();
        v1 = (com.caverock.androidsvg.ai)this.g.b(this.h.a.G);
        if (v1.a != 0 && v1.a.booleanValue())
            v2 = 1;
        else
            v2 = 0;
        if (v2 != 0) {
            if (v1.e != 0)
                v2 = v1.e.a(this);
            else
                v2 = p0.n.c;
            if (v1.f != 0)
                v3 = v1.f.b(this);
            else
                v3 = p0.n.d;
            if (v1.c != 0)
                v1.c.a(this);
            if (v1.d != 0)
                v1.d.b(this);
        }
        else {
            if (v1.c != 0)
                v1.c.a(this, 1065353216);
            if (v1.d != 0)
                v1.d.a(this, 1065353216);
            if (v1.e != 0)
                v2 = v1.e.a(this, 1065353216);
            else
                v2 = 1067030938;
            if (v1.f != 0)
                v3 = v1.f.a(this, 1065353216);
            else
                v3 = 1067030938;
            v2 = v2 * p0.n.c;
            v3 = v3 * p0.n.d;
        }
        if (v2 != 0 && v3 != 0) {
            this.d();
            this.h = this.c(v1);
            this.h.a.m = Float.valueOf(1065353216);
            if (v1.b == 0 || v1.b.booleanValue())
                v2 = 1;
            else
                v2 = 0;
            if (v2 == 0) {
                this.a.translate(p0.n.a, p0.n.b);
                this.a.scale(p0.n.c, p0.n.d);
            }
            this.a(v1, 0);
            this.e();
        }
        v1 = (Bitmap)this.m.pop();
        v15 = (Bitmap)this.m.pop();
        v4 = v1.getWidth();
        v2 = new int[v4];
        v17 = new int[v4];
        v6 = 0;
        while (true) {
            if (v6 >= v1.getHeight()) {
                v1.recycle();
                this.a = (Canvas)this.l.pop();
                this.a.save();
                this.a.setMatrix(new Matrix());
                this.a.drawBitmap(v15, 0, 0, this.h.d);
                v15.recycle();
                this.a.restore();
                this.e();
                return;
            }
            v1.getPixels(v2, 0, v4, 0, v6, v4, 1);
            v15.getPixels(v17, 0, v4, 0, v6, v4, 1);
            v3 = 0;
            while (v3 < v4) {
                if (!(v2[v3] >> 24 & 255))
                    v17[v3] = 0;
                else
                    v17[v3] = (v2[v3] >> 24 & 255) * ((v2[v3] & 255) * 2362 + (v2[v3] >> 8 & 255) * 23442 + (v2[v3] >> 16 & 255) * 6963) / 8355840 * (v17[v3] >> 24 & 255) / 255 << 24 | v17[v3] & 16777215;
                v3 = v3 + 1;
            }
            v15.setPixels(v17, 0, v4, 0, v6, v4, 1);
            v6 = v6 + 1;
        }
    }

    private final void b(com.caverock.androidsvg.bm p0) {
  5:    v2 = 0;
  8:    if (p0 instanceof com.caverock.androidsvg.aj)
 10:        return;
 11:    this.d();
 14:    this.a(p0);
 19:    if (!(p0 instanceof com.caverock.androidsvg.be)) goto 34;
 27:    this.a((com.caverock.androidsvg.be)p0, ((com.caverock.androidsvg.be)p0).c, ((com.caverock.androidsvg.be)p0).d);
 30:    this.e();
 33:    return;
 36:    if (!(p0 instanceof com.caverock.androidsvg.cd)) goto 395;
 38:    p0 = (com.caverock.androidsvg.cd)p0;
 42:    if ((p0.e == 0 || !p0.e.a()) && (p0.f == 0 || !p0.f.a())) {
 66:        this.a(this.h, p0);
 73:        if (this.k()) {
 79:            v0 = p0.t.b(p0.a);
 83:            if (v0 == 0) {
 87:                v1 = new Object[1];
 91:                v1[0] = p0.a;
 93:                com.caverock.androidsvg.cf.b("Use reference '%s' not found", v1);
                }
                else {
 99:                if (p0.b != 0)
105:                    this.a.concat(p0.b);
110:                v4 = new Matrix();
115:                if (p0.c != 0)
119:                    v1 = p0.c.a(this);
                    else
191:                    v1 = 0;
125:                if (p0.d != 0)
129:                    v3 = p0.d.b(this);
                    else
193:                    v3 = 0;
133:                v4.preTranslate(v1, v3);
138:                this.a.concat(v4);
141:                this.d(p0);
148:                this.a(p0);
153:                if (v0 instanceof com.caverock.androidsvg.be) {
155:                    this.d();
162:                    if (p0.e != 0)
164:                        v1 = p0.e;
                        else
195:                        v1 = ((com.caverock.androidsvg.be)v0).c;
168:                    if (p0.f != 0)
170:                        v2 = p0.f;
                        else
198:                        v2 = ((com.caverock.androidsvg.be)v0).d;
172:                    this.a((com.caverock.androidsvg.be)v0, v1, v2);
175:                    this.e();
                    }
203:                else if (v0 instanceof com.caverock.androidsvg.bs) {
207:                    if (p0.e != 0)
209:                        v1 = p0.e;
                        else
246:                        v1 = new com.caverock.androidsvg.af(1120403456, com.caverock.androidsvg.cc.i);
213:                    if (p0.f != 0)
215:                        v3 = p0.f;
                        else
254:                        v3 = new com.caverock.androidsvg.af(1120403456, com.caverock.androidsvg.cc.i);
217:                    this.d();
222:                    if ((v1 == 0 || !v1.a()) && (v3 == 0 || !v3.a())) {
260:                        if (((com.caverock.androidsvg.bs)v0).v != 0)
262:                            v4 = ((com.caverock.androidsvg.bs)v0).v;
                            else
372:                            v4 = com.caverock.androidsvg.m.d;
266:                        this.a(this.h, (com.caverock.androidsvg.bs)v0);
269:                        if (v1 != 0)
275:                            v5 = v1.a(this);
                            else
381:                            v5 = this.h.f.c;
276:                        if (v3 != 0)
278:                            v1 = v3.a(this);
                            else
387:                            v1 = this.h.f.d;
289:                        this.h.f = new com.caverock.androidsvg.r(0, 0, v5, v1);
301:                        if (!this.h.a.v.booleanValue())
327:                            this.a(this.h.f.a, this.h.f.b, this.h.f.c, this.h.f.d);
332:                        if (((com.caverock.androidsvg.bs)v0).w != 0) {
346:                            this.a.concat(com.caverock.androidsvg.cf.a(this.h.f, ((com.caverock.androidsvg.bs)v0).w, v4));
353:                            this.h.g = ((com.caverock.androidsvg.bs)v0).w;
                            }
359:                        this.a((com.caverock.androidsvg.bs)v0, 1);
362:                        if (this.g())
364:                            this.b((com.caverock.androidsvg.bs)v0);
367:                        this.a((com.caverock.androidsvg.bs)v0);
                        }
238:                    this.e();
                    }
                    else
390:                    this.b(v0);
178:                this.f();
181:                if (this.g())
183:                    this.b(p0);
186:                this.a(p0);
                }
            }
        }
 96:    goto 30;
397:    if (!(p0 instanceof com.caverock.androidsvg.br)) goto 443;
403:    this.a(this.h, (com.caverock.androidsvg.br)p0);
410:    if (this.k()) {
414:        if (((com.caverock.androidsvg.br)p0).b != 0)
420:            this.a.concat(((com.caverock.androidsvg.br)p0).b);
423:        this.d((com.caverock.androidsvg.br)p0);
430:        this.a((com.caverock.androidsvg.br)p0);
433:        if (this.g())
435:            this.b((com.caverock.androidsvg.br)p0);
438:        this.a((com.caverock.androidsvg.br)p0);
        }
441:    goto 30;
445:    if (!(p0 instanceof com.caverock.androidsvg.ac)) goto 491;
451:    this.a(this.h, (com.caverock.androidsvg.ac)p0);
458:    if (this.k()) {
462:        if (((com.caverock.androidsvg.ac)p0).b != 0)
468:            this.a.concat(((com.caverock.androidsvg.ac)p0).b);
471:        this.d((com.caverock.androidsvg.ac)p0);
478:        this.a((com.caverock.androidsvg.ac)p0, 1);
481:        if (this.g())
483:            this.b((com.caverock.androidsvg.ac)p0);
486:        this.a((com.caverock.androidsvg.ac)p0);
        }
489:    goto 30;
493:    if (!(p0 instanceof com.caverock.androidsvg.ae)) goto 807;
495:    p0 = (com.caverock.androidsvg.ae)p0;
499:    if (p0.d == 0) {
 30:        this.e();
 33:        return;
        }
507:    if (p0.d.a()) {
 30:        this.e();
 33:        return;
        }
511:    if (p0.e == 0) {
 30:        this.e();
 33:        return;
        }
519:    if (p0.e.a()) {
 30:        this.e();
 33:        return;
        }
523:    if (p0.a == 0) {
 30:        this.e();
 33:        return;
        }
527:    if (p0.v != 0)
529:        v0 = p0.v;
        else
556:        v0 = com.caverock.androidsvg.m.d;
539:    if (!p0.a.startsWith("data:"))
541:        v4 = 0;
565:    else if (p0.a.length() < 14)
567:        v4 = 0;
        else {
571:        v4 = p0.a.indexOf(44);
576:        if (v4 == -1 || v4 < 12)
582:            v4 = 0;
596:        else if (!";base64".equals(p0.a.substring(v4 - 7, v4)))
598:            v4 = 0;
            else {
606:            v1 = Base64.decode(p0.a.substring(v4 + 1), 0);
615:            v4 = BitmapFactory.decodeByteArray(v1, 0, v1.length);
            }
        }
542:    if (v4 == 0) {
548:        if (this.g.c == 0) {
 30:            this.e();
 33:            return;
            }
555:        throw new NoSuchMethodError();
        }
617:    if (v4 == 0) {
621:        v1 = new Object[1];
625:        v1[0] = p0.a;
627:        com.caverock.androidsvg.cf.b("Could not locate image '%s'", v1);
        }
        else {
634:        this.a(this.h, p0);
641:        if (this.k() && this.c()) {
651:            if (p0.f != 0)
657:                this.a.concat(p0.f);
662:            if (p0.b != 0)
666:                v1 = p0.b.a(this);
                else
802:                v1 = 0;
672:            if (p0.c != 0)
676:                v3 = p0.c.b(this);
                else
805:                v3 = 0;
699:            this.h.f = new com.caverock.androidsvg.r(v1, v3, p0.d.a(this), p0.e.a(this));
711:            if (!this.h.a.v.booleanValue())
737:                this.a(this.h.f.a, this.h.f.b, this.h.f.c, this.h.f.d);
755:            p0.n = new com.caverock.androidsvg.r(0, 0, (float)v4.getWidth(), (float)v4.getHeight());
769:            this.a.concat(com.caverock.androidsvg.cf.a(this.h.f, p0.n, v0));
772:            this.a(p0);
775:            this.d(p0);
782:            this.l();
792:            this.a.drawBitmap(v4, 0, 0, new Paint());
795:            if (this.g())
797:                this.b(p0);
            }
        }
630:    goto 30;
809:    if (!(p0 instanceof com.caverock.androidsvg.al)) goto 946;
811:    p0 = (com.caverock.androidsvg.al)p0;
815:    if (p0.a == 0) {
 30:        this.e();
 33:        return;
        }
819:    this.a(this.h, p0);
826:    if (!this.k()) {
 30:        this.e();
 33:        return;
        }
832:    if (!this.c()) {
 30:        this.e();
 33:        return;
        }
838:    if (this.h.c == 0 && this.h.b == 0) {
 30:        this.e();
 33:        return;
        }
848:    if (p0.e != 0)
854:        this.a.concat(p0.e);
864:    v1 = new com.caverock.androidsvg.ci(p0.a).a;
868:    if (p0.n == 0)
874:        p0.n = com.caverock.androidsvg.cf.b(v1);
876:    this.a(p0);
879:    this.c(p0);
882:    this.d(p0);
893:    if (this.h.b == 0) goto 924;
901:    if (this.h.a.c == 0) goto 916;
913:    switch (this.h.a.c.ordinal()) {
            case 1:
943:            v0 = Path$FillType.EVEN_ODD;
1813:            break;
            default:
916:            v0 = Path$FillType.WINDING;
1813:            break;
        }
918:    v1.setFillType(v0);
921:    this.a(p0, v1);
928:    if (this.h.c != 0)
930:        this.a(v1);
933:    this.a(p0);
936:    if (this.g())
938:        this.b(p0);
941:    goto 30;
948:    if (p0 instanceof com.caverock.androidsvg.ar) {
950:        p0 = (com.caverock.androidsvg.ar)p0;
954:        if (p0.c != 0 && p0.d != 0 && !p0.c.a() && !p0.d.a()) {
978:            this.a(this.h, p0);
985:            if (this.k() && this.c()) {
995:                if (p0.e != 0)
1001:                    this.a.concat(p0.e);
1004:                v0 = this.a(p0);
1008:                this.a(p0);
1011:                this.c(p0);
1014:                this.d(p0);
1025:                if (this.h.b != 0)
1027:                    this.a(p0, v0);
1034:                if (this.h.c != 0)
1036:                    this.a(v0);
1039:                if (this.g())
1041:                    this.b(p0);
                }
            }
        }
1048:    else if (p0 instanceof com.caverock.androidsvg.t) {
1050:        p0 = (com.caverock.androidsvg.t)p0;
1054:        if (p0.c != 0 && !p0.c.a()) {
1066:            this.a(this.h, p0);
1073:            if (this.k() && this.c()) {
1083:                if (p0.e != 0)
1089:                    this.a.concat(p0.e);
1092:                v0 = this.a(p0);
1096:                this.a(p0);
1099:                this.c(p0);
1102:                this.d(p0);
1113:                if (this.h.b != 0)
1115:                    this.a(p0, v0);
1122:                if (this.h.c != 0)
1124:                    this.a(v0);
1127:                if (this.g())
1129:                    this.b(p0);
                }
            }
        }
1136:    else if (p0 instanceof com.caverock.androidsvg.y) {
1138:        p0 = (com.caverock.androidsvg.y)p0;
1142:        if (p0.c != 0 && p0.d != 0 && !p0.c.a() && !p0.d.a()) {
1166:            this.a(this.h, p0);
1173:            if (this.k() && this.c()) {
1183:                if (p0.e != 0)
1189:                    this.a.concat(p0.e);
1192:                v0 = this.a(p0);
1196:                this.a(p0);
1199:                this.c(p0);
1202:                this.d(p0);
1213:                if (this.h.b != 0)
1215:                    this.a(p0, v0);
1222:                if (this.h.c != 0)
1224:                    this.a(v0);
1227:                if (this.g())
1229:                    this.b(p0);
                }
            }
        }
1236:    else if (p0 instanceof com.caverock.androidsvg.ag) {
1238:        p0 = (com.caverock.androidsvg.ag)p0;
1242:        this.a(this.h, p0);
1249:        if (this.k() && this.c() && this.h.c != 0) {
1265:            if (p0.e != 0)
1271:                this.a.concat(p0.e);
1276:            if (p0.a == 0)
1278:                v0 = 0;
                else
1363:                v0 = p0.a.a(this);
1281:            if (p0.b == 0)
1283:                v1 = 0;
                else
1370:                v1 = p0.b.b(this);
1286:            if (p0.c == 0)
1288:                v3 = 0;
                else
1377:                v3 = p0.c.a(this);
1291:            if (p0.d != 0)
1384:                v2 = p0.d.b(this);
1295:            if (p0.n == 0)
1322:                p0.n = new com.caverock.androidsvg.r(Math.min(v0, v1), Math.min(v1, v2), Math.abs(v3 - v0), Math.abs(v2 - v1));
1326:            v4 = new Path();
1329:            v4.moveTo(v0, v1);
1332:            v4.lineTo(v3, v2);
1335:            this.a(p0);
1338:            this.c(p0);
1341:            this.d(p0);
1348:            this.a(v4);
1351:            this.a(p0);
1354:            if (this.g())
1356:                this.b(p0);
            }
        }
1391:    else if (p0 instanceof com.caverock.androidsvg.aq) {
1393:        p0 = (com.caverock.androidsvg.aq)p0;
1397:        this.a(this.h, p0);
1404:        if (this.k() && this.c() && (this.h.c != 0 || this.h.b != 0)) {
1426:            if (p0.e != 0)
1432:                this.a.concat(p0.e);
1439:            if (p0.a.length >= 2) {
1441:                v0 = this.b(p0);
1445:                this.a(p0);
1448:                this.c(p0);
1451:                this.d(p0);
1462:                if (this.h.b != 0)
1464:                    this.a(p0, v0);
1471:                if (this.h.c != 0)
1473:                    this.a(v0);
1476:                this.a(p0);
1479:                if (this.g())
1481:                    this.b(p0);
                }
            }
        }
1488:    else if (p0 instanceof com.caverock.androidsvg.ap) {
1490:        p0 = (com.caverock.androidsvg.ap)p0;
1494:        this.a(this.h, p0);
1501:        if (this.k() && this.c() && (this.h.c != 0 || this.h.b != 0)) {
1523:            if (p0.e != 0)
1529:                this.a.concat(p0.e);
1536:            if (p0.a.length >= 2) {
1538:                v0 = this.b(p0);
1542:                this.a(p0);
1545:                this.c(p0);
1548:                this.d(p0);
1559:                if (this.h.b != 0)
1561:                    this.a(p0, v0);
1568:                if (this.h.c != 0)
1570:                    this.a(v0);
1573:                this.a(p0);
1576:                if (this.g())
1578:                    this.b(p0);
                }
            }
        }
1585:    else if (p0 instanceof com.caverock.androidsvg.bv) {
1587:        p0 = (com.caverock.androidsvg.bv)p0;
1591:        this.a(this.h, p0);
1598:        if (this.k()) {
1602:            if (p0.a != 0)
1608:                this.a.concat(p0.a);
1613:            if (p0.b == 0 || p0.b.size() == 0)
1623:                v1 = 0;
                else
1764:                v1 = ((com.caverock.androidsvg.af)p0.b.get(0)).a(this);
1626:            if (p0.c == 0 || p0.c.size() == 0)
1636:                v3 = 0;
                else
1779:                v3 = ((com.caverock.androidsvg.af)p0.c.get(0)).b(this);
1639:            if (p0.d == 0 || p0.d.size() == 0)
1649:                v4 = 0;
                else
1794:                v4 = ((com.caverock.androidsvg.af)p0.d.get(0)).a(this);
1652:            if (p0.e != 0 && p0.e.size() != 0)
1805:                v2 = ((com.caverock.androidsvg.af)p0.e.get(0)).b(this);
1662:            v0 = this.j();
1668:            if (v0 != com.caverock.androidsvg.ba.a) {
1670:                v5 = this.a(p0);
1676:                if (v0 == com.caverock.androidsvg.ba.b)
1682:                    v1 = v1 - v5 / 1073741824;
                    else
1811:                    v1 = v1 - v5;
                }
1685:            if (p0.n == 0) {
1689:                v0 = new com.caverock.androidsvg.cn(this, v1, v3);
1692:                this.a(p0, v0);
1720:                p0.n = new com.caverock.androidsvg.r(v0.c.left, v0.c.top, v0.c.width(), v0.c.height());
                }
1722:            this.a(p0);
1725:            this.c(p0);
1728:            this.d(p0);
1742:            this.a(p0, new com.caverock.androidsvg.ck(this, v1 + v4, v2 + v3));
1745:            if (this.g())
1747:                this.b(p0);
            }
        }
1044:    goto 30;
    }

    static void b(String p0, Object[] p1) {
        Log.e("SVGAndroidRenderer", String.format(p0, p1));
    }

    private final com.caverock.androidsvg.cm c(com.caverock.androidsvg.bm p0) {
        v0 = new com.caverock.androidsvg.cm();
        this.a(v0, com.caverock.androidsvg.av.a());
        return this.a(p0, v0);
    }

    private final void c(com.caverock.androidsvg.bj p0) {
        if (this.h.a.b instanceof com.caverock.androidsvg.ak)
            this.a(1, p0.n, (com.caverock.androidsvg.ak)this.h.a.b);
        if (this.h.a.e instanceof com.caverock.androidsvg.ak)
            this.a(0, p0.n, (com.caverock.androidsvg.ak)this.h.a.e);
    }

    private final void d() {
        this.a.save();
        this.i.push(this.h);
        this.h = (com.caverock.androidsvg.cm)this.h.clone();
    }

    private final void d(com.caverock.androidsvg.bj p0) {
        this.a(p0, p0.n);
    }

    private final void e() {
        this.a.restore();
        this.h = (com.caverock.androidsvg.cm)this.i.pop();
    }

    private final void f() {
        this.j.pop();
        this.k.pop();
    }

    private final boolean g() {
        if (this.h.a.G != 0 && this.h.i == 0)
            com.caverock.androidsvg.cf.a("Masks are not supported when using getPicture()", new Object[0]);
        if (this.h.a.m.floatValue() < 1065353216 || this.h.a.G != 0 && this.h.i != 0)
            v0 = 1;
        else
            v0 = 0;
        if (v0 == 0)
            v0 = 0;
        else {
            this.a.saveLayerAlpha(0, com.caverock.androidsvg.cf.a(this.h.a.m.floatValue()), 4);
            this.i.push(this.h);
            this.h = (com.caverock.androidsvg.cm)this.h.clone();
            if (this.h.a.G != 0 && this.h.i != 0) {
                v0 = this.g.b(this.h.a.G);
                if (v0 == 0 || !(v0 instanceof com.caverock.androidsvg.ai)) {
                    v3 = new Object[1];
                    v3[0] = this.h.a.G;
                    com.caverock.androidsvg.cf.b("Mask reference '%s' not found", v3);
                    this.h.a.G = 0;
                    v0 = 1;
                    return v0;
                }
                this.l.push(this.a);
                this.h();
            }
            v0 = 1;
        }
        return v0;
    }

    private final void h() {
        try {
            v0 = Bitmap.createBitmap(this.a.getWidth(), this.a.getHeight(), Bitmap$Config.ARGB_8888);
            this.m.push(v0);
            v1 = new Canvas(v0);
            v1.setMatrix(this.a.getMatrix());
            this.a = v1;
        }
        catch (OutOfMemoryError ex) {
            com.caverock.androidsvg.cf.b("Not enough memory to create temporary bitmaps for mask processing", new Object[0]);
            throw ex;
        }
    }

    private static synchronized void i() {
        enter com.caverock.androidsvg.cf;
        try {
            v0 = new HashSet();
            com.caverock.androidsvg.cf.n = v0;
            v0.add("Structure");
            com.caverock.androidsvg.cf.n.add("BasicStructure");
            com.caverock.androidsvg.cf.n.add("ConditionalProcessing");
            com.caverock.androidsvg.cf.n.add("Image");
            com.caverock.androidsvg.cf.n.add("Style");
            com.caverock.androidsvg.cf.n.add("ViewportAttribute");
            com.caverock.androidsvg.cf.n.add("Shape");
            com.caverock.androidsvg.cf.n.add("BasicText");
            com.caverock.androidsvg.cf.n.add("PaintAttribute");
            com.caverock.androidsvg.cf.n.add("BasicPaintAttribute");
            com.caverock.androidsvg.cf.n.add("OpacityAttribute");
            com.caverock.androidsvg.cf.n.add("BasicGraphicsAttribute");
            com.caverock.androidsvg.cf.n.add("Marker");
            com.caverock.androidsvg.cf.n.add("Gradient");
            com.caverock.androidsvg.cf.n.add("Pattern");
            com.caverock.androidsvg.cf.n.add("Clip");
            com.caverock.androidsvg.cf.n.add("BasicClip");
            com.caverock.androidsvg.cf.n.add("Mask");
            com.caverock.androidsvg.cf.n.add("View");
        }
        catch (Throwable ex) {
            exit com.caverock.androidsvg.cf;
            throw ex;
        }
        exit com.caverock.androidsvg.cf;
    }

    private final com.caverock.androidsvg.ba j() {
        if (this.h.a.t == com.caverock.androidsvg.bc.a || this.h.a.u == com.caverock.androidsvg.ba.b)
            v0 = this.h.a.u;
        else if (this.h.a.u == com.caverock.androidsvg.ba.a)
            v0 = com.caverock.androidsvg.ba.c;
        else
            v0 = com.caverock.androidsvg.ba.a;
        return v0;
    }

    private final boolean k() {
        if (this.h.a.A != 0)
            v0 = this.h.a.A.booleanValue();
        else
            v0 = 1;
        return v0;
    }

    private final void l() {
        if (this.h.a.J instanceof com.caverock.androidsvg.v)
            v0 = ((com.caverock.androidsvg.v)this.h.a.J).a;
        else {
            if (!(this.h.a.J instanceof com.caverock.androidsvg.w))
                return;
            v0 = this.h.a.n.a;
        }
        if (this.h.a.K != 0)
            v0 = v0 | com.caverock.androidsvg.cf.a(this.h.a.K.floatValue()) << 24;
        this.a.drawColor(v0);
    }

    private final Path$FillType m() {
        if (this.h.a.F == 0) {
            v0 = Path$FillType.WINDING;
            return v0;
        }
        switch (this.h.a.F.ordinal()) {
            case 1:
                v0 = Path$FillType.EVEN_ODD;
                break;
            default:
                v0 = Path$FillType.WINDING;
                break;
        }
    }

    protected final float a() {
        return this.h.d.getTextSize();
    }

    final void a(com.caverock.androidsvg.be p0, com.caverock.androidsvg.af p1, com.caverock.androidsvg.af p2, com.caverock.androidsvg.r p3, com.caverock.androidsvg.m p4) {
        v2 = 0;
        if ((p1 == 0 || !p1.a()) && (p2 == 0 || !p2.a())) {
            if (p4 == 0) {
                if (p0.v != 0)
                    v0 = p0.v;
                else
                    v0 = com.caverock.androidsvg.m.d;
            }
            else
                v0 = p4;
            this.a(this.h, p0);
            if (this.k()) {
                if (p0.u != 0) {
                    if (p0.a != 0)
                        v1 = p0.a.a(this);
                    else
                        v1 = 0;
                    if (p0.b != 0)
                        v2 = p0.b.b(this);
                }
                else
                    v1 = 0;
                v5 = this.b();
                if (p1 != 0)
                    v4 = p1.a(this);
                else
                    v4 = v5.c;
                if (p2 != 0)
                    v3 = p2.b(this);
                else
                    v3 = v5.d;
                this.h.f = new com.caverock.androidsvg.r(v1, v2, v4, v3);
                if (!this.h.a.v.booleanValue())
                    this.a(this.h.f.a, this.h.f.b, this.h.f.c, this.h.f.d);
                this.a(p0, this.h.f);
                if (p3 != 0) {
                    this.a.concat(com.caverock.androidsvg.cf.a(this.h.f, p3, v0));
                    this.h.g = p0.w;
                }
                else
                    this.a.translate(v1, v2);
                this.l();
                this.a(p0, 1);
                if (this.g())
                    this.b(p0);
                this.a(p0);
            }
        }
    }

    final void a(com.caverock.androidsvg.bm p0) {
        if (p0 instanceof com.caverock.androidsvg.bk && ((com.caverock.androidsvg.bk)p0).p != 0)
            this.h.h = ((com.caverock.androidsvg.bk)p0).p.booleanValue();
    }

    final void a(com.caverock.androidsvg.cm p0, com.caverock.androidsvg.av p1) {
 12:    if (com.caverock.androidsvg.cf.a(p1, 4096))
 18:        p0.a.n = p1.n;
 26:    if (com.caverock.androidsvg.cf.a(p1, 2048))
 32:        p0.a.m = p1.m;
 40:    if (com.caverock.androidsvg.cf.a(p1, 1)) {
 46:        p0.a.b = p1.b;
 50:        if (p1.b != 0)
 52:            v0 = 1;
            else
505:            v0 = 0;
 53:        p0.b = v0;
        }
 61:    if (com.caverock.androidsvg.cf.a(p1, 4))
 67:        p0.a.d = p1.d;
 75:    if (com.caverock.androidsvg.cf.a(p1, 6149))
 81:        com.caverock.androidsvg.cf.a(p0, 1, p0.a.b);
 90:    if (com.caverock.androidsvg.cf.a(p1, 2))
 96:        p0.a.c = p1.c;
104:    if (com.caverock.androidsvg.cf.a(p1, 8)) {
110:        p0.a.e = p1.e;
114:        if (p1.e != 0)
116:            v0 = 1;
            else
508:            v0 = 0;
117:        p0.c = v0;
        }
125:    if (com.caverock.androidsvg.cf.a(p1, 16))
131:        p0.a.f = p1.f;
139:    if (com.caverock.androidsvg.cf.a(p1, 6168))
145:        com.caverock.androidsvg.cf.a(p0, 0, p0.a.e);
157:    if (com.caverock.androidsvg.cf.a(p1, 34359738368))
163:        p0.a.L = p1.L;
171:    if (com.caverock.androidsvg.cf.a(p1, 32)) {
177:        p0.a.g = p1.g;
189:        p0.e.setStrokeWidth(p0.a.g.c(this));
        }
198:    if (!com.caverock.androidsvg.cf.a(p1, 64)) goto 215;
204:    p0.a.h = p1.h;
212:    switch (p1.h.ordinal()) {
            case 0:
212:            goto 511;
            case 1:
212:            goto 520;
            case 2:
212:            goto 529;
            default:
        }
221:    if (!com.caverock.androidsvg.cf.a(p1, 128)) goto 238;
227:    p0.a.i = p1.i;
235:    switch (p1.i.ordinal()) {
            case 0:
235:            goto 538;
            case 1:
235:            goto 547;
            case 2:
235:            goto 556;
            default:
        }
244:    if (com.caverock.androidsvg.cf.a(p1, 256)) {
250:        p0.a.j = p1.j;
260:        p0.e.setStrokeMiter(p1.j.floatValue());
        }
269:    if (com.caverock.androidsvg.cf.a(p1, 512))
275:        p0.a.k = p1.k;
283:    if (com.caverock.androidsvg.cf.a(p1, 1024))
289:        p0.a.l = p1.l;
297:    if (com.caverock.androidsvg.cf.a(p1, 1536)) {
303:        if (p0.a.k == 0)
307:            p0.e.setPathEffect(0);
            else {
572:            if (!(p0.a.k.length % 2))
574:                v0 = p0.a.k.length;
                else
601:                v0 = p0.a.k.length * 2;
575:            v8 = new float[v0];
577:            v5 = 0;
578:            v6 = 0;
579:            while (v5 < v0) {
593:                v8[v5] = p0.a.k[v5 % p0.a.k.length].c(this);
597:                v6 = v6 + v8[v5];
598:                v5 = v5 + 1;
                }
606:            if (v6 == 0)
610:                p0.e.setPathEffect(0);
                else {
619:                v0 = p0.a.l.c(this);
625:                if (v0 < 0)
628:                    v0 = v0 % v6 + v6;
636:                p0.e.setPathEffect(new DashPathEffect(v8, v0));
                }
            }
        }
316:    if (com.caverock.androidsvg.cf.a(p1, 16384)) {
318:        v0 = this.a();
326:        p0.a.p = p1.p;
336:        p0.d.setTextSize(p1.p.a(this, v0));
347:        p0.e.setTextSize(p1.p.a(this, v0));
        }
356:    if (com.caverock.androidsvg.cf.a(p1, 8192))
362:        p0.a.o = p1.o;
371:    if (com.caverock.androidsvg.cf.a(p1, 32768)) {
380:        if (p1.q.intValue() == -1 && p0.a.q.intValue() > 100)
408:            p0.a.q = Integer.valueOf(p0.a.q.intValue() - 100);
647:        else if (p1.q.intValue() == 1 && p0.a.q.intValue() < 900)
675:            p0.a.q = Integer.valueOf(p0.a.q.intValue() + 100);
            else
683:            p0.a.q = p1.q;
        }
417:    if (com.caverock.androidsvg.cf.a(p1, 65536))
423:        p0.a.r = p1.r;
432:    if (!com.caverock.androidsvg.cf.a(p1, 106496)) {
722:        if (com.caverock.androidsvg.cf.a(p1, 131072)) {
728:            p0.a.s = p1.s;
736:            if (p1.s == com.caverock.androidsvg.bb.d)
738:                v0 = 1;
                else
1085:                v0 = 0;
739:            p0.d.setStrikeThruText(v0);
748:            if (p1.s == com.caverock.androidsvg.bb.b)
750:                v0 = 1;
                else
1088:                v0 = 0;
751:            p0.d.setUnderlineText(v0);
758:            if (Build$VERSION.SDK_INT >= 17) {
766:                if (p1.s == com.caverock.androidsvg.bb.d)
768:                    v0 = 1;
                    else
1091:                    v0 = 0;
769:                p0.e.setStrikeThruText(v0);
778:                if (p1.s == com.caverock.androidsvg.bb.b)
780:                    v0 = 1;
                    else
1094:                    v0 = 0;
781:                p0.e.setUnderlineText(v0);
                }
            }
793:        if (com.caverock.androidsvg.cf.a(p1, 68719476736))
799:            p0.a.t = p1.t;
808:        if (com.caverock.androidsvg.cf.a(p1, 262144))
814:            p0.a.u = p1.u;
823:        if (com.caverock.androidsvg.cf.a(p1, 524288))
829:            p0.a.v = p1.v;
838:        if (com.caverock.androidsvg.cf.a(p1, 2097152))
844:            p0.a.x = p1.x;
853:        if (com.caverock.androidsvg.cf.a(p1, 4194304))
859:            p0.a.y = p1.y;
868:        if (com.caverock.androidsvg.cf.a(p1, 8388608))
874:            p0.a.z = p1.z;
883:        if (com.caverock.androidsvg.cf.a(p1, 16777216))
889:            p0.a.A = p1.A;
898:        if (com.caverock.androidsvg.cf.a(p1, 33554432))
904:            p0.a.B = p1.B;
913:        if (com.caverock.androidsvg.cf.a(p1, 1048576))
919:            p0.a.w = p1.w;
928:        if (com.caverock.androidsvg.cf.a(p1, 268435456))
934:            p0.a.E = p1.E;
943:        if (com.caverock.androidsvg.cf.a(p1, 536870912))
949:            p0.a.F = p1.F;
958:        if (com.caverock.androidsvg.cf.a(p1, 1073741824))
964:            p0.a.G = p1.G;
973:        if (com.caverock.androidsvg.cf.a(p1, 67108864))
979:            p0.a.C = p1.C;
988:        if (com.caverock.androidsvg.cf.a(p1, 134217728))
994:            p0.a.D = p1.D;
1005:        if (com.caverock.androidsvg.cf.a(p1, 8589934592))
1011:            p0.a.J = p1.J;
1022:        if (com.caverock.androidsvg.cf.a(p1, 17179869184))
1028:            p0.a.K = p1.K;
1032:        if (this.e != 0) {
1050:            p0.a.d = Float.valueOf((float)Color.alpha(this.e.a) / 1132396544);
1054:            com.caverock.androidsvg.cf.a(p0, 1, this.e);
            }
1059:        if (this.f != 0) {
1077:            p0.a.f = Float.valueOf((float)Color.alpha(this.f.a) / 1132396544);
1081:            com.caverock.androidsvg.cf.a(p0, 0, this.f);
            }
1084:        return;
        }
438:    if (p0.a.o == 0) goto 1097;
442:    if (this.g == 0) goto 1097;
452:    v5 = p0.a.o.iterator();
456:    v0 = 0;
461:    if (!v5.hasNext()) {
689:        if (v0 == 0)
701:            v0 = com.caverock.androidsvg.cf.a("sans-serif", p0.a.q, p0.a.r);
707:        p0.d.setTypeface(v0);
712:        p0.e.setTypeface(v0);
722:        if (com.caverock.androidsvg.cf.a(p1, 131072)) {
728:            p0.a.s = p1.s;
736:            if (p1.s == com.caverock.androidsvg.bb.d)
738:                v0 = 1;
                else
1085:                v0 = 0;
739:            p0.d.setStrikeThruText(v0);
748:            if (p1.s == com.caverock.androidsvg.bb.b)
750:                v0 = 1;
                else
1088:                v0 = 0;
751:            p0.d.setUnderlineText(v0);
758:            if (Build$VERSION.SDK_INT >= 17) {
766:                if (p1.s == com.caverock.androidsvg.bb.d)
768:                    v0 = 1;
                    else
1091:                    v0 = 0;
769:                p0.e.setStrikeThruText(v0);
778:                if (p1.s == com.caverock.androidsvg.bb.b)
780:                    v0 = 1;
                    else
1094:                    v0 = 0;
781:                p0.e.setUnderlineText(v0);
                }
            }
793:        if (com.caverock.androidsvg.cf.a(p1, 68719476736))
799:            p0.a.t = p1.t;
808:        if (com.caverock.androidsvg.cf.a(p1, 262144))
814:            p0.a.u = p1.u;
823:        if (com.caverock.androidsvg.cf.a(p1, 524288))
829:            p0.a.v = p1.v;
838:        if (com.caverock.androidsvg.cf.a(p1, 2097152))
844:            p0.a.x = p1.x;
853:        if (com.caverock.androidsvg.cf.a(p1, 4194304))
859:            p0.a.y = p1.y;
868:        if (com.caverock.androidsvg.cf.a(p1, 8388608))
874:            p0.a.z = p1.z;
883:        if (com.caverock.androidsvg.cf.a(p1, 16777216))
889:            p0.a.A = p1.A;
898:        if (com.caverock.androidsvg.cf.a(p1, 33554432))
904:            p0.a.B = p1.B;
913:        if (com.caverock.androidsvg.cf.a(p1, 1048576))
919:            p0.a.w = p1.w;
928:        if (com.caverock.androidsvg.cf.a(p1, 268435456))
934:            p0.a.E = p1.E;
943:        if (com.caverock.androidsvg.cf.a(p1, 536870912))
949:            p0.a.F = p1.F;
958:        if (com.caverock.androidsvg.cf.a(p1, 1073741824))
964:            p0.a.G = p1.G;
973:        if (com.caverock.androidsvg.cf.a(p1, 67108864))
979:            p0.a.C = p1.C;
988:        if (com.caverock.androidsvg.cf.a(p1, 134217728))
994:            p0.a.D = p1.D;
1005:        if (com.caverock.androidsvg.cf.a(p1, 8589934592))
1011:            p0.a.J = p1.J;
1022:        if (com.caverock.androidsvg.cf.a(p1, 17179869184))
1028:            p0.a.K = p1.K;
1032:        if (this.e != 0) {
1050:            p0.a.d = Float.valueOf((float)Color.alpha(this.e.a) / 1132396544);
1054:            com.caverock.androidsvg.cf.a(p0, 1, this.e);
            }
1059:        if (this.f != 0) {
1077:            p0.a.f = Float.valueOf((float)Color.alpha(this.f.a) / 1132396544);
1081:            com.caverock.androidsvg.cf.a(p0, 0, this.f);
            }
1084:        return;
        }
477:    v0 = com.caverock.androidsvg.cf.a((String)v5.next(), p0.a.q, p0.a.r);
481:    if (v0 == 0 && this.g.c != 0) {
489:        p0.a.q.intValue();
496:        String.valueOf(p0.a.r);
504:        throw new NoSuchMethodError();
        }
484:    goto 687;
515:    p0.e.setStrokeCap(Paint$Cap.BUTT);
518:    goto 215;
524:    p0.e.setStrokeCap(Paint$Cap.ROUND);
527:    goto 215;
533:    p0.e.setStrokeCap(Paint$Cap.SQUARE);
536:    goto 215;
542:    p0.e.setStrokeJoin(Paint$Join.MITER);
545:    goto 238;
551:    p0.e.setStrokeJoin(Paint$Join.ROUND);
554:    goto 238;
560:    p0.e.setStrokeJoin(Paint$Join.BEVEL);
563:    goto 238;
687:    if (v0 == 0) goto 457;
689:    if (v0 == 0)
701:        v0 = com.caverock.androidsvg.cf.a("sans-serif", p0.a.q, p0.a.r);
707:    p0.d.setTypeface(v0);
712:    p0.e.setTypeface(v0);
722:    if (com.caverock.androidsvg.cf.a(p1, 131072)) {
728:        p0.a.s = p1.s;
736:        if (p1.s == com.caverock.androidsvg.bb.d)
738:            v0 = 1;
            else
1085:            v0 = 0;
739:        p0.d.setStrikeThruText(v0);
748:        if (p1.s == com.caverock.androidsvg.bb.b)
750:            v0 = 1;
            else
1088:            v0 = 0;
751:        p0.d.setUnderlineText(v0);
758:        if (Build$VERSION.SDK_INT >= 17) {
766:            if (p1.s == com.caverock.androidsvg.bb.d)
768:                v0 = 1;
                else
1091:                v0 = 0;
769:            p0.e.setStrikeThruText(v0);
778:            if (p1.s == com.caverock.androidsvg.bb.b)
780:                v0 = 1;
                else
1094:                v0 = 0;
781:            p0.e.setUnderlineText(v0);
            }
        }
793:    if (com.caverock.androidsvg.cf.a(p1, 68719476736))
799:        p0.a.t = p1.t;
808:    if (com.caverock.androidsvg.cf.a(p1, 262144))
814:        p0.a.u = p1.u;
823:    if (com.caverock.androidsvg.cf.a(p1, 524288))
829:        p0.a.v = p1.v;
838:    if (com.caverock.androidsvg.cf.a(p1, 2097152))
844:        p0.a.x = p1.x;
853:    if (com.caverock.androidsvg.cf.a(p1, 4194304))
859:        p0.a.y = p1.y;
868:    if (com.caverock.androidsvg.cf.a(p1, 8388608))
874:        p0.a.z = p1.z;
883:    if (com.caverock.androidsvg.cf.a(p1, 16777216))
889:        p0.a.A = p1.A;
898:    if (com.caverock.androidsvg.cf.a(p1, 33554432))
904:        p0.a.B = p1.B;
913:    if (com.caverock.androidsvg.cf.a(p1, 1048576))
919:        p0.a.w = p1.w;
928:    if (com.caverock.androidsvg.cf.a(p1, 268435456))
934:        p0.a.E = p1.E;
943:    if (com.caverock.androidsvg.cf.a(p1, 536870912))
949:        p0.a.F = p1.F;
958:    if (com.caverock.androidsvg.cf.a(p1, 1073741824))
964:        p0.a.G = p1.G;
973:    if (com.caverock.androidsvg.cf.a(p1, 67108864))
979:        p0.a.C = p1.C;
988:    if (com.caverock.androidsvg.cf.a(p1, 134217728))
994:        p0.a.D = p1.D;
1005:    if (com.caverock.androidsvg.cf.a(p1, 8589934592))
1011:        p0.a.J = p1.J;
1022:    if (com.caverock.androidsvg.cf.a(p1, 17179869184))
1028:        p0.a.K = p1.K;
1032:    if (this.e != 0) {
1050:        p0.a.d = Float.valueOf((float)Color.alpha(this.e.a) / 1132396544);
1054:        com.caverock.androidsvg.cf.a(p0, 1, this.e);
        }
1059:    if (this.f != 0) {
1077:        p0.a.f = Float.valueOf((float)Color.alpha(this.f.a) / 1132396544);
1081:        com.caverock.androidsvg.cf.a(p0, 0, this.f);
        }
1084:    return;
1097:    v0 = 0;
1098:    goto 689;
    }

    protected final com.caverock.androidsvg.r b() {
        if (this.h.g != 0)
            v0 = this.h.g;
        else
            v0 = this.h.f;
        return v0;
    }

    final boolean c() {
        if (this.h.a.B != 0)
            v0 = this.h.a.B.booleanValue();
        else
            v0 = 1;
        return v0;
    }

}

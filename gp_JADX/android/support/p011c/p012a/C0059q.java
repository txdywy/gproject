package android.support.p011c.p012a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.support.v4.p013b.C0271d;
import android.support.v4.p037h.C0305a;
import com.squareup.haha.perflib.HprofParser;

final class C0059q {
    public static final Matrix f124c = new Matrix();
    public final Path f125a;
    public final Path f126b;
    public final Matrix f127d;
    public Paint f128e;
    public Paint f129f;
    public PathMeasure f130g;
    public int f131h;
    public final C0058o f132i;
    public float f133j;
    public float f134k;
    public float f135l;
    public float f136m;
    public int f137n;
    public String f138o;
    public final C0305a f139p;

    public C0059q() {
        this.f127d = new Matrix();
        this.f133j = 0.0f;
        this.f134k = 0.0f;
        this.f135l = 0.0f;
        this.f136m = 0.0f;
        this.f137n = HprofParser.ROOT_UNKNOWN;
        this.f138o = null;
        this.f139p = new C0305a();
        this.f132i = new C0058o();
        this.f125a = new Path();
        this.f126b = new Path();
    }

    public C0059q(C0059q c0059q) {
        this.f127d = new Matrix();
        this.f133j = 0.0f;
        this.f134k = 0.0f;
        this.f135l = 0.0f;
        this.f136m = 0.0f;
        this.f137n = HprofParser.ROOT_UNKNOWN;
        this.f138o = null;
        this.f139p = new C0305a();
        this.f132i = new C0058o(c0059q.f132i, this.f139p);
        this.f125a = new Path(c0059q.f125a);
        this.f126b = new Path(c0059q.f126b);
        this.f133j = c0059q.f133j;
        this.f134k = c0059q.f134k;
        this.f135l = c0059q.f135l;
        this.f136m = c0059q.f136m;
        this.f131h = c0059q.f131h;
        this.f137n = c0059q.f137n;
        this.f138o = c0059q.f138o;
        if (c0059q.f138o != null) {
            this.f139p.put(c0059q.f138o, this);
        }
    }

    private final void m71a(C0058o c0058o, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        c0058o.f111a.set(matrix);
        c0058o.f111a.preConcat(c0058o.f120j);
        canvas.save();
        for (int i3 = 0; i3 < c0058o.f112b.size(); i3++) {
            Object obj = c0058o.f112b.get(i3);
            if (obj instanceof C0058o) {
                m71a((C0058o) obj, c0058o.f111a, canvas, i, i2, colorFilter);
            } else if (obj instanceof C0055p) {
                C0055p c0055p = (C0055p) obj;
                float f = ((float) i) / this.f135l;
                float f2 = ((float) i2) / this.f136m;
                float min = Math.min(f, f2);
                Matrix matrix2 = c0058o.f111a;
                this.f127d.set(matrix2);
                this.f127d.postScale(f, f2);
                float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float f3 = (fArr[3] * fArr[0]) - (fArr[1] * fArr[2]);
                f2 = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                if (f2 > 0.0f) {
                    f2 = Math.abs(f3) / f2;
                } else {
                    f2 = 0.0f;
                }
                if (f2 != 0.0f) {
                    Path path = this.f125a;
                    path.reset();
                    if (c0055p.f95n != null) {
                        C0271d.m1555a(c0055p.f95n, path);
                    }
                    path = this.f125a;
                    this.f126b.reset();
                    if (c0055p.mo37a()) {
                        this.f126b.addPath(path, this.f127d);
                        canvas.clipPath(this.f126b);
                    } else {
                        C0057n c0057n = (C0057n) c0055p;
                        if (!(c0057n.f105h == 0.0f && c0057n.f106i == 1.0f)) {
                            float f4 = (c0057n.f105h + c0057n.f107j) % 1.0f;
                            f3 = (c0057n.f106i + c0057n.f107j) % 1.0f;
                            if (this.f130g == null) {
                                this.f130g = new PathMeasure();
                            }
                            this.f130g.setPath(this.f125a, false);
                            float length = this.f130g.getLength();
                            f4 *= length;
                            f3 *= length;
                            path.reset();
                            if (f4 > f3) {
                                this.f130g.getSegment(f4, length, path, true);
                                this.f130g.getSegment(0.0f, f3, path, true);
                            } else {
                                this.f130g.getSegment(f4, f3, path, true);
                            }
                            path.rLineTo(0.0f, 0.0f);
                        }
                        this.f126b.addPath(path, this.f127d);
                        if (c0057n.f101d != 0) {
                            if (this.f129f == null) {
                                this.f129f = new Paint();
                                this.f129f.setStyle(Style.FILL);
                                this.f129f.setAntiAlias(true);
                            }
                            Paint paint = this.f129f;
                            paint.setColor(C0054l.m64a(c0057n.f101d, c0057n.f104g));
                            paint.setColorFilter(colorFilter);
                            this.f126b.setFillType(c0057n.f103f == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                            canvas.drawPath(this.f126b, paint);
                        }
                        if (c0057n.f99b != 0) {
                            if (this.f128e == null) {
                                this.f128e = new Paint();
                                this.f128e.setStyle(Style.STROKE);
                                this.f128e.setAntiAlias(true);
                            }
                            Paint paint2 = this.f128e;
                            if (c0057n.f109l != null) {
                                paint2.setStrokeJoin(c0057n.f109l);
                            }
                            if (c0057n.f108k != null) {
                                paint2.setStrokeCap(c0057n.f108k);
                            }
                            paint2.setStrokeMiter(c0057n.f110m);
                            paint2.setColor(C0054l.m64a(c0057n.f99b, c0057n.f102e));
                            paint2.setColorFilter(colorFilter);
                            paint2.setStrokeWidth(c0057n.f100c * (f2 * min));
                            canvas.drawPath(this.f126b, paint2);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void m72a(Canvas canvas, int i, int i2) {
        m71a(this.f132i, f124c, canvas, i, i2, null);
    }
}

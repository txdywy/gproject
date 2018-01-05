package android.support.v4.widget;

import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.squareup.haha.perflib.HprofParser;

final class C0379j {
    public final RectF f2161a = new RectF();
    public final Paint f2162b = new Paint();
    public final Paint f2163c = new Paint();
    public final Paint f2164d = new Paint();
    public float f2165e = 0.0f;
    public float f2166f = 0.0f;
    public float f2167g = 0.0f;
    public float f2168h = 5.0f;
    public int[] f2169i;
    public int f2170j;
    public float f2171k;
    public float f2172l;
    public float f2173m;
    public boolean f2174n;
    public Path f2175o;
    public float f2176p = 1.0f;
    public float f2177q;
    public int f2178r;
    public int f2179s;
    public int f2180t = HprofParser.ROOT_UNKNOWN;
    public int f2181u;

    C0379j() {
        this.f2162b.setStrokeCap(Cap.SQUARE);
        this.f2162b.setAntiAlias(true);
        this.f2162b.setStyle(Style.STROKE);
        this.f2163c.setStyle(Style.FILL);
        this.f2163c.setAntiAlias(true);
        this.f2164d.setColor(0);
    }

    final void m2279a(int[] iArr) {
        this.f2169i = iArr;
        m2277a(0);
    }

    final void m2277a(int i) {
        this.f2170j = i;
        this.f2181u = this.f2169i[this.f2170j];
    }

    final int m2275a() {
        return (this.f2170j + 1) % this.f2169i.length;
    }

    final void m2276a(float f) {
        this.f2168h = f;
        this.f2162b.setStrokeWidth(f);
    }

    final int m2280b() {
        return this.f2169i[this.f2170j];
    }

    final void m2278a(boolean z) {
        if (this.f2174n != z) {
            this.f2174n = z;
        }
    }

    final void m2281c() {
        this.f2171k = this.f2165e;
        this.f2172l = this.f2166f;
        this.f2173m = this.f2167g;
    }

    final void m2282d() {
        this.f2171k = 0.0f;
        this.f2172l = 0.0f;
        this.f2173m = 0.0f;
        this.f2165e = 0.0f;
        this.f2166f = 0.0f;
        this.f2167g = 0.0f;
    }
}

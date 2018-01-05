package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

final class C0375f extends OvalShape {
    public RadialGradient f2145a;
    public Paint f2146b = new Paint();
    public final /* synthetic */ C0374e f2147c;

    C0375f(C0374e c0374e, int i) {
        this.f2147c = c0374e;
        c0374e.f2144b = i;
        m2268a((int) rect().width());
    }

    protected final void onResize(float f, float f2) {
        super.onResize(f, f2);
        m2268a((int) f);
    }

    public final void draw(Canvas canvas, Paint paint) {
        int width = this.f2147c.getWidth();
        int height = this.f2147c.getHeight();
        canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (width / 2), this.f2146b);
        canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) ((width / 2) - this.f2147c.f2144b), paint);
    }

    private final void m2268a(int i) {
        this.f2145a = new RadialGradient((float) (i / 2), (float) (i / 2), (float) this.f2147c.f2144b, new int[]{1023410176, 0}, null, TileMode.CLAMP);
        this.f2146b.setShader(this.f2145a);
    }
}

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;

public final class ab {
    public static final ad f2060b;
    public EdgeEffect f2061a;

    @Deprecated
    public ab(Context context) {
        this.f2061a = new EdgeEffect(context);
    }

    @Deprecated
    public final void m2154a(int i, int i2) {
        this.f2061a.setSize(i, i2);
    }

    @Deprecated
    public final boolean m2156a(float f) {
        this.f2061a.onPull(f);
        return true;
    }

    public static void m2153a(EdgeEffect edgeEffect, float f, float f2) {
        f2060b.mo455a(edgeEffect, f, f2);
    }

    @Deprecated
    public final boolean m2155a() {
        this.f2061a.onRelease();
        return this.f2061a.isFinished();
    }

    @Deprecated
    public final boolean m2157a(Canvas canvas) {
        return this.f2061a.draw(canvas);
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f2060b = new ac();
        } else {
            f2060b = new ad();
        }
    }
}

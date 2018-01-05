package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class ed {
    public final ew f3425a;
    public int f3426b;
    public final Rect f3427c;

    private ed(ew ewVar) {
        this.f3426b = Integer.MIN_VALUE;
        this.f3427c = new Rect();
        this.f3425a = ewVar;
    }

    public abstract int mo829a(View view);

    public abstract void mo830a(int i);

    public abstract int mo831b();

    public abstract int mo832b(View view);

    public abstract int mo833c();

    public abstract int mo834c(View view);

    public abstract int mo835d();

    public abstract int mo836d(View view);

    public abstract int mo837e();

    public abstract int mo838e(View view);

    public abstract int mo839f();

    public abstract int mo840f(View view);

    public abstract int mo841g();

    public abstract int mo842h();

    public final int m3537a() {
        return Integer.MIN_VALUE == this.f3426b ? 0 : mo837e() - this.f3426b;
    }
}

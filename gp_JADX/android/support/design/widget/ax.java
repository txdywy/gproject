package android.support.design.widget;

import android.graphics.drawable.Drawable;

final class ax implements bp {
    public final /* synthetic */ FloatingActionButton f817a;

    ax(FloatingActionButton floatingActionButton) {
        this.f817a = floatingActionButton;
    }

    public final float mo148a() {
        return ((float) this.f817a.m488b()) / 2.0f;
    }

    public final void mo149a(int i, int i2, int i3, int i4) {
        this.f817a.f647l.set(i, i2, i3, i4);
        this.f817a.setPadding(this.f817a.f644i + i, this.f817a.f644i + i2, this.f817a.f644i + i3, this.f817a.f644i + i4);
    }

    public final void mo150a(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public final boolean mo151b() {
        return this.f817a.f646k;
    }
}

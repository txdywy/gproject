package android.support.p011c.p012a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

final class C0046c implements Callback {
    public final /* synthetic */ C0045b f75a;

    C0046c(C0045b c0045b) {
        this.f75a = c0045b;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.f75a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f75a.scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f75a.unscheduleSelf(runnable);
    }
}

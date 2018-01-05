package android.support.p027e;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

final class bo implements bp {
    public final ViewOverlay f1102a;

    bo(View view) {
        this.f1102a = view.getOverlay();
    }

    public final void mo228a(Drawable drawable) {
        this.f1102a.add(drawable);
    }

    public final void mo229b(Drawable drawable) {
        this.f1102a.remove(drawable);
    }
}

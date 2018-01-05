package android.support.p027e;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

final class bf implements bg {
    public final ViewGroupOverlay f1089a;

    bf(ViewGroup viewGroup) {
        this.f1089a = viewGroup.getOverlay();
    }

    public final void mo228a(Drawable drawable) {
        this.f1089a.add(drawable);
    }

    public final void mo229b(Drawable drawable) {
        this.f1089a.remove(drawable);
    }

    public final void mo230a(View view) {
        this.f1089a.add(view);
    }

    public final void mo231b(View view) {
        this.f1089a.remove(view);
    }
}

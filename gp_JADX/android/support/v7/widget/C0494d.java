package android.support.v7.widget;

import android.graphics.Outline;

final class C0494d extends C0493c {
    public C0494d(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public final void getOutline(Outline outline) {
        if (this.a.f2863h) {
            if (this.a.f2862g != null) {
                this.a.f2862g.getOutline(outline);
            }
        } else if (this.a.f2860e != null) {
            this.a.f2860e.getOutline(outline);
        }
    }
}

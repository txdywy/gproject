package android.support.design.widget;

import android.graphics.Outline;

final class al extends ak {
    al() {
    }

    public final void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}

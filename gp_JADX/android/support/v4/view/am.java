package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;

class am extends al {
    am() {
    }

    public final void mo406a(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public final Rect mo407q(View view) {
        return view.getClipBounds();
    }
}

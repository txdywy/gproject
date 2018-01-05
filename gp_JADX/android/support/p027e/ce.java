package android.support.p027e;

import android.view.View;
import android.view.WindowId;

final class ce {
    public final WindowId f1134a;

    ce(View view) {
        this.f1134a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ce) && ((ce) obj).f1134a.equals(this.f1134a);
    }

    public final int hashCode() {
        return this.f1134a.hashCode();
    }
}

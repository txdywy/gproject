package android.support.v4.p013b.p014a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class C0264f extends C0261c {
    C0264f(Drawable drawable) {
        super(drawable);
    }

    C0264f(C0262d c0262d, Resources resources) {
        super(c0262d, resources);
    }

    public void setAutoMirrored(boolean z) {
        this.g.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.g.isAutoMirrored();
    }

    C0262d mo363b() {
        return new C0265g(this.e);
    }
}

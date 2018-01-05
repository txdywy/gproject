package android.support.design.p018a;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public final class C0100f extends Property {
    public final Matrix f429a = new Matrix();

    public C0100f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final /* synthetic */ Object get(Object obj) {
        this.f429a.set(((ImageView) obj).getImageMatrix());
        return this.f429a;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}

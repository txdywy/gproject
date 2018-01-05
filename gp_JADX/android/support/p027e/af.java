package android.support.p027e;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

final class af extends Property {
    public final Property f1010a;
    public final PathMeasure f1011b;
    public final float f1012c;
    public final float[] f1013d = new float[2];
    public final PointF f1014e = new PointF();
    public float f1015f;

    af(Property property, Path path) {
        super(Float.class, property.getName());
        this.f1010a = property;
        this.f1011b = new PathMeasure(path, false);
        this.f1012c = this.f1011b.getLength();
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(this.f1015f);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        this.f1015f = f.floatValue();
        this.f1011b.getPosTan(this.f1012c * f.floatValue(), this.f1013d, null);
        this.f1014e.x = this.f1013d[0];
        this.f1014e.y = this.f1013d[1];
        this.f1010a.set(obj, this.f1014e);
    }
}

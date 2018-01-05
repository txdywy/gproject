package android.support.p027e;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

final class C0182h extends Property {
    public Rect f1146a = new Rect();

    C0182h(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.f1146a);
        return new PointF((float) this.f1146a.left, (float) this.f1146a.top);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.f1146a);
        this.f1146a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.f1146a);
    }
}

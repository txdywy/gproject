package android.support.p027e;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class C0187m extends Property {
    C0187m(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        bq.m944a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
    }
}

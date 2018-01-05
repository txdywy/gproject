package android.support.p027e;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class C0186l extends Property {
    C0186l(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        bq.m944a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
    }
}

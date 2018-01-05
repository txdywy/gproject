package android.support.p027e;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class C0188n extends Property {
    C0188n(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int round = Math.round(pointF.x);
        int round2 = Math.round(pointF.y);
        bq.m944a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
    }
}

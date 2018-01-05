package android.support.p027e;

import android.graphics.PointF;
import android.util.Property;

final class C0184j extends Property {
    C0184j(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        C0192r c0192r = (C0192r) obj;
        PointF pointF = (PointF) obj2;
        c0192r.f1160a = Math.round(pointF.x);
        c0192r.f1161b = Math.round(pointF.y);
        c0192r.f1165f++;
        if (c0192r.f1165f == c0192r.f1166g) {
            c0192r.m1002a();
        }
    }
}

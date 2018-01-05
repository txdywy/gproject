package android.support.v7.widget;

import android.util.Property;

final class gw extends Property {
    gw(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).f3024y);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).m3133a(((Float) obj2).floatValue());
    }
}

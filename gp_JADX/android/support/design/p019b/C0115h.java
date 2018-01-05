package android.support.design.p019b;

import android.util.Property;

public final class C0115h extends Property {
    public static final Property f452a = new C0115h("circularRevealScrimColor");

    private C0115h(String str) {
        super(Integer.class, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((C0107e) obj).getCircularRevealScrimColor());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((C0107e) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
    }
}

package android.support.design.p019b;

import android.util.Property;

public final class C0114g extends Property {
    public static final Property f451a = new C0114g("circularReveal");

    private C0114g(String str) {
        super(C0116i.class, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return ((C0107e) obj).getRevealInfo();
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((C0107e) obj).setRevealInfo((C0116i) obj2);
    }
}

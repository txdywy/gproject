package android.support.design.p019b;

import android.animation.TypeEvaluator;
import android.support.design.p021c.C0118a;

public final class C0113f implements TypeEvaluator {
    public static final TypeEvaluator f449a = new C0113f();
    public final C0116i f450b = new C0116i();

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        C0116i c0116i = (C0116i) obj;
        C0116i c0116i2 = (C0116i) obj2;
        C0116i c0116i3 = this.f450b;
        float a = C0118a.m230a(c0116i.f453a, c0116i2.f453a, f);
        float a2 = C0118a.m230a(c0116i.f454b, c0116i2.f454b, f);
        float a3 = C0118a.m230a(c0116i.f455c, c0116i2.f455c, f);
        c0116i3.f453a = a;
        c0116i3.f454b = a2;
        c0116i3.f455c = a3;
        return this.f450b;
    }
}

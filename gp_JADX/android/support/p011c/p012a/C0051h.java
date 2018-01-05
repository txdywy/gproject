package android.support.p011c.p012a;

import android.animation.TypeEvaluator;
import android.support.v4.p013b.C0269b;
import android.support.v4.p013b.C0271d;

final class C0051h implements TypeEvaluator {
    public C0271d[] f82a;

    C0051h() {
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        C0271d[] c0271dArr = (C0271d[]) obj;
        C0271d[] c0271dArr2 = (C0271d[]) obj2;
        if (C0269b.m1548a(c0271dArr, c0271dArr2)) {
            if (this.f82a == null || !C0269b.m1548a(this.f82a, c0271dArr)) {
                this.f82a = C0269b.m1550a(c0271dArr);
            }
            for (int i = 0; i < c0271dArr.length; i++) {
                this.f82a[i].m1556a(c0271dArr[i], c0271dArr2[i], f);
            }
            return this.f82a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}

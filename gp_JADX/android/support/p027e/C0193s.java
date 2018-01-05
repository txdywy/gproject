package android.support.p027e;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

public final class C0193s extends bz {
    public C0193s(int i) {
        if ((i & -4) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f1118b = i;
    }

    public final void mo210a(bc bcVar) {
        super.mo210a(bcVar);
        bcVar.f1081a.put("android:fade:transitionAlpha", Float.valueOf(bq.m946c(bcVar.f1082b)));
    }

    private final Animator m1004a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        bq.m942a(view, f);
        Animator ofFloat = ObjectAnimator.ofFloat(view, bq.f1106d, new float[]{f2});
        ofFloat.addListener(new C0195u(view));
        mo206a(new C0194t(view));
        return ofFloat;
    }

    public final Animator mo248a(View view, bc bcVar) {
        float f = 0.0f;
        float a = C0193s.m1003a(bcVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m1004a(view, f, 1.0f);
    }

    public final Animator mo249b(View view, bc bcVar) {
        bq.f1103a.mo241d(view);
        return m1004a(view, C0193s.m1003a(bcVar, 1.0f), 0.0f);
    }

    private static float m1003a(bc bcVar, float f) {
        if (bcVar == null) {
            return f;
        }
        Float f2 = (Float) bcVar.f1081a.get("android:fade:transitionAlpha");
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }
}

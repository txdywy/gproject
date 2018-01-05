package android.support.design.widget;

import android.os.Build.VERSION;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class bb implements OnPreDrawListener {
    public final /* synthetic */ ay f860a;

    bb(ay ayVar) {
        this.f860a = ayVar;
    }

    public final boolean onPreDraw() {
        ay ayVar = this.f860a;
        float rotation = ayVar.f849z.getRotation();
        if (ayVar.f839j != rotation) {
            ayVar.f839j = rotation;
            if (VERSION.SDK_INT == 19) {
                if (ayVar.f839j % 90.0f != 0.0f) {
                    if (ayVar.f849z.getLayerType() != 1) {
                        ayVar.f849z.setLayerType(1, null);
                    }
                } else if (ayVar.f849z.getLayerType() != 0) {
                    ayVar.f849z.setLayerType(0, null);
                }
            }
            if (ayVar.f838i != null) {
                bo boVar = ayVar.f838i;
                float f = -ayVar.f839j;
                if (boVar.f887o != f) {
                    boVar.f887o = f;
                    boVar.invalidateSelf();
                }
            }
            if (ayVar.f842m != null) {
                ak akVar = ayVar.f842m;
                float f2 = -ayVar.f839j;
                if (f2 != akVar.f791l) {
                    akVar.f791l = f2;
                    akVar.invalidateSelf();
                }
            }
        }
        return true;
    }
}

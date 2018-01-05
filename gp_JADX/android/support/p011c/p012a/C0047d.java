package android.support.p011c.p012a;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.v4.p037h.C0305a;
import java.util.ArrayList;

final class C0047d extends ConstantState {
    public int f76a;
    public C0054l f77b;
    public AnimatorSet f78c;
    public ArrayList f79d;
    public C0305a f80e;

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final int getChangingConfigurations() {
        return this.f76a;
    }
}

package android.support.design.widget.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet f981b;

    protected abstract AnimatorSet mo194b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected final boolean mo193a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f981b != null;
        if (z3) {
            this.f981b.cancel();
        }
        this.f981b = mo194b(view, view2, z, z3);
        this.f981b.addListener(new C0164b(this));
        this.f981b.start();
        if (!z2) {
            this.f981b.end();
        }
        return true;
    }
}

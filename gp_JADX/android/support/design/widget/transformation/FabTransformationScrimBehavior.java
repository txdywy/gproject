package android.support.design.widget.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.design.p018a.C0096b;
import android.support.design.p018a.C0103i;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final C0103i f986c = new C0103i(75);
    public final C0103i f987d = new C0103i(0);

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean mo92a(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    protected final AnimatorSet mo194b(View view, View view2, boolean z, boolean z2) {
        Animator ofFloat;
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0103i c0103i = z ? this.f986c : this.f987d;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        c0103i.m216a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C0096b.m209a(animatorSet, arrayList);
        animatorSet.addListener(new C0170h(z, view2));
        return animatorSet;
    }
}

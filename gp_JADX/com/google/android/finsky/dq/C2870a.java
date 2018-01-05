package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import com.google.android.play.image.FifeImageView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.Map;

@TargetApi(21)
public final class C2870a extends Transition {
    public static final String[] f15346a = new String[]{"circleTransition:bounds", "circleTransition:position"};
    public final int f15347b;
    public int f15348c = -1;

    public C2870a(int i) {
        this.f15347b = i;
    }

    public final String[] getTransitionProperties() {
        return f15346a;
    }

    private static void m15116a(TransitionValues transitionValues) {
        View view = transitionValues.view;
        transitionValues.values.put("circleTransition:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        Object obj = new int[2];
        transitionValues.view.getLocationInWindow(obj);
        transitionValues.values.put("circleTransition:position", obj);
        if (view instanceof FifeImageView) {
            boolean z;
            Map map = transitionValues.values;
            String str = "circleTransition:isAvatar";
            if (((FifeImageView) view).D != null) {
                z = true;
            } else {
                z = false;
            }
            map.put(str, Boolean.valueOf(z));
            return;
        }
        transitionValues.values.put("circleTransition:isAvatar", Boolean.valueOf(false));
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            C2870a.m15116a(transitionValues);
        }
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            C2870a.m15116a(transitionValues);
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            transitionValues.values.put("circleTransition:image", createBitmap);
        }
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        boolean booleanValue = ((Boolean) transitionValues.values.get("circleTransition:isAvatar")).booleanValue();
        boolean booleanValue2 = ((Boolean) transitionValues2.values.get("circleTransition:isAvatar")).booleanValue();
        Rect rect = (Rect) transitionValues.values.get("circleTransition:bounds");
        Rect rect2 = (Rect) transitionValues2.values.get("circleTransition:bounds");
        if (rect == null || rect2 == null || rect.equals(rect2)) {
            return null;
        }
        int i;
        Bitmap bitmap = (Bitmap) transitionValues.values.get("circleTransition:image");
        View a = C2870a.m15115a(viewGroup, bitmap.getWidth(), bitmap.getHeight(), new BitmapDrawable(bitmap));
        Drawable colorDrawable = new ColorDrawable(this.f15347b);
        Drawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(this.f15347b);
        View a2 = C2870a.m15115a(viewGroup, bitmap.getWidth(), bitmap.getHeight(), booleanValue ? shapeDrawable : colorDrawable);
        int[] iArr = new int[2];
        viewGroup.getLocationInWindow(iArr);
        int[] iArr2 = (int[]) transitionValues.values.get("circleTransition:position");
        int i2 = iArr2[0] - iArr[0];
        int i3 = iArr2[1] - iArr[1];
        a.setTranslationX((float) i2);
        a.setTranslationY((float) i3);
        a2.setTranslationX((float) i2);
        a2.setTranslationY((float) i3);
        View view = transitionValues2.view;
        float a3 = C2870a.m15113a(a2);
        i2 = Math.min(C2870a.m15117b(a2), C2870a.m15117b(view));
        if (this.f15348c <= 0) {
            i = i2;
        } else {
            i = Math.min(i2, this.f15348c / 2);
        }
        Drawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        shapeDrawable2.getPaint().setColor(this.f15347b);
        View a4 = C2870a.m15115a(viewGroup, i * 2, i * 2, shapeDrawable2);
        float width = (float) ((iArr2[0] - iArr[0]) + ((a.getWidth() - a2.getWidth()) / 2));
        float height = (float) ((iArr2[1] - iArr[1]) + ((a.getHeight() - a2.getHeight()) / 2));
        a2.setAlpha(0.0f);
        view.setAlpha(0.0f);
        Animator a5 = C2870a.m15114a(a2, a3, (float) i);
        Animator a6 = C2870a.m15114a(a, a3, (float) i);
        float[] fArr = new float[2];
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a2, View.ALPHA, new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        iArr2 = (int[]) transitionValues2.values.get("circleTransition:position");
        Path path = getPathMotion().getPath(width, height, (float) ((iArr2[0] - iArr[0]) + ((view.getWidth() - a2.getWidth()) / 2)), (float) ((iArr2[1] - iArr[1]) + ((view.getHeight() - a2.getHeight()) / 2)));
        a4.setVisibility(4);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a2, View.TRANSLATION_X, View.TRANSLATION_Y, path);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a, View.TRANSLATION_X, View.TRANSLATION_Y, path);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        if (!booleanValue2) {
            shapeDrawable = colorDrawable;
        }
        View a7 = C2870a.m15115a(viewGroup, width2, height2, shapeDrawable);
        a7.setVisibility(4);
        float f = (float) (iArr2[0] - iArr[0]);
        float f2 = (float) (iArr2[1] - iArr[1]);
        a7.setTranslationX(f);
        a7.setTranslationY(f2);
        f2 = C2870a.m15113a(view);
        animatorSet.playTogether(new Animator[]{a5, a6, ofFloat, ofFloat2, ofFloat3});
        a5.addListener(new C2871b(a2, a, a4, i));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a7, View.ALPHA, new float[]{1.0f, 0.0f});
        Animator a8 = C2870a.m15114a(view, (float) i, f2);
        C2870a.m15114a(a7, (float) i, f2).addListener(new C2872c(a4, view, a7, viewGroup, a, a2));
        new AnimatorSet().playTogether(new Animator[]{ofFloat4, a8, r10});
        Animator animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(new Animator[]{animatorSet, r5});
        animatorSet2.addListener(new C2873d(viewGroup, a, a4, a2, a7));
        return animatorSet2;
    }

    private static View m15115a(ViewGroup viewGroup, int i, int i2, Drawable drawable) {
        View c2874e = new C2874e(viewGroup.getContext());
        c2874e.setBackground(drawable);
        c2874e.measure(MeasureSpec.makeMeasureSpec(i, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(i2, MemoryMappedFileBuffer.DEFAULT_SIZE));
        c2874e.layout(0, 0, i, i2);
        viewGroup.getOverlay().add(c2874e);
        return c2874e;
    }

    private static Animator m15114a(View view, float f, float f2) {
        return new C2875f(ViewAnimationUtils.createCircularReveal(view, view.getWidth() / 2, view.getHeight() / 2, f, f2));
    }

    private static float m15113a(View view) {
        return ((float) Math.sqrt((double) (((float) (view.getWidth() * view.getWidth())) + ((float) (view.getHeight() * view.getHeight()))))) * 0.5f;
    }

    private static int m15117b(View view) {
        return Math.min(view.getWidth() / 2, view.getHeight() / 2);
    }
}

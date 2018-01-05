package com.google.android.play.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.b.b;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;
import com.google.android.play.d;
import com.google.android.play.e;
import java.util.List;

public class ScalingPageIndicator extends PageIndicator {
    public List f32431d;
    public SparseArray f32432e = new SparseArray();

    public ScalingPageIndicator(Context context) {
        super(context);
    }

    public ScalingPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScalingPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected final void mo5447a() {
        super.mo5447a();
        setSelectedColorResId(d.play_onboard__page_indicator_dot_active);
        setUnselectedColorResId(d.play_onboard__page_indicator_dot_active);
    }

    protected int getDotHorizontalMargin() {
        if (VERSION.SDK_INT < 14) {
            return super.getDotHorizontalMargin();
        }
        return ((int) (((float) getResources().getDimensionPixelSize(e.play_onboard__page_indicator_dot_diameter)) * 0.6f)) / 4;
    }

    protected final void mo5448a(ImageView imageView, boolean z, boolean z2, int i) {
        super.mo5448a(imageView, z, z2, i);
        if (VERSION.SDK_INT >= 14) {
            float f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            imageView.setTag(Integer.valueOf(i));
            if (z2) {
                if (this.f32431d != null && this.f32431d.size() > (i * 2) + 1) {
                    ((Animator) this.f32431d.get(i * 2)).cancel();
                    ((Animator) this.f32431d.get((i * 2) + 1)).cancel();
                    this.f32431d.clear();
                }
                Animator animator = (Animator) this.f32432e.get(i);
                if (animator != null) {
                    animator.cancel();
                }
                long j = f == 1.0f ? 200 : 500;
                animator = ValueAnimator.ofFloat(new float[]{imageView.getScaleX(), f});
                animator.setDuration(j);
                if (VERSION.SDK_INT >= 21) {
                    animator.setInterpolator(com.google.android.play.animation.e.a(imageView.getContext()));
                } else {
                    animator.setInterpolator(new b());
                }
                animator.addUpdateListener(new C6456b(imageView));
                animator.start();
                this.f32432e.put(i, animator);
                return;
            }
            imageView.setScaleX(f);
            imageView.setScaleY(f);
        }
    }
}

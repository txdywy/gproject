package com.google.android.play.animation;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public final class C6239a {
    public final View f31240a;
    public float f31241b = 1.0f;
    public float f31242c = 0.0f;
    public float f31243d = 1.0f;

    public C6239a(View view) {
        this.f31240a = view;
    }

    @TargetApi(11)
    public final void m28751a(float f) {
        if (this.f31240a != null) {
            if (VERSION.SDK_INT >= 11) {
                this.f31240a.setAlpha(f);
            } else if (this.f31241b != f) {
                this.f31241b = f;
                Animation alphaAnimation = new AlphaAnimation(f, f);
                alphaAnimation.setDuration(0);
                alphaAnimation.setFillAfter(true);
                this.f31240a.startAnimation(alphaAnimation);
            }
        }
    }

    @TargetApi(12)
    public final void m28753b(float f) {
        if (this.f31240a != null) {
            if (VERSION.SDK_INT >= 12) {
                this.f31240a.animate().alpha(f).setDuration(200);
                return;
            }
            Animation alphaAnimation = new AlphaAnimation(this.f31241b, f);
            alphaAnimation.setDuration(200);
            alphaAnimation.setFillAfter(true);
            if (VERSION.SDK_INT < 12) {
                alphaAnimation.setAnimationListener(new C6240b(this, f));
            }
            this.f31240a.startAnimation(alphaAnimation);
        }
    }

    @TargetApi(21)
    public final void m28752a(float f, int i, int i2) {
        if (VERSION.SDK_INT >= 21) {
            this.f31240a.animate().z(f).setDuration((long) i).setStartDelay((long) i2);
        }
    }

    @TargetApi(11)
    public final float m28750a() {
        if (this.f31240a == null) {
            return this.f31242c;
        }
        if (VERSION.SDK_INT >= 11) {
            return this.f31240a.getTranslationY();
        }
        return this.f31242c;
    }

    @TargetApi(11)
    public final void m28754c(float f) {
        if (this.f31240a == null) {
            this.f31242c = f;
        } else if (VERSION.SDK_INT >= 11) {
            this.f31240a.setTranslationY(f);
        } else if (this.f31242c != f) {
            this.f31242c = f;
            Animation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f);
            translateAnimation.setDuration(0);
            translateAnimation.setFillAfter(true);
            this.f31240a.startAnimation(translateAnimation);
        }
    }
}

package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.squareup.leakcanary.C7582R;

public class AppScreenshot extends FrameLayout {
    public int f18076a;
    public ImageView f18077b;
    public ImageView f18078c;
    public ProgressBar f18079d;
    public Runnable f18080e;
    public Handler f18081f;

    public AppScreenshot(Context context) {
        super(context);
    }

    public AppScreenshot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18077b = (ImageView) findViewById(C7582R.id.screenshot);
        this.f18079d = (ProgressBar) findViewById(C7582R.id.screenshot_small_progress_bar);
        this.f18078c = (ImageView) findViewById(C7582R.id.download_icon);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f18081f != null) {
            this.f18081f.removeCallbacks(this.f18080e);
        }
    }

    public void setState(int i) {
        if (this.f18076a == 0 && i == 1) {
            if (this.f18081f == null && this.f18080e == null) {
                this.f18080e = new C3675d(this);
                this.f18081f = new Handler();
            }
            this.f18081f.postDelayed(this.f18080e, 500);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C7582R.anim.fade_out);
            loadAnimation.setAnimationListener(new C3674c(this));
            this.f18078c.startAnimation(loadAnimation);
        } else if (this.f18076a == 1 && i == 2) {
            this.f18081f.removeCallbacks(this.f18080e);
            if (this.f18079d.getVisibility() == 0) {
                this.f18079d.setVisibility(8);
            }
        } else if (this.f18076a == 1 && i == 0) {
            this.f18081f.removeCallbacks(this.f18080e);
            if (this.f18079d.getVisibility() == 0) {
                this.f18079d.setVisibility(8);
            }
            this.f18078c.setAnimation(null);
            this.f18078c.setVisibility(0);
        }
        this.f18076a = i;
    }

    public void setScreenshotDrawable(Drawable drawable) {
        this.f18077b.setImageDrawable(drawable);
        if (drawable instanceof TransitionDrawable) {
            this.f18078c.setVisibility(8);
        } else {
            this.f18078c.setVisibility(0);
        }
    }
}

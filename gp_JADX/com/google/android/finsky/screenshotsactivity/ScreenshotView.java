package com.google.android.finsky.screenshotsactivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.squareup.leakcanary.C7582R;

public class ScreenshotView extends FrameLayout implements be {
    public C1612l f20346a;
    public FifeImageView f20347b;
    public ProgressBar f20348c;
    public Runnable f20349d = new C4049a(this);
    public Handler f20350e = new Handler();

    public ScreenshotView(Context context) {
        super(context);
    }

    public ScreenshotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScreenshotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((C1413c) C3947d.m18649a(C1413c.class)).mo1901a(this);
        this.f20347b = (FifeImageView) findViewById(C7582R.id.screenshot_content);
        this.f20348c = (ProgressBar) findViewById(C7582R.id.screenshot_progress_bar);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20350e.removeCallbacks(this.f20349d);
    }

    public void setImage(bd bdVar) {
        this.f20347b.setOnLoadedListener(this);
        this.f20346a.m9288a(this.f20347b, bdVar.f11860f, bdVar.f11863i);
        if (!this.f20347b.c()) {
            this.f20350e.postDelayed(this.f20349d, 500);
        }
    }

    public final void m18953a(FifeImageView fifeImageView, Bitmap bitmap) {
        this.f20350e.removeCallbacks(this.f20349d);
        if (this.f20348c.getVisibility() == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C7582R.anim.fade_out);
            loadAnimation.setAnimationListener(new C4050b(this));
            this.f20348c.startAnimation(loadAnimation);
        }
    }

    public final void m18952a(FifeImageView fifeImageView) {
    }
}

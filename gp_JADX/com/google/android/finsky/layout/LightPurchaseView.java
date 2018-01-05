package com.google.android.finsky.layout;

import android.content.Context;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.frameworkviews.C3149w;
import com.squareup.leakcanary.C7582R;

public class LightPurchaseView extends FrameLayout implements AnimationListener {
    public C1076h f18254a;
    public C3149w f18255b;
    public LinearLayout f18256c;
    public View f18257d;
    public View f18258e;
    public boolean f18259f;
    public boolean f18260g;
    public int f18261h;

    public LightPurchaseView(Context context) {
        this(context, null);
    }

    public LightPurchaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18256c = (LinearLayout) findViewById(C7582R.id.content_wrapper);
        this.f18257d = findViewById(C7582R.id.content_frame_above_button);
        this.f18258e = findViewById(C7582R.id.continue_button_bar);
        this.f18255b = new C3149w(this);
        this.f18255b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f18255b.setDuration(150);
        this.f18255b.setAnimationListener(this);
    }

    protected void onMeasure(int i, int i2) {
        if (this.f18259f) {
            this.f18256c.measure(i, 0);
            int measuredHeight = this.f18256c.getMeasuredHeight();
            int measuredHeight2 = this.f18257d.getMeasuredHeight();
            int measuredHeight3 = this.f18258e.getMeasuredHeight();
            if (measuredHeight2 > 0 && measuredHeight3 > 0 && this.f18254a.f746R != null && !this.f18260g) {
                this.f18260g = true;
                post(new aq(this, measuredHeight));
            }
            if (measuredHeight > ai.f1848a.mo395g(this)) {
                i2 = MeasureSpec.makeMeasureSpec(this.f18261h, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void onAnimationStart(Animation animation) {
        this.f18259f = false;
    }

    public void onAnimationEnd(Animation animation) {
        post(new ar(this));
    }

    public void onAnimationRepeat(Animation animation) {
    }
}

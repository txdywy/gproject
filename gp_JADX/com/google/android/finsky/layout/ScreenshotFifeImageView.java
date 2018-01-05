package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.image.FifeImageView;

public class ScreenshotFifeImageView extends FifeImageView {
    public ScreenshotFifeImageView(Context context) {
        super(context);
    }

    public ScreenshotFifeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScreenshotFifeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(14)
    protected final void ai_() {
        if (this.B == null) {
            this.B = new bo(this);
        }
        setAlpha(0.0f);
        animate().alpha(1.0f).setDuration((long) this.z).setListener(this.B);
    }
}

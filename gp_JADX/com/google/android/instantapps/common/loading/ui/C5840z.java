package com.google.android.instantapps.common.loading.ui;

import android.animation.TimeAnimator;
import android.animation.TimeAnimator.TimeListener;
import com.squareup.haha.perflib.HprofParser;

final /* synthetic */ class C5840z implements TimeListener {
    public final PreviewImageView f29321a;
    public final TimeAnimator f29322b;

    C5840z(PreviewImageView previewImageView, TimeAnimator timeAnimator) {
        this.f29321a = previewImageView;
        this.f29322b = timeAnimator;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        PreviewImageView previewImageView = this.f29321a;
        TimeAnimator timeAnimator2 = this.f29322b;
        float duration = ((float) j) / ((float) timeAnimator.getDuration());
        if (duration > 1.0f) {
            previewImageView.m27216a(HprofParser.ROOT_UNKNOWN);
            timeAnimator2.cancel();
            return;
        }
        previewImageView.m27216a((int) (timeAnimator.getInterpolator().getInterpolation(duration) * 255.0f));
    }
}

package com.google.android.finsky.layout.play;

import android.support.v4.view.ai;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;

final class am implements OnScrollChangedListener {
    public final /* synthetic */ PlayHighlightsBannerItemView f18769a;

    am(PlayHighlightsBannerItemView playHighlightsBannerItemView) {
        this.f18769a = playHighlightsBannerItemView;
    }

    public final void onScrollChanged() {
        View view = (View) this.f18769a.getParent();
        if (view != null) {
            float f;
            Object obj = (!(view instanceof HighlightsClusterViewContent) || ((HighlightsClusterViewContent) this.f18769a.getParent()).aG == Integer.MAX_VALUE) ? null : 1;
            if (obj != null) {
                f = 0.0f;
            } else {
                PlayHighlightsBannerItemView playHighlightsBannerItemView = this.f18769a;
                playHighlightsBannerItemView.getGlobalVisibleRect(playHighlightsBannerItemView.f18728n);
                int width = playHighlightsBannerItemView.f18728n.width();
                ((View) playHighlightsBannerItemView.getParent()).getGlobalVisibleRect(playHighlightsBannerItemView.f18728n);
                f = playHighlightsBannerItemView.f18729o.getInterpolation(((float) width) / ((float) playHighlightsBannerItemView.getWidth()));
            }
            ai.m1837b(this.f18769a.f18722h, f);
            ai.m1837b(this.f18769a.f18725k, f);
        }
    }
}

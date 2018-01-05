package com.google.android.play.article;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.play.C6317h;

public class NewsstandArticleView extends FrameLayout {
    public final C6254k f31259a;
    public final View f31260b;
    public final View f31261c;
    public long f31262d;
    public long f31263e;
    public long f31264f;

    public NewsstandArticleView(Context context) {
        this(context, null, 0);
    }

    public NewsstandArticleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewsstandArticleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31262d = -1;
        this.f31263e = -1;
        this.f31264f = 0;
        this.f31259a = new C6254k(getContext());
        this.f31259a.f31281e = new C6259p(this);
        addView(this.f31259a);
        this.f31260b = m28757a(C6317h.play_article_loading_view);
        addView(this.f31260b);
        this.f31261c = m28757a(C6317h.play_article_error_view);
        addView(this.f31261c);
    }

    private final View m28757a(int i) {
        return LayoutInflater.from(getContext()).inflate(i, this, false);
    }

    public void setApplicationName(String str) {
        this.f31259a.f31279c = str;
    }

    public void setStyleOverrides(C6261r c6261r) {
        this.f31259a.f31280d = c6261r;
    }

    public void setAnalyticsCallbacks(C6247a c6247a) {
        this.f31259a.f31278b.f31285b = c6247a;
    }

    public int getVerticalScrollRange() {
        return this.f31259a.m28771b();
    }

    public long getReadDuration() {
        if (this.f31262d < 0) {
            return this.f31262d;
        }
        long j = this.f31264f;
        if (this.f31263e > 0) {
            j += System.currentTimeMillis() - this.f31263e;
        }
        return (System.currentTimeMillis() - this.f31262d) - j;
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f31262d != -1) {
            if (i == 0 && this.f31263e > 0) {
                this.f31264f += System.currentTimeMillis() - this.f31263e;
                this.f31263e = -1;
            } else if (this.f31263e < 0) {
                this.f31263e = System.currentTimeMillis();
            }
        }
    }

    public final void m28758a(boolean z) {
        this.f31261c.setVisibility(z ? 0 : 4);
    }

    public final void m28759b(boolean z) {
        this.f31260b.setVisibility(z ? 0 : 4);
    }

    public final void m28760c(boolean z) {
        this.f31259a.setVisibility(z ? 0 : 4);
    }

    public void setOnArticleScrollListener(C6262s c6262s) {
        this.f31259a.f31282f = c6262s;
    }
}

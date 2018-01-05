package com.google.android.finsky.entertainment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.story.CardStory;
import com.squareup.leakcanary.C7582R;

public class PEFinskyCardStory extends CardStory implements ae {
    public View f15656a;
    public View f15657b;

    public PEFinskyCardStory(Context context) {
        super(context);
    }

    public PEFinskyCardStory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PEFinskyCardStory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15656a = findViewById(C7582R.id.item_content);
        this.f15657b = findViewById(C7582R.id.progress_bar);
    }

    public final void Z_() {
        ((PEImageView) this.f15655c.m28117a(PEImageView.class, C6089g.image)).m27921a();
    }

    public void setIsLoading(boolean z) {
        if (z) {
            setAttribution(null);
            if (this.f15656a != null) {
                this.f15656a.setVisibility(8);
            }
            if (this.f15657b != null) {
                this.f15657b.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f15656a != null) {
            this.f15656a.setVisibility(0);
        }
        if (this.f15657b != null) {
            this.f15657b.setVisibility(8);
        }
    }
}

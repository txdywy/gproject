package com.google.android.play.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.f;
import com.google.android.play.g;
import com.google.android.play.image.FifeImageView;

public class PlaySearchOneSuggestion extends RelativeLayout {
    public final al f32301a;
    public FifeImageView f32302b;
    public TextView f32303c;
    public TextView f32304d;
    public Drawable f32305e;

    public PlaySearchOneSuggestion(Context context) {
        this(context, null);
    }

    public PlaySearchOneSuggestion(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchOneSuggestion(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32301a = new C6411d(context);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32302b = (FifeImageView) findViewById(g.icon);
        this.f32303c = (TextView) findViewById(g.suggest_text);
        this.f32304d = (TextView) findViewById(g.suggest_subtext);
        this.f32305e = getContext().getResources().getDrawable(f.ic_search);
    }
}

package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.View.OnFocusChangeListener;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.frameworkviews.PlayRatingBar;
import com.google.android.finsky.ratereview.C3964c;
import com.squareup.leakcanary.C7582R;

public class RateReviewEditor2 extends RateReviewEditor {
    public PlayRatingBar f18289a;
    public TextView f18290c;
    public TextView f18291i;
    public ButtonBar f18292j;
    public Drawable f18293k;
    public InsetDrawable f18294l;
    public OnFocusChangeListener f18295m;
    public boolean f18296n;

    public RateReviewEditor2(Context context) {
        this(context, null);
    }

    public RateReviewEditor2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18291i = (TextView) findViewById(C7582R.id.review_tip);
        this.f18292j = (ButtonBar) findViewById(C7582R.id.rate_review_buttonbar);
        this.f18289a = (PlayRatingBar) findViewById(C7582R.id.rating_setter);
        this.f18290c = (TextView) findViewById(C7582R.id.rating_description);
        this.f18293k = this.e.getBackground();
    }

    public void setCommentFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f18295m = onFocusChangeListener;
    }

    public int getUserRating() {
        return this.f18289a.getRating();
    }

    public String getUserTitle() {
        return "";
    }

    public String getUserComment() {
        return this.e.getText().toString().trim();
    }

    protected final void mo3567b(int i) {
        Resources resources = getResources();
        if (this.f18296n) {
            this.f18290c.setText(C7582R.string.rating_submitted);
        } else {
            this.f18290c.setText(C3964c.f20003a[i]);
        }
        this.f18290c.setTextColor(resources.getColor(C7582R.color.play_fg_secondary));
    }

    public void setClickListener(C1056b c1056b) {
        this.f18292j.setClickListener(new bb(this, c1056b));
    }

    public void setCommentViewFocusable(boolean z) {
        this.e.setFocusableInTouchMode(z);
    }
}

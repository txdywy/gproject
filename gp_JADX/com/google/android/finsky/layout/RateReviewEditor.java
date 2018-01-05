package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.frameworkviews.MaxWidthLinearLayout;
import com.google.android.finsky.frameworkviews.PlayRatingBar;
import com.google.android.finsky.ratereview.C3964c;
import com.squareup.leakcanary.C7582R;

public class RateReviewEditor extends MaxWidthLinearLayout {
    public PlayRatingBar f18282a;
    public TextView f18283c;
    public EditText f18284d;
    public EditText f18285e;
    public int f18286f;
    public ay f18287g;
    public TextWatcher f18288h;

    public RateReviewEditor(Context context) {
        this(context, null);
    }

    public RateReviewEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18288h = new aw(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18282a = (PlayRatingBar) findViewById(C7582R.id.rating_setter);
        this.f18283c = (TextView) findViewById(C7582R.id.rating_description);
        this.f18284d = (EditText) findViewById(C7582R.id.review_title);
        this.f18285e = (EditText) findViewById(C7582R.id.review_comment);
    }

    public final void m17333a(int i) {
        this.f18282a.m16030a(i, this.f18286f, new ax(this));
        this.f18282a.setVerticalPadding(C7582R.dimen.review_editor_rating_padding);
    }

    public void setReviewChangeListener(ay ayVar) {
        this.f18287g = ayVar;
    }

    public int getUserRating() {
        return this.f18282a.getRating();
    }

    public String getUserTitle() {
        return this.f18284d.getText().toString().trim();
    }

    public String getUserComment() {
        return this.f18285e.getText().toString().trim();
    }

    public void setUserComment(CharSequence charSequence) {
        this.f18285e.setText(charSequence);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f18284d != null) {
            this.f18284d.removeTextChangedListener(this.f18288h);
        }
        this.f18285e.removeTextChangedListener(this.f18288h);
    }

    public void mo3567b(int i) {
        Resources resources = getResources();
        TextView textView = this.f18283c;
        C1473m.f7980a.ac();
        textView.setText(C3964c.f20003a[i]);
        if (i == 0) {
            this.f18283c.setTextColor(resources.getColor(C7582R.color.play_fg_secondary));
            return;
        }
        this.f18283c.setTextColor(C1608h.m9255c(getContext(), this.f18286f));
    }
}

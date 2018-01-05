package com.google.android.finsky.layout.structuredreviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.frameworkviews.PlayRatingBar;
import com.google.android.finsky.frameworkviews.ac;
import com.google.android.finsky.ratereview.C3964c;
import com.squareup.leakcanary.C7582R;

public class ReviewRatingQuestion extends C3721a {
    public PlayRatingBar f18827c;
    public TextView f18828d;
    public TextView f18829e;
    public C1149i f18830f;
    public boolean f18831g;

    public ReviewRatingQuestion(Context context) {
        this(context, null);
    }

    public ReviewRatingQuestion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18827c = (PlayRatingBar) findViewById(C7582R.id.rating_setter);
        this.f18828d = (TextView) findViewById(C7582R.id.rating_description);
        this.f18829e = (TextView) findViewById(C7582R.id.disclaimer);
        if (C1473m.f7980a.aN().dj().mo2294a(12637755)) {
            this.f18829e.setText(C7582R.string.new_public_reviews_message);
        }
    }

    public final void m17601a(CharSequence charSequence, int i, int i2, boolean z, ac acVar, C1149i c1149i, boolean z2, boolean z3) {
        boolean z4;
        int i3 = 0;
        super.m17594a(charSequence);
        this.f18830f = c1149i;
        this.f18831g = z3;
        this.f18827c.m16030a(i, i2, new C3724g(this, acVar));
        PlayRatingBar playRatingBar = this.f18827c;
        if (z2) {
            z4 = false;
        } else {
            z4 = true;
        }
        playRatingBar.setEnabled(z4);
        TextView textView = this.f18829e;
        if (!z) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        m17600a(i);
        this.f18827c.setVerticalPadding(C7582R.dimen.review_editor_rating_padding);
    }

    final void m17600a(int i) {
        if (i > 0) {
            this.f18828d.setVisibility(0);
            this.f18828d.setText(C3964c.f20003a[i]);
            return;
        }
        this.f18828d.setVisibility(8);
    }

    public final void mo3618b() {
        super.mo3618b();
        this.f18829e.setVisibility(8);
        if (!this.f18831g && this.f18830f != null) {
            this.f18830f.mo1471a(this.f18827c.getRating());
        }
    }
}

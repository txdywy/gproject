package com.google.android.finsky.stream.controllers.editorial.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import com.google.android.finsky.detailscomponents.DetailsTextBlock;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.android.play.utils.m;
import com.squareup.leakcanary.C7582R;

public class EditorialDescriptionSection extends ForegroundLinearLayout implements OnClickListener, OnPreDrawListener, ae, m {
    public final int f22225a;
    public PlayTextView f22226b;
    public View f22227c;
    public DetailsTextBlock f22228d;
    public TextView f22229e;
    public boolean f22230f;
    public boolean f22231g;
    public C4379b f22232h;

    public EditorialDescriptionSection(Context context) {
        this(context, null);
    }

    public EditorialDescriptionSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22225a = context.getResources().getInteger(C7582R.integer.details_text_collapsed_lines);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, 0);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public void setBackgroundColor(int i) {
        getCardViewGroupDelegate().mo3864a(this, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f22226b = (PlayTextView) findViewById(C7582R.id.callout);
        this.f22227c = findViewById(C7582R.id.spacer);
        this.f22228d = (DetailsTextBlock) findViewById(C7582R.id.body_container);
        this.f22229e = (TextView) findViewById(C7582R.id.footer_message);
        this.f22229e.setText(getContext().getString(C7582R.string.read_more).toUpperCase());
        getViewTreeObserver().addOnPreDrawListener(this);
    }

    private final boolean m20546b() {
        return this.f22228d.m13582b() && this.f22228d.getBodyLineCount() > this.f22225a;
    }

    public boolean onPreDraw() {
        if (m20546b()) {
            this.f22229e.setVisibility(0);
        } else {
            this.f22229e.setVisibility(8);
        }
        getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    public void onClick(View view) {
        scrollTo(0, 0);
        if (this.f22230f) {
            this.f22230f = false;
        } else if (!m20546b()) {
        } else {
            if (this.f22231g) {
                this.f22231g = false;
                this.f22228d.setBodyMaxLines(this.f22225a);
                this.f22229e.setVisibility(0);
                return;
            }
            this.f22231g = true;
            this.f22228d.setBodyMaxLines(Integer.MAX_VALUE);
            this.f22229e.setVisibility(8);
        }
    }

    public final void m20547a(View view, String str) {
        this.f22230f = true;
        if (this.f22232h != null) {
            this.f22232h.mo4183a(str);
        }
    }

    public final void Z_() {
        this.f22232h = null;
    }
}

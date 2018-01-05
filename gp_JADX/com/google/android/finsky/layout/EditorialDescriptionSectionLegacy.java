package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import com.google.android.finsky.detailscomponents.DetailsTextBlock;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.squareup.leakcanary.C7582R;

public class EditorialDescriptionSectionLegacy extends ForegroundLinearLayout implements OnPreDrawListener {
    public C3748a f18151a;
    public final int f18152b;
    public PlayTextView f18153c;
    public View f18154d;
    public DetailsTextBlock f18155e;
    public TextView f18156f;
    public boolean f18157g;
    public C2495w f18158h;
    public boolean f18159i;

    public EditorialDescriptionSectionLegacy(Context context) {
        this(context, null);
    }

    public EditorialDescriptionSectionLegacy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18152b = context.getResources().getInteger(C7582R.integer.details_text_collapsed_lines);
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
        this.f18153c = (PlayTextView) findViewById(C7582R.id.callout);
        this.f18154d = findViewById(C7582R.id.spacer);
        this.f18155e = (DetailsTextBlock) findViewById(C7582R.id.body_container);
        this.f18156f = (TextView) findViewById(C7582R.id.footer_message);
        this.f18156f.setText(getContext().getString(C7582R.string.read_more).toUpperCase());
        getViewTreeObserver().addOnPreDrawListener(this);
    }

    private final boolean m17290b() {
        return this.f18155e.m13582b() && this.f18155e.getBodyLineCount() > this.f18152b;
    }

    protected final void m17291a() {
        scrollTo(0, 0);
        if (this.f18157g) {
            this.f18157g = false;
        } else if (!m17290b()) {
        } else {
            if (this.f18159i) {
                this.f18159i = false;
                this.f18155e.setBodyMaxLines(this.f18152b);
                this.f18156f.setVisibility(0);
                return;
            }
            this.f18159i = true;
            this.f18155e.setBodyMaxLines(Integer.MAX_VALUE);
            this.f18156f.setVisibility(8);
        }
    }

    public boolean onPreDraw() {
        if (m17290b()) {
            this.f18156f.setVisibility(0);
        } else {
            this.f18156f.setVisibility(8);
        }
        getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}

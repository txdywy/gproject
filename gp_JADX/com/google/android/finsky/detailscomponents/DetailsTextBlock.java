package com.google.android.finsky.detailscomponents;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.p029a.C0206f;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.play.layout.PlayTextView;
import com.squareup.leakcanary.C7582R;

public class DetailsTextBlock extends RelativeLayout {
    public ImageView f13701a;
    public TextView f13702b;
    public PlayTextView f13703c;
    public final int f13704d;
    public final int f13705e;

    public DetailsTextBlock(Context context) {
        this(context, null);
    }

    public DetailsTextBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.DetailsTextBlock);
        this.f13704d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f13705e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13701a = (ImageView) findViewById(C7582R.id.icon);
        this.f13702b = (TextView) findViewById(C7582R.id.body_header);
        this.f13703c = (PlayTextView) findViewById(C7582R.id.body);
        this.f13703c.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void m13581a(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f13702b.setVisibility(8);
        } else {
            this.f13702b.setText(charSequence);
            this.f13702b.setVisibility(0);
        }
        setBody(charSequence2);
        setBodyMaxLines(i);
        setVisibility(0);
    }

    public void setBody(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f13703c.setVisibility(8);
            return;
        }
        this.f13703c.setText(charSequence);
        this.f13703c.setVisibility(0);
    }

    public void setBodyMaxLines(int i) {
        this.f13703c.setMaxLines(i);
    }

    public void setBodyTextIsSelectable(boolean z) {
        this.f13703c.setTextIsSelectable(z);
        this.f13703c.setAutoLinkMask(15);
        this.f13703c.setMovementMethod(ArrowKeyMovementMethod.getInstance());
    }

    public final void m13579a(int i, int i2) {
        this.f13703c.setLastLineOverdrawColor(i);
        this.f13703c.setTextColor(i2);
        this.f13703c.setLinkTextColor(i2);
        this.f13701a.setVisibility(8);
    }

    public final void m13580a(int i, int i2, int i3) {
        int i4;
        Context context = getContext();
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                i4 = C7582R.color.whatsnew_books;
                break;
            case 2:
                i4 = C7582R.color.whatsnew_music;
                break;
            case 3:
                if (!C1608h.f8520b) {
                    i4 = C7582R.color.whatsnew_apps;
                    break;
                } else {
                    i4 = C7582R.color.whatsnew_apps_ent;
                    break;
                }
            case 4:
                i4 = C7582R.color.whatsnew_movies;
                break;
            case 6:
                i4 = C7582R.color.whatsnew_newsstand;
                break;
            default:
                throw new IllegalArgumentException("Unsupported backend ID (" + i + ")");
        }
        i4 = context.getResources().getColor(i4);
        setBackgroundColor(i4);
        this.f13703c.setLastLineOverdrawColor(i4);
        i4 = resources.getDimensionPixelSize(C7582R.dimen.details_new_content_margin);
        ai.m1823a(this, i4, i4, i4, i4);
        ColorStateList c = C1608h.m9255c(context, i);
        this.f13702b.setTextColor(c);
        this.f13703c.setTextColor(c);
        this.f13703c.setLinkTextColor(c);
        this.f13701a.setVisibility(0);
        Drawable e = C0259a.m1526e(C0206f.m1065a(resources, C7582R.drawable.ic_whats_new, context.getTheme()).mutate());
        C0259a.m1514a(e, c.getDefaultColor());
        this.f13701a.setImageDrawable(e);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = i3;
        marginLayoutParams.leftMargin = this.f13705e;
        marginLayoutParams.rightMargin = this.f13705e;
        setLayoutParams(marginLayoutParams);
    }

    public final void m13578a() {
        setBackgroundResource(0);
        this.f13703c.setLastLineOverdrawColor(-1);
        Resources resources = getResources();
        int color = resources.getColor(C7582R.color.play_fg_primary);
        this.f13703c.setTextColor(color);
        this.f13703c.setLinkTextColor(color);
        this.f13702b.setTextColor(resources.getColor(C7582R.color.play_fg_secondary));
        this.f13701a.setVisibility(8);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        marginLayoutParams.leftMargin = this.f13704d;
        marginLayoutParams.rightMargin = this.f13704d;
        setLayoutParams(marginLayoutParams);
    }

    public void setBodyClickListener(OnClickListener onClickListener) {
        this.f13703c.setOnClickListener(onClickListener);
    }

    public final boolean m13582b() {
        return this.f13703c.getVisibility() == 0 && !TextUtils.isEmpty(this.f13703c.getText());
    }

    public int getBodyLineCount() {
        return this.f13703c.getLineCount();
    }
}

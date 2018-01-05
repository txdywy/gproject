package com.google.android.finsky.contentfilterui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.providers.d;
import com.google.android.play.image.FifeImageView;

protected class ContentFilterChoiceItemView extends ForegroundLinearLayout
{

    public com.google.android.finsky.bg.l a;
    public com.google.android.finsky.bg.af b;
    public View c;
    public View d;
    public View e;
    public View f;
    public ImageView g;
    public TextView h;
    public TextView i;
    public CheckBox j;
    public FifeImageView k;

    ContentFilterChoiceItemView(Context p0) {
        ContentFilterChoiceItemView(p0, 0);
    }

    ContentFilterChoiceItemView(Context p0, AttributeSet p1) {
        ContentFilterChoiceItemView(p0, p1, 0);
    }

    ContentFilterChoiceItemView(Context p0, AttributeSet p1, int p2) {
        ForegroundLinearLayout(p0, p1, p2);
        ((com.google.android.finsky.contentfilterui.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.contentfilterui.d)).a(this);
    }

    public CheckBox getCheckBox() {
        return this.j;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = this.findViewById(2131755499);
        this.d = this.findViewById(2131755500);
        this.e = this.findViewById(2131755501);
        this.g = (ImageView)this.findViewById(2131755503);
        this.f = this.findViewById(2131755502);
        this.h = (TextView)this.findViewById(2131755504);
        this.i = (TextView)this.findViewById(2131755505);
        this.j = (CheckBox)this.findViewById(2131755507);
        this.k = (FifeImageView)this.findViewById(2131755506);
    }

}

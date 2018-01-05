package com.google.android.finsky.contentfilterui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class ContentFilterChoiceItemView extends ForegroundLinearLayout {
    public C1612l f11474a;
    public af f11475b;
    public View f11476c;
    public View f11477d;
    public View f11478e;
    public View f11479f;
    public ImageView f11480g;
    public TextView f11481h;
    public TextView f11482i;
    public CheckBox f11483j;
    public FifeImageView f11484k;

    public ContentFilterChoiceItemView(Context context) {
        this(context, null);
    }

    public ContentFilterChoiceItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFilterChoiceItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((C1367d) C3947d.m18649a(C1367d.class)).mo1784a(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f11476c = findViewById(C7582R.id.connector_holder);
        this.f11477d = findViewById(C7582R.id.top_connector);
        this.f11478e = findViewById(C7582R.id.bottom_connector);
        this.f11480g = (ImageView) findViewById(C7582R.id.selection_indicator);
        this.f11479f = findViewById(C7582R.id.connector_dot);
        this.f11481h = (TextView) findViewById(C7582R.id.choice_label);
        this.f11482i = (TextView) findViewById(C7582R.id.choice_label_summary);
        this.f11483j = (CheckBox) findViewById(C7582R.id.choice_checkbox);
        this.f11484k = (FifeImageView) findViewById(C7582R.id.choice_icon);
    }

    public CheckBox getCheckBox() {
        return this.f11483j;
    }
}

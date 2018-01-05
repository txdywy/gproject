package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.CardLinearLayout;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class WarmWelcomeV2Card extends FrameLayout implements ad, ae {
    public TextView f18743a;
    public TextView f18744b;
    public FifeImageView f18745c;
    public View f18746d;
    public View f18747e;
    public TextView f18748f;
    public TextView f18749g;
    public ImageButton f18750h;
    public FifeImageView f18751i;
    public ce f18752j;
    public ad f18753k;
    public CardLinearLayout f18754l;

    public WarmWelcomeV2Card(Context context) {
        this(context, null);
    }

    public WarmWelcomeV2Card(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18743a = (TextView) findViewById(C7582R.id.warm_welcome_v2_title);
        this.f18744b = (TextView) findViewById(C7582R.id.warm_welcome_v2_body);
        this.f18754l = (CardLinearLayout) findViewById(C7582R.id.warm_welcome_v2_card_content);
        this.f18745c = (FifeImageView) findViewById(C7582R.id.warm_welcome_v2_graphic);
        this.f18746d = findViewById(C7582R.id.warm_welcome_v2_graphic_box);
        this.f18748f = (TextView) findViewById(C7582R.id.button_primary);
        this.f18749g = (TextView) findViewById(C7582R.id.button_secondary);
        this.f18747e = findViewById(C7582R.id.warm_welcome_v2_button_panel);
        this.f18750h = (ImageButton) findViewById(C1592a.f8429D.intValue());
        this.f18751i = (FifeImageView) findViewById(C1592a.f8430E.intValue());
    }

    public final void Z_() {
        this.f18745c.a();
    }

    public ce getPlayStoreUiElement() {
        return this.f18752j;
    }

    public ad getParentNode() {
        return this.f18753k;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}

package com.google.android.finsky.billing.gifting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.squareup.leakcanary.C7582R;

public class PlayCreditGiftingHeader extends FrameLayout implements be {
    public C1612l f9428a;
    public View f9429b;
    public TextView f9430c;
    public TextView f9431d;
    public FifeImageView f9432e;

    public PlayCreditGiftingHeader(Context context) {
        this(context, null);
    }

    public PlayCreditGiftingHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((C1353a) C3947d.m18649a(C1353a.class)).mo1736a(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f9429b = findViewById(C7582R.id.background);
        this.f9430c = (TextView) findViewById(C7582R.id.gift_header_title);
        this.f9431d = (TextView) findViewById(C7582R.id.gift_header_description);
        this.f9432e = (FifeImageView) findViewById(C7582R.id.gift_header_image);
    }

    public final void m9877a(FifeImageView fifeImageView, Bitmap bitmap) {
        this.f9429b.setBackgroundColor(bitmap.getPixel(0, bitmap.getHeight() - 1));
    }

    public final void m9876a(FifeImageView fifeImageView) {
    }
}

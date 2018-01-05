package com.google.android.finsky.billing.gifting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.providers.d;
import com.google.android.play.image.FifeImageView;

protected class PlayCreditGiftingHeader extends FrameLayout implements com.google.android.play.image.be
{

    public com.google.android.finsky.bg.l a;
    public View b;
    public TextView c;
    public TextView d;
    public FifeImageView e;

    PlayCreditGiftingHeader(Context p0) {
        PlayCreditGiftingHeader(p0, 0);
    }

    PlayCreditGiftingHeader(Context p0, AttributeSet p1) {
        FrameLayout(p0, p1);
        ((com.google.android.finsky.billing.gifting.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.gifting.a)).a(this);
    }

    public final void a(FifeImageView p0) {
    }

    public final void a(FifeImageView p0, Bitmap p1) {
        this.b.setBackgroundColor(p1.getPixel(0, p1.getHeight() - 1));
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.b = this.findViewById(2131755396);
        this.c = (TextView)this.findViewById(2131756470);
        this.d = (TextView)this.findViewById(2131756471);
        this.e = (FifeImageView)this.findViewById(2131756469);
    }

}

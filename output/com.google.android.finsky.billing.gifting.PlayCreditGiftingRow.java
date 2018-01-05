package com.google.android.finsky.billing.gifting;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.providers.d;

public class PlayCreditGiftingRow extends BucketRowLayout
{

    public com.google.android.finsky.bg.l a;
    public com.google.android.finsky.billing.gifting.i b;
    public int c;
    public FifeImageView[] d;
    public TextView[] e;

    PlayCreditGiftingRow(Context p0) {
        PlayCreditGiftingRow(p0, 0);
    }

    PlayCreditGiftingRow(Context p0, AttributeSet p1) {
        BucketRowLayout(p0, p1);
        ((com.google.android.finsky.billing.gifting.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.gifting.a)).a(this);
    }

}

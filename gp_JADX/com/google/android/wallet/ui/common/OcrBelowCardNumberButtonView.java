package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.wallet.p383e.C6622f;

public class OcrBelowCardNumberButtonView extends LinearLayout {
    public OcrBelowCardNumberButtonView(Context context) {
        super(context);
    }

    public OcrBelowCardNumberButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OcrBelowCardNumberButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public OcrBelowCardNumberButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ci.m30864a((ImageView) findViewById(C6622f.below_card_number_ocr_button_image), ci.m30874b(getContext()));
    }
}

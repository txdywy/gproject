package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.wallet.p383e.C6622f;

public class MaterialFieldRegionCodeView extends RegionCodeView {
    public MaterialFieldLayout f33458a;
    public MaterialFieldLayout f33459b;
    public String f33460c;

    public MaterialFieldRegionCodeView(Context context) {
        super(context);
    }

    public MaterialFieldRegionCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaterialFieldRegionCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MaterialFieldRegionCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setRegionCodes(int[] iArr) {
        int i;
        int i2 = 0;
        super.setRegionCodes(iArr);
        MaterialFieldLayout materialFieldLayout = this.f33458a;
        if (iArr.length == 1) {
            i = 8;
        } else {
            i = 0;
        }
        materialFieldLayout.setVisibility(i);
        MaterialFieldLayout materialFieldLayout2 = this.f33459b;
        if (iArr.length != 1) {
            i2 = 8;
        }
        materialFieldLayout2.setVisibility(i2);
    }

    public void setLabel(String str) {
        this.f33460c = str;
        if (this.f33458a != null) {
            this.f33458a.setLabel(str);
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f33458a = (MaterialFieldLayout) findViewById(C6622f.region_code_spinner_container);
        this.f33459b = (MaterialFieldLayout) findViewById(C6622f.region_code_text_container);
        if (!TextUtils.isEmpty(this.f33460c)) {
            this.f33458a.setLabel(this.f33460c);
        }
    }
}

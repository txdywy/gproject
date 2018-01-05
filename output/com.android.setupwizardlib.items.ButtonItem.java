package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.android.setupwizardlib.e;
import com.android.setupwizardlib.f;

public class ButtonItem extends AbstractItem implements View$OnClickListener
{

    public com.android.setupwizardlib.items.a b;

    ButtonItem() {
        AbstractItem();
    }

    ButtonItem(Context p0, AttributeSet p1) {
        AbstractItem(p0, p1);
        v0 = p0.obtainStyledAttributes(p1, com.android.setupwizardlib.f.SuwButtonItem);
        v0.getBoolean(com.android.setupwizardlib.f.SuwButtonItem_android_enabled, 1);
        v0.getText(com.android.setupwizardlib.f.SuwButtonItem_android_text);
        v0.getResourceId(com.android.setupwizardlib.f.SuwButtonItem_android_theme, com.android.setupwizardlib.e.SuwButtonItem);
        v0.recycle();
    }

    public final int a() {
        return 0;
    }

    public void onClick(View p0) {
        if (this.b != 0)
            this.b.a();
    }

}

package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.android.setupwizardlib.d;
import com.android.setupwizardlib.f;

protected class Item extends AbstractItem
{

    public boolean c;

    Item() {
        AbstractItem();
        this.c = 1;
    }

    Item(Context p0, AttributeSet p1) {
        AbstractItem(p0, p1);
        this.c = 1;
        v0 = p0.obtainStyledAttributes(p1, com.android.setupwizardlib.f.SuwItem);
        v0.getBoolean(com.android.setupwizardlib.f.SuwItem_android_enabled, 1);
        v0.getDrawable(com.android.setupwizardlib.f.SuwItem_android_icon);
        v0.getText(com.android.setupwizardlib.f.SuwItem_android_title);
        v0.getText(com.android.setupwizardlib.f.SuwItem_android_summary);
        v0.getResourceId(com.android.setupwizardlib.f.SuwItem_android_layout, this.b());
        this.c = v0.getBoolean(com.android.setupwizardlib.f.SuwItem_android_visible, 1);
        v0.recycle();
    }

    public final int a() {
        if (this.c != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected int b() {
        return com.android.setupwizardlib.d.suw_items_default;
    }

}

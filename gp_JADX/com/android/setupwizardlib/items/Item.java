package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.android.setupwizardlib.C0610d;
import com.android.setupwizardlib.C0612f;

public class Item extends AbstractItem {
    public boolean f3955c = true;

    public Item(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0612f.SuwItem);
        obtainStyledAttributes.getBoolean(C0612f.SuwItem_android_enabled, true);
        obtainStyledAttributes.getDrawable(C0612f.SuwItem_android_icon);
        obtainStyledAttributes.getText(C0612f.SuwItem_android_title);
        obtainStyledAttributes.getText(C0612f.SuwItem_android_summary);
        obtainStyledAttributes.getResourceId(C0612f.SuwItem_android_layout, mo1028b());
        this.f3955c = obtainStyledAttributes.getBoolean(C0612f.SuwItem_android_visible, true);
        obtainStyledAttributes.recycle();
    }

    protected int mo1028b() {
        return C0610d.suw_items_default;
    }

    public final int mo1027a() {
        return this.f3955c ? 1 : 0;
    }
}

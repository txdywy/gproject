package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.android.setupwizardlib.d;
import com.android.setupwizardlib.f;

public class SwitchItem extends Item implements CompoundButton$OnCheckedChangeListener
{

    public com.android.setupwizardlib.items.d d;

    SwitchItem() {
        Item();
    }

    SwitchItem(Context p0, AttributeSet p1) {
        Item(p0, p1);
        v0 = p0.obtainStyledAttributes(p1, com.android.setupwizardlib.f.SuwSwitchItem);
        v0.getBoolean(com.android.setupwizardlib.f.SuwSwitchItem_android_checked, 0);
        v0.recycle();
    }

    protected int b() {
        return com.android.setupwizardlib.d.suw_items_switch;
    }

    public void onCheckedChanged(CompoundButton p0, boolean p1) {
        if (this.d != 0)
            this.d.a();
    }

}

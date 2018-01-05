package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.android.setupwizardlib.C0610d;
import com.android.setupwizardlib.C0612f;

public class SwitchItem extends Item implements OnCheckedChangeListener {
    public C0616d f3956d;

    public SwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0612f.SuwSwitchItem);
        obtainStyledAttributes.getBoolean(C0612f.SuwSwitchItem_android_checked, false);
        obtainStyledAttributes.recycle();
    }

    protected int mo1028b() {
        return C0610d.suw_items_switch;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f3956d != null) {
            this.f3956d.m4252a();
        }
    }
}

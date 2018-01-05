package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.android.setupwizardlib.d;
import com.android.setupwizardlib.f;

public class ExpandableSwitchItem extends SwitchItem implements View$OnClickListener, CompoundButton$OnCheckedChangeListener
{

    public boolean b;

    ExpandableSwitchItem() {
        SwitchItem();
        this.b = 0;
    }

    ExpandableSwitchItem(Context p0, AttributeSet p1) {
        SwitchItem(p0, p1);
        this.b = 0;
        v0 = p0.obtainStyledAttributes(p1, com.android.setupwizardlib.f.SuwExpandableSwitchItem);
        v0.getText(com.android.setupwizardlib.f.SuwExpandableSwitchItem_suwCollapsedSummary);
        v0.getText(com.android.setupwizardlib.f.SuwExpandableSwitchItem_suwExpandedSummary);
        v0.recycle();
    }

    protected final int b() {
        return com.android.setupwizardlib.d.suw_items_expandable_switch;
    }

    public void onClick(View p0) {
        if (this.b == 0)
            v0 = 1;
        else
            v0 = 0;
        if (this.b != v0) {
            this.b = v0;
            this.a(0, 1);
        }
    }

}

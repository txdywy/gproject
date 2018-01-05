package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.android.setupwizardlib.C0610d;
import com.android.setupwizardlib.C0612f;

public class ExpandableSwitchItem extends SwitchItem implements OnClickListener, OnCheckedChangeListener {
    public boolean f3957b = false;

    public ExpandableSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0612f.SuwExpandableSwitchItem);
        obtainStyledAttributes.getText(C0612f.SuwExpandableSwitchItem_suwCollapsedSummary);
        obtainStyledAttributes.getText(C0612f.SuwExpandableSwitchItem_suwExpandedSummary);
        obtainStyledAttributes.recycle();
    }

    protected final int mo1028b() {
        return C0610d.suw_items_expandable_switch;
    }

    public void onClick(View view) {
        boolean z = !this.f3957b;
        if (this.f3957b != z) {
            this.f3957b = z;
            m4239a(0, 1);
        }
    }
}

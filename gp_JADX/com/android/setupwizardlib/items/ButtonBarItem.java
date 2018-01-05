package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;

public class ButtonBarItem extends AbstractItem {
    public boolean f3953b = true;

    public ButtonBarItem() {
        ArrayList arrayList = new ArrayList();
    }

    public ButtonBarItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList();
    }

    public final int mo1027a() {
        return this.f3953b ? 1 : 0;
    }
}

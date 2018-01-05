package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;

public class AbstractItem extends AbstractItemHierarchy
{

    AbstractItem() {
        AbstractItemHierarchy();
    }

    AbstractItem(Context p0, AttributeSet p1) {
        AbstractItemHierarchy(p0, p1);
    }

    public int a() {
        return 1;
    }

}

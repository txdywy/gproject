package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;

public final class ButtonBarItem extends AbstractItem
{

    public boolean b;

    ButtonBarItem() {
        AbstractItem();
        new ArrayList();
        this.b = 1;
    }

    ButtonBarItem(Context p0, AttributeSet p1) {
        AbstractItem(p0, p1);
        new ArrayList();
        this.b = 1;
    }

    public final int a() {
        if (this.b != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}

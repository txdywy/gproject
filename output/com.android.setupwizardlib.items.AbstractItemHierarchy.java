package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import com.android.setupwizardlib.f;
import java.util.ArrayList;

public final class AbstractItemHierarchy implements com.android.setupwizardlib.items.b
{

    public ArrayList a;

    AbstractItemHierarchy() {
        this.a = new ArrayList();
    }

    AbstractItemHierarchy(Context p0, AttributeSet p1) {
        this.a = new ArrayList();
        v0 = p0.obtainStyledAttributes(p1, com.android.setupwizardlib.f.SuwAbstractItem);
        v0.getResourceId(com.android.setupwizardlib.f.SuwAbstractItem_android_id, 0);
        v0.recycle();
    }

    public final void a(int p0, int p1) {
        if (p0 < 0)
            Log.w("AbstractItemHierarchy", 52 + "notifyItemRangeChanged: Invalid position=" + p0);
        else if (p1 < 0)
            Log.w("AbstractItemHierarchy", 53 + "notifyItemRangeChanged: Invalid itemCount=" + p1);
        else {
            v2 = 0;
            while (v2 < ((ArrayList)this.a).size()) {
                v1 = ((ArrayList)this.a).get(v2);
                v2 = v2 + 1;
                ((com.android.setupwizardlib.items.c)v1).a(this, p0, p1);
            }
        }
    }

}

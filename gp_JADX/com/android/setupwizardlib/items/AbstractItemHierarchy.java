package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import com.android.setupwizardlib.C0612f;
import java.util.ArrayList;

public abstract class AbstractItemHierarchy implements C0613b {
    public ArrayList f3952a = new ArrayList();

    public AbstractItemHierarchy(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0612f.SuwAbstractItem);
        obtainStyledAttributes.getResourceId(C0612f.SuwAbstractItem_android_id, 0);
        obtainStyledAttributes.recycle();
    }

    public final void m4239a(int i, int i2) {
        if (i < 0) {
            Log.w("AbstractItemHierarchy", "notifyItemRangeChanged: Invalid position=" + i);
        } else if (i2 < 0) {
            Log.w("AbstractItemHierarchy", "notifyItemRangeChanged: Invalid itemCount=" + i2);
        } else {
            ArrayList arrayList = this.f3952a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((C0614c) obj).mo1029a(this, i, i2);
            }
        }
    }
}

package com.google.android.libraries.bind.p117b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.bo;
import android.util.AttributeSet;

public class C5871b extends bo {
    public C5871b(Context context) {
        super(context);
    }

    public C5871b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @SuppressLint({"NewApi"})
    public final boolean mo5178e() {
        if (VERSION.SDK_INT < 18 || getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public int getCurrentLogicalItem() {
        return C5872c.m27301a(getAdapter(), super.getCurrentItem());
    }

    public int getCurrentVisualItem() {
        return super.getCurrentItem();
    }

    public void setCurrentLogicalItem(int i) {
        setCurrentItem(C5872c.m27302b(getAdapter(), i));
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        super.onRtlPropertiesChanged(i);
        int currentLogicalItem = getCurrentLogicalItem();
        if (getAdapter() instanceof C1071a) {
            C1071a c1071a = (C1071a) getAdapter();
            if (i != 1) {
                z = false;
            }
            c1071a.mo1375a(z);
        }
        setCurrentLogicalItem(currentLogicalItem);
    }
}

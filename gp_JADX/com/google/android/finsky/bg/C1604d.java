package com.google.android.finsky.bg;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.utils.bb;

public final class C1604d extends LayoutInflater {
    public static final String[] f8515a = new String[]{"android.widget.", "android.webkit.", "android.app."};

    public static C1604d m9232a(Context context) {
        Resources resources = context.getResources();
        return new C1604d(new C1605e(context, new Resources(context.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration())));
    }

    private C1604d(Context context) {
        super(context);
    }

    public final LayoutInflater cloneInContext(Context context) {
        return new C1604d(context);
    }

    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        if (bb.m21795c()) {
            throw new IllegalStateException(String.valueOf(getClass().getName()).concat("'s inflate should not be called from the main thread."));
        }
        try {
            return super.inflate(i, viewGroup, z);
        } catch (RuntimeException e) {
            return null;
        }
    }

    protected final View onCreateView(String str, AttributeSet attributeSet) {
        String[] strArr = f8515a;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                View createView = createView(str, strArr[i], attributeSet);
                if (createView != null) {
                    return createView;
                }
                i++;
            } catch (ClassNotFoundException e) {
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}

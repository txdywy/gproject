package com.google.android.finsky.dialogbuilder.layout;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicInteger;

public class CheckedGroupView extends LinearLayout {
    public static final AtomicInteger f15126c = new AtomicInteger(1);
    public int f15127a = -1;
    public C2768b f15128b;

    public CheckedGroupView(Context context) {
        super(context);
    }

    public CheckedGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckedGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CheckedGroupView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onViewAdded(View view) {
        CheckedView a = m14905a(view);
        if (a != null) {
            if (a.getId() == -1) {
                int generateViewId;
                if (VERSION.SDK_INT >= 17) {
                    generateViewId = View.generateViewId();
                } else {
                    int i;
                    do {
                        i = f15126c.get();
                        generateViewId = i + 1;
                        if (generateViewId > 16777215) {
                            generateViewId = 1;
                        }
                    } while (!f15126c.compareAndSet(i, generateViewId));
                    generateViewId = i;
                }
                a.setId(generateViewId);
            }
            a.f15131c = new C2802a(this);
        }
        super.onViewAdded(view);
    }

    public void onViewRemoved(View view) {
        CheckedView a = m14905a(view);
        if (a != null) {
            m14906a(a);
            a.f15131c = null;
        }
        super.onViewRemoved(view);
    }

    public C2768b getCheckedChangeListener() {
        return this.f15128b;
    }

    public void setCheckedChangeListener(C2768b c2768b) {
        this.f15128b = c2768b;
    }

    public int getCheckedViewId() {
        return this.f15127a;
    }

    public final void m14908a(int i) {
        if (this.f15127a != i) {
            View findViewById = findViewById(i);
            if (findViewById != null && (findViewById instanceof CheckedView)) {
                if (this.f15127a != -1) {
                    m14906a((CheckedView) findViewById(this.f15127a));
                }
                this.f15127a = i;
                ((CheckedView) findViewById).setChecked(true);
                m14907a((CheckedView) findViewById, true);
            }
        }
    }

    private final void m14906a(CheckedView checkedView) {
        if (this.f15127a == checkedView.getId()) {
            checkedView.setChecked(false);
            m14907a(checkedView, false);
            this.f15127a = -1;
        }
    }

    private final void m14907a(CheckedView checkedView, boolean z) {
        if (this.f15128b != null) {
            this.f15128b.mo3133a(checkedView, z);
        }
    }

    private static CheckedView m14905a(View view) {
        if (view instanceof LinearLayout) {
            for (int i = 0; i < ((LinearLayout) view).getChildCount(); i++) {
                if (((LinearLayout) view).getChildAt(i) instanceof CheckedView) {
                    return (CheckedView) ((LinearLayout) view).getChildAt(i);
                }
            }
        }
        return null;
    }
}

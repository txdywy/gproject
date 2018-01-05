package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.setupwizardlib.C0611e;
import com.android.setupwizardlib.C0612f;

public class ButtonItem extends AbstractItem implements OnClickListener {
    public C0615a f3954b;

    public ButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0612f.SuwButtonItem);
        obtainStyledAttributes.getBoolean(C0612f.SuwButtonItem_android_enabled, true);
        obtainStyledAttributes.getText(C0612f.SuwButtonItem_android_text);
        obtainStyledAttributes.getResourceId(C0612f.SuwButtonItem_android_theme, C0611e.SuwButtonItem);
        obtainStyledAttributes.recycle();
    }

    public final int mo1027a() {
        return 0;
    }

    public void onClick(View view) {
        if (this.f3954b != null) {
            this.f3954b.m4251a();
        }
    }
}

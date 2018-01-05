package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.android.vending.C0629a;

public class LabelEditText extends EditText implements OnFocusChangeListener {
    public int f16205a;
    public String f16206b;

    public LabelEditText(Context context) {
        this(context, null);
    }

    public LabelEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0629a.LabelEditText, 0, 0);
        this.f16205a = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f16206b = getText().toString().trim();
        setOnFocusChangeListener(this);
    }

    public void setTextValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f16206b = str.trim();
            if (this.f16205a == 0 || hasFocus()) {
                setText(this.f16206b);
                return;
            }
            setText(getContext().getString(this.f16205a, new Object[]{this.f16206b}));
        }
    }

    public String getTextValue() {
        return this.f16206b;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            setText(this.f16206b);
            setSelection(this.f16206b.length());
            return;
        }
        this.f16206b = getText().toString().trim();
        if (!TextUtils.isEmpty(this.f16206b) && this.f16205a != 0) {
            setText(getContext().getString(this.f16205a, new Object[]{this.f16206b}));
        }
    }
}

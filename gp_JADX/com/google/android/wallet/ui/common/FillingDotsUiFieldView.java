package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.view.r;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.wallet.p383e.C6621e;

public class FillingDotsUiFieldView extends LinearLayout implements TextWatcher, OnFocusChangeListener, OnKeyListener, OnEditorActionListener, C6755v, C6756y {
    public FormEditText f33350a;
    public int f33351b;
    public CharSequence f33352c;

    public FillingDotsUiFieldView(Context context) {
        super(context);
    }

    public FillingDotsUiFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FillingDotsUiFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public FillingDotsUiFieldView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void m30607a(FormEditText formEditText, int i) {
        int i2 = 0;
        LayoutParams layoutParams = formEditText.getLayoutParams();
        layoutParams.height = 0;
        layoutParams.width = 0;
        formEditText.setLayoutParams(layoutParams);
        formEditText.addTextChangedListener(this);
        formEditText.setOnEditorActionListener(this);
        formEditText.setOnFocusChangeListener(this);
        formEditText.setErrorHandler(this);
        formEditText.setOnKeyListener(this);
        addView(formEditText);
        this.f33350a = formEditText;
        this.f33351b = i;
        while (i2 < i) {
            View imageView = new ImageView(getContext());
            imageView.setImageResource(C6621e.wallet_uic_dot_unfilled);
            LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            r.a(layoutParams2, (int) TypedValue.applyDimension(1, 8.0f, imageView.getResources().getDisplayMetrics()));
            imageView.setLayoutParams(layoutParams2);
            addView(imageView);
            i2++;
        }
    }

    public View getInnerFieldView() {
        return this.f33350a;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        int length = editable.length();
        for (int i = 0; i < this.f33351b; i++) {
            ImageView imageView = (ImageView) getChildAt(i + 1);
            if (i < length) {
                imageView.setImageResource(C6621e.wallet_uic_dot_filled);
            } else {
                imageView.setImageResource(C6621e.wallet_uic_dot_unfilled);
            }
        }
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView == this.f33350a && i == 6) {
            return true;
        }
        return false;
    }

    public void onFocusChange(View view, boolean z) {
        if (view == this.f33350a && z) {
            ci.m30871a((TextView) view, view.focusSearch(130) != null);
        }
    }

    public void setError(CharSequence charSequence) {
        this.f33352c = charSequence;
    }

    public void setErrorEnabled(boolean z) {
    }

    public CharSequence getError() {
        return this.f33352c;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z = false;
        if (view != this.f33350a || keyEvent.getKeyCode() != 23 || keyEvent.getAction() != 1) {
            return false;
        }
        TextView textView = (TextView) view;
        if (view.focusSearch(130) != null) {
            z = true;
        }
        ci.m30871a(textView, z);
        return true;
    }
}

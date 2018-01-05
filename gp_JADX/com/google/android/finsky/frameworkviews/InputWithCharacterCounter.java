package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class InputWithCharacterCounter extends LinearLayout implements TextWatcher {
    public int f16201a;
    public aa f16202b;
    public EditText f16203c;
    public TextView f16204d;

    public InputWithCharacterCounter(Context context) {
        this(context, null);
    }

    public InputWithCharacterCounter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f16203c = (EditText) findViewById(C7582R.id.text);
        this.f16204d = (TextView) findViewById(C7582R.id.character_count);
    }

    public String getTextValue() {
        return this.f16203c.getText().toString().trim();
    }

    public final void m16027a(String str, String str2, int i, aa aaVar) {
        int length;
        this.f16201a = i;
        this.f16202b = aaVar;
        this.f16203c.setText(str);
        this.f16203c.setHint(str2);
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        m16026a(length);
        this.f16203c.setFilters(new InputFilter[]{new LengthFilter(i)});
        this.f16203c.addTextChangedListener(this);
    }

    private final void m16026a(int i) {
        this.f16204d.setText(getResources().getString(C7582R.string.character_count_format, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f16201a)}));
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m16026a(charSequence.length());
        if (this.f16202b != null && charSequence.length() >= this.f16201a) {
            this.f16202b.X_();
        }
    }

    public void afterTextChanged(Editable editable) {
    }

    public EditText getEditText() {
        return this.f16203c;
    }
}

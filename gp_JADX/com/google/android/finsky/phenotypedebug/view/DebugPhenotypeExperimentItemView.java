package com.google.android.finsky.phenotypedebug.view;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.ae;
import com.squareup.leakcanary.C7582R;

public class DebugPhenotypeExperimentItemView extends LinearLayout implements ae {
    public String f19313a;
    public String f19314b;
    public String f19315c;
    public TextView f19316d;
    public TextView f19317e;
    public EditText f19318f;
    public TextWatcher f19319g;

    public DebugPhenotypeExperimentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DebugPhenotypeExperimentItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19316d = (TextView) findViewById(C7582R.id.phenotype_experiment_flag_name);
        this.f19317e = (TextView) findViewById(C7582R.id.phenotype_experiment_flag_details);
        this.f19318f = (EditText) findViewById(C7582R.id.phenotype_experiment_flag_edit_value);
    }

    public final void Z_() {
        setOnClickListener(null);
        this.f19318f.removeTextChangedListener(this.f19319g);
        this.f19319g = null;
    }

    public final void m18389a(String str) {
        CharSequence charSequence = this.f19314b;
        if (str != null) {
            String valueOf = String.valueOf(charSequence);
            charSequence = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()).append(valueOf).append(": ").append(str).toString();
        }
        this.f19317e.setText(charSequence);
    }
}

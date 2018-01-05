package com.google.android.finsky.phenotypedebug.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

public final class C3890a implements OnClickListener {
    public final /* synthetic */ DebugPhenotypeExperimentItemView f19320a;

    public C3890a(DebugPhenotypeExperimentItemView debugPhenotypeExperimentItemView) {
        this.f19320a = debugPhenotypeExperimentItemView;
    }

    public final void onClick(View view) {
        if (this.f19320a.f19318f.getVisibility() == 8) {
            this.f19320a.f19318f.setVisibility(0);
            this.f19320a.f19318f.setSelection(this.f19320a.f19318f.getText().length());
            this.f19320a.f19318f.requestFocus();
            ((InputMethodManager) this.f19320a.getContext().getSystemService("input_method")).showSoftInput(this.f19320a.f19318f, 0);
            this.f19320a.m18389a(null);
            return;
        }
        this.f19320a.f19315c = this.f19320a.f19318f.getText().toString();
        this.f19320a.f19318f.setVisibility(8);
        ((InputMethodManager) this.f19320a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f19320a.f19318f.getWindowToken(), 0);
        this.f19320a.m18389a(this.f19320a.f19315c);
    }
}

package com.google.android.finsky.phenotypedebug.view;

import android.text.Editable;
import android.text.TextWatcher;

public final class C3891b implements TextWatcher {
    public final /* synthetic */ C3883c f19321a;
    public final /* synthetic */ DebugPhenotypeExperimentItemView f19322b;

    public C3891b(DebugPhenotypeExperimentItemView debugPhenotypeExperimentItemView, C3883c c3883c) {
        this.f19322b = debugPhenotypeExperimentItemView;
        this.f19321a = c3883c;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f19321a.mo3833a(this.f19322b.f19313a, String.valueOf(charSequence));
    }

    public final void afterTextChanged(Editable editable) {
    }
}

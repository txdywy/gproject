package com.google.android.wallet.ui.common;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

final class aw implements C6755v {
    public FormSpinner f33539a;

    aw(FormSpinner formSpinner) {
        this.f33539a = formSpinner;
    }

    public final void setError(CharSequence charSequence) {
        View selectedView = this.f33539a.getSelectedView();
        if (selectedView instanceof TextView) {
            ((TextView) selectedView).setError(charSequence);
            return;
        }
        this.f33539a.f33382D = charSequence;
        String valueOf = String.valueOf(selectedView);
        Log.w("FormSpinner", new StringBuilder(String.valueOf(valueOf).length() + 26).append("Cannot set error on view: ").append(valueOf).toString());
    }

    public final CharSequence getError() {
        View selectedView = this.f33539a.getSelectedView();
        if (selectedView instanceof TextView) {
            return ((TextView) selectedView).getError();
        }
        return this.f33539a.f33382D;
    }
}

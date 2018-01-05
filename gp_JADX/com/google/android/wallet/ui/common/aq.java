package com.google.android.wallet.ui.common;

import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.wallet.common.util.C6589a;

final class aq extends InputConnectionWrapper {
    public final /* synthetic */ FormEditText f33538a;

    public aq(FormEditText formEditText, InputConnection inputConnection) {
        this.f33538a = formEditText;
        super(inputConnection, true);
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        this.f33538a.f33233R = this.f33538a.getError();
        boolean commitText = super.commitText(charSequence, i);
        if (this.f33538a.f33233R != null) {
            this.f33538a.setError(this.f33538a.f33233R);
        }
        return commitText;
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        if (this.f33538a.f33231P && i == 1 && i2 == 0 && this.f33538a.getValueLength() == 0 && (!C6589a.m29897a(this.f33538a.getContext()) || this.f33538a.f33221F.cQ_())) {
            View focusSearch = this.f33538a.focusSearch(1);
            if (focusSearch != null) {
                focusSearch.requestFocus();
            }
        }
        return super.deleteSurroundingText(i, i2);
    }
}

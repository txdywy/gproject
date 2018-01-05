package com.google.android.wallet.ui.common.p404b;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.wallet.ui.common.C6735n;
import com.google.android.wallet.ui.common.aa;
import com.google.android.wallet.ui.common.bo;
import com.google.android.wallet.ui.common.ci;
import java.util.ArrayList;
import java.util.List;

public final class C6762a implements TextWatcher, Runnable {
    public final EditText f33540a;
    public final C6735n f33541b;
    public final aa f33542c;
    public final List f33543d = new ArrayList();
    public bo f33544e;
    public boolean f33545f;

    public C6762a(EditText editText, C6735n c6735n, aa aaVar) {
        this.f33540a = editText;
        this.f33541b = c6735n;
        this.f33542c = aaVar;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f33545f = i3 == 0;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f33540a.isFocused() && !this.f33545f && this.f33541b.mo5623b() && this.f33542c.cQ_()) {
            int size = this.f33543d.size();
            for (int i = 0; i < size; i++) {
                ((bo) this.f33543d.get(i)).mo5563a(this.f33540a);
            }
            if (this.f33544e == null) {
                this.f33540a.post(this);
            }
        }
    }

    public final void run() {
        ci.m30891f(this.f33540a);
    }

    public final void m30735a(bo boVar, boolean z) {
        this.f33543d.add(boVar);
        if (!z) {
            return;
        }
        if (this.f33544e != null) {
            throw new IllegalStateException("Only one OnAutoAdvanceListener may override the default behaviour.");
        }
        this.f33544e = boVar;
    }
}

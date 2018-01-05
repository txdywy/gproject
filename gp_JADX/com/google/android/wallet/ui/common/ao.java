package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Iterator;

final class ao implements TextWatcher {
    public boolean f33533a;
    public CharSequence f33534b;
    public final /* synthetic */ FormEditText f33535c;

    ao(FormEditText formEditText) {
        this.f33535c = formEditText;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Iterator it;
        FormEditText formEditText = this.f33535c;
        int i4 = formEditText.aj;
        formEditText.aj = i4 + 1;
        if (i4 == 0) {
            this.f33534b = this.f33535c.getError();
        }
        boolean z = (i2 == 0 && i3 == 0) ? false : true;
        this.f33533a = z;
        if (this.f33533a && this.f33535c.f33239v != null) {
            this.f33535c.f33239v.beforeTextChanged(charSequence, i, i2, i3);
        }
        if (this.f33535c.f33222G) {
            if (!this.f33535c.aA && this.f33535c.aB && this.f33533a && !this.f33535c.isPerformingCompletion()) {
                this.f33535c.aA = true;
            }
            it = this.f33535c.f33240w.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }
        it = this.f33535c.m30522f().iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
        }
        if (this.f33535c.f33217B != null) {
            this.f33535c.f33217B.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Iterator it;
        if (this.f33533a && this.f33535c.f33239v != null) {
            this.f33535c.f33239v.onTextChanged(charSequence, i, i2, i3);
        }
        if (this.f33535c.f33222G) {
            it = this.f33535c.f33240w.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
            }
        }
        it = this.f33535c.m30522f().iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
        }
        if (this.f33535c.f33217B != null) {
            this.f33535c.f33217B.onTextChanged(charSequence, i, i2, i3);
        }
    }

    public final void afterTextChanged(Editable editable) {
        Iterator it;
        if (this.f33533a && this.f33535c.f33239v != null) {
            this.f33535c.f33239v.afterTextChanged(editable);
        }
        if (this.f33535c.f33222G) {
            it = this.f33535c.f33240w.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }
        it = this.f33535c.m30522f().iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).afterTextChanged(editable);
        }
        if (this.f33535c.f33217B != null) {
            this.f33535c.f33217B.afterTextChanged(editable);
        }
        FormEditText formEditText = this.f33535c;
        formEditText.aj--;
        if (this.f33535c.aj == 0) {
            CharSequence error = this.f33535c.getError();
            if (error != null && !TextUtils.equals(error, this.f33534b)) {
                this.f33535c.m30523g();
                this.f33535c.m30526j();
            }
        }
    }
}

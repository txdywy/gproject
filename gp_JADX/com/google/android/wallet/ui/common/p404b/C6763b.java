package com.google.android.wallet.ui.common.p404b;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.a.a.a.a.b.a.b.a.w;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6515e;
import com.google.android.wallet.ui.common.FormEditText;
import java.util.regex.Pattern;

public final class C6763b implements TextWatcher {
    public final EditText f33546a;
    public final C6515e f33547b;
    public final C6512i f33548c;
    public final Pattern f33549d;

    public C6763b(EditText editText, C6515e c6515e, C6512i c6512i) {
        this.f33546a = editText;
        this.f33547b = c6515e;
        this.f33548c = c6512i;
        w c = c6515e.f32578a.c();
        if (c.a != null) {
            this.f33549d = Pattern.compile(c.a.b);
        } else {
            this.f33549d = null;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f33549d == null) {
            this.f33548c.mo5460a(this.f33547b);
            return;
        }
        if (this.f33546a instanceof FormEditText) {
            editable = ((FormEditText) this.f33546a).getValue();
        }
        if (this.f33549d.matcher(editable).matches()) {
            this.f33548c.mo5460a(this.f33547b);
        }
    }
}

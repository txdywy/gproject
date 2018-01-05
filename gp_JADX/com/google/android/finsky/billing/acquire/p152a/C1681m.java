package com.google.android.finsky.billing.acquire.p152a;

import android.widget.EditText;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.billing.p153c.C1680g;

final class C1681m implements C1680g {
    public final /* synthetic */ EditText f8709a;

    C1681m(EditText editText) {
        this.f8709a = editText;
    }

    public final String mo2384a() {
        return this.f8709a.getText().toString();
    }

    public final void mo2385a(String str) {
        C1618s.m9294a(this.f8709a.getContext(), this.f8709a);
        if (str != null) {
            this.f8709a.setText(str);
            this.f8709a.setSelection(str.length());
        }
    }

    public final void mo2386b() {
        C1618s.m9293a(this.f8709a.getContext(), this.f8709a);
    }
}

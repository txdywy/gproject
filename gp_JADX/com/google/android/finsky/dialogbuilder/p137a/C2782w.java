package com.google.android.finsky.dialogbuilder.p137a;

import android.widget.EditText;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.dialogbuilder.p154b.C2781i;

final class C2782w implements C2781i {
    public final /* synthetic */ EditText f15070a;
    public final /* synthetic */ C2779u f15071b;

    C2782w(C2779u c2779u, EditText editText) {
        this.f15071b = c2779u;
        this.f15070a = editText;
    }

    public final void mo3134a() {
        if (this.f15071b.f15065b.e) {
            C1618s.m9294a(this.f15070a.getContext(), this.f15070a);
        }
    }

    public final void mo3136b() {
        C1618s.m9293a(this.f15070a.getContext(), this.f15070a);
    }

    public final void mo3135a(String str) {
        if (str != null) {
            this.f15070a.setText(str);
        }
    }
}

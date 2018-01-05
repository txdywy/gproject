package com.google.android.wallet.ui.p395g;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.c.b.a.ah;
import com.google.android.wallet.ui.common.p402c.C6739a;

public final class C6819b extends C6739a {
    public final /* synthetic */ C6672a f33800a;

    public C6819b(C6672a c6672a) {
        this.f33800a = c6672a;
        super("");
    }

    protected final boolean mo5632a(TextView textView) {
        return !this.f33800a.f32947i || TextUtils.isEmpty(mo5631a());
    }

    public final CharSequence mo5631a() {
        CharSequence charSequence;
        this.f33800a.ao();
        switch (this.f33800a.ag) {
            case 1:
                charSequence = ((ah) this.f33800a.aD).j.a;
                break;
            case 2:
                charSequence = ((ah) this.f33800a.aD).j.b;
                break;
            case 3:
                charSequence = ((ah) this.f33800a.aD).j.c;
                break;
            default:
                charSequence = "";
                break;
        }
        this.i = charSequence;
        return this.i;
    }
}

package com.google.android.finsky.billing.myaccount;

import android.widget.Button;
import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.bc;

final class aw implements C0660x {
    public final /* synthetic */ Button f10228a;
    public final /* synthetic */ String f10229b;
    public final /* synthetic */ C0660x f10230c;

    aw(Button button, String str, C0660x c0660x) {
        this.f10228a = button;
        this.f10229b = str;
        this.f10230c = c0660x;
    }

    public final /* synthetic */ void b_(Object obj) {
        bc bcVar = (bc) obj;
        this.f10228a.setEnabled(true);
        this.f10228a.setText(this.f10229b);
        this.f10230c.b_(bcVar);
    }
}

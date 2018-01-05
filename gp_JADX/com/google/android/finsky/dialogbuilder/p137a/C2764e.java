package com.google.android.finsky.dialogbuilder.p137a;

import android.text.TextUtils;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.finsky.dialogbuilder.C2797e;

final class C2764e implements OnCheckedChangeListener {
    public final C2797e f15032a;
    public final /* synthetic */ C2763d f15033b;

    C2764e(C2763d c2763d, C2797e c2797e) {
        this.f15033b = c2763d;
        this.f15032a = c2797e;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str = this.f15033b.f15029b.e;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                this.f15033b.f15031d.m14870a(str, Boolean.toString(true));
            } else if (this.f15033b.f15029b.f) {
                this.f15033b.f15031d.m14869a(str);
            } else {
                this.f15033b.f15031d.m14870a(str, Boolean.toString(false));
            }
        }
        this.f15033b.f15030c.m14881a(this.f15033b.f15029b.g, this.f15033b.f15029b.h);
        if (this.f15033b.f15029b.d != null) {
            this.f15032a.mo3138a(this.f15033b.f15029b.d);
        }
    }
}

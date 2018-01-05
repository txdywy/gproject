package com.google.android.finsky.dialogbuilder.p154b;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class C2791f {
    public final List f15089a = new ArrayList();
    public final Bundle f15090b;
    public C2760g f15091c;

    public C2791f(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("DialogPrimaryActionEnabledModel.tags")) {
            this.f15090b = new Bundle();
        } else {
            this.f15090b = bundle.getBundle("DialogPrimaryActionEnabledModel.tags");
        }
    }

    public final void m14868a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f15090b.putBoolean(str, z);
            m14867a();
        }
    }

    public final void m14867a() {
        if (this.f15091c != null) {
            boolean z;
            for (String str : this.f15089a) {
                if (!this.f15090b.getBoolean(str)) {
                    z = false;
                    break;
                }
            }
            z = true;
            this.f15091c.mo3131a(z);
        }
    }
}

package com.google.firebase.iid;

import android.content.Intent;
import android.os.ConditionVariable;

final class C7131c implements C7130d {
    public final ConditionVariable f34859a = new ConditionVariable();
    public Intent f34860b;
    public String f34861c;

    C7131c() {
    }

    public final void mo6020a(Intent intent) {
        this.f34860b = intent;
        this.f34859a.open();
    }

    public final void mo6021a(String str) {
        this.f34861c = str;
        this.f34859a.open();
    }
}

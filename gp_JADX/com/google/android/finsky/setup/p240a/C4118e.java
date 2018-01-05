package com.google.android.finsky.setup.p240a;

import android.os.Bundle;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.C0757i;

public final class C4118e implements C2918a {
    public final C2918a f20731a;
    public final String f20732b;

    public C4118e(String str, C4121h c4121h) {
        this.f20732b = str;
        this.f20731a = c4121h;
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        C0757i c0757i = (cv) obj;
        if (c0757i == null) {
            return null;
        }
        Bundle bundle = (Bundle) this.f20731a.mo3197a(c0757i);
        if (bundle == null) {
            return null;
        }
        bundle.putInt("doc_type", 3);
        bundle.putString("authAccount", this.f20732b);
        bundle.putBoolean("is_required", false);
        bundle.putBoolean("is_default", true);
        bundle.putInt("priority", 3);
        bundle.putInt("network_type", 0);
        bundle.putBoolean("is_visible", true);
        bundle.putByteArray("doc", C0757i.m4909a(c0757i));
        return bundle;
    }
}

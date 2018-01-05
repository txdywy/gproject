package com.google.android.wallet.common.p376a;

import android.content.Context;
import com.google.android.wallet.a.a;
import java.util.List;

public final class C6561n extends C6558m {
    public final List f32677a;

    public C6561n(Context context, List list) {
        super("LocalAddressSource", context);
        this.f32677a = list;
    }

    protected final List mo5514c() {
        return this.f32677a;
    }

    protected final int mo5513b() {
        return ((Integer) a.g.a()).intValue();
    }

    protected final boolean mo5515d() {
        return false;
    }
}

package com.google.android.wallet.ui.p393e;

import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import java.util.List;

final class C6804b implements C6504m {
    public final /* synthetic */ C6506n f33738a;
    public final /* synthetic */ int f33739b;
    public final /* synthetic */ C6670a f33740c;

    C6804b(C6670a c6670a, C6506n c6506n, int i) {
        this.f33740c = c6670a;
        this.f33738a = c6506n;
        this.f33739b = i;
    }

    public final C6504m getParentUiNode() {
        return this.f33740c;
    }

    public final void setParentUiNode(C6504m c6504m) {
        throw new UnsupportedOperationException("Custom parents not supported for SimpleForm subforms.");
    }

    public final C6506n getUiElement() {
        return this.f33738a;
    }

    public final List getChildren() {
        return (List) this.f33740c.f32935f.get(this.f33739b);
    }
}

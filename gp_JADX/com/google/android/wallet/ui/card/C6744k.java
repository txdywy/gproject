package com.google.android.wallet.ui.card;

import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import java.util.ArrayList;
import java.util.List;

final class C6744k implements C6504m {
    public final List f33275a = new ArrayList();
    public final /* synthetic */ C6506n f33276b;
    public final /* synthetic */ C6652j f33277c;

    C6744k(C6652j c6652j, C6506n c6506n) {
        this.f33277c = c6652j;
        this.f33276b = c6506n;
    }

    public final C6504m getParentUiNode() {
        return this.f33277c.getParentUiNode();
    }

    public final void setParentUiNode(C6504m c6504m) {
        throw new UnsupportedOperationException("Custom parents not supported for CardForm subforms.");
    }

    public final C6506n getUiElement() {
        return this.f33276b;
    }

    public final List getChildren() {
        return this.f33275a;
    }
}

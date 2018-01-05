package com.google.android.finsky.contentfilterui;

import android.os.Bundle;
import android.view.View;

public final class com.google.android.finsky.contentfilterui.l implements View$OnClickListener
{

    public final int a;
    public final com.google.android.finsky.contentfilterui.j b;

    l(com.google.android.finsky.contentfilterui.j p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        if (!this.b.ah.b()) {
            v0 = new Bundle();
            v0.putInt("authSuccess", 3);
            v0.putInt("filterRangeIndex", this.a);
            this.b.a(v0, 0);
        }
        else
            this.b.b(this.a);
    }

}

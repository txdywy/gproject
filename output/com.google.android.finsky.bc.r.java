package com.google.android.finsky.bc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.bc.r extends com.google.android.finsky.bc.p implements View$OnClickListener
{

    public String a;

    r() {
        com.google.android.finsky.bc.p();
    }

    protected final int Z() {
        return 2130968846;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v1 = super.a(p0, p1, p2);
        ((TextView)v1.findViewById(2131755736)).setText(this.a);
        v1.findViewById(2131755791).setOnClickListener(this);
        ((TextView)v1.findViewById(2131755792)).setText(17039370);
        return v1;
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return 0;
    }

    public final void onClick(View p0) {
        this.ag.d().a();
    }

}

package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.activities.dd implements View$OnClickListener
{

    public final com.google.android.finsky.activities.dc a;

    dd(com.google.android.finsky.activities.dc p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        if (this.a.D.c(4) != 0)
            this.a.z.a(this.a.D, 0, 4);
        else if (this.a.D.c(0) != 0)
            this.a.z.a(this.a.D, 0, 0);
    }

}

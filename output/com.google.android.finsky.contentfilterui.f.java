package com.google.android.finsky.contentfilterui;

import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.widget.Toast;
import com.google.android.finsky.pagesystem.b;

public final class com.google.android.finsky.contentfilterui.f implements Runnable
{

    public final com.google.android.finsky.contentfilterui.e a;

    f(com.google.android.finsky.contentfilterui.e p0) {
        this.a = p0;
    }

    public final void run() {
        if (this.a.k()) {
            Toast.makeText(this.a.g(), 2131953134, 0).show();
            if (this.a.at())
                this.a.B.d();
            else
                this.a.O_();
        }
    }

}

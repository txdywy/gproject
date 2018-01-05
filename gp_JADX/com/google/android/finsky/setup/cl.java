package com.google.android.finsky.setup;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

final class cl implements OnClickListener {
    public final /* synthetic */ Activity f20928a;

    cl(Activity activity) {
        this.f20928a = activity;
    }

    public final void onClick(View view) {
        this.f20928a.setResult(0);
        this.f20928a.finish();
    }
}

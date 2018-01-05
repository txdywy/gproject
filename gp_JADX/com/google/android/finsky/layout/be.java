package com.google.android.finsky.layout;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;

final class be implements OnClickListener {
    public final /* synthetic */ String f18516a;

    be(String str) {
        this.f18516a = str;
    }

    public final void onClick(View view) {
        view.getContext().startActivity(C1473m.f7980a.bn().mo2689a(Uri.parse(this.f18516a)));
    }
}

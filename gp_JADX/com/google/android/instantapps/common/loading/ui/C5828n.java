package com.google.android.instantapps.common.loading.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.instantapps.common.loading.C5806c;

final class C5828n implements OnClickListener {
    public final /* synthetic */ C5822h f29296a;

    C5828n(C5822h c5822h) {
        this.f29296a = c5822h;
    }

    public final void onClick(View view) {
        this.f29296a.am.setVisibility(4);
        this.f29296a.ax = 3;
        this.f29296a.ad();
        if (this.f29296a.aB == 3) {
            this.f29296a.ae();
        } else {
            this.f29296a.af();
            this.f29296a.ab();
        }
        C5806c c5806c = this.f29296a.aT;
        throw new NoSuchMethodError();
    }
}

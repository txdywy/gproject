package com.google.android.libraries.social.licenses;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final /* synthetic */ class C6186e implements OnItemClickListener {
    public final C6185d f30724a;

    C6186e(C6185d c6185d) {
        this.f30724a = c6185d;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C6185d c6185d = this.f30724a;
        License license = (License) adapterView.getItemAtPosition(i);
        if (c6185d.f30723b != null) {
            c6185d.f30723b.mo5350a(license);
        }
    }
}

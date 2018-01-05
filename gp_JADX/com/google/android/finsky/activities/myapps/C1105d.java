package com.google.android.finsky.activities.myapps;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.squareup.leakcanary.C7582R;

final class C1105d implements OnClickListener {
    public final /* synthetic */ C3748a f7000a;
    public final /* synthetic */ String f7001b;
    public final /* synthetic */ DfeToc f7002c;
    public final /* synthetic */ C2495w f7003d;
    public final /* synthetic */ MyAppsEmptyView f7004e;

    C1105d(MyAppsEmptyView myAppsEmptyView, C3748a c3748a, String str, DfeToc dfeToc, C2495w c2495w) {
        this.f7004e = myAppsEmptyView;
        this.f7000a = c3748a;
        this.f7001b = str;
        this.f7002c = dfeToc;
        this.f7003d = c2495w;
    }

    public final void onClick(View view) {
        this.f7000a.mo3674a(this.f7001b, this.f7004e.getResources().getString(C7582R.string.games_corpus_title), 3, this.f7002c, this.f7003d);
    }
}

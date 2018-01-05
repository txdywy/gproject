package com.google.android.finsky.activities;

import android.content.Context;
import com.google.android.finsky.headerlistlayout.C1047f;
import com.squareup.leakcanary.C7582R;

final class gf extends C1047f {
    public final /* synthetic */ ge f6846a;

    gf(ge geVar, Context context) {
        this.f6846a = geVar;
        super(context);
    }

    protected final int mo1305a() {
        if (this.f6846a.ap) {
            return C7582R.layout.search_results_with_scrubber;
        }
        return C7582R.layout.search_results;
    }

    protected final int m6594b() {
        return C7582R.id.search_results_list;
    }

    protected final int m6595c() {
        return 2;
    }
}

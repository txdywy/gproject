package com.google.android.finsky.layout.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1611k;
import com.google.android.play.image.C1294w;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.ai;
import com.squareup.leakcanary.C7582R;

public final class C3671m extends ai {
    public C3671m(Context context) {
        super(context);
    }

    public final C1294w m17405a() {
        return C1473m.f7980a.be();
    }

    public final int m17407b() {
        return C7582R.layout.finsky_search;
    }

    public final int m17408c() {
        int b;
        Resources resources = this.a.getResources();
        C1552e dj = C1473m.f7980a.aN().dj();
        if (dj.mo2294a(12638742) && resources.getBoolean(C7582R.bool.use_fixed_width_pages)) {
            C1473m.f7980a.av();
            b = C1611k.m9269b(resources);
        } else if (dj.mo2294a(12632714)) {
            b = resources.getDimensionPixelSize(C7582R.dimen.searchbox_horizontal_margin);
        } else {
            b = C1473m.f7980a.av().m9275a(resources);
        }
        return b - resources.getDimensionPixelSize(C7582R.dimen.play_card_default_inset);
    }

    public final PlaySearch m17406a(ViewGroup viewGroup) {
        return (PlaySearch) LayoutInflater.from(this.a).inflate(C7582R.layout.finsky_search, viewGroup, false);
    }
}

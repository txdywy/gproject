package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;

final class en implements OnClickListener {
    public final /* synthetic */ boolean f14488a;
    public final /* synthetic */ String f14489b;
    public final /* synthetic */ SongListModuleLayout f14490c;

    en(SongListModuleLayout songListModuleLayout, boolean z, String str) {
        this.f14490c = songListModuleLayout;
        this.f14488a = z;
        this.f14489b = str;
    }

    public final void onClick(View view) {
        if (this.f14488a && C1473m.f7980a.mo2246h(this.f14489b).m22586a()) {
            view.getContext().startActivity(C1473m.f7980a.bo().mo2743a(view.getContext(), this.f14489b, 2, null, this.f14490c.f14058a.m13184a(null)));
            return;
        }
        this.f14490c.f14063f.onClick(view);
    }
}

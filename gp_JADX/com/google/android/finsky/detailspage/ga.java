package com.google.android.finsky.detailspage;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.play.layout.g;
import com.squareup.leakcanary.C7582R;

final class ga implements OnClickListener {
    public final /* synthetic */ boolean f14613a;
    public final /* synthetic */ TestingProgramReviewModuleLayout f14614b;

    ga(TestingProgramReviewModuleLayout testingProgramReviewModuleLayout, boolean z) {
        this.f14614b = testingProgramReviewModuleLayout;
        this.f14613a = z;
    }

    public final void onClick(View view) {
        g gVar = new g(this.f14614b.getContext(), this.f14614b.f14106o);
        Resources resources = this.f14614b.getContext().getResources();
        this.f14614b.f14095d.m13368a(new C2475d(this.f14614b.f14094c).m13256a(238));
        if (!this.f14613a) {
            gVar.a(1, resources.getString(C7582R.string.edit_review), true, this.f14614b);
        }
        gVar.a(2, resources.getString(C7582R.string.delete_review), true, this.f14614b);
        this.f14614b.f14106o.setImageResource(C7582R.drawable.play_overflow_menu_open);
        gVar.e = new gb(this);
        gVar.a();
    }
}

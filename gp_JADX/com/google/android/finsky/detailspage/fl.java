package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.play.layout.g;
import com.squareup.leakcanary.C7582R;

final class fl implements OnClickListener {
    public final /* synthetic */ TestingProgramMyReviewModuleLayout f14581a;

    fl(TestingProgramMyReviewModuleLayout testingProgramMyReviewModuleLayout) {
        this.f14581a = testingProgramMyReviewModuleLayout;
    }

    public final void onClick(View view) {
        g gVar = new g(this.f14581a.getContext(), this.f14581a.f14089j);
        gVar.a(1, this.f14581a.getContext().getResources().getString(C7582R.string.delete_review), true, this.f14581a);
        this.f14581a.f14089j.setImageResource(C7582R.drawable.play_overflow_menu_open);
        gVar.e = new fm(this);
        gVar.a();
    }
}

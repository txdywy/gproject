package com.google.android.finsky.layout.structuredreviews;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.cv.p177a.kb;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

final class C3726j implements OnClickListener {
    public final /* synthetic */ kb f18843a;
    public final /* synthetic */ ReviewStructuredQuestion f18844b;

    C3726j(ReviewStructuredQuestion reviewStructuredQuestion, kb kbVar) {
        this.f18844b = reviewStructuredQuestion;
        this.f18843a = kbVar;
    }

    public final void onClick(View view) {
        this.f18844b.f18834e = this.f18843a.f12856c;
        for (int i = 0; i < this.f18844b.f18832c.getChildCount(); i++) {
            ViewGroup viewGroup = (ViewGroup) this.f18844b.f18832c.getChildAt(i);
            this.f18844b.m17604a(this.f18844b.m17603a((kb) viewGroup.getTag()), (FifeImageView) viewGroup.findViewById(C7582R.id.question_option_icon), this.f18843a.f12857d, false);
        }
        this.f18844b.f18835f.mo1473a(this.f18843a.f12856c);
        this.f18844b.m17593a();
    }
}

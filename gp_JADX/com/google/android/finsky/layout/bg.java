package com.google.android.finsky.layout;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.layout.g;
import com.squareup.leakcanary.C7582R;

final class bg implements OnClickListener {
    public final /* synthetic */ C2495w f18518a;
    public final /* synthetic */ boolean f18519b;
    public final /* synthetic */ boolean f18520c;
    public final /* synthetic */ boolean f18521d;
    public final /* synthetic */ ReviewItemLayout f18522e;

    bg(ReviewItemLayout reviewItemLayout, C2495w c2495w, boolean z, boolean z2, boolean z3) {
        this.f18522e = reviewItemLayout;
        this.f18518a = c2495w;
        this.f18519b = z;
        this.f18520c = z2;
        this.f18521d = z3;
    }

    public final void onClick(View view) {
        int i;
        g gVar = new g(this.f18522e.getContext(), this.f18522e.f18318p);
        Resources resources = this.f18522e.getContext().getResources();
        this.f18518a.m13368a(new C2475d(this.f18522e.f18321s).m13256a(238));
        C1473m.f7980a.dj();
        if (this.f18519b) {
            i = C7582R.string.review_feedback_choice_unhelpful_undo;
        } else {
            i = C7582R.string.review_feedback_dialog_choice_unhelpful;
        }
        gVar.a(2, resources.getString(i), true, this.f18522e);
        if (this.f18520c) {
            i = C7582R.string.review_feedback_choice_inappropriate_undo;
        } else {
            i = C7582R.string.review_feedback_choice_inappropriate;
        }
        gVar.a(3, resources.getString(i), true, this.f18522e);
        if (this.f18521d) {
            i = C7582R.string.review_feedback_dialog_choice_spam_undo;
        } else {
            i = C7582R.string.review_feedback_dialog_choice_spam;
        }
        gVar.a(1, resources.getString(i), true, this.f18522e);
        this.f18522e.f18318p.setImageResource(C7582R.drawable.play_overflow_menu_open);
        gVar.e = new bh(this);
        gVar.a();
    }
}

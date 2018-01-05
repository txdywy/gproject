package com.google.android.finsky.detailspage;

import android.view.inputmethod.InputMethodManager;
import com.google.android.finsky.frameworkviews.C1056b;

final class fx implements C1056b {
    public InputMethodManager f14607a = ((InputMethodManager) this.f14609c.getContext().getSystemService("input_method"));
    public final /* synthetic */ String f14608b;
    public final /* synthetic */ TestingProgramReviewModuleLayout f14609c;

    fx(TestingProgramReviewModuleLayout testingProgramReviewModuleLayout, String str) {
        this.f14609c = testingProgramReviewModuleLayout;
        this.f14608b = str;
    }

    public final void u_() {
        this.f14609c.f14108q.setCommentViewFocusable(false);
        this.f14609c.f14108q.clearFocus();
        this.f14607a.hideSoftInputFromWindow(this.f14609c.getWindowToken(), 0);
        if (this.f14609c.f14092a != null) {
            gd gdVar = this.f14609c.f14092a;
            this.f14609c.f14108q.getUserRating();
            gdVar.mo3094a(this.f14609c.f14108q.getUserComment());
        }
    }

    public final void v_() {
        this.f14609c.f14108q.setCommentViewFocusable(false);
        this.f14609c.f14108q.clearFocus();
        this.f14607a.hideSoftInputFromWindow(this.f14609c.getWindowToken(), 0);
        this.f14609c.f14108q.setUserComment(this.f14608b);
        if (this.f14609c.f14092a != null) {
            this.f14609c.f14092a.mo3097i();
        }
    }
}

package com.google.android.finsky.layout;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;

public final class az implements OnFocusChangeListener {
    public final /* synthetic */ RateReviewEditor2 f18506a;

    public az(RateReviewEditor2 rateReviewEditor2) {
        this.f18506a = rateReviewEditor2;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            if (this.f18506a.f18292j.getVisibility() == 0) {
                this.f18506a.e.setBackgroundDrawable(this.f18506a.f18293k);
                this.f18506a.f18292j.setVisibility(8);
                if (!TextUtils.isEmpty(this.f18506a.f18291i.getText())) {
                    this.f18506a.f18291i.setVisibility(0);
                }
            }
            ((InputMethodManager) this.f18506a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f18506a.e.getWindowToken(), 0);
        } else if (this.f18506a.f18292j.getVisibility() != 0) {
            this.f18506a.e.setBackgroundDrawable(this.f18506a.f18294l);
            this.f18506a.f18292j.setVisibility(0);
            this.f18506a.f18291i.setVisibility(8);
            this.f18506a.post(new ba(this));
        }
        if (this.f18506a.f18295m != null) {
            this.f18506a.f18295m.onFocusChange(view, z);
        }
    }
}

package com.google.android.finsky.billing.promptforfop;

import android.support.v4.app.Fragment;
import com.squareup.leakcanary.C7582R;

public class PromptForFopActivity extends C2071a implements C2072g {
    protected final int mo2616h() {
        return C7582R.layout.prompt_for_fop_activity;
    }

    protected final Fragment mo1274i() {
        return C2073b.m10870a(this.n, this.C, this.E);
    }

    protected final int mo2368f() {
        return 1001;
    }

    protected final void mo2615a(int i, int i2) {
        H_().mo284a().mo332b(C7582R.id.content_frame, C2076f.m10886a(this.n.name, getString(i), i2, this.E), "PromptForFopBaseActivity.fragment").mo334c();
    }

    protected final int mo2617j() {
        return 354;
    }

    protected final int mo2618k() {
        return 356;
    }

    protected final int mo2619l() {
        return 355;
    }

    public final void mo2620m() {
        setResult(-1);
        finish();
    }
}

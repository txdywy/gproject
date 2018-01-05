package com.google.android.finsky.billing.promptforfop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.billing.common.g;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.promptforfop.f extends com.google.android.finsky.billing.common.g implements View$OnClickListener
{

    f() {
        com.google.android.finsky.billing.common.g();
    }

    public static com.google.android.finsky.billing.promptforfop.f a(String p0, String p1, int p2, com.google.android.finsky.d.w p3) {
        v0 = new Bundle();
        v0.putString("authAccount", p0);
        v0.putString("PromptForFopMessageFragment.message", p1);
        v0.putInt("PromptForFopMessageFragment.playlog_ui_element_type", p2);
        p3.b(p0).a(v0);
        v1 = new com.google.android.finsky.billing.promptforfop.f();
        v1.f(v0);
        return v1;
    }

    protected final int W() {
        return this.q.getInt("PromptForFopMessageFragment.playlog_ui_element_type");
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v0 = (ViewGroup)p0.inflate(2130969312, p1, 0);
        ((TextView)v0.findViewById(2131755334)).setText(this.q.getString("PromptForFopMessageFragment.message"));
        ((PlayActionButtonV2)v0.findViewById(2131755405)).a(3, 2131951948, this);
        return v0;
    }

    public final void onClick(View p0) {
        if (this.h() instanceof com.google.android.finsky.billing.promptforfop.g) {
            this.a(1006);
            ((com.google.android.finsky.billing.promptforfop.g)this.h()).m();
        }
        else
            FinskyLog.e("Parent activity expected to implement Listener interface.", new Object[0]);
    }

}

package com.google.android.finsky.billing.promptforfop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.billing.common.C1792g;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C2076f extends C1792g implements OnClickListener {
    public static C2076f m10886a(String str, String str2, int i, C2495w c2495w) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("PromptForFopMessageFragment.message", str2);
        bundle.putInt("PromptForFopMessageFragment.playlog_ui_element_type", i);
        c2495w.m13380b(str).m13377a(bundle);
        Fragment c2076f = new C2076f();
        c2076f.m600f(bundle);
        return c2076f;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C7582R.layout.prompt_for_fop_message_fragment, viewGroup, false);
        ((TextView) viewGroup2.findViewById(C7582R.id.message)).setText(this.f760q.getString("PromptForFopMessageFragment.message"));
        ((PlayActionButtonV2) viewGroup2.findViewById(C7582R.id.positive_button)).m6000a(3, (int) C7582R.string.continue_text, (OnClickListener) this);
        return viewGroup2;
    }

    public final void onClick(View view) {
        if (m603h() instanceof C2072g) {
            m9758a(1006);
            ((C2072g) m603h()).mo2620m();
            return;
        }
        FinskyLog.m21669e("Parent activity expected to implement Listener interface.", new Object[0]);
    }

    protected final int mo968W() {
        return this.f760q.getInt("PromptForFopMessageFragment.playlog_ui_element_type");
    }
}

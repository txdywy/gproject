package com.google.android.finsky.contentfilterui;

import android.animation.Animator;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.play.animation.C2343d;
import com.squareup.leakcanary.C7582R;

final class C2344i extends C2343d {
    public final /* synthetic */ C2339e f11525a;

    C2344i(C2339e c2339e) {
        this.f11525a = c2339e;
    }

    public final void onAnimationEnd(Animator animator) {
        Fragment fragment = this.f11525a;
        if (fragment.m610k()) {
            fragment.f11520h = fragment.f11519f;
            int length = fragment.ag.e.length;
            for (int i = 0; i < length; i++) {
                View childAt = fragment.ai.getChildAt(i);
                CharSequence charSequence = fragment.ag.e[i].e;
                String valueOf;
                String c;
                if (i == 0) {
                    valueOf = String.valueOf(charSequence);
                    c = fragment.m592c((int) C7582R.string.content_filter_most_restrictive);
                    charSequence = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(c).length()).append(valueOf).append(" ").append(c).toString();
                } else if (i == length - 1) {
                    valueOf = String.valueOf(charSequence);
                    c = fragment.m592c((int) C7582R.string.content_filter_least_restrictive);
                    charSequence = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(c).length()).append(valueOf).append(" ").append(c).toString();
                }
                if (i == fragment.f11519f) {
                    childAt.setContentDescription(fragment.m605i().getString(C7582R.string.accessibility_event_tab_selected, new Object[]{charSequence}));
                } else {
                    childAt.setContentDescription(charSequence);
                }
            }
        }
    }

    public final void onAnimationCancel(Animator animator) {
        Fragment fragment = this.f11525a;
        if (fragment.m610k()) {
            fragment.f11520h = fragment.f11519f;
            int length = fragment.ag.e.length;
            for (int i = 0; i < length; i++) {
                View childAt = fragment.ai.getChildAt(i);
                CharSequence charSequence = fragment.ag.e[i].e;
                String valueOf;
                String c;
                if (i == 0) {
                    valueOf = String.valueOf(charSequence);
                    c = fragment.m592c((int) C7582R.string.content_filter_most_restrictive);
                    charSequence = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(c).length()).append(valueOf).append(" ").append(c).toString();
                } else if (i == length - 1) {
                    valueOf = String.valueOf(charSequence);
                    c = fragment.m592c((int) C7582R.string.content_filter_least_restrictive);
                    charSequence = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(c).length()).append(valueOf).append(" ").append(c).toString();
                }
                if (i == fragment.f11519f) {
                    childAt.setContentDescription(fragment.m605i().getString(C7582R.string.accessibility_event_tab_selected, new Object[]{charSequence}));
                } else {
                    childAt.setContentDescription(charSequence);
                }
            }
        }
    }
}

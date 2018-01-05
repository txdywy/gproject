package com.google.android.finsky.contentfilterui;

import android.animation.Animator;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.animation.d;
import com.google.wireless.android.finsky.dfe.nano.bh;
import com.google.wireless.android.finsky.dfe.nano.bi;

public final class com.google.android.finsky.contentfilterui.i extends com.google.android.play.animation.d
{

    public final com.google.android.finsky.contentfilterui.e a;

    i(com.google.android.finsky.contentfilterui.e p0) {
        this.a = p0;
        com.google.android.play.animation.d();
    }

    public final void onAnimationCancel(Animator p0) {
        if (this.a.k()) {
            this.a.h = this.a.f;
            v1 = 0;
            while (v1 < this.a.ag.e.length) {
                v5 = this.a.ai.getChildAt(v1);
                v0 = this.a.ag.e[v1].e;
                if (v1 == 0) {
                    v0 = String.valueOf(v0);
                    v6 = this.a.c(2131951937);
                    v0 = (String.valueOf(v0).length() + 1 + String.valueOf(v6).length()) + v0 + " " + v6;
                }
                else if (v1 == this.a.ag.e.length - 1) {
                    v0 = String.valueOf(v0);
                    v6 = this.a.c(2131951934);
                    v0 = (String.valueOf(v0).length() + 1 + String.valueOf(v6).length()) + v0 + " " + v6;
                }
                if (v1 == this.a.f) {
                    v8 = new Object[1];
                    v8[0] = v0;
                    v5.setContentDescription(this.a.i().getString(2131951652, v8));
                }
                else
                    v5.setContentDescription(v0);
                v1 = v1 + 1;
            }
        }
    }

    public final void onAnimationEnd(Animator p0) {
        if (this.a.k()) {
            this.a.h = this.a.f;
            v1 = 0;
            while (v1 < this.a.ag.e.length) {
                v5 = this.a.ai.getChildAt(v1);
                v0 = this.a.ag.e[v1].e;
                if (v1 == 0) {
                    v0 = String.valueOf(v0);
                    v6 = this.a.c(2131951937);
                    v0 = (String.valueOf(v0).length() + 1 + String.valueOf(v6).length()) + v0 + " " + v6;
                }
                else if (v1 == this.a.ag.e.length - 1) {
                    v0 = String.valueOf(v0);
                    v6 = this.a.c(2131951934);
                    v0 = (String.valueOf(v0).length() + 1 + String.valueOf(v6).length()) + v0 + " " + v6;
                }
                if (v1 == this.a.f) {
                    v8 = new Object[1];
                    v8[0] = v0;
                    v5.setContentDescription(this.a.i().getString(2131951652, v8));
                }
                else
                    v5.setContentDescription(v0);
                v1 = v1 + 1;
            }
        }
    }

}

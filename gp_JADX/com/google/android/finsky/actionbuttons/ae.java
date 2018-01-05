package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.Intent;
import android.support.v4.p028a.C0216d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ds.C2885b;
import com.google.android.finsky.frameworkviews.C3147s;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public final class ae extends C0996o implements OnClickListener {
    public final Document f6031f;
    public final C2885b f6032g;
    public final C1461c f6033h;
    public final Intent f6034i;
    public ag f6035j;

    ae(Context context, int i, C2495w c2495w, ad adVar, Document document, C2885b c2885b, C1461c c1461c, Intent intent) {
        super(context, i, c2495w, adVar);
        this.f6031f = document;
        this.f6032g = c2885b;
        this.f6033h = c1461c;
        this.f6034i = intent;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        CharSequence string;
        String string2;
        if (m5903d()) {
            string = this.a.getString(C7582R.string.instant_app_launch_button_content_description_play_now);
        } else {
            string = this.a.getString(C7582R.string.instant_app_launch_button_content_description_try_now);
        }
        playActionButtonV2.setContentDescription(string);
        int i = this.f6031f.f14885a.f12099f;
        if (m5903d()) {
            string2 = this.a.getString(C7582R.string.instant_app_launch_button_label_play_now);
        } else {
            string2 = this.a.getString(C7582R.string.instant_app_launch_button_label_try_now);
        }
        playActionButtonV2.mo2588a(i, string2, (OnClickListener) this);
        if (this.f6033h.dj().mo2294a(12637101)) {
            C1020p.m6006a(playActionButtonV2, C0216d.m1112a(this.a, (int) C7582R.drawable.ic_lightning_bolt_green_24dp));
        }
        if (this.f6032g.m15130c(this.f6031f.m14625N().f13171k)) {
            playActionButtonV2.setEnabled(false);
        } else if (!this.f6033h.dj().mo2294a(12637094)) {
            string2 = m5902a(this.f6033h.dj(), this.a);
            if (string2 != null) {
                playActionButtonV2.getViewTreeObserver().addOnGlobalLayoutListener(new af(this, playActionButtonV2, string2));
            }
        }
        m5893b();
    }

    private final boolean m5903d() {
        if (this.f6031f.m14671z().f12317i == 1 && this.f6033h.dj().mo2294a(12643764)) {
            return true;
        }
        return false;
    }

    public static String m5902a(C1552e c1552e, Context context) {
        if (c1552e.mo2294a(12637095)) {
            return context.getString(C7582R.string.instant_app_launch_button_tooltip_1);
        }
        if (c1552e.mo2294a(12637096)) {
            return context.getString(C7582R.string.instant_app_launch_button_tooltip_2);
        }
        if (c1552e.mo2294a(12637097)) {
            return context.getString(C7582R.string.instant_app_launch_button_tooltip_3);
        }
        if (c1552e.mo2294a(12637098)) {
            return context.getString(C7582R.string.instant_app_launch_button_tooltip_4);
        }
        if (c1552e.mo2294a(12637099)) {
            return context.getString(C7582R.string.instant_app_launch_button_tooltip_5);
        }
        if (c1552e.mo2294a(12637100)) {
            return context.getString(C7582R.string.instant_app_launch_button_tooltip_6);
        }
        return null;
    }

    public static C3147s m5901a(PlayActionButtonV2 playActionButtonV2, String str) {
        TextView textView = (TextView) LayoutInflater.from(playActionButtonV2.getContext()).inflate(C7582R.layout.instant_app_launch_button_tooltip_content, null);
        textView.setText(str);
        C3147s c3147s = new C3147s(textView, playActionButtonV2);
        c3147s.f16281d.f16286E = true;
        return c3147s;
    }

    public final int mo1200a() {
        return 2943;
    }

    public final void onClick(View view) {
        m5894c();
        if (this.f6034i != null && !this.a.getPackageManager().queryIntentActivities(this.f6034i, 131072).isEmpty()) {
            this.a.startActivity(this.f6034i);
        }
    }
}

package com.google.android.finsky.entertainment;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.agera.am;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.libraries.play.entertainment.p191c.C2981c;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.wireless.android.a.a.a.a.ce;

public final class C2982b extends C1045b implements am, C2981c {
    public ce f15665a = C2482j.m13283a(21);
    public boolean f15666c;

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        m15413a(this.f760q.getString("storyTitle"));
    }

    private final void m15413a(String str) {
        this.bm.mo1246z();
        this.bm.mo1243l().mo1259a();
        this.bm.mo1241c(str);
    }

    private final void m15414b(String str) {
        m603h().setIntent(m603h().getIntent().putExtra("storyId", str));
    }

    public final void g_() {
        String str;
        int i = -14273992;
        super.g_();
        Activity activity = (Activity) C6116b.m28100a(m603h());
        Bundle bundle = this.f760q;
        String string = bundle.getString("storyId");
        if (string == null) {
            string = Uri.parse(this.f760q.getString("storyUrl")).getQueryParameter("storyid");
            C6116b.m28100a((Object) string);
            str = string;
        } else {
            str = string;
        }
        int i2 = bundle.getInt("storyColor", -14273992);
        if (i2 != -1) {
            i = i2;
        }
        int i3 = this.f760q.getInt("fragmentState");
        new Object[1][0] = Integer.valueOf(i3);
        if (i3 == 0 || i3 == 4) {
            i2 = i3;
        } else if (((Boolean) PEFinskyStoryActivity.f15663r.i_()).booleanValue()) {
            boolean z;
            if (TextUtils.equals(this.f760q.getString("storyUrl"), this.bp.mo3683b()) && this.bp.mo3705g() == 22) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Intent intent = m603h().getIntent();
                if (i3 != 1 || TextUtils.equals(intent.getStringExtra("storyId"), str)) {
                    i2 = i3;
                } else {
                    m15413a(null);
                    i2 = 2;
                }
            } else {
                i2 = 2;
            }
        } else {
            i2 = 4;
        }
        PEFinskyStoryActivity.f15663r.mo1144a(this);
        this.f15666c = true;
        new Object[1][0] = Integer.valueOf(i2);
        switch (i2) {
            case 0:
                new Object[1][0] = str;
                m15414b(str);
                PEFinskyStoryActivity.m15410a(activity, this.bw, str, i);
                i2 = 1;
                break;
            case 1:
                m15414b(str);
                PEFinskyStoryActivity.m15412b(activity, this.bw, str, i);
                break;
            case 3:
                new Object[1][0] = str;
                m15414b(str);
                PEFinskyStoryActivity.m15412b(activity, this.bw, str, i);
                i2 = 1;
                break;
            case 4:
                aj();
                return;
        }
        m6253a("fragmentState", i2);
    }

    public final void h_() {
        super.h_();
        if (this.f15666c) {
            PEFinskyStoryActivity.f15663r.mo1145b(this);
            this.f15666c = false;
        }
    }

    public final void mo138d() {
        super.mo138d();
        m6253a("fragmentState", 3);
    }

    private final void aj() {
        Intent intent = m603h().getIntent();
        intent.removeExtra("storyId");
        m603h().setIntent(intent);
        if (this.n_.dj().mo2294a(12622982)) {
            this.bp.mo3695b(this.bw, false);
        } else {
            m603h().onBackPressed();
        }
    }

    protected final void aa() {
    }

    public final ce getPlayStoreUiElement() {
        return this.f15665a;
    }

    protected final void cg_() {
    }

    protected final int mo1298Z() {
        return 0;
    }

    public final void ad_() {
        if (!((Boolean) PEFinskyStoryActivity.f15663r.i_()).booleanValue()) {
            m6253a("fragmentState", 4);
            if (at()) {
                aj();
            }
        }
    }
}

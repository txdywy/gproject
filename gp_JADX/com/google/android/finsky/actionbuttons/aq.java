package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p011c.p012a.C0054l;
import android.view.View.OnClickListener;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.cw.C2458e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public final class aq extends C0996o {
    public final Document f6078f;
    public final C3748a f6079g;
    public final Account f6080h;
    public final String f6081i;
    public final C2454a f6082j;
    public final ad f6083k;
    public final C2206c f6084l;
    public final C2233o f6085m;
    public final C2457d f6086n;
    public final an f6087o;
    public int f6088p;

    aq(Context context, int i, Document document, String str, ad adVar, Account account, C3748a c3748a, C2454a c2454a, C2495w c2495w, ad adVar2, C2206c c2206c, C2233o c2233o, C2457d c2457d, an anVar, int i2) {
        super(context, i, c2495w, adVar);
        this.f6078f = document;
        this.f6079g = c3748a;
        this.f6080h = account;
        this.f6081i = str;
        this.f6082j = c2454a;
        this.f6083k = adVar2;
        this.f6084l = c2206c;
        this.f6085m = c2233o;
        this.f6086n = c2457d;
        this.f6087o = anVar;
        this.f6088p = i2;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        String string;
        OnClickListener a;
        int i = this.f6078f.f14885a.f12099f;
        Resources resources = this.a.getResources();
        if (this.f6082j == null) {
            string = resources.getString(C7582R.string.sample);
        } else {
            C2458e c2458e = new C2458e();
            if (this.a.getResources().getBoolean(C7582R.bool.use_wide_layout)) {
                this.f6086n.m13158b(this.f6082j, this.f6078f.f14885a.f12099f, this.f6088p, c2458e);
            } else {
                this.f6086n.m13155a(this.f6082j, this.f6078f.f14885a.f12099f, this.f6088p, c2458e);
            }
            string = c2458e.m13160a(this.a);
        }
        C2196e a2 = this.f6084l.mo2811a(this.f6080h);
        if (this.f6082j != null && C1013j.m5984a(this.f6082j)) {
            a = C1013j.m5982a(this.f6082j, this.f6078f.f14885a.f12099f, this.f6079g, this.f6081i, this.d, this.a, this.c);
        } else if (this.f6082j.f13230a == 21) {
            a = new ar(this);
        } else if (this.f6085m.m11648a(this.f6078f, a2, 2)) {
            a = this.f6079g.mo3626a(this.f6078f, this.f6080h, this.f6083k, this.c);
        } else {
            a = this.f6079g.mo3624a(this.f6080h, this.f6078f, 2, null, this.f6081i, 222, this.d, this.c);
        }
        playActionButtonV2.mo2588a(i, string, a);
        playActionButtonV2.setActionStyle(this.b);
        if (this.f6082j.f13230a == 21) {
            m5924a(this.a, playActionButtonV2, this.f6088p);
        }
        this.c.m13370a(new C2488p().m13345b(this.f6083k));
    }

    public final int mo1200a() {
        if (this.f6082j != null) {
            return C1013j.m5980a(this.f6082j, this.f6078f.f14885a.f12099f);
        }
        return 0;
    }

    public static void m5924a(Context context, PlayActionButtonV2 playActionButtonV2, int i) {
        int i2 = C7582R.drawable.ic_play_arrow_24dp;
        switch (i) {
            case 4:
            case 5:
                i2 = C7582R.drawable.ic_pause_24dp;
                break;
        }
        Drawable a = C0054l.m66a(context.getResources(), i2, null);
        if (a != null) {
            C1020p.m6006a(playActionButtonV2, a);
        }
    }
}

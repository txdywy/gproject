package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public final class ap extends C0996o implements OnClickListener {
    public final C3748a f6073f;
    public final Document f6074g;
    public final boolean f6075h;
    public final C0988c f6076i;
    public final C2162a f6077j;

    public ap(Context context, int i, C3748a c3748a, Document document, ad adVar, C2495w c2495w, boolean z, C0988c c0988c, C2162a c2162a) {
        super(context, i, c2495w, adVar);
        this.f6074g = document;
        this.f6073f = c3748a;
        this.f6075h = z;
        this.f6076i = c0988c;
        this.f6077j = c2162a;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        String string;
        int i = this.f6074g.f14885a.f12099f;
        if (this.f6075h) {
            string = this.a.getResources().getString(C1592a.f8477z.intValue());
        } else {
            string = this.a.getResources().getString(C7582R.string.all_access_button_subscribe);
        }
        playActionButtonV2.mo2588a(i, string, (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        if (this.f6075h) {
            m5893b();
        }
    }

    public final void onClick(View view) {
        m5894c();
        if (this.f6077j.mo2702a(this.a.getPackageManager())) {
            String str;
            C0955b.ea.m28964b();
            if (this.f6075h) {
                str = (String) C0955b.ec.m28964b();
            } else {
                str = this.f6077j.mo2692a();
            }
            this.a.startActivity(this.f6077j.mo2683a(2, str, this.f6076i.cY().name));
            return;
        }
        this.f6073f.mo3684b(2);
    }

    public final int mo1200a() {
        return 286;
    }
}

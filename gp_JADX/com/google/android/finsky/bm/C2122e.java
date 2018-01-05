package com.google.android.finsky.bm;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.ab;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.libraries.play.entertainment.story.MediaPlayerOverlayView;
import com.google.android.youtube.player.b;
import com.google.android.youtube.player.c;
import com.google.android.youtube.player.d;
import com.google.android.youtube.player.h;
import com.google.android.youtube.player.internal.ar;
import com.google.android.youtube.player.internal.t;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C2122e extends fe implements C2118b, C2121j {
    public final List f10751a = new ArrayList();
    public final Activity f10752b;
    public final MediaPlayerOverlayView f10753c;
    public final ViewGroup f10754d;
    public final int f10755e;
    public C2123g f10756f;
    public final C2126i f10757g;
    public final C2117a f10758h;
    public String f10759i;
    public long f10760j = 0;
    public C2120d f10761k;
    public C2495w f10762l;
    public byte[] f10763m;

    public C2122e(Activity activity, Resources resources, ab abVar, C1040f c1040f, ViewGroup viewGroup, C2495w c2495w, C2123g c2123g) {
        this.f10752b = activity;
        this.f10753c = c1040f.mo1257G();
        this.f10753c.f30339x.setElevation(0.0f);
        this.f10754d = viewGroup;
        this.f10755e = 54;
        this.f10762l = c2495w;
        this.f10756f = c2123g;
        this.f10757g = new C2126i(abVar, this);
        this.f10761k = new C2120d(this.f10757g, this.f10762l);
        this.f10758h = new C2117a(this, this.f10753c, resources.getDimensionPixelSize(C7582R.dimen.pe_mini_timebar_height));
    }

    public final void mo2649a(b bVar) {
        if (m11050e()) {
            Intent b;
            Dialog create;
            m11051f();
            Context context = this.f10752b;
            int i = this.f10755e;
            Builder builder = new Builder(context);
            switch (c.a[bVar.ordinal()]) {
                case 1:
                case 3:
                    b = ar.b(ar.a(context));
                    break;
                case 2:
                    b = ar.a(ar.a(context));
                    break;
                default:
                    b = null;
                    break;
            }
            OnClickListener dVar = new d(context, b, i);
            t tVar = new t(context);
            switch (c.a[bVar.ordinal()]) {
                case 1:
                    create = builder.setTitle(tVar.b).setMessage(tVar.c).setPositiveButton(tVar.d, dVar).create();
                    break;
                case 2:
                    create = builder.setTitle(tVar.e).setMessage(tVar.f).setPositiveButton(tVar.g, dVar).create();
                    break;
                case 3:
                    create = builder.setTitle(tVar.h).setMessage(tVar.i).setPositiveButton(tVar.j, dVar).create();
                    break;
                default:
                    String str = "Unexpected errorReason: ";
                    String valueOf = String.valueOf(bVar.name());
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            create.show();
        }
    }

    public final void mo2650a(String str) {
        if (TextUtils.equals(this.f10759i, str)) {
            this.f10761k.m11035a(1, this.f10760j, this.f10759i, this.f10763m);
            m11051f();
        }
    }

    public final void mo2652b() {
        if (m11050e()) {
            m11051f();
        }
    }

    public final void mo2653c() {
        C2123g c2123g = this.f10756f;
        if (!c2123g.f10764a) {
            c2123g.f10765b = C4678i.m21812a() ^ System.nanoTime();
            c2123g.f10764a = true;
        }
        long j = c2123g.f10765b + 1;
        c2123g.f10765b = j;
        if (j == 0) {
            c2123g.f10765b++;
        }
        this.f10760j = c2123g.f10765b;
        this.f10761k.m11036a(this.f10760j, this.f10759i, this.f10763m);
    }

    public final void mo2654d() {
        if (m11050e()) {
            this.f10761k.m11035a(7, this.f10760j, this.f10759i, this.f10763m);
            m11051f();
        }
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
        super.mo791a(recyclerView, i, i2);
        this.f10758h.m11031b();
    }

    public final void mo2648a() {
        this.f10753c.setVisibility(0);
        if (m11050e()) {
            h hVar = this.f10757g;
            String str = this.f10759i;
            if (hVar.f10770e == null) {
                hVar.f10770e = (C2124h) hVar.f10767b.mo281a(hVar.f10768c);
                if (hVar.f10770e != null) {
                    new Object[1][0] = Integer.valueOf(hVar.f10770e.hashCode());
                }
            }
            if (!(hVar.f10770e == null || str.equals(hVar.f10772g))) {
                hVar.m11066l();
            }
            if (hVar.f10770e == null) {
                hVar.f10770e = new C2124h();
                hVar.f10767b.mo284a().mo331b(hVar.f10768c, hVar.f10770e).mo334c();
            }
            Object[] objArr = new Object[]{str, Integer.valueOf(hVar.f10770e.hashCode())};
            hVar.f10772g = str;
            if (hVar.f10771f != null) {
                hVar.f10771f.a(hVar.f10772g);
            } else if (hVar.f10766a == -2) {
                hVar.m11063b(-1);
                hVar.f10770e.a("AIzaSyCpphGplamUhCCEIcum1VyDXBt0i1nOqac", hVar);
            }
            this.f10753c.f30306A.setTimeProvider(this.f10757g);
        }
    }

    public final void mo2651a(boolean z) {
        if (this.f10757g.m11061a()) {
            if (z) {
                this.f10761k.m11035a(3, this.f10760j, this.f10759i, this.f10763m);
            } else {
                this.f10761k.m11035a(4, this.f10760j, this.f10759i, this.f10763m);
            }
        }
        m11051f();
    }

    public final boolean m11050e() {
        return !TextUtils.isEmpty(this.f10759i);
    }

    public final void m11051f() {
        if (m11050e()) {
            this.f10759i = null;
            this.f10763m = null;
            this.f10760j = 0;
            C2126i c2126i = this.f10757g;
            if (c2126i.f10770e != null) {
                c2126i.m11066l();
            }
            this.f10753c.f30306A.setTimeProvider(null);
            this.f10753c.m28160a(false);
        }
        for (RecyclerView b : this.f10751a) {
            b.mo2952b((fe) this);
        }
        this.f10751a.clear();
        this.f10758h.m11030a();
    }
}

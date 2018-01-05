package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.ac;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.fj;
import com.google.android.finsky.cv.p177a.ky;
import com.google.android.finsky.cv.p177a.lq;
import com.google.android.finsky.detailscomponents.C2586l;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.controllers.view.PlayCardMoviesMdpClusterView;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.text.NumberFormat;

public final class br extends C4250b {
    public br(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.play_card_movies_mdp_cluster;
    }

    public final void mo1510a(View view, int i) {
        fj fjVar;
        Object obj;
        PlayCardMoviesMdpClusterView playCardMoviesMdpClusterView = (PlayCardMoviesMdpClusterView) view;
        Document document = this.g.f14908a;
        boolean z = (document.bg() != null ? document.bg().f12945x : null).f12365b;
        if (z) {
            playCardMoviesMdpClusterView.m13751a(document, this.f, this.e, this.k, this.i);
        } else {
            playCardMoviesMdpClusterView.f13949g.setVisibility(8);
            ai.m1823a(playCardMoviesMdpClusterView, 0, 0, 0, 0);
        }
        C3748a c3748a = this.f;
        ad adVar = this.h;
        Context context = this.e;
        C2495w c2495w = this.i;
        playCardMoviesMdpClusterView.m13752a(document.f14885a.f12087D, adVar);
        d dVar = playCardMoviesMdpClusterView.f23013a;
        ad parentOfChildren = playCardMoviesMdpClusterView.getParentOfChildren();
        Document a = document.m14641a(0);
        Object obj2 = (!z || dVar.f19473y) ? null : 1;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) dVar.U.getLayoutParams();
        if (obj2 != null) {
            marginLayoutParams.topMargin = dVar.f19470v;
        } else {
            Object obj3 = (dVar.f19473y || a.f14885a.f12098e != 6) ? null : 1;
            if (obj3 != null) {
                marginLayoutParams.topMargin = -dVar.f19465q;
            } else {
                marginLayoutParams.topMargin = dVar.f19464p;
            }
        }
        int i2 = obj2 != null ? dVar.f19469u : dVar.f19467s;
        int i3 = obj2 != null ? dVar.f19468t : dVar.f19466r;
        if (a.f14885a.f12098e == 6) {
            marginLayoutParams.width = i2;
        } else {
            marginLayoutParams.width = i3;
        }
        dVar.U.requestLayout();
        dVar.f19447D.m18516a(dVar, a, 0, document.f14885a.f12096c, c3748a, false, null, parentOfChildren, true, false, false, c2495w, null);
        ad adVar2 = (ad) dVar.getLoggingData();
        if (obj2 != null) {
            dVar.f19452d.setVisibility(8);
        } else {
            dVar.f19452d.setVisibility(0);
            HeroGraphicView heroGraphicView = dVar.f19452d;
            boolean z2 = dVar.f19473y;
            heroGraphicView.f13737q = z2;
            heroGraphicView.f13736p = z2;
            heroGraphicView.f13733m = false;
            heroGraphicView.f13732l = false;
            heroGraphicView.m13593a(a, false, adVar2);
        }
        if (dVar.f19463o != null) {
            if (obj2 == null || !C2586l.m13643b(a)) {
                dVar.f19463o.m13644a();
            } else {
                if (dVar.f19474z == null) {
                    dVar.f19474z = new C2473o(120, adVar2);
                }
                dVar.f19463o.m13645a(((bd) a.m14644c(3).get(0)).f11860f, a.f14885a.f12100g, C2586l.m13642a(a), a.f14885a.f12088E, a.f14885a.f12099f, dVar.f19474z, adVar2);
            }
        }
        CharSequence charSequence = null;
        switch (a.f14885a.f12098e) {
            case 6:
                lq S = a.m14630S();
                if (S != null) {
                    charSequence = S.f13040e;
                    break;
                }
                break;
            case 18:
            case 19:
            case 20:
                ac ar = a.ar();
                if (ar != null) {
                    charSequence = ar.f11756c;
                    break;
                }
                break;
        }
        if (TextUtils.isEmpty(charSequence)) {
            dVar.ac.setVisibility(8);
        } else {
            dVar.ac.setText(charSequence);
            dVar.ac.setVisibility(0);
        }
        dVar.U.setVisibility(0);
        dVar.U.a(a.f14885a.f12099f, false);
        LayoutParams layoutParams = dVar.U.getLayoutParams();
        layoutParams.height = (int) (((float) layoutParams.width) * dVar.am);
        if (!a.m14620I() || a.m14622K() <= 0) {
            dVar.f19457i.setVisibility(8);
        } else {
            long K = a.m14622K();
            dVar.f19453e.setText(NumberFormat.getIntegerInstance().format(K));
            dVar.f19453e.setContentDescription(context.getResources().getQuantityString(C7582R.plurals.content_description_review_histogram_review_count, (int) K, new Object[]{Long.valueOf(K)}));
            dVar.f19457i.setVisibility(0);
        }
        if (a.f14885a.f12115v != null) {
            fjVar = a.f14885a.f12115v.f13104K;
        } else {
            fjVar = null;
        }
        if (fjVar.f12367b == null) {
            dVar.f19455g.setVisibility(8);
        } else {
            dVar.f19455g.setVisibility(0);
            bd bdVar = fjVar.f12367b;
            dVar.f19446C.m9288a(dVar.f19450b, bdVar.f11860f, bdVar.f11863i);
            dVar.f19451c.setText(Long.toString(fjVar.f12368c));
            dVar.f19455g.setContentDescription(context.getString(C7582R.string.content_description_rotten_tomatoes_rating, new Object[]{Long.valueOf(r8)}));
        }
        if (a.f14885a.f12098e == 20) {
            ky T = a.m14631T();
            if (T != null) {
                dVar.ac.setText(context.getString(C7582R.string.season_with_episode, new Object[]{fjVar.f12371f, Integer.valueOf(T.f12978c)}));
                dVar.ac.setVisibility(0);
                dVar.f19458j.setText(T.f12979d);
                dVar.f19458j.setVisibility(0);
                if (a.f14885a.f12098e == 18 && !a.m14668w()) {
                    if (((fjVar.f12366a & 4) == 0 ? 1 : null) == null) {
                        dVar.ab.setText(fjVar.f12370e);
                        dVar.ab.setVisibility(0);
                    } else {
                        dVar.ab.setVisibility(8);
                    }
                }
                if (a.f14885a.f12098e == 19 || !a.m14668w()) {
                    dVar.f19460l.setVisibility(8);
                } else {
                    dVar.f19460l.setText(com.google.android.finsky.playcard.ac.m18475a(a));
                    dVar.f19460l.setVisibility(0);
                }
                dVar.f19456h = dVar.f19445B.m5977a(c3748a.mo3709k(), c3748a.mo3711m(), c3748a, context, null, adVar2, 4, null, -1, null, false, false, false);
                dVar.f19456h.m5959a(a, null, c3748a.mo3710l(), dVar.f19454f);
                obj = (obj2 == null && a.f14885a.f12098e == 6) ? 1 : null;
                marginLayoutParams = (MarginLayoutParams) dVar.ac.getLayoutParams();
                if (obj == null) {
                    dVar.f19461m.setOrientation(0);
                    marginLayoutParams.topMargin = 0;
                } else {
                    dVar.f19461m.setOrientation(1);
                    marginLayoutParams.topMargin = dVar.f19472x;
                }
                if (obj == null || dVar.f19473y) {
                    dVar.ai.setVisibility(0);
                } else {
                    dVar.ai.setVisibility(8);
                }
                marginLayoutParams = (MarginLayoutParams) dVar.f19462n.getLayoutParams();
                if (obj2 == null || dVar.f19473y) {
                    marginLayoutParams.topMargin = dVar.f19471w;
                } else {
                    marginLayoutParams.topMargin = 0;
                    return;
                }
            }
            dVar.ac.setVisibility(8);
        }
        dVar.f19458j.setVisibility(8);
        if ((fjVar.f12366a & 4) == 0) {
        }
        if (((fjVar.f12366a & 4) == 0 ? 1 : null) == null) {
            dVar.ab.setVisibility(8);
        } else {
            dVar.ab.setText(fjVar.f12370e);
            dVar.ab.setVisibility(0);
        }
        if (a.f14885a.f12098e == 19) {
        }
        dVar.f19460l.setVisibility(8);
        dVar.f19456h = dVar.f19445B.m5977a(c3748a.mo3709k(), c3748a.mo3711m(), c3748a, context, null, adVar2, 4, null, -1, null, false, false, false);
        dVar.f19456h.m5959a(a, null, c3748a.mo3710l(), dVar.f19454f);
        if (obj2 == null) {
        }
        marginLayoutParams = (MarginLayoutParams) dVar.ac.getLayoutParams();
        if (obj == null) {
            dVar.f19461m.setOrientation(1);
            marginLayoutParams.topMargin = dVar.f19472x;
        } else {
            dVar.f19461m.setOrientation(0);
            marginLayoutParams.topMargin = 0;
        }
        if (obj == null) {
        }
        dVar.ai.setVisibility(0);
        marginLayoutParams = (MarginLayoutParams) dVar.f19462n.getLayoutParams();
        if (obj2 == null) {
        }
        marginLayoutParams.topMargin = dVar.f19471w;
    }

    public final void mo1511b(View view, int i) {
        ((PlayCardMoviesMdpClusterView) view).Z_();
    }
}

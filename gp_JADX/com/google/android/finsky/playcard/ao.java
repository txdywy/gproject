package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.caverock.androidsvg.cs;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.actionbuttons.C1011h;
import com.google.android.finsky.actionbuttons.C1013j;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.av.C1527a;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.C1613m;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.aa;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.ac;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.hw;
import com.google.android.finsky.cv.p177a.hx;
import com.google.android.finsky.cv.p177a.hy;
import com.google.android.finsky.cv.p177a.hz;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.kg;
import com.google.android.finsky.cv.p177a.ko;
import com.google.android.finsky.cw.C2455b;
import com.google.android.finsky.cw.C2456c;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.cw.C2458e;
import com.google.android.finsky.detailscomponents.C2576a;
import com.google.android.finsky.detailscomponents.C2579e;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.C2596w;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3759c;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.preregistration.C3934g;
import com.google.android.finsky.utils.C4685p;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayCardSnippet;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.a;
import com.google.android.play.layout.d;
import com.google.android.play.layout.m;
import com.google.android.play.layout.n;
import com.google.android.play.utils.c;
import com.google.wireless.android.a.a.a.a.al;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class ao {
    public final C1463g f19577A;
    public final C3934g f19578B;
    public final C2162a f19579C;
    public final C3340g f19580D;
    public final C3851f f19581E;
    public final C1531a f19582F;
    public final C2458e f19583G;
    public final C2458e f19584H;
    public boolean f19585I;
    public String f19586a;
    public boolean f19587b;
    public boolean f19588c;
    public StringBuilder f19589d;
    public StringBuilder f19590e;
    public final C2596w f19591f;
    public final ah f19592g;
    public final C0988c f19593h;
    public final C1011h f19594i;
    public final C1013j f19595j;
    public final ab f19596k;
    public final C1542f f19597l;
    public final C2455b f19598m;
    public final C2206c f19599n;
    public final C2233o f19600o;
    public final C2288b f19601p;
    public final C2457d f19602q;
    public final C2579e f19603r;
    public final C2576a f19604s;
    public final C1294w f19605t;
    public final C1461c f19606u;
    public final C1556d f19607v;
    public final C1612l f19608w;
    public final C1287h f19609x;
    public final C2974a f19610y;
    public final C3646a f19611z;

    public ao(C0988c c0988c, C1011h c1011h, C1013j c1013j, ab abVar, C1542f c1542f, C2456c c2456c, C2206c c2206c, C2288b c2288b, C2457d c2457d, C2576a c2576a, C2581g c2581g, C2233o c2233o, C1294w c1294w, C1461c c1461c, C1556d c1556d, C1612l c1612l, C1287h c1287h, C2974a c2974a, C3646a c3646a, C1463g c1463g, C1527a c1527a, C3934g c3934g, C2162a c2162a, C3340g c3340g, C3851f c3851f, C1531a c1531a, C2596w c2596w) {
        if (C3760e.m17903a()) {
            m18508b();
        }
        this.f19602q = c2457d;
        this.f19597l = c1542f;
        this.f19598m = c2456c.m13148a();
        this.f19601p = c2288b;
        this.f19593h = c0988c;
        this.f19594i = c1011h;
        this.f19595j = c1013j;
        this.f19596k = abVar;
        this.f19599n = c2206c;
        this.f19604s = c2576a;
        this.f19600o = c2233o;
        this.f19605t = c1294w;
        this.f19606u = c1461c;
        this.f19607v = c1556d;
        this.f19608w = c1612l;
        this.f19609x = c1287h;
        this.f19610y = c2974a;
        this.f19611z = c3646a;
        this.f19577A = c1463g;
        this.f19578B = c3934g;
        this.f19579C = c2162a;
        this.f19580D = c3340g;
        this.f19581E = c3851f;
        this.f19582F = c1531a;
        this.f19591f = c2596w;
        this.f19583G = new C2458e();
        this.f19584H = new C2458e();
        this.f19592g = new ah(this, this.f19580D, this.f19599n, this.f19581E);
        this.f19603r = new C2579e(this.f19593h.cY(), this.f19596k.dn(), this.f19600o, this.f19599n, this.f19606u);
        if (this.f19606u.dj().mo2294a(12639920)) {
            new Handler(Looper.getMainLooper()).post(new ap(this));
        } else {
            this.f19592g.m18484a();
        }
        aa aaVar = aa.f19545c;
        aaVar.f19546a[29] = new bz(this);
        aaVar.f19546a[30] = new ca(this);
        aaVar.f19546a[31] = new aq();
        aaVar.f19546a[33] = new ar();
        aaVar.f19546a[34] = new as();
        aaVar.f19546a[32] = new at();
        aaVar.f19546a[36] = new au(this);
        aaVar.f19546a[35] = new aw();
        aaVar.f19546a[40] = new ax();
        aaVar.f19546a[41] = new ay();
        aaVar.f19546a[43] = new az(this);
        if (!this.f19606u.dj().mo2294a(12631899)) {
            m18512a();
        }
        aa aaVar2 = aa.f19545c;
        aaVar2.f19546a[28] = new bd(this);
        aaVar2.f19546a[26] = new bu(this);
        aaVar2.f19546a[27] = new bv();
        aaVar2.f19546a[13] = new bw();
        aaVar2.f19546a[37] = new af(this.f19593h, this.f19594i, this.f19604s, this.f19599n, this.f19600o, this.f19596k, this.f19606u);
        aaVar2.f19546a[42] = new bx();
        aaVar2.f19546a[6] = new by();
    }

    static boolean m18507a(d dVar) {
        switch (dVar.getCardType()) {
            case 16:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 40:
            case 41:
            case 42:
            case 43:
                return true;
            default:
                return false;
        }
    }

    private final void m18508b() {
        this.f19589d = new StringBuilder();
        this.f19589d.append("transition_card_details:cover:");
        this.f19590e = new StringBuilder();
        this.f19590e.append("transition_generic_circle:");
    }

    public final void m18512a() {
        if (!this.f19585I) {
            this.f19585I = true;
            aa aaVar = aa.f19545c;
            aaVar.f19546a[0] = new bc(this);
            aaVar.f19546a[1] = new be();
            aaVar.f19546a[4] = new bf(this);
        }
    }

    private final void m18502a(PlayCardSnippet playCardSnippet, hw hwVar, C3748a c3748a, int i, int i2, ad adVar, C2495w c2495w) {
        if (hwVar != null) {
            playCardSnippet.setVisibility(0);
            FifeImageView fifeImageView = (FifeImageView) playCardSnippet.getImageView();
            Resources resources = playCardSnippet.getResources();
            hy hyVar = hwVar.f12633f;
            cv cvVar;
            bd a;
            if (hyVar != null) {
                CharSequence charSequence;
                String quantityString;
                iu iuVar = hyVar.f12639a;
                if (iuVar.f12716d != null) {
                    charSequence = iuVar.f12716d.f12100g;
                } else {
                    charSequence = null;
                }
                Object obj = !TextUtils.isEmpty(charSequence) ? 1 : null;
                int i3 = iuVar.f12717e;
                Object obj2 = !TextUtils.isEmpty(iuVar.f12719g) ? 1 : null;
                Object obj3 = !TextUtils.isEmpty(iuVar.f12720h) ? 1 : null;
                Object[] objArr;
                if (obj != null) {
                    if (obj3 != null && obj2 != null && iuVar.f12720h.indexOf(iuVar.f12719g) != 0) {
                        quantityString = resources.getQuantityString(C7582R.plurals.review_author_stars_title_comment, i3, new Object[]{charSequence, Integer.valueOf(i3), iuVar.f12719g, iuVar.f12720h});
                    } else if (obj3 == null && obj2 == null) {
                        quantityString = resources.getQuantityString(C7582R.plurals.review_author_stars, i3, new Object[]{charSequence, Integer.valueOf(i3)});
                    } else {
                        objArr = new Object[3];
                        objArr[0] = charSequence;
                        objArr[1] = Integer.valueOf(i3);
                        if (obj3 != null) {
                            quantityString = iuVar.f12720h;
                        } else {
                            quantityString = iuVar.f12719g;
                        }
                        objArr[2] = quantityString;
                        quantityString = resources.getQuantityString(C7582R.plurals.review_author_stars_title, i3, objArr);
                    }
                } else if (obj3 == null && obj2 == null) {
                    quantityString = resources.getQuantityString(C7582R.plurals.review_just_stars, i3, new Object[]{Integer.valueOf(i3)});
                } else {
                    objArr = new Object[2];
                    objArr[0] = Integer.valueOf(i3);
                    if (obj3 != null) {
                        quantityString = iuVar.f12720h;
                    } else {
                        quantityString = iuVar.f12719g;
                    }
                    objArr[1] = quantityString;
                    quantityString = resources.getQuantityString(C7582R.plurals.review_stars_title, i3, objArr);
                }
                playCardSnippet.a(Html.fromHtml(quantityString), i, i2);
                cvVar = iuVar.f12716d;
                a = cvVar != null ? c.a(cvVar, 4) : null;
                if (a != null) {
                    this.f19608w.m9288a(fifeImageView, a.f11860f, a.f11863i);
                    m18501a(fifeImageView, cvVar, c3748a, adVar, c2495w);
                    fifeImageView.setVisibility(0);
                    return;
                }
                fifeImageView.setVisibility(8);
            } else if (hwVar.f12632e != null) {
                hx hxVar = hwVar.f12632e;
                int length = hxVar.f12637c.length;
                if (length > 1) {
                    cvVar = hxVar.f12637c[0];
                    r3 = hxVar.f12637c[1];
                    playCardSnippet.a(Html.fromHtml(resources.getString(C7582R.string.plus_one_multiple_friends_bold, new Object[]{cvVar.f12100g, r3.f12100g})), i, i2);
                    a = c.a(cvVar, 4);
                    this.f19608w.m9288a(fifeImageView, a.f11860f, a.f11863i);
                    m18501a(fifeImageView, cvVar, c3748a, adVar, c2495w);
                    fifeImageView.setVisibility(0);
                } else if (length == 1) {
                    r3 = hxVar.f12637c[0];
                    playCardSnippet.a(Html.fromHtml(resources.getString(C7582R.string.plus_one_single_friend_bold, new Object[]{r3.f12100g})), i, i2);
                    r4 = c.a(r3, 4);
                    this.f19608w.m9288a(fifeImageView, r4.f11860f, r4.f11863i);
                    m18501a(fifeImageView, r3, c3748a, adVar, c2495w);
                    fifeImageView.setVisibility(0);
                } else {
                    FinskyLog.m21667d("Server returned plus profile reason with no profiles", new Object[0]);
                }
            } else if (hwVar.f12634g != null) {
                hz hzVar = hwVar.f12634g;
                playCardSnippet.a(C4685p.m21831a(hzVar.f12642c), i, i2);
                r3 = hzVar.f12641b;
                r4 = c.a(r3, 4);
                this.f19608w.m9288a(fifeImageView, r4.f11860f, r4.f11863i);
                fifeImageView.setVisibility(0);
                m18501a(fifeImageView, r3, c3748a, adVar, c2495w);
            } else {
                playCardSnippet.a(C4685p.m21831a(hwVar.f12631d), i, i2);
                fifeImageView.setVisibility(8);
            }
        }
    }

    private static void m18501a(FifeImageView fifeImageView, cv cvVar, C3748a c3748a, ad adVar, C2495w c2495w) {
        fifeImageView.setOnClickListener(new bg(c3748a, cvVar, adVar, c2495w));
    }

    private static hw m18496a(kg kgVar, hw hwVar) {
        if (kgVar == null) {
            return null;
        }
        hw hwVar2 = null;
        for (hw hwVar3 : kgVar.f12874c) {
            if (!com.google.android.finsky.utils.ad.m21692a(hwVar3, hwVar)) {
                if (hwVar3.f12633f != null) {
                    return hwVar3;
                }
                if (hwVar3.f12632e != null || (hwVar3.f12631d.length() > 0 && (hwVar2 == null || hwVar2.f12632e == null))) {
                    hwVar2 = hwVar3;
                }
            }
        }
        return hwVar2;
    }

    final synchronized void m18513a(Document document, d dVar, boolean z) {
        if (document != null) {
            cn cnVar;
            boolean b;
            C2576a c2576a;
            int textSize;
            int i;
            int ownershipRenderingType;
            Object obj;
            ah ahVar;
            an anVar;
            Object obj2;
            C2458e c2458e;
            boolean z2;
            boolean z3;
            C2455b c2455b;
            C2458e c2458e2;
            C2458e c2458e3;
            ah ahVar2;
            C2458e c2458e4;
            an anVar2;
            C2458e c2458e5;
            Object obj3;
            Context context;
            Object obj4;
            int color;
            Context context2;
            String a;
            CharSequence a2;
            C1254c a3;
            com.google.android.play.layout.c labelDelegate = dVar.getLabelDelegate();
            TextView appSize = dVar.getAppSize();
            PlayTextView playTextView = (DecoratedTextView) dVar.getItemBadge();
            n ratingBarDelegate = dVar.getRatingBarDelegate();
            boolean z4 = dVar.at_() || C2576a.m13621a(dVar, document);
            if (this.f19588c && (dVar instanceof cn)) {
                cnVar = (cn) dVar;
                if (z4 && document.f14885a.f12098e == 1) {
                    CharSequence a4 = this.f19582F.m8958a(dVar.getContext(), document);
                    if (a4 != null) {
                        cnVar.mo3836a(a4);
                    } else {
                        cnVar.ar_();
                    }
                    b = cnVar.mo3839b(a4 != null);
                    if (b) {
                        c2576a = this.f19604s;
                        if (playTextView != null) {
                            playTextView.setVisibility(8);
                        }
                        if (playTextView == null && document.aq()) {
                            ac acVar;
                            playTextView.setVisibility(0);
                            List f = document.m14650f(7);
                            if (f == null || f.size() <= 0) {
                                acVar = document.f14885a.f12115v.f13132m[0];
                            } else {
                                acVar = (ac) f.get(0);
                            }
                            textSize = (int) playTextView.getTextSize();
                            bd a5 = C2576a.m13619a(acVar);
                            if (a5 != null) {
                                playTextView.m16019a(c2576a.f13747a, a5, textSize);
                            }
                            playTextView.setText(acVar.f11756c.toUpperCase());
                            if (z) {
                                i = C7582R.color.flat_card_subtitle_text_color_dark_theme;
                            } else {
                                i = C7582R.color.play_secondary_text;
                            }
                            ColorStateList colorStateList = playTextView.getResources().getColorStateList(i);
                            playTextView.setTextColor(colorStateList);
                            playTextView.m = false;
                            if (playTextView.m) {
                                playTextView.l.setColor(colorStateList.getDefaultColor());
                            }
                            playTextView.invalidate();
                            ai.m1823a(playTextView, 0, playTextView.getPaddingTop(), 0, playTextView.getPaddingBottom());
                        } else if (playTextView == null && (document.bh() || document.bi())) {
                            C2576a.m13620a(document, playTextView);
                            i = playTextView.getResources().getDimensionPixelSize(C7582R.dimen.play_tipper_sticker_padding);
                            ai.m1823a(playTextView, i, playTextView.getPaddingTop(), i, playTextView.getPaddingBottom());
                        } else if (playTextView == null && document.f14885a.f12098e == 20) {
                            if (!(document.m14631T() == null || TextUtils.isEmpty(document.m14631T().f12979d))) {
                                playTextView.setVisibility(0);
                                playTextView.a(C7582R.color.grey, false);
                                playTextView.setText(document.m14631T().f12979d);
                                playTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                            }
                            ai.m1823a(playTextView, 0, playTextView.getPaddingTop(), 0, playTextView.getPaddingBottom());
                        } else if (ratingBarDelegate != null) {
                            ratingBarDelegate.setCompactMode(true);
                            if (document.m14620I() || document.m14622K() <= 0) {
                                ratingBarDelegate.setVisibility(4);
                            } else {
                                ratingBarDelegate.setRating(aa.m9201a(document.m14621J()));
                                ratingBarDelegate.setVisibility(0);
                            }
                        }
                    }
                    if (labelDelegate != null) {
                        ownershipRenderingType = dVar.getOwnershipRenderingType();
                        obj = document.f14885a.f12096c;
                        ahVar = this.f19592g;
                        bb.m21791a();
                        ahVar.m18484a();
                        anVar = (an) ahVar.f19567g.m1692a(obj);
                        obj2 = (document.f14885a.f12098e == 6 || !(document.ac() || document.ad())) ? null : 1;
                        if (anVar == null && obj2 == null) {
                            c2458e = anVar.f19574a;
                            z2 = anVar.f19575b;
                            z3 = anVar.f19576c;
                        } else {
                            this.f19602q.m13154a(this.f19593h.cY(), this.f19596k.dn(), 1, document, this.f19598m);
                            c2455b = this.f19598m;
                            c2458e2 = this.f19583G;
                            c2458e2.m13161a();
                            if (c2455b.m13147c()) {
                                switch (c2455b.f13243d) {
                                    case 1:
                                        c2458e2.f13271a = C7582R.string.installing;
                                        break;
                                    case 2:
                                        c2458e2.f13271a = C7582R.string.disabled_list_state;
                                        break;
                                    case 3:
                                        c2458e2.f13271a = C7582R.string.preordered_list_state;
                                        break;
                                    case 4:
                                        c2458e2.f13273c = c2455b.f13246g;
                                        c2458e2.f13272b = c2455b.f13245f;
                                        c2458e2.f13274d = c2455b.m13146b() ? c2455b.m13141a(0).f13236g : 0;
                                        break;
                                    case 5:
                                        c2458e2.f13271a = C7582R.string.updates_list_state;
                                        break;
                                    case 6:
                                        c2458e2.f13271a = C7582R.string.purchased_list_state;
                                        break;
                                    case 7:
                                        c2458e2.f13271a = C7582R.string.rented_list_state;
                                        break;
                                    case 8:
                                        c2458e2.f13271a = C7582R.string.subscribed_list_state;
                                        break;
                                    case 9:
                                        c2458e2.f13271a = C7582R.string.updating;
                                        break;
                                    case 10:
                                        c2458e2.f13271a = C7582R.string.preregistration_coming_soon;
                                        break;
                                    case 11:
                                        c2458e2.f13271a = C7582R.string.preregistration_registered;
                                        break;
                                    case 12:
                                        c2458e2.f13271a = C7582R.string.waiting_for_wifi_list_state;
                                        break;
                                    case 13:
                                        c2458e2.f13271a = C7582R.string.family_library_label;
                                        break;
                                    case 14:
                                        c2458e2.f13271a = C7582R.string.updates_list_state;
                                        c2458e2.f13274d = c2455b.m13146b() ? c2455b.m13141a(0).f13236g : 0;
                                        break;
                                    case 15:
                                        c2458e2.f13271a = C7582R.string.early_access;
                                        break;
                                    default:
                                        FinskyLog.m21669e("Unrecognized status %d", Integer.valueOf(c2455b.f13243d));
                                        break;
                                }
                            } else if (c2455b.f13240a && c2455b.f13242c == 3) {
                                c2458e2.f13271a = C7582R.string.installed_list_state;
                            }
                            c2458e3 = this.f19583G;
                            z3 = this.f19598m.f13240a;
                            b = this.f19598m.f13241b;
                            if (obj2 != null) {
                                ahVar2 = this.f19592g;
                                c2458e4 = this.f19583G;
                                bb.m21791a();
                                ahVar2.m18484a();
                                if (ahVar2.f19566f != null) {
                                    anVar2 = new an();
                                    anVar2.f19574a = new C2458e(c2458e4);
                                    anVar2.f19575b = Boolean.valueOf(z3).booleanValue();
                                    anVar2.f19576c = b;
                                    ahVar2.f19567g.m1693a(obj, anVar2);
                                    c2458e = c2458e3;
                                    z2 = z3;
                                    z3 = b;
                                } else {
                                    anVar2 = ahVar2.f19566f;
                                    c2458e5 = anVar2.f19574a;
                                    c2458e5.f13271a = c2458e4.f13271a;
                                    c2458e5.f13272b = c2458e4.f13272b;
                                    c2458e5.f13273c = c2458e4.f13273c;
                                    c2458e5.f13274d = c2458e4.f13274d;
                                    c2458e5.f13275e = c2458e4.f13275e;
                                    anVar2.f19575b = Boolean.valueOf(z3).booleanValue();
                                    anVar2.f19576c = b;
                                    ahVar2.f19567g.m1693a(obj, anVar2);
                                    if (ahVar2.f19566f == anVar2) {
                                        ahVar2.f19566f = null;
                                    }
                                    c2458e = c2458e3;
                                    z2 = z3;
                                    z3 = b;
                                }
                            } else {
                                c2458e = c2458e3;
                                z2 = z3;
                                z3 = b;
                            }
                        }
                        if (this.f19588c && (dVar instanceof cn)) {
                            cnVar = (cn) dVar;
                            z4 = c2458e.f13271a != C7582R.string.installed_list_state || c2458e.f13271a == C7582R.string.installing || c2458e.f13271a == C7582R.string.updates_list_state;
                            cnVar.mo3837a(z4);
                        }
                        obj = (ownershipRenderingType & 1) == 0 ? 1 : null;
                        if ((ownershipRenderingType & 2) == 0) {
                            obj3 = 1;
                        } else {
                            obj3 = null;
                        }
                        dVar.setItemOwned(z2);
                        labelDelegate.setVisibility(8);
                        context = dVar.getContext();
                        if (!z3 && obj != null) {
                            labelDelegate.setVisibility(0);
                            C0722q a6 = C0722q.m4784a(context, (int) C7582R.raw.ic_family_24px);
                            a6.m4792a(((float) dVar.getResources().getDimensionPixelSize(C7582R.dimen.play_card_label_icon_size)) / a6.m4790a());
                            labelDelegate.setIconDrawable(new cs(a6, new as().m4593b(C1608h.m9243a(context, document.f14885a.f12099f))));
                        } else if (z2 || obj == null) {
                            labelDelegate.b();
                        } else {
                            labelDelegate.setVisibility(0);
                            labelDelegate.setIconDrawable(C1608h.m9246a(context, (int) C7582R.drawable.ic_checkshop, document.f14885a.f12099f));
                        }
                        obj4 = (z2 || obj3 != null) ? 1 : null;
                        if (obj4 == null) {
                            labelDelegate.setVisibility(0);
                            m18510c();
                            textSize = dVar.getResources().getColor(C1608h.m9241a(document.f14885a.f12099f));
                            color = dVar.getResources().getColor(C7582R.color.play_fg_secondary);
                            if (dVar instanceof co) {
                                context2 = dVar.getContext();
                                if (z) {
                                    i = C7582R.color.flat_card_subtitle_text_color;
                                } else {
                                    i = C7582R.color.flat_card_subtitle_text_color_dark_theme;
                                }
                                color = C0216d.m1116c(context2, i);
                            }
                            if (dVar.getCardType() != 29 || dVar.getCardType() == 30 || dVar.getCardType() == 31) {
                                obj2 = 1;
                            } else {
                                obj2 = null;
                            }
                            if (TextUtils.isEmpty(c2458e.f13273c)) {
                                labelDelegate.a(c2458e.f13272b, textSize, c2458e.f13273c, color, dVar.getResources().getString(C7582R.string.content_description_on_sale_price, new Object[]{c2458e.f13273c, c2458e.f13272b}));
                                if (obj2 != null) {
                                    if (dVar instanceof cn) {
                                        ((cn) dVar).ar_();
                                    }
                                    if (ratingBarDelegate != null) {
                                        ratingBarDelegate.setVisibility(4);
                                    }
                                    if (playTextView != null) {
                                        playTextView.setVisibility(4);
                                    }
                                }
                            } else {
                                a = c2458e.m13160a(context);
                                labelDelegate.a(a, textSize, null, color, a);
                            }
                            if (appSize != null) {
                                c2458e.f13274d = 0;
                            } else if (this.f19587b || c2458e.f13274d <= 0) {
                                appSize.setVisibility(8);
                            } else {
                                appSize.setText(C1613m.m9289a(c2458e.f13274d, appSize.getResources()));
                                appSize.setVisibility(0);
                            }
                        } else {
                            labelDelegate.a();
                            if (appSize != null) {
                                appSize.setVisibility(8);
                            }
                        }
                        if (labelDelegate.getVisibility() == 0 && z2 && obj != null && obj3 == null) {
                            a2 = c2458e.m13160a(context);
                            if (TextUtils.isEmpty(a2)) {
                                a2 = dVar.getResources().getString(C7582R.string.purchased_list_state);
                            }
                            labelDelegate.setContentDescription(a2);
                        }
                        a3 = this.f19609x.mo2015a();
                        if (dVar.getOverflow() != null && dVar.ay && m18506a(document, a3, dVar)) {
                            m18498a(document, this.f19610y.m15402a(document, a3.mo1620b()), dVar);
                        }
                    }
                } else {
                    cnVar.ar_();
                }
            }
            b = z4;
            if (b) {
                c2576a = this.f19604s;
                if (playTextView != null) {
                    playTextView.setVisibility(8);
                }
                if (playTextView == null) {
                }
                if (playTextView == null) {
                }
                if (playTextView == null) {
                }
                if (ratingBarDelegate != null) {
                    ratingBarDelegate.setCompactMode(true);
                    if (document.m14620I()) {
                    }
                    ratingBarDelegate.setVisibility(4);
                }
            }
            if (labelDelegate != null) {
                ownershipRenderingType = dVar.getOwnershipRenderingType();
                obj = document.f14885a.f12096c;
                ahVar = this.f19592g;
                bb.m21791a();
                ahVar.m18484a();
                anVar = (an) ahVar.f19567g.m1692a(obj);
                if (document.f14885a.f12098e == 6) {
                }
                if (anVar == null) {
                }
                this.f19602q.m13154a(this.f19593h.cY(), this.f19596k.dn(), 1, document, this.f19598m);
                c2455b = this.f19598m;
                c2458e2 = this.f19583G;
                c2458e2.m13161a();
                if (c2455b.m13147c()) {
                    switch (c2455b.f13243d) {
                        case 1:
                            c2458e2.f13271a = C7582R.string.installing;
                            break;
                        case 2:
                            c2458e2.f13271a = C7582R.string.disabled_list_state;
                            break;
                        case 3:
                            c2458e2.f13271a = C7582R.string.preordered_list_state;
                            break;
                        case 4:
                            c2458e2.f13273c = c2455b.f13246g;
                            c2458e2.f13272b = c2455b.f13245f;
                            if (c2455b.m13146b()) {
                            }
                            c2458e2.f13274d = c2455b.m13146b() ? c2455b.m13141a(0).f13236g : 0;
                            break;
                        case 5:
                            c2458e2.f13271a = C7582R.string.updates_list_state;
                            break;
                        case 6:
                            c2458e2.f13271a = C7582R.string.purchased_list_state;
                            break;
                        case 7:
                            c2458e2.f13271a = C7582R.string.rented_list_state;
                            break;
                        case 8:
                            c2458e2.f13271a = C7582R.string.subscribed_list_state;
                            break;
                        case 9:
                            c2458e2.f13271a = C7582R.string.updating;
                            break;
                        case 10:
                            c2458e2.f13271a = C7582R.string.preregistration_coming_soon;
                            break;
                        case 11:
                            c2458e2.f13271a = C7582R.string.preregistration_registered;
                            break;
                        case 12:
                            c2458e2.f13271a = C7582R.string.waiting_for_wifi_list_state;
                            break;
                        case 13:
                            c2458e2.f13271a = C7582R.string.family_library_label;
                            break;
                        case 14:
                            c2458e2.f13271a = C7582R.string.updates_list_state;
                            if (c2455b.m13146b()) {
                            }
                            c2458e2.f13274d = c2455b.m13146b() ? c2455b.m13141a(0).f13236g : 0;
                            break;
                        case 15:
                            c2458e2.f13271a = C7582R.string.early_access;
                            break;
                        default:
                            FinskyLog.m21669e("Unrecognized status %d", Integer.valueOf(c2455b.f13243d));
                            break;
                    }
                }
                c2458e2.f13271a = C7582R.string.installed_list_state;
                c2458e3 = this.f19583G;
                z3 = this.f19598m.f13240a;
                b = this.f19598m.f13241b;
                if (obj2 != null) {
                    c2458e = c2458e3;
                    z2 = z3;
                    z3 = b;
                } else {
                    ahVar2 = this.f19592g;
                    c2458e4 = this.f19583G;
                    bb.m21791a();
                    ahVar2.m18484a();
                    if (ahVar2.f19566f != null) {
                        anVar2 = ahVar2.f19566f;
                        c2458e5 = anVar2.f19574a;
                        c2458e5.f13271a = c2458e4.f13271a;
                        c2458e5.f13272b = c2458e4.f13272b;
                        c2458e5.f13273c = c2458e4.f13273c;
                        c2458e5.f13274d = c2458e4.f13274d;
                        c2458e5.f13275e = c2458e4.f13275e;
                        anVar2.f19575b = Boolean.valueOf(z3).booleanValue();
                        anVar2.f19576c = b;
                        ahVar2.f19567g.m1693a(obj, anVar2);
                        if (ahVar2.f19566f == anVar2) {
                            ahVar2.f19566f = null;
                        }
                        c2458e = c2458e3;
                        z2 = z3;
                        z3 = b;
                    } else {
                        anVar2 = new an();
                        anVar2.f19574a = new C2458e(c2458e4);
                        anVar2.f19575b = Boolean.valueOf(z3).booleanValue();
                        anVar2.f19576c = b;
                        ahVar2.f19567g.m1693a(obj, anVar2);
                        c2458e = c2458e3;
                        z2 = z3;
                        z3 = b;
                    }
                }
                cnVar = (cn) dVar;
                if (c2458e.f13271a != C7582R.string.installed_list_state) {
                }
                cnVar.mo3837a(z4);
                if ((ownershipRenderingType & 1) == 0) {
                }
                if ((ownershipRenderingType & 2) == 0) {
                    obj3 = null;
                } else {
                    obj3 = 1;
                }
                dVar.setItemOwned(z2);
                labelDelegate.setVisibility(8);
                context = dVar.getContext();
                if (!z3) {
                }
                if (z2) {
                }
                labelDelegate.b();
                if (z2) {
                }
                if (obj4 == null) {
                    labelDelegate.a();
                    if (appSize != null) {
                        appSize.setVisibility(8);
                    }
                } else {
                    labelDelegate.setVisibility(0);
                    m18510c();
                    textSize = dVar.getResources().getColor(C1608h.m9241a(document.f14885a.f12099f));
                    color = dVar.getResources().getColor(C7582R.color.play_fg_secondary);
                    if (dVar instanceof co) {
                        context2 = dVar.getContext();
                        if (z) {
                            i = C7582R.color.flat_card_subtitle_text_color;
                        } else {
                            i = C7582R.color.flat_card_subtitle_text_color_dark_theme;
                        }
                        color = C0216d.m1116c(context2, i);
                    }
                    if (dVar.getCardType() != 29) {
                    }
                    obj2 = 1;
                    if (TextUtils.isEmpty(c2458e.f13273c)) {
                        a = c2458e.m13160a(context);
                        labelDelegate.a(a, textSize, null, color, a);
                    } else {
                        labelDelegate.a(c2458e.f13272b, textSize, c2458e.f13273c, color, dVar.getResources().getString(C7582R.string.content_description_on_sale_price, new Object[]{c2458e.f13273c, c2458e.f13272b}));
                        if (obj2 != null) {
                            if (dVar instanceof cn) {
                                ((cn) dVar).ar_();
                            }
                            if (ratingBarDelegate != null) {
                                ratingBarDelegate.setVisibility(4);
                            }
                            if (playTextView != null) {
                                playTextView.setVisibility(4);
                            }
                        }
                    }
                    if (appSize != null) {
                        if (this.f19587b) {
                        }
                        appSize.setVisibility(8);
                    } else {
                        c2458e.f13274d = 0;
                    }
                }
                a2 = c2458e.m13160a(context);
                if (TextUtils.isEmpty(a2)) {
                    a2 = dVar.getResources().getString(C7582R.string.purchased_list_state);
                }
                labelDelegate.setContentDescription(a2);
                a3 = this.f19609x.mo2015a();
                m18498a(document, this.f19610y.m15402a(document, a3.mo1620b()), dVar);
            }
        }
    }

    private final synchronized void m18510c() {
        String cZ = this.f19593h.cZ();
        if (this.f19586a == null || !this.f19586a.equals(cZ)) {
            this.f19587b = this.f19606u.dj().mo2294a(12603329);
            this.f19588c = this.f19606u.dj().mo2294a(12631928);
            this.f19586a = cZ;
            this.f19592g.m18485b();
        }
    }

    public final void m18518a(d dVar, Document document, String str, C3748a c3748a, ad adVar, C2495w c2495w) {
        m18516a(dVar, document, 0, str, c3748a, false, null, adVar, true, false, false, c2495w, null);
    }

    public final void m18519a(d dVar, Document document, String str, C3748a c3748a, ad adVar, C2495w c2495w, C3371p c3371p) {
        m18516a(dVar, document, 0, str, c3748a, false, null, adVar, true, false, false, c2495w, c3371p);
    }

    public final void m18517a(d dVar, Document document, String str, C3748a c3748a, ad adVar, int i, C2495w c2495w) {
        m18515a(dVar, document, 0, str, c3748a, false, null, adVar, true, i, false, false, c2495w, true, false, false);
    }

    public final void m18514a(d dVar, Document document, int i, String str, C3748a c3748a, boolean z, ab abVar, ad adVar, boolean z2, int i2, boolean z3, boolean z4, C2495w c2495w, C3371p c3371p, C3907h c3907h) {
        m18503a(dVar, document, i, str, c3748a, z, abVar, adVar, c3371p, z2, i2, z3, z4, c2495w, true, false, false, c3907h);
    }

    public final void m18516a(d dVar, Document document, int i, String str, C3748a c3748a, boolean z, ab abVar, ad adVar, boolean z2, boolean z3, boolean z4, C2495w c2495w, C3371p c3371p) {
        m18514a(dVar, document, i, str, c3748a, z, abVar, adVar, z2, -1, z3, z4, c2495w, c3371p, null);
    }

    public final void m18515a(d dVar, Document document, int i, String str, C3748a c3748a, boolean z, ab abVar, ad adVar, boolean z2, int i2, boolean z3, boolean z4, C2495w c2495w, boolean z5, boolean z6, boolean z7) {
        m18503a(dVar, document, i, str, c3748a, z, abVar, adVar, null, z2, i2, z3, z4, c2495w, z5, z6, z7, null);
    }

    private final void m18503a(d dVar, Document document, int i, String str, C3748a c3748a, boolean z, ab abVar, ad adVar, C3371p c3371p, boolean z2, int i2, boolean z3, boolean z4, C2495w c2495w, boolean z5, boolean z6, boolean z7, C3907h c3907h) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i3;
        View view;
        View view2;
        Object obj;
        bb.m21791a();
        C3915n c3915n = (C3915n) dVar.getLoggingData();
        if (c3915n != null) {
            c3915n.m18589a(dVar.getCardType(), adVar);
        } else {
            dVar.setLoggingData(new C3915n(dVar.getCardType(), adVar));
        }
        C3915n c3915n2 = (C3915n) dVar.getLoggingData();
        Resources resources = dVar.getResources();
        boolean aZ = document.aZ();
        aa aaVar = aa.f19545c;
        C3901z c3901z = aaVar.f19546a[dVar.getCardType()];
        if (c3901z == null) {
            c3901z = aaVar.f19547b;
        }
        c3901z.mo3861a(dVar, document, c3748a, c2495w);
        if (document.f14885a.f12098e == 5 && document.f14885a.f12098e == 64) {
            if (!document.m14624M() || document.f14885a.f12112s.f12052e == null) {
                charSequence = null;
            } else {
                charSequence = document.f14885a.f12112s.f12052e.f11777i;
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = document.f14885a.f12100g;
            }
        } else {
            charSequence = document.f14885a.f12100g;
        }
        if (i2 >= 0 && !aZ) {
            TextView ranking = dVar.getRanking();
            if (ranking != null) {
                ranking.setVisibility(0);
                ranking.setText(Integer.toString(i2 + 1));
            } else {
                charSequence = dVar.getResources().getString(C7582R.string.numbered_title, new Object[]{Integer.valueOf(i2 + 1), charSequence});
            }
        }
        dVar.setTitleVisibility(0);
        dVar.setTitleText(charSequence);
        if (document != null) {
            charSequence2 = document.f14885a.f12100g;
        } else {
            charSequence2 = null;
        }
        if (!(document == null || TextUtils.isEmpty(charSequence2))) {
            Resources resources2 = dVar.getResources();
            switch (document.f14885a.f12098e) {
                case 1:
                    i3 = C7582R.string.content_description_app_title;
                    break;
                case 2:
                    i3 = C7582R.string.content_description_music_album_title;
                    break;
                case 3:
                    i3 = C7582R.string.content_description_music_artist_title;
                    break;
                case 4:
                    i3 = C7582R.string.content_description_music_track_title;
                    break;
                case 5:
                    i3 = C7582R.string.content_description_book_title;
                    break;
                case 6:
                    i3 = C7582R.string.content_description_movie_title;
                    break;
                case 8:
                    i3 = C7582R.string.content_description_developer_title;
                    break;
                case 16:
                case 17:
                case 24:
                case 25:
                    i3 = C7582R.string.content_description_publication_title;
                    break;
                case 18:
                    i3 = C7582R.string.content_description_tv_show_title;
                    break;
                case 19:
                    i3 = C7582R.string.content_description_tv_season_title;
                    break;
                case 20:
                    i3 = C7582R.string.content_description_tv_episode_title;
                    break;
                case 28:
                    i3 = C7582R.string.content_description_person_title;
                    break;
                case 44:
                    i3 = C7582R.string.content_description_book_series_title;
                    break;
                case 64:
                    i3 = C1592a.f8451Z.intValue();
                    break;
                default:
                    i3 = -1;
                    break;
            }
            if (i3 >= 0) {
                dVar.setTitleContentDescription(resources2.getString(i3, new Object[]{charSequence2}));
            }
        }
        PlayCardThumbnail thumbnail = dVar.getThumbnail();
        if (thumbnail != null) {
            int[] imageTypePreference;
            thumbnail.setVisibility(0);
            thumbnail.a(document.f14885a.f12099f, m18511c(dVar));
            if (dVar instanceof ad) {
                imageTypePreference = ((ad) dVar).getImageTypePreference();
            } else {
                imageTypePreference = DocImageView.f13711a;
            }
            view = (DocImageView) thumbnail.getImageView();
            view.m13584a(document, this.f19605t, imageTypePreference);
            view2 = view;
        } else {
            view2 = null;
        }
        if (C3760e.m17903a()) {
            int i4 = document.f14885a.f12098e;
            obj = (i4 == 2 || i4 == 4 || i4 == 24 || i4 == 25) ? 1 : null;
            if (obj != null || view2 == null) {
                if (view2 != null) {
                    view2.setTransitionName(null);
                }
                dVar.setTransitionGroup(false);
            } else {
                obj = ((dVar instanceof C3759c) || i4 == 18 || i4 == 19 || i4 == 3) ? 1 : null;
                if ((i4 == 30 || i4 == 34 || i4 == 8) && !document.m14647d(4)) {
                    obj = 1;
                }
                if (this.f19589d == null || this.f19590e == null) {
                    m18508b();
                }
                if (obj != null) {
                    this.f19590e.setLength(26);
                    this.f19590e.append(document.f14885a.f12096c);
                    this.f19590e.append(':');
                    this.f19590e.append(str);
                    view2.setTransitionName(this.f19590e.toString());
                } else {
                    this.f19589d.setLength(30);
                    this.f19589d.append(document.f14885a.f12096c);
                    this.f19589d.append(':');
                    this.f19589d.append(str);
                    view2.setTransitionName(this.f19589d.toString());
                }
                dVar.setTransitionGroup(true);
            }
        }
        dVar.setShouldRemoveExtraSpaceOnCard(m18511c(dVar));
        if (z2) {
            dVar.setThumbnailAspectRatio(C1617r.m9292a(document.f14885a.f12098e));
        }
        a subtitleDelegate = dVar.getSubtitleDelegate();
        n ratingBarDelegate = dVar.getRatingBarDelegate();
        DecoratedTextView decoratedTextView = (DecoratedTextView) dVar.getItemBadge();
        if (ratingBarDelegate != null) {
            ratingBarDelegate.setVisibility(4);
        }
        if (decoratedTextView != null) {
            decoratedTextView.setVisibility(4);
        }
        boolean at_ = dVar.at_();
        boolean a = C2576a.m13621a(dVar, document);
        PlayTextView description = dVar.getDescription();
        obj = (at_ || !a) ? 1 : null;
        String str2 = null;
        CharSequence charSequence3 = null;
        PlayTextView subtitle2 = dVar.getSubtitle2();
        if (subtitle2 != null) {
            subtitle2.setVisibility(8);
        }
        if (document.m14668w()) {
            str2 = document.m14669x();
        } else if (document.bE() && document.bm() && obj != null && subtitleDelegate != null) {
            String bF = document.bF();
            charSequence2 = ac.m18475a(document);
            if (subtitle2 != null) {
                subtitle2.setVisibility(0);
                subtitle2.setText(charSequence2);
                str2 = bF;
            } else {
                charSequence3 = charSequence2;
                str2 = bF;
            }
        } else if (document.f14885a.f12098e == 44 && description != null) {
            str2 = document.bH();
            if (TextUtils.isEmpty(str2)) {
                obj = null;
            }
            charSequence3 = document.bG();
        }
        if (subtitleDelegate != null) {
            if (obj != null) {
                subtitleDelegate.setVisibility(0);
                if (str2 != null) {
                    charSequence = str2;
                } else {
                    charSequence = ac.m18475a(document);
                }
                subtitleDelegate.setText(charSequence);
                if (str2 != null) {
                    at_ = (document.f14885a.f12115v == null || document.f14885a.f12115v.f13103J == null || !document.f14885a.f12115v.f13103J.f11802c) ? false : true;
                    subtitleDelegate.setShouldScreenread(at_);
                }
                if (dVar.as) {
                    this.f19604s.m13623a(document.an() ? document.ao() : null, subtitleDelegate, dVar.getResources());
                }
            } else {
                subtitleDelegate.setVisibility(8);
            }
        }
        m18513a(document, dVar, z6);
        if (dVar instanceof FlatCardViewListingSmall) {
            FlatCardViewListingSmall flatCardViewListingSmall = (FlatCardViewListingSmall) dVar;
            if (this.f19606u.dj().mo2294a(12642037)) {
                if (document.f14885a.f12098e == 64) {
                    if (document.bR()) {
                        flatCardViewListingSmall.m18425c(resources.getString(C7582R.string.book_format_and_abridged, new Object[]{resources.getString(C7582R.string.audiobook_format)}));
                    } else {
                        flatCardViewListingSmall.m18425c(resources.getString(C7582R.string.audiobook_format));
                    }
                    if (document.bK()) {
                        flatCardViewListingSmall.m18423b(resources.getString(C7582R.string.also_in_ebook));
                    } else {
                        flatCardViewListingSmall.m18418a();
                    }
                }
                if (document.f14885a.f12098e == 5) {
                    flatCardViewListingSmall.m18425c(resources.getString(C7582R.string.ebook_format));
                    if (document.bK()) {
                        flatCardViewListingSmall.m18423b(resources.getString(C7582R.string.also_in_audiobook, new Object[]{resources.getString(C7582R.string.audiobook_format)}));
                    } else {
                        flatCardViewListingSmall.m18418a();
                    }
                }
            } else {
                flatCardViewListingSmall.f19378f.setVisibility(8);
                flatCardViewListingSmall.m18418a();
            }
        }
        if (description != null) {
            if (TextUtils.isEmpty(charSequence3)) {
                charSequence = document.f14885a.f12105l;
                charSequence2 = document.m14612A();
                if (TextUtils.isEmpty(charSequence) || !(z3 || TextUtils.isEmpty(charSequence2))) {
                    charSequence = charSequence2;
                }
            } else {
                charSequence = charSequence3;
            }
            description.setText(charSequence);
            description.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        }
        PlayCardSnippet snippet1 = dVar.getSnippet1();
        m snippet2 = dVar.getSnippet2();
        if (!(snippet1 == null && snippet2 == null)) {
            if (snippet1 != null) {
                snippet1.setVisibility(8);
                snippet1.setSeparatorVisible(false);
            }
            if (snippet2 != null) {
                snippet2.setVisibility(8);
                snippet2.setSeparatorVisible(false);
            }
            int textOnlySnippetMarginLeft = dVar.getTextOnlySnippetMarginLeft();
            int avatarSnippetMarginLeft = dVar.getAvatarSnippetMarginLeft();
            obj = document.aG();
            if (TextUtils.isEmpty(obj)) {
                kg aF = document.aF();
                if (aF != null && aF.f12874c.length != 0) {
                    ad adVar2 = (ad) dVar.getLoggingData();
                    hw a2;
                    if (aF.f12874c.length == 1 || snippet1 == null || snippet2 == null) {
                        a2 = m18496a(aF, null);
                        if (snippet2 != null) {
                            snippet1 = snippet2;
                        }
                        m18502a(snippet1, a2, c3748a, textOnlySnippetMarginLeft, avatarSnippetMarginLeft, adVar2, c2495w);
                    } else {
                        snippet2.setSeparatorVisible(true);
                        a2 = m18496a(aF, null);
                        hw a3 = m18496a(aF, a2);
                        m18502a(snippet1, a2, c3748a, textOnlySnippetMarginLeft, avatarSnippetMarginLeft, adVar2, c2495w);
                        m18502a((PlayCardSnippet) snippet2, a3, c3748a, textOnlySnippetMarginLeft, avatarSnippetMarginLeft, adVar2, c2495w);
                    }
                } else if (snippet2 != null && document.m14658m()) {
                    snippet2.a(document.m14659n().f13069c, textOnlySnippetMarginLeft, avatarSnippetMarginLeft);
                    ((FifeImageView) snippet2.getImageView()).setVisibility(8);
                    snippet2.setVisibility(0);
                }
            } else {
                if (snippet2 != null) {
                    snippet1 = snippet2;
                }
                snippet1.a(C4685p.m21831a(obj), textOnlySnippetMarginLeft, avatarSnippetMarginLeft);
                ((FifeImageView) snippet1.getImageView()).setVisibility(8);
                snippet1.setVisibility(0);
            }
        }
        View overflow = dVar.getOverflow();
        if (!(overflow == null || document == null)) {
            C1254c a4 = this.f19609x.mo2015a();
            if (z5 && m18506a(document, a4, dVar)) {
                overflow.setVisibility(0);
                dVar.setIsCardWishlistButtonVisible(true);
                C1254c a5 = this.f19609x.mo2015a();
                boolean a6 = this.f19610y.m15402a(document, a5.mo1620b());
                m18498a(document, a6, dVar);
                overflow.setOnClickListener(new bk(this, c2495w, c3915n2, a6, document, dVar, c3748a, a5));
            } else {
                if (z) {
                    obj = 1;
                } else {
                    i3 = document.f14885a.f12098e;
                    obj = (i3 == 3 || i3 == 44) ? 1 : (i3 == 19 || i3 == 20) ? document.f14885a.f12107n.length == 0 ? 1 : null : null;
                }
                if (obj != null) {
                    overflow.setVisibility(4);
                    dVar.setIsCardWishlistButtonVisible(false);
                    overflow.setOnClickListener(null);
                } else {
                    overflow.setVisibility(0);
                    dVar.setIsCardWishlistButtonVisible(false);
                    overflow.setContentDescription(resources.getString(C7582R.string.content_description_options));
                    if (!m18507a(dVar)) {
                        overflow.setImageResource(C7582R.drawable.play_overflow_menu);
                        ((MarginLayoutParams) overflow.getLayoutParams()).topMargin = dVar.getContext().getResources().getDimensionPixelSize(C7582R.dimen.play_card_overflow_top_margin);
                    }
                    Context context = overflow.getContext();
                    if (document.aZ()) {
                        this.f19597l.m8974a(overflow);
                    } else {
                        overflow.setOnTouchListener(null);
                    }
                    overflow.setOnClickListener(new bl(this, context, overflow, c2495w, c3915n2, document, i, c3748a, dVar, c3907h, abVar));
                    if (overflow.isFocusable()) {
                        PlayCardSnippet snippet12 = dVar.getSnippet1();
                        snippet1 = dVar.getSnippet2();
                        if (snippet12 != null && snippet12.getVisibility() == 0) {
                            snippet1 = snippet12;
                        } else if (snippet1 == null || snippet1.getVisibility() != 0) {
                            snippet1 = null;
                        }
                        view = snippet1 == null ? null : snippet1.getImageView();
                        if (snippet1 == null || view.getVisibility() != 0) {
                            overflow.setNextFocusDownId(-1);
                        } else {
                            overflow.setNextFocusDownId(view.getId());
                            view.setNextFocusUpId(overflow.getId());
                            view.setFocusable(true);
                        }
                    }
                }
            }
        }
        if (dVar.c()) {
            if (aZ) {
                obj = (document.aZ() && document.bg().f12933l.f12825f) ? 1 : null;
                if (obj == null) {
                    dVar.setAdLabelVisibility(0);
                    dVar.setAdLabelText(document.bc());
                }
            }
            dVar.setAdLabelVisibility(8);
        }
        TextView adCreative = dVar.getAdCreative();
        if (aZ) {
            int cardType = dVar.getCardType();
            obj = (cardType == 4 || cardType == 32 || cardType == 23 || cardType == 24) ? 1 : null;
            ko bg = document.bg();
            if (bg == null || bg.f12933l == null) {
                charSequence2 = null;
            } else {
                charSequence2 = C4685p.m21831a(bg.f12933l.f12822c);
            }
            if (!(obj == null || adCreative == null)) {
                adCreative.setText(charSequence2);
                adCreative.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            if (cardType == 36 && !TextUtils.isEmpty(charSequence2) && this.f19606u.dj().mo2294a(12608339)) {
                dVar.getDescription().setText(charSequence2);
            }
        } else if (adCreative != null) {
            adCreative.setVisibility(8);
        }
        if (z) {
            dVar.setDisplayAsDisabled(true);
            dVar.setOnClickListener(null);
            dVar.setClickable(false);
        } else {
            dVar.setDisplayAsDisabled(false);
            if (c3748a != null && C3760e.m17904a(document)) {
                dVar.setOnClickListener(new bh(this, document, c3748a, c3915n2, view2 != null ? new View[]{view2} : null, c2495w));
                if (aZ) {
                    this.f19597l.m8974a((View) dVar);
                } else {
                    dVar.setOnTouchListener(null);
                }
            }
        }
        view = dVar.getLoadingIndicator();
        if (view != null) {
            view.setVisibility(8);
        }
        C2482j.m13285a(c3915n2.getPlayStoreUiElement(), document.f14885a.f12087D);
        if (z4) {
            C3646a c3646a = this.f19611z;
            C2206c c2206c = this.f19599n;
            if (document.f14885a.f12099f == 3) {
                String cf = document.cf();
                C3647b a7 = c3646a.m17243a(cf);
                if (!(a7 == null || a7.f18028c == null || c2206c.mo2818b(cf, a7.f18028c.f11417b).isEmpty())) {
                    ce playStoreUiElement = c3915n2.getPlayStoreUiElement();
                    if (playStoreUiElement.e == null) {
                        playStoreUiElement.e = new cf();
                    }
                    cf cfVar = playStoreUiElement.e;
                    if (cfVar.i == null) {
                        cfVar.i = new al();
                    }
                    al alVar = cfVar.i;
                    alVar.a |= 1;
                    alVar.b = true;
                }
            }
        }
        if (c3915n2.getParentNode() != null) {
            c3915n2.getParentNode().mo1219a(c3915n2);
        }
        if (aZ && !this.f19606u.dj().mo2294a(12629021)) {
            this.f19577A.dc().m13329a(null);
        }
        if (dVar instanceof co) {
            ((co) dVar).setUseDarkTheme(z6);
        }
        if (dVar instanceof cp) {
            ((cp) dVar).setIsPartOfMixedContentCluster(z7);
        }
        if (c3371p != null && (dVar instanceof C3898o)) {
            Context context2 = dVar.getContext();
            charSequence3 = this.f19595j.m5991a(dVar.getContext());
            TextView downloadingBytesView = ((C3898o) dVar).getDownloadingBytesView();
            TextView downloadingPercentageView = ((C3898o) dVar).getDownloadingPercentageView();
            ProgressBar downloadingProgressRing = ((C3898o) dVar).getDownloadingProgressRing();
            C1527a.m8947a(context2, c3371p, downloadingBytesView, downloadingPercentageView, downloadingProgressRing);
            if (c3371p.f17276a == 1) {
                downloadingProgressRing.setIndeterminate(true);
                downloadingBytesView.setText(charSequence3);
            }
        }
        dVar.setVisibility(0);
    }

    public static void m18504a(d dVar, Document document, C1254c c1254c, ab abVar, ad adVar, C2495w c2495w) {
        c2495w.m13379b(new C2475d(adVar).m13256a(212));
        c1254c.mo1652g(document.bf().f12043b, new bi(abVar, document, dVar), new bj(document));
    }

    public static void m18509b(d dVar) {
        PlayCardThumbnail thumbnail = dVar.getThumbnail();
        if (thumbnail != null) {
            m18497a(thumbnail.getImageView());
        }
        PlayCardSnippet snippet1 = dVar.getSnippet1();
        if (snippet1 != null) {
            m18497a(snippet1.getImageView());
        }
        snippet1 = dVar.getSnippet2();
        if (snippet1 != null) {
            m18497a(snippet1.getImageView());
        }
        C3915n c3915n = (C3915n) dVar.getLoggingData();
        if (c3915n != null) {
            c3915n.f19841a = null;
            c3915n.f19842b = null;
        }
        if (dVar instanceof ae) {
            ((ae) dVar).Z_();
        }
    }

    private static void m18497a(ImageView imageView) {
        if (imageView instanceof FifeImageView) {
            ((FifeImageView) imageView).a();
        }
    }

    private final boolean m18506a(Document document, C1254c c1254c, d dVar) {
        if (document.f14885a.f12107n != null && document.f14885a.f12107n.length == 0 && this.f19606u.dj().mo2294a(12609170) && document.f14885a.f12098e == 6 && !this.f19610y.m15403a(document, c1254c) && (dVar.getCardType() == 0 || dVar.getCardType() == 29 || dVar.getCardType() == 30 || dVar.getCardType() == 1 || dVar.getCardType() == 31 || dVar.getCardType() == 2 || dVar.getCardType() == 3 || dVar.getCardType() == 4 || dVar.getCardType() == 32 || dVar.getCardType() == 26 || dVar.getCardType() == 27 || dVar.getCardType() == 42)) {
            return true;
        }
        return false;
    }

    static void m18498a(Document document, boolean z, d dVar) {
        int i;
        Drawable a;
        Context context = dVar.getContext();
        if (z) {
            i = C7582R.string.wishlist_remove;
            a = C1608h.m9246a(context, (int) C7582R.drawable.ic_menu_wish_on, document.f14885a.f12099f);
        } else {
            i = C7582R.string.wishlist_add;
            a = C1608h.m9246a(context, (int) C7582R.drawable.ic_menu_wish_off, document.f14885a.f12099f);
        }
        Resources resources = context.getResources();
        ImageView overflow = dVar.getOverflow();
        overflow.setImageDrawable(a);
        overflow.setContentDescription(resources.getString(i));
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) overflow.getLayoutParams();
        Resources resources2 = context.getResources();
        if (dVar.getCardType() == 0 || dVar.getCardType() == 29 || dVar.getCardType() == 30) {
            i = C7582R.dimen.play_card_wishlist_overflow_top_margin_mini;
        } else {
            i = C7582R.dimen.play_card_wishlist_overflow_top_margin;
        }
        marginLayoutParams.topMargin = resources2.getDimensionPixelSize(i);
    }

    private final void m18505a(boolean z, Document document, C3748a c3748a, d dVar, int i, Context context, ad adVar, C1254c c1254c, C2495w c2495w) {
        c2495w.m13379b(new C2475d(adVar).m13256a(i));
        if (!z) {
            this.f19597l.m8973a(context, document, "24", dVar.getWidth(), dVar.getHeight(), c3748a.mo3705g());
        }
        this.f19610y.m15398a((View) dVar, document, c1254c);
    }

    private final boolean m18511c(d dVar) {
        if (this.f19606u.dj().mo2294a(12609522) && (dVar.getCardType() == 0 || dVar.getCardType() == 1)) {
            return true;
        }
        return false;
    }

    static /* synthetic */ void m18499a(ao aoVar, d dVar, int i) {
        if (aoVar.f19607v.m9023b()) {
            Resources resources = dVar.getResources();
            dVar.a((float) (resources.getDimensionPixelSize(i) - resources.getDimensionPixelSize(C7582R.dimen.jpkr_card_title_size_reduction)));
        }
    }
}

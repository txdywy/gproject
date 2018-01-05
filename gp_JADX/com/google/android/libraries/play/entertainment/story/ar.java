package com.google.android.libraries.play.entertainment.story;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ab;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.agera.C0893t;
import com.google.android.agera.C0896s;
import com.google.android.agera.C0917x;
import com.google.android.agera.aa;
import com.google.android.agera.ac;
import com.google.android.agera.p100a.C0884a;
import com.google.android.agera.p100a.C0886c;
import com.google.android.agera.p100a.C0891h;
import com.google.android.libraries.play.entertainment.C6027b;
import com.google.android.libraries.play.entertainment.C6072e;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6094i;
import com.google.android.libraries.play.entertainment.C6098k;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.C6047p;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.media.C3000i;
import com.google.android.libraries.play.entertainment.media.C6077c;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p195e.C3004a;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6122h;
import com.google.android.libraries.play.entertainment.story.model.ao;
import com.google.android.libraries.play.entertainment.story.model.bb;
import com.google.android.libraries.play.entertainment.story.model.bg;
import com.google.android.libraries.play.entertainment.story.model.bn;
import com.google.wireless.android.finsky.dfe.g.a.ae;
import com.google.wireless.android.finsky.dfe.g.a.af;
import com.google.wireless.android.finsky.dfe.g.a.ai;
import com.google.wireless.android.finsky.dfe.g.a.aj;
import java.util.Collections;
import java.util.List;

public final class ar implements C6127s, C6128z {
    public static final C6090b f30399a = C6090b.m28050a();
    public static final Rect f30400b = new Rect();
    public ai f30401A;
    public C2980a f30402B;
    public C2980a f30403C;
    public C2980a f30404D;
    public boolean f30405E;
    public final Activity f30406c;
    public final ab f30407d;
    public final ViewGroup f30408e;
    public final View f30409f;
    public final StoryFlowLayout f30410g;
    public final RecyclerView f30411h;
    public final MediaPlayerOverlayView f30412i;
    public final ay f30413j;
    public final av f30414k = new av(this);
    public final C2993b f30415l;
    public final C6077c f30416m;
    public final C2980a f30417n;
    public final C6141k f30418o;
    public final C0896s f30419p;
    public final C6137g f30420q;
    public final C3004a f30421r;
    public final Runnable f30422s;
    public final int f30423t;
    public final int f30424u;
    public final int f30425v;
    public at f30426w;
    public bb f30427x;
    public aj f30428y;
    public ao f30429z;

    public ar(Activity activity, ab abVar, ab abVar2, ViewGroup viewGroup, View view, StoryFlowLayout storyFlowLayout, RecyclerView recyclerView, int i, MediaPlayerOverlayView mediaPlayerOverlayView, C3006a c3006a, C2993b c2993b, C3000i c3000i, C6077c c6077c, C2980a c2980a, C6137g c6137g, C3004a c3004a) {
        this.f30406c = activity;
        this.f30407d = (ab) C6116b.m28100a((Object) abVar2);
        this.f30408e = (ViewGroup) C6116b.m28100a((Object) viewGroup);
        this.f30409f = (View) C6116b.m28100a((Object) view);
        this.f30410g = (StoryFlowLayout) C6116b.m28100a((Object) storyFlowLayout);
        this.f30411h = (RecyclerView) C6116b.m28100a((Object) recyclerView);
        this.f30412i = (MediaPlayerOverlayView) C6116b.m28100a((Object) mediaPlayerOverlayView);
        mediaPlayerOverlayView.setUiStateChangeListener(this);
        this.f30413j = new ay(this, (C3000i) C6116b.m28100a((Object) c3000i), (Activity) C6116b.m28100a((Object) activity), abVar, i);
        this.f30415l = (C2993b) C6116b.m28100a((Object) c2993b);
        this.f30416m = (C6077c) C6116b.m28100a((Object) c6077c);
        this.f30417n = (C2980a) C6116b.m28100a((Object) c2980a);
        this.f30418o = new C6141k(c3006a, c2993b, mediaPlayerOverlayView.f30337v);
        this.f30419p = aa.m5567b(Integer.valueOf(mediaPlayerOverlayView.f30309D));
        this.f30420q = c6137g;
        this.f30421r = c3004a;
        Resources resources = viewGroup.getResources();
        this.f30423t = resources.getDimensionPixelOffset(C6072e.pe_inline_player_margin);
        this.f30424u = resources.getDimensionPixelOffset(C6072e.pe_mini_timebar_height);
        this.f30425v = resources.getDimensionPixelOffset(C6072e.pe__mini_player_height);
        mediaPlayerOverlayView.f30332q.setItemAnimator(null);
        this.f30414k.f30438a.mo1144a(new ax(this, viewGroup.getContext()));
        this.f30422s = new au(this);
    }

    final void m28255a(C2980a c2980a) {
        this.f30415l.mo3231b(this.f30415l.mo3235d(c2980a));
    }

    public final void mo5299a(int i, int i2) {
        int i3;
        this.f30419p.mo1146b(Integer.valueOf(i2));
        m28248g();
        switch (i2) {
            case 0:
                this.f30401A = null;
                this.f30402B = null;
                this.f30403C = null;
                m28250i();
                m28251j();
                this.f30412i.f30339x.m27921a();
                this.f30418o.m28345c();
                this.f30404D = null;
                break;
            case 1:
            case 3:
            case 4:
            case 6:
            case 7:
                break;
            case 2:
                m28265e();
                break;
            case 5:
                av avVar = this.f30414k;
                if (!(avVar.f30441d == null || avVar.f30444g == -1)) {
                    avVar.f30449l.f30412i.f30332q.mo5181e(avVar.f30444g);
                }
                m28266f();
                break;
        }
        m28266f();
        m28249h();
        if (i2 == 4) {
            Context context = this.f30412i.getContext();
            this.f30412i.f30338w.setClickable(true);
            this.f30412i.f30338w.setContentDescription(context.getString(C6098k.pe__content_description_miniplayer));
        } else {
            this.f30412i.f30338w.setContentDescription(null);
            this.f30412i.f30338w.setClickable(false);
        }
        View view = this.f30412i.f30338w;
        if (i2 == 2) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        android.support.v4.view.ai.m1838b(view, i3);
        this.f30414k.f30438a.ad_();
        switch (i2) {
            case 0:
                this.f30405E = false;
                return;
            case 2:
                this.f30415l.mo3226a((C2980a) C6116b.m28100a(this.f30404D));
                this.f30405E = false;
                return;
            case 3:
                if (this.f30405E && i == 6) {
                    this.f30415l.mo3231b((C2980a) C6116b.m28100a(this.f30404D));
                    return;
                }
                return;
            case 4:
                this.f30403C = this.f30415l.mo3236d((C2980a) C6116b.m28100a(this.f30403C), (C2980a) C6116b.m28100a(this.f30404D));
                this.f30415l.mo3226a(this.f30404D);
                this.f30405E = false;
                return;
            case 5:
                if (this.f30405E && i == 4) {
                    this.f30415l.mo3231b((C2980a) C6116b.m28100a(this.f30404D));
                    return;
                }
                return;
            case 6:
                this.f30404D = this.f30415l.mo3233c((C2980a) C6116b.m28100a(this.f30403C), (C2980a) C6116b.m28100a(this.f30404D));
                this.f30415l.mo3226a(this.f30404D);
                this.f30405E = false;
                return;
            case 7:
                if (this.f30405E) {
                    this.f30415l.mo3231b(this.f30415l.mo3238e((C2980a) C6116b.m28100a(this.f30403C), (C2980a) C6116b.m28100a(this.f30404D)));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void mo5298a(int i) {
        m28248g();
        m28249h();
        if (this.f30403C == null) {
            return;
        }
        if (i == 4 || i == 1) {
            this.f30405E = true;
        }
    }

    public final ac mo5306b() {
        return this.f30419p;
    }

    private final void m28248g() {
        if (this.f30412i.f30309D == 6 && this.f30412i.f30315J == 0) {
            m28264d();
            f30399a.m28054a("hide story: media overlay full-screen", new Object[0]);
        } else if (this.f30407d.mo281a(C6089g.pe__text_media_fragment_container) == null) {
            m28263c();
            f30399a.m28054a("show story: media overlay non-full-screen and no text consumption fragment", new Object[0]);
        }
    }

    final void m28263c() {
        this.f30410g.removeCallbacks(this.f30422s);
        this.f30410g.setVisibility(0);
        this.f30409f.setVisibility(8);
    }

    final void m28264d() {
        this.f30410g.removeCallbacks(this.f30422s);
        this.f30410g.setVisibility(8);
        this.f30409f.setVisibility(0);
    }

    private final void m28249h() {
        int i = 1;
        boolean z = false;
        int i2 = this.f30412i.f30309D;
        if (i2 == 6) {
            boolean z2;
            if (this.f30412i.f30315J != 0) {
                z2 = false;
            }
            boolean z3 = z2;
            i = 0;
            z = z3;
        } else if (i2 != 2) {
            i = 2;
        }
        this.f30413j.f30457b.mo5284a(i);
        this.f30413j.f30457b.mo5286a(z);
    }

    private final void m28250i() {
        this.f30428y = null;
        this.f30427x = null;
        this.f30413j.m28292b();
        this.f30412i.f30334s.setText(null);
        m28246a(null, this.f30412i.f30335t);
        m28246a(null, this.f30412i.f30336u);
    }

    private final void m28251j() {
        this.f30429z = null;
        this.f30414k.m28279b();
        this.f30412i.f30326k.m27921a();
        this.f30412i.f30339x.m27921a();
        m28246a(null, this.f30412i.f30329n);
        m28246a(null, this.f30412i.f30330o);
    }

    final void m28265e() {
        ai aiVar;
        PEImageView pEImageView = this.f30412i.f30339x;
        PEImageView pEImageView2 = this.f30412i.f30326k;
        this.f30403C = null;
        this.f30404D = null;
        this.f30418o.m28345c();
        List emptyList = Collections.emptyList();
        if (this.f30428y != null && this.f30427x != null) {
            m28251j();
            ai aiVar2 = this.f30401A;
            this.f30403C = (C2980a) C6116b.m28100a(this.f30402B);
            this.f30404D = this.f30415l.mo3228b(this.f30403C, this.f30403C);
            ay ayVar = this.f30413j;
            String str = this.f30428y.b.e;
            ayVar.f30458c = str;
            ayVar.f30457b.mo5285a(str);
            ayVar.f30459d.f30412i.f30306A.setTimeProvider(ayVar.f30457b);
            this.f30412i.f30334s.setText(this.f30427x.k);
            m28246a(this.f30427x.f30544f, this.f30412i.f30335t);
            long j = this.f30428y.i;
            if (j <= 0) {
                m28246a(null, this.f30412i.f30336u);
            } else {
                m28246a(this.f30412i.f30336u.getResources().getQuantityString(C6094i.pe_x_views, j > 2147483647L ? Integer.MAX_VALUE : (int) j, new Object[]{Long.valueOf(j)}), this.f30412i.f30336u);
            }
            this.f30428y = null;
            this.f30427x = null;
            this.f30401A = null;
            this.f30402B = null;
            Collections.emptyList();
            aiVar = aiVar2;
        } else if (this.f30429z != null) {
            boolean z;
            boolean z2;
            m28250i();
            ai aiVar3 = this.f30401A;
            this.f30403C = (C2980a) C6116b.m28100a(this.f30402B);
            this.f30404D = this.f30415l.mo3228b(this.f30403C, this.f30403C);
            C0891h c0891h = this.f30414k;
            af[] afVarArr = this.f30429z.f30585d;
            boolean z3 = aiVar3 == null;
            ai aiVar4 = this.f30429z.n;
            List list = this.f30429z.t;
            C6116b.m28105a((Object[]) afVarArr);
            if (afVarArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            C6116b.m28106b(z);
            c0891h.f30448k = z3;
            if (c0891h.m28277a(afVarArr)) {
                c0891h.m28273a();
            } else {
                c0891h.f30441d = afVarArr;
                c0891h.f30442e = aiVar4;
                c0891h.f30443f = list;
                c0891h.f30444g = -1;
                c0891h.f30445h = -1;
                c0891h.f30449l.f30412i.f30306A.setTimeProvider(c0891h);
                if (c0891h.f30447j != null) {
                    c0891h.f30447j.m5530c();
                }
                C0886c a = new C0886c().m5532a(aa.m5566a(afVarArr), c0891h);
                a.f5625b.add((C0893t) C0917x.m5639a(c0891h.f30438a));
                c0891h.f30447j = new C0884a(a);
                c0891h.f30449l.f30412i.f30332q.setAdapter(c0891h.f30447j);
                ((C0884a) C6116b.m28100a(c0891h.f30447j)).m5528b();
                c0891h.m28274a(0);
            }
            ae aeVar = (ae) C6116b.m28100a(this.f30429z.o);
            int i = this.f30425v;
            int i2 = this.f30425v;
            if (this.f30426w != null) {
                i = Math.max(i, this.f30426w.f30431a.getWidth());
                i2 = Math.max(i2, this.f30426w.f30431a.getHeight());
            }
            C6047p c6047p = pEImageView.f30120a;
            if (i <= 0 || i2 <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            C6116b.m28106b(z2);
            c6047p.f30165j = i;
            c6047p.f30166k = i2;
            c6047p.m27945a();
            if (this.f30429z.m28353b()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            m28245a(aeVar, pEImageView, i2, new C6032d[0]);
            ae aeVar2 = this.f30429z.f30586e;
            if (aeVar2 != null) {
                m28245a(aeVar2, pEImageView2, 3, C6174r.f30688a);
            } else if (aeVar.f) {
                String str2 = aeVar.c;
                pEImageView2.m27924a(new StringBuilder(String.valueOf(str2).length() + 18).append(str2).append("=pf-fSoften=1,50,0").toString(), 3, 0.0f, C6174r.f30688a);
            }
            m28246a(this.f30429z.f30583b, this.f30412i.f30329n);
            m28246a(this.f30429z.f30584c, this.f30412i.f30330o);
            emptyList = this.f30429z.t;
            this.f30429z = null;
            this.f30401A = null;
            this.f30402B = null;
            aiVar = aiVar3;
        } else {
            aiVar = null;
        }
        if (aiVar != null) {
            this.f30418o.m28343a(aiVar, emptyList, true, aiVar, this.f30417n, this.f30403C);
        }
    }

    private static void m28245a(ae aeVar, PEImageView pEImageView, int i, C6032d... c6032dArr) {
        String str = aeVar.c;
        if (!aeVar.f) {
            i = 0;
        }
        pEImageView.m27924a(str, i, 0.0f, c6032dArr);
    }

    private static void m28246a(CharSequence charSequence, TextView textView) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final void mo5302a(bb bbVar, aj ajVar, ai aiVar, View view, C2980a c2980a) {
        int i = 1;
        C6116b.m28100a((Object) bbVar);
        C6116b.m28099a(ajVar.b.e);
        this.f30414k.m28279b();
        this.f30429z = null;
        this.f30405E = true;
        switch (this.f30412i.f30309D) {
            case 2:
                if (this.f30426w != null && this.f30426w.f30431a == view && ajVar.b.e.equals(this.f30413j.f30458c)) {
                    this.f30426w.m28269b();
                    this.f30426w = null;
                    this.f30415l.mo3231b((C2980a) C6116b.m28100a(this.f30404D));
                    this.f30412i.m28165c();
                    return;
                }
            case 5:
            case 6:
                if (ajVar.b.e.equals(this.f30413j.f30458c)) {
                    return;
                }
                break;
        }
        this.f30428y = ajVar;
        this.f30427x = bbVar;
        this.f30401A = aiVar;
        this.f30402B = c2980a;
        this.f30415l.mo3231b(c2980a);
        this.f30412i.f30340y.setVisibility(8);
        C6122h.m28132a(this.f30412i.f30307B, null);
        if (aiVar != null) {
            i = 3;
        }
        m28244a(view, i);
    }

    public final void mo5301a(ao aoVar, ai aiVar, View view, boolean z, SVGImageView sVGImageView, boolean z2, C2980a c2980a) {
        C6116b.m28100a((Object) aoVar);
        this.f30413j.m28292b();
        this.f30428y = null;
        this.f30405E = true;
        if (this.f30414k.m28277a(aoVar.f30585d) && (z2 || this.f30414k.m28287h())) {
            if (z2) {
                this.f30415l.mo3231b(this.f30415l.mo3239f(c2980a));
            }
            av avVar = this.f30414k;
            if (avVar.m28286g()) {
                avVar.m28284e().mo5276a();
                avVar.f30438a.ad_();
            } else if (avVar.m28287h()) {
                avVar.m28284e().mo5278b();
                avVar.f30438a.ad_();
            }
        }
        switch (this.f30412i.f30309D) {
            case 2:
                if (this.f30426w != null && this.f30426w.f30431a == view && this.f30414k.m28277a(aoVar.f30585d)) {
                    if (!z2) {
                        this.f30426w.m28269b();
                        this.f30426w = null;
                        this.f30415l.mo3231b((C2980a) C6116b.m28100a(this.f30404D));
                        this.f30412i.m28165c();
                        return;
                    }
                    return;
                }
            case 5:
            case 6:
                if (this.f30414k.m28277a(aoVar.f30585d)) {
                    return;
                }
                break;
        }
        this.f30429z = aoVar;
        this.f30401A = aiVar;
        this.f30402B = c2980a;
        this.f30415l.mo3231b(c2980a);
        this.f30412i.f30340y.setVisibility(8);
        View view2 = this.f30412i.f30307B;
        int dimensionPixelSize = view2.getResources().getDimensionPixelSize(z ? C6072e.pe_badge_size_large : C6072e.pe_badge_size_small);
        C6122h.m28132a(view2, C6143m.m28346a(view2.getContext(), 1, dimensionPixelSize));
        f30400b.set(0, 0, dimensionPixelSize, dimensionPixelSize);
        C6122h.m28131a(view2, f30400b);
        f30400b.set(0, 0, sVGImageView.getWidth(), sVGImageView.getHeight());
        this.f30411h.offsetDescendantRectToMyCoords(sVGImageView, f30400b);
        this.f30411h.offsetRectIntoDescendantCoords(view, f30400b);
        f30400b.inset(sVGImageView.getPaddingLeft(), sVGImageView.getPaddingTop());
        C6122h.m28131a(this.f30412i.f30340y, f30400b);
        m28244a(view, 4);
    }

    public final C0893t mo5297a() {
        return this.f30414k.f30438a;
    }

    public final boolean mo5305a(bb bbVar) {
        if (!bbVar.mo5334a()) {
            return false;
        }
        if (bbVar instanceof ao) {
            if (this.f30414k.m28286g() && this.f30414k.m28277a(((ao) bbVar).f30585d)) {
                return true;
            }
            return false;
        } else if (bbVar instanceof bn) {
            if (this.f30413j.m28293c() && TextUtils.equals(this.f30413j.f30458c, ((bn) bbVar).f30640a.b.e)) {
                return true;
            }
            return false;
        } else if ((bbVar instanceof bg) && this.f30413j.m28293c() && TextUtils.equals(this.f30413j.f30458c, ((bg) bbVar).f30631a.b.e)) {
            return true;
        } else {
            return false;
        }
    }

    private final void m28244a(View view, int i) {
        int i2;
        RecyclerView recyclerView = null;
        ViewParent parent = view.getParent();
        while (parent != this.f30411h) {
            RecyclerView recyclerView2;
            if (parent instanceof RecyclerView) {
                boolean z;
                if (recyclerView == null) {
                    z = true;
                } else {
                    z = false;
                }
                C6116b.m28104a(z, "Unexpected multiple intermediate RecyclerView");
                recyclerView2 = (RecyclerView) parent;
            } else {
                recyclerView2 = recyclerView;
            }
            ViewParent parent2 = parent.getParent();
            String str = "Unexpected non-descendant view";
            if (parent2 == null) {
                throw new NullPointerException(str);
            }
            parent = parent2;
            recyclerView = recyclerView2;
        }
        f30400b.set(0, 0, view.getWidth(), view.getHeight());
        this.f30411h.offsetDescendantRectToMyCoords(view, f30400b);
        int statusBarHeight = this.f30423t + (this.f30410g.getStatusBarHeight() + this.f30410g.getActionBarHeight());
        int a = m28247b(i) ? this.f30423t + this.f30412i.m28153a() : this.f30423t;
        if (f30400b.top < statusBarHeight) {
            i2 = f30400b.top - statusBarHeight;
        } else if (f30400b.bottom + a > this.f30411h.getHeight()) {
            i2 = a + (f30400b.bottom - this.f30411h.getHeight());
        } else {
            i2 = 0;
        }
        if (recyclerView != null) {
            if (f30400b.left < this.f30423t) {
                statusBarHeight = f30400b.left - this.f30423t;
            } else if (f30400b.right + this.f30423t > recyclerView.getWidth()) {
                statusBarHeight = (f30400b.right - recyclerView.getWidth()) + this.f30423t;
            }
            if (i2 == 0 || statusBarHeight != 0) {
                a = true;
            } else {
                a = 0;
            }
            if (!(a == 0 || this.f30426w == null)) {
                this.f30412i.m28160a(true);
            }
            m28266f();
            this.f30426w = new at(this, view, recyclerView, i);
            if (i2 != 0) {
                this.f30411h.b_(0, i2);
            }
            if (statusBarHeight != 0) {
                recyclerView.b_(statusBarHeight, 0);
            }
            if (a == 0) {
                this.f30426w.m28270c();
            }
        }
        statusBarHeight = 0;
        if (i2 == 0) {
        }
        a = true;
        this.f30412i.m28160a(true);
        m28266f();
        this.f30426w = new at(this, view, recyclerView, i);
        if (i2 != 0) {
            this.f30411h.b_(0, i2);
        }
        if (statusBarHeight != 0) {
            recyclerView.b_(statusBarHeight, 0);
        }
        if (a == 0) {
            this.f30426w.m28270c();
        }
    }

    static boolean m28247b(int i) {
        switch (i) {
            case 3:
            case 4:
                return true;
            default:
                return false;
        }
    }

    public final void mo5300a(bd bdVar, C2980a c2980a) {
        this.f30415l.mo3231b(c2980a);
        m28266f();
        this.f30412i.m28164b(bdVar.mo5347X());
        bdVar.aq = this.f30412i.f30309D != 0;
        this.f30407d.mo284a().mo324a(C6027b.text_fragment_in, C6027b.text_fragment_out, C6027b.text_fragment_in, C6027b.text_fragment_out).mo331b(C6089g.pe__text_media_fragment_container, bdVar).mo334c();
        this.f30410g.postDelayed(this.f30422s, 300);
    }

    public final void mo5304a(com.google.wireless.android.finsky.dfe.g.a.aa aaVar, C2980a c2980a) {
        this.f30415l.mo3231b(c2980a);
        CharSequence charSequence = aaVar.h;
        C6116b.m28099a(charSequence);
        try {
            this.f30420q.mo5326a(this.f30406c, charSequence);
        } catch (ActivityNotFoundException e) {
            Snackbar.m499a(this.f30408e, C6098k.pe__error_no_web_browser, 0).m501a(C6098k.pe__install_chrome, new as(this)).m493a();
        }
    }

    public final void mo5303a(com.google.wireless.android.finsky.dfe.g.a.aa aaVar) {
        String str = aaVar.h;
        C6116b.m28099a((CharSequence) str);
        this.f30420q.mo5327a(str);
    }

    final void m28266f() {
        if (this.f30426w != null) {
            this.f30426w.m28269b();
            this.f30426w = null;
        }
    }
}

package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.C0361r;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.jf;
import com.google.android.finsky.cv.p177a.ko;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.playcard.C3895x;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C2628h;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;
import com.google.android.finsky.stream.controllers.view.FlatCardCreatorAvatarClusterView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.layout.d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class bn extends ck implements OnClickListener, ad, cn, co, C1031w, C1158a {
    public final C4254d f14305d = C1473m.f7980a.ct();
    public C3676f f14306e;
    public Document f14307f;
    public int f14308g = -1;
    public ce f14309h = C2482j.m13283a(400);
    public boolean f14310i;
    public int f14311j;

    public bn() {
        C1473m.f7980a.cm();
    }

    public final void m13963a(Context context, C2599c c2599c, DfeToc dfeToc, C1254c c1254c, C1254c c1254c2, C1294w c1294w, C3748a c3748a, C1045b c1045b, String str, String str2, C2206c c2206c, boolean z, String str3, boolean z2, ff ffVar, ad adVar, C2495w c2495w, C3676f c3676f) {
        super.mo3029a(context, c2599c, dfeToc, c1254c, c1254c2, c1294w, c3748a, c1045b, str, str2, c2206c, z, str3, z2, ffVar, adVar, c2495w);
        this.f14306e = c3676f;
        this.f14311j = this.t.getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return ((bp) this.b).f14316c;
    }

    public final boolean mo2979f() {
        if (this.b == null || ((bp) this.b).f14315b == null || !((bp) this.b).f14315b.mo2861a() || ((bp) this.b).f14315b.f14908a == null) {
            return false;
        }
        if (((bp) this.b).f14315b.m14698m() != 0 || ((bp) this.b).f14315b.f14908a.aA()) {
            return true;
        }
        return false;
    }

    public final void mo3037c(View view, int i) {
        if (view != null) {
            if (((bp) this.b).f14319f == null) {
                ((bp) this.b).f14319f = new Bundle();
            } else {
                ((bp) this.b).f14319f.clear();
            }
            if (view instanceof CardClusterModuleLayoutV2) {
                ((CardClusterModuleLayoutV2) view).mo2995a(((bp) this.b).f14319f);
            } else if (view instanceof FlatCardClusterView) {
                ((FlatCardClusterView) view).mo3581a(((bp) this.b).f14319f);
            }
        }
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (z && this.b == null) {
            jf[] r = document.m14663r();
            if (r != null) {
                this.b = new bp();
                ((bp) this.b).f14314a = r[this.f14308g];
                bp bpVar = (bp) this.b;
                C1473m.f7980a.aO();
                bpVar.f14315b = C2721l.m14733a(this.x, ((bp) this.b).f14314a.f12778e, false, true);
                ((bp) this.b).f14315b.f14930f = true;
                ((bp) this.b).f14315b.m11918a((C1031w) this);
                ((bp) this.b).f14315b.m14699n();
            }
        }
    }

    public final void mo2976b(View view, int i) {
        this.f14310i = false;
        if (((bp) this.b).f14316c == C7582R.layout.flat_card_cluster || ((bp) this.b).f14316c == C7582R.layout.flat_card_avatar_cluster) {
            m13953a((FlatCardClusterView) view);
        } else if (((bp) this.b).f14316c == C7582R.layout.flat_card_creator_avatar_cluster) {
            String str;
            bd bdVar;
            bd bdVar2;
            this.f14310i = true;
            FlatCardClusterView flatCardClusterView = (FlatCardCreatorAvatarClusterView) view;
            r4 = ((bp) this.b).f14315b.f14908a;
            Document d = m13976d();
            if (TextUtils.isEmpty(((bp) this.b).f14314a.f12776c)) {
                str = r4.f14885a.f12100g;
            } else {
                str = ((bp) this.b).f14314a.f12776c;
            }
            r6 = this.t.getString(C7582R.string.more);
            if (d.m14647d(14)) {
                bdVar = (bd) d.m14644c(14).get(0);
            } else {
                bdVar = null;
            }
            if (bdVar == null) {
                if (d.m14647d(2)) {
                    bdVar = (bd) d.m14644c(2).get(0);
                } else {
                    bdVar = null;
                }
            }
            if (d.m14647d(4)) {
                bdVar2 = (bd) d.m14644c(4).get(0);
            } else {
                bdVar2 = null;
            }
            flatCardClusterView.m20998a(bdVar, bdVar2, str, r6, this.z.mo3625a(new bo(this, flatCardClusterView), d));
            m13953a(flatCardClusterView);
        } else if (((bp) this.b).f14316c == C7582R.layout.details_flat_featured_card || ((bp) this.b).f14316c == C7582R.layout.details_flat_featured_wide_card) {
            int i2;
            d dVar = (C3895x) ((FrameLayout) view).getChildAt(0);
            m13954a(dVar, 0);
            dVar.f19422c = C2581g.m13632a(((Document) ((bp) this.b).f14315b.m14679a(0, true)).f14885a.f12098e);
            Resources resources = dVar.getContext().getResources();
            if (dVar.q.dj().mo2294a(12636865)) {
                i2 = C7582R.bool.use_full_width_for_details_page_v2;
            } else {
                i2 = C7582R.bool.use_full_width_for_details_page;
            }
            if (resources.getBoolean(i2)) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) dVar.getLayoutParams();
                int a = dVar.f19420a.m9275a(resources);
                C0361r.m2050a(marginLayoutParams, a);
                C0361r.m2052b(marginLayoutParams, a);
                dVar.setLayoutParams(marginLayoutParams);
            }
        } else if (((bp) this.b).f14316c == C7582R.layout.vertically_stacked_module) {
            int i3;
            String str2;
            view.setBackgroundColor(this.t.getResources().getColor(C7582R.color.play_main_background));
            CardClusterModuleLayout cardClusterModuleLayout = (CardClusterModuleLayout) view;
            r2 = ((bp) this.b).f14315b;
            if (r2.m14707c()) {
                i3 = r2.f14908a.f14885a.f12099f;
            } else {
                i3 = 0;
            }
            r4 = ((bp) this.b).f14315b.f14908a;
            if (TextUtils.isEmpty(((bp) this.b).f14314a.f12776c)) {
                str2 = r4.f14885a.f12100g;
            } else {
                str2 = ((bp) this.b).f14314a.f12776c;
            }
            cardClusterModuleLayout.mo3015a(this, i3, str2, null, this.f14305d.m19769a(this.t, r4, ((bp) this.b).f14318e * cardClusterModuleLayout.mo3016b(cardClusterModuleLayout.getResources()), ((bp) this.b).f14314a.f12779f, true), ((bp) this.b).f14318e, this);
        } else if (((bp) this.b).f14316c == C7582R.layout.card_cluster_module_v2) {
            int i4;
            String str3;
            view.setBackgroundColor(this.t.getResources().getColor(C7582R.color.play_main_background));
            C2628h c2628h = (CardClusterModuleLayoutV2) view;
            r2 = ((bp) this.b).f14315b;
            if (r2.m14707c()) {
                i4 = r2.f14908a.f14885a.f12099f;
            } else {
                i4 = 0;
            }
            r4 = ((bp) this.b).f14315b.f14908a;
            if (TextUtils.isEmpty(((bp) this.b).f14314a.f12776c)) {
                str3 = r4.f14885a.f12100g;
            } else {
                str3 = ((bp) this.b).f14314a.f12776c;
            }
            r6 = this.f14305d.m19769a(this.t, r4, c2628h.getMaxItemsPerPage(), ((bp) this.b).f14314a.f12779f, true);
            int i5 = ((bp) this.b).f14317d;
            C3676f c3676f = this.f14306e;
            ff ffVar = this.H;
            Bundle bundle = ((bp) this.b).f14319f;
            ad parentNode = getParentNode();
            byte[] bArr = r4.f14885a.f12087D;
            Resources resources2 = c2628h.getResources();
            int max = Math.max(resources2.getDimensionPixelSize(C7582R.dimen.details_pack_row_padding), c2628h.f13956b.m13626a(resources2, C1473m.f7980a.av().m9286k(resources2)).f13772a);
            c2628h.m13759a(max);
            c2628h.m13748a(i4, str3, null, r6, this, max, null, null);
            c2628h.m13757a(this, c3676f.m17439a(i5), C1473m.f7980a.av().m9282g(resources2), ffVar, bundle, parentNode, bArr, null);
        } else {
            FinskyLog.m21669e("Unrecognized layoutResId", new Object[0]);
        }
    }

    private final void m13953a(FlatCardClusterView flatCardClusterView) {
        String str;
        int integer;
        Document document = ((bp) this.b).f14315b.f14908a;
        Resources resources = this.t.getResources();
        int c = C1473m.f7980a.av().m9278c(resources);
        bd bdVar = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
        if (TextUtils.isEmpty(((bp) this.b).f14314a.f12776c)) {
            str = document.f14885a.f12100g;
        } else {
            str = ((bp) this.b).f14314a.f12776c;
        }
        C1473m.f7980a.mo2027G();
        CharSequence a = C1542f.m8970a(document);
        String a2 = this.f14305d.m19769a(this.t, document, flatCardClusterView.getMaxItemsPerPage(), ((bp) this.b).f14314a.f12779f, true);
        flatCardClusterView.m17483a(document.f14885a.f12087D, this.I);
        if (C1473m.f7980a.dj().mo2294a(12636865)) {
            integer = resources.getInteger(C7582R.integer.flat_grid_column_count_in_details);
        } else {
            integer = C1473m.f7980a.av().m9284i(resources);
        }
        flatCardClusterView.m17486a(document.f14885a.f12099f, str, null, a2, this, bdVar, a, this.f14310i ? 1 : 0, this, this.f14306e.m17439a(((bp) this.b).f14317d), integer, c, this.H, ((bp) this.b).f14319f, null);
    }

    public final void mo2980h() {
        if (this.b != null && ((bp) this.b).f14315b != null) {
            ((bp) this.b).f14315b.m11922b((C1031w) this);
        }
    }

    public final void m_() {
        if (mo2979f()) {
            m13955j();
            m13956l();
            this.u.mo3033a(this, false);
        }
    }

    private final void m13955j() {
        Document document = ((bp) this.b).f14315b.f14908a;
        if (document.f14885a.f12087D != null) {
            C2482j.m13285a(this.f14309h, document.f14885a.f12087D);
        }
    }

    private final void m13956l() {
        boolean z = true;
        Document document = ((bp) this.b).f14315b.f14908a;
        if (document.aA()) {
            ((bp) this.b).f14316c = C7582R.layout.flat_card_creator_avatar_cluster;
            ((bp) this.b).f14317d = m13957m();
            return;
        }
        boolean z2;
        if (document.bg() == null || document.bg().f12937p == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            ((bp) this.b).f14316c = C7582R.layout.card_cluster_module_v2;
            ((bp) this.b).f14317d = C7582R.layout.play_card_artist;
            return;
        }
        if (document.bg() == null || document.bg().f12935n == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            ((bp) this.b).f14316c = C7582R.layout.card_cluster_module;
            ((bp) this.b).f14318e = 2;
            return;
        }
        z2 = (document.bg() == null || document.bg().f12936o == null) ? false : true;
        if (z2) {
            C1473m.f7980a.cm();
            if (C2581g.m13636a((Document) ((bp) this.b).f14315b.m14679a(0, true)) != null) {
                int i;
                if (C1473m.f7980a.mo2245h().m18477a(this.t.getResources()) < 4) {
                    z = false;
                }
                bp bpVar = (bp) this.b;
                if (z) {
                    i = C7582R.layout.details_flat_featured_wide_card;
                } else {
                    i = C7582R.layout.details_flat_featured_card;
                }
                bpVar.f14316c = i;
                return;
            }
            ((bp) this.b).f14316c = C7582R.layout.flat_card_cluster;
            ((bp) this.b).f14317d = m13957m();
        } else if (document.ax()) {
            ((bp) this.b).f14316c = C7582R.layout.flat_card_avatar_cluster;
            ((bp) this.b).f14317d = C7582R.layout.flat_card_avatar;
        } else {
            ko bg = document.bg();
            if (bg == null || bg.f12944w == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                ((bp) this.b).f14316c = C7582R.layout.card_cluster_module_v2;
                ((bp) this.b).f14317d = C7582R.layout.play_card_medium;
                return;
            }
            C2711x c2711x = ((bp) this.b).f14315b;
            if (c2711x.m14698m() <= 0 || ((Document) c2711x.m14679a(0, true)).f14885a.f12098e != 44) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                ((bp) this.b).f14316c = C7582R.layout.card_cluster_module_v2;
                ((bp) this.b).f14317d = C7582R.layout.play_card_small;
                return;
            }
            bg = document.bg();
            if (bg == null || bg.f12943v == null) {
                z = false;
            }
            if (z) {
                ((bp) this.b).f14318e = this.t.getResources().getInteger(C7582R.integer.vertical_cluster_max_rows);
                ((bp) this.b).f14316c = C7582R.layout.vertically_stacked_module;
                ((bp) this.b).f14317d = C7582R.layout.play_card_wide;
                return;
            }
            ((bp) this.b).f14316c = C7582R.layout.flat_card_cluster;
            ((bp) this.b).f14317d = m13957m();
        }
    }

    private static int m13957m() {
        return C1473m.f7980a.mo2245h().m18478a(false);
    }

    public void onClick(View view) {
        int i;
        C3748a c3748a = this.z;
        String str = ((bp) this.b).f14314a.f12779f;
        String str2 = ((bp) this.b).f14315b.f14908a.f14885a.f12100g;
        C2712a c2712a = ((bp) this.b).f14315b;
        if (c2712a.m14707c()) {
            i = c2712a.f14908a.f14885a.f12099f;
        } else {
            i = 0;
        }
        c3748a.mo3673a(str, str2, i, ((bp) this.b).f14315b.mo3121d(), this.v, (ad) this, this.J);
    }

    final Document m13976d() {
        if (this.f14307f == null) {
            this.f14307f = new Document(((bp) this.b).f14315b.f14908a.aB().f12363a);
        }
        return this.f14307f;
    }

    public final String mo1480a() {
        return ((bp) this.b).f14315b.f14928d;
    }

    public final int mo1477a(int i) {
        return ((bp) this.b).f14317d;
    }

    private final void m13954a(d dVar, int i) {
        C2711x c2711x = ((bp) this.b).f14315b;
        Document document = i < c2711x.m14698m() ? (Document) c2711x.m14679a(i, true) : null;
        if (document != null) {
            String str;
            if (c2711x.f14908a != null) {
                str = c2711x.f14908a.f14885a.f12096c;
            } else {
                str = c2711x.f14928d;
            }
            C1473m.f7980a.cr().m18515a(dVar, document, i, str, this.z, false, null, this, true, -1, false, false, this.J, true, this.f14310i, false);
            return;
        }
        dVar.d();
    }

    public final boolean mo1484b() {
        return false;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        C2711x c2711x = ((bp) this.b).f14315b;
        Document document = i < c2711x.m14698m() ? (Document) c2711x.m14679a(i, true) : null;
        C1473m.f7980a.bR();
        return af.m9223a(this.t, document, this.y, i2, i3, yVar, iArr);
    }

    public final int mo1486c() {
        return ((bp) this.b).f14315b.m14698m();
    }

    public final float mo1482b(int i) {
        C2711x c2711x = ((bp) this.b).f14315b;
        Document document = i < c2711x.m14698m() ? (Document) c2711x.m14679a(i, true) : null;
        if (document != null) {
            return C1617r.m9292a(document.f14885a.f12098e);
        }
        return 0.0f;
    }

    public ce getPlayStoreUiElement() {
        return this.f14309h;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final int mo3053a(int i, int i2) {
        return i2 == 0 ? this.f14311j : 0;
    }

    public final int mo3054i() {
        return 0;
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((bp) c2600d);
        if (this.b != null && ((bp) this.b).f14315b != null && !((bp) this.b).f14315b.mo2861a()) {
            ((bp) this.b).f14315b.m11918a((C1031w) this);
            ((bp) this.b).f14315b.m14699n();
        } else if (mo2979f()) {
            m13955j();
            m13956l();
        }
    }

    public final /* synthetic */ int mo1478a(View view) {
        return ((d) view).getThumbnail().getChildAt(0).getHeight();
    }

    public final /* synthetic */ int mo1483b(View view) {
        return ((d) view).getThumbnail().getChildAt(0).getWidth();
    }

    public final /* synthetic */ float mo1485c(View view) {
        return C1617r.m9292a(((Document) ((d) view).getData()).f14885a.f12098e);
    }
}

package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.da;
import com.google.android.finsky.cv.p177a.lr;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.google.android.finsky.layout.C3731y;
import com.google.android.finsky.layout.C3732z;
import com.google.android.finsky.layout.EditorialDescriptionSectionLegacy;
import com.google.android.finsky.layout.EditorialHeroSpacerView;
import com.google.android.finsky.layout.aa;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewHeader;
import com.google.android.play.image.C1294w;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C1167j extends CardRecyclerViewAdapter {
    public final Document f7202E;
    public final int f7203F;
    public final int f7204G;

    public C1167j(Context context, C3748a c3748a, C1294w c1294w, C4808a c4808a, Document document, C2730u c2730u, boolean z, ad adVar, C2495w c2495w, C2581g c2581g) {
        super(context, c3748a, c1294w, c4808a, c2730u, z, adVar, c2495w);
        Resources resources = context.getResources();
        this.f7203F = resources.getInteger(C7582R.integer.editorial_bucket_columns);
        this.f7204G = resources.getDimensionPixelSize(C7582R.dimen.play_collection_edge_padding_minus_card_half_spacing);
        this.f7202E = document;
    }

    protected final void mo1499a(Resources resources) {
        int i;
        C2712a c2712a = this.H.f14950a;
        if (c2712a.m14707c()) {
            i = c2712a.f14908a.f14885a.f12099f;
        } else {
            i = 0;
        }
        if (i == 3) {
            i = C7582R.layout.editorial_app_bucket_entry;
        } else {
            i = C7582R.layout.editorial_nonapp_bucket_entry;
        }
        this.w = i;
        this.v = resources.getInteger(C7582R.integer.editorial_bucket_columns);
    }

    protected final boolean mo1505e() {
        return false;
    }

    public final boolean mo1452c() {
        return true;
    }

    public final int mo1504d() {
        C1473m.f7980a.av();
        int a = C2581g.m13635a(this.J, C1611k.m9270l(this.J.getResources()), C2581g.m13636a(this.f7202E) != null, C2581g.m13632a(this.f7202E.f14885a.f12098e), C1611k.m9272n(this.J.getResources()));
        if (InsetsFrameLayout.f14024a) {
            return a - k.e(this.J);
        }
        return a;
    }

    public final void mo1447a(HeroGraphicView heroGraphicView) {
        CharSequence charSequence;
        Document document = this.f7202E;
        ad adVar = this.e;
        da aD = document.aD();
        heroGraphicView.setFillColor(C1607g.m9237a(aD, heroGraphicView.m13587a(document.f14885a.f12099f)));
        C2581g c2581g = heroGraphicView.f13719B;
        heroGraphicView.m13589a(C2581g.m13636a(document), document, false, adVar);
        TextView textView = heroGraphicView.f13726f;
        if (TextUtils.isEmpty(aD.f12132d)) {
            charSequence = aD.f12130b;
        } else {
            charSequence = aD.f12132d;
        }
        textView.setText(charSequence);
        heroGraphicView.f13726f.setVisibility(0);
        heroGraphicView.f13725e.setVisibility(0);
        heroGraphicView.m13598a(document.f14885a.f12100g);
        heroGraphicView.f13732l = true;
        heroGraphicView.f13734n = PlaySearchToolbar.a(heroGraphicView.getContext()) * 2;
    }

    public final C1155g mo1503c(ViewGroup viewGroup, int i) {
        View a;
        switch (i) {
            case 28:
                a = m6878a(C7582R.layout.editorial_text_description_legacy, viewGroup);
                break;
            case 29:
                a = m6878a(C7582R.layout.play_card_cluster_header, viewGroup);
                break;
            case 30:
                a = m6878a(C7582R.layout.bucket_row, viewGroup);
                for (int i2 = 0; i2 < this.f7203F; i2++) {
                    ViewGroup viewGroup2 = (ViewGroup) m6878a(C7582R.layout.editorial_video_footer_entry, (ViewGroup) a);
                    C1168k c1168k = new C1168k();
                    c1168k.f7205a = viewGroup2;
                    c1168k.f7206b = (HeroGraphicView) viewGroup2.findViewById(C7582R.id.videoimage);
                    c1168k.f7207c = (TextView) viewGroup2.findViewById(C7582R.id.video_text);
                    c1168k.f7208d = (TextView) viewGroup2.findViewById(C7582R.id.video_description);
                    viewGroup2.setTag(c1168k);
                    ((ViewGroup) a).addView(viewGroup2);
                }
                break;
            default:
                return super.mo1503c(viewGroup, i);
        }
        return new C1155g(a);
    }

    public final void mo1502a(C1155g c1155g, int i) {
        int i2 = c1155g.f3216f;
        View view = c1155g.a;
        int color;
        int color2;
        switch (i2) {
            case 28:
                EditorialDescriptionSectionLegacy editorialDescriptionSectionLegacy = (EditorialDescriptionSectionLegacy) view;
                color = editorialDescriptionSectionLegacy.getResources().getColor(C7582R.color.white);
                if (this.f7202E.m14647d(1)) {
                    color = C1607g.m9237a(this.f7202E.aD(), color);
                }
                C3748a c3748a = this.q;
                CharSequence A = this.f7202E.m14612A();
                editorialDescriptionSectionLegacy.f18158h = this.n;
                editorialDescriptionSectionLegacy.f18151a = c3748a;
                if (!TextUtils.isEmpty(A)) {
                    UrlSpanUtils.a(A, null, new C3731y(editorialDescriptionSectionLegacy));
                }
                editorialDescriptionSectionLegacy.f18153c.setVisibility(8);
                editorialDescriptionSectionLegacy.f18155e.m13581a(null, A, editorialDescriptionSectionLegacy.f18152b);
                editorialDescriptionSectionLegacy.f18155e.m13578a();
                editorialDescriptionSectionLegacy.f18154d.setVisibility(0);
                editorialDescriptionSectionLegacy.setOnClickListener(new C3732z(editorialDescriptionSectionLegacy));
                editorialDescriptionSectionLegacy.f18155e.setBodyClickListener(new aa(editorialDescriptionSectionLegacy));
                color2 = editorialDescriptionSectionLegacy.getResources().getColor(C1607g.m9240a(color) ? C7582R.color.play_fg_primary : C7582R.color.white);
                editorialDescriptionSectionLegacy.setBackgroundColor(color);
                editorialDescriptionSectionLegacy.f18155e.m13579a(color, color2);
                editorialDescriptionSectionLegacy.f18156f.setTextColor(color2);
                editorialDescriptionSectionLegacy.setVisibility(0);
                return;
            case 29:
                PlayCardClusterViewHeader playCardClusterViewHeader = (PlayCardClusterViewHeader) view;
                C2712a c2712a = this.H.f14950a;
                if (c2712a.m14707c()) {
                    color = c2712a.f14908a.f14885a.f12099f;
                } else {
                    color = 0;
                }
                playCardClusterViewHeader.m19879a(color, this.J.getString(C7582R.string.related_videos), null, null, null);
                playCardClusterViewHeader.setExtraHorizontalPadding(this.f7204G);
                return;
            case 30:
                BucketRowLayout bucketRowLayout = (BucketRowLayout) view;
                int f = (((i - super.mo1506f()) - super.mo1507g()) - 3) * this.f7203F;
                bucketRowLayout.setSameChildHeight(true);
                lr[] lrVarArr = this.f7202E.aD().f12135g;
                List arrayList = new ArrayList();
                for (int i3 = 0; i3 < this.f7203F; i3++) {
                    C1168k c1168k = (C1168k) bucketRowLayout.getChildAt(i3).getTag();
                    color = f + i3;
                    if (color > lrVarArr.length - 1) {
                        c1168k.f7205a.setVisibility(4);
                    } else {
                        lr lrVar = lrVarArr[color];
                        c1168k.f7205a.setVisibility(0);
                        c1168k.f7207c.setText(lrVar.f13052d);
                        c1168k.f7208d.setText(lrVar.f13053e);
                        Object obj = null;
                        for (bd bdVar : lrVar.f13051c) {
                            if (bdVar.f11857c == 3) {
                                obj = bdVar.f11860f;
                            } else if (bdVar.f11857c == 1) {
                                arrayList.add(bdVar);
                            }
                        }
                        if (!TextUtils.isEmpty(obj) && arrayList.size() > 0) {
                            HeroGraphicView heroGraphicView = c1168k.f7206b;
                            heroGraphicView.f13731k = false;
                            heroGraphicView.f13728h = 0.5625f;
                            bd a = af.m9221a(arrayList, 0, heroGraphicView.getResources().getDimensionPixelSize(C7582R.dimen.play_profile_header_height));
                            heroGraphicView.f13745y.m9288a(heroGraphicView.f13721a, a.f11860f, a.f11863i);
                            heroGraphicView.setBackgroundResource(0);
                            c1168k.f7206b.m13597a(obj, lrVar.f13052d, false, this.f7202E.f14885a.f12088E, this.f7202E.f14885a.f12099f, this.e, false, null);
                        }
                        arrayList.clear();
                    }
                }
                ai.m1823a(view, this.f7204G, view.getPaddingTop(), this.f7204G, view.getPaddingBottom());
                return;
            default:
                super.mo1502a(c1155g, i);
                return;
        }
    }

    public final int mo1040a(int i) {
        if (i == 0) {
            return 21;
        }
        int o = m7061o();
        Object obj = o > 0 ? 1 : null;
        int i2 = o + 1;
        if (i == 1) {
            return 28;
        }
        if (!(obj == null || mo1444i())) {
            int a = mo1039a();
            if (i == a - i2) {
                return 29;
            }
            if (i >= a - o) {
                return 30;
            }
        }
        return super.mo1040a(i - 1);
    }

    private final int m7061o() {
        return (int) Math.ceil(((double) this.f7202E.aD().f12135g.length) / ((double) this.f7203F));
    }

    public final int mo1507g() {
        return super.mo1507g() + 1;
    }

    protected final int mo1506f() {
        int f = super.mo1506f();
        int o = m7061o();
        if (o > 0) {
            return f + (o + 1);
        }
        return f;
    }

    protected final View mo1498a(ViewGroup viewGroup) {
        return m6878a(C7582R.layout.editorial_hero_spacer, viewGroup);
    }

    protected final void mo1500a(View view) {
        EditorialHeroSpacerView editorialHeroSpacerView = (EditorialHeroSpacerView) view;
        boolean z = C2581g.m13636a(this.f7202E) != null;
        float a = C2581g.m13632a(this.f7202E.f14885a.f12098e);
        editorialHeroSpacerView.f18160a = z;
        editorialHeroSpacerView.f18161b = a;
    }

    protected final void mo1501a(BucketRowLayout bucketRowLayout) {
        bucketRowLayout.setSameChildHeight(true);
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return mo1503c(viewGroup, i);
    }
}

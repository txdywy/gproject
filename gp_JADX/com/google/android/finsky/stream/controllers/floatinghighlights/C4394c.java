package com.google.android.finsky.stream.controllers.floatinghighlights;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.dt;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4255t;
import com.google.android.finsky.stream.base.horizontalclusters.C4258a;
import com.google.android.finsky.stream.base.horizontalclusters.C4265e;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4260a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4274i;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4393f;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4400c;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4401d;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4402e;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.FloatingHighlightsBannerClusterView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C4394c extends C4258a implements C4393f {
    public static final int[] f22285s = new int[]{20, 4, 0};
    public final C2288b f22286t;
    public final DfeToc f22287u;
    public final C2197a f22288v;
    public C4401d f22289w;

    public C4394c(Context context, C3748a c3748a, C1294w c1294w, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, C2288b c2288b, C0988c c0988c, ab abVar, C2206c c2206c, boolean z) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, afVar, f22285s, z, c1294w);
        this.f22286t = c2288b;
        this.f22287u = abVar.dn();
        this.f22288v = c2206c.mo2811a(c0988c.cY());
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.floating_highlights_banner_cluster;
    }

    public final void mo1510a(View view, int i) {
        List arrayList;
        Bundle bundle;
        super.mo1510a(view, i);
        Document document = this.g.f14908a;
        FloatingHighlightsBannerClusterView floatingHighlightsBannerClusterView = (FloatingHighlightsBannerClusterView) view;
        C4401d c4401d = this.f22289w;
        if (c4401d == null) {
            c4401d = new C4401d();
        }
        if (c4401d.f22345c == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = c4401d.f22345c;
            arrayList.clear();
        }
        for (Document document2 : document.m14643b()) {
            dt aJ = document2.aJ();
            if (aJ == null || aJ.f12218b == 0) {
                FinskyLog.m21669e("Floating highlights banner data incomplete. Cannot fill data for cluster view.", new Object[0]);
            } else {
                String str = null;
                int i2 = aJ.f12218b;
                if (i2 == 1 && !TextUtils.isEmpty(document2.f14885a.f12101h)) {
                    str = document2.f14885a.f12101h;
                } else if (i2 == 2 && !TextUtils.isEmpty(aJ.f12219c)) {
                    str = aJ.f12219c;
                } else if (i2 == 3) {
                    bl a = this.f22286t.m11788a(document2, this.f22287u, this.f22288v);
                    if (a != null) {
                        if (!TextUtils.isEmpty(a.f11917g)) {
                            str = a.f11917g;
                        }
                        if (!TextUtils.isEmpty(a.f11922l)) {
                            Object obj;
                            if (obj == null) {
                                obj = "";
                            }
                            String valueOf = String.valueOf(obj);
                            str = String.valueOf(a.f11922l);
                            str = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
                        }
                    }
                }
                arrayList.add(new C4402e(document2.f14885a.f12100g, str, i2));
            }
        }
        C4274i a2 = m19771a(c4401d.f22343a);
        cv cvVar = document.f14885a;
        byte[] bArr = document.f14885a.f12087D;
        c4401d.f22343a = a2;
        c4401d.f22344b = bArr;
        c4401d.f22345c = arrayList;
        this.f22289w = c4401d;
        if (this.D != null) {
            bundle = ((C4395d) this.D).f22290b;
        } else {
            bundle = null;
        }
        C4401d c4401d2 = this.f22289w;
        C4265e c4265e = this.f21522q;
        ad adVar = this.h;
        Resources resources = floatingHighlightsBannerClusterView.getContext().getResources();
        TypedValue typedValue = new TypedValue();
        resources.getValue(C7582R.dimen.floating_highlight_banner_child_width_multiplier, typedValue, true);
        int i3 = floatingHighlightsBannerClusterView.f22315a.m9284i(resources);
        float f = typedValue.getFloat();
        boolean z = resources.getBoolean(C7582R.bool.floating_highlight_banner_use_50_50_width_for_two_banner);
        int size = c4401d2.f22343a.f21571a.size();
        if (size == 1) {
            floatingHighlightsBannerClusterView.f22319e = C4400c.f22338a;
        } else if (size == 2 && z) {
            floatingHighlightsBannerClusterView.f22319e = C4400c.f22339b;
        } else {
            floatingHighlightsBannerClusterView.f22319e = new C4400c(i3, 0.25f, f);
        }
        floatingHighlightsBannerClusterView.f22316b.setChildWidthPolicy(0);
        floatingHighlightsBannerClusterView.f22316b.setColumnCount(floatingHighlightsBannerClusterView.f22319e.f22340c);
        floatingHighlightsBannerClusterView.f22316b.setChildPeekingAmount(floatingHighlightsBannerClusterView.f22319e.f22341d);
        floatingHighlightsBannerClusterView.f22316b.setBaseWidthMultiplier(floatingHighlightsBannerClusterView.f22319e.f22342e);
        floatingHighlightsBannerClusterView.f22316b.mo3606i(floatingHighlightsBannerClusterView.f22315a.m9275a(resources) - resources.getDimensionPixelOffset(C7582R.dimen.floating_highlight_banner_xmargin));
        floatingHighlightsBannerClusterView.f22318d = Math.max((resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_cluster_vpadding) * 2) + resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_card_min_height), FloatingHighlightsBannerClusterView.m20602a(floatingHighlightsBannerClusterView.f22320f, resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_title_width), (float) resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_item_card_title_size), (float) resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_item_card_subtitle_size), (float) resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_title_button_spacer), (float) resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_button_vpadding), (float) resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_button_stroke_width), (float) resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_subtitle_top_padding), c4401d2.f22345c) + ((resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_cluster_vpadding) * 2) + (resources.getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_titlegroup_vpadding) * 2)));
        floatingHighlightsBannerClusterView.f22316b.setLeadingItemGap(0);
        floatingHighlightsBannerClusterView.f22323i = adVar;
        if (c4401d2.f22344b != null) {
            floatingHighlightsBannerClusterView.f22322h.a(c4401d2.f22344b);
        }
        floatingHighlightsBannerClusterView.f22317c = this;
        floatingHighlightsBannerClusterView.f22316b.m19813a(c4401d2.f22343a, bundle, floatingHighlightsBannerClusterView, c4265e, this, floatingHighlightsBannerClusterView, floatingHighlightsBannerClusterView);
    }

    public final void mo1511b(View view, int i) {
        FloatingHighlightsBannerClusterView floatingHighlightsBannerClusterView = (FloatingHighlightsBannerClusterView) view;
        if (this.D == null) {
            this.D = new C4395d();
            ((C4395d) this.D).f22290b = new Bundle();
        }
        ((C4395d) this.D).f22290b.clear();
        floatingHighlightsBannerClusterView.m20605a(((C4395d) this.D).f22290b);
        floatingHighlightsBannerClusterView.Z_();
    }

    protected final C4260a mo4108b(int i) {
        boolean z;
        boolean z2 = true;
        Document document = (Document) this.g.m14679a(i, false);
        C2495w c2495w = this.i;
        C3748a c3748a = this.f;
        C2288b c2288b = this.f22286t;
        DfeToc dfeToc = this.f22287u;
        C2197a c2197a = this.f22288v;
        if (this.g.m14698m() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.g.m14698m() != 2) {
            z2 = false;
        }
        return new C4391a(document, c2495w, c3748a, c2288b, dfeToc, c2197a, z, z2);
    }

    public final void mo4187a(FloatingHighlightsBannerClusterView floatingHighlightsBannerClusterView) {
        if (this.D == null) {
            this.D = new C4395d();
            ((C4395d) this.D).f22290b = new Bundle();
        }
        ((C4395d) this.D).f22290b.clear();
        floatingHighlightsBannerClusterView.m20605a(((C4395d) this.D).f22290b);
    }

    public final /* synthetic */ C4255t mo4062s() {
        if (this.D == null) {
            this.D = new C4395d();
            ((C4395d) this.D).f22290b = new Bundle();
        }
        ((C4395d) this.D).a = m19772a(((C4395d) this.D).a);
        return (C4395d) this.D;
    }
}

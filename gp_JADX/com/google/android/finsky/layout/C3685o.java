package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.gq;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.a;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.wireless.android.finsky.dfe.nano.ac;
import com.google.wireless.android.finsky.dfe.nano.af;
import com.squareup.leakcanary.C7582R;
import java.util.Calendar;
import java.util.Date;

public final class C3685o {
    public gq f18589a;
    public C3686p f18590b = C3686p.UNKNOWN;
    public final int f18591c;
    public int f18592d;
    public HeroGraphicView f18593e;
    public ViewGroup f18594f;
    public View f18595g;
    public ViewGroup f18596h;
    public LayoutInflater f18597i;
    public ad f18598j;
    public final Context f18599k;

    public C3685o(int i, ViewGroup viewGroup, ViewGroup viewGroup2, LayoutInflater layoutInflater, Context context, ad adVar) {
        this.f18591c = i;
        this.f18594f = viewGroup;
        this.f18596h = viewGroup2;
        this.f18597i = layoutInflater;
        this.f18599k = context;
        this.f18598j = adVar;
    }

    public final void m17477a(gq gqVar, boolean z) {
        this.f18589a = gqVar;
        if (this.f18589a != null) {
            if (this.f18589a.f6902b != null && this.f18589a.f6902b.e() != null) {
                this.f18590b = C3686p.JPKR_EDITORIAL_PAGE;
            } else if (this.f18589a.f6902b != null && this.f18589a.f6902b.d() != null) {
                this.f18590b = C3686p.EDITORIAL_PAGE;
            } else if (this.f18589a.f6901a != null && this.f18589a.f6901a.f == 1) {
                this.f18590b = C3686p.TOPIC_PAGE;
            } else if (this.f18589a.f6901a == null || this.f18589a.f6901a.f != 2) {
                FinskyLog.m21669e("Unrecognized header style for view inflating from %s", this.f18589a);
                this.f18589a = new gq(new com.google.wireless.android.finsky.dfe.nano.ad(), null);
            } else {
                this.f18590b = C3686p.EDITORIAL_PAGE;
            }
        }
        if (this.f18593e == null) {
            ViewGroup viewGroup;
            switch (this.f18590b.ordinal()) {
                case 3:
                    m17475a(this.f18594f, this.f18597i);
                    viewGroup = this.f18594f;
                    this.f18595g = this.f18597i.inflate(C7582R.layout.jpkr_editorial_header_text_panel, viewGroup, false);
                    viewGroup.addView(this.f18595g);
                    this.f18595g.setVisibility(8);
                    Context context = viewGroup.getContext();
                    C1473m.f7980a.av();
                    int a = C2581g.m13634a(context, C1611k.m9270l(context.getResources()), 0.5625f, C1611k.m9272n(context.getResources()));
                    this.f18592d = this.f18599k.getResources().getDimensionPixelOffset(C7582R.dimen.jpkr_editorial_header_text_panel_height);
                    viewGroup.getLayoutParams().height = a + this.f18592d;
                    break;
                default:
                    m17475a(this.f18594f, this.f18597i);
                    break;
            }
            switch (this.f18590b.ordinal()) {
                case 0:
                case 1:
                    viewGroup = this.f18596h;
                    this.f18595g = this.f18597i.inflate(C7582R.layout.combined_header_title, viewGroup, false);
                    viewGroup.addView(this.f18595g);
                    this.f18595g.setVisibility(8);
                    this.f18592d = 0;
                    if (!(this.f18589a == null || this.f18589a.f6901a == null || this.f18591c == 4)) {
                        if (!TextUtils.isEmpty(this.f18589a.f6901a.b)) {
                            this.f18592d += this.f18599k.getResources().getDimensionPixelOffset(C7582R.dimen.combined_header_avatar_title_height);
                        }
                        if (!TextUtils.isEmpty(this.f18589a.f6901a.c)) {
                            this.f18592d += this.f18599k.getResources().getDimensionPixelOffset(C7582R.dimen.combined_header_avatar_title_height);
                            break;
                        }
                    }
                    break;
                case 2:
                    this.f18592d = 0;
                    if (!(!C1473m.f7980a.dj().mo2294a(12637756) || this.f18589a == null || this.f18589a.f6902b == null || this.f18589a.f6902b.d() == null)) {
                        bd[] bdVarArr = this.f18589a.f6902b.d().d;
                        if (bdVarArr != null && bdVarArr.length == 0) {
                            this.f18592d = this.f18599k.getResources().getDimensionPixelOffset(C7582R.dimen.combined_header_editorial_page_height);
                            break;
                        }
                    }
            }
        }
        if (z) {
            HeroGraphicView heroGraphicView;
            int dimensionPixelSize;
            bd bdVar;
            switch (this.f18590b.ordinal()) {
                case 0:
                case 1:
                    if (this.f18593e != null) {
                        this.f18593e.setVisibility(0);
                        if (this.f18591c == 4) {
                            heroGraphicView = this.f18593e;
                            com.google.wireless.android.finsky.dfe.nano.ad adVar = this.f18589a.f6901a;
                            int i = this.f18591c;
                            Resources resources = heroGraphicView.getResources();
                            heroGraphicView.f13726f.setText(adVar.b);
                            heroGraphicView.f13726f.setVisibility(0);
                            heroGraphicView.f13726f.setGravity(8388611);
                            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_collection_edge_padding_minus_card_half_spacing) + resources.getDimensionPixelSize(C7582R.dimen.play_cluster_section_header_inner_spacing);
                            ai.m1823a(heroGraphicView.f13726f, dimensionPixelSize, heroGraphicView.f13726f.getPaddingTop(), heroGraphicView.f13726f.getPaddingRight(), heroGraphicView.f13726f.getPaddingBottom());
                            heroGraphicView.f13726f.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.play_details_title_size));
                            heroGraphicView.f13725e.setVisibility(0);
                            if (!TextUtils.isEmpty(adVar.c)) {
                                heroGraphicView.f13727g.setText(adVar.c);
                                heroGraphicView.f13727g.setVisibility(0);
                                heroGraphicView.f13727g.setGravity(8388611);
                                ai.m1823a(heroGraphicView.f13727g, dimensionPixelSize, heroGraphicView.f13727g.getPaddingTop(), heroGraphicView.f13727g.getPaddingRight(), heroGraphicView.f13727g.getPaddingBottom());
                                heroGraphicView.f13727g.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.play_small_title_size));
                                heroGraphicView.f13726f.setPadding(heroGraphicView.f13726f.getPaddingLeft(), heroGraphicView.f13726f.getPaddingTop(), heroGraphicView.f13726f.getPaddingRight(), resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_title_vpadding_v2));
                            }
                            heroGraphicView.m13590a(adVar.d, true, i);
                        } else {
                            this.f18593e.m13590a(this.f18589a.f6901a.d, true, this.f18591c);
                        }
                    }
                    if (this.f18595g != null) {
                        CombinedHeaderTitleLayout combinedHeaderTitleLayout = (CombinedHeaderTitleLayout) this.f18595g;
                        if (this.f18591c != 4) {
                            CharSequence charSequence = this.f18589a.f6901a.b;
                            CharSequence charSequence2 = this.f18589a.f6901a.c;
                            bdVar = this.f18589a.f6901a.e;
                            if (TextUtils.isEmpty(charSequence)) {
                                combinedHeaderTitleLayout.f18099a.setVisibility(8);
                            } else {
                                combinedHeaderTitleLayout.f18099a.setText(charSequence);
                                combinedHeaderTitleLayout.f18099a.setVisibility(0);
                            }
                            if (TextUtils.isEmpty(charSequence2)) {
                                combinedHeaderTitleLayout.f18100b.setVisibility(8);
                            } else {
                                combinedHeaderTitleLayout.f18100b.setText(charSequence2);
                                combinedHeaderTitleLayout.f18100b.setVisibility(0);
                            }
                            if (bdVar != null) {
                                combinedHeaderTitleLayout.f18101c.setBitmapTransformation(a.a(combinedHeaderTitleLayout.getResources()));
                                C1473m.f7980a.ar().m9288a(combinedHeaderTitleLayout.f18101c, bdVar.f11860f, bdVar.f11863i);
                                combinedHeaderTitleLayout.f18101c.setVisibility(0);
                            } else {
                                combinedHeaderTitleLayout.f18101c.setVisibility(4);
                            }
                            combinedHeaderTitleLayout.setVisibility(0);
                            return;
                        }
                        combinedHeaderTitleLayout.setVisibility(8);
                        return;
                    }
                    return;
                case 2:
                    if (this.f18593e != null) {
                        heroGraphicView = this.f18593e;
                        ac d = this.f18589a.f6902b.d();
                        ad adVar2 = this.f18598j;
                        int i2 = this.f18591c;
                        bdVar = null;
                        bd[] bdVarArr2 = d.d;
                        int length = bdVarArr2.length;
                        dimensionPixelSize = 0;
                        bd bdVar2 = null;
                        while (dimensionPixelSize < length) {
                            bd bdVar3 = bdVarArr2[dimensionPixelSize];
                            if (bdVar3.f11857c != 1) {
                                if (bdVar3.f11857c == 3) {
                                    bdVar2 = bdVar3;
                                    bdVar3 = bdVar;
                                } else {
                                    bdVar3 = bdVar;
                                }
                            }
                            dimensionPixelSize++;
                            bdVar = bdVar3;
                        }
                        if (bdVar != null) {
                            heroGraphicView.setFillColor(C1607g.m9236a(bdVar, heroGraphicView.m13587a(i2)));
                            heroGraphicView.m13590a(bdVar, false, i2);
                        } else {
                            heroGraphicView.setCorpusForFill(i2);
                            heroGraphicView.setCorpusFillMode(2);
                        }
                        if (bdVar2 != null) {
                            heroGraphicView.m13597a(bdVar2.f11860f, "", false, false, i2, adVar2, false, null);
                        }
                        heroGraphicView.f13726f.setText(d.b);
                        heroGraphicView.f13726f.setVisibility(0);
                        heroGraphicView.f13725e.setVisibility(0);
                        heroGraphicView.m13598a(d.c);
                        heroGraphicView.f13732l = true;
                        heroGraphicView.f13734n = PlaySearchToolbar.a(heroGraphicView.getContext()) * 2;
                        return;
                    }
                    return;
                case 3:
                    JpkrEditorialHeaderTextPanel jpkrEditorialHeaderTextPanel = (JpkrEditorialHeaderTextPanel) this.f18594f.findViewById(C7582R.id.jpkr_editorial_page_header);
                    af e = this.f18589a.f6902b.e();
                    JpkrEditorialHeaderTextPanel.m17322a(jpkrEditorialHeaderTextPanel.f18250a, e.b);
                    JpkrEditorialHeaderTextPanel.m17322a(jpkrEditorialHeaderTextPanel.f18252c, e.c);
                    String str = null;
                    if (((e.a & 16) != 0 ? 1 : null) != null) {
                        DateFormat.getMediumDateFormat(jpkrEditorialHeaderTextPanel.getContext()).setTimeZone(Calendar.getInstance().getTimeZone());
                        str = jpkrEditorialHeaderTextPanel.getResources().getString(C7582R.string.jpkr_editorial_page_last_updated, new Object[]{r1.format(new Date(e.g))});
                    }
                    JpkrEditorialHeaderTextPanel.m17322a(jpkrEditorialHeaderTextPanel.f18251b, str);
                    a = jpkrEditorialHeaderTextPanel.getResources().getColor(C7582R.color.jpkr_editorial_page_default_background_color);
                    if (((e.a & 4) != 0 ? 1 : null) != null) {
                        try {
                            a = Color.parseColor(e.e);
                            jpkrEditorialHeaderTextPanel.f18253d = true;
                        } catch (IllegalArgumentException e2) {
                            FinskyLog.m21669e("Invalid color for JP/KR editorial page header background: %s", e.e);
                        }
                    }
                    jpkrEditorialHeaderTextPanel.setBackgroundColor(a);
                    a = jpkrEditorialHeaderTextPanel.getResources().getColor(C7582R.color.jpkr_editorial_page_default_text_color);
                    if (((e.a & 8) != 0 ? 1 : null) != null) {
                        try {
                            a = Color.parseColor(e.f);
                        } catch (IllegalArgumentException e3) {
                            FinskyLog.m21669e("Invalid color for JP/KR editorial page header text color: %s", e.f);
                        }
                    }
                    jpkrEditorialHeaderTextPanel.m17323a(a);
                    jpkrEditorialHeaderTextPanel.setVisibility(0);
                    if (this.f18593e != null) {
                        this.f18593e.setVisibility(0);
                        this.f18593e.setOnLoadedListener(jpkrEditorialHeaderTextPanel);
                        this.f18593e.m13590a(this.f18589a.f6902b.e().d, true, this.f18591c);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private final void m17475a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.f18593e = (HeroGraphicView) layoutInflater.inflate(C7582R.layout.hero_graphic, viewGroup, false);
        viewGroup.addView(this.f18593e);
        this.f18593e.setVisibility(8);
    }

    public final void m17476a(int i) {
        if (this.f18593e != null) {
            this.f18593e.setVisibility(i);
        }
        if (this.f18595g != null) {
            this.f18595g.setVisibility(i);
        }
    }
}

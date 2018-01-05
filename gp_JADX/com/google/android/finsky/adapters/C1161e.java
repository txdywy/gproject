package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layout.CategoryRow;
import com.google.android.finsky.layout.play.PlayQuickLinksBannerView;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.a;
import com.google.wireless.android.finsky.dfe.nano.ag;
import com.google.wireless.android.finsky.dfe.nano.x;
import com.squareup.leakcanary.C7582R;
import java.util.HashSet;

public final class C1161e extends C1137h {
    public final C2495w f7165A;
    public Bundle f7166B;
    public final LayoutInflater f7167c;
    public final C3748a f7168d;
    public final int f7169e;
    public final int f7170f;
    public final DfeToc f7171g;
    public final C1294w f7172h;
    public final x[] f7173i;
    public final ag[] f7174j;
    public final String f7175k;
    public final String f7176l;
    public final ad f7177m;
    public final Context f7178n;
    public final boolean f7179o;
    public final int f7180p;
    public final int f7181q;
    public final int f7182r;
    public final int f7183s;
    public final int f7184t;
    public final int f7185u;
    public final int f7186v;
    public final int f7187w;
    public final C1165h f7188x;
    public final C1163g f7189y;
    public final HashSet f7190z;

    public C1161e(Context context, x[] xVarArr, C3748a c3748a, int i, int i2, DfeToc dfeToc, C1294w c1294w, ag[] agVarArr, String str, String str2, int i3, ad adVar, C2495w c2495w) {
        this.f7167c = LayoutInflater.from(context);
        this.f7173i = xVarArr;
        this.f7168d = c3748a;
        this.f7169e = i;
        this.f7170f = i2;
        this.f7171g = dfeToc;
        this.f7172h = c1294w;
        this.f7175k = str;
        this.f7176l = str2;
        this.f7178n = context;
        this.f7165A = c2495w;
        Resources resources = this.f7178n.getResources();
        this.f7179o = resources.getBoolean(C7582R.bool.mw_display_categories_in_two_columns);
        this.f7174j = agVarArr;
        this.f7180p = (this.f7174j != null ? this.f7174j.length : 0) > 1 ? 1 : 0;
        this.f7184t = (this.f7180p * 2) + 5;
        this.f7181q = FinskyHeaderListLayout.m16068a(context, i3, 0);
        this.f7182r = resources.getDimensionPixelSize(C7582R.dimen.card_list_vpadding);
        this.f7185u = resources.getDimensionPixelSize(C7582R.dimen.category_list_vertical_margin);
        this.f7186v = resources.getDimensionPixelSize(C7582R.dimen.category_list_horizontal_margin);
        this.f7183s = this.f7185u * 2;
        this.f7177m = adVar;
        if (resources.getBoolean(C7582R.bool.use_wide_layout)) {
            this.f7187w = (C1611k.m9270l(resources) - C1473m.f7980a.av().m9281f(resources)) / 2;
        } else {
            this.f7187w = this.f7186v;
        }
        this.f7188x = new C1165h(context);
        this.f7189y = new C1163g(this);
        this.f7190z = new HashSet();
    }

    public final int mo1039a() {
        return ((m7021b() ? 1 : 0) + (this.f7173i.length + this.f7184t)) + 2;
    }

    public final int mo1040a(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return 1;
        }
        i2--;
        if (this.f7180p > 0) {
            if (i2 == 0) {
                return 2;
            }
            i2--;
            if (i2 == 0) {
                return 3;
            }
            i2 -= this.f7180p;
        }
        if (i2 == 0) {
            return 4;
        }
        i2--;
        if (i2 == 0) {
            return 5;
        }
        i2--;
        if (i2 == 0) {
            return 8;
        }
        i2--;
        if (i2 >= 0 && i2 < this.f7173i.length) {
            return 6;
        }
        i2 -= this.f7173i.length;
        if (m7021b()) {
            if (i2 == 0) {
                return 7;
            }
            i2--;
        }
        if (i2 != 0) {
            return 9;
        }
        return 8;
    }

    private final View m7020a(int i, ViewGroup viewGroup) {
        return this.f7167c.inflate(i, viewGroup, false);
    }

    public final void m7027a(C1155g c1155g) {
        int i = c1155g.f3216f;
        View view = c1155g.a;
        if (i == 3) {
            PlayQuickLinksBannerView playQuickLinksBannerView = (PlayQuickLinksBannerView) view;
            if (this.f7166B == null) {
                this.f7166B = new Bundle();
            } else {
                this.f7166B.clear();
            }
            playQuickLinksBannerView.m17547a(this.f7166B);
        }
        if (view instanceof ae) {
            ((ae) view).Z_();
        }
    }

    private final boolean m7021b() {
        return this.f7179o && this.f7173i.length % 2 == 1;
    }

    public final boolean m7028e(int i) {
        if (!this.f7179o) {
            return false;
        }
        int a = mo1040a(i);
        if (a == 6 || a == 7) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1155g c1155g = (C1155g) frVar;
        this.f7190z.add(c1155g);
        int i2 = c1155g.f3216f;
        View view = c1155g.a;
        switch (i2) {
            case 2:
                ((TextView) view).setText(this.f7175k);
                return;
            case 3:
                PlayQuickLinksBannerView playQuickLinksBannerView = (PlayQuickLinksBannerView) view;
                playQuickLinksBannerView.mo3606i(this.f7187w);
                ad adVar = this.f7177m;
                if (playQuickLinksBannerView.aG == null) {
                    playQuickLinksBannerView.aG = C2482j.m13283a(429);
                    C2482j.m13285a(playQuickLinksBannerView.aG, null);
                }
                playQuickLinksBannerView.aH = adVar;
                this.f7189y.f7194a = playQuickLinksBannerView;
                playQuickLinksBannerView.m17549a(this.f7189y, this.f7188x, C1473m.f7980a.av().m9282g(this.f7178n.getResources()), true, null, this.f7166B, null, null);
                return;
            case 4:
                ((TextView) view).setText(this.f7176l);
                return;
            case 6:
                CategoryRow categoryRow = (CategoryRow) view;
                x xVar = this.f7173i[i - this.f7184t];
                i2 = this.f7169e;
                ad adVar2 = this.f7177m;
                categoryRow.f18094a.setText(xVar.c);
                if (!(xVar.d == null || TextUtils.isEmpty(xVar.d.f11860f))) {
                    String str = xVar.d.f11860f;
                    C1473m.f7980a.be();
                    i2 = C1608h.m9243a(categoryRow.getContext(), i2);
                    if (xVar.d != null) {
                        i2 = C1607g.m9236a(xVar.d, i2);
                    }
                    categoryRow.f18095b.setBitmapTransformation(a.b(categoryRow.getResources(), i2));
                    C1473m.f7980a.ar().m9288a(categoryRow.f18095b, str, true);
                }
                categoryRow.f18097d = adVar2;
                C2482j.m13285a(categoryRow.f18096c, xVar.f);
                categoryRow.f18097d.mo1219a(categoryRow);
                categoryRow.setOnClickListener(new C1162f(this, xVar, categoryRow));
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        View view = null;
        switch (i) {
            case 0:
                view = m7020a((int) C7582R.layout.header_list_spacer, viewGroup);
                view.getLayoutParams().height = this.f7181q;
                break;
            case 1:
                view = m7020a((int) C7582R.layout.vertical_spacer, viewGroup);
                view.getLayoutParams().height = this.f7182r;
                break;
            case 2:
            case 4:
                view = m7020a((int) C7582R.layout.category_subheader, viewGroup);
                break;
            case 3:
                view = m7020a((int) C7582R.layout.play_quicklinks_banner, viewGroup);
                break;
            case 5:
                view = m7020a((int) C7582R.layout.vertical_spacer, viewGroup);
                view.getLayoutParams().height = this.f7185u;
                break;
            case 6:
                view = m7020a((int) C7582R.layout.category_item, viewGroup);
                break;
            case 7:
                view = m7020a((int) C7582R.layout.category_spacer, viewGroup);
                view.getLayoutParams().height = this.f7178n.getResources().getDimensionPixelSize(C7582R.dimen.category_row_height_v2);
                break;
            case 8:
                view = m7020a((int) C7582R.layout.category_spacer, viewGroup);
                break;
            case 9:
                view = m7020a((int) C7582R.layout.vertical_spacer, viewGroup);
                view.getLayoutParams().height = this.f7183s;
                break;
        }
        return new C1155g(view);
    }
}

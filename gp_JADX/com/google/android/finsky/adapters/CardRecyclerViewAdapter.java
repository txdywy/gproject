package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ai;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ff;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cc;
import com.google.android.finsky.cv.p177a.ko;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dx.C1054h;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.layout.play.PlayHighlightsBannerView;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.stream.base.playcluster.C2628h;
import com.google.android.finsky.stream.base.playcluster.C4283e;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterView;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewHeader;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CardRecyclerViewAdapter extends C1139m implements gp, C1054h, ab {
    public ff f7102A;
    public Map f7103B;
    public C3676f f7104C;
    public final C2910a f7105D = C1473m.f7980a.au();
    public final C1294w f7106c;
    public final int f7107d;
    public final ad f7108e;
    public final int f7109f;
    public final boolean f7110g;
    public final boolean f7111h;
    public final C4283e f7112i;
    public final String f7113j;
    public final boolean f7114k;
    public final boolean f7115l;
    public final String f7116m;
    public final C2495w f7117n;
    public boolean f7118o = true;
    public final C4808a f7119p;
    public final C3748a f7120q;
    public final int f7121r;
    public final ah f7122s;
    public final int f7123t;
    public ArrayList f7124u = new ArrayList();
    public int f7125v;
    public int f7126w;
    public boolean f7127x;
    public boolean f7128y;
    public HashSet f7129z;

    public class ItemEntry implements Parcelable {
        public static final Creator CREATOR = new C1160d();
        public int f7093a = -1;
        public int f7094b = -1;
        public int f7095c = -1;
        public int f7096d = -1;
        public int f7097e = -1;

        public final boolean m6875a() {
            return this.f7095c == 6;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7093a);
            parcel.writeInt(this.f7094b);
            parcel.writeInt(this.f7095c);
            parcel.writeInt(this.f7096d);
            parcel.writeInt(this.f7097e);
        }
    }

    public CardRecyclerViewAdapter(Context context, C3748a c3748a, C1294w c1294w, C4808a c4808a, C2730u c2730u, boolean z, ad adVar, C2495w c2495w) {
        boolean z2;
        String str;
        ArrayList arrayList;
        int dimensionPixelSize;
        boolean z3 = true;
        super(context, c2730u);
        C1611k av = C1473m.f7980a.av();
        Resources resources = context.getResources();
        this.f7120q = c3748a;
        this.f7106c = c1294w;
        this.f7119p = c4808a;
        this.f7113j = null;
        this.f7109f = av.m9282g(resources);
        this.f7112i = new C4283e();
        C1611k.m9271m(resources);
        resources.getDimensionPixelSize(C7582R.dimen.play_min_height_for_large_templates);
        C1473m.f7980a.mo2245h();
        this.f7110g = this.J.getResources().getBoolean(C7582R.bool.play_can_use_mini_cards);
        this.f7122s = null;
        this.f7123t = 2;
        this.f7117n = c2495w;
        C1473m.f7980a.mo2245h();
        this.f7107d = av.m9275a(resources);
        this.f7108e = adVar;
        Document document = this.H.f14950a.f14908a;
        if (document != null) {
            if (document.f14885a.f12111r == null) {
                z2 = false;
            } else {
                z2 = document.f14885a.f12111r.f12021g;
            }
            if (z2) {
                z2 = true;
                this.f7115l = z2;
                if (document == null) {
                    str = document.f14885a.f12096c;
                } else {
                    C2712a c2712a = this.H.f14950a;
                    str = c2712a instanceof C2720j ? ((C2720j) c2712a).f14928d : null;
                }
                this.f7116m = str;
                this.f7111h = false;
                mo1499a(resources);
                arrayList = new ArrayList();
                if (TextUtils.isEmpty(this.f7113j)) {
                    z3 = false;
                }
                this.f7114k = z3;
                this.f7128y = this.J.getResources().getBoolean(C7582R.bool.use_small_as_listing_card);
                if (C1473m.f7980a.dj().mo2294a(12617606)) {
                    dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.card_list_vpadding);
                } else {
                    dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.finsky_scrolling_tabs_padding_under_tabstrip_highlights_card);
                }
                this.f7121r = dimensionPixelSize;
                this.f7129z = new HashSet();
                this.f7103B = new HashMap();
                this.f7104C = new C3676f(context);
                if (!z) {
                    m6899o();
                }
                this.f7105D.m15182a((C1054h) this);
                if (C1473m.f7980a.dj().mo2294a(12631899)) {
                    C1473m.f7980a.cr().m18512a();
                }
            }
        }
        z2 = false;
        this.f7115l = z2;
        if (document == null) {
            C2712a c2712a2 = this.H.f14950a;
            if (c2712a2 instanceof C2720j) {
            }
        } else {
            str = document.f14885a.f12096c;
        }
        this.f7116m = str;
        this.f7111h = false;
        mo1499a(resources);
        arrayList = new ArrayList();
        if (TextUtils.isEmpty(this.f7113j)) {
            z3 = false;
        }
        this.f7114k = z3;
        this.f7128y = this.J.getResources().getBoolean(C7582R.bool.use_small_as_listing_card);
        if (C1473m.f7980a.dj().mo2294a(12617606)) {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.card_list_vpadding);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.finsky_scrolling_tabs_padding_under_tabstrip_highlights_card);
        }
        this.f7121r = dimensionPixelSize;
        this.f7129z = new HashSet();
        this.f7103B = new HashMap();
        this.f7104C = new C3676f(context);
        if (z) {
            m6899o();
        }
        this.f7105D.m15182a((C1054h) this);
        if (C1473m.f7980a.dj().mo2294a(12631899)) {
            C1473m.f7980a.cr().m18512a();
        }
    }

    private static String m6895a(String str) {
        String valueOf = String.valueOf("CardRecyclerViewAdapter.rowClusterScrollStatePrefix.");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    protected void mo1499a(Resources resources) {
        Document document = this.H.f14950a.f14908a;
        int i = (!this.f7110g || this.f7111h || this.f7115l) ? 0 : 1;
        C1552e dj = C1473m.f7980a.dj();
        if (document == null) {
            FinskyLog.m21669e("Container Document was null", new Object[0]);
        }
        if (this.f7111h) {
            this.f7126w = C7582R.layout.play_card_small;
            this.f7125v = this.f7109f;
        } else if (i != 0) {
            this.f7126w = C7582R.layout.play_card_mini;
            this.f7125v = resources.getInteger(C7582R.integer.related_items_per_row);
        } else if (document != null && document.f14885a.f12099f == 3 && dj.mo2294a(12607749) && this.f7115l) {
            this.f7126w = C7582R.layout.play_card_flat_list;
            this.f7125v = 1;
        } else {
            this.f7126w = C7582R.layout.play_card_listing;
            this.f7125v = C1473m.f7980a.av().m9283h(resources);
        }
    }

    @Deprecated
    protected int mo1504d() {
        if (this.f7122s != null) {
            int ah = this.f7122s.ah();
            if (ah > 0) {
                return ah;
            }
        }
        return FinskyHeaderListLayout.m16068a(this.J, this.f7123t, 0);
    }

    public boolean mo1452c() {
        return false;
    }

    public void mo1447a(HeroGraphicView heroGraphicView) {
        List c = this.H.f14950a.f14908a.m14644c(14);
        if (c == null || c.isEmpty()) {
            heroGraphicView.f13721a.setVisibility(8);
            return;
        }
        heroGraphicView.f13721a.setVisibility(0);
        heroGraphicView.f13745y.m9288a(heroGraphicView.f13721a, ((bd) c.get(0)).f11860f, ((bd) c.get(0)).f11863i);
        heroGraphicView.f13728h = 0.0f;
    }

    protected boolean mo1505e() {
        return true;
    }

    public final void mo1450a(PlayRecyclerView playRecyclerView, Bundle bundle) {
        int i = 0;
        super.mo1450a(playRecyclerView, bundle);
        if (this.f7124u.size() != 0) {
            int j;
            int top;
            if (playRecyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                j = ((LinearLayoutManager) playRecyclerView.getLayoutManager()).m3124j();
            } else {
                j = 0;
            }
            if (playRecyclerView.getChildCount() > 0) {
                View childAt = playRecyclerView.getChildAt(0);
                top = childAt.getTop();
                i = childAt.getHeight();
            } else {
                top = 0;
            }
            int a = m6894a(top, i, j) - m6904t();
            bundle.putInt("CardRecyclerViewAdapter.firstVisibleRow", j);
            bundle.putInt("CardRecyclerViewAdapter.firstVisibleItemEntry", a);
            bundle.putInt("CardRecyclerViewAdapter.rowPixelOffset", top);
            bundle.putInt("CardRecyclerViewAdapter.rowPixelHeight", i);
            bundle.putInt("CardRecyclerViewAdapter.looseItemColumnCount", this.f7125v);
            bundle.putInt("CardRecyclerViewAdapter.columnCount", this.f7109f);
            bundle.putInt("CardRecyclerViewAdapter.prependedRowsCount", mo1507g());
            bundle.putParcelableArrayList("CardRecyclerViewAdapter.itemEntriesList", this.f7124u);
            bundle.putBoolean("CardRecyclerViewAdapter.filterToggleButtonState", this.f7118o);
            Iterator it = this.f7129z.iterator();
            while (it.hasNext()) {
                m6897c(((C1155g) it.next()).a);
            }
            for (Entry entry : this.f7103B.entrySet()) {
                bundle.putBundle((String) entry.getKey(), (Bundle) entry.getValue());
            }
        }
    }

    public final void mo1451b(PlayRecyclerView playRecyclerView, Bundle bundle) {
        this.f7103B.clear();
        for (String str : bundle.keySet()) {
            if (str.startsWith("CardRecyclerViewAdapter.rowClusterScrollStatePrefix.") || str.equals("CardRecyclerViewAdapter.tagLinksScrollState") || str.equals("CardRecyclerViewAdapter.highlightsScrollState")) {
                this.f7103B.put(str, bundle.getBundle(str));
            }
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("CardRecyclerViewAdapter.itemEntriesList");
        int i = bundle.getInt("CardRecyclerViewAdapter.firstVisibleRow");
        int i2 = bundle.getInt("CardRecyclerViewAdapter.firstVisibleItemEntry", -1);
        int i3 = bundle.getInt("CardRecyclerViewAdapter.rowPixelOffset");
        int i4 = bundle.getInt("CardRecyclerViewAdapter.rowPixelHeight");
        int i5 = bundle.getInt("CardRecyclerViewAdapter.columnCount", -1);
        int i6 = bundle.getInt("CardRecyclerViewAdapter.looseItemColumnCount", -1);
        int i7 = bundle.getInt("CardRecyclerViewAdapter.prependedRowsCount", -1);
        this.f7118o = bundle.getBoolean("CardRecyclerViewAdapter.filterToggleButtonState");
        if (parcelableArrayList == null || parcelableArrayList.size() == 0 || i6 == -1 || i7 == -1 || i5 == -1) {
            m6899o();
            this.f3433a.m3638b();
            this.H.f14950a.m14699n();
            super.mo1451b(playRecyclerView, bundle);
            return;
        }
        Object obj = (i5 == this.f7109f && i6 == this.f7125v && i7 == mo1507g()) ? null : 1;
        if (obj != null) {
            int i8;
            ItemEntry itemEntry;
            int i9;
            for (i6 = 0; i6 < parcelableArrayList.size(); i6 = i9 + 1) {
                if (((ItemEntry) parcelableArrayList.get(i6)).m6875a()) {
                    i8 = 0;
                    i9 = i6;
                    for (i7 = i6; i7 < parcelableArrayList.size(); i7++) {
                        itemEntry = (ItemEntry) parcelableArrayList.get(i7);
                        if (!itemEntry.m6875a()) {
                            break;
                        }
                        i8 += (itemEntry.f7094b + 1) - itemEntry.f7093a;
                        i9 = i7;
                    }
                    i5 = this.f7125v;
                    i7 = ((i8 + i5) - 1) / i5;
                    i6 = ((ItemEntry) parcelableArrayList.get(i6)).f7093a;
                    i8 = ((ItemEntry) parcelableArrayList.get(i9)).f7094b;
                    for (i5 = 0; i5 < i7; i5++) {
                        int min = Math.min((this.f7125v + i6) - 1, i8);
                        ItemEntry itemEntry2 = new ItemEntry();
                        itemEntry2.f7093a = i6;
                        itemEntry2.f7094b = min;
                        itemEntry2.f7095c = 6;
                        this.f7124u.add(itemEntry2);
                        i6 += this.f7125v;
                    }
                } else {
                    this.f7124u.add((ItemEntry) parcelableArrayList.get(i6));
                    i9 = i6;
                }
            }
            if (i2 >= 0) {
                itemEntry = (ItemEntry) parcelableArrayList.get(i2);
                i8 = itemEntry.f7096d;
                i7 = 0;
                while (i7 < this.f7124u.size()) {
                    ItemEntry itemEntry3 = (ItemEntry) this.f7124u.get(i7);
                    if (itemEntry3.f7093a >= itemEntry.f7093a) {
                        if (itemEntry3.f7093a <= itemEntry.f7093a) {
                            if (i8 != -1) {
                                if (itemEntry3.f7096d <= i8 && i8 <= itemEntry3.f7097e) {
                                    break;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    i7++;
                }
                i7--;
                i5 = m6904t() + i7;
            } else {
                i5 = m6894a(i3, i4, i);
                if (i5 >= m6902r() + mo1507g()) {
                    i5 = (m6902r() + mo1507g()) - 1;
                }
            }
            if (i5 >= mo1039a()) {
                i5 = mo1039a() - 1;
            }
            this.f3433a.m3638b();
            playRecyclerView.getLayoutManager().mo743d(i5);
            return;
        }
        this.f7124u = parcelableArrayList;
        this.f3433a.m3638b();
        if (playRecyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            ((LinearLayoutManager) playRecyclerView.getLayoutManager()).m3094a(i, i3);
        }
    }

    private static int m6894a(int i, int i2, int i3) {
        return (((((float) (i2 + i)) / ((float) i2)) > 0.5f ? 1 : ((((float) (i2 + i)) / ((float) i2)) == 0.5f ? 0 : -1)) > 0 ? 1 : null) != null ? i3 : i3 + 1;
    }

    public void m_() {
        m6899o();
        super.m_();
    }

    public final void mo1449a(C2712a c2712a) {
        super.mo1449a(c2712a);
        this.f7124u.clear();
        m6899o();
        this.f3433a.m3638b();
    }

    private final void m6899o() {
        int i;
        C2711x c2711x = this.H.f14950a;
        int m = c2711x.m14698m();
        if (this.f7124u.size() > 0) {
            i = ((ItemEntry) this.f7124u.get(this.f7124u.size() - 1)).f7094b + 1;
        } else {
            i = 0;
        }
        C1473m.f7980a.cZ();
        int i2 = i;
        while (i2 < m) {
            Document document = (Document) c2711x.m14679a(i2, false);
            if (document == null) {
                FinskyLog.m21659a("Loaded null doc, forcing a hard reload of list data.", new Object[0]);
                c2711x.ac_();
                c2711x.m14699n();
                this.f7124u.clear();
                return;
            }
            boolean z;
            ItemEntry itemEntry;
            if (!document.aZ()) {
                ko bg = document.bg();
                boolean z2 = (bg == null || bg.f12901F == null) ? false : true;
                if (!z2) {
                    bg = document.bg();
                    if (bg == null || bg.ax == null) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        ko bg2 = document.bg();
                        if (bg2 == null || bg2.f12902G == null) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            z = false;
                            if (z) {
                                this.f7127x = true;
                            }
                            if (this.f7124u.size() > 0) {
                                itemEntry = (ItemEntry) this.f7124u.get(this.f7124u.size() - 1);
                                if (itemEntry.m6875a() && i2 - itemEntry.f7093a < this.f7125v) {
                                    z = true;
                                    if (z) {
                                        itemEntry = new ItemEntry();
                                        itemEntry.f7093a = i2;
                                        itemEntry.f7095c = 6;
                                        m6898f(i2);
                                        this.f7124u.add(itemEntry);
                                    }
                                    i2++;
                                }
                            }
                            z = false;
                            if (z) {
                                itemEntry = new ItemEntry();
                                itemEntry.f7093a = i2;
                                itemEntry.f7095c = 6;
                                m6898f(i2);
                                this.f7124u.add(itemEntry);
                            }
                            i2++;
                        }
                    }
                }
            }
            z = true;
            if (z) {
                this.f7127x = true;
            }
            if (this.f7124u.size() > 0) {
                itemEntry = (ItemEntry) this.f7124u.get(this.f7124u.size() - 1);
                z = true;
                if (z) {
                    itemEntry = new ItemEntry();
                    itemEntry.f7093a = i2;
                    itemEntry.f7095c = 6;
                    m6898f(i2);
                    this.f7124u.add(itemEntry);
                }
                i2++;
            }
            z = false;
            if (z) {
                itemEntry = new ItemEntry();
                itemEntry.f7093a = i2;
                itemEntry.f7095c = 6;
                m6898f(i2);
                this.f7124u.add(itemEntry);
            }
            i2++;
        }
        if (m > 0) {
            m6898f(c2711x.m14698m());
        }
    }

    private final void m6898f(int i) {
        int size = this.f7124u.size();
        if (size > 0) {
            ItemEntry itemEntry = (ItemEntry) this.f7124u.get(size - 1);
            if (itemEntry.m6875a()) {
                itemEntry.f7094b = i - 1;
            }
        }
    }

    private final int m6900p() {
        int size = this.f7124u.size();
        if (this.f7100K != 0) {
            return size + 1;
        }
        return size;
    }

    private final int m6901q() {
        return m6903s() ? 1 : 0;
    }

    public final int mo1039a() {
        int f = mo1506f();
        int g = mo1507g();
        if (f + g == 0) {
            return 0;
        }
        return (f + g) + m6902r();
    }

    private final int m6902r() {
        return (mo1505e() ? 1 : 0) + 1;
    }

    protected int mo1506f() {
        return m6900p();
    }

    protected int mo1507g() {
        return m6901q();
    }

    private final boolean m6903s() {
        if (this.f7114k) {
            return this.H.f14950a.m14698m() > 0 ? true : true;
        } else {
            return false;
        }
    }

    public C1155g mo1503c(ViewGroup viewGroup, int i) {
        View a;
        int i2 = 0;
        switch (i) {
            case 0:
                a = m6878a(C7582R.layout.error_footer, viewGroup);
                break;
            case 1:
                a = m6878a(C7582R.layout.loading_footer, viewGroup);
                break;
            case 6:
                if (!this.f7111h) {
                    int i3 = this.f7125v;
                    BucketRowLayout bucketRowLayout = (BucketRowLayout) m6878a(C7582R.layout.bucket_row, viewGroup);
                    if (this.f7126w == C7582R.layout.play_card_flat_list) {
                        ai.m1823a(bucketRowLayout, 0, 0, 0, 0);
                    } else {
                        bucketRowLayout.setContentHorizontalPadding(this.f7107d);
                    }
                    while (i2 < i3) {
                        bucketRowLayout.addView(m6878a(this.f7126w, bucketRowLayout));
                        i2++;
                    }
                    break;
                }
                a = m6878a(C7582R.layout.play_card_cluster, viewGroup);
                break;
            case 7:
                a = m6878a(C7582R.layout.play_card_cluster_header, viewGroup);
                break;
            case 16:
                a = m6878a(C7582R.layout.banner_header, viewGroup);
                break;
            case 21:
                a = mo1498a(viewGroup);
                break;
            case 22:
                a = m6878a(C7582R.layout.vertical_spacer, viewGroup);
                break;
            case 25:
                a = m6878a(C7582R.layout.loading_spinner, viewGroup);
                break;
            case 27:
                a = m6878a(C7582R.layout.padding_footer, viewGroup);
                break;
            default:
                a = m6878a(C7582R.layout.play_card_cluster_v2, viewGroup);
                break;
        }
        return new C1155g(a);
    }

    private final int m6904t() {
        return mo1507g() + m6902r();
    }

    public void mo1502a(C1155g c1155g, int i) {
        ItemEntry itemEntry;
        this.f7129z.add(c1155g);
        int i2 = c1155g.f3216f;
        int t = i - m6904t();
        if (t >= this.f7124u.size() || t < 0) {
            itemEntry = null;
        } else {
            itemEntry = (ItemEntry) this.f7124u.get(t);
        }
        View view = c1155g.a;
        int i3;
        Document document;
        switch (i2) {
            case 0:
                m6881b(view);
                return;
            case 1:
            case 25:
            case 27:
                return;
            case 6:
                int i4 = itemEntry.f7093a;
                int i5 = itemEntry.f7094b;
                int i6 = this.f7125v;
                BucketRowLayout bucketRowLayout = (BucketRowLayout) view;
                CharSequence charSequence = null;
                int i7 = 0;
                while (i7 < i6) {
                    String str;
                    int i8 = i4 + i7;
                    Object obj = i8 > i5 ? 1 : null;
                    Document a = obj != null ? null : this.H.m14765a(i8);
                    if (!TextUtils.isEmpty(charSequence) || a == null) {
                        CharSequence charSequence2 = charSequence;
                    } else {
                        str = a.f14885a.f12096c;
                    }
                    boolean z = a != null && a.aZ();
                    d dVar = (d) bucketRowLayout.getChildAt(i7);
                    C2711x c2711x = this.H.f14950a;
                    if (a != null) {
                        boolean a2 = mo1476a(a);
                        ao cr = C1473m.f7980a.cr();
                        String str2 = this.f7116m;
                        C3748a c3748a = this.f7120q;
                        if (this == null) {
                            throw null;
                        }
                        ad adVar = this.f7108e;
                        i3 = 0;
                        if (this.f7127x) {
                            i3 = -(this.f7128y ? 1 : this.f7125v);
                        }
                        cr.m18515a(dVar, a, i8, str2, c3748a, a2, this, adVar, true, (this.f7115l ? i8 : -1) + i3, false, z, this.f7117n, this.f7120q.mo3705g() != 10, false, false);
                    } else if (obj == null || i8 < c2711x.m14698m()) {
                        dVar.setVisibility(0);
                        dVar.b();
                    } else {
                        dVar.d();
                    }
                    i7++;
                    Object obj2 = str;
                }
                mo1501a(bucketRowLayout);
                return;
            case 7:
                PlayCardClusterViewHeader playCardClusterViewHeader = (PlayCardClusterViewHeader) view;
                C2712a c2712a = this.H.f14950a;
                if (c2712a.m14707c()) {
                    t = c2712a.f14908a.f14885a.f12099f;
                } else {
                    t = 0;
                }
                playCardClusterViewHeader.m19879a(t, this.f7113j, null, null, null);
                playCardClusterViewHeader.setExtraHorizontalPadding(this.f7107d);
                return;
            case 16:
                DocImageView docImageView = (DocImageView) view;
                document = this.H.f14950a.f14908a;
                cc ccVar = document.f14885a.f12115v.f13129j.f12922a;
                if (!TextUtils.isEmpty(ccVar.f12014b)) {
                    docImageView.setBackgroundColor(Color.parseColor(ccVar.f12014b));
                }
                docImageView.m13584a(document, this.f7106c, 9);
                return;
            case 21:
                mo1500a(view);
                return;
            case 22:
                view.getLayoutParams().height = this.f7121r;
                return;
            default:
                document = this.H.m14765a(itemEntry.f7093a);
                i2 = this.f7110g ? C7582R.layout.play_card_mini : C7582R.layout.play_card_small;
                if (this.f7102A == null) {
                    this.f7102A = new ff();
                }
                this.f7102A.mo2355a(i2, 50);
                C0657w c0657w = (PlayCardClusterViewV2) c1155g.a;
                c0657w.m13759a(this.f7107d);
                C2335k a3 = this.H.m14766a(document.f14885a.f12096c);
                a3.m11918a((C1031w) c0657w);
                a3.m11917a(c0657w);
                Context context = this.J;
                C4808a c4808a = this.f7119p;
                C3748a c3748a2 = this.f7120q;
                if (this == null) {
                    throw null;
                }
                byte[] bArr;
                C1158a c1159c = new C1159c(document, i2, a3, c0657w, context, c4808a, c3748a2, this, this.f7117n);
                Bundle bundle = (Bundle) this.f7103B.get(m6895a(c1159c.mo1480a()));
                C1164b a4 = this.f7104C.m17439a(i2);
                i3 = this.f7109f;
                ff ffVar = this.f7102A;
                ad adVar2 = this.f7108e;
                if (document == null) {
                    bArr = null;
                } else {
                    bArr = document.f14885a.f12087D;
                }
                c0657w.m13757a(c1159c, a4, i3, ffVar, bundle, adVar2, bArr, null);
                if ((c0657w.f13949g != null ? 1 : null) != null) {
                    C1157b c1157b;
                    bd bdVar = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
                    ad playStoreUiElementNode = c0657w.getPlayStoreUiElementNode();
                    if (C3760e.m17904a(document)) {
                        c1157b = new C1157b(this, document, playStoreUiElementNode);
                    } else {
                        c1157b = null;
                    }
                    c0657w.m13748a(document.f14885a.f12099f, document.f14885a.f12100g, document.f14885a.f12101h, C1473m.f7980a.ct().m19769a(this.J, document, document.m14638a(), null, false), c1157b, this.f7107d, bdVar, null);
                    return;
                }
                return;
        }
    }

    protected void mo1500a(View view) {
        view.getLayoutParams().height = mo1504d();
    }

    protected void mo1501a(BucketRowLayout bucketRowLayout) {
    }

    protected boolean mo1476a(Document document) {
        return ac.m18476a(this.f7119p, document);
    }

    public int mo1040a(int i) {
        if (i == 0) {
            return 21;
        }
        int i2 = i - 1;
        if (mo1505e()) {
            if (i2 == 0) {
                return 22;
            }
            i2--;
        }
        int i3 = this.f7100K;
        if (i3 == 0 || i2 != (m6900p() + m6901q()) - 1) {
            int i4;
            if (!m6903s()) {
                i4 = i2;
            } else if (i2 == 0) {
                return 7;
            } else {
                i4 = i2 - 1;
            }
            ItemEntry itemEntry = (ItemEntry) this.f7124u.get(i4);
            if (i4 == this.f7124u.size() - 1 && itemEntry.f7094b < this.H.f14950a.m14698m() - 1) {
                this.H.m14765a(this.H.f14950a.m14698m() - 1);
            }
            if (this.H.m14765a(itemEntry.f7093a) == null) {
                return 25;
            }
            return itemEntry.f7095c;
        } else if (i3 == 1) {
            return 1;
        } else {
            if (i3 == 2) {
                return 0;
            }
            if (i3 == 3) {
                return 27;
            }
            FinskyLog.m21669e("Unexpected footer mode: %d", Integer.valueOf(i3));
            return 0;
        }
    }

    private final void m6896a(C1155g c1155g) {
        if (this.f7129z.contains(c1155g)) {
            View view = c1155g.a;
            m6897c(view);
            if (view instanceof PlayCardClusterViewV2) {
                C0657w c0657w = (PlayCardClusterViewV2) view;
                C2730u c2730u = this.H;
                if (c2730u.f14951b.containsKey(c0657w.getContentId())) {
                    C2335k a = this.H.m14766a(c0657w.getContentId());
                    a.m11922b((C1031w) c0657w);
                    a.m11921b(c0657w);
                }
            }
            this.f7129z.remove(c1155g);
            if (view instanceof ae) {
                ((ae) view).Z_();
            }
            if (view instanceof PlayCardClusterView) {
                this.f7112i.m19887a((PlayCardClusterView) view);
            }
        }
    }

    private final void m6897c(View view) {
        Object obj;
        if (view instanceof PlayHighlightsBannerView) {
            obj = "CardRecyclerViewAdapter.highlightsScrollState";
        } else if (view instanceof PlayCardClusterViewV2) {
            String a = m6895a(((PlayCardClusterViewV2) view).getContentId());
        } else {
            return;
        }
        Bundle bundle = (Bundle) this.f7103B.get(obj);
        if (bundle != null) {
            bundle.clear();
        } else {
            bundle = new Bundle();
        }
        ((C2628h) view).mo2995a(bundle);
        this.f7103B.put(obj, bundle);
    }

    public final void mo1453h() {
        C1155g[] c1155gArr = (C1155g[]) this.f7129z.toArray(new C1155g[this.f7129z.size()]);
        for (C1155g a : c1155gArr) {
            m6896a(a);
        }
        this.f7105D.m15191b((C1054h) this);
        super.mo1453h();
    }

    public final void mo1448a(Document document, d dVar) {
        this.f7119p.m22589b(document.f14885a.f12096c);
        this.f3433a.m3638b();
    }

    public final void P_() {
        this.f7124u.clear();
        m6899o();
        this.f3433a.m3638b();
    }

    public final void ce_() {
    }

    public final /* bridge */ /* synthetic */ boolean mo1134b(fr frVar) {
        return true;
    }

    public /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return mo1503c(viewGroup, i);
    }
}

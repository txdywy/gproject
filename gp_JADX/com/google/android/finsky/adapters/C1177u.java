package com.google.android.finsky.adapters;

import android.content.Context;
import android.support.v7.widget.fr;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.bg.aa;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.iv;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2723n;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.HistogramView;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.layout.ReviewsControlContainer;
import com.google.android.finsky.layout.ReviewsTipHeaderLayout;
import com.google.android.finsky.layout.RottenTomatoesReviewItem;
import com.google.android.finsky.layout.RottenTomatoesReviewsHeader;
import com.google.android.finsky.layout.bk;
import com.google.android.finsky.layout.bl;
import com.google.android.finsky.layout.bn;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.ratereview.C1068o;
import com.google.android.finsky.ratereview.C3973p;
import com.google.android.finsky.ratereview.C3974q;
import com.google.android.finsky.recyclerview.C1138e;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ak;
import com.google.android.finsky.utils.al;
import com.google.wireless.android.finsky.dfe.nano.bm;
import com.squareup.leakcanary.C7582R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public final class C1177u extends C1138e implements C0657w, C1031w {
    public final Document f7229c;
    public final C2723n f7230d;
    public final DfeToc f7231e;
    public final boolean f7232f;
    public final C1067x f7233g;
    public final C3748a f7234h;
    public final ad f7235i;
    public final C2495w f7236j;
    public final int f7237k;
    public final C3974q f7238l;
    public final C1068o f7239m;
    public final NumberFormat f7240n;
    public final List f7241o = new ArrayList();

    public C1177u(Context context, Document document, C2723n c2723n, boolean z, DfeToc dfeToc, C1067x c1067x, C3748a c3748a, C1068o c1068o, ad adVar, C2495w c2495w) {
        super(context, c2723n.mo3128h(), c2723n.f14901t);
        this.f7229c = document;
        this.f7230d = c2723n;
        this.f7232f = z;
        this.f7230d.m11918a((C1031w) this);
        this.f7230d.m11917a((C0657w) this);
        this.f7237k = Integer.MAX_VALUE;
        this.f7233g = c1067x;
        this.f7234h = c3748a;
        this.f7235i = adVar;
        this.f7236j = c2495w;
        this.f7239m = c1068o;
        this.f7238l = C1473m.f7980a.mo2248i(C1473m.f7980a.cZ());
        this.f7240n = NumberFormat.getIntegerInstance();
        this.f7231e = dfeToc;
        m7109b();
    }

    public final int mo1039a() {
        return this.f7241o.size();
    }

    public final int mo1040a(int i) {
        return ((C1180y) this.f7241o.get(i)).f7251a;
    }

    private final void m7109b() {
        this.f7241o.clear();
        if (this.f7230d.mo2861a()) {
            boolean z = (m7110c() || this.f7229c == null || !this.f7229c.bn() || this.f7232f) ? false : true;
            if (z) {
                this.f7241o.add(new C1180y(C7582R.layout.reviews_statistics_expanded));
            }
            if (m7110c() || this.f7229c == null || this.f7229c.f14885a.f12098e != 1 || this.f7232f || C1473m.f7980a.mo2035O().m8839b()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f7241o.add(new C1180y(C7582R.layout.reviews_filters));
            }
            if (m7110c() || !this.f7232f || this.f7230d.f14939g == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f7241o.add(new C1180y(C7582R.layout.rotten_tomatoes_reviews_header));
            }
            if (m7110c()) {
                this.f7241o.add(new C1180y(C7582R.layout.reviews_tip_header));
            }
            if (this.f7230d.m14698m() == 0) {
                this.f7241o.add(new C1180y(this.f7230d.f14901t ? C7582R.layout.loading_footer : C7582R.layout.reviews_no_matching));
            }
            for (int i = 0; i < this.f7230d.m14698m(); i++) {
                iu iuVar = (iu) this.f7230d.m14679a(i, false);
                if (this.f7232f) {
                    this.f7241o.add(new C1180y(C7582R.layout.rotten_tomatoes_review_item, i));
                } else if (!(m7108a(iuVar, C3973p.SPAM) || m7108a(iuVar, C3973p.INAPPROPRIATE))) {
                    this.f7241o.add(new C1180y(C7582R.layout.review_item, i));
                }
            }
            int i2 = this.f7100K;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.f7241o.add(new C1180y(C7582R.layout.loading_footer));
                } else if (i2 == 2) {
                    this.f7241o.add(new C1180y(C7582R.layout.error_footer));
                } else {
                    FinskyLog.m21667d("No footer or item in last row", new Object[0]);
                    this.f7241o.add(new C1180y(C7582R.layout.error_footer));
                }
            }
            this.f3433a.m3638b();
        }
    }

    final void m7116a(ReviewItemLayout reviewItemLayout, C3973p c3973p, iu iuVar) {
        if (this.f7239m != null) {
            this.f7239m.mo1364a(this.f7229c.f14885a.f12096c, iuVar.f12715c, c3973p);
        }
        if (this.f7238l.m18695c(this.f7229c.f14885a.f12096c, iuVar.f12715c, c3973p)) {
            this.f7238l.m18693b(this.f7229c.f14885a.f12096c, iuVar.f12715c, c3973p);
        } else {
            this.f7238l.m18691a(this.f7229c.f14885a.f12096c, iuVar.f12715c, c3973p);
        }
        reviewItemLayout.m17338a(this.f7229c, iuVar, this.f7237k, m7108a(iuVar, C3973p.HELPFUL), m7108a(iuVar, C3973p.SPAM), m7108a(iuVar, C3973p.NOT_HELPFUL), m7108a(iuVar, C3973p.INAPPROPRIATE), this.f7235i, this.f7236j);
    }

    private final boolean m7108a(iu iuVar, C3973p c3973p) {
        return this.f7238l.m18695c(this.f7229c.f14885a.f12096c, iuVar.f12715c, c3973p);
    }

    public final void m_() {
        if (mo1444i()) {
            m6882e(1);
        } else {
            m6882e(0);
        }
        m7109b();
    }

    protected final String mo1446l() {
        return C1290m.m7702a(this.J, this.f7230d.mo3127g());
    }

    protected final boolean mo1444i() {
        return this.f7230d.f14901t;
    }

    protected final void mo1445j() {
        this.f7230d.m14702q();
    }

    public final void mo1062a(VolleyError volleyError) {
        m6882e(2);
    }

    private final boolean m7110c() {
        return this.f7230d.f14940k != null;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        CharSequence charSequence = null;
        int i2 = 0;
        C1155g c1155g = (C1155g) frVar;
        View view = c1155g.a;
        int i3 = c1155g.f3216f;
        if (i3 == C7582R.layout.reviews_statistics_expanded) {
            HistogramView histogramView = (HistogramView) view;
            if (!this.f7229c.bn()) {
                FinskyLog.m21665c("No histogram data received from server", new Object[0]);
                histogramView.setVisibility(8);
            }
            histogramView.m17307a(this.f7229c.m14622K(), aa.m9201a(this.f7229c.m14621J()), this.f7229c.m14623L());
        } else if (i3 == C7582R.layout.reviews_filters) {
            CharSequence string;
            ReviewsControlContainer reviewsControlContainer = (ReviewsControlContainer) view;
            C2723n c2723n = this.f7230d;
            C1067x c1067x = this.f7233g;
            TextView textView = reviewsControlContainer.f18330a;
            Context context = reviewsControlContainer.getContext();
            i3 = c2723n.f14938f;
            al[] alVarArr = ak.f24035a;
            int length = alVarArr.length;
            while (i2 < length) {
                al alVar = alVarArr[i2];
                if (i3 == alVar.f24036a) {
                    string = context.getString(alVar.f24037b);
                    break;
                }
                i2++;
            }
            string = null;
            textView.setText(string);
            reviewsControlContainer.f18330a.setOnClickListener(new bk(c1067x));
            reviewsControlContainer.f18331b.setOnClickListener(new bl(c1067x));
        } else if (i3 == C7582R.layout.rotten_tomatoes_reviews_header) {
            RottenTomatoesReviewsHeader rottenTomatoesReviewsHeader = (RottenTomatoesReviewsHeader) view;
            bm bmVar = this.f7230d.f14939g;
            C3748a c3748a = this.f7234h;
            DfeToc dfeToc = this.f7231e;
            C2495w c2495w = this.f7236j;
            rottenTomatoesReviewsHeader.f18348a.setText(bmVar.b.toUpperCase());
            C1473m.f7980a.ar().m9288a(rottenTomatoesReviewsHeader.f18349b, bmVar.c.f11860f, bmVar.c.f11863i);
            rottenTomatoesReviewsHeader.f18350c.setText(Integer.toString(bmVar.e));
            if ((bmVar.a & 2) != 0) {
                rottenTomatoesReviewsHeader.f18351d.setText(Html.fromHtml(rottenTomatoesReviewsHeader.getResources().getString(C7582R.string.reviews_count_label, new Object[]{Integer.valueOf(bmVar.d)})));
                rottenTomatoesReviewsHeader.f18351d.setVisibility(0);
            } else {
                rottenTomatoesReviewsHeader.f18351d.setVisibility(8);
            }
            rottenTomatoesReviewsHeader.f18352e.setPercentValue(bmVar.e);
            rottenTomatoesReviewsHeader.f18353f.setText(bmVar.f);
            if (bmVar.g != null) {
                rottenTomatoesReviewsHeader.f18353f.setOnClickListener(new bn(rottenTomatoesReviewsHeader, c3748a, bmVar, dfeToc, c2495w));
            } else {
                rottenTomatoesReviewsHeader.f18353f.setOnClickListener(null);
            }
        } else if (i3 == C7582R.layout.reviews_no_matching) {
        } else {
            if (i3 == C7582R.layout.review_item) {
                ReviewItemLayout reviewItemLayout = (ReviewItemLayout) view;
                C1180y c1180y = (C1180y) this.f7241o.get(i);
                iu iuVar = (iu) this.f7230d.m14679a(c1180y.f7252b, true);
                boolean z = !TextUtils.isEmpty(iuVar.f12715c);
                reviewItemLayout.m17338a(this.f7229c, iuVar, this.f7237k, m7108a(iuVar, C3973p.HELPFUL), m7108a(iuVar, C3973p.SPAM), m7108a(iuVar, C3973p.NOT_HELPFUL), m7108a(iuVar, C3973p.INAPPROPRIATE), this.f7235i, this.f7236j);
                if (z) {
                    reviewItemLayout.setReviewFeedbackActionListener(new C1178v(this, iuVar, reviewItemLayout, c1180y));
                } else {
                    reviewItemLayout.setActionClickListener(null);
                }
            } else if (i3 == C7582R.layout.rotten_tomatoes_review_item) {
                RottenTomatoesReviewItem rottenTomatoesReviewItem = (RottenTomatoesReviewItem) view;
                iu iuVar2 = (iu) this.f7230d.m14679a(((C1180y) this.f7241o.get(i)).f7252b, true);
                C1473m.f7980a.ar().m9288a(rottenTomatoesReviewItem.f18343a, iuVar2.f12718f.f11860f, iuVar2.f12718f.f11863i);
                if (TextUtils.isEmpty(iuVar2.f12721i)) {
                    rottenTomatoesReviewItem.f18344b.setVisibility(4);
                } else {
                    rottenTomatoesReviewItem.f18344b.setVisibility(0);
                    rottenTomatoesReviewItem.f18344b.setOnClickListener(new com.google.android.finsky.layout.bm(rottenTomatoesReviewItem, iuVar2));
                }
                rottenTomatoesReviewItem.f18345c.setText(iuVar2.f12720h);
                rottenTomatoesReviewItem.f18346d.setText(iuVar2.f12732t);
                rottenTomatoesReviewItem.f18347e.setText(iuVar2.f12722j);
            } else if (i3 == C7582R.layout.loading_footer) {
            } else {
                if (i3 == C7582R.layout.error_footer) {
                    m6881b(view);
                } else if (i3 == C7582R.layout.reviews_tip_header) {
                    ReviewsTipHeaderLayout reviewsTipHeaderLayout = (ReviewsTipHeaderLayout) view;
                    iv ivVar = this.f7230d.f14940k;
                    if ((ivVar.f12735b & 8) != 0) {
                        charSequence = this.J.getResources().getQuantityString(C7582R.plurals.review_snippet_count, (int) ivVar.f12739f, new Object[]{this.f7240n.format(ivVar.f12739f)});
                    }
                    reviewsTipHeaderLayout.m17342a(ivVar.f12737d, charSequence);
                } else {
                    throw new IllegalStateException("Unknown type for onBindViewHolder " + i3);
                }
            }
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        View a;
        if (i == C7582R.layout.loading_footer) {
            a = m6878a(C7582R.layout.loading_footer, viewGroup);
        } else if (i == C7582R.layout.error_footer) {
            a = m6878a(C7582R.layout.error_footer, viewGroup);
        } else {
            a = m6878a(i, viewGroup);
        }
        return new C1155g(a);
    }
}

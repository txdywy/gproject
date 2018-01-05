package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.p028a.C0216d;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.actionbuttons.C1006c;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.ai;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.la;
import com.google.android.finsky.cv.p177a.lq;
import com.google.android.finsky.cz.C1001d;
import com.google.android.finsky.detailscomponents.C2576a;
import com.google.android.finsky.detailscomponents.C2580f;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.layout.DetailsSummary;
import com.google.android.finsky.layout.DetailsSummaryWishlistView;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p110p.C1004h;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.playcard.ac;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import com.google.wireless.android.finsky.b.aa;
import com.google.wireless.android.finsky.b.z;
import com.squareup.leakcanary.C7582R;

public class dc extends cu implements C1001d {
    public View[] f6605F;
    public boolean f6606K;
    public String f6607U;
    public boolean f6608V;
    public C2576a f6609Z = C1473m.f7980a.ch();
    public final boolean f6610a = C1473m.f7980a.dj().mo2294a(12624692);
    public C1531a aa;
    public Intent af;
    public C1006c f6611m;
    public C2233o f6612u = C1473m.f7980a.mo2045Y();
    public final boolean f6613v = C1473m.f7980a.dj().mo2294a(12622545);
    public C1294w f6614x;

    public dc(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
        C1473m.f7980a.cm();
        this.aa = C1473m.f7980a.mo2223d();
        C1473m.f7980a.mo2245h();
    }

    public void mo1316a(Context context, C3748a c3748a, C1294w c1294w, C1045b c1045b, boolean z, String str, String str2, boolean z2, ad adVar, C2495w c2495w) {
        this.B = context;
        this.z = c3748a;
        this.f6614x = c1294w;
        this.A = c1045b;
        this.L = str;
        this.f6607U = str2;
        this.f6608V = z2;
        this.T = adVar;
        this.S = c2495w;
    }

    public void mo1317a(Document document, Document document2, boolean z, String str, boolean z2, Intent intent, View... viewArr) {
        this.f6605F = viewArr;
        this.D = document;
        this.E = document2;
        this.O = z;
        this.P = str;
        this.W = z2;
        this.af = intent;
        if (C1473m.f7980a.dj().mo2294a(12633045) && (this.D.f14885a.f12098e == 64 || this.D.f14885a.f12098e == 5)) {
            if (this.D.f14885a.f12098e == 64 && this.ad == null) {
                this.ad = m6358m();
            }
            if (this.ae == null) {
                this.ae = m6357l();
            }
        }
        this.H = (DetailsSummaryDynamic) mo1323c((int) C7582R.id.title_details_summary_dynamic);
        this.I = (ViewGroup) mo1323c((int) C7582R.id.button_container);
        if (this.I.getChildCount() > 5) {
            this.I.removeAllViews();
        }
        mo1327j();
        if (this.O) {
            if (!(this.D.f14885a.f12099f == 4 && this.f6610a)) {
                if (this.f6611m == null) {
                    this.f6611m = C1473m.f7980a.ci().m5977a(this.A, this.A, this.z, this.B, this.L, this.T, 3, this.C, -1, null, false, false, false);
                    this.f6611m.m5960a(this.D, this.E, this.S, this.H, this.af);
                } else {
                    C1004h c1004h = this.f6611m;
                    c1004h.f6164u = this.D;
                    if (c1004h.f6152i.dj().mo2294a(12633045) && c1004h.f6139L != null && !c1004h.f6137J && c1004h.f6164u.f14885a.f12098e == 64) {
                        c1004h.f6139L.m18303a(c1004h);
                        c1004h.f6137J = true;
                    }
                    c1004h.m5966b();
                }
            }
            mo1319b();
        } else {
            this.I.setVisibility(8);
        }
        ai.m9228a(this.H, 8);
    }

    public void mo1313a() {
        this.y = true;
        if (this.f6611m != null) {
            this.f6611m.m5955a();
        }
        if (this.I != null) {
            int childCount = this.I.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.I.getChildAt(i);
                if (childAt instanceof PlayActionButtonV2) {
                    ((PlayActionButtonV2) childAt).m5999a();
                }
            }
        }
    }

    protected final View mo1323c(int i) {
        if (this.f6605F == null) {
            return null;
        }
        for (View view : this.f6605F) {
            View view2;
            if (view2 != null) {
                view2 = view2.findViewById(i);
                if (view2 != null) {
                    return view2;
                }
            }
        }
        return null;
    }

    public final void mo1326i() {
        if (!this.y) {
            mo1317a(this.D, this.E, this.O, this.P, this.W, this.af, this.f6605F);
        }
    }

    protected final void mo1327j() {
        int i = 2;
        int i2 = 0;
        TextView textView = (TextView) mo1323c((int) C7582R.id.title_title);
        if (textView != null) {
            Resources resources = this.B.getResources();
            int i3 = this.D.f14885a.f12098e;
            if (i3 != 1) {
                if (i3 == 5 || i3 == 64) {
                    Object bJ = this.D.bJ();
                    Object bI = this.D.bI();
                    if (!(TextUtils.isEmpty(bJ) || TextUtils.isEmpty(bI))) {
                        textView.setText(new StringBuilder((String.valueOf(bJ).length() + 1) + String.valueOf(bI).length()).append(bJ).append("\n").append(bI).toString());
                    }
                }
                textView.setText(this.D.f14885a.f12100g);
            } else if (this.D.bW()) {
                textView.setText(resources.getString(C7582R.string.early_access_app_title, new Object[]{this.D.f14885a.f12100g}));
            } else if (this.D.bT()) {
                textView.setText(resources.getString(C7582R.string.testing_program_app_title, new Object[]{this.D.f14885a.f12100g}));
            } else {
                textView.setText(this.D.f14885a.f12100g);
            }
        }
        int i4 = this.D.f14885a.f12098e;
        ViewGroup viewGroup = (ViewGroup) mo1323c((int) C7582R.id.title_creator_panel);
        DecoratedTextView decoratedTextView = (DecoratedTextView) viewGroup.findViewById(C7582R.id.title_creator);
        ViewGroup viewGroup2 = (ViewGroup) mo1323c((int) C7582R.id.title_content_rating_panel);
        PlayTextView playTextView = (PlayTextView) mo1323c((int) C7582R.id.title_app_size);
        if (decoratedTextView != null) {
            if (i4 == 3 || i4 == 2 || i4 == 4 || i4 == 5 || i4 == 64 || i4 == 30) {
                viewGroup.setVisibility(8);
                viewGroup2.setVisibility(8);
            } else if (i4 == 6) {
                viewGroup.setVisibility(8);
                this.f6609Z.m13624a(this.D, viewGroup2);
            } else {
                viewGroup.setVisibility(0);
                decoratedTextView.setText(ac.m18475a(this.D));
                this.f6609Z.m13625a(this.D, decoratedTextView);
                this.f6609Z.m13624a(this.D, viewGroup2);
                if (i4 == 1 && C1473m.f7980a.dj().mo2294a(12631928)) {
                    CharSequence a = this.aa.m8958a(this.B, this.D);
                    if (TextUtils.isEmpty(a)) {
                        playTextView.setVisibility(8);
                    } else {
                        playTextView.setVisibility(0);
                        playTextView.setText(a);
                    }
                } else {
                    playTextView.setVisibility(8);
                }
            }
        }
        C2576a.m13620a(this.D, (DecoratedTextView) mo1323c((int) C7582R.id.title_tipper_sticker));
        m6356k();
        DetailsSummaryWishlistView detailsSummaryWishlistView = (DetailsSummaryWishlistView) mo1323c((int) C7582R.id.title_wishlist_button);
        if (detailsSummaryWishlistView != null) {
            if (this.f6606K) {
                detailsSummaryWishlistView.setVisibility(8);
            } else {
                detailsSummaryWishlistView.m17280a(this.D, this.z, this.S);
            }
        }
        Resources resources2 = this.B.getResources();
        PlayCardThumbnail playCardThumbnail = (PlayCardThumbnail) mo1323c((int) C7582R.id.title_thumbnail_frame);
        boolean k = C1473m.f7980a.av().m9286k(resources2);
        switch (i4) {
            case 1:
            case 5:
            case 6:
            case 16:
            case 17:
            case 44:
            case 64:
                i3 = 1;
                break;
            case 2:
            case 4:
            case 24:
            case 25:
                boolean z = k;
                break;
            case 3:
            case 18:
            case 19:
            case 20:
                i3 = 0;
                break;
            default:
                i3 = 0;
                break;
        }
        DetailsSummary detailsSummary = (DetailsSummary) mo1323c((int) C7582R.id.item_details_panel);
        if (this.f6606K || r2 != 0) {
            playCardThumbnail.setVisibility(0);
            playCardThumbnail.a(this.D.f14885a.f12099f, false);
            LayoutParams layoutParams = playCardThumbnail.getLayoutParams();
            layoutParams.width = C1608h.m9259e(this.B, i4);
            layoutParams.height = C1608h.m9261f(this.B, i4);
            View view = (DocImageView) playCardThumbnail.getImageView();
            view.setScaleType(ScaleType.FIT_START);
            if (C3760e.m17903a()) {
                android.support.v4.view.ai.m1832a(view, this.f6607U);
            }
            if (!this.f6608V) {
                view.m13584a(this.D, this.f6614x, DocImageView.f13711a);
            }
            view.setFocusable(this.O);
            view.setContentDescription(C1608h.m9249a(this.D.f14885a.f12100g, this.D.f14885a.f12098e, resources2));
            if (this.O) {
                view.setOnClickListener(new dd(this));
                view.setForeground(C0216d.m1112a(this.B, (int) C7582R.drawable.play_highlight_overlay_dark));
            }
            if (k) {
                i = 0;
            } else if (C2580f.m13631a(i4) && C2581g.m13638c(this.D, k) != null) {
                i = 1;
            }
        } else {
            int i5;
            playCardThumbnail.setVisibility(8);
            if (k) {
                i5 = 0;
            } else {
                i5 = 2;
            }
            i = i5;
        }
        detailsSummary.setThumbnailMode(i);
        if (!this.f6606K) {
            int i6;
            CharSequence t;
            viewGroup = (ViewGroup) mo1323c((int) C7582R.id.title_bylines);
            viewGroup.removeAllViews();
            LayoutInflater from = LayoutInflater.from(this.B);
            switch (this.D.f14885a.f12098e) {
                case 5:
                case 64:
                    if (this.D.bE()) {
                        m6395b(from, viewGroup, this.D.bF());
                        break;
                    }
                    break;
                case 6:
                    lq S = this.D.m14630S();
                    if (!(this.D.ab() || TextUtils.isEmpty(S.f13039d))) {
                        m6395b(from, viewGroup, S.f13039d);
                    }
                    if (this.D.ar() == null) {
                        if (TextUtils.isEmpty(S.f13040e)) {
                            m6395b(from, viewGroup, this.B.getString(C7582R.string.no_movie_rating));
                        } else {
                            m6395b(from, viewGroup, S.f13040e);
                        }
                    }
                    if (!TextUtils.isEmpty(S.f13038c)) {
                        m6395b(from, viewGroup, S.f13038c);
                        break;
                    }
                    break;
                case 18:
                    if (this.f6613v) {
                        la U = this.D.m14632U();
                        if (U != null && U.bK_()) {
                            m6395b(from, viewGroup, U.f13000h);
                            break;
                        }
                    }
                    break;
            }
            if (viewGroup.getChildCount() > 0) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            viewGroup.setVisibility(i6);
            viewGroup = (ViewGroup) mo1323c((int) C7582R.id.title_extra_labels);
            viewGroup.removeAllViews();
            LayoutInflater from2 = LayoutInflater.from(this.B);
            if (t_()) {
                t = this.D.m14665t();
                if (!TextUtils.isEmpty(t)) {
                    mo1322a(from2, viewGroup, t);
                }
            }
            C2206c ah = C1473m.f7980a.ah();
            Account a2 = this.f6612u.m11642a(this.D, this.C);
            if (a2 != null) {
                C2196e a3 = ah.mo2811a(this.C);
                if (this.f6612u.m11655c(this.D, a3)) {
                    bl e = this.D.m14649e(this.f6612u.m11651b(this.D, a3));
                    if (e != null) {
                        if (!e.m12280f() || e.f11934x <= System.currentTimeMillis()) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        if (i6 != 0) {
                            long j = e.f11935y;
                            t = this.B.getString(C7582R.string.owned_preorder_note, new Object[]{C1473m.f7980a.bb().m21828b(j)});
                            mo1322a(from2, viewGroup, t);
                        }
                    }
                    t = this.B.getString(C7582R.string.owned_preorder_note_no_sale_date);
                    mo1322a(from2, viewGroup, t);
                }
            }
            if (a2 == null) {
                if (this.f6612u.m11656d(this.D, ah.mo2811a(this.C))) {
                    mo1322a(from2, viewGroup, this.B.getString(C7582R.string.movie_preordered_through_bundle));
                } else if (this.D.f14885a.f12099f != 6 && mo1325f()) {
                    bl c = C1473m.f7980a.mo2044X().m11790c(this.D, this.M, ah.mo2811a(this.C));
                    if (c == null) {
                        t = null;
                    } else {
                        i6 = this.D.f14885a.f12098e;
                        i = c.f11926p;
                        if (i6 == 6) {
                            i6 = m6394a(c);
                        } else if (i6 == 5 && i == 3) {
                            i6 = C7582R.string.list_price_rental;
                        } else {
                            i6 = C7582R.string.list_price;
                        }
                        String str = c.f11922l;
                        Object string = this.B.getString(i6, new Object[]{str});
                        t = new SpannableStringBuilder(string);
                        int indexOf = string.indexOf(str);
                        if (indexOf >= 0) {
                            t.setSpan(new StrikethroughSpan(), indexOf, str.length() + indexOf, 17);
                        }
                    }
                    if (!TextUtils.isEmpty(t)) {
                        if (this.f6612u.m11649a(this.D, this.M, C1473m.f7980a.ah().mo2811a(this.C))) {
                            mo1322a(from2, viewGroup, t);
                        }
                    }
                }
            }
            if (viewGroup.getChildCount() <= 0) {
                i2 = 8;
            }
            viewGroup.setVisibility(i2);
            m6361p();
            m6360o();
        }
    }

    public final void mo1321a(Bitmap bitmap) {
        PlayCardThumbnail playCardThumbnail = (PlayCardThumbnail) mo1323c((int) C7582R.id.title_thumbnail_frame);
        if (playCardThumbnail != null) {
            ((DocImageView) playCardThumbnail.getImageView()).setImageBitmap(bitmap);
        }
    }

    public final void mo1328n() {
        PlayCardThumbnail playCardThumbnail = (PlayCardThumbnail) mo1323c((int) C7582R.id.title_thumbnail_frame);
        if (playCardThumbnail != null) {
            ((DocImageView) playCardThumbnail.getImageView()).m13584a(this.D, this.f6614x, DocImageView.f13711a);
        }
        this.f6608V = false;
    }

    private static void m6395b(LayoutInflater layoutInflater, ViewGroup viewGroup, CharSequence charSequence) {
        TextView textView = (TextView) layoutInflater.inflate(C7582R.layout.details_summary_byline_label, viewGroup, false);
        textView.setText(charSequence);
        viewGroup.addView(textView);
    }

    protected final void mo1322a(LayoutInflater layoutInflater, ViewGroup viewGroup, CharSequence charSequence) {
        TextView textView = (TextView) layoutInflater.inflate(C7582R.layout.details_summary_extra_label, viewGroup, false);
        textView.setText(charSequence);
        textView.setTextColor(C1608h.m9243a(this.B, this.D.f14885a.f12099f));
        viewGroup.addView(textView);
    }

    protected boolean t_() {
        return this.f6612u.m11642a(this.D, this.C) == null;
    }

    protected boolean mo1325f() {
        return true;
    }

    static int m6394a(bl blVar) {
        int i = blVar.f11926p;
        if (blVar.m4919a(aa.a) && ((z) blVar.m4921b(aa.a)).d()) {
            int i2 = ((z) blVar.m4921b(aa.a)).b;
            if (i == 1 || i == 7) {
                switch (i2) {
                    case 1:
                        return C7582R.string.list_price_sd;
                    case 2:
                        return C7582R.string.list_price_hd;
                    case 3:
                        return C7582R.string.list_price_uhd;
                    default:
                        return C7582R.string.list_price;
                }
            } else if (i == 3 || i == 4) {
                switch (i2) {
                    case 1:
                        return C7582R.string.list_price_rental_sd;
                    case 2:
                        return C7582R.string.list_price_rental_hd;
                    case 3:
                        return C7582R.string.list_price_rental_uhd;
                    default:
                        return C7582R.string.list_price_rental;
                }
            }
        }
        switch (i) {
            case 1:
                return C7582R.string.list_price_sd;
            case 3:
                return C7582R.string.list_price_rental_sd;
            case 4:
                return C7582R.string.list_price_rental_hd;
            case 7:
                return C7582R.string.list_price_hd;
        }
        return C7582R.string.list_price;
    }

    protected void mo1318a(boolean z) {
        this.I.setVisibility(8);
        if (!this.J && !z) {
            this.f6611m.m5960a(this.D, this.E, this.A.bw, this.H, this.af);
            mo1336h();
            mo1329q();
        }
    }

    protected void mo1336h() {
    }

    protected void mo1319b() {
        mo1324d(this.f6612u.m11649a(this.D, this.M, C1473m.f7980a.ah().mo2811a(this.C)));
        this.I.setVisibility(4);
        if (!this.J) {
            if (this.G) {
                mo1314a((int) C7582R.string.refunding);
            } else {
                mo1318a(false);
            }
        }
    }

    protected final void mo1329q() {
        ai.m9228a(this.I, 4);
    }

    protected void mo1314a(int i) {
        TextView textView = (TextView) this.H.findViewById(C7582R.id.summary_dynamic_status);
        this.I.setVisibility(8);
        textView.setVisibility(0);
        textView.setText(this.B.getResources().getString(i));
    }

    public final void mo1324d(boolean z) {
        this.J = !z;
    }

    public final void mo1330r() {
        this.f6606K = true;
    }

    public final void mo1206a(String str) {
        if (str.equals(this.D.f14885a.f12096c)) {
            mo1326i();
        }
    }

    public final void mo1207a(String str, int i) {
        if (i == 1 && str.equals(this.D.f14885a.f12096c)) {
            mo1326i();
        }
    }

    public final void mo1315a(int i, Bundle bundle) {
    }
}

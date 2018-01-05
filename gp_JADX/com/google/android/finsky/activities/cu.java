package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.p028a.C0216d;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.actionbuttons.C1013j;
import com.google.android.finsky.actionbuttons.DetailsButtonLayout;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.actionbuttons.an;
import com.google.android.finsky.actionbuttons.aq;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.ai;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.by.C2234p;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.la;
import com.google.android.finsky.cv.p177a.lq;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.cw.C2455b;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.cw.C2458e;
import com.google.android.finsky.detailscomponents.C2576a;
import com.google.android.finsky.detailscomponents.C2579e;
import com.google.android.finsky.detailscomponents.C2580f;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.DetailsSummaryExtraLabelsSection;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.layout.C3729v;
import com.google.android.finsky.layout.DetailsSummary;
import com.google.android.finsky.layout.DetailsSummaryWishlistView;
import com.google.android.finsky.layout.DetailsTitleCreatorBlock;
import com.google.android.finsky.layout.OrsonTitleCreatorBlock;
import com.google.android.finsky.layout.au;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p110p.C1004h;
import com.google.android.finsky.p110p.C3835a;
import com.google.android.finsky.p110p.C3837c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class cu implements an, C1004h {
    public C1045b f6516A;
    public Context f6517B;
    public final Account f6518C;
    public Document f6519D;
    public Document f6520E;
    public View[] f6521F;
    public boolean f6522G;
    public DetailsSummaryDynamic f6523H;
    public ViewGroup f6524I;
    public boolean f6525J;
    public boolean f6526K;
    public String f6527L;
    public DfeToc f6528M;
    public C1254c f6529N;
    public boolean f6530O;
    public String f6531P;
    public boolean f6532Q;
    public int f6533R = 1;
    public C2495w f6534S;
    public ad f6535T;
    public String f6536U;
    public boolean f6537V;
    public boolean f6538W;
    public C2457d f6539X;
    public C2579e f6540Y;
    public C2576a f6541Z;
    public C1531a aa;
    public boolean ab;
    public C3835a ac;
    public OnClickListener ad;
    public OnClickListener ae;
    public Intent af;
    public C2233o f6542u;
    public final boolean f6543v = C1473m.f7980a.dj().mo2294a(12622545);
    public C3837c f6544w;
    public C1294w f6545x;
    public boolean f6546y;
    public C3748a f6547z;

    public cu(DfeToc dfeToc, Account account) {
        this.f6518C = account;
        this.f6528M = dfeToc;
        C1473m c1473m = C1473m.f7980a;
        this.f6529N = c1473m.mo2112b(account.name);
        this.f6539X = c1473m.mo2247i();
        this.f6542u = c1473m.mo2045Y();
        if (C1473m.f7980a.dj().mo2294a(12633045)) {
            this.f6544w = c1473m.cC();
        }
        this.f6540Y = new C2579e(this.f6518C, this.f6528M, this.f6542u, c1473m.ah(), C1473m.f7980a.aN());
        this.f6541Z = c1473m.ch();
        c1473m.cm();
        this.aa = c1473m.mo2223d();
        c1473m.mo2245h();
    }

    public void mo1316a(Context context, C3748a c3748a, C1294w c1294w, C1045b c1045b, boolean z, String str, String str2, boolean z2, ad adVar, C2495w c2495w) {
        this.f6517B = context;
        this.f6547z = c3748a;
        this.f6545x = c1294w;
        this.f6516A = c1045b;
        this.f6527L = str;
        this.f6536U = str2;
        this.f6537V = z2;
        this.f6535T = adVar;
        this.f6534S = c2495w;
        if (C1473m.f7980a.dj().mo2294a(12633045) && this.f6544w != null) {
            this.f6544w.m18307c();
            this.ac = C1473m.f7980a.cD();
        }
    }

    public void mo1317a(Document document, Document document2, boolean z, String str, boolean z2, Intent intent, View... viewArr) {
        this.f6521F = viewArr;
        this.f6519D = document;
        this.f6520E = document2;
        this.f6530O = z;
        this.f6531P = str;
        this.f6538W = z2;
        this.af = intent;
        if (C1473m.f7980a.dj().mo2294a(12633045) && (this.f6519D.f14885a.f12098e == 64 || this.f6519D.f14885a.f12098e == 5)) {
            if (this.f6519D.f14885a.f12098e == 64) {
                if (this.ad == null) {
                    this.ad = m6358m();
                }
                if (!this.ab) {
                    this.f6544w.m18303a((C1004h) this);
                    this.ab = true;
                }
            }
            if (this.ae == null) {
                this.ae = m6357l();
            }
        }
        this.f6523H = (DetailsSummaryDynamic) mo1323c((int) C7582R.id.title_details_summary_dynamic);
        this.f6524I = (ViewGroup) mo1323c((int) C7582R.id.button_container);
        mo1335g();
        mo1327j();
        if (z) {
            mo1319b();
            mo1320c();
        } else {
            this.f6524I.setVisibility(8);
        }
        ai.m9228a(this.f6523H, 8);
    }

    protected void mo1335g() {
        if (this.f6524I instanceof DetailsButtonLayout) {
            DetailsButtonLayout detailsButtonLayout = (DetailsButtonLayout) this.f6524I;
            detailsButtonLayout.setForceMultiLineLayout(false);
            detailsButtonLayout.setForceWideLayout(C1473m.f7980a.av().m9286k(this.f6517B.getResources()));
        }
    }

    public void mo1313a() {
        this.f6546y = true;
        if (this.f6524I != null) {
            int childCount = this.f6524I.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f6524I.getChildAt(i);
                if (childAt instanceof PlayActionButtonV2) {
                    ((PlayActionButtonV2) childAt).m5999a();
                }
            }
        }
        if (C1473m.f7980a.dj().mo2294a(12633045) && this.f6544w != null && this.f6519D.f14885a.f12098e == 64 && this.ab) {
            this.f6544w.m18306b(this);
            this.f6544w.m18305b();
            this.ac.m18296a(this.f6534S, this.f6519D.f14885a.f12087D);
            this.f6544w.m18307c();
            this.ab = false;
        }
    }

    protected View mo1323c(int i) {
        if (this.f6521F == null) {
            return null;
        }
        for (View view : this.f6521F) {
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

    public void mo1326i() {
        if (!this.f6546y) {
            mo1317a(this.f6519D, this.f6520E, this.f6530O, this.f6531P, this.f6538W, this.af, this.f6521F);
        }
    }

    protected void mo1327j() {
        int i = 2;
        int i2 = 0;
        TextView textView = (TextView) mo1323c((int) C7582R.id.title_title);
        if (textView != null) {
            Resources resources = this.f6517B.getResources();
            int i3 = this.f6519D.f14885a.f12098e;
            if (i3 != 1) {
                if (i3 == 5 || i3 == 64) {
                    Object bJ = this.f6519D.bJ();
                    Object bI = this.f6519D.bI();
                    if (!(TextUtils.isEmpty(bJ) || TextUtils.isEmpty(bI))) {
                        textView.setText(new StringBuilder((String.valueOf(bJ).length() + 1) + String.valueOf(bI).length()).append(bJ).append("\n").append(bI).toString());
                    }
                }
                textView.setText(this.f6519D.f14885a.f12100g);
            } else if (this.f6519D.bW()) {
                textView.setText(resources.getString(C7582R.string.early_access_app_title, new Object[]{this.f6519D.f14885a.f12100g}));
            } else if (this.f6519D.bT()) {
                textView.setText(resources.getString(C7582R.string.testing_program_app_title, new Object[]{this.f6519D.f14885a.f12100g}));
            } else {
                textView.setText(this.f6519D.f14885a.f12100g);
            }
        }
        int i4 = this.f6519D.f14885a.f12098e;
        ViewGroup viewGroup = (ViewGroup) mo1323c((int) C7582R.id.title_creator_panel);
        DecoratedTextView decoratedTextView = (DecoratedTextView) viewGroup.findViewById(C7582R.id.title_creator);
        mo1323c((int) C7582R.id.title_rating_size);
        ViewGroup viewGroup2 = (ViewGroup) mo1323c((int) C7582R.id.title_content_rating_panel);
        PlayTextView playTextView = (PlayTextView) mo1323c((int) C7582R.id.title_app_size);
        if (decoratedTextView != null) {
            if (i4 == 3 || i4 == 2 || i4 == 4 || i4 == 5 || i4 == 64 || i4 == 30) {
                viewGroup.setVisibility(8);
                viewGroup2.setVisibility(8);
            } else if (i4 == 6) {
                viewGroup.setVisibility(8);
                this.f6541Z.m13624a(this.f6519D, viewGroup2);
            } else {
                viewGroup.setVisibility(0);
                decoratedTextView.setText(ac.m18475a(this.f6519D));
                this.f6541Z.m13625a(this.f6519D, decoratedTextView);
                this.f6541Z.m13624a(this.f6519D, viewGroup2);
                if (i4 == 1 && C1473m.f7980a.dj().mo2294a(12631928)) {
                    CharSequence a = this.aa.m8958a(this.f6517B, this.f6519D);
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
        C2576a.m13620a(this.f6519D, (DecoratedTextView) mo1323c((int) C7582R.id.title_tipper_sticker));
        m6356k();
        DetailsSummaryWishlistView detailsSummaryWishlistView = (DetailsSummaryWishlistView) mo1323c((int) C7582R.id.title_wishlist_button);
        if (detailsSummaryWishlistView != null) {
            if (this.f6526K) {
                detailsSummaryWishlistView.setVisibility(8);
            } else {
                detailsSummaryWishlistView.m17280a(this.f6519D, this.f6547z, this.f6534S);
            }
        }
        Resources resources2 = this.f6517B.getResources();
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
        if (this.f6526K || r2 != 0) {
            playCardThumbnail.setVisibility(0);
            playCardThumbnail.a(this.f6519D.f14885a.f12099f, false);
            LayoutParams layoutParams = playCardThumbnail.getLayoutParams();
            layoutParams.width = C1608h.m9259e(this.f6517B, i4);
            layoutParams.height = C1608h.m9261f(this.f6517B, i4);
            View view = (DocImageView) playCardThumbnail.getImageView();
            view.setScaleType(ScaleType.FIT_START);
            if (C3760e.m17903a() && this.f6536U != null) {
                android.support.v4.view.ai.m1832a(view, this.f6536U);
            }
            if (!this.f6537V) {
                view.m13584a(this.f6519D, this.f6545x, DocImageView.f13711a);
            }
            view.setFocusable(this.f6530O);
            view.setContentDescription(C1608h.m9249a(this.f6519D.f14885a.f12100g, this.f6519D.f14885a.f12098e, resources2));
            if (this.f6530O) {
                view.setOnClickListener(new cv(this));
                view.setForeground(C0216d.m1112a(this.f6517B, (int) C7582R.drawable.play_highlight_overlay_dark));
            }
            if (k) {
                i = 0;
            } else if (C2580f.m13631a(i4) && C2581g.m13638c(this.f6519D, k) != null) {
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
        if (!this.f6526K) {
            int i6;
            CharSequence t;
            viewGroup = (ViewGroup) mo1323c((int) C7582R.id.title_bylines);
            viewGroup.removeAllViews();
            LayoutInflater from = LayoutInflater.from(this.f6517B);
            switch (this.f6519D.f14885a.f12098e) {
                case 5:
                case 64:
                    if (this.f6519D.bE()) {
                        m6330b(from, viewGroup, this.f6519D.bF());
                        break;
                    }
                    break;
                case 6:
                    lq S = this.f6519D.m14630S();
                    if (!(this.f6519D.ab() || TextUtils.isEmpty(S.f13039d))) {
                        m6330b(from, viewGroup, S.f13039d);
                    }
                    if (this.f6519D.ar() == null) {
                        if (TextUtils.isEmpty(S.f13040e)) {
                            m6330b(from, viewGroup, this.f6517B.getString(C7582R.string.no_movie_rating));
                        } else {
                            m6330b(from, viewGroup, S.f13040e);
                        }
                    }
                    if (!TextUtils.isEmpty(S.f13038c)) {
                        m6330b(from, viewGroup, S.f13038c);
                        break;
                    }
                    break;
                case 18:
                    if (this.f6543v) {
                        la U = this.f6519D.m14632U();
                        if (U != null && U.bK_()) {
                            m6330b(from, viewGroup, U.f13000h);
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
            LayoutInflater from2 = LayoutInflater.from(this.f6517B);
            if (t_()) {
                t = this.f6519D.m14665t();
                if (!TextUtils.isEmpty(t)) {
                    mo1322a(from2, viewGroup, t);
                }
            }
            C2206c ah = C1473m.f7980a.ah();
            Account a2 = this.f6542u.m11642a(this.f6519D, this.f6518C);
            if (a2 != null) {
                C2196e a3 = ah.mo2811a(this.f6518C);
                if (this.f6542u.m11655c(this.f6519D, a3)) {
                    bl e = this.f6519D.m14649e(this.f6542u.m11651b(this.f6519D, a3));
                    if (e != null) {
                        if (!e.m12280f() || e.f11934x <= System.currentTimeMillis()) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        if (i6 != 0) {
                            long j = e.f11935y;
                            t = this.f6517B.getString(C7582R.string.owned_preorder_note, new Object[]{C1473m.f7980a.bb().m21828b(j)});
                            mo1322a(from2, viewGroup, t);
                        }
                    }
                    t = this.f6517B.getString(C7582R.string.owned_preorder_note_no_sale_date);
                    mo1322a(from2, viewGroup, t);
                }
            }
            if (a2 == null) {
                if (this.f6542u.m11656d(this.f6519D, ah.mo2811a(this.f6518C))) {
                    mo1322a(from2, viewGroup, this.f6517B.getString(C7582R.string.movie_preordered_through_bundle));
                } else if (this.f6519D.f14885a.f12099f != 6 && mo1325f()) {
                    bl c = C1473m.f7980a.mo2044X().m11790c(this.f6519D, this.f6528M, ah.mo2811a(this.f6518C));
                    if (c == null) {
                        t = null;
                    } else {
                        i6 = this.f6519D.f14885a.f12098e;
                        i = c.f11926p;
                        if (i6 == 6) {
                            i6 = dc.m6394a(c);
                        } else if (i6 == 5 && i == 3) {
                            i6 = C7582R.string.list_price_rental;
                        } else {
                            i6 = C7582R.string.list_price;
                        }
                        String str = c.f11922l;
                        Object string = this.f6517B.getString(i6, new Object[]{str});
                        t = new SpannableStringBuilder(string);
                        int indexOf = string.indexOf(str);
                        if (indexOf >= 0) {
                            t.setSpan(new StrikethroughSpan(), indexOf, str.length() + indexOf, 17);
                        }
                    }
                    if (!TextUtils.isEmpty(t)) {
                        if (this.f6542u.m11649a(this.f6519D, this.f6528M, C1473m.f7980a.ah().mo2811a(this.f6518C))) {
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

    protected final void m6356k() {
        DetailsTitleCreatorBlock detailsTitleCreatorBlock = (DetailsTitleCreatorBlock) mo1323c((int) C7582R.id.title_creator_block);
        OrsonTitleCreatorBlock orsonTitleCreatorBlock = (OrsonTitleCreatorBlock) mo1323c(C1592a.am.intValue());
        if (C1473m.f7980a.dj().mo2294a(12633045) && this.f6519D.f14885a.f12098e == 64) {
            String str;
            String str2;
            String str3;
            cv cvVar = this.f6519D.f14885a;
            if (this.f6519D.m14667v()) {
                str = this.f6519D.m14666u().f14885a.f12100g;
            } else {
                str = this.f6519D.f14885a.f12102i;
            }
            Document document = this.f6519D;
            if (document.bM()) {
                str2 = document.bN().f12467b;
            } else {
                str2 = null;
            }
            boolean bR = this.f6519D.bR();
            if (this.f6519D.bM()) {
                str3 = this.f6519D.bN().f12470e;
            } else {
                str3 = null;
            }
            au auVar = new au(str, str2, bR, str3, this.f6519D.m14629R().f11771c, this.f6519D.ab());
            if (orsonTitleCreatorBlock != null) {
                OnClickListener onClickListener = this.ad;
                orsonTitleCreatorBlock.f18267a.setText(auVar.f18497a);
                if (onClickListener != null) {
                    orsonTitleCreatorBlock.f18267a.setTextColor(orsonTitleCreatorBlock.getResources().getColor(C1608h.m9241a(1)));
                    orsonTitleCreatorBlock.f18267a.setClickable(true);
                    orsonTitleCreatorBlock.f18267a.setOnClickListener(onClickListener);
                }
                orsonTitleCreatorBlock.f18267a.setVisibility(0);
                orsonTitleCreatorBlock.m17327a(auVar);
                orsonTitleCreatorBlock.setVisibility(0);
            }
            detailsTitleCreatorBlock.setVisibility(8);
            return;
        }
        if (detailsTitleCreatorBlock != null) {
            Document document2 = this.f6519D;
            C3748a c3748a = this.f6547z;
            ad adVar = this.f6535T;
            C2495w c2495w = this.f6534S;
            int i = document2.f14885a.f12098e;
            boolean v = document2.m14667v();
            if ((i == 2 || i == 4 || i == 5 || i == 64 || v) && i != 1) {
                if (v) {
                    Document u = document2.m14666u();
                    detailsTitleCreatorBlock.f18131b.setText(u.f14885a.f12100g);
                    List c = u.m14644c(0);
                    if (c == null || c.size() == 0) {
                        detailsTitleCreatorBlock.f18130a.setVisibility(8);
                    } else {
                        bd bdVar = (bd) c.get(0);
                        C1473m.f7980a.ar().m9288a(detailsTitleCreatorBlock.f18130a, bdVar.f11860f, bdVar.f11863i);
                        detailsTitleCreatorBlock.f18130a.setVisibility(0);
                        if (C3760e.m17903a()) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("transition_generic_circle:");
                            stringBuilder.append(":");
                            stringBuilder.append(u.f14885a.f12096c);
                            android.support.v4.view.ai.m1832a(detailsTitleCreatorBlock.f18130a, stringBuilder.toString());
                        }
                    }
                    if (!(TextUtils.isEmpty(u.f14885a.f12116w) || c3748a == null)) {
                        detailsTitleCreatorBlock.setFocusable(true);
                        detailsTitleCreatorBlock.setOnClickListener(new C3729v(detailsTitleCreatorBlock, c2495w, adVar, c3748a, u));
                    }
                } else {
                    detailsTitleCreatorBlock.f18131b.setText(document2.f14885a.f12102i);
                    detailsTitleCreatorBlock.f18130a.setVisibility(8);
                }
                detailsTitleCreatorBlock.f18132c.setVisibility(8);
                if (i == 5 || i == 64 || i == 44) {
                    CharSequence bH;
                    if (i != 5) {
                        bH = document2.bH();
                    } else if (!document2.m14624M() || document2.f14885a.f12112s.f12052e == null) {
                        bH = null;
                    } else {
                        bH = document2.f14885a.f12112s.f12052e.f11770b;
                    }
                    if (!TextUtils.isEmpty(bH)) {
                        detailsTitleCreatorBlock.f18132c.setVisibility(0);
                        detailsTitleCreatorBlock.f18132c.setText(bH);
                    }
                }
                if (i == 1) {
                    C1473m.f7980a.ch().m13625a(document2, detailsTitleCreatorBlock.f18131b);
                }
                if (i == 2 || i == 4 || i == 5 || i == 64) {
                    String str4 = null;
                    if (i == 2 || i == 4) {
                        str4 = document2.m14626O().f12397c.f12378e;
                    } else if (i == 5 || i == 64) {
                        str4 = document2.m14629R().f11771c;
                    }
                    if (!(document2.ab() || TextUtils.isEmpty(str4))) {
                        try {
                            detailsTitleCreatorBlock.f18133d.setText(C1473m.f7980a.bb().m21827a(str4));
                            detailsTitleCreatorBlock.f18133d.setVisibility(0);
                        } catch (Throwable e) {
                            FinskyLog.m21660a(e, "Cannot parse ISO 8601 date", new Object[0]);
                        }
                    }
                    detailsTitleCreatorBlock.f18133d.setVisibility(8);
                }
                detailsTitleCreatorBlock.setVisibility(0);
            } else {
                detailsTitleCreatorBlock.setVisibility(8);
            }
        }
        orsonTitleCreatorBlock.setVisibility(8);
    }

    protected final OnClickListener m6357l() {
        if (!this.f6519D.bK() || TextUtils.isEmpty(this.f6519D.bL())) {
            return null;
        }
        return new cw(this);
    }

    protected final OnClickListener m6358m() {
        if (!this.f6519D.m14667v() || TextUtils.isEmpty(this.f6519D.m14666u().f14885a.f12116w)) {
            return null;
        }
        return new cx(this);
    }

    public void mo1321a(Bitmap bitmap) {
        PlayCardThumbnail playCardThumbnail = (PlayCardThumbnail) mo1323c((int) C7582R.id.title_thumbnail_frame);
        if (playCardThumbnail != null) {
            ((DocImageView) playCardThumbnail.getImageView()).setImageBitmap(bitmap);
        }
    }

    public void mo1328n() {
        PlayCardThumbnail playCardThumbnail = (PlayCardThumbnail) mo1323c((int) C7582R.id.title_thumbnail_frame);
        if (playCardThumbnail != null) {
            ((DocImageView) playCardThumbnail.getImageView()).m13584a(this.f6519D, this.f6545x, DocImageView.f13711a);
        }
        this.f6537V = false;
    }

    private static void m6330b(LayoutInflater layoutInflater, ViewGroup viewGroup, CharSequence charSequence) {
        TextView textView = (TextView) layoutInflater.inflate(C7582R.layout.details_summary_byline_label, viewGroup, false);
        textView.setText(charSequence);
        viewGroup.addView(textView);
    }

    protected void mo1322a(LayoutInflater layoutInflater, ViewGroup viewGroup, CharSequence charSequence) {
        TextView textView = (TextView) layoutInflater.inflate(C7582R.layout.details_summary_extra_label, viewGroup, false);
        textView.setText(charSequence);
        textView.setTextColor(C1608h.m9243a(this.f6517B, this.f6519D.f14885a.f12099f));
        viewGroup.addView(textView);
    }

    protected final void m6360o() {
        if (!C1473m.f7980a.dj().mo2294a(12633045)) {
            return;
        }
        if ((this.f6519D.f14885a.f12098e == 64 || this.f6519D.f14885a.f12098e == 5) && !TextUtils.isEmpty(this.f6519D.bL()) && this.ae != null) {
            LayoutInflater from = LayoutInflater.from(this.f6517B);
            View c = mo1323c((int) C7582R.id.title_extra_labels_bottom);
            c.setVisibility(0);
            DetailsSummaryExtraLabelsSection detailsSummaryExtraLabelsSection = (DetailsSummaryExtraLabelsSection) c;
            detailsSummaryExtraLabelsSection.removeAllViews();
            TextView textView = (TextView) from.inflate(C1592a.aq.intValue(), detailsSummaryExtraLabelsSection, false);
            detailsSummaryExtraLabelsSection.addView(textView);
            textView.setText(Html.fromHtml(this.f6519D.bL()));
            textView.setClickable(true);
            textView.setOnClickListener(this.ae);
        }
    }

    protected final void m6361p() {
        int i = 0;
        boolean z = !C1473m.f7980a.dj().mo2294a(12602049);
        View c = mo1323c((int) C7582R.id.title_extra_labels_bottom);
        if (c instanceof PlayTextView) {
            int i2;
            PlayTextView playTextView = (PlayTextView) c;
            if (this.f6519D.f14885a.f12098e != 1) {
                playTextView.setVisibility(8);
            }
            Resources resources = this.f6517B.getResources();
            StringBuilder stringBuilder = new StringBuilder();
            String string = resources.getString(C7582R.string.comma_separator);
            C2441n N = this.f6519D.m14625N();
            if (N == null || !z || TextUtils.isEmpty(N.f13170j)) {
                i2 = 0;
            } else {
                stringBuilder.append(N.f13170j);
                i2 = 1;
            }
            if (this.f6519D.m14658m()) {
                if (i2 != 0) {
                    stringBuilder.append(string);
                }
                stringBuilder.append(this.f6519D.m14659n().f13069c);
                i2 = 1;
            }
            if (this.f6519D.ae()) {
                if (this.f6542u.m11649a(this.f6519D, this.f6528M, C1473m.f7980a.ah().mo2811a(this.f6518C))) {
                    if (i2 != 0) {
                        stringBuilder.append(string);
                    }
                    stringBuilder.append(resources.getString(C7582R.string.preregistration_extra_label));
                }
            } else if (N != null) {
                if (N.m13104d() && !TextUtils.isEmpty(N.f13184x)) {
                    if (i2 != 0) {
                        stringBuilder.append(string);
                    }
                    stringBuilder.append(N.f13184x);
                    i2 = 1;
                }
                if (N.f13180t) {
                    if (i2 != 0) {
                        stringBuilder.append(string);
                    }
                    stringBuilder.append(resources.getString(C7582R.string.in_app_purchases));
                }
            }
            CharSequence stringBuilder2 = stringBuilder.toString();
            if (TextUtils.isEmpty(stringBuilder2)) {
                i = 8;
            }
            playTextView.setVisibility(i);
            playTextView.setText(stringBuilder2);
            if (!this.f6517B.getResources().getBoolean(C7582R.bool.use_full_width_buttons)) {
                playTextView.setGravity(8388613);
                return;
            }
            return;
        }
        DetailsSummaryExtraLabelsSection detailsSummaryExtraLabelsSection = (DetailsSummaryExtraLabelsSection) c;
        if (this.f6519D.f14885a.f12098e != 1) {
            detailsSummaryExtraLabelsSection.setVisibility(8);
        } else {
            this.f6540Y.m13630a(detailsSummaryExtraLabelsSection, this.f6519D, z);
        }
    }

    protected boolean t_() {
        return this.f6542u.m11642a(this.f6519D, this.f6518C) == null;
    }

    protected boolean mo1325f() {
        return true;
    }

    protected final String m6343b(boolean z) {
        if (z) {
            return this.f6517B.getString(C7582R.string.install);
        }
        if (!this.f6519D.ah()) {
            if (this.f6519D.f14885a.f12099f == 3) {
                return this.f6517B.getString(C7582R.string.install);
            }
            if (this.f6519D.f14885a.f12099f == 1) {
                return this.f6517B.getString(C7582R.string.open);
            }
        }
        bl e = this.f6519D.m14649e(1);
        if (e == null || !e.aL_()) {
            return "";
        }
        return e.f11917g;
    }

    protected final int m6346c(boolean z) {
        if (z) {
            return 221;
        }
        if (!this.f6519D.ah()) {
            if (this.f6519D.f14885a.f12099f == 3) {
                return 221;
            }
            if (this.f6519D.f14885a.f12099f == 1) {
                return 225;
            }
        }
        return 200;
    }

    protected void mo1318a(boolean z) {
        PlayActionButtonV2 playActionButtonV2 = (PlayActionButtonV2) mo1323c((int) C7582R.id.try_button);
        PlayActionButtonV2 playActionButtonV22 = (PlayActionButtonV2) mo1323c((int) C7582R.id.buy_button);
        PlayActionButtonV2 playActionButtonV23 = (PlayActionButtonV2) mo1323c((int) C7582R.id.buy_button2);
        PlayActionButtonV2 playActionButtonV24 = (PlayActionButtonV2) mo1323c((int) C7582R.id.launch_button);
        PlayActionButtonV2 playActionButtonV25 = (PlayActionButtonV2) mo1323c((int) C7582R.id.download_button);
        PlayActionButtonV2 playActionButtonV26 = (PlayActionButtonV2) mo1323c(C1592a.f8426A.intValue());
        WishlistPlayActionButton wishlistPlayActionButton = (WishlistPlayActionButton) mo1323c((int) C7582R.id.wishlist_action_button);
        playActionButtonV24.setVisibility(8);
        if (playActionButtonV2 != null) {
            playActionButtonV2.setVisibility(8);
        }
        playActionButtonV22.setVisibility(8);
        if (playActionButtonV23 != null) {
            playActionButtonV23.setVisibility(8);
        }
        if (playActionButtonV25 != null) {
            playActionButtonV25.setVisibility(8);
        }
        if (playActionButtonV26 != null) {
            playActionButtonV26.setVisibility(8);
        }
        if (wishlistPlayActionButton != null) {
            wishlistPlayActionButton.setVisibility(8);
        }
        if (!this.f6525J && !z && mo1332a(playActionButtonV24, playActionButtonV22, playActionButtonV23, playActionButtonV2, playActionButtonV25, playActionButtonV26, wishlistPlayActionButton)) {
            mo1329q();
        }
    }

    protected void mo1320c() {
        int i;
        int i2 = Integer.MAX_VALUE;
        for (i = 0; i < this.f6524I.getChildCount(); i++) {
            PlayActionButtonV2 playActionButtonV2 = (PlayActionButtonV2) this.f6524I.getChildAt(i);
            if (playActionButtonV2.getVisibility() == 0 && playActionButtonV2.getPriority() < i2) {
                i2 = playActionButtonV2.getPriority();
            }
        }
        for (i = 0; i < this.f6524I.getChildCount(); i++) {
            playActionButtonV2 = (PlayActionButtonV2) this.f6524I.getChildAt(i);
            if (playActionButtonV2.getVisibility() == 0) {
                if (playActionButtonV2.getPriority() == i2) {
                    playActionButtonV2.setActionStyle(0);
                } else {
                    playActionButtonV2.setActionStyle(2);
                }
            }
        }
    }

    protected boolean mo1332a(PlayActionButtonV2 playActionButtonV2, PlayActionButtonV2 playActionButtonV22, PlayActionButtonV2 playActionButtonV23, PlayActionButtonV2 playActionButtonV24, PlayActionButtonV2 playActionButtonV25, PlayActionButtonV2 playActionButtonV26, WishlistPlayActionButton wishlistPlayActionButton) {
        C2196e a = C1473m.f7980a.ah().mo2811a(this.f6518C);
        Account a2 = this.f6542u.m11642a(this.f6519D, this.f6518C);
        if (a2 != null) {
            if (this.f6542u.m11655c(this.f6519D, a)) {
                Document document = this.f6519D;
                playActionButtonV2.setVisibility(0);
                playActionButtonV2.setEnabled(!this.f6532Q);
                playActionButtonV2.m6000a(document.f14885a.f12099f, (int) C7582R.string.cancel_preorder, m6329b(document, a2));
            } else {
                Document document2 = this.f6519D;
                playActionButtonV2.setVisibility(0);
                playActionButtonV2.setEnabled(true);
                playActionButtonV2.m6000a(document2.f14885a.f12099f, C1608h.m9258e(document2.f14885a.f12099f), this.f6547z.mo3626a(document2, a2, this.f6516A, this.f6534S));
            }
            return true;
        } else if (!this.f6542u.m11649a(this.f6519D, this.f6528M, a)) {
            return false;
        } else {
            a2 = this.f6518C;
            bl e = this.f6519D.m14649e(1);
            if (e != null) {
                int i;
                String string;
                playActionButtonV22.setVisibility(0);
                if (this.f6519D.ab()) {
                    i = 234;
                    string = this.f6517B.getString(C7582R.string.preorder, new Object[]{e.f11917g});
                } else {
                    String b = m6343b(false);
                    i = m6346c(false);
                    string = b;
                }
                playActionButtonV22.mo2588a(this.f6519D.f14885a.f12099f, string, this.f6547z.mo3624a(a2, this.f6519D, e.f11926p, null, this.f6527L, i, null, this.f6534S));
            }
            if (this.f6519D.ag() && playActionButtonV24 != null) {
                OnClickListener a3;
                playActionButtonV24.setVisibility(0);
                if (this.f6542u.m11648a(this.f6519D, a, 2)) {
                    a3 = this.f6547z.mo3626a(this.f6519D, this.f6518C, this.f6516A, this.f6534S);
                } else {
                    a3 = this.f6547z.mo3624a(this.f6518C, this.f6519D, 2, null, this.f6527L, 222, null, this.f6534S);
                }
                playActionButtonV24.m6000a(this.f6519D.f14885a.f12099f, (int) C7582R.string.sample, a3);
            }
            return true;
        }
    }

    protected final boolean m6341a(PlayActionButtonV2 playActionButtonV2, PlayActionButtonV2 playActionButtonV22, PlayActionButtonV2 playActionButtonV23, PlayActionButtonV2 playActionButtonV24, PlayActionButtonV2 playActionButtonV25, WishlistPlayActionButton wishlistPlayActionButton) {
        C2455b a = C1473m.f7980a.mo2250j().m13148a();
        this.f6539X.m13154a(this.f6518C, this.f6528M, 3, this.f6519D, a);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < a.f13244e; i3++) {
            if (i >= 2) {
                FinskyLog.m21665c("Not supposed to have more than %d actions available", Integer.valueOf(2));
                break;
            }
            C2454a a2 = a.m13141a(i3);
            if (a2.f13230a == 6 || a2.f13230a == 9) {
                m6328a(playActionButtonV2, a2, a.f13242c);
                i++;
            } else if (a2.f13230a == 11 || a2.f13230a == 10) {
                m6328a(playActionButtonV24, a2, a.f13242c);
                i++;
            } else if (a2.f13230a == 21) {
                m6328a(playActionButtonV24, a2, a.f13242c);
                aq.m5924a(C1473m.f7980a.f7981b, playActionButtonV24, this.f6533R);
                i++;
            } else if (a2.f13230a == 12) {
                m6328a(playActionButtonV25, a2, a.f13242c);
                i++;
            } else {
                if (i2 == 0) {
                    m6328a(playActionButtonV22, a2, a.f13242c);
                } else {
                    m6328a(playActionButtonV23, a2, a.f13242c);
                }
                i2++;
                i++;
            }
        }
        if (a.m13146b() || !this.f6519D.f14885a.f12092I) {
            return a.m13146b();
        }
        wishlistPlayActionButton.m6004a(this.f6519D, this.f6547z, this.f6535T);
        return true;
    }

    private final void m6328a(PlayActionButtonV2 playActionButtonV2, C2454a c2454a, int i) {
        OnClickListener onClickListener = null;
        playActionButtonV2.setVisibility(0);
        C2458e c2458e = new C2458e();
        if (C1473m.f7980a.av().m9286k(this.f6517B.getResources())) {
            this.f6539X.m13158b(c2454a, i, this.f6533R, c2458e);
        } else {
            this.f6539X.m13155a(c2454a, i, this.f6533R, c2458e);
        }
        if (C1013j.m5984a(c2454a)) {
            onClickListener = C1013j.m5982a(c2454a, i, this.f6547z, this.f6527L, null, this.f6517B, this.f6534S);
        } else if (c2454a.f13230a == 9) {
            onClickListener = m6329b(c2454a.f13237h, c2454a.f13238i);
        } else if (c2454a.f13230a == 12) {
            onClickListener = mo1334a(c2454a.f13237h, c2454a.f13238i);
        } else if (c2454a.f13230a == 15) {
            onClickListener = mo1333a(c2454a.f13237h);
        } else if (c2454a.f13230a == 21) {
            onClickListener = new cz(this);
        } else {
            FinskyLog.m21669e("Can't create a click listener for action %d", Integer.valueOf(c2454a.f13230a));
        }
        playActionButtonV2.mo2588a(i, c2458e.m13160a(this.f6517B), onClickListener);
    }

    private final OnClickListener m6329b(Document document, Account account) {
        return new cy(this, document, account);
    }

    protected OnClickListener mo1334a(Document document, Account account) {
        return null;
    }

    protected OnClickListener mo1333a(Document document) {
        return null;
    }

    protected void mo1319b() {
        mo1324d(this.f6542u.m11649a(this.f6519D, this.f6528M, C1473m.f7980a.ah().mo2811a(this.f6518C)));
        this.f6524I.setVisibility(4);
        if (!this.f6525J) {
            if (this.f6522G) {
                mo1314a((int) C7582R.string.refunding);
            } else {
                mo1318a(false);
            }
        }
    }

    protected void mo1329q() {
        ai.m9228a(this.f6524I, 4);
    }

    protected void mo1314a(int i) {
        TextView textView = (TextView) this.f6523H.findViewById(C7582R.id.summary_dynamic_status);
        this.f6524I.setVisibility(8);
        textView.setVisibility(0);
        textView.setText(this.f6517B.getResources().getString(i));
    }

    public void mo1324d(boolean z) {
        this.f6525J = !z;
    }

    public void mo1330r() {
        this.f6526K = true;
    }

    public void mo1315a(int i, Bundle bundle) {
        if (i == 7) {
            Document document = (Document) bundle.getParcelable("DetailsSummaryViewBinder.doc");
            Object string = bundle.getString("DetailsSummaryViewBinder.ownerAccountName");
            if (document != null && !TextUtils.isEmpty(string)) {
                C1254c b = C1473m.f7980a.mo2112b(string);
                C0660x c2234p = new C2234p(C1473m.f7980a.ai(), b.mo1620b(), new da(this));
                C0657w dbVar = new db(this);
                this.f6532Q = true;
                mo1326i();
                b.mo1585a(document.f14885a.f12096c, document.m14646d(), c2234p, dbVar);
            }
        }
    }

    public final void mo1210b(int i) {
        this.f6533R = i;
        if (i == 9) {
            C1508k c1508k = new C1508k();
            c1508k.m8848a(C1592a.al.intValue()).m8860d((int) C7582R.string.ok);
            c1508k.mo2272a().m625a(this.f6516A.f730B, "sample_error_dialog");
        } else {
            mo1326i();
        }
        if (this.ac != null) {
            this.ac.m18296a(this.f6534S, this.f6519D.f14885a.f12087D);
        }
    }

    protected final void m6350d(int i) {
        this.f6534S.m13379b(new C2475d(this.f6535T).m13256a(i));
    }

    public final void mo1214d() {
        if (C1473m.f7980a.dj().mo2294a(12633045) && this.f6544w != null && this.f6519D.f14885a.f12098e == 64 && this.f6519D.bO()) {
            this.f6544w.m18304a(this.f6519D.bP());
        }
    }
}

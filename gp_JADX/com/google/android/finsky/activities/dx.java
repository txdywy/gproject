package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1060p;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.aa;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.ct.C2412a;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.detailscomponents.C2596w;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.detailscomponents.ScreenshotsRecyclerView;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.HorizontalSeparatorContainer;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.inlinedetails.C3247b;
import com.google.android.finsky.installqueue.C3363f;
import com.google.android.finsky.layout.DetailsSummaryWishlistView;
import com.google.android.finsky.layout.ScreenshotGallery;
import com.google.android.finsky.layout.WarningMessageSection;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.StarRatingBar;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.text.NumberFormat;
import java.util.List;

public final class dx extends C1045b implements ah {
    public Document f6681a;
    public long af = C2482j.m13315j();
    public ce ag = C2482j.m13283a(5400);
    public C2473o ah = null;
    public boolean ai = false;
    public C1060p aj;
    public boolean ak;
    public boolean al;
    public C2233o am;
    public boolean an;
    public boolean ao;
    public C2412a ap;
    public C1542f aq;
    public boolean ar;
    public boolean as;
    public C4809e at;
    public C2206c f6682c;
    public boolean f6683f = false;
    public String f6684g;
    public String f6685h;
    public final Handler f6686i = new Handler(Looper.getMainLooper());
    public DfeToc k_;
    public C2719i l_;
    public String m_;

    public final void mo136b(Bundle bundle) {
        boolean z = false;
        super.mo136b(bundle);
        this.am = C1473m.f7980a.mo2045Y();
        C1473m.f7980a.mo2245h();
        C1473m.f7980a.cB();
        this.ak = this.f760q.getBoolean("InlineAppDetailsFragment.allow_latency_logging", false);
        if (this.ak) {
            int i = this.f760q.getInt("InlineAppDetailsFragment.page_type", 0);
            if (i == 0) {
                FinskyLog.m21669e("Page type not specified!", new Object[0]);
            }
            m6264i(i);
        }
        C1552e dj = C1473m.f7980a.dj();
        this.ao = dj.mo2294a(12640662);
        this.an = dj.mo2294a(12631898);
        if (this.an || dj.mo2294a(12630292)) {
            z = true;
        }
        this.al = z;
        this.as = C1473m.f7980a.dj().mo2294a(12641050);
    }

    private final boolean aj() {
        return this.l_ != null && this.l_.mo2861a();
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        this.ap = C1473m.f7980a.mo2028H();
        this.aq = C1473m.f7980a.mo2027G();
        this.ap.m12119a(m603h(), null);
        this.f6682c = C1473m.f7980a.ah();
        this.k_ = C1473m.f7980a.dn();
        if (bundle != null) {
            this.m_ = bundle.getString("referrer");
            this.f6684g = bundle.getString("inline_details_url");
            this.f6685h = bundle.getString("continue_url");
        }
        this.bs.m16127a(0, null);
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        if (bundle != null) {
            bundle.putString("referrer", this.m_);
            bundle.putString("inline_details_url", this.f6684g);
            bundle.putString("continue_url", this.f6685h);
        }
    }

    public final void mo1346w() {
        ao();
        super.mo1346w();
    }

    protected final boolean mo1343X() {
        return true;
    }

    protected final void aa() {
        mo1294k(1718);
        if (this.l_ != null) {
            this.l_.m11922b((C1031w) this);
            this.l_.m11921b((C0657w) this);
        }
        this.l_ = new C2719i(C1473m.f7980a.ap(), this.f6684g);
        this.l_.m11918a((C1031w) this);
        this.l_.m11917a((C0657w) this);
    }

    protected final void cg_() {
        if (aj() && this.f6683f) {
            this.f6681a = this.l_.m14722b();
            if (this.f6681a.f14885a.f12099f != 3) {
                FinskyLog.m21667d("Only apps are supported: %s", this.f6681a.f14885a.f12096c);
                m603h().finish();
            } else if (this.f6681a != null) {
                int i;
                View view = this.f746R;
                HorizontalSeparatorContainer horizontalSeparatorContainer = (HorizontalSeparatorContainer) view.findViewById(C7582R.id.details_stack);
                if (this.aj == null && C1473m.f7980a.aP().m13357b() && this.ak) {
                    this.aj = new eb(this, horizontalSeparatorContainer);
                }
                Document document = this.f6681a;
                TextView textView = (TextView) view.findViewById(C7582R.id.title_title);
                if (textView != null) {
                    textView.setText(document.f14885a.f12100g);
                    textView.setSelected(true);
                }
                ViewGroup viewGroup = (ViewGroup) view.findViewById(C7582R.id.title_creator_panel);
                DecoratedTextView decoratedTextView = (DecoratedTextView) viewGroup.findViewById(C7582R.id.title_creator);
                if (decoratedTextView != null) {
                    viewGroup.setVisibility(0);
                    decoratedTextView.setText(ac.m18475a(document));
                    C1473m.f7980a.ch().m13625a(document, decoratedTextView);
                }
                viewGroup = (ViewGroup) view.findViewById(C7582R.id.title_content_rating_panel);
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    C1473m.f7980a.ch().m13624a(this.f6681a, viewGroup);
                }
                DetailsSummaryWishlistView detailsSummaryWishlistView = (DetailsSummaryWishlistView) view.findViewById(C7582R.id.title_wishlist_button);
                if (detailsSummaryWishlistView != null) {
                    detailsSummaryWishlistView.m17280a(document, this.bp, this.bw);
                }
                Resources resources = this.bn.getResources();
                PlayCardThumbnail playCardThumbnail = (PlayCardThumbnail) view.findViewById(C7582R.id.title_thumbnail_frame);
                playCardThumbnail.setVisibility(0);
                playCardThumbnail.a(-1, false);
                LayoutParams layoutParams = playCardThumbnail.getLayoutParams();
                int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.inline_app_thumbnail_size_three_lines);
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                DocImageView docImageView = (DocImageView) playCardThumbnail.getImageView();
                docImageView.setScaleType(ScaleType.FIT_START);
                docImageView.m13584a(document, this.bD, DocImageView.f13711a);
                docImageView.setFocusable(false);
                docImageView.setContentDescription(C1608h.m9249a(document.f14885a.f12100g, document.f14885a.f12098e, resources));
                resources = this.bn.getResources();
                StarRatingBar starRatingBar = (StarRatingBar) view.findViewById(C7582R.id.star_rating_bar);
                if (starRatingBar != null && document.m14620I()) {
                    starRatingBar.setRating(aa.m9201a(document.m14621J()));
                }
                textView = (TextView) view.findViewById(C7582R.id.rating_count);
                if (textView != null && document.m14620I()) {
                    float K = (float) document.m14622K();
                    textView.setText(NumberFormat.getIntegerInstance().format((double) K));
                    textView.setContentDescription(resources.getQuantityString(C7582R.plurals.content_description_review_histogram_review_count, (int) K, new Object[]{Integer.valueOf((int) K)}));
                }
                C2441n N = document.m14625N();
                if (N != null) {
                    if (N.m13104d() && !TextUtils.isEmpty(N.f13184x)) {
                        textView = (TextView) view.findViewById(C7582R.id.title_extra_label_install_notes);
                        textView.setText(N.f13184x);
                        textView.setVisibility(0);
                    }
                    if (N.f13180t) {
                        textView = (TextView) view.findViewById(C7582R.id.title_extra_label_in_app_purchase);
                        textView.setText(C7582R.string.in_app_purchases);
                        textView.setVisibility(0);
                    }
                }
                DfeToc dn = C1473m.f7980a.dn();
                Account b = this.bo.mo1620b();
                if (this.am.m11649a(document, dn, C1473m.f7980a.ah().mo2811a(b))) {
                    View view2 = (PlayActionButtonV2) view.findViewById(C7582R.id.buy_button);
                    PlayActionButtonV2 playActionButtonV2 = (PlayActionButtonV2) view.findViewById(C7582R.id.launch_button);
                    playActionButtonV2.setVisibility(8);
                    view2.setVisibility(8);
                    C2196e ah = C1473m.f7980a.ah();
                    C3026a a = C1473m.f7980a.bt().m15626a(document.m14625N().f13171k);
                    if (this.f760q.getBoolean("InlineAppDetailsFragment.allow_update", false) && a.f15820h) {
                        C2196e a2 = ah.mo2811a(b);
                        if ((a.m15624b(document) || a.m15622a(document)) && this.am.m11649a(document, dn, a2) && !this.f6681a.ah()) {
                            view2.setVisibility(0);
                            view2.m6000a(document.f14885a.f12099f, (int) C7582R.string.update, m6470a(b, document, 217));
                        }
                    }
                    if (a.f15831s && !a.f15832t) {
                        playActionButtonV2.setVisibility(0);
                        playActionButtonV2.m6000a(document.f14885a.f12099f, (int) C7582R.string.open, this.bp.mo3626a(this.f6681a, b, (ad) this, this.bw));
                    } else if (!a.f15820h && this.am.m11649a(document, dn, ah)) {
                        int i2;
                        String string;
                        Account a3 = this.am.m11642a(document, b);
                        view2.setVisibility(0);
                        this.aq.m8974a(view2);
                        Object obj = a3 != null ? 1 : null;
                        if (obj != null) {
                            i2 = 221;
                        } else {
                            if (!document.ah()) {
                                if (document.f14885a.f12099f == 3) {
                                    i2 = 221;
                                } else if (document.f14885a.f12099f == 1) {
                                    i2 = 225;
                                }
                            }
                            i2 = 200;
                        }
                        i = document.f14885a.f12099f;
                        if (obj != null) {
                            string = this.bn.getString(C7582R.string.install);
                        } else {
                            if (!document.ah()) {
                                if (document.f14885a.f12099f == 3) {
                                    string = m603h().getString(C7582R.string.install);
                                } else if (document.f14885a.f12099f == 1) {
                                    string = this.bn.getString(C7582R.string.open);
                                }
                            }
                            bl e = document.m14649e(1);
                            if (e == null || !e.aL_()) {
                                string = "";
                            } else {
                                string = e.f11917g;
                            }
                        }
                        view2.mo2588a(i, string, m6470a(b, document, i2));
                    }
                }
                textView = (TextView) view.findViewById(C7582R.id.short_description_panel);
                if (textView != null) {
                    CharSequence charSequence = this.f6681a.f14885a.f12105l;
                    if (TextUtils.isEmpty(charSequence)) {
                        charSequence = this.f6681a.m14612A();
                    }
                    textView.setText(charSequence);
                }
                if (this.al) {
                    ScreenshotsRecyclerView screenshotsRecyclerView = (ScreenshotsRecyclerView) view.findViewById(C7582R.id.screenshots_panel);
                    screenshotsRecyclerView.m13618a(C2596w.m13652a(this.f6681a, 1), new dz(this), this);
                    if (this.ao) {
                        resources = m605i();
                        screenshotsRecyclerView.getLayoutParams().height = resources.getDimensionPixelSize(C7582R.dimen.inline_details_screenshots_height);
                        this.bt.setMinimumWidth(resources.getDimensionPixelSize(C7582R.dimen.inline_app_dialog_fullscreen_minwidth_v2));
                    }
                } else {
                    ScreenshotGallery screenshotGallery = (ScreenshotGallery) view.findViewById(C7582R.id.screenshots_panel);
                    if (screenshotGallery != null) {
                        screenshotGallery.f18363g.m17313a(0, this.bn.getResources().getDimensionPixelOffset(C7582R.dimen.screenshots_spacing));
                        Document document2 = this.f6681a;
                        C1294w c1294w = this.bD;
                        C3748a c3748a = this.bp;
                        screenshotGallery.setVisibility(0);
                        screenshotGallery.f18359c = c1294w;
                        screenshotGallery.f18358b = c3748a;
                        screenshotGallery.f18360d = document2;
                        screenshotGallery.f18361e = true;
                        screenshotGallery.m17344a();
                    }
                }
                ad c2473o = new C2473o(5402, this);
                textView = (TextView) view.findViewById(C7582R.id.more_details);
                if (textView != null) {
                    textView.setText(m592c((int) C7582R.string.more_details).toUpperCase());
                    textView.setOnClickListener(new ea(this, c2473o));
                }
                WarningMessageSection warningMessageSection = (WarningMessageSection) view.findViewById(C7582R.id.warning_message_panel);
                if (warningMessageSection != null) {
                    Object obj2;
                    int i3;
                    Object obj3;
                    Object obj4;
                    Object obj5;
                    C2233o Y;
                    Account a4;
                    Context context;
                    CharSequence fromHtml;
                    List b2;
                    int i4;
                    Context context2;
                    int i5;
                    ColorStateList c;
                    int paddingTop;
                    int paddingBottom;
                    Document document3 = this.f6681a;
                    DfeToc dfeToc = this.k_;
                    C2196e c2196e = this.f6682c;
                    Account b3 = this.bo.mo1620b();
                    C2196e a5 = c2196e.mo2811a(b3);
                    boolean a6 = C1473m.f7980a.mo2045Y().m11649a(document3, dfeToc, a5);
                    if (C1473m.f7980a.ab().m9806a(document3, (C2197a) a5) && document3.m14616E()) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    boolean al = document3.al();
                    if (document3.f14885a.f12098e == 1) {
                        bl[] blVarArr = document3.f14885a.f12107n;
                        dimensionPixelSize = blVarArr.length;
                        i3 = 0;
                        while (i3 < dimensionPixelSize) {
                            bl blVar = blVarArr[i3];
                            if (blVar.f11928r == null || (blVar.f11915e <= 0 && !blVar.f11925o)) {
                                i3++;
                            } else {
                                obj3 = !C1473m.f7980a.mo2045Y().m11647a(document3, a5) ? 1 : null;
                                obj4 = (!C1473m.f7980a.mo2045Y().m11647a(document3, a5) && document3.f14885a.f12098e == 1 && C1473m.f7980a.bt().m15626a(document3.m14625N().f13171k).m15625c()) ? 1 : null;
                                if (document3.m14625N() == null && document3.m14625N().f13182v) {
                                    obj5 = 1;
                                } else {
                                    obj5 = null;
                                }
                                Y = C1473m.f7980a.mo2045Y();
                                if (!(document3.f14885a.f12098e == 1 || Y.m11647a(document3, a5))) {
                                    a4 = Y.m11641a(document3);
                                    context = warningMessageSection.getContext();
                                    if (a4 == null) {
                                        fromHtml = Html.fromHtml(context.getString(C7582R.string.owned_by_other_account, new Object[]{a4.name}));
                                    } else if (document3.f14885a.f12099f == 6 && document3.bj()) {
                                        b2 = Y.m11653b(document3, dfeToc, c2196e);
                                        if (Y.m11643a(b2, b3) == null) {
                                            for (i4 = 0; i4 < b2.size(); i4++) {
                                                if (Y.m11641a((Document) b2.get(i4)) != null) {
                                                    fromHtml = Html.fromHtml(context.getString(C7582R.string.owned_by_other_account, new Object[]{Y.m11641a((Document) b2.get(i4)).name}));
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (!a6 && obj3 == null && !al && obj2 == null && obj5 == null && TextUtils.isEmpty(fromHtml) && obj4 == null) {
                                        warningMessageSection.setVisibility(8);
                                    } else {
                                        warningMessageSection.setVisibility(0);
                                        warningMessageSection.f18423b.setVisibility(8);
                                        context2 = warningMessageSection.getContext();
                                        i5 = document3.f14885a.f12099f;
                                        if (a6) {
                                            warningMessageSection.f18422a.setText(C1473m.f7980a.ax().m11783a(document3));
                                            warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                                        } else if (obj3 == null) {
                                            warningMessageSection.f18422a.setText(C7582R.string.enterprise_admin_purchased_app);
                                            warningMessageSection.f18424c.setImageResource(C7582R.drawable.ic_enterprise);
                                        } else if (obj5 == null) {
                                            warningMessageSection.f18422a.setText(C7582R.string.enterprise_externally_hosted_application);
                                            warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                                        } else if (!al) {
                                            warningMessageSection.f18422a.setText(document3.am());
                                            warningMessageSection.f18422a.setMovementMethod(LinkMovementMethod.getInstance());
                                            warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                                        } else if (obj2 == null) {
                                            warningMessageSection.f18422a.setText(document3.m14617F());
                                            warningMessageSection.f18424c.setImageDrawable(C1608h.m9264h(context2, i5));
                                        } else if (TextUtils.isEmpty(fromHtml)) {
                                            warningMessageSection.f18422a.setText(fromHtml);
                                            warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                                        } else if (obj4 != null) {
                                            warningMessageSection.f18422a.setText(C7582R.string.uninstall_blocked_warning);
                                            warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                                        }
                                        c = C1608h.m9255c(context2, i5);
                                        warningMessageSection.f18422a.setTextColor(c);
                                        warningMessageSection.f18423b.setTextColor(c);
                                        i3 = C1607g.m9234a(C1608h.m9243a(context2, i5), 0.15f);
                                        paddingTop = warningMessageSection.getPaddingTop();
                                        paddingBottom = warningMessageSection.getPaddingBottom();
                                        dimensionPixelSize = ai.f1848a.mo402m(warningMessageSection);
                                        i = ai.f1848a.mo401l(warningMessageSection);
                                        warningMessageSection.setBackgroundDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(i3), C0216d.m1112a(context2, (int) C7582R.drawable.play_highlight_overlay_dark)}));
                                        ai.m1823a(warningMessageSection, i, paddingTop, dimensionPixelSize, paddingBottom);
                                    }
                                }
                                fromHtml = null;
                                if (!a6) {
                                }
                                warningMessageSection.setVisibility(0);
                                warningMessageSection.f18423b.setVisibility(8);
                                context2 = warningMessageSection.getContext();
                                i5 = document3.f14885a.f12099f;
                                if (a6) {
                                    warningMessageSection.f18422a.setText(C1473m.f7980a.ax().m11783a(document3));
                                    warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                                } else if (obj3 == null) {
                                    warningMessageSection.f18422a.setText(C7582R.string.enterprise_admin_purchased_app);
                                    warningMessageSection.f18424c.setImageResource(C7582R.drawable.ic_enterprise);
                                } else if (obj5 == null) {
                                    warningMessageSection.f18422a.setText(C7582R.string.enterprise_externally_hosted_application);
                                    warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                                } else if (!al) {
                                    warningMessageSection.f18422a.setText(document3.am());
                                    warningMessageSection.f18422a.setMovementMethod(LinkMovementMethod.getInstance());
                                    warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                                } else if (obj2 == null) {
                                    warningMessageSection.f18422a.setText(document3.m14617F());
                                    warningMessageSection.f18424c.setImageDrawable(C1608h.m9264h(context2, i5));
                                } else if (TextUtils.isEmpty(fromHtml)) {
                                    warningMessageSection.f18422a.setText(fromHtml);
                                    warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                                } else if (obj4 != null) {
                                    warningMessageSection.f18422a.setText(C7582R.string.uninstall_blocked_warning);
                                    warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                                }
                                c = C1608h.m9255c(context2, i5);
                                warningMessageSection.f18422a.setTextColor(c);
                                warningMessageSection.f18423b.setTextColor(c);
                                i3 = C1607g.m9234a(C1608h.m9243a(context2, i5), 0.15f);
                                paddingTop = warningMessageSection.getPaddingTop();
                                paddingBottom = warningMessageSection.getPaddingBottom();
                                dimensionPixelSize = ai.f1848a.mo402m(warningMessageSection);
                                i = ai.f1848a.mo401l(warningMessageSection);
                                warningMessageSection.setBackgroundDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(i3), C0216d.m1112a(context2, (int) C7582R.drawable.play_highlight_overlay_dark)}));
                                ai.m1823a(warningMessageSection, i, paddingTop, dimensionPixelSize, paddingBottom);
                            }
                        }
                    }
                    obj3 = null;
                    if (!C1473m.f7980a.mo2045Y().m11647a(document3, a5)) {
                    }
                    if (document3.m14625N() == null) {
                    }
                    obj5 = null;
                    Y = C1473m.f7980a.mo2045Y();
                    a4 = Y.m11641a(document3);
                    context = warningMessageSection.getContext();
                    if (a4 == null) {
                        b2 = Y.m11653b(document3, dfeToc, c2196e);
                        if (Y.m11643a(b2, b3) == null) {
                            for (i4 = 0; i4 < b2.size(); i4++) {
                                if (Y.m11641a((Document) b2.get(i4)) != null) {
                                    fromHtml = Html.fromHtml(context.getString(C7582R.string.owned_by_other_account, new Object[]{Y.m11641a((Document) b2.get(i4)).name}));
                                    break;
                                }
                            }
                        }
                        fromHtml = null;
                    } else {
                        fromHtml = Html.fromHtml(context.getString(C7582R.string.owned_by_other_account, new Object[]{a4.name}));
                    }
                    if (!a6) {
                    }
                    warningMessageSection.setVisibility(0);
                    warningMessageSection.f18423b.setVisibility(8);
                    context2 = warningMessageSection.getContext();
                    i5 = document3.f14885a.f12099f;
                    if (a6) {
                        warningMessageSection.f18422a.setText(C1473m.f7980a.ax().m11783a(document3));
                        warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                    } else if (obj3 == null) {
                        warningMessageSection.f18422a.setText(C7582R.string.enterprise_admin_purchased_app);
                        warningMessageSection.f18424c.setImageResource(C7582R.drawable.ic_enterprise);
                    } else if (obj5 == null) {
                        warningMessageSection.f18422a.setText(C7582R.string.enterprise_externally_hosted_application);
                        warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                    } else if (!al) {
                        warningMessageSection.f18422a.setText(document3.am());
                        warningMessageSection.f18422a.setMovementMethod(LinkMovementMethod.getInstance());
                        warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                    } else if (obj2 == null) {
                        warningMessageSection.f18422a.setText(document3.m14617F());
                        warningMessageSection.f18424c.setImageDrawable(C1608h.m9264h(context2, i5));
                    } else if (TextUtils.isEmpty(fromHtml)) {
                        warningMessageSection.f18422a.setText(fromHtml);
                        warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                    } else if (obj4 != null) {
                        warningMessageSection.f18422a.setText(C7582R.string.uninstall_blocked_warning);
                        warningMessageSection.f18424c.setImageDrawable(C1608h.m9246a(context2, (int) C7582R.drawable.ic_warning, i5));
                    }
                    c = C1608h.m9255c(context2, i5);
                    warningMessageSection.f18422a.setTextColor(c);
                    warningMessageSection.f18423b.setTextColor(c);
                    i3 = C1607g.m9234a(C1608h.m9243a(context2, i5), 0.15f);
                    paddingTop = warningMessageSection.getPaddingTop();
                    paddingBottom = warningMessageSection.getPaddingBottom();
                    dimensionPixelSize = ai.f1848a.mo402m(warningMessageSection);
                    i = ai.f1848a.mo401l(warningMessageSection);
                    warningMessageSection.setBackgroundDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(i3), C0216d.m1112a(context2, (int) C7582R.drawable.play_highlight_overlay_dark)}));
                    ai.m1823a(warningMessageSection, i, paddingTop, dimensionPixelSize, paddingBottom);
                }
                C2482j.m13305c(this);
                C2482j.m13285a(this.ag, this.l_.m14724d());
                if (this.ah == null) {
                    this.ah = new C2473o(209, this);
                }
                this.ah.m13203a(this.f6681a.f14885a.f12087D);
                if (!this.ai) {
                    mo1219a(this.ah);
                    if (textView != null) {
                        mo1219a(c2473o);
                    }
                    this.ai = true;
                }
            }
        }
    }

    protected final int mo1344Y() {
        if (this.an) {
            return C7582R.layout.inline_app_details_generic_frame_fullscreen;
        }
        return super.mo1344Y();
    }

    protected final int mo1298Z() {
        if (this.an) {
            return C7582R.layout.inline_app_details_with_rv_screenshots_fullscreen;
        }
        if (this.al) {
            return C7582R.layout.inline_app_details_frame_with_rv_screenshots;
        }
        return C7582R.layout.inline_app_details_frame;
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        if (this.an) {
            return new C3247b(contentFrame, this);
        }
        return super.mo1299a(contentFrame);
    }

    protected final void mo1345a(CharSequence charSequence) {
        FinskyLog.m21667d(charSequence.toString(), new Object[0]);
        this.bp.mo3666a(C1289l.m7694a(this.f760q.getString("docid")), null, this.f6685h, this.bu, null, true, this.bw);
    }

    public final void w_() {
        this.f6683f = true;
        aa();
    }

    public final void m_() {
        mo1294k(1719);
        super.m_();
        if (this.as) {
            ao();
            if (this.f6683f && aj()) {
                this.at = C1473m.f7980a.bw().mo3479a(new C3363f().m16803b(this.l_.m14722b().cf()).m16800a());
                this.at.mo4398a(new dy(this));
            }
        }
    }

    private final void ao() {
        if (this.at != null) {
            this.at.cancel(true);
            this.at = null;
        }
    }

    private final OnClickListener m6470a(Account account, Document document, int i) {
        return new ec(this, this.bp.mo3624a(account, document, 1, null, this.f6685h, i, (ad) this, this.bw), document);
    }

    static void m6471a(Document document) {
        C2127b c2127b = C1473m.f7980a.mo2029I().f18022b;
        c2127b.mo2675d(document.m14625N().f13171k, c2127b.mo2657a(document.m14625N().f13171k).f10819m | 67108864);
    }

    final Intent x_() {
        Parcelable parcelable = this.f6681a;
        Parcelable parcelable2 = null;
        C1552e dj = C1473m.f7980a.dj();
        if (dj.mo2294a(12640676) || dj.mo2294a(12641721)) {
            String str = this.f6681a.f14885a.f12096c;
            parcelable2 = new Intent(C1473m.f7980a.f7981b, InlineAppDetailsDialogPrivate.class).putExtra("docid", str).putExtra("allow_update", this.f760q.getBoolean("InlineAppDetailsFragment.allow_update", false));
        }
        Intent intent = new Intent(C1473m.f7980a.f7981b, InlineAppPostPurchaseDialog.class);
        intent.putExtra("document", parcelable);
        intent.putExtra("relaunchInitialDialogIntent", parcelable2);
        this.bw.m13376a(intent);
        return intent;
    }

    public final void o_() {
        this.af = C2482j.m13315j();
    }

    public final void mo1222m() {
        C2482j.m13289a(this.f6686i, this.af, (ah) this, this.bw);
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13288a(this.f6686i, this.af, this, adVar, this.bw);
    }

    public final ce getPlayStoreUiElement() {
        return this.ag;
    }
}

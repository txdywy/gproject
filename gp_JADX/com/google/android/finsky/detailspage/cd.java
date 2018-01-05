package com.google.android.finsky.detailspage;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ai;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.detailscomponents.DetailsTextBlock;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraCredits;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraPrimary;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraSecondary;
import com.google.android.finsky.detailspage.TextModule.ExpandedData;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.SeparatorLinearLayout;
import com.google.android.finsky.layout.C3719q;
import com.google.android.finsky.layout.DetailsExpandedContainer;
import com.google.android.finsky.layout.DetailsExpandedExtraCreditsView;
import com.google.android.finsky.layout.DetailsExpandedExtraPrimaryView;
import com.google.android.finsky.layout.DetailsExpandedExtraSecondaryView;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class cd extends C1045b {
    public ExpandedData f14354a;
    public ce f14355c = C2482j.m13283a(0);

    public static cd m14024a(ExpandedData expandedData, DfeToc dfeToc, C2495w c2495w) {
        Fragment cdVar = new cd();
        Bundle bundle = new Bundle();
        bundle.putParcelable("expanded_data", expandedData);
        cdVar.m600f(bundle);
        cdVar.m6251a(dfeToc);
        cdVar.mo2580a(c2495w);
        return cdVar;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        this.f14354a = (ExpandedData) this.f760q.getParcelable("expanded_data");
        ac();
        cg_();
        this.bq.mo1267c();
    }

    protected final Transition ae() {
        return null;
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3166e(contentFrame, C7582R.id.page_content, C7582R.id.loading_indicator, this, 2);
    }

    public final void ac() {
        this.bm.mo1241c(this.f14354a.f14124b);
        this.bm.mo1237a(this.f14354a.f14123a, false);
        this.bm.mo1246z();
    }

    protected final int mo1298Z() {
        return C7582R.layout.expanded_description_fragment;
    }

    protected final void aa() {
    }

    protected final void cg_() {
        DetailsTextBlock detailsTextBlock;
        View view;
        CharSequence charSequence;
        int i;
        int i2;
        Object obj;
        DetailsExpandedContainer detailsExpandedContainer = (DetailsExpandedContainer) this.f746R.findViewById(C7582R.id.details_expanded_container);
        ExpandedData expandedData = this.f14354a;
        C3748a c3748a = this.bp;
        int i3 = this.f14354a.f14123a;
        C2495w c2495w = this.bw;
        detailsExpandedContainer.f18109f = expandedData.f14128f;
        detailsExpandedContainer.f18110g = expandedData.f14129g;
        if (TextUtils.isEmpty(expandedData.f14125c)) {
            detailsExpandedContainer.f18104a.setVisibility(8);
        } else {
            detailsExpandedContainer.f18104a.setText(expandedData.f14125c);
            detailsExpandedContainer.f18104a.setGravity(expandedData.f14126d);
            ai.m1823a(detailsExpandedContainer.f18104a, ai.f1848a.mo401l(detailsExpandedContainer.f18104a), 0, ai.f1848a.mo402m(detailsExpandedContainer.f18104a), 0);
            detailsExpandedContainer.f18104a.setVisibility(0);
        }
        if (expandedData.f14132j) {
            detailsTextBlock = detailsExpandedContainer.f18105b;
            view = detailsExpandedContainer.f18106c;
        } else {
            view = detailsExpandedContainer.f18105b;
            detailsTextBlock = detailsExpandedContainer.f18106c;
        }
        detailsExpandedContainer.f18108e = view;
        detailsTextBlock.m13581a(expandedData.f14130h, expandedData.f14131i, Integer.MAX_VALUE);
        if (detailsTextBlock.m13582b()) {
            int dimensionPixelSize = detailsExpandedContainer.getResources().getDimensionPixelSize(C7582R.dimen.details_whatsnew_vmargin);
            detailsTextBlock.m13580a(expandedData.f14123a, dimensionPixelSize / 2, (dimensionPixelSize * 3) / 2);
            detailsTextBlock.setVisibility(0);
        } else {
            detailsTextBlock.setVisibility(8);
        }
        CharSequence charSequence2 = expandedData.f14127e;
        if (!detailsExpandedContainer.f18111h || TextUtils.isEmpty(detailsExpandedContainer.f18110g)) {
            charSequence = detailsExpandedContainer.f18109f;
        } else {
            charSequence = detailsExpandedContainer.f18110g;
        }
        view.m13581a(charSequence2, charSequence, Integer.MAX_VALUE);
        view.m13578a();
        ai.m1823a(view, ai.f1848a.mo401l(view), 0, ai.f1848a.mo402m(view), 0);
        detailsExpandedContainer.f18107d.removeAllViews();
        LayoutInflater from = LayoutInflater.from(detailsExpandedContainer.getContext());
        Object obj2 = expandedData.f14133k;
        List list = expandedData.f14134l;
        int size = list.size();
        if (!(TextUtils.isEmpty(obj2) || size == 0)) {
            ViewGroup viewGroup = (ViewGroup) from.inflate(C7582R.layout.details_extra_credits_header, detailsExpandedContainer.f18107d, false);
            ((DecoratedTextView) viewGroup.findViewById(C7582R.id.section_header)).setText(obj2.toUpperCase());
            detailsExpandedContainer.f18107d.addView(viewGroup);
            for (dimensionPixelSize = 0; dimensionPixelSize < size; dimensionPixelSize++) {
                DetailsExpandedExtraCreditsView detailsExpandedExtraCreditsView = (DetailsExpandedExtraCreditsView) from.inflate(C7582R.layout.details_text_extra_credits, detailsExpandedContainer.f18107d, false);
                DetailsExtraCredits detailsExtraCredits = (DetailsExtraCredits) list.get(dimensionPixelSize);
                detailsExpandedExtraCreditsView.f18112a.setText(detailsExtraCredits.f14112a);
                if (TextUtils.isEmpty(detailsExtraCredits.f14113b)) {
                    detailsExpandedExtraCreditsView.f18113b.setVisibility(8);
                } else {
                    detailsExpandedExtraCreditsView.f18113b.setVisibility(0);
                    detailsExpandedExtraCreditsView.f18113b.setText(Html.fromHtml(detailsExtraCredits.f14113b));
                }
                detailsExpandedContainer.f18107d.addView(detailsExpandedExtraCreditsView);
            }
        }
        C1473m.f7980a.be();
        List list2 = expandedData.f14135m;
        int size2 = list2.size();
        int integer = detailsExpandedContainer.getResources().getInteger(C7582R.integer.details_extra_primary_items_per_row);
        int i4 = ((size2 + integer) - 1) / integer;
        boolean[] zArr = new boolean[integer];
        for (dimensionPixelSize = 0; dimensionPixelSize < i4; dimensionPixelSize++) {
            for (i = 0; i < integer; i++) {
                int i5 = (integer * dimensionPixelSize) + i;
                if (i5 >= size2) {
                    break;
                }
                if (((DetailsExtraPrimary) list2.get(i5)).f14117d != null) {
                    zArr[i] = true;
                }
            }
        }
        int i6 = 0;
        while (i6 < i4) {
            SeparatorLinearLayout separatorLinearLayout = (SeparatorLinearLayout) from.inflate(C7582R.layout.details_text_extra_row, detailsExpandedContainer.f18107d, false);
            for (i2 = 0; i2 < integer; i2++) {
                i = (integer * i6) + i2;
                DetailsExpandedExtraPrimaryView detailsExpandedExtraPrimaryView = (DetailsExpandedExtraPrimaryView) from.inflate(C7582R.layout.details_text_extra_primary, separatorLinearLayout, false);
                if (i >= size2) {
                    detailsExpandedExtraPrimaryView.setVisibility(4);
                } else {
                    OnClickListener onClickListener;
                    DetailsExtraPrimary detailsExtraPrimary = (DetailsExtraPrimary) list2.get(i);
                    if (TextUtils.isEmpty(detailsExtraPrimary.f14116c)) {
                        onClickListener = null;
                    } else {
                        onClickListener = new C3719q(c3748a, detailsExtraPrimary, i3, this, c2495w);
                    }
                    boolean z = zArr[i2];
                    if (detailsExtraPrimary.f14117d != null) {
                        C1473m.f7980a.bR();
                        af.m9224a(detailsExpandedExtraPrimaryView.f18114a, detailsExtraPrimary.f14117d);
                        detailsExpandedExtraPrimaryView.f18114a.setVisibility(0);
                        C1473m.f7980a.ar().m9288a(detailsExpandedExtraPrimaryView.f18114a, detailsExtraPrimary.f14117d.f11860f, detailsExtraPrimary.f14117d.f11863i);
                        obj2 = detailsExtraPrimary.f14117d.f11871q;
                        if (!TextUtils.isEmpty(obj2)) {
                            try {
                                detailsExpandedExtraPrimaryView.f18114a.setColorFilter(Color.parseColor(obj2));
                            } catch (IllegalArgumentException e) {
                                FinskyLog.m21669e("Invalid color for details extra primary view icon tint: %s", obj2);
                            }
                        }
                    } else if (z) {
                        detailsExpandedExtraPrimaryView.f18114a.setVisibility(4);
                    } else {
                        detailsExpandedExtraPrimaryView.f18114a.setVisibility(8);
                    }
                    detailsExpandedExtraPrimaryView.f18115b.setText(detailsExtraPrimary.f14114a);
                    if (TextUtils.isEmpty(detailsExtraPrimary.f14115b)) {
                        detailsExpandedExtraPrimaryView.f18116c.setVisibility(8);
                    } else {
                        detailsExpandedExtraPrimaryView.f18116c.setVisibility(0);
                        detailsExpandedExtraPrimaryView.f18116c.setText(Html.fromHtml(detailsExtraPrimary.f14115b));
                    }
                    if (onClickListener != null) {
                        detailsExpandedExtraPrimaryView.setOnClickListener(onClickListener);
                    } else {
                        detailsExpandedExtraPrimaryView.setOnClickListener(null);
                        detailsExpandedExtraPrimaryView.setClickable(false);
                    }
                }
                obj2 = i6 == 0 ? 1 : null;
                obj = i6 == i4 + -1 ? 1 : null;
                if (obj2 == null) {
                    separatorLinearLayout.m10858a();
                }
                ai.m1823a(separatorLinearLayout, ai.f1848a.mo401l(separatorLinearLayout), obj2 != null ? separatorLinearLayout.getPaddingTop() : 0, ai.f1848a.mo402m(separatorLinearLayout), obj != null ? separatorLinearLayout.getPaddingBottom() : 0);
                separatorLinearLayout.addView(detailsExpandedExtraPrimaryView);
            }
            detailsExpandedContainer.f18107d.addView(separatorLinearLayout);
            i6++;
        }
        List list3 = expandedData.f14136n;
        int size3 = list3.size();
        size = detailsExpandedContainer.getResources().getInteger(C7582R.integer.details_extra_secondary_items_per_row);
        i2 = ((size3 + size) - 1) / size;
        i3 = 0;
        while (i3 < i2) {
            SeparatorLinearLayout separatorLinearLayout2 = (SeparatorLinearLayout) from.inflate(C7582R.layout.details_text_extra_row, detailsExpandedContainer.f18107d, false);
            for (dimensionPixelSize = 0; dimensionPixelSize < size; dimensionPixelSize++) {
                int i7 = (size * i3) + dimensionPixelSize;
                DetailsExpandedExtraSecondaryView detailsExpandedExtraSecondaryView = (DetailsExpandedExtraSecondaryView) from.inflate(C7582R.layout.details_text_extra_secondary, separatorLinearLayout2, false);
                if (i7 >= size3) {
                    detailsExpandedExtraSecondaryView.setVisibility(4);
                } else {
                    DetailsExtraSecondary detailsExtraSecondary = (DetailsExtraSecondary) list3.get(i7);
                    detailsExpandedExtraSecondaryView.f18117a.setText(detailsExtraSecondary.f14119a);
                    if (TextUtils.isEmpty(detailsExtraSecondary.f14120b)) {
                        detailsExpandedExtraSecondaryView.f18118b.setVisibility(8);
                    } else {
                        detailsExpandedExtraSecondaryView.f18118b.setVisibility(0);
                        detailsExpandedExtraSecondaryView.f18118b.setText(Html.fromHtml(detailsExtraSecondary.f14120b));
                    }
                }
                separatorLinearLayout2.addView(detailsExpandedExtraSecondaryView);
            }
            obj2 = i3 == 0 ? 1 : null;
            Object obj3 = i3 == i2 + -1 ? 1 : null;
            if (obj2 == null) {
                separatorLinearLayout2.m10858a();
            }
            ai.m1823a(separatorLinearLayout2, ai.f1848a.mo401l(separatorLinearLayout2), obj2 != null ? separatorLinearLayout2.getPaddingTop() : 0, ai.f1848a.mo402m(separatorLinearLayout2), obj3 != null ? separatorLinearLayout2.getPaddingBottom() : 0);
            detailsExpandedContainer.f18107d.addView(separatorLinearLayout2);
            i3++;
        }
        obj = expandedData.f14137o;
        if (!TextUtils.isEmpty(obj)) {
            SeparatorLinearLayout separatorLinearLayout3 = (SeparatorLinearLayout) from.inflate(C7582R.layout.details_text_extra_row, detailsExpandedContainer.f18107d, false);
            TextView textView = (TextView) from.inflate(C7582R.layout.details_text_extra_attributions, separatorLinearLayout3, false);
            textView.setVisibility(0);
            textView.setText(Html.fromHtml(obj));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            separatorLinearLayout3.addView(textView);
            detailsExpandedContainer.f18107d.addView(separatorLinearLayout3);
        }
        this.bq.mo1263a(this.f14354a.f14124b, detailsExpandedContainer);
    }

    public final void mo138d() {
        this.bq.mo1273h();
        super.mo138d();
    }

    public final int Y_() {
        return this.bn.getResources().getColor(C7582R.color.play_fg_secondary);
    }

    public final ce getPlayStoreUiElement() {
        return this.f14355c;
    }
}

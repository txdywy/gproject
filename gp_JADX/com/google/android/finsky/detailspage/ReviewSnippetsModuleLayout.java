package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.layout.ReviewSnippetLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.C4685p;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class ReviewSnippetsModuleLayout extends C2624w {
    public boolean f14040a;
    public du f14041b;
    public OnClickListener f14042m;

    public ReviewSnippetsModuleLayout(Context context) {
        this(context, null);
    }

    public ReviewSnippetsModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void m13779b(List list, Document document, boolean z, C3748a c3748a, ad adVar) {
        boolean z2 = true;
        this.f14040a = z;
        super.m13733a(list, document, true, c3748a, adVar);
        if (getFooterView() == null) {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        if (this.f14040a) {
            this.d.setOnClickListener(new ds(this));
        } else {
            this.d.setVisibility(8);
        }
    }

    public void setAllReviewsClickListener(OnClickListener onClickListener) {
        this.f14042m = onClickListener;
    }

    public void setReviewSnippetClickListener(du duVar) {
        this.f14041b = duVar;
    }

    protected String getFooterText() {
        return getContext().getString(C7582R.string.review_snippets_footer).toUpperCase();
    }

    protected String getSectionTitleText() {
        return getContext().getString(C7582R.string.review_snippets_title).toUpperCase();
    }

    protected int getBucketRowLayout() {
        return C7582R.layout.review_samples_row;
    }

    protected final int mo2984a(Resources resources) {
        return resources.getInteger(C7582R.integer.snippets_max_rows);
    }

    protected final int mo2987b(Resources resources) {
        return resources.getInteger(C7582R.integer.snippets_per_row);
    }

    protected TextView getSectionTitleView() {
        return (TextView) findViewById(C7582R.id.snippets_section_title);
    }

    protected TextView getFooterView() {
        return (TextView) findViewById(C7582R.id.all_reviews_footer);
    }

    protected final boolean mo3009a(List list) {
        return true;
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        super.onMeasure(i, i2);
        List arrayList = new ArrayList(getChildCount());
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof BucketRowLayout) {
                BucketRowLayout bucketRowLayout = (BucketRowLayout) childAt;
                for (int i5 = 0; i5 < bucketRowLayout.getChildCount(); i5++) {
                    View childAt2 = bucketRowLayout.getChildAt(i5);
                    if (childAt2 instanceof ReviewSnippetLayout) {
                        arrayList.add((ReviewSnippetLayout) childAt2);
                    }
                }
            }
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < arrayList.size() && i7 == 0) {
            boolean z = ((ReviewSnippetLayout) arrayList.get(i6)).f18329d;
            i6++;
            boolean z2 = z;
        }
        if (i7 != 0) {
            boolean z3 = false;
            while (i3 < arrayList.size()) {
                ReviewSnippetLayout reviewSnippetLayout = (ReviewSnippetLayout) arrayList.get(i3);
                if (reviewSnippetLayout.f18329d) {
                    z2 = z3;
                } else {
                    reviewSnippetLayout.f18328c.f18338g = true;
                    z2 = true;
                }
                i3++;
                z3 = z2;
            }
            if (z3) {
                super.onMeasure(i, i2);
            }
        }
    }

    protected final /* synthetic */ View mo2985a(Object obj, Document document, ViewGroup viewGroup) {
        CharSequence charSequence;
        dv dvVar = (dv) obj;
        ReviewSnippetLayout reviewSnippetLayout = (ReviewSnippetLayout) this.j.inflate(C7582R.layout.review_snippet, viewGroup, false);
        String str = dvVar.f14435a;
        Object obj2 = dvVar.f14436b;
        int i = dvVar.f14437c;
        boolean z = dvVar.f14439e;
        boolean z2 = dvVar.f14440f;
        reviewSnippetLayout.f18328c.m17342a(C4685p.m21831a(str), reviewSnippetLayout.getContext().getResources().getQuantityString(C7582R.plurals.review_snippet_count, i, new Object[]{reviewSnippetLayout.f18326a.format((long) i)}));
        TextView textView = reviewSnippetLayout.f18327b;
        if (TextUtils.isEmpty(obj2)) {
            charSequence = "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("&ldquo;");
            if (z) {
                stringBuilder.append("&#8230;");
            }
            stringBuilder.append(obj2);
            if (z2) {
                stringBuilder.append("&#8230;");
            }
            stringBuilder.append("&rdquo;");
            charSequence = C4685p.m21831a(stringBuilder.toString());
        }
        textView.setText(charSequence);
        if (this.f14040a) {
            reviewSnippetLayout.setOnClickListener(new dt(this, dvVar));
        }
        return reviewSnippetLayout;
    }
}

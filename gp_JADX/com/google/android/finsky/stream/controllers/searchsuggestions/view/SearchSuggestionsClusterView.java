package com.google.android.finsky.stream.controllers.searchsuggestions.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class SearchSuggestionsClusterView extends LinearLayout implements OnClickListener, ad, ae {
    public C4489a f22813a;
    public final ce f22814b = C2482j.m13283a(2926);
    public ad f22815c;
    public SuggestionBarLayout f22816d;
    public SuggestionBarLayout f22817e;

    public SearchSuggestionsClusterView(Context context) {
        super(context);
    }

    public SearchSuggestionsClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22816d = (SuggestionBarLayout) findViewById(C7582R.id.suggestion_line);
        this.f22817e = (SuggestionBarLayout) findViewById(C7582R.id.replaced_line);
    }

    public void onClick(View view) {
        this.f22813a.mo4230a(this);
    }

    public ce getPlayStoreUiElement() {
        return this.f22814b;
    }

    public ad getParentNode() {
        return this.f22815c;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void Z_() {
        this.f22813a = null;
        this.f22815c = null;
    }
}

package com.google.android.finsky.stream.controllers.searchsuggestions;

import android.content.Context;
import android.provider.SearchRecentSuggestions;
import android.view.View;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.dfemodel.C2724o;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C1169s;
import com.google.android.finsky.stream.controllers.searchsuggestions.view.C4489a;
import com.google.android.finsky.stream.controllers.searchsuggestions.view.C4491b;
import com.google.android.finsky.stream.controllers.searchsuggestions.view.C4492c;
import com.google.android.finsky.stream.controllers.searchsuggestions.view.SearchSuggestionsClusterView;
import com.google.wireless.android.finsky.dfe.nano.fy;
import com.squareup.leakcanary.C7582R;

public final class C4490a extends C1169s implements C4489a {
    public final C2724o f22805a;
    public final int f22806b;
    public final C3748a f22807c;
    public final C2495w f22808d;
    public final ad f22809e;
    public final SearchRecentSuggestions f22810f;
    public C4491b f22811g;
    public Context f22812h;

    public C4490a(C2724o c2724o, int i, C3748a c3748a, C2495w c2495w, ad adVar, SearchRecentSuggestions searchRecentSuggestions, Context context) {
        this.f22805a = c2724o;
        this.f22806b = i;
        this.f22807c = c3748a;
        this.f22808d = c2495w;
        this.f22809e = adVar;
        this.f22810f = searchRecentSuggestions;
        this.f22812h = context;
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.search_suggestions_cluster;
    }

    public final void mo1510a(View view, int i) {
        SearchSuggestionsClusterView searchSuggestionsClusterView = (SearchSuggestionsClusterView) view;
        if (this.f22811g == null) {
            byte[] bArr;
            String str = this.f22805a.f14942b;
            String b = this.f22805a.m14745b();
            boolean c = this.f22805a.m14746c();
            C4491b c4491b = new C4491b();
            c4491b.f22829a = c;
            c4491b.f22831c = new C4492c();
            c4491b.f22831c.f22834b = b;
            c4491b.f22831c.f22833a = this.f22812h.getString(c ? C7582R.string.full_page_replaced_question : C7582R.string.suggestion_question);
            if (c) {
                c4491b.f22830b = new C4492c();
                c4491b.f22830b.f22833a = this.f22812h.getString(C7582R.string.search_instead_question);
                c4491b.f22830b.f22834b = str;
            } else {
                c4491b.f22831c.f22835c = C1608h.m9251b(this.f22806b);
                c4491b.f22830b = null;
            }
            fy fyVar = this.f22805a.f14944d.f;
            if (fyVar != null) {
                bArr = fyVar.d;
            } else {
                bArr = null;
            }
            c4491b.f22832d = bArr;
            this.f22811g = c4491b;
        }
        C4491b c4491b2 = this.f22811g;
        ad adVar = this.f22809e;
        searchSuggestionsClusterView.f22813a = this;
        searchSuggestionsClusterView.f22815c = adVar;
        searchSuggestionsClusterView.f22816d.m20965a(c4491b2.f22831c);
        if (c4491b2.f22829a) {
            searchSuggestionsClusterView.f22817e.m20965a(c4491b2.f22830b);
            searchSuggestionsClusterView.f22817e.setVisibility(0);
        } else {
            searchSuggestionsClusterView.f22817e.setVisibility(8);
        }
        searchSuggestionsClusterView.setOnClickListener(searchSuggestionsClusterView);
        if (c4491b2.f22832d != null) {
            searchSuggestionsClusterView.f22814b.a(c4491b2.f22832d);
        }
        this.f22809e.mo1219a(searchSuggestionsClusterView);
    }

    public final void mo1511b(View view, int i) {
        if (view instanceof ae) {
            ((ae) view).Z_();
        }
    }

    public final void mo4230a(ad adVar) {
        String str;
        String num = Integer.toString(this.f22806b);
        if (this.f22805a.m14746c()) {
            str = this.f22805a.f14942b;
        } else {
            str = this.f22805a.m14745b();
        }
        this.f22810f.saveRecentQuery(str, num);
        this.f22807c.mo3664a(str, this.f22806b, this.f22808d, adVar);
    }
}

package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.RecyclerListener;
import android.widget.LinearLayout;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.adapters.C1099t;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ErrorFooter;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.PlayCardViewMyAppsV2;
import com.google.android.finsky.playcard.ao;
import com.google.android.play.layout.PlayCardLabelView;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C1101a extends C1099t implements RecyclerListener, C1100e {
    public C2720j f6976a;
    public List f6977b = new ArrayList();
    public ad f6978c;
    public final C2495w f6979d;
    public final int f6980e;

    public C1101a(C1036b c1036b, C3748a c3748a, ad adVar, C2495w c2495w) {
        super(c1036b, c3748a);
        this.f6978c = adVar;
        this.f6979d = c2495w;
        this.f6980e = c1036b.getResources().getDimensionPixelSize(C7582R.dimen.myapps_list_view_header_padding) + FinskyHeaderListLayout.m16068a((Context) c1036b, 0, 0);
    }

    public final Document mo1429a(int i) {
        Object item = getItem(i);
        return item instanceof Document ? (Document) item : null;
    }

    public final int getCount() {
        if (this.f6976a == null) {
            return 0;
        }
        int size = this.f6977b.size();
        if (mo1432c()) {
            size++;
        }
        if (size != 0) {
            return size + 1;
        }
        return 0;
    }

    public final int getViewTypeCount() {
        return 4;
    }

    public final int getItemViewType(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != getCount() - 1) {
            return 0;
        }
        switch (this.f6975i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                throw new IllegalStateException("No footer or item at row " + i);
        }
    }

    public final Object getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f6977b.get(i - 1);
    }

    protected final void mo1430a() {
        if (this.f6976a != null) {
            this.f6976a.m14702q();
        }
    }

    protected final String mo1431b() {
        return C1290m.m7702a(this.g, this.f6976a.mo3127g());
    }

    protected final boolean mo1432c() {
        return this.f6976a != null && this.f6976a.f14901t;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case 0:
                View inflate;
                Document a = mo1429a(i);
                if (a != null) {
                    cv cvVar = a.f14885a;
                }
                if (view == null) {
                    inflate = this.f.inflate(C7582R.layout.play_card_myapps_v2, viewGroup, false);
                } else {
                    inflate = view;
                }
                d dVar = (d) inflate;
                if (a == null) {
                    dVar.b();
                } else {
                    PlayCardViewMyAppsV2 playCardViewMyAppsV2 = (PlayCardViewMyAppsV2) dVar;
                    playCardViewMyAppsV2.ah = (PlayCardLabelView) playCardViewMyAppsV2.findViewById(C7582R.id.li_label);
                    C1473m.f7980a.cr().m18517a(dVar, a, "my_apps:early_access", this.h, this.f6978c, -1, this.f6979d);
                }
                boolean z = getItemViewType(i) == 0 && i != getCount() - 1;
                ((PlayCardViewMyAppsV2) dVar).m18460a(5, z, null, null, null, null, false);
                dVar.setTag(a);
                return inflate;
            case 1:
                return (LinearLayout) (view != null ? view : m6775a(C7582R.layout.loading_footer, viewGroup));
            case 2:
                View view2;
                if (view != null) {
                    view2 = view;
                } else {
                    view2 = m6775a(C7582R.layout.error_footer, viewGroup);
                }
                ErrorFooter errorFooter = (ErrorFooter) view2;
                errorFooter.m16021a(mo1431b(), this);
                return errorFooter;
            case 3:
                if (view == null) {
                    view = this.f.inflate(C7582R.layout.header_list_spacer, viewGroup, false);
                }
                view.getLayoutParams().height = this.f6980e;
                return view;
            default:
                throw new IllegalStateException("Unknown type for getView " + i);
        }
    }

    public final void onMovedToScrapHeap(View view) {
        if (view instanceof d) {
            ao.m18509b((d) view);
        }
    }

    public final void m_() {
        super.m_();
        this.f6977b.clear();
        for (int i = 0; i < this.f6976a.m14698m(); i++) {
            Document document = (Document) this.f6976a.m14679a(i, true);
            if (!(document.m14625N() == null || C1473m.f7980a.mo2032L().mo2854a(document.m14625N().f13171k) == null)) {
                this.f6977b.add(document);
            }
        }
    }
}

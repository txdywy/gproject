package com.google.android.finsky.detailspage.videowatchaction;

import android.content.res.Resources;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.actionbuttons.C1006c;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.bg.ai;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.lq;
import com.google.android.finsky.cv.p177a.lt;
import com.google.android.finsky.cv.p177a.lx;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.detailspage.ck;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dz.C2945a;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C2676a extends ck implements C0999d, C2675d {
    public final boolean f14777d = C1473m.f7980a.dj().mo2294a(12624692);
    public C1006c f14778e;
    public C2683i f14779f;

    public final int mo2977c(int i) {
        return C7582R.layout.video_watch_actions_module;
    }

    public final boolean mo2979f() {
        return this.b != null;
    }

    public final int mo2978e() {
        return 1;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.f14777d && document.f14885a.f12098e == 6) {
            if (this.b == null) {
                this.b = new C2677b();
                ((C2677b) this.b).f14780a = document;
                m14505b();
                this.D.mo2814a((C0999d) this);
            }
            if (z) {
                ((C2677b) this.b).f14780a = document;
                m14505b();
                if (((C2677b) this.b).f14784e == null) {
                    String str;
                    lq S = document.m14630S();
                    List list = ((C2677b) this.b).f14783d;
                    if (S == null) {
                        str = null;
                    } else {
                        str = S.f13048m;
                    }
                    m14504a(C2945a.m15313a(document, list, str));
                }
                m14503a();
            }
        }
    }

    public final void mo2976b(View view, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5 = 8;
        boolean z2 = true;
        List arrayList = new ArrayList();
        boolean d = C2945a.m15321d(((C2677b) this.b).f14781b);
        if (d) {
            i2 = -1;
            for (i3 = 0; i3 < ((C2677b) this.b).f14783d.size(); i3++) {
                lx lxVar = (lx) ((C2677b) this.b).f14783d.get(i3);
                if (((C2677b) this.b).f14784e != null && TextUtils.equals(lxVar.f13074c, ((C2677b) this.b).f14784e.f13074c)) {
                    i2 = i3;
                }
                Document document = ((C2677b) this.b).f14781b;
                if (i2 == i3) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(C2945a.m15314a(document, lxVar, z));
            }
        } else {
            i2 = -1;
        }
        VideoWatchActionsModuleLayout videoWatchActionsModuleLayout = (VideoWatchActionsModuleLayout) view;
        if (d) {
            CharSequence charSequence = null;
        } else {
            Object string = this.t.getResources().getString(C7582R.string.movie_unavailable);
        }
        boolean d2 = m14506d();
        CharSequence charSequence2 = ((C2677b) this.b).f14782c;
        if (i2 == -1) {
            i2 = 0;
        }
        videoWatchActionsModuleLayout.f14764f = this;
        z = arrayList.isEmpty();
        ExpandableListView expandableListView = videoWatchActionsModuleLayout.f14760b;
        if (z) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        expandableListView.setVisibility(i4);
        if (!z) {
            videoWatchActionsModuleLayout.f14760b.setAdapter(new C2679e(videoWatchActionsModuleLayout.getContext(), videoWatchActionsModuleLayout.f14760b, arrayList, i2, new C2678c(videoWatchActionsModuleLayout)));
            ExpandableListView expandableListView2 = videoWatchActionsModuleLayout.f14760b;
            if (arrayList.size() <= 1) {
                z2 = false;
            }
            expandableListView2.setEnabled(z2);
        }
        videoWatchActionsModuleLayout.f14761c.setText(charSequence2);
        TextView textView = videoWatchActionsModuleLayout.f14761c;
        if (!d2 || TextUtils.isEmpty(charSequence2)) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        textView.setVisibility(i4);
        videoWatchActionsModuleLayout.f14764f.mo3108a(videoWatchActionsModuleLayout.f14762d, videoWatchActionsModuleLayout.f14763e);
        TextView textView2 = videoWatchActionsModuleLayout.f14759a;
        if (!TextUtils.isEmpty(charSequence)) {
            i5 = 0;
        }
        textView2.setVisibility(i5);
        if (!TextUtils.isEmpty(charSequence)) {
            videoWatchActionsModuleLayout.f14759a.setText(charSequence);
        }
        Resources resources = videoWatchActionsModuleLayout.getResources();
        if (C1473m.f7980a.dj().mo2294a(12636865)) {
            i4 = C7582R.bool.use_combined_title_in_details_v2;
        } else {
            i4 = C7582R.bool.use_combined_title_in_details;
        }
        boolean z3 = resources.getBoolean(i4);
        i3 = videoWatchActionsModuleLayout.getPaddingLeft();
        if (z3) {
            i4 = C7582R.dimen.details_general_padding_no_divider;
        } else {
            i4 = C7582R.dimen.details_listing_section_extra_padding;
        }
        videoWatchActionsModuleLayout.setPadding(i3, resources.getDimensionPixelSize(i4), videoWatchActionsModuleLayout.getPaddingRight(), videoWatchActionsModuleLayout.getPaddingBottom());
    }

    public final void mo2980h() {
        this.D.mo2819b(this);
        if (this.f14778e != null) {
            this.f14778e.m5955a();
            this.f14778e = null;
        }
        if (this.f14779f != null) {
            this.f14779f.m14521a();
            this.f14779f = null;
        }
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        m14505b();
        m14503a();
    }

    public final void mo3109b(int i) {
        m14504a((lx) ((C2677b) this.b).f14783d.get(i));
        m14503a();
    }

    public final void mo3108a(DetailsSummaryDynamic detailsSummaryDynamic, WatchActionSummaryView watchActionSummaryView) {
        watchActionSummaryView.setVisibility(8);
        detailsSummaryDynamic.setVisibility(8);
        if (m14506d()) {
            if (this.f14778e == null) {
                this.f14778e = C1473m.f7980a.ci().m5977a(this.A, this.A, this.z, this.t, this.C, this.I, 3, this.w.mo1620b(), -1, null, false, true, false);
            }
            this.f14778e.m5959a(((C2677b) this.b).f14781b, null, this.J, detailsSummaryDynamic);
            ai.m9228a(detailsSummaryDynamic, 8);
            return;
        }
        if (this.f14779f == null) {
            this.f14779f = new C2683i(this.t, this.I, this.z, this.J, this.w);
        }
        this.f14779f.m14522a(watchActionSummaryView, ((C2677b) this.b).f14784e);
    }

    private final void m14504a(lx lxVar) {
        Object obj;
        ((C2677b) this.b).f14784e = lxVar;
        C2599c c2599c = this.u;
        String str = "VideoWatchActionsModule.WatchActionApp";
        if (m14506d()) {
            obj = null;
        } else {
            obj = lxVar.f13074c;
        }
        c2599c.mo3036b(str, obj);
    }

    private final void m14503a() {
        this.u.mo3033a(this, false);
    }

    private final void m14505b() {
        Document document;
        C2677b c2677b = (C2677b) this.b;
        if (C1473m.f7980a.dj().mo2294a(12620851)) {
            document = ((C2677b) this.b).f14780a;
            if (document.m14614C()) {
                bl blVar;
                Parcel obtain = Parcel.obtain();
                document.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                document = (Document) Document.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                C1473m.f7980a.ab();
                Collection b = C1804v.m9805b(C2945a.m15312a());
                Map hashMap = new HashMap();
                for (lt ltVar : document.m14615D()) {
                    if (b.contains(ltVar.f13059b.f12097d)) {
                        for (bl blVar2 : ltVar.f13060c) {
                            blVar = (bl) hashMap.get(blVar2.f11907B);
                            if (blVar == null || blVar2.f11932v.f12004c < blVar.f11932v.f12004c) {
                                hashMap.put(blVar2.f11907B, blVar2);
                            }
                        }
                    }
                }
                for (bl blVar3 : document.f14885a.f12107n) {
                    blVar = (bl) hashMap.get(blVar3.f11907B);
                    if (blVar != null) {
                        blVar3.f11915e = blVar.f11932v.f12004c;
                        blVar3.m12272a(blVar.f11915e);
                        blVar3.m12273a(blVar.f11917g);
                        blVar3.m12277b(blVar.f11922l);
                    }
                }
            }
        } else {
            document = ((C2677b) this.b).f14780a;
        }
        c2677b.f14781b = document;
        ((C2677b) this.b).f14782c = C2945a.m15319b(((C2677b) this.b).f14781b);
        ((C2677b) this.b).f14783d = C2945a.m15316a(((C2677b) this.b).f14781b);
    }

    private final boolean m14506d() {
        return ((C2677b) this.b).f14784e == null || C2945a.m15317a(((C2677b) this.b).f14784e);
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((C2677b) c2600d);
        if (this.b != null) {
            this.D.mo2814a((C0999d) this);
        }
    }
}

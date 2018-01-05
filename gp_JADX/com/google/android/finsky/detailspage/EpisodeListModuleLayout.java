package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bb.C1565a;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.layout.EpisodeSnippet;
import com.google.android.finsky.layout.af;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;
import java.util.List;
import java.util.Set;

public class EpisodeListModuleLayout extends LinearLayout implements af {
    public final boolean f13987a = C1473m.f7980a.dj().mo2294a(12622545);
    public C2288b f13988b;
    public boolean f13989c;
    public ad f13990d;
    public C2495w f13991e;
    public C3748a f13992f;
    public View f13993g;
    public LinearLayout f13994h;
    public View f13995i;
    public Spinner f13996j;
    public PlayActionButtonV2 f13997k;
    public TextView f13998l;
    public LinearLayout f13999m;
    public TextView f14000n;
    public cb f14001o;
    public List f14002p;
    public Document f14003q;

    public EpisodeListModuleLayout(Context context) {
        super(context);
    }

    public EpisodeListModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EpisodeListModuleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13994h = (LinearLayout) findViewById(C7582R.id.episodes);
        this.f13995i = findViewById(C7582R.id.overlay);
        this.f13997k = (PlayActionButtonV2) findViewById(C7582R.id.buy_button);
        this.f13998l = (TextView) findViewById(C7582R.id.season_offer_discount_message);
        ColorStateList c = C1608h.m9255c(getContext(), 4);
        this.f13999m = (LinearLayout) findViewById(C7582R.id.season_messages);
        this.f14000n = (TextView) findViewById(C7582R.id.season_availability_message);
        this.f14000n.setTextColor(c);
        this.f13999m.setBackgroundColor(C1607g.m9234a(C1608h.m9243a(getContext(), 4), 0.15f));
        this.f13993g = findViewById(C7582R.id.episode_list_in_progress_snippet);
        this.f13996j = (Spinner) findViewById(C7582R.id.header_spinner);
        this.f13996j.setOnItemSelectedListener(new bz(this));
        this.f13988b = C1473m.f7980a.mo2044X();
    }

    public final void m13765a(Document document, List list, Document document2, List list2, C2196e c2196e, Set set, ch chVar) {
        boolean z;
        Object obj;
        View view = null;
        int size = list.size();
        int childCount = this.f13994h.getChildCount();
        for (int i = 0; i < list.size(); i++) {
            if (((Document) list.get(i)).m14615D().length != 0) {
                z = true;
                break;
            }
        }
        z = false;
        LayoutInflater layoutInflater = null;
        int i2 = 0;
        while (i2 < size) {
            LayoutInflater layoutInflater2;
            Document document3 = (Document) list.get(i2);
            View view2;
            LayoutInflater layoutInflater3;
            Object obj2;
            View view3;
            boolean a;
            Object obj3;
            boolean z2;
            if (i2 < childCount) {
                view2 = (EpisodeSnippet) this.f13994h.getChildAt(i2);
                if (view2.getEpisode() == document3) {
                    view2.setShareStatus((C1565a) list2.get(i2));
                    view2.m17296a();
                    layoutInflater2 = layoutInflater;
                } else {
                    view2.m17301b();
                    layoutInflater3 = layoutInflater;
                    obj2 = null;
                    if (document3 != document2) {
                        view3 = view2;
                    } else {
                        view3 = view;
                    }
                    a = C1473m.f7980a.mo2045Y().m11647a(document3, c2196e);
                    if (set != null) {
                        if (set.contains(document3.f14885a.f12096c)) {
                            obj3 = 1;
                            z2 = a && obj3 == null;
                            view2.m17299a(document, document3, false, z, (C1565a) list2.get(i2), this.f13992f, z2, this, chVar, this.f13990d, this.f13991e);
                            if (obj2 == null) {
                                this.f13994h.addView(view2, i2);
                            } else {
                                view2.m17296a();
                            }
                            view2.setVisibility(0);
                            layoutInflater2 = layoutInflater3;
                            view = view3;
                        }
                    }
                    obj3 = null;
                    if (!a) {
                    }
                    view2.m17299a(document, document3, false, z, (C1565a) list2.get(i2), this.f13992f, z2, this, chVar, this.f13990d, this.f13991e);
                    if (obj2 == null) {
                        view2.m17296a();
                    } else {
                        this.f13994h.addView(view2, i2);
                    }
                    view2.setVisibility(0);
                    layoutInflater2 = layoutInflater3;
                    view = view3;
                }
            } else {
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                EpisodeSnippet episodeSnippet = (EpisodeSnippet) layoutInflater.inflate(C7582R.layout.episode_snippet, this.f13994h, false);
                layoutInflater3 = layoutInflater;
                int i3 = 1;
                if (document3 != document2) {
                    view3 = view;
                } else {
                    view3 = view2;
                }
                a = C1473m.f7980a.mo2045Y().m11647a(document3, c2196e);
                if (set != null) {
                    if (set.contains(document3.f14885a.f12096c)) {
                        obj3 = 1;
                        if (a) {
                        }
                        view2.m17299a(document, document3, false, z, (C1565a) list2.get(i2), this.f13992f, z2, this, chVar, this.f13990d, this.f13991e);
                        if (obj2 == null) {
                            this.f13994h.addView(view2, i2);
                        } else {
                            view2.m17296a();
                        }
                        view2.setVisibility(0);
                        layoutInflater2 = layoutInflater3;
                        view = view3;
                    }
                }
                obj3 = null;
                if (a) {
                }
                view2.m17299a(document, document3, false, z, (C1565a) list2.get(i2), this.f13992f, z2, this, chVar, this.f13990d, this.f13991e);
                if (obj2 == null) {
                    view2.m17296a();
                } else {
                    this.f13994h.addView(view2, i2);
                }
                view2.setVisibility(0);
                layoutInflater2 = layoutInflater3;
                view = view3;
            }
            i2++;
            layoutInflater = layoutInflater2;
        }
        for (int i4 = size; i4 < childCount; i4++) {
            this.f13994h.getChildAt(i4).setVisibility(8);
        }
        if (!(view == null || view.m17302c())) {
            view.m17297a(0);
        }
        this.f13994h.refreshDrawableState();
        C2288b c2288b = this.f13988b;
        if (c2288b.f11312b.m11642a(document, c2288b.f11311a.cY()) != null) {
            obj = 1;
        } else if (C2288b.m11785a(document.f14885a.f12107n) > 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null || !document.m14636Y()) {
            this.f13993g.setVisibility(8);
        } else {
            this.f13993g.setVisibility(0);
        }
    }

    public final void mo3002a(EpisodeSnippet episodeSnippet) {
        int childCount = this.f13994h.getChildCount();
        for (int i = 0; i < childCount; i++) {
            EpisodeSnippet episodeSnippet2 = (EpisodeSnippet) this.f13994h.getChildAt(i);
            if (episodeSnippet2 != episodeSnippet) {
                episodeSnippet2.m17301b();
            }
        }
        if (episodeSnippet.m17302c()) {
            this.f14001o.mo3057a(episodeSnippet.getEpisode());
        } else {
            this.f14001o.mo3057a(null);
        }
    }

    public void setSelectedSeasonIndex(int i) {
        this.f13996j.setSelection(i);
    }

    static boolean m13764a(Document document, C2196e c2196e) {
        return C1473m.f7980a.mo2045Y().m11647a(document, c2196e) || C2288b.m11785a(document.f14885a.f12107n) > 0;
    }
}

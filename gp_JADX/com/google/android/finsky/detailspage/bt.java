package com.google.android.finsky.detailspage;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bb.C1565a;
import com.google.android.finsky.bb.C1566d;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.jk;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.EpisodeSnippet;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.protobuf.nano.C0758b;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.b.aa;
import com.google.wireless.android.finsky.b.z;
import com.google.wireless.android.finsky.dfe.h.a.f;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bt extends ck implements C1566d, C0999d, ad, cb, ch {
    public final C1557b f14325d = C1473m.f7980a.aY();
    public final boolean f14326e = C1473m.f7980a.dj().mo2294a(12624692);
    public boolean f14327f;
    public C2720j f14328g;
    public C2720j f14329h;
    public Document f14330i;
    public List f14331j;
    public List f14332k;
    public boolean f14333l;
    public String f14334m;
    public String f14335n;
    public ce f14336o;
    public final C1031w f14337p;
    public final C0657w f14338q;
    public final C1031w f14339r;
    public final C0657w f14340s;

    public bt() {
        C1473m.f7980a.aO();
        this.f14336o = C2482j.m13283a(211);
        this.f14337p = new bu(this);
        this.f14338q = new bv(this);
        this.f14339r = new bw(this);
        this.f14340s = new bx(this);
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.episode_list_module;
    }

    public final boolean mo2979f() {
        if (this.f14327f) {
            return true;
        }
        return (this.b == null || (((by) this.b).f14347c == null && this.f14331j == null)) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (!this.f14326e) {
            boolean z2 = document.f14885a.f12098e == 18 && !TextUtils.isEmpty(document.m14654i());
            if (z2 && this.b == null) {
                this.b = new by();
                this.f14327f = false;
                jk aR = document.aR();
                if (aR != null) {
                    this.f14335n = aR.f12790b;
                    if (aR.f12791c != null) {
                        this.f14334m = aR.f12791c.f12790b;
                    }
                }
                ((by) this.b).f14351g = new HashMap();
                ((by) this.b).f14345a = document.m14654i();
                this.f14328g = C2721l.m14733a(this.w, ((by) this.b).f14345a, false, true);
                this.f14328g.m11918a(this.f14337p);
                this.f14328g.m11917a(this.f14338q);
                this.f14328g.m14699n();
                this.D.mo2814a((C0999d) this);
                this.f14325d.mo2309a((C1566d) this);
            }
        }
    }

    public final void mo2976b(View view, int i) {
        EpisodeListModuleLayout episodeListModuleLayout = (EpisodeListModuleLayout) view;
        int i2;
        if (this.f14327f) {
            if (episodeListModuleLayout.f13994h.getChildCount() == 0) {
                LayoutInflater from = LayoutInflater.from(episodeListModuleLayout.getContext());
                i2 = 0;
                while (i2 < 5) {
                    EpisodeSnippet episodeSnippet = (EpisodeSnippet) from.inflate(C7582R.layout.episode_snippet, episodeListModuleLayout.f13994h, false);
                    episodeSnippet.m17300a(i2 == 0);
                    episodeListModuleLayout.f13994h.addView(episodeSnippet, i2);
                    i2++;
                }
                episodeListModuleLayout.f13996j.setVisibility(4);
                episodeListModuleLayout.f13997k.setVisibility(4);
            }
        } else if (!episodeListModuleLayout.f13989c || this.f14333l) {
            Object obj;
            Set set = (Set) ((by) this.b).f14351g.get(((by) this.b).f14349e.f14885a.f12096c);
            C3748a c3748a = this.z;
            List list = ((by) this.b).f14346b;
            Document document = ((by) this.b).f14349e;
            List list2 = ((by) this.b).f14347c;
            Document document2 = ((by) this.b).f14350f;
            List list3 = ((by) this.b).f14348d;
            C2206c c2206c = this.D;
            if (this.f14331j != null) {
                obj = 1;
            } else {
                obj = null;
            }
            C2495w c2495w = this.J;
            episodeListModuleLayout.f13989c = true;
            episodeListModuleLayout.f13990d = this;
            episodeListModuleLayout.f13992f = c3748a;
            episodeListModuleLayout.f14001o = this;
            episodeListModuleLayout.f13991e = c2495w;
            episodeListModuleLayout.f13996j.setVisibility(0);
            if (episodeListModuleLayout.f14002p != list) {
                episodeListModuleLayout.f14002p = list;
                episodeListModuleLayout.f13996j.setAdapter(new cc(episodeListModuleLayout, episodeListModuleLayout.getContext(), episodeListModuleLayout.f14002p));
            }
            if (episodeListModuleLayout.f14003q != document) {
                episodeListModuleLayout.f14003q = document;
                episodeListModuleLayout.f13996j.setSelection(list.indexOf(document));
            }
            EpisodeSnippet.m17293a(episodeListModuleLayout.getResources(), episodeListModuleLayout.f13997k, null, null, null, document, false, episodeListModuleLayout.f13992f, episodeListModuleLayout.f13990d, episodeListModuleLayout.f13991e);
            episodeListModuleLayout.f13997k.setActionStyle(0);
            if (episodeListModuleLayout.f13987a) {
                boolean z;
                boolean a = EpisodeListModuleLayout.m13764a(document, c2206c);
                if (!a) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        if (EpisodeListModuleLayout.m13764a((Document) list.get(i3), c2206c)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = a;
                Resources resources = C1473m.f7980a.f7981b.getResources();
                if (!z) {
                    episodeListModuleLayout.f14000n.setText(resources.getString(C7582R.string.show_unavailable));
                } else if (!a) {
                    episodeListModuleLayout.f14000n.setText(resources.getString(C7582R.string.season_name_unavailable, new Object[]{document.f14885a.f12100g}));
                }
                Object obj2 = (z && a) ? null : 1;
                episodeListModuleLayout.f13999m.setVisibility(obj2 != null ? 0 : 8);
                episodeListModuleLayout.f14000n.setVisibility(obj2 != null ? 0 : 8);
            }
            episodeListModuleLayout.f13998l.setVisibility(8);
            bl[] blVarArr = document.f14885a.f12107n;
            if (C1473m.f7980a.mo2045Y().m11642a(document, C1473m.f7980a.cY()) == null && C2288b.m11785a(blVarArr) != 0) {
                CharSequence charSequence;
                C0758b a2 = C2288b.m11786a(blVarArr, true, null);
                if (a2 == null || !a2.m4919a(aa.a)) {
                    charSequence = null;
                } else {
                    z zVar = (z) a2.m4921b(aa.a);
                    if (zVar.e()) {
                        Object obj3 = zVar.c;
                        String str = a2.f11922l;
                        charSequence = new SpannableStringBuilder(obj3);
                        i2 = obj3.indexOf(str);
                        if (i2 >= 0) {
                            charSequence.setSpan(new StrikethroughSpan(), i2, str.length() + i2, 17);
                        }
                    } else {
                        charSequence = null;
                    }
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    episodeListModuleLayout.f13998l.setText(charSequence);
                    episodeListModuleLayout.f13998l.setVisibility(0);
                }
            }
            if (list.size() <= 1) {
                episodeListModuleLayout.f13996j.setClickable(false);
                episodeListModuleLayout.f13996j.setBackgroundResource(0);
            }
            if (obj == null) {
                episodeListModuleLayout.m13765a(document, list2, document2, list3, c2206c, set, this);
                if (episodeListModuleLayout.f13995i != null) {
                    episodeListModuleLayout.f13995i.setVisibility(4);
                    episodeListModuleLayout.f13995i.setOnClickListener(null);
                }
            } else if (episodeListModuleLayout.f13995i != null) {
                episodeListModuleLayout.f13995i.setVisibility(0);
                episodeListModuleLayout.f13995i.setOnClickListener(new ca());
            }
            this.f14333l = false;
        }
    }

    public final void mo2980h() {
        this.D.mo2819b(this);
        this.f14325d.mo2312b((C1566d) this);
        if (this.f14328g != null) {
            this.f14328g.m11922b(this.f14337p);
            this.f14328g.m11921b(this.f14338q);
        }
        if (this.f14329h != null) {
            this.f14329h.m11922b(this.f14339r);
            this.f14329h.m11921b(this.f14340s);
        }
    }

    public final void mo3057a(Document document) {
        ((by) this.b).f14350f = document;
    }

    public final void mo3060b(Document document) {
        if (((by) this.b).f14349e != document) {
            this.f14330i = ((by) this.b).f14349e;
            this.f14331j = ((by) this.b).f14347c;
            this.f14332k = ((by) this.b).f14348d;
            ((by) this.b).f14349e = document;
            ((by) this.b).f14347c = null;
            ((by) this.b).f14348d = null;
            ((by) this.b).f14350f = null;
            m13994a();
            if (!(this.f14336o.d.length == 0 || Arrays.equals(this.f14336o.d, ((by) this.b).f14349e.f14885a.f12087D))) {
                this.f14336o.f = ce.a;
                this.f14336o.d();
            }
            C2482j.m13285a(this.f14336o, ((by) this.b).f14349e.f14885a.f12087D);
        }
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        m14005b();
        m14014j();
        if (mo2979f() && !this.f14327f) {
            m14001a(false);
        }
    }

    final void m13994a() {
        if (this.f14329h != null) {
            this.f14329h.m11922b(this.f14339r);
            this.f14329h.m11921b(this.f14340s);
        }
        if (C1473m.f7980a.dj().mo2294a(12626439)) {
            C1473m.f7980a.ab();
            this.f14329h = C2721l.m14732a(this.w, ((by) this.b).f14349e.m14654i(), C1804v.m9805b(C1473m.f7980a.ah().mo2811a(this.w.mo1620b())));
        } else {
            this.f14329h = C2721l.m14733a(this.w, ((by) this.b).f14349e.m14654i(), false, true);
        }
        this.f14329h.m11918a(this.f14339r);
        this.f14329h.m11917a(this.f14340s);
        this.f14329h.m14699n();
        if (this.f14331j != null) {
            m14001a(false);
        }
    }

    public ce getPlayStoreUiElement() {
        return this.f14336o;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    final void m14005b() {
        if (((by) this.b).f14349e != null) {
            String str = ((by) this.b).f14349e.f14885a.f12096c;
            if ((!((by) this.b).f14351g.containsKey(str) ? 1 : null) != null && ((by) this.b).f14347c != null) {
                Set hashSet = new HashSet();
                for (Document document : ((by) this.b).f14347c) {
                    if (C1473m.f7980a.mo2045Y().m11647a(document, this.D)) {
                        hashSet.add(document.f14885a.f12096c);
                    }
                }
                ((by) this.b).f14351g.put(str, hashSet);
            }
        }
    }

    final void m14001a(boolean z) {
        if (mo2979f()) {
            this.f14333l = true;
            this.u.mo3033a(this, z);
        }
    }

    public final void mo3056a(C1565a c1565a, boolean z) {
        this.f14325d.mo2308a(this.A, c1565a, z);
    }

    public final void mo3055a(C1565a c1565a) {
        this.f14325d.mo2311b(C0954a.aC);
        if (c1565a != null) {
            c1565a.f8375f = false;
        }
    }

    public final void mo3061d() {
        this.z.mo3629a(4, this.J);
    }

    public final void mo3062i() {
        this.f14325d.mo2313c().mo2334o();
    }

    public final boolean mo3059a(String str, String str2, f fVar) {
        if (!m13993b(str, str2)) {
            return false;
        }
        if (fVar.d()) {
            m14014j();
            m14001a(false);
        }
        return true;
    }

    public final boolean mo3058a(String str, String str2) {
        if (!m13993b(str, str2)) {
            return false;
        }
        m14001a(false);
        return true;
    }

    final void m14014j() {
        if (((by) this.b).f14347c != null) {
            List arrayList = new ArrayList(((by) this.b).f14347c.size());
            for (int i = 0; i < ((by) this.b).f14347c.size(); i++) {
                arrayList.add(this.f14325d.mo2305a(this.t, (Document) ((by) this.b).f14347c.get(i)));
            }
            ((by) this.b).f14348d = arrayList;
        }
    }

    private final boolean m13993b(String str, String str2) {
        if (C1473m.f7980a.cZ().equals(str)) {
            for (Document document : ((by) this.b).f14347c) {
                if (document.f14885a.f12096c.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((by) c2600d);
        if (this.b != null) {
            this.D.mo2814a((C0999d) this);
            this.f14325d.mo2309a((C1566d) this);
            if (((by) this.b).f14346b == null) {
                this.f14328g = C2721l.m14733a(this.w, ((by) this.b).f14345a, false, true);
                this.f14328g.m11918a(this.f14337p);
                this.f14328g.m11917a(this.f14338q);
                this.f14328g.m14699n();
                return;
            }
            this.u.mo3036b("EpisodeListModule.SeasonDocument", ((by) this.b).f14349e);
            if (((by) this.b).f14347c == null) {
                m13994a();
            }
        }
    }
}

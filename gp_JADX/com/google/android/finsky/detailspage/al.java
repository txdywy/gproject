package com.google.android.finsky.detailspage;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ab.C0969a;
import com.google.android.finsky.cv.p177a.C2433g;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.ac;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cr;
import com.google.android.finsky.cv.p177a.cs;
import com.google.android.finsky.cv.p177a.ey;
import com.google.android.finsky.cv.p177a.fl;
import com.google.android.finsky.cv.p177a.lp;
import com.google.android.finsky.cv.p177a.lq;
import com.google.android.finsky.detailscomponents.C2576a;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraCredits;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraPrimary;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraSecondary;
import com.google.android.finsky.detailspage.TextModule.DetailsIconDescription;
import com.google.android.finsky.detailspage.TextModule.ExpandedData;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class al extends TextModule implements C1003o {
    public Document f14249d;
    public Document f14250e;

    public final int mo2978e() {
        return 1;
    }

    protected final ge mo3026a(Document document, boolean z) {
        ac acVar = null;
        CharSequence charSequence = document.f14885a.f12105l;
        ge geVar = new ge();
        if (TextUtils.isEmpty(charSequence) && !z) {
            return null;
        }
        boolean z2;
        C3340g bw = C1473m.f7980a.bw();
        bw.mo3484b((C1003o) this);
        bw.mo3481a((C1003o) this);
        this.f14249d = document;
        geVar.f14616a = document.f14885a.f12099f;
        geVar.f14617b = document.f14885a.f12098e;
        CharSequence A = document.m14612A();
        Object obj = document.f14885a.f12104k;
        CharSequence fromHtml = TextUtils.isEmpty(obj) ? null : Html.fromHtml(obj);
        geVar.f14618c = charSequence;
        geVar.f14619d = 1;
        geVar.f14620e = false;
        if (TextUtils.isEmpty(geVar.f14618c) && document.f14885a.f12098e != 1) {
            geVar.f14618c = A;
            geVar.f14619d = 8388611;
            geVar.f14620e = true;
            A = null;
        }
        geVar.f14621f = null;
        geVar.f14622g = A;
        geVar.f14623h = fromHtml;
        geVar.f14624i = document.m14618G() ? document.m14619H() : null;
        if (m13859a(document)) {
            z2 = false;
        } else {
            z2 = true;
        }
        geVar.f14625j = z2;
        if (document.f14885a.f12098e == 8 && document.an()) {
            acVar = document.ap()[0];
        }
        geVar.f14626k = acVar;
        geVar.f14627l = m13860b(document);
        geVar.f14628m = m13862c(document);
        geVar.f14629n = Integer.valueOf(this.t.getResources().getColor(C7582R.color.play_white));
        return geVar;
    }

    protected final ExpandedData mo3040a(Document document, boolean z, ge geVar) {
        ExpandedData a = super.mo3040a(document, z, geVar);
        if (a == null) {
            return null;
        }
        m13861b(document, a);
        m13858a(document, a);
        m13864d(document, a);
        m13865e(document, a);
        m13866f(document, a);
        m13863c(document, a);
        m13857a(a);
        return a;
    }

    public final void mo3034a(String str, Object obj) {
        if ("EpisodeListModule.SeasonDocument".equals(str) || "SeasonListModule.SeasonDocument".equals(str)) {
            this.f14250e = (Document) obj;
            if (this.b != null) {
                m13857a(((ge) this.b).f14630o);
                if (mo2979f()) {
                    this.u.mo3033a(this, true);
                } else {
                    this.u.mo3032a(this);
                }
            }
        }
    }

    private final void m13857a(ExpandedData expandedData) {
        if (expandedData != null && this.f14250e != null) {
            m13861b(this.f14250e, expandedData);
            m13858a(this.f14250e, expandedData);
            m13864d(this.f14250e, expandedData);
            m13865e(this.f14250e, expandedData);
            m13866f(this.f14250e, expandedData);
            m13863c(this.f14250e, expandedData);
            ((ge) this.b).f14627l = m13860b(this.f14250e);
            ((ge) this.b).f14628m = m13862c(this.f14250e);
            if (this.f14249d != null) {
                for (DetailsIconDescription detailsIconDescription : m13860b(this.f14249d)) {
                    if (!((ge) this.b).f14627l.contains(detailsIconDescription)) {
                        ((ge) this.b).f14627l.add(detailsIconDescription);
                    }
                }
                for (DetailsIconDescription detailsIconDescription2 : m13862c(this.f14249d)) {
                    if (!((ge) this.b).f14628m.contains(detailsIconDescription2)) {
                        ((ge) this.b).f14628m.add(detailsIconDescription2);
                    }
                }
            }
        }
    }

    private final boolean m13859a(Document document) {
        if (document.f14885a.f12098e != 1) {
            return C1473m.f7980a.mo2045Y().m11647a(document, this.D.mo2811a(this.w.mo1620b()));
        }
        String str = document.m14625N().f13171k;
        boolean z = C1473m.f7980a.mo2032L().mo2854a(str) != null;
        boolean z2;
        if (C1473m.f7980a.bw().mo3482b(str) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || r3) {
            return true;
        }
        return false;
    }

    private static List m13860b(Document document) {
        int i = 0;
        List arrayList = new ArrayList();
        if (document.as()) {
            for (ac acVar : document.av().f11768e) {
                C1473m.f7980a.ch();
                bd a = C2576a.m13619a(acVar);
                if (a != null) {
                    DetailsIconDescription detailsIconDescription = new DetailsIconDescription(a, acVar.f11756c);
                    if (!arrayList.contains(detailsIconDescription)) {
                        arrayList.add(detailsIconDescription);
                    }
                }
            }
        }
        if (document.at()) {
            ac[] au = document.au();
            int length = au.length;
            while (i < length) {
                ac acVar2 = au[i];
                C1473m.f7980a.ch();
                bd a2 = C2576a.m13619a(acVar2);
                if (a2 != null) {
                    DetailsIconDescription detailsIconDescription2 = new DetailsIconDescription(a2, acVar2.f11756c);
                    if (!arrayList.contains(detailsIconDescription2)) {
                        arrayList.add(detailsIconDescription2);
                    }
                }
                i++;
            }
        }
        for (DetailsIconDescription detailsIconDescription3 : m13862c(document)) {
            if (!arrayList.contains(detailsIconDescription3)) {
                arrayList.add(detailsIconDescription3);
            }
        }
        return arrayList;
    }

    private static List m13862c(Document document) {
        List arrayList = new ArrayList();
        if (document.m14634W()) {
            for (cs csVar : document.f14885a.f12113t.f12068c) {
                for (cr crVar : csVar.f12076d) {
                    bd bdVar = crVar.f12071c;
                    if (bdVar != null) {
                        DetailsIconDescription detailsIconDescription = new DetailsIconDescription(bdVar, csVar.f12075c);
                        if (!arrayList.contains(detailsIconDescription)) {
                            arrayList.add(detailsIconDescription);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final void mo2980h() {
        super.mo2980h();
        C1473m.f7980a.bw().mo3484b((C1003o) this);
    }

    public final void mo1205a(C3369m c3369m) {
        C2441n N = this.f14249d.m14625N();
        if (N != null && c3369m.m16819a().equals(N.f13171k)) {
            boolean z = ((ge) this.b).f14625j;
            ((ge) this.b).f14625j = !m13859a(this.f14249d);
            if (z != ((ge) this.b).f14625j) {
                this.u.mo3033a(this, true);
            }
        }
    }

    private final void m13858a(Document document, ExpandedData expandedData) {
        lq S = document.m14630S();
        lp[] lpVarArr = S != null ? S.f13037b : null;
        if (lpVarArr != null && lpVarArr.length != 0) {
            expandedData.f14133k = this.t.getString(C7582R.string.details_cast_crew);
            expandedData.f14134l.clear();
            for (lp lpVar : lpVarArr) {
                DetailsExtraCredits detailsExtraCredits = new DetailsExtraCredits(lpVar.f13034c, TextUtils.join(", ", lpVar.f13035d));
                if (!expandedData.f14134l.contains(detailsExtraCredits)) {
                    expandedData.f14134l.add(detailsExtraCredits);
                }
            }
        }
    }

    private final void m13861b(Document document, ExpandedData expandedData) {
        int i = document.f14885a.f12098e;
        ac ar = document.ar();
        if (i != 1 && ((i != 6 && i != 18) || ar == null)) {
            return;
        }
        if (ar == null) {
            String string = this.t.getString(C7582R.string.app_content_rating);
            Context context = this.t;
            C2441n N = document.m14625N();
            if (N == null) {
                i = -1;
            } else {
                i = N.f13165e - 1;
            }
            expandedData.m13798a(new DetailsExtraSecondary(string, C0969a.m5789a(context, i)));
        } else if ((i == 18 || i == 6) && ((ar.f11758e == null || ar.f11758e.length == 0) && TextUtils.isEmpty(ar.f11757d))) {
            expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.movie_rating), ar.f11756c));
        } else {
            bd bdVar;
            if (ar.f11758e == null || ar.f11758e.length <= 0) {
                bdVar = null;
            } else {
                bdVar = ar.f11758e[0];
            }
            expandedData.m13797a(new DetailsExtraPrimary(ar.f11756c, ar.f11757d, null, bdVar, true));
        }
    }

    private static void m13863c(Document document, ExpandedData expandedData) {
        if (document.m14634W()) {
            for (cs csVar : document.f14885a.f12113t.f12068c) {
                for (cr crVar : csVar.f12076d) {
                    if (crVar.f12071c != null) {
                        expandedData.m13797a(new DetailsExtraPrimary(csVar.f12075c, crVar.f12072d, null, crVar.f12071c, false));
                    } else {
                        expandedData.m13798a(new DetailsExtraSecondary(csVar.f12075c, crVar.f12072d));
                    }
                }
            }
        }
    }

    private static void m13864d(Document document, ExpandedData expandedData) {
        ac acVar;
        bd bdVar;
        ac[] acVarArr;
        int length;
        int i = 0;
        if (document.an()) {
            for (ac acVar2 : document.ap()) {
                if (acVar2.f11759f != null) {
                    bdVar = acVar2.f11759f;
                } else {
                    C1473m.f7980a.ch();
                    bdVar = C2576a.m13619a(acVar2);
                }
                expandedData.m13797a(new DetailsExtraPrimary(acVar2.f11756c, acVar2.f11757d, acVar2.f11760g, bdVar, true));
            }
        }
        if (document.aq()) {
            List f = document.m14650f(7);
            if (f == null || f.size() <= 0) {
                acVarArr = document.f14885a.f12115v.f13132m;
            } else {
                acVarArr = (ac[]) f.toArray(new ac[f.size()]);
            }
            for (ac acVar22 : r6) {
                if (acVar22.f11759f != null) {
                    bdVar = acVar22.f11759f;
                } else {
                    C1473m.f7980a.ch();
                    bdVar = C2576a.m13619a(acVar22);
                }
                expandedData.m13797a(new DetailsExtraPrimary(acVar22.f11756c, acVar22.f11757d, acVar22.f11760g, bdVar, true));
            }
        }
        if (document.as()) {
            for (ac acVar222 : document.av().f11768e) {
                bd bdVar2;
                if (acVar222.f11759f != null) {
                    bdVar2 = acVar222.f11759f;
                } else {
                    C1473m.f7980a.ch();
                    bdVar2 = C2576a.m13619a(acVar222);
                }
                expandedData.m13797a(new DetailsExtraPrimary(acVar222.f11756c, acVar222.f11757d, acVar222.f11760g, bdVar2, false));
            }
        }
        if (document.at()) {
            acVarArr = document.au();
            length = acVarArr.length;
            while (i < length) {
                acVar222 = acVarArr[i];
                if (acVar222.f11759f != null) {
                    bdVar = acVar222.f11759f;
                } else {
                    C1473m.f7980a.ch();
                    bdVar = C2576a.m13619a(acVar222);
                }
                expandedData.m13797a(new DetailsExtraPrimary(acVar222.f11756c, acVar222.f11757d, acVar222.f11760g, bdVar, true));
                i++;
            }
        }
    }

    private final void m13865e(Document document, ExpandedData expandedData) {
        int i = document.f14885a.f12098e;
        switch (i) {
            case 1:
                C2441n N = document.m14625N();
                if (!TextUtils.isEmpty(N.f13164d)) {
                    expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.app_version), N.f13164d));
                }
                if (!TextUtils.isEmpty(N.f13173m)) {
                    expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.app_update_date), N.f13173m));
                }
                if (!TextUtils.isEmpty(N.f13170j)) {
                    expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.app_downloads), N.f13170j));
                }
                long c = C1473m.f7980a.mo2223d().m8962c(document);
                if (c > 0) {
                    i = C7582R.string.app_size;
                    if (C1473m.f7980a.bt().m15626a(N.f13171k).f15820h) {
                        i = C7582R.string.app_update_size;
                    }
                    expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(i), Formatter.formatFileSize(this.t, c)));
                    return;
                }
                return;
            case 2:
                C2433g O = document.m14626O();
                if (O != null) {
                    fl flVar = O.f12397c;
                    if (!TextUtils.isEmpty(flVar.f12378e)) {
                        try {
                            expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.album_release_date), C1473m.f7980a.bb().m21827a(flVar.f12378e)));
                        } catch (Throwable e) {
                            FinskyLog.m21660a(e, "Cannot parse ISO 8601 date", new Object[0]);
                        }
                    }
                    if (!TextUtils.isEmpty(flVar.f12380g)) {
                        String string;
                        if (TextUtils.isEmpty(flVar.f12379f) || flVar.f12379f.length() < 4) {
                            string = this.t.getString(C7582R.string.music_copyright, new Object[]{flVar.f12380g});
                        } else {
                            string = flVar.f12379f.substring(0, 4);
                            string = this.t.getString(C7582R.string.music_copyright_with_year, new Object[]{string, flVar.f12380g});
                        }
                        expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.album_copyright), string));
                    }
                    if (flVar.f12382i.length > 0) {
                        expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.album_genre), TextUtils.join(",", flVar.f12382i)));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                lq S = document.m14630S();
                if (document.ar() == null) {
                    if (TextUtils.isEmpty(S.f13040e)) {
                        expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.movie_rating), this.t.getString(C7582R.string.no_movie_rating)));
                    } else {
                        expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.movie_rating), S.f13040e));
                    }
                }
                if (!TextUtils.isEmpty(S.f13039d)) {
                    expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.movie_release_date), S.f13039d));
                }
                if (!TextUtils.isEmpty(S.f13038c)) {
                    expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.movie_duration), S.f13038c));
                    return;
                }
                return;
            case 16:
            case 17:
            case 24:
            case 25:
                ey V = document.m14633V();
                if (V != null) {
                    if (!TextUtils.isEmpty(V.f12335e)) {
                        expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.magazine_delivery_frequency), V.f12335e));
                    }
                    if (!TextUtils.isEmpty(V.f12334d)) {
                        expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.magazine_print_subscription_verification), V.f12334d));
                    }
                }
                if (i == 16 || i == 24) {
                    document = document.bk();
                }
                if (document != null) {
                    ey V2 = document.m14633V();
                    if (V2 != null && !TextUtils.isEmpty(V2.f12333c)) {
                        expandedData.m13798a(new DetailsExtraSecondary(this.t.getString(C7582R.string.magazine_device_availability), V2.f12333c));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private static void m13866f(Document document, ExpandedData expandedData) {
        expandedData.f14137o = document.m14635X();
    }

    protected final int mo3027b() {
        return 1862;
    }
}

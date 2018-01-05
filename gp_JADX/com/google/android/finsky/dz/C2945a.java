package com.google.android.finsky.dz;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.lx;
import com.google.android.finsky.detailspage.videowatchaction.C2682h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.C4678i;
import com.google.protobuf.nano.C0758b;
import com.google.wireless.android.finsky.b.aa;
import com.google.wireless.android.finsky.b.z;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C2945a {
    public static List m15316a(Document document) {
        ArrayList arrayList = new ArrayList();
        lx[] aa = document.aa();
        if (aa == null) {
            return arrayList;
        }
        int i;
        for (lx lxVar : aa) {
            if ((!lxVar.bT_() || lxVar.f13077f >= C4678i.m21812a() / 1000) && !(C2945a.m15317a(lxVar) && document.f14885a.f12098e == 6 && !C2945a.m15322e(document))) {
                arrayList.add(lxVar);
            }
        }
        if (arrayList.size() == 1 && C2945a.m15317a((lx) arrayList.get(0))) {
            return new ArrayList();
        }
        if (C1473m.f7980a.dj().mo2294a(12644828)) {
            return arrayList;
        }
        i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            boolean a;
            lx lxVar2 = (lx) arrayList.get(i2);
            if (!C2945a.m15317a(lxVar2)) {
                a = C2945a.m15318a(lxVar2.f13074c);
            } else if (C1473m.f7980a.dj().mo2294a(12644766)) {
                a = false;
            } else {
                a = true;
            }
            if (a) {
                int i3 = i + 1;
                arrayList.add(i, (lx) arrayList.remove(i2));
                i = i3;
            }
        }
        return arrayList;
    }

    public static lx m15313a(Document document, List list, String str) {
        lx lxVar = null;
        if (list.isEmpty()) {
            return null;
        }
        for (lx lxVar2 : list) {
            lx lxVar22;
            if (TextUtils.equals(lxVar22.f13074c, str)) {
                return lxVar22;
            }
            if (!C2945a.m15317a(lxVar22)) {
                lxVar22 = lxVar;
            }
            lxVar = lxVar22;
        }
        return (!C2945a.m15320c(document) || lxVar == null) ? (lx) list.get(0) : lxVar;
    }

    private static boolean m15318a(String str) {
        return C1473m.f7980a.bu().m15635a(str);
    }

    public static CharSequence m15319b(Document document) {
        if (C2945a.m15320c(document)) {
            return null;
        }
        if (!TextUtils.isEmpty(document.m14665t())) {
            return document.m14665t();
        }
        bl[] blVarArr = document.f14885a.f12107n;
        C1473m.f7980a.mo2044X();
        if (C2288b.m11785a(blVarArr) == 0) {
            return null;
        }
        C1473m.f7980a.mo2044X();
        C0758b a = C2288b.m11786a(blVarArr, true, null);
        if (a != null && a.m4919a(aa.a)) {
            z zVar = (z) a.m4921b(aa.a);
            if (zVar.e()) {
                return C2945a.m15315a(zVar.c, a.f11922l);
            }
        }
        a = C1473m.f7980a.mo2044X().m11790c(document, null, C2945a.m15312a());
        if (a == null) {
            return null;
        }
        int i;
        String str = a.f11922l;
        Resources resources = C1473m.f7980a.f7981b.getResources();
        int i2 = a.f11926p;
        if (a.m4919a(aa.a) && ((z) a.m4921b(aa.a)).d()) {
            i = ((z) a.m4921b(aa.a)).b;
            if (i2 == 1 || i2 == 7) {
                switch (i) {
                    case 1:
                        i = C7582R.string.list_price_sd;
                        break;
                    case 2:
                        i = C7582R.string.list_price_hd;
                        break;
                    case 3:
                        i = C7582R.string.list_price_uhd;
                        break;
                    default:
                        i = C7582R.string.list_price;
                        break;
                }
            }
            if (i2 == 3 || i2 == 4) {
                switch (i) {
                    case 1:
                        i = C7582R.string.list_price_rental_sd;
                        break;
                    case 2:
                        i = C7582R.string.list_price_rental_hd;
                        break;
                    case 3:
                        i = C7582R.string.list_price_rental_uhd;
                        break;
                    default:
                        i = C7582R.string.list_price_rental;
                        break;
                }
            }
            i = C7582R.string.list_price;
        } else {
            switch (i2) {
                case 1:
                    i = C7582R.string.list_price_sd;
                    break;
                case 3:
                    i = C7582R.string.list_price_rental_sd;
                    break;
                case 4:
                    i = C7582R.string.list_price_rental_hd;
                    break;
                case 7:
                    i = C7582R.string.list_price_hd;
                    break;
            }
            i = C7582R.string.list_price;
        }
        return C2945a.m15315a(resources.getString(i, new Object[]{str}), str);
    }

    public static boolean m15320c(Document document) {
        return C1473m.f7980a.mo2045Y().m11642a(document, C1473m.f7980a.cY()) != null;
    }

    public static C2682h m15314a(Document document, lx lxVar, boolean z) {
        String str = null;
        C2682h c2682h = new C2682h();
        c2682h.f14792a = lxVar.f13081j;
        c2682h.f14793b = lxVar.f13082k;
        if (C2945a.m15317a(lxVar)) {
            if (!(z || C2945a.m15320c(document))) {
                if (!TextUtils.isEmpty(lxVar.f13083l)) {
                    str = lxVar.f13083l;
                } else if (!C2945a.m15320c(document)) {
                    bl[] blVarArr = document.f14885a.f12107n;
                    C1473m.f7980a.mo2044X();
                    int a = C2288b.m11785a(blVarArr);
                    if (a != 0) {
                        C1473m.f7980a.mo2044X();
                        bl a2 = C2288b.m11786a(blVarArr, true, null);
                        if (a2 != null) {
                            if (a > 0) {
                                str = C1473m.f7980a.f7981b.getResources().getString(C7582R.string.purchase_or_rent_resolution, new Object[]{a2.f11917g});
                            } else {
                                str = a2.f11917g;
                            }
                        }
                    }
                }
            }
        } else if (!C2945a.m15318a(lxVar.f13074c)) {
            str = lxVar.f13083l;
        }
        c2682h.f14794c = str;
        c2682h.f14795d = lxVar.f13079h;
        return c2682h;
    }

    public static boolean m15317a(lx lxVar) {
        return TextUtils.equals(lxVar.f13074c, "com.google.android.videos");
    }

    public static boolean m15321d(Document document) {
        return C2945a.m15322e(document) || !C2945a.m15316a(document).isEmpty();
    }

    public static boolean m15322e(Document document) {
        if (!C2945a.m15320c(document)) {
            boolean z;
            C1473m.f7980a.mo2044X();
            if (C2288b.m11785a(document.f14885a.f12107n) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private static CharSequence m15315a(String str, String str2) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(str2);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), indexOf, str2.length() + indexOf, 17);
        }
        return spannableStringBuilder;
    }

    public static C2197a m15312a() {
        return C1473m.f7980a.ah().mo2811a(C1473m.f7980a.cY());
    }
}

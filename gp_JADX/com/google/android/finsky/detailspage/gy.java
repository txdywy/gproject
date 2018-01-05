package com.google.android.finsky.detailspage;

import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ao.C1242f;
import com.google.android.finsky.ao.C1245i;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.C2440m;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.cb;
import com.google.android.finsky.cv.p177a.co;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.ga;
import com.google.android.finsky.cv.p177a.lw;
import com.google.android.finsky.detailspage.WarningMessageModuleView.C26311;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C1002e;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.an;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class gy extends ck implements C0999d, ad, C1002e, C1003o, C0983h {
    public final C2288b f14661d = C1473m.f7980a.mo2044X();
    public final C2833a f14662e = C1473m.f7980a.mo2253l();
    public ce f14663f;
    public boolean f14664g;
    public boolean f14665h;
    public List f14666i;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.warning_message_module;
    }

    public final boolean mo2979f() {
        return this.b != null && ((hd) this.b).f14681c;
    }

    public final void m14433a(hd hdVar) {
        super.mo2973a(hdVar);
        if (this.b != null) {
            this.D.mo2814a((C0999d) this);
            this.f14662e.m14984a((C1002e) this);
            C1473m.f7980a.bw().mo3481a((C1003o) this);
            if (C1473m.f7980a.dj().mo2294a(12616561)) {
                C1473m.f7980a.mo2254m().mo3818a((C0983h) this);
            }
        }
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null) {
            this.b = new hd();
            this.D.mo2814a((C0999d) this);
            this.f14662e.m14984a((C1002e) this);
            C1473m.f7980a.bw().mo3481a((C1003o) this);
            if (C1473m.f7980a.dj().mo2294a(12616561)) {
                C1473m.f7980a.mo2254m().mo3818a((C0983h) this);
            }
        }
        if (z) {
            String str;
            hd hdVar = (hd) this.b;
            if (c2719i.f14925a == null || c2719i.f14925a.m == null) {
                str = null;
            } else {
                str = c2719i.f14925a.m.b;
            }
            hdVar.f14682d = str;
        }
        ((hd) this.b).f14679a = document;
        ((hd) this.b).f14680b = document2;
        m14428b();
    }

    public final void mo3034a(String str, Object obj) {
        if ("VideoWatchActionsModule.WatchActionApp".equals(str)) {
            boolean z = !TextUtils.isEmpty((String) obj);
            if (z != this.f14665h) {
                this.f14665h = z;
                if (this.b != null) {
                    m14429a();
                }
            }
        }
    }

    private final void m14428b() {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Account b;
        Account b2;
        CharSequence charSequence;
        int a;
        int a2;
        Object obj4;
        Object obj5;
        boolean bW;
        C2129c a3;
        Object obj6;
        Object obj7;
        Document document;
        CharSequence charSequence2;
        bl a4;
        Object obj8;
        Object obj9;
        boolean a5;
        Object obj10;
        Object obj11;
        int i2;
        int i3;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        C1473m c1473m;
        C1245i a6;
        int i4;
        C2196e c2196e;
        DfeToc dfeToc;
        CharSequence fromHtml;
        List b3;
        Object obj16;
        hd hdVar;
        boolean z;
        Resources resources;
        int i5;
        int a7;
        he heVar;
        float f;
        int i6;
        int i7;
        he heVar2;
        C2440m c2440m;
        int length;
        bd bdVar;
        Resources resources2;
        CharSequence string;
        Drawable drawable;
        String d;
        Resources resources3;
        CharSequence fromHtml2;
        ((hd) this.b).f14683e = new he();
        Document document2 = ((hd) this.b).f14679a;
        Document document3 = ((hd) this.b).f14680b;
        ga aH = document2.aH();
        C3026a c3026a = null;
        String str = null;
        if (document2.m14625N() != null && document2.m14625N().aw_()) {
            str = document2.m14625N().f13171k;
            c3026a = C1473m.f7980a.bt().m15626a(str);
        }
        Account b4 = this.w.mo1620b();
        C2197a a8 = this.D.mo2811a(b4);
        boolean a9 = C1473m.f7980a.mo2045Y().m11649a(document2, this.v, (C2196e) a8);
        Object obj17 = (document2.m14616E() && C1473m.f7980a.ab().m9806a(document2, a8) && !this.f14665h) ? 1 : null;
        boolean al = document2.al();
        C1552e dj = C1473m.f7980a.dj();
        Object obj18 = (!dj.mo2294a(12626284) || aH == null || aH.f12404e.f12324d.f12681d.isEmpty()) ? null : 1;
        if (document2.f14885a.f12098e == 1) {
            bl[] blVarArr = document2.f14885a.f12107n;
            int length2 = blVarArr.length;
            i = 0;
            while (i < length2) {
                bl blVar = blVarArr[i];
                if (blVar.f11928r == null || (blVar.f11915e <= 0 && !blVar.f11925o)) {
                    i++;
                } else {
                    obj = !C1473m.f7980a.mo2045Y().m11647a(document2, (C2196e) a8) ? 1 : null;
                    obj2 = (C1473m.f7980a.mo2045Y().m11647a(document2, (C2196e) a8) || document2.f14885a.f12098e != 1 || c3026a == null || !c3026a.m15625c()) ? null : 1;
                    obj3 = (document2.m14625N() == null && document2.m14625N().f13182v) ? 1 : null;
                    b = this.w.mo1620b();
                    b2 = this.x.mo1620b();
                    if (document2 != null || document3 == null) {
                        charSequence = null;
                    } else {
                        if (!b.name.equals(b2.name)) {
                            a = this.f14662e.m14983a(document3, b2);
                            a2 = this.f14662e.m14983a(document2, b);
                            Resources resources4 = C1473m.f7980a.f7981b.getResources();
                            if (a == 3 && (a2 == 0 || a2 == 2)) {
                                charSequence = resources4.getString(C7582R.string.testing_program_multi_account_dfe_account_opted_out_warning, new Object[]{b.name});
                            } else if (a2 == 3 && (a == 0 || a == 2)) {
                                charSequence = resources4.getString(C7582R.string.testing_program_multi_account_dfe_account_opted_in_warning, new Object[]{b.name});
                            }
                        }
                        charSequence = null;
                    }
                    obj4 = TextUtils.isEmpty(charSequence) ? 1 : null;
                    if (document3 != null) {
                        a = this.f14662e.m14983a(document3, C1473m.f7980a.cY());
                        obj5 = (document3.bS() || !(a == 3 || a == 4 || a == 1)) ? null : 1;
                        if (obj5 != null) {
                            obj5 = 1;
                            bW = document2.bW();
                            if (!(document2.m14625N() == null || C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) == null)) {
                                a2 = this.f14662e.m14983a(document2, C1473m.f7980a.cY());
                                if (a2 == 0 || a2 == 2) {
                                    a3 = C1473m.f7980a.mo2169c().mo2657a(document2.m14625N().f13171k);
                                    if (!(a3 == null || (a3.f10824r & 16) == 0)) {
                                        obj6 = 1;
                                        obj7 = (document2.f14885a.f12098e == 1 || !C1473m.f7980a.mo2244g().m15130c(str)) ? null : 1;
                                        document = ((hd) this.b).f14680b;
                                        if (document == null) {
                                            charSequence2 = null;
                                        } else {
                                            a4 = this.f14661d.m11788a(document, this.v, this.D.mo2811a(this.x.mo1620b()));
                                            if (a4 == null) {
                                                charSequence2 = null;
                                            } else {
                                                obj8 = C1473m.f7980a.mo2247i().m13153a(document, a4, 3).f11910E;
                                            }
                                        }
                                        obj9 = (TextUtils.isEmpty(charSequence2) || C1473m.f7980a.mo2045Y().m11647a(document2, (C2196e) a8)) ? null : 1;
                                        if (c3026a != null) {
                                            a5 = C1473m.f7980a.dj().mo2294a(12631565);
                                            obj10 = document2.f14885a.f12098e == 1 ? 1 : null;
                                            obj11 = document2.ae() ? 1 : null;
                                            document = ((hd) this.b).f14679a;
                                            if (document.f14885a.f12107n != null) {
                                                for (bl blVar2 : document.f14885a.f12107n) {
                                                    if (blVar2 != null && blVar2.f11915e == 0) {
                                                        obj12 = 1;
                                                        break;
                                                    }
                                                }
                                            }
                                            obj12 = null;
                                            obj12 = obj12 == null ? 1 : null;
                                            obj13 = c3026a.f15820h ? 1 : null;
                                            obj14 = c3026a.f15827o ? 1 : null;
                                            obj15 = c3026a.f15828p == 0 ? 1 : null;
                                            if (!(obj10 == null || obj11 == null || !a5 || obj12 == null || obj13 == null || obj14 == null || obj15 == null)) {
                                                obj15 = 1;
                                                if (TextUtils.isEmpty(((hd) this.b).f14682d)) {
                                                    obj10 = 1;
                                                } else {
                                                    obj10 = null;
                                                }
                                                for (Account b5 : this.D.mo2812a(document2.f14885a.f12096c)) {
                                                    if (C1473m.f7980a.mo2041U().mo1197b(b5)) {
                                                        obj11 = 1;
                                                        break;
                                                    }
                                                }
                                                obj11 = null;
                                                a5 = document2.aK();
                                                c1473m = C1473m.f7980a;
                                                if (!c1473m.dj().mo2294a(12643667)) {
                                                    obj13 = null;
                                                } else if (this.f14666i == null) {
                                                    a6 = new C1245i().m7247a(document2.cf(), document2.m14671z());
                                                    a6.f7406a = b4.name;
                                                    c1473m.cS().m7241a(a6.m7246a(), (C1242f) new gz(this, document2));
                                                    obj13 = null;
                                                } else if (this.f14666i.isEmpty()) {
                                                    obj13 = null;
                                                } else if (this.f14666i.size() != 1) {
                                                    i4 = 1;
                                                } else {
                                                    FinskyLog.m21669e("Only supports one dependency", new Object[0]);
                                                    obj13 = null;
                                                }
                                                c2196e = this.D;
                                                dfeToc = this.v;
                                                if (!(document2.f14885a.f12098e == 1 || C1473m.f7980a.mo2045Y().m11647a(document2, (C2196e) a8))) {
                                                    if (C1473m.f7980a.mo2045Y().m11641a(document2) == null) {
                                                        fromHtml = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a(document2).name}));
                                                    } else if (document2.f14885a.f12099f == 6 && document2.bj()) {
                                                        b3 = C1473m.f7980a.mo2045Y().m11653b(document2, dfeToc, c2196e);
                                                        if (C1473m.f7980a.mo2045Y().m11643a(b3, b4) == null) {
                                                            for (i3 = 0; i3 < b3.size(); i3++) {
                                                                if (C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)) != null) {
                                                                    obj14 = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)).name}));
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    obj16 = (dj.mo2294a(12639546) || !document2.m14658m()) ? null : 1;
                                                    hdVar = (hd) this.b;
                                                    z = (!a9 && !al && obj17 == null && obj == null && obj3 == null && TextUtils.isEmpty(fromHtml) && obj2 == null && obj4 == null && obj5 == null && !bW && obj6 == null && obj7 == null && obj9 == null && obj15 == null && obj10 == null && obj11 == null && obj16 == null && !a5 && obj13 == null) ? false : true;
                                                    hdVar.f14681c = z;
                                                    if (!((hd) this.b).f14681c) {
                                                        resources = this.t.getResources();
                                                        i5 = ((hd) this.b).f14679a.f14885a.f12099f;
                                                        ((hd) this.b).f14683e.f14686b = false;
                                                        ((hd) this.b).f14683e.f14687c = true;
                                                        ((hd) this.b).f14683e.f14692h = false;
                                                        if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                                            ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
                                                        } else {
                                                            ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
                                                        }
                                                        a7 = C1608h.m9243a(this.t, i5);
                                                        heVar = ((hd) this.b).f14683e;
                                                        if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                                            f = 0.1f;
                                                        } else {
                                                            f = 0.15f;
                                                        }
                                                        heVar.f14691g = C1607g.m9234a(a7, f);
                                                        ((hd) this.b).f14684f = null;
                                                        if (a9) {
                                                            ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                        } else if (obj == null) {
                                                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                                                            ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
                                                        } else if (obj3 == null) {
                                                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                        } else if (!al) {
                                                            ((hd) this.b).f14683e.f14685a = document2.am().toString();
                                                            ((hd) this.b).f14683e.f14686b = true;
                                                            i6 = 0;
                                                            for (lw lwVar : document2.f14885a.f12115v.f13126g) {
                                                                i2 = (lwVar.f13070d || lwVar.f13071e != null) ? 1 : 0;
                                                                i6 |= i2;
                                                            }
                                                            if (i6 == 0) {
                                                                heVar2 = ((hd) this.b).f14683e;
                                                                c2440m = document2.f14885a.f12115v;
                                                                length = c2440m.f13126g.length;
                                                                for (i2 = 0; i2 < length; i2++) {
                                                                    if (c2440m.f13126g[i2].f13071e == null) {
                                                                        bdVar = c2440m.f13126g[i2].f13071e;
                                                                        break;
                                                                    }
                                                                }
                                                                bdVar = null;
                                                                heVar2.f14689e = bdVar;
                                                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                            }
                                                        } else if (obj17 == null) {
                                                            ((hd) this.b).f14683e.f14685a = document2.m14617F();
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                                                            if (obj18 == null) {
                                                                ((hd) this.b).f14684f = new ha(this, aH);
                                                                this.f14664g = true;
                                                            }
                                                        } else if (TextUtils.isEmpty(fromHtml)) {
                                                            ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                        } else if (obj2 == null) {
                                                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                        } else if (obj4 == null) {
                                                            ((hd) this.b).f14683e.f14685a = charSequence;
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                        } else if (obj5 == null) {
                                                            heVar2 = ((hd) this.b).f14683e;
                                                            resources2 = C1473m.f7980a.f7981b.getResources();
                                                            switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                                                                case 1:
                                                                    string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                                                                    break;
                                                                case 3:
                                                                    string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                                                                    break;
                                                                case 4:
                                                                    string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                                                                    break;
                                                                default:
                                                                    FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                                                                    string = "";
                                                                    break;
                                                            }
                                                            heVar2.f14685a = string;
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                        } else if (!bW) {
                                                            if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                                                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                                                            } else {
                                                                if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY())) && document2.bX()) {
                                                                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_cap_reached_warning_message);
                                                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, 4);
                                                                    ((hd) this.b).f14683e.f14690f = ColorStateList.valueOf(C0216d.m1116c(this.t, C7582R.color.testing_program_cap_reached_message_fg));
                                                                    ((hd) this.b).f14683e.f14691g = C0216d.m1116c(this.t, C7582R.color.testing_program_cap_reached_message_bg);
                                                                } else {
                                                                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                                                                }
                                                            }
                                                            heVar2 = ((hd) this.b).f14683e;
                                                            if (((hd) this.b).f14683e.f14688d != null) {
                                                                drawable = ((hd) this.b).f14683e.f14688d;
                                                            } else {
                                                                drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                            }
                                                            heVar2.f14688d = drawable;
                                                        } else if (obj6 == null) {
                                                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                        } else if (obj7 == null) {
                                                            heVar2 = ((hd) this.b).f14683e;
                                                            d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                                                            resources3 = C1473m.f7980a.f7981b.getResources();
                                                            obj12 = -1;
                                                            switch (d.hashCode()) {
                                                                case -1407668872:
                                                                    if (d.equals("disabled_permanently")) {
                                                                        obj12 = 2;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case -390411177:
                                                                    if (d.equals("disabled_until_updated")) {
                                                                        obj12 = 1;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1894318991:
                                                                    if (d.equals("disabled_by_parent")) {
                                                                        obj12 = null;
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                            switch (obj12) {
                                                                case null:
                                                                    string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                                                                    break;
                                                                case 1:
                                                                    string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                                                                    break;
                                                                case 2:
                                                                    string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                                                                    break;
                                                                default:
                                                                    string = null;
                                                                    break;
                                                            }
                                                            heVar2.f14685a = string;
                                                            ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
                                                        } else if (obj16 != null) {
                                                            ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                            ((hd) this.b).f14683e.f14692h = true;
                                                        } else if (obj9 == null || obj15 != null) {
                                                            if (obj9 != null) {
                                                                ((hd) this.b).f14683e.f14685a = charSequence2;
                                                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                                ((hd) this.b).f14683e.f14692h = true;
                                                            }
                                                            if (obj15 == null) {
                                                                fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                                                                if (obj9 != null) {
                                                                    ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                                                                } else {
                                                                    ((hd) this.b).f14683e.f14685a = fromHtml2;
                                                                }
                                                                ((hd) this.b).f14683e.f14692h = true;
                                                                ((hd) this.b).f14683e.f14686b = true;
                                                                ((hd) this.b).f14683e.f14687c = false;
                                                                ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                                                                ((hd) this.b).f14683e.f14688d = null;
                                                            }
                                                        } else if (obj10 != null) {
                                                            ((hd) this.b).f14683e.f14685a = ((hd) this.b).f14682d;
                                                            ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                                                            return;
                                                        } else if (obj11 != null) {
                                                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.provided_by_admin_warning);
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                            return;
                                                        } else if (a5) {
                                                            cb cbVar;
                                                            CharSequence fromHtml3;
                                                            if (document2.aK()) {
                                                                cbVar = document2.f14885a.f12115v.ac;
                                                            } else {
                                                                cbVar = null;
                                                            }
                                                            C1531a d2 = C1473m.f7980a.mo2223d();
                                                            Context context = this.t;
                                                            String str2 = cbVar.f12009d;
                                                            C2441n c2441n = new C2441n();
                                                            c2441n.f13174n = cbVar.f12010e;
                                                            c2441n.m13100a(str2);
                                                            co coVar = new co();
                                                            coVar.f12048a = c2441n;
                                                            cv cvVar = new cv();
                                                            cvVar.m12387a(str2);
                                                            cvVar.m12392b(str2);
                                                            cvVar.m12391b(3);
                                                            cvVar.m12386a(1);
                                                            cvVar.f12112s = coVar;
                                                            if (TextUtils.isEmpty(d2.m8958a(context, new Document(cvVar)))) {
                                                                fromHtml3 = Html.fromHtml(resources.getString(C7582R.string.comparable_app_linking_message, new Object[]{cbVar.f12007b, cbVar.f12008c}));
                                                            } else {
                                                                obj17 = Html.fromHtml(resources.getString(C7582R.string.comparable_app_linking_message_with_download_size, new Object[]{cbVar.f12007b, cbVar.f12008c, d2.m8958a(context, new Document(cvVar))}));
                                                            }
                                                            ((hd) this.b).f14683e.f14685a = fromHtml3;
                                                            ((hd) this.b).f14683e.f14692h = true;
                                                            ((hd) this.b).f14683e.f14688d = null;
                                                            ((hd) this.b).f14684f = new hc(this, cbVar);
                                                            return;
                                                        } else if (obj13 != null) {
                                                            document = (Document) this.f14666i.get(0);
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                            heVar2 = ((hd) this.b).f14683e;
                                                            d = document.f14885a.f12100g;
                                                            long c = an.f24038a.mo4322c(document.m14670y());
                                                            CharSequence spannableStringBuilder = new SpannableStringBuilder();
                                                            spannableStringBuilder.append(resources.getString(C7582R.string.dependency_warning_message, new Object[]{d, Long.valueOf(c)}));
                                                            spannableStringBuilder.append(" ");
                                                            StyleSpan styleSpan = new StyleSpan(1);
                                                            CharSequence spannableString = new SpannableString(resources.getString(C7582R.string.dependency_warning_view));
                                                            spannableString.setSpan(styleSpan, 0, spannableString.length(), 18);
                                                            spannableStringBuilder.append(spannableString);
                                                            heVar2.f14685a = spannableStringBuilder;
                                                            ((hd) this.b).f14683e.f14686b = false;
                                                            ((hd) this.b).f14684f = new hb(this, document);
                                                            return;
                                                        } else {
                                                            return;
                                                        }
                                                    }
                                                }
                                                fromHtml = null;
                                                if (dj.mo2294a(12639546)) {
                                                }
                                                hdVar = (hd) this.b;
                                                if (!a9) {
                                                }
                                                hdVar.f14681c = z;
                                                if (!((hd) this.b).f14681c) {
                                                    resources = this.t.getResources();
                                                    i5 = ((hd) this.b).f14679a.f14885a.f12099f;
                                                    ((hd) this.b).f14683e.f14686b = false;
                                                    ((hd) this.b).f14683e.f14687c = true;
                                                    ((hd) this.b).f14683e.f14692h = false;
                                                    if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                                        ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
                                                    } else {
                                                        ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
                                                    }
                                                    a7 = C1608h.m9243a(this.t, i5);
                                                    heVar = ((hd) this.b).f14683e;
                                                    if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                                        f = 0.15f;
                                                    } else {
                                                        f = 0.1f;
                                                    }
                                                    heVar.f14691g = C1607g.m9234a(a7, f);
                                                    ((hd) this.b).f14684f = null;
                                                    if (a9) {
                                                        ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                    } else if (obj == null) {
                                                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                                                        ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
                                                    } else if (obj3 == null) {
                                                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                    } else if (!al) {
                                                        ((hd) this.b).f14683e.f14685a = document2.am().toString();
                                                        ((hd) this.b).f14683e.f14686b = true;
                                                        i6 = 0;
                                                        for (i7 = 0; i7 < i; i7++) {
                                                            if (!lwVar.f13070d) {
                                                            }
                                                            i6 |= i2;
                                                        }
                                                        if (i6 == 0) {
                                                            heVar2 = ((hd) this.b).f14683e;
                                                            c2440m = document2.f14885a.f12115v;
                                                            length = c2440m.f13126g.length;
                                                            for (i2 = 0; i2 < length; i2++) {
                                                                if (c2440m.f13126g[i2].f13071e == null) {
                                                                    bdVar = c2440m.f13126g[i2].f13071e;
                                                                    break;
                                                                }
                                                            }
                                                            bdVar = null;
                                                            heVar2.f14689e = bdVar;
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                        }
                                                    } else if (obj17 == null) {
                                                        ((hd) this.b).f14683e.f14685a = document2.m14617F();
                                                        ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                                                        if (obj18 == null) {
                                                            ((hd) this.b).f14684f = new ha(this, aH);
                                                            this.f14664g = true;
                                                        }
                                                    } else if (TextUtils.isEmpty(fromHtml)) {
                                                        ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                    } else if (obj2 == null) {
                                                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                    } else if (obj4 == null) {
                                                        ((hd) this.b).f14683e.f14685a = charSequence;
                                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                    } else if (obj5 == null) {
                                                        heVar2 = ((hd) this.b).f14683e;
                                                        resources2 = C1473m.f7980a.f7981b.getResources();
                                                        switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                                                            case 1:
                                                                string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                                                                break;
                                                            case 3:
                                                                string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                                                                break;
                                                            case 4:
                                                                string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                                                                break;
                                                            default:
                                                                FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                                                                string = "";
                                                                break;
                                                        }
                                                        heVar2.f14685a = string;
                                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                    } else if (!bW) {
                                                        if (C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null) {
                                                        }
                                                        if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                                                            if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY()))) {
                                                            }
                                                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                                                        } else {
                                                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                                                        }
                                                        heVar2 = ((hd) this.b).f14683e;
                                                        if (((hd) this.b).f14683e.f14688d != null) {
                                                            drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                        } else {
                                                            drawable = ((hd) this.b).f14683e.f14688d;
                                                        }
                                                        heVar2.f14688d = drawable;
                                                    } else if (obj6 == null) {
                                                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                    } else if (obj7 == null) {
                                                        heVar2 = ((hd) this.b).f14683e;
                                                        d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                                                        resources3 = C1473m.f7980a.f7981b.getResources();
                                                        obj12 = -1;
                                                        switch (d.hashCode()) {
                                                            case -1407668872:
                                                                if (d.equals("disabled_permanently")) {
                                                                    obj12 = 2;
                                                                    break;
                                                                }
                                                                break;
                                                            case -390411177:
                                                                if (d.equals("disabled_until_updated")) {
                                                                    obj12 = 1;
                                                                    break;
                                                                }
                                                                break;
                                                            case 1894318991:
                                                                if (d.equals("disabled_by_parent")) {
                                                                    obj12 = null;
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                        switch (obj12) {
                                                            case null:
                                                                string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                                                                break;
                                                            case 1:
                                                                string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                                                                break;
                                                            case 2:
                                                                string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                                                                break;
                                                            default:
                                                                string = null;
                                                                break;
                                                        }
                                                        heVar2.f14685a = string;
                                                        ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
                                                    } else if (obj16 != null) {
                                                        if (obj9 == null) {
                                                        }
                                                        if (obj9 != null) {
                                                            ((hd) this.b).f14683e.f14685a = charSequence2;
                                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                            ((hd) this.b).f14683e.f14692h = true;
                                                        }
                                                        if (obj15 == null) {
                                                            fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                                                            if (obj9 != null) {
                                                                ((hd) this.b).f14683e.f14685a = fromHtml2;
                                                            } else {
                                                                ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                                                            }
                                                            ((hd) this.b).f14683e.f14692h = true;
                                                            ((hd) this.b).f14683e.f14686b = true;
                                                            ((hd) this.b).f14683e.f14687c = false;
                                                            ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                                                            ((hd) this.b).f14683e.f14688d = null;
                                                        }
                                                    } else {
                                                        ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                        ((hd) this.b).f14683e.f14692h = true;
                                                    }
                                                }
                                            }
                                        }
                                        obj15 = null;
                                        if (TextUtils.isEmpty(((hd) this.b).f14682d)) {
                                            obj10 = null;
                                        } else {
                                            obj10 = 1;
                                        }
                                        while (r17.hasNext()) {
                                            if (C1473m.f7980a.mo2041U().mo1197b(b5)) {
                                                obj11 = 1;
                                                break;
                                            }
                                        }
                                        obj11 = null;
                                        a5 = document2.aK();
                                        c1473m = C1473m.f7980a;
                                        if (!c1473m.dj().mo2294a(12643667)) {
                                            obj13 = null;
                                        } else if (this.f14666i == null) {
                                            a6 = new C1245i().m7247a(document2.cf(), document2.m14671z());
                                            a6.f7406a = b4.name;
                                            c1473m.cS().m7241a(a6.m7246a(), (C1242f) new gz(this, document2));
                                            obj13 = null;
                                        } else if (this.f14666i.isEmpty()) {
                                            obj13 = null;
                                        } else if (this.f14666i.size() != 1) {
                                            FinskyLog.m21669e("Only supports one dependency", new Object[0]);
                                            obj13 = null;
                                        } else {
                                            i4 = 1;
                                        }
                                        c2196e = this.D;
                                        dfeToc = this.v;
                                        if (C1473m.f7980a.mo2045Y().m11641a(document2) == null) {
                                            b3 = C1473m.f7980a.mo2045Y().m11653b(document2, dfeToc, c2196e);
                                            if (C1473m.f7980a.mo2045Y().m11643a(b3, b4) == null) {
                                                for (i3 = 0; i3 < b3.size(); i3++) {
                                                    if (C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)) != null) {
                                                        obj14 = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)).name}));
                                                        break;
                                                    }
                                                }
                                            }
                                            fromHtml = null;
                                        } else {
                                            fromHtml = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a(document2).name}));
                                        }
                                        if (dj.mo2294a(12639546)) {
                                        }
                                        hdVar = (hd) this.b;
                                        if (!a9) {
                                        }
                                        hdVar.f14681c = z;
                                        if (!((hd) this.b).f14681c) {
                                            resources = this.t.getResources();
                                            i5 = ((hd) this.b).f14679a.f14885a.f12099f;
                                            ((hd) this.b).f14683e.f14686b = false;
                                            ((hd) this.b).f14683e.f14687c = true;
                                            ((hd) this.b).f14683e.f14692h = false;
                                            if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                                ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
                                            } else {
                                                ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
                                            }
                                            a7 = C1608h.m9243a(this.t, i5);
                                            heVar = ((hd) this.b).f14683e;
                                            if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                                f = 0.1f;
                                            } else {
                                                f = 0.15f;
                                            }
                                            heVar.f14691g = C1607g.m9234a(a7, f);
                                            ((hd) this.b).f14684f = null;
                                            if (a9) {
                                                ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                            } else if (obj == null) {
                                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                                                ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
                                            } else if (obj3 == null) {
                                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                            } else if (!al) {
                                                ((hd) this.b).f14683e.f14685a = document2.am().toString();
                                                ((hd) this.b).f14683e.f14686b = true;
                                                i6 = 0;
                                                for (i7 = 0; i7 < i; i7++) {
                                                    if (lwVar.f13070d) {
                                                    }
                                                    i6 |= i2;
                                                }
                                                if (i6 == 0) {
                                                    heVar2 = ((hd) this.b).f14683e;
                                                    c2440m = document2.f14885a.f12115v;
                                                    length = c2440m.f13126g.length;
                                                    for (i2 = 0; i2 < length; i2++) {
                                                        if (c2440m.f13126g[i2].f13071e == null) {
                                                            bdVar = c2440m.f13126g[i2].f13071e;
                                                            break;
                                                        }
                                                    }
                                                    bdVar = null;
                                                    heVar2.f14689e = bdVar;
                                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                }
                                            } else if (obj17 == null) {
                                                ((hd) this.b).f14683e.f14685a = document2.m14617F();
                                                ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                                                if (obj18 == null) {
                                                    ((hd) this.b).f14684f = new ha(this, aH);
                                                    this.f14664g = true;
                                                }
                                            } else if (TextUtils.isEmpty(fromHtml)) {
                                                ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                            } else if (obj2 == null) {
                                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                            } else if (obj4 == null) {
                                                ((hd) this.b).f14683e.f14685a = charSequence;
                                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                            } else if (obj5 == null) {
                                                heVar2 = ((hd) this.b).f14683e;
                                                resources2 = C1473m.f7980a.f7981b.getResources();
                                                switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                                                    case 1:
                                                        string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                                                        break;
                                                    case 3:
                                                        string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                                                        break;
                                                    case 4:
                                                        string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                                                        break;
                                                    default:
                                                        FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                                                        string = "";
                                                        break;
                                                }
                                                heVar2.f14685a = string;
                                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                            } else if (!bW) {
                                                if (C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null) {
                                                }
                                                if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                                                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                                                } else {
                                                    if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY()))) {
                                                    }
                                                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                                                }
                                                heVar2 = ((hd) this.b).f14683e;
                                                if (((hd) this.b).f14683e.f14688d != null) {
                                                    drawable = ((hd) this.b).f14683e.f14688d;
                                                } else {
                                                    drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                }
                                                heVar2.f14688d = drawable;
                                            } else if (obj6 == null) {
                                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                            } else if (obj7 == null) {
                                                heVar2 = ((hd) this.b).f14683e;
                                                d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                                                resources3 = C1473m.f7980a.f7981b.getResources();
                                                obj12 = -1;
                                                switch (d.hashCode()) {
                                                    case -1407668872:
                                                        if (d.equals("disabled_permanently")) {
                                                            obj12 = 2;
                                                            break;
                                                        }
                                                        break;
                                                    case -390411177:
                                                        if (d.equals("disabled_until_updated")) {
                                                            obj12 = 1;
                                                            break;
                                                        }
                                                        break;
                                                    case 1894318991:
                                                        if (d.equals("disabled_by_parent")) {
                                                            obj12 = null;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                switch (obj12) {
                                                    case null:
                                                        string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                                                        break;
                                                    case 1:
                                                        string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                                                        break;
                                                    case 2:
                                                        string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                                                        break;
                                                    default:
                                                        string = null;
                                                        break;
                                                }
                                                heVar2.f14685a = string;
                                                ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
                                            } else if (obj16 != null) {
                                                ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                ((hd) this.b).f14683e.f14692h = true;
                                            } else {
                                                if (obj9 == null) {
                                                }
                                                if (obj9 != null) {
                                                    ((hd) this.b).f14683e.f14685a = charSequence2;
                                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                                    ((hd) this.b).f14683e.f14692h = true;
                                                }
                                                if (obj15 == null) {
                                                    fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                                                    if (obj9 != null) {
                                                        ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                                                    } else {
                                                        ((hd) this.b).f14683e.f14685a = fromHtml2;
                                                    }
                                                    ((hd) this.b).f14683e.f14692h = true;
                                                    ((hd) this.b).f14683e.f14686b = true;
                                                    ((hd) this.b).f14683e.f14687c = false;
                                                    ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                                                    ((hd) this.b).f14683e.f14688d = null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            obj6 = null;
                            if (document2.f14885a.f12098e == 1) {
                            }
                            document = ((hd) this.b).f14680b;
                            if (document == null) {
                                a4 = this.f14661d.m11788a(document, this.v, this.D.mo2811a(this.x.mo1620b()));
                                if (a4 == null) {
                                    obj8 = C1473m.f7980a.mo2247i().m13153a(document, a4, 3).f11910E;
                                } else {
                                    charSequence2 = null;
                                }
                            } else {
                                charSequence2 = null;
                            }
                            if (!TextUtils.isEmpty(charSequence2)) {
                            }
                            if (c3026a != null) {
                                a5 = C1473m.f7980a.dj().mo2294a(12631565);
                                if (document2.f14885a.f12098e == 1) {
                                }
                                if (document2.ae()) {
                                }
                                document = ((hd) this.b).f14679a;
                                if (document.f14885a.f12107n != null) {
                                    for (i2 = 0; i2 < i3; i2++) {
                                        if (blVar2 != null) {
                                        }
                                    }
                                }
                                obj12 = null;
                                if (obj12 == null) {
                                }
                                if (c3026a.f15820h) {
                                }
                                if (c3026a.f15827o) {
                                }
                                if (c3026a.f15828p == 0) {
                                }
                                obj15 = 1;
                                if (TextUtils.isEmpty(((hd) this.b).f14682d)) {
                                    obj10 = 1;
                                } else {
                                    obj10 = null;
                                }
                                while (r17.hasNext()) {
                                    if (C1473m.f7980a.mo2041U().mo1197b(b5)) {
                                        obj11 = 1;
                                        break;
                                    }
                                }
                                obj11 = null;
                                a5 = document2.aK();
                                c1473m = C1473m.f7980a;
                                if (!c1473m.dj().mo2294a(12643667)) {
                                    obj13 = null;
                                } else if (this.f14666i == null) {
                                    a6 = new C1245i().m7247a(document2.cf(), document2.m14671z());
                                    a6.f7406a = b4.name;
                                    c1473m.cS().m7241a(a6.m7246a(), (C1242f) new gz(this, document2));
                                    obj13 = null;
                                } else if (this.f14666i.isEmpty()) {
                                    obj13 = null;
                                } else if (this.f14666i.size() != 1) {
                                    i4 = 1;
                                } else {
                                    FinskyLog.m21669e("Only supports one dependency", new Object[0]);
                                    obj13 = null;
                                }
                                c2196e = this.D;
                                dfeToc = this.v;
                                if (C1473m.f7980a.mo2045Y().m11641a(document2) == null) {
                                    fromHtml = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a(document2).name}));
                                } else {
                                    b3 = C1473m.f7980a.mo2045Y().m11653b(document2, dfeToc, c2196e);
                                    if (C1473m.f7980a.mo2045Y().m11643a(b3, b4) == null) {
                                        for (i3 = 0; i3 < b3.size(); i3++) {
                                            if (C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)) != null) {
                                                obj14 = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)).name}));
                                                break;
                                            }
                                        }
                                    }
                                    fromHtml = null;
                                }
                                if (dj.mo2294a(12639546)) {
                                }
                                hdVar = (hd) this.b;
                                if (!a9) {
                                }
                                hdVar.f14681c = z;
                                if (!((hd) this.b).f14681c) {
                                    resources = this.t.getResources();
                                    i5 = ((hd) this.b).f14679a.f14885a.f12099f;
                                    ((hd) this.b).f14683e.f14686b = false;
                                    ((hd) this.b).f14683e.f14687c = true;
                                    ((hd) this.b).f14683e.f14692h = false;
                                    if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                        ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
                                    } else {
                                        ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
                                    }
                                    a7 = C1608h.m9243a(this.t, i5);
                                    heVar = ((hd) this.b).f14683e;
                                    if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                        f = 0.15f;
                                    } else {
                                        f = 0.1f;
                                    }
                                    heVar.f14691g = C1607g.m9234a(a7, f);
                                    ((hd) this.b).f14684f = null;
                                    if (a9) {
                                        ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    } else if (obj == null) {
                                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                                        ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
                                    } else if (obj3 == null) {
                                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    } else if (!al) {
                                        ((hd) this.b).f14683e.f14685a = document2.am().toString();
                                        ((hd) this.b).f14683e.f14686b = true;
                                        i6 = 0;
                                        for (i7 = 0; i7 < i; i7++) {
                                            if (lwVar.f13070d) {
                                            }
                                            i6 |= i2;
                                        }
                                        if (i6 == 0) {
                                            heVar2 = ((hd) this.b).f14683e;
                                            c2440m = document2.f14885a.f12115v;
                                            length = c2440m.f13126g.length;
                                            for (i2 = 0; i2 < length; i2++) {
                                                if (c2440m.f13126g[i2].f13071e == null) {
                                                    bdVar = c2440m.f13126g[i2].f13071e;
                                                    break;
                                                }
                                            }
                                            bdVar = null;
                                            heVar2.f14689e = bdVar;
                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                        }
                                    } else if (obj17 == null) {
                                        ((hd) this.b).f14683e.f14685a = document2.m14617F();
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                                        if (obj18 == null) {
                                            ((hd) this.b).f14684f = new ha(this, aH);
                                            this.f14664g = true;
                                        }
                                    } else if (TextUtils.isEmpty(fromHtml)) {
                                        ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    } else if (obj2 == null) {
                                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    } else if (obj4 == null) {
                                        ((hd) this.b).f14683e.f14685a = charSequence;
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    } else if (obj5 == null) {
                                        heVar2 = ((hd) this.b).f14683e;
                                        resources2 = C1473m.f7980a.f7981b.getResources();
                                        switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                                            case 1:
                                                string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                                                break;
                                            case 3:
                                                string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                                                break;
                                            case 4:
                                                string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                                                break;
                                            default:
                                                FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                                                string = "";
                                                break;
                                        }
                                        heVar2.f14685a = string;
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    } else if (!bW) {
                                        if (C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null) {
                                        }
                                        if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                                            if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY()))) {
                                            }
                                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                                        } else {
                                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                                        }
                                        heVar2 = ((hd) this.b).f14683e;
                                        if (((hd) this.b).f14683e.f14688d != null) {
                                            drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                        } else {
                                            drawable = ((hd) this.b).f14683e.f14688d;
                                        }
                                        heVar2.f14688d = drawable;
                                    } else if (obj6 == null) {
                                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    } else if (obj7 == null) {
                                        heVar2 = ((hd) this.b).f14683e;
                                        d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                                        resources3 = C1473m.f7980a.f7981b.getResources();
                                        obj12 = -1;
                                        switch (d.hashCode()) {
                                            case -1407668872:
                                                if (d.equals("disabled_permanently")) {
                                                    obj12 = 2;
                                                    break;
                                                }
                                                break;
                                            case -390411177:
                                                if (d.equals("disabled_until_updated")) {
                                                    obj12 = 1;
                                                    break;
                                                }
                                                break;
                                            case 1894318991:
                                                if (d.equals("disabled_by_parent")) {
                                                    obj12 = null;
                                                    break;
                                                }
                                                break;
                                        }
                                        switch (obj12) {
                                            case null:
                                                string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                                                break;
                                            case 1:
                                                string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                                                break;
                                            case 2:
                                                string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                                                break;
                                            default:
                                                string = null;
                                                break;
                                        }
                                        heVar2.f14685a = string;
                                        ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
                                    } else if (obj16 != null) {
                                        if (obj9 == null) {
                                        }
                                        if (obj9 != null) {
                                            ((hd) this.b).f14683e.f14685a = charSequence2;
                                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                            ((hd) this.b).f14683e.f14692h = true;
                                        }
                                        if (obj15 == null) {
                                            fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                                            if (obj9 != null) {
                                                ((hd) this.b).f14683e.f14685a = fromHtml2;
                                            } else {
                                                ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                                            }
                                            ((hd) this.b).f14683e.f14692h = true;
                                            ((hd) this.b).f14683e.f14686b = true;
                                            ((hd) this.b).f14683e.f14687c = false;
                                            ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                                            ((hd) this.b).f14683e.f14688d = null;
                                        }
                                    } else {
                                        ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                        ((hd) this.b).f14683e.f14692h = true;
                                    }
                                }
                            }
                            obj15 = null;
                            if (TextUtils.isEmpty(((hd) this.b).f14682d)) {
                                obj10 = null;
                            } else {
                                obj10 = 1;
                            }
                            while (r17.hasNext()) {
                                if (C1473m.f7980a.mo2041U().mo1197b(b5)) {
                                    obj11 = 1;
                                    break;
                                }
                            }
                            obj11 = null;
                            a5 = document2.aK();
                            c1473m = C1473m.f7980a;
                            if (!c1473m.dj().mo2294a(12643667)) {
                                obj13 = null;
                            } else if (this.f14666i == null) {
                                a6 = new C1245i().m7247a(document2.cf(), document2.m14671z());
                                a6.f7406a = b4.name;
                                c1473m.cS().m7241a(a6.m7246a(), (C1242f) new gz(this, document2));
                                obj13 = null;
                            } else if (this.f14666i.isEmpty()) {
                                obj13 = null;
                            } else if (this.f14666i.size() != 1) {
                                FinskyLog.m21669e("Only supports one dependency", new Object[0]);
                                obj13 = null;
                            } else {
                                i4 = 1;
                            }
                            c2196e = this.D;
                            dfeToc = this.v;
                            if (C1473m.f7980a.mo2045Y().m11641a(document2) == null) {
                                b3 = C1473m.f7980a.mo2045Y().m11653b(document2, dfeToc, c2196e);
                                if (C1473m.f7980a.mo2045Y().m11643a(b3, b4) == null) {
                                    for (i3 = 0; i3 < b3.size(); i3++) {
                                        if (C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)) != null) {
                                            obj14 = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)).name}));
                                            break;
                                        }
                                    }
                                }
                                fromHtml = null;
                            } else {
                                fromHtml = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a(document2).name}));
                            }
                            if (dj.mo2294a(12639546)) {
                            }
                            hdVar = (hd) this.b;
                            if (!a9) {
                            }
                            hdVar.f14681c = z;
                            if (!((hd) this.b).f14681c) {
                                resources = this.t.getResources();
                                i5 = ((hd) this.b).f14679a.f14885a.f12099f;
                                ((hd) this.b).f14683e.f14686b = false;
                                ((hd) this.b).f14683e.f14687c = true;
                                ((hd) this.b).f14683e.f14692h = false;
                                if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                    ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
                                } else {
                                    ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
                                }
                                a7 = C1608h.m9243a(this.t, i5);
                                heVar = ((hd) this.b).f14683e;
                                if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                    f = 0.1f;
                                } else {
                                    f = 0.15f;
                                }
                                heVar.f14691g = C1607g.m9234a(a7, f);
                                ((hd) this.b).f14684f = null;
                                if (a9) {
                                    ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                } else if (obj == null) {
                                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                                    ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
                                } else if (obj3 == null) {
                                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                } else if (!al) {
                                    ((hd) this.b).f14683e.f14685a = document2.am().toString();
                                    ((hd) this.b).f14683e.f14686b = true;
                                    i6 = 0;
                                    for (i7 = 0; i7 < i; i7++) {
                                        if (lwVar.f13070d) {
                                        }
                                        i6 |= i2;
                                    }
                                    if (i6 == 0) {
                                        heVar2 = ((hd) this.b).f14683e;
                                        c2440m = document2.f14885a.f12115v;
                                        length = c2440m.f13126g.length;
                                        for (i2 = 0; i2 < length; i2++) {
                                            if (c2440m.f13126g[i2].f13071e == null) {
                                                bdVar = c2440m.f13126g[i2].f13071e;
                                                break;
                                            }
                                        }
                                        bdVar = null;
                                        heVar2.f14689e = bdVar;
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    }
                                } else if (obj17 == null) {
                                    ((hd) this.b).f14683e.f14685a = document2.m14617F();
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                                    if (obj18 == null) {
                                        ((hd) this.b).f14684f = new ha(this, aH);
                                        this.f14664g = true;
                                    }
                                } else if (TextUtils.isEmpty(fromHtml)) {
                                    ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                } else if (obj2 == null) {
                                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                } else if (obj4 == null) {
                                    ((hd) this.b).f14683e.f14685a = charSequence;
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                } else if (obj5 == null) {
                                    heVar2 = ((hd) this.b).f14683e;
                                    resources2 = C1473m.f7980a.f7981b.getResources();
                                    switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                                        case 1:
                                            string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                                            break;
                                        case 3:
                                            string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                                            break;
                                        case 4:
                                            string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                                            break;
                                        default:
                                            FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                                            string = "";
                                            break;
                                    }
                                    heVar2.f14685a = string;
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                } else if (!bW) {
                                    if (C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null) {
                                    }
                                    if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                                    } else {
                                        if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY()))) {
                                        }
                                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                                    }
                                    heVar2 = ((hd) this.b).f14683e;
                                    if (((hd) this.b).f14683e.f14688d != null) {
                                        drawable = ((hd) this.b).f14683e.f14688d;
                                    } else {
                                        drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    }
                                    heVar2.f14688d = drawable;
                                } else if (obj6 == null) {
                                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                } else if (obj7 == null) {
                                    heVar2 = ((hd) this.b).f14683e;
                                    d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                                    resources3 = C1473m.f7980a.f7981b.getResources();
                                    obj12 = -1;
                                    switch (d.hashCode()) {
                                        case -1407668872:
                                            if (d.equals("disabled_permanently")) {
                                                obj12 = 2;
                                                break;
                                            }
                                            break;
                                        case -390411177:
                                            if (d.equals("disabled_until_updated")) {
                                                obj12 = 1;
                                                break;
                                            }
                                            break;
                                        case 1894318991:
                                            if (d.equals("disabled_by_parent")) {
                                                obj12 = null;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (obj12) {
                                        case null:
                                            string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                                            break;
                                        case 1:
                                            string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                                            break;
                                        case 2:
                                            string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                                            break;
                                        default:
                                            string = null;
                                            break;
                                    }
                                    heVar2.f14685a = string;
                                    ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
                                } else if (obj16 != null) {
                                    ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    ((hd) this.b).f14683e.f14692h = true;
                                } else {
                                    if (obj9 == null) {
                                    }
                                    if (obj9 != null) {
                                        ((hd) this.b).f14683e.f14685a = charSequence2;
                                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                        ((hd) this.b).f14683e.f14692h = true;
                                    }
                                    if (obj15 == null) {
                                        fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                                        if (obj9 != null) {
                                            ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                                        } else {
                                            ((hd) this.b).f14683e.f14685a = fromHtml2;
                                        }
                                        ((hd) this.b).f14683e.f14692h = true;
                                        ((hd) this.b).f14683e.f14686b = true;
                                        ((hd) this.b).f14683e.f14687c = false;
                                        ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                                        ((hd) this.b).f14683e.f14688d = null;
                                    }
                                }
                            }
                        }
                    }
                    obj5 = null;
                    bW = document2.bW();
                    a2 = this.f14662e.m14983a(document2, C1473m.f7980a.cY());
                    a3 = C1473m.f7980a.mo2169c().mo2657a(document2.m14625N().f13171k);
                    obj6 = 1;
                    if (document2.f14885a.f12098e == 1) {
                    }
                    document = ((hd) this.b).f14680b;
                    if (document == null) {
                        charSequence2 = null;
                    } else {
                        a4 = this.f14661d.m11788a(document, this.v, this.D.mo2811a(this.x.mo1620b()));
                        if (a4 == null) {
                            charSequence2 = null;
                        } else {
                            obj8 = C1473m.f7980a.mo2247i().m13153a(document, a4, 3).f11910E;
                        }
                    }
                    if (TextUtils.isEmpty(charSequence2)) {
                    }
                    if (c3026a != null) {
                        a5 = C1473m.f7980a.dj().mo2294a(12631565);
                        if (document2.f14885a.f12098e == 1) {
                        }
                        if (document2.ae()) {
                        }
                        document = ((hd) this.b).f14679a;
                        if (document.f14885a.f12107n != null) {
                            for (i2 = 0; i2 < i3; i2++) {
                                if (blVar2 != null) {
                                }
                            }
                        }
                        obj12 = null;
                        if (obj12 == null) {
                        }
                        if (c3026a.f15820h) {
                        }
                        if (c3026a.f15827o) {
                        }
                        if (c3026a.f15828p == 0) {
                        }
                        obj15 = 1;
                        if (TextUtils.isEmpty(((hd) this.b).f14682d)) {
                            obj10 = 1;
                        } else {
                            obj10 = null;
                        }
                        while (r17.hasNext()) {
                            if (C1473m.f7980a.mo2041U().mo1197b(b5)) {
                                obj11 = 1;
                                break;
                            }
                        }
                        obj11 = null;
                        a5 = document2.aK();
                        c1473m = C1473m.f7980a;
                        if (!c1473m.dj().mo2294a(12643667)) {
                            obj13 = null;
                        } else if (this.f14666i == null) {
                            a6 = new C1245i().m7247a(document2.cf(), document2.m14671z());
                            a6.f7406a = b4.name;
                            c1473m.cS().m7241a(a6.m7246a(), (C1242f) new gz(this, document2));
                            obj13 = null;
                        } else if (this.f14666i.isEmpty()) {
                            obj13 = null;
                        } else if (this.f14666i.size() != 1) {
                            i4 = 1;
                        } else {
                            FinskyLog.m21669e("Only supports one dependency", new Object[0]);
                            obj13 = null;
                        }
                        c2196e = this.D;
                        dfeToc = this.v;
                        if (C1473m.f7980a.mo2045Y().m11641a(document2) == null) {
                            fromHtml = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a(document2).name}));
                        } else {
                            b3 = C1473m.f7980a.mo2045Y().m11653b(document2, dfeToc, c2196e);
                            if (C1473m.f7980a.mo2045Y().m11643a(b3, b4) == null) {
                                for (i3 = 0; i3 < b3.size(); i3++) {
                                    if (C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)) != null) {
                                        obj14 = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)).name}));
                                        break;
                                    }
                                }
                            }
                            fromHtml = null;
                        }
                        if (dj.mo2294a(12639546)) {
                        }
                        hdVar = (hd) this.b;
                        if (!a9) {
                        }
                        hdVar.f14681c = z;
                        if (!((hd) this.b).f14681c) {
                            resources = this.t.getResources();
                            i5 = ((hd) this.b).f14679a.f14885a.f12099f;
                            ((hd) this.b).f14683e.f14686b = false;
                            ((hd) this.b).f14683e.f14687c = true;
                            ((hd) this.b).f14683e.f14692h = false;
                            if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
                            } else {
                                ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
                            }
                            a7 = C1608h.m9243a(this.t, i5);
                            heVar = ((hd) this.b).f14683e;
                            if (C1473m.f7980a.dj().mo2294a(12626284)) {
                                f = 0.15f;
                            } else {
                                f = 0.1f;
                            }
                            heVar.f14691g = C1607g.m9234a(a7, f);
                            ((hd) this.b).f14684f = null;
                            if (a9) {
                                ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            } else if (obj == null) {
                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                                ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
                            } else if (obj3 == null) {
                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            } else if (!al) {
                                ((hd) this.b).f14683e.f14685a = document2.am().toString();
                                ((hd) this.b).f14683e.f14686b = true;
                                i6 = 0;
                                for (i7 = 0; i7 < i; i7++) {
                                    if (lwVar.f13070d) {
                                    }
                                    i6 |= i2;
                                }
                                if (i6 == 0) {
                                    heVar2 = ((hd) this.b).f14683e;
                                    c2440m = document2.f14885a.f12115v;
                                    length = c2440m.f13126g.length;
                                    for (i2 = 0; i2 < length; i2++) {
                                        if (c2440m.f13126g[i2].f13071e == null) {
                                            bdVar = c2440m.f13126g[i2].f13071e;
                                            break;
                                        }
                                    }
                                    bdVar = null;
                                    heVar2.f14689e = bdVar;
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                }
                            } else if (obj17 == null) {
                                ((hd) this.b).f14683e.f14685a = document2.m14617F();
                                ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                                if (obj18 == null) {
                                    ((hd) this.b).f14684f = new ha(this, aH);
                                    this.f14664g = true;
                                }
                            } else if (TextUtils.isEmpty(fromHtml)) {
                                ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            } else if (obj2 == null) {
                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            } else if (obj4 == null) {
                                ((hd) this.b).f14683e.f14685a = charSequence;
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            } else if (obj5 == null) {
                                heVar2 = ((hd) this.b).f14683e;
                                resources2 = C1473m.f7980a.f7981b.getResources();
                                switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                                    case 1:
                                        string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                                        break;
                                    case 3:
                                        string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                                        break;
                                    case 4:
                                        string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                                        break;
                                    default:
                                        FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                                        string = "";
                                        break;
                                }
                                heVar2.f14685a = string;
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            } else if (!bW) {
                                if (C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null) {
                                }
                                if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                                    if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY()))) {
                                    }
                                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                                } else {
                                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                                }
                                heVar2 = ((hd) this.b).f14683e;
                                if (((hd) this.b).f14683e.f14688d != null) {
                                    drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                } else {
                                    drawable = ((hd) this.b).f14683e.f14688d;
                                }
                                heVar2.f14688d = drawable;
                            } else if (obj6 == null) {
                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            } else if (obj7 == null) {
                                heVar2 = ((hd) this.b).f14683e;
                                d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                                resources3 = C1473m.f7980a.f7981b.getResources();
                                obj12 = -1;
                                switch (d.hashCode()) {
                                    case -1407668872:
                                        if (d.equals("disabled_permanently")) {
                                            obj12 = 2;
                                            break;
                                        }
                                        break;
                                    case -390411177:
                                        if (d.equals("disabled_until_updated")) {
                                            obj12 = 1;
                                            break;
                                        }
                                        break;
                                    case 1894318991:
                                        if (d.equals("disabled_by_parent")) {
                                            obj12 = null;
                                            break;
                                        }
                                        break;
                                }
                                switch (obj12) {
                                    case null:
                                        string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                                        break;
                                    case 1:
                                        string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                                        break;
                                    case 2:
                                        string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                                        break;
                                    default:
                                        string = null;
                                        break;
                                }
                                heVar2.f14685a = string;
                                ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
                            } else if (obj16 != null) {
                                if (obj9 == null) {
                                }
                                if (obj9 != null) {
                                    ((hd) this.b).f14683e.f14685a = charSequence2;
                                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                    ((hd) this.b).f14683e.f14692h = true;
                                }
                                if (obj15 == null) {
                                    fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                                    if (obj9 != null) {
                                        ((hd) this.b).f14683e.f14685a = fromHtml2;
                                    } else {
                                        ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                                    }
                                    ((hd) this.b).f14683e.f14692h = true;
                                    ((hd) this.b).f14683e.f14686b = true;
                                    ((hd) this.b).f14683e.f14687c = false;
                                    ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                                    ((hd) this.b).f14683e.f14688d = null;
                                }
                            } else {
                                ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                ((hd) this.b).f14683e.f14692h = true;
                            }
                        }
                    }
                    obj15 = null;
                    if (TextUtils.isEmpty(((hd) this.b).f14682d)) {
                        obj10 = null;
                    } else {
                        obj10 = 1;
                    }
                    while (r17.hasNext()) {
                        if (C1473m.f7980a.mo2041U().mo1197b(b5)) {
                            obj11 = 1;
                            break;
                        }
                    }
                    obj11 = null;
                    a5 = document2.aK();
                    c1473m = C1473m.f7980a;
                    if (!c1473m.dj().mo2294a(12643667)) {
                        obj13 = null;
                    } else if (this.f14666i == null) {
                        a6 = new C1245i().m7247a(document2.cf(), document2.m14671z());
                        a6.f7406a = b4.name;
                        c1473m.cS().m7241a(a6.m7246a(), (C1242f) new gz(this, document2));
                        obj13 = null;
                    } else if (this.f14666i.isEmpty()) {
                        obj13 = null;
                    } else if (this.f14666i.size() != 1) {
                        FinskyLog.m21669e("Only supports one dependency", new Object[0]);
                        obj13 = null;
                    } else {
                        i4 = 1;
                    }
                    c2196e = this.D;
                    dfeToc = this.v;
                    if (C1473m.f7980a.mo2045Y().m11641a(document2) == null) {
                        b3 = C1473m.f7980a.mo2045Y().m11653b(document2, dfeToc, c2196e);
                        if (C1473m.f7980a.mo2045Y().m11643a(b3, b4) == null) {
                            for (i3 = 0; i3 < b3.size(); i3++) {
                                if (C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)) != null) {
                                    obj14 = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)).name}));
                                    break;
                                }
                            }
                        }
                        fromHtml = null;
                    } else {
                        fromHtml = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a(document2).name}));
                    }
                    if (dj.mo2294a(12639546)) {
                    }
                    hdVar = (hd) this.b;
                    if (!a9) {
                    }
                    hdVar.f14681c = z;
                    if (!((hd) this.b).f14681c) {
                        resources = this.t.getResources();
                        i5 = ((hd) this.b).f14679a.f14885a.f12099f;
                        ((hd) this.b).f14683e.f14686b = false;
                        ((hd) this.b).f14683e.f14687c = true;
                        ((hd) this.b).f14683e.f14692h = false;
                        if (C1473m.f7980a.dj().mo2294a(12626284)) {
                            ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
                        } else {
                            ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
                        }
                        a7 = C1608h.m9243a(this.t, i5);
                        heVar = ((hd) this.b).f14683e;
                        if (C1473m.f7980a.dj().mo2294a(12626284)) {
                            f = 0.1f;
                        } else {
                            f = 0.15f;
                        }
                        heVar.f14691g = C1607g.m9234a(a7, f);
                        ((hd) this.b).f14684f = null;
                        if (a9) {
                            ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (obj == null) {
                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                            ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
                        } else if (obj3 == null) {
                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (!al) {
                            ((hd) this.b).f14683e.f14685a = document2.am().toString();
                            ((hd) this.b).f14683e.f14686b = true;
                            i6 = 0;
                            for (i7 = 0; i7 < i; i7++) {
                                if (lwVar.f13070d) {
                                }
                                i6 |= i2;
                            }
                            if (i6 == 0) {
                                heVar2 = ((hd) this.b).f14683e;
                                c2440m = document2.f14885a.f12115v;
                                length = c2440m.f13126g.length;
                                for (i2 = 0; i2 < length; i2++) {
                                    if (c2440m.f13126g[i2].f13071e == null) {
                                        bdVar = c2440m.f13126g[i2].f13071e;
                                        break;
                                    }
                                }
                                bdVar = null;
                                heVar2.f14689e = bdVar;
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            }
                        } else if (obj17 == null) {
                            ((hd) this.b).f14683e.f14685a = document2.m14617F();
                            ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                            if (obj18 == null) {
                                ((hd) this.b).f14684f = new ha(this, aH);
                                this.f14664g = true;
                            }
                        } else if (TextUtils.isEmpty(fromHtml)) {
                            ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (obj2 == null) {
                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (obj4 == null) {
                            ((hd) this.b).f14683e.f14685a = charSequence;
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (obj5 == null) {
                            heVar2 = ((hd) this.b).f14683e;
                            resources2 = C1473m.f7980a.f7981b.getResources();
                            switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                                case 1:
                                    string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                                    break;
                                case 3:
                                    string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                                    break;
                                case 4:
                                    string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                                    break;
                                default:
                                    FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                                    string = "";
                                    break;
                            }
                            heVar2.f14685a = string;
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (!bW) {
                            if (C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null) {
                            }
                            if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                            } else {
                                if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY()))) {
                                }
                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                            }
                            heVar2 = ((hd) this.b).f14683e;
                            if (((hd) this.b).f14683e.f14688d != null) {
                                drawable = ((hd) this.b).f14683e.f14688d;
                            } else {
                                drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            }
                            heVar2.f14688d = drawable;
                        } else if (obj6 == null) {
                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (obj7 == null) {
                            heVar2 = ((hd) this.b).f14683e;
                            d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                            resources3 = C1473m.f7980a.f7981b.getResources();
                            obj12 = -1;
                            switch (d.hashCode()) {
                                case -1407668872:
                                    if (d.equals("disabled_permanently")) {
                                        obj12 = 2;
                                        break;
                                    }
                                    break;
                                case -390411177:
                                    if (d.equals("disabled_until_updated")) {
                                        obj12 = 1;
                                        break;
                                    }
                                    break;
                                case 1894318991:
                                    if (d.equals("disabled_by_parent")) {
                                        obj12 = null;
                                        break;
                                    }
                                    break;
                            }
                            switch (obj12) {
                                case null:
                                    string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                                    break;
                                case 1:
                                    string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                                    break;
                                case 2:
                                    string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                                    break;
                                default:
                                    string = null;
                                    break;
                            }
                            heVar2.f14685a = string;
                            ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
                        } else if (obj16 != null) {
                            ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            ((hd) this.b).f14683e.f14692h = true;
                        } else {
                            if (obj9 == null) {
                            }
                            if (obj9 != null) {
                                ((hd) this.b).f14683e.f14685a = charSequence2;
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                ((hd) this.b).f14683e.f14692h = true;
                            }
                            if (obj15 == null) {
                                fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                                if (obj9 != null) {
                                    ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                                } else {
                                    ((hd) this.b).f14683e.f14685a = fromHtml2;
                                }
                                ((hd) this.b).f14683e.f14692h = true;
                                ((hd) this.b).f14683e.f14686b = true;
                                ((hd) this.b).f14683e.f14687c = false;
                                ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                                ((hd) this.b).f14683e.f14688d = null;
                            }
                        }
                    }
                }
            }
        }
        obj = null;
        if (C1473m.f7980a.mo2045Y().m11647a(document2, (C2196e) a8)) {
        }
        if (document2.m14625N() == null) {
        }
        b = this.w.mo1620b();
        b2 = this.x.mo1620b();
        if (document2 != null) {
        }
        charSequence = null;
        if (TextUtils.isEmpty(charSequence)) {
        }
        if (document3 != null) {
            a = this.f14662e.m14983a(document3, C1473m.f7980a.cY());
            if (document3.bS()) {
            }
            if (obj5 != null) {
                obj5 = 1;
                bW = document2.bW();
                a2 = this.f14662e.m14983a(document2, C1473m.f7980a.cY());
                a3 = C1473m.f7980a.mo2169c().mo2657a(document2.m14625N().f13171k);
                obj6 = 1;
                if (document2.f14885a.f12098e == 1) {
                }
                document = ((hd) this.b).f14680b;
                if (document == null) {
                    a4 = this.f14661d.m11788a(document, this.v, this.D.mo2811a(this.x.mo1620b()));
                    if (a4 == null) {
                        obj8 = C1473m.f7980a.mo2247i().m13153a(document, a4, 3).f11910E;
                    } else {
                        charSequence2 = null;
                    }
                } else {
                    charSequence2 = null;
                }
                if (TextUtils.isEmpty(charSequence2)) {
                }
                if (c3026a != null) {
                    a5 = C1473m.f7980a.dj().mo2294a(12631565);
                    if (document2.f14885a.f12098e == 1) {
                    }
                    if (document2.ae()) {
                    }
                    document = ((hd) this.b).f14679a;
                    if (document.f14885a.f12107n != null) {
                        for (i2 = 0; i2 < i3; i2++) {
                            if (blVar2 != null) {
                            }
                        }
                    }
                    obj12 = null;
                    if (obj12 == null) {
                    }
                    if (c3026a.f15820h) {
                    }
                    if (c3026a.f15827o) {
                    }
                    if (c3026a.f15828p == 0) {
                    }
                    obj15 = 1;
                    if (TextUtils.isEmpty(((hd) this.b).f14682d)) {
                        obj10 = 1;
                    } else {
                        obj10 = null;
                    }
                    while (r17.hasNext()) {
                        if (C1473m.f7980a.mo2041U().mo1197b(b5)) {
                            obj11 = 1;
                            break;
                        }
                    }
                    obj11 = null;
                    a5 = document2.aK();
                    c1473m = C1473m.f7980a;
                    if (!c1473m.dj().mo2294a(12643667)) {
                        obj13 = null;
                    } else if (this.f14666i == null) {
                        a6 = new C1245i().m7247a(document2.cf(), document2.m14671z());
                        a6.f7406a = b4.name;
                        c1473m.cS().m7241a(a6.m7246a(), (C1242f) new gz(this, document2));
                        obj13 = null;
                    } else if (this.f14666i.isEmpty()) {
                        obj13 = null;
                    } else if (this.f14666i.size() != 1) {
                        i4 = 1;
                    } else {
                        FinskyLog.m21669e("Only supports one dependency", new Object[0]);
                        obj13 = null;
                    }
                    c2196e = this.D;
                    dfeToc = this.v;
                    if (C1473m.f7980a.mo2045Y().m11641a(document2) == null) {
                        fromHtml = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a(document2).name}));
                    } else {
                        b3 = C1473m.f7980a.mo2045Y().m11653b(document2, dfeToc, c2196e);
                        if (C1473m.f7980a.mo2045Y().m11643a(b3, b4) == null) {
                            for (i3 = 0; i3 < b3.size(); i3++) {
                                if (C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)) != null) {
                                    obj14 = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)).name}));
                                    break;
                                }
                            }
                        }
                        fromHtml = null;
                    }
                    if (dj.mo2294a(12639546)) {
                    }
                    hdVar = (hd) this.b;
                    if (!a9) {
                    }
                    hdVar.f14681c = z;
                    if (!((hd) this.b).f14681c) {
                        resources = this.t.getResources();
                        i5 = ((hd) this.b).f14679a.f14885a.f12099f;
                        ((hd) this.b).f14683e.f14686b = false;
                        ((hd) this.b).f14683e.f14687c = true;
                        ((hd) this.b).f14683e.f14692h = false;
                        if (C1473m.f7980a.dj().mo2294a(12626284)) {
                            ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
                        } else {
                            ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
                        }
                        a7 = C1608h.m9243a(this.t, i5);
                        heVar = ((hd) this.b).f14683e;
                        if (C1473m.f7980a.dj().mo2294a(12626284)) {
                            f = 0.15f;
                        } else {
                            f = 0.1f;
                        }
                        heVar.f14691g = C1607g.m9234a(a7, f);
                        ((hd) this.b).f14684f = null;
                        if (a9) {
                            ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (obj == null) {
                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                            ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
                        } else if (obj3 == null) {
                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (!al) {
                            ((hd) this.b).f14683e.f14685a = document2.am().toString();
                            ((hd) this.b).f14683e.f14686b = true;
                            i6 = 0;
                            for (i7 = 0; i7 < i; i7++) {
                                if (lwVar.f13070d) {
                                }
                                i6 |= i2;
                            }
                            if (i6 == 0) {
                                heVar2 = ((hd) this.b).f14683e;
                                c2440m = document2.f14885a.f12115v;
                                length = c2440m.f13126g.length;
                                for (i2 = 0; i2 < length; i2++) {
                                    if (c2440m.f13126g[i2].f13071e == null) {
                                        bdVar = c2440m.f13126g[i2].f13071e;
                                        break;
                                    }
                                }
                                bdVar = null;
                                heVar2.f14689e = bdVar;
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            }
                        } else if (obj17 == null) {
                            ((hd) this.b).f14683e.f14685a = document2.m14617F();
                            ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                            if (obj18 == null) {
                                ((hd) this.b).f14684f = new ha(this, aH);
                                this.f14664g = true;
                            }
                        } else if (TextUtils.isEmpty(fromHtml)) {
                            ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (obj2 == null) {
                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (obj4 == null) {
                            ((hd) this.b).f14683e.f14685a = charSequence;
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (obj5 == null) {
                            heVar2 = ((hd) this.b).f14683e;
                            resources2 = C1473m.f7980a.f7981b.getResources();
                            switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                                case 1:
                                    string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                                    break;
                                case 3:
                                    string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                                    break;
                                case 4:
                                    string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                                    break;
                                default:
                                    FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                                    string = "";
                                    break;
                            }
                            heVar2.f14685a = string;
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (!bW) {
                            if (C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null) {
                            }
                            if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                                if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY()))) {
                                }
                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                            } else {
                                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                            }
                            heVar2 = ((hd) this.b).f14683e;
                            if (((hd) this.b).f14683e.f14688d != null) {
                                drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            } else {
                                drawable = ((hd) this.b).f14683e.f14688d;
                            }
                            heVar2.f14688d = drawable;
                        } else if (obj6 == null) {
                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        } else if (obj7 == null) {
                            heVar2 = ((hd) this.b).f14683e;
                            d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                            resources3 = C1473m.f7980a.f7981b.getResources();
                            obj12 = -1;
                            switch (d.hashCode()) {
                                case -1407668872:
                                    if (d.equals("disabled_permanently")) {
                                        obj12 = 2;
                                        break;
                                    }
                                    break;
                                case -390411177:
                                    if (d.equals("disabled_until_updated")) {
                                        obj12 = 1;
                                        break;
                                    }
                                    break;
                                case 1894318991:
                                    if (d.equals("disabled_by_parent")) {
                                        obj12 = null;
                                        break;
                                    }
                                    break;
                            }
                            switch (obj12) {
                                case null:
                                    string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                                    break;
                                case 1:
                                    string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                                    break;
                                case 2:
                                    string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                                    break;
                                default:
                                    string = null;
                                    break;
                            }
                            heVar2.f14685a = string;
                            ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
                        } else if (obj16 != null) {
                            if (obj9 == null) {
                            }
                            if (obj9 != null) {
                                ((hd) this.b).f14683e.f14685a = charSequence2;
                                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                                ((hd) this.b).f14683e.f14692h = true;
                            }
                            if (obj15 == null) {
                                fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                                if (obj9 != null) {
                                    ((hd) this.b).f14683e.f14685a = fromHtml2;
                                } else {
                                    ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                                }
                                ((hd) this.b).f14683e.f14692h = true;
                                ((hd) this.b).f14683e.f14686b = true;
                                ((hd) this.b).f14683e.f14687c = false;
                                ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                                ((hd) this.b).f14683e.f14688d = null;
                            }
                        } else {
                            ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            ((hd) this.b).f14683e.f14692h = true;
                        }
                    }
                }
                obj15 = null;
                if (TextUtils.isEmpty(((hd) this.b).f14682d)) {
                    obj10 = null;
                } else {
                    obj10 = 1;
                }
                while (r17.hasNext()) {
                    if (C1473m.f7980a.mo2041U().mo1197b(b5)) {
                        obj11 = 1;
                        break;
                    }
                }
                obj11 = null;
                a5 = document2.aK();
                c1473m = C1473m.f7980a;
                if (!c1473m.dj().mo2294a(12643667)) {
                    obj13 = null;
                } else if (this.f14666i == null) {
                    a6 = new C1245i().m7247a(document2.cf(), document2.m14671z());
                    a6.f7406a = b4.name;
                    c1473m.cS().m7241a(a6.m7246a(), (C1242f) new gz(this, document2));
                    obj13 = null;
                } else if (this.f14666i.isEmpty()) {
                    obj13 = null;
                } else if (this.f14666i.size() != 1) {
                    FinskyLog.m21669e("Only supports one dependency", new Object[0]);
                    obj13 = null;
                } else {
                    i4 = 1;
                }
                c2196e = this.D;
                dfeToc = this.v;
                if (C1473m.f7980a.mo2045Y().m11641a(document2) == null) {
                    b3 = C1473m.f7980a.mo2045Y().m11653b(document2, dfeToc, c2196e);
                    if (C1473m.f7980a.mo2045Y().m11643a(b3, b4) == null) {
                        for (i3 = 0; i3 < b3.size(); i3++) {
                            if (C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)) != null) {
                                obj14 = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)).name}));
                                break;
                            }
                        }
                    }
                    fromHtml = null;
                } else {
                    fromHtml = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a(document2).name}));
                }
                if (dj.mo2294a(12639546)) {
                }
                hdVar = (hd) this.b;
                if (!a9) {
                }
                hdVar.f14681c = z;
                if (!((hd) this.b).f14681c) {
                    resources = this.t.getResources();
                    i5 = ((hd) this.b).f14679a.f14885a.f12099f;
                    ((hd) this.b).f14683e.f14686b = false;
                    ((hd) this.b).f14683e.f14687c = true;
                    ((hd) this.b).f14683e.f14692h = false;
                    if (C1473m.f7980a.dj().mo2294a(12626284)) {
                        ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
                    } else {
                        ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
                    }
                    a7 = C1608h.m9243a(this.t, i5);
                    heVar = ((hd) this.b).f14683e;
                    if (C1473m.f7980a.dj().mo2294a(12626284)) {
                        f = 0.1f;
                    } else {
                        f = 0.15f;
                    }
                    heVar.f14691g = C1607g.m9234a(a7, f);
                    ((hd) this.b).f14684f = null;
                    if (a9) {
                        ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    } else if (obj == null) {
                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                        ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
                    } else if (obj3 == null) {
                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    } else if (!al) {
                        ((hd) this.b).f14683e.f14685a = document2.am().toString();
                        ((hd) this.b).f14683e.f14686b = true;
                        i6 = 0;
                        for (i7 = 0; i7 < i; i7++) {
                            if (lwVar.f13070d) {
                            }
                            i6 |= i2;
                        }
                        if (i6 == 0) {
                            heVar2 = ((hd) this.b).f14683e;
                            c2440m = document2.f14885a.f12115v;
                            length = c2440m.f13126g.length;
                            for (i2 = 0; i2 < length; i2++) {
                                if (c2440m.f13126g[i2].f13071e == null) {
                                    bdVar = c2440m.f13126g[i2].f13071e;
                                    break;
                                }
                            }
                            bdVar = null;
                            heVar2.f14689e = bdVar;
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        }
                    } else if (obj17 == null) {
                        ((hd) this.b).f14683e.f14685a = document2.m14617F();
                        ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                        if (obj18 == null) {
                            ((hd) this.b).f14684f = new ha(this, aH);
                            this.f14664g = true;
                        }
                    } else if (TextUtils.isEmpty(fromHtml)) {
                        ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    } else if (obj2 == null) {
                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    } else if (obj4 == null) {
                        ((hd) this.b).f14683e.f14685a = charSequence;
                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    } else if (obj5 == null) {
                        heVar2 = ((hd) this.b).f14683e;
                        resources2 = C1473m.f7980a.f7981b.getResources();
                        switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                            case 1:
                                string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                                break;
                            case 3:
                                string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                                break;
                            case 4:
                                string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                                break;
                            default:
                                FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                                string = "";
                                break;
                        }
                        heVar2.f14685a = string;
                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    } else if (!bW) {
                        if (C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null) {
                        }
                        if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                        } else {
                            if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY()))) {
                            }
                            ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                        }
                        heVar2 = ((hd) this.b).f14683e;
                        if (((hd) this.b).f14683e.f14688d != null) {
                            drawable = ((hd) this.b).f14683e.f14688d;
                        } else {
                            drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        }
                        heVar2.f14688d = drawable;
                    } else if (obj6 == null) {
                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    } else if (obj7 == null) {
                        heVar2 = ((hd) this.b).f14683e;
                        d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                        resources3 = C1473m.f7980a.f7981b.getResources();
                        obj12 = -1;
                        switch (d.hashCode()) {
                            case -1407668872:
                                if (d.equals("disabled_permanently")) {
                                    obj12 = 2;
                                    break;
                                }
                                break;
                            case -390411177:
                                if (d.equals("disabled_until_updated")) {
                                    obj12 = 1;
                                    break;
                                }
                                break;
                            case 1894318991:
                                if (d.equals("disabled_by_parent")) {
                                    obj12 = null;
                                    break;
                                }
                                break;
                        }
                        switch (obj12) {
                            case null:
                                string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                                break;
                            case 1:
                                string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                                break;
                            case 2:
                                string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                                break;
                            default:
                                string = null;
                                break;
                        }
                        heVar2.f14685a = string;
                        ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
                    } else if (obj16 != null) {
                        ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        ((hd) this.b).f14683e.f14692h = true;
                    } else {
                        if (obj9 == null) {
                        }
                        if (obj9 != null) {
                            ((hd) this.b).f14683e.f14685a = charSequence2;
                            ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                            ((hd) this.b).f14683e.f14692h = true;
                        }
                        if (obj15 == null) {
                            fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                            if (obj9 != null) {
                                ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                            } else {
                                ((hd) this.b).f14683e.f14685a = fromHtml2;
                            }
                            ((hd) this.b).f14683e.f14692h = true;
                            ((hd) this.b).f14683e.f14686b = true;
                            ((hd) this.b).f14683e.f14687c = false;
                            ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                            ((hd) this.b).f14683e.f14688d = null;
                        }
                    }
                }
            }
        }
        obj5 = null;
        bW = document2.bW();
        a2 = this.f14662e.m14983a(document2, C1473m.f7980a.cY());
        a3 = C1473m.f7980a.mo2169c().mo2657a(document2.m14625N().f13171k);
        obj6 = 1;
        if (document2.f14885a.f12098e == 1) {
        }
        document = ((hd) this.b).f14680b;
        if (document == null) {
            charSequence2 = null;
        } else {
            a4 = this.f14661d.m11788a(document, this.v, this.D.mo2811a(this.x.mo1620b()));
            if (a4 == null) {
                charSequence2 = null;
            } else {
                obj8 = C1473m.f7980a.mo2247i().m13153a(document, a4, 3).f11910E;
            }
        }
        if (TextUtils.isEmpty(charSequence2)) {
        }
        if (c3026a != null) {
            a5 = C1473m.f7980a.dj().mo2294a(12631565);
            if (document2.f14885a.f12098e == 1) {
            }
            if (document2.ae()) {
            }
            document = ((hd) this.b).f14679a;
            if (document.f14885a.f12107n != null) {
                for (i2 = 0; i2 < i3; i2++) {
                    if (blVar2 != null) {
                    }
                }
            }
            obj12 = null;
            if (obj12 == null) {
            }
            if (c3026a.f15820h) {
            }
            if (c3026a.f15827o) {
            }
            if (c3026a.f15828p == 0) {
            }
            obj15 = 1;
            if (TextUtils.isEmpty(((hd) this.b).f14682d)) {
                obj10 = 1;
            } else {
                obj10 = null;
            }
            while (r17.hasNext()) {
                if (C1473m.f7980a.mo2041U().mo1197b(b5)) {
                    obj11 = 1;
                    break;
                }
            }
            obj11 = null;
            a5 = document2.aK();
            c1473m = C1473m.f7980a;
            if (!c1473m.dj().mo2294a(12643667)) {
                obj13 = null;
            } else if (this.f14666i == null) {
                a6 = new C1245i().m7247a(document2.cf(), document2.m14671z());
                a6.f7406a = b4.name;
                c1473m.cS().m7241a(a6.m7246a(), (C1242f) new gz(this, document2));
                obj13 = null;
            } else if (this.f14666i.isEmpty()) {
                obj13 = null;
            } else if (this.f14666i.size() != 1) {
                i4 = 1;
            } else {
                FinskyLog.m21669e("Only supports one dependency", new Object[0]);
                obj13 = null;
            }
            c2196e = this.D;
            dfeToc = this.v;
            if (C1473m.f7980a.mo2045Y().m11641a(document2) == null) {
                fromHtml = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a(document2).name}));
            } else {
                b3 = C1473m.f7980a.mo2045Y().m11653b(document2, dfeToc, c2196e);
                if (C1473m.f7980a.mo2045Y().m11643a(b3, b4) == null) {
                    for (i3 = 0; i3 < b3.size(); i3++) {
                        if (C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)) != null) {
                            obj14 = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)).name}));
                            break;
                        }
                    }
                }
                fromHtml = null;
            }
            if (dj.mo2294a(12639546)) {
            }
            hdVar = (hd) this.b;
            if (!a9) {
            }
            hdVar.f14681c = z;
            if (!((hd) this.b).f14681c) {
                resources = this.t.getResources();
                i5 = ((hd) this.b).f14679a.f14885a.f12099f;
                ((hd) this.b).f14683e.f14686b = false;
                ((hd) this.b).f14683e.f14687c = true;
                ((hd) this.b).f14683e.f14692h = false;
                if (C1473m.f7980a.dj().mo2294a(12626284)) {
                    ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
                } else {
                    ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
                }
                a7 = C1608h.m9243a(this.t, i5);
                heVar = ((hd) this.b).f14683e;
                if (C1473m.f7980a.dj().mo2294a(12626284)) {
                    f = 0.15f;
                } else {
                    f = 0.1f;
                }
                heVar.f14691g = C1607g.m9234a(a7, f);
                ((hd) this.b).f14684f = null;
                if (a9) {
                    ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                } else if (obj == null) {
                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                    ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
                } else if (obj3 == null) {
                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                } else if (!al) {
                    ((hd) this.b).f14683e.f14685a = document2.am().toString();
                    ((hd) this.b).f14683e.f14686b = true;
                    i6 = 0;
                    for (i7 = 0; i7 < i; i7++) {
                        if (lwVar.f13070d) {
                        }
                        i6 |= i2;
                    }
                    if (i6 == 0) {
                        heVar2 = ((hd) this.b).f14683e;
                        c2440m = document2.f14885a.f12115v;
                        length = c2440m.f13126g.length;
                        for (i2 = 0; i2 < length; i2++) {
                            if (c2440m.f13126g[i2].f13071e == null) {
                                bdVar = c2440m.f13126g[i2].f13071e;
                                break;
                            }
                        }
                        bdVar = null;
                        heVar2.f14689e = bdVar;
                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    }
                } else if (obj17 == null) {
                    ((hd) this.b).f14683e.f14685a = document2.m14617F();
                    ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                    if (obj18 == null) {
                        ((hd) this.b).f14684f = new ha(this, aH);
                        this.f14664g = true;
                    }
                } else if (TextUtils.isEmpty(fromHtml)) {
                    ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                } else if (obj2 == null) {
                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                } else if (obj4 == null) {
                    ((hd) this.b).f14683e.f14685a = charSequence;
                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                } else if (obj5 == null) {
                    heVar2 = ((hd) this.b).f14683e;
                    resources2 = C1473m.f7980a.f7981b.getResources();
                    switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                        case 1:
                            string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                            break;
                        case 3:
                            string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                            break;
                        case 4:
                            string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                            break;
                        default:
                            FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                            string = "";
                            break;
                    }
                    heVar2.f14685a = string;
                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                } else if (!bW) {
                    if (C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null) {
                    }
                    if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                        if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY()))) {
                        }
                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                    } else {
                        ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                    }
                    heVar2 = ((hd) this.b).f14683e;
                    if (((hd) this.b).f14683e.f14688d != null) {
                        drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    } else {
                        drawable = ((hd) this.b).f14683e.f14688d;
                    }
                    heVar2.f14688d = drawable;
                } else if (obj6 == null) {
                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                } else if (obj7 == null) {
                    heVar2 = ((hd) this.b).f14683e;
                    d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                    resources3 = C1473m.f7980a.f7981b.getResources();
                    obj12 = -1;
                    switch (d.hashCode()) {
                        case -1407668872:
                            if (d.equals("disabled_permanently")) {
                                obj12 = 2;
                                break;
                            }
                            break;
                        case -390411177:
                            if (d.equals("disabled_until_updated")) {
                                obj12 = 1;
                                break;
                            }
                            break;
                        case 1894318991:
                            if (d.equals("disabled_by_parent")) {
                                obj12 = null;
                                break;
                            }
                            break;
                    }
                    switch (obj12) {
                        case null:
                            string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                            break;
                        case 1:
                            string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                            break;
                        case 2:
                            string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                            break;
                        default:
                            string = null;
                            break;
                    }
                    heVar2.f14685a = string;
                    ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
                } else if (obj16 != null) {
                    if (obj9 == null) {
                    }
                    if (obj9 != null) {
                        ((hd) this.b).f14683e.f14685a = charSequence2;
                        ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                        ((hd) this.b).f14683e.f14692h = true;
                    }
                    if (obj15 == null) {
                        fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                        if (obj9 != null) {
                            ((hd) this.b).f14683e.f14685a = fromHtml2;
                        } else {
                            ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                        }
                        ((hd) this.b).f14683e.f14692h = true;
                        ((hd) this.b).f14683e.f14686b = true;
                        ((hd) this.b).f14683e.f14687c = false;
                        ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                        ((hd) this.b).f14683e.f14688d = null;
                    }
                } else {
                    ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    ((hd) this.b).f14683e.f14692h = true;
                }
            }
        }
        obj15 = null;
        if (TextUtils.isEmpty(((hd) this.b).f14682d)) {
            obj10 = null;
        } else {
            obj10 = 1;
        }
        while (r17.hasNext()) {
            if (C1473m.f7980a.mo2041U().mo1197b(b5)) {
                obj11 = 1;
                break;
            }
        }
        obj11 = null;
        a5 = document2.aK();
        c1473m = C1473m.f7980a;
        if (!c1473m.dj().mo2294a(12643667)) {
            obj13 = null;
        } else if (this.f14666i == null) {
            a6 = new C1245i().m7247a(document2.cf(), document2.m14671z());
            a6.f7406a = b4.name;
            c1473m.cS().m7241a(a6.m7246a(), (C1242f) new gz(this, document2));
            obj13 = null;
        } else if (this.f14666i.isEmpty()) {
            obj13 = null;
        } else if (this.f14666i.size() != 1) {
            FinskyLog.m21669e("Only supports one dependency", new Object[0]);
            obj13 = null;
        } else {
            i4 = 1;
        }
        c2196e = this.D;
        dfeToc = this.v;
        if (C1473m.f7980a.mo2045Y().m11641a(document2) == null) {
            b3 = C1473m.f7980a.mo2045Y().m11653b(document2, dfeToc, c2196e);
            if (C1473m.f7980a.mo2045Y().m11643a(b3, b4) == null) {
                for (i3 = 0; i3 < b3.size(); i3++) {
                    if (C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)) != null) {
                        obj14 = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a((Document) b3.get(i3)).name}));
                        break;
                    }
                }
            }
            fromHtml = null;
        } else {
            fromHtml = Html.fromHtml(this.t.getString(C7582R.string.owned_by_other_account, new Object[]{C1473m.f7980a.mo2045Y().m11641a(document2).name}));
        }
        if (dj.mo2294a(12639546)) {
        }
        hdVar = (hd) this.b;
        if (!a9) {
        }
        hdVar.f14681c = z;
        if (!((hd) this.b).f14681c) {
            resources = this.t.getResources();
            i5 = ((hd) this.b).f14679a.f14885a.f12099f;
            ((hd) this.b).f14683e.f14686b = false;
            ((hd) this.b).f14683e.f14687c = true;
            ((hd) this.b).f14683e.f14692h = false;
            if (C1473m.f7980a.dj().mo2294a(12626284)) {
                ((hd) this.b).f14683e.f14690f = this.t.getResources().getColorStateList(C1608h.m9241a(i5));
            } else {
                ((hd) this.b).f14683e.f14690f = C1608h.m9255c(this.t, i5);
            }
            a7 = C1608h.m9243a(this.t, i5);
            heVar = ((hd) this.b).f14683e;
            if (C1473m.f7980a.dj().mo2294a(12626284)) {
                f = 0.1f;
            } else {
                f = 0.15f;
            }
            heVar.f14691g = C1607g.m9234a(a7, f);
            ((hd) this.b).f14684f = null;
            if (a9) {
                ((hd) this.b).f14683e.f14685a = C1473m.f7980a.ax().m11783a(document2);
                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
            } else if (obj == null) {
                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_admin_purchased_app);
                ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_enterprise);
            } else if (obj3 == null) {
                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.enterprise_externally_hosted_application);
                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
            } else if (!al) {
                ((hd) this.b).f14683e.f14685a = document2.am().toString();
                ((hd) this.b).f14683e.f14686b = true;
                i6 = 0;
                for (i7 = 0; i7 < i; i7++) {
                    if (lwVar.f13070d) {
                    }
                    i6 |= i2;
                }
                if (i6 == 0) {
                    heVar2 = ((hd) this.b).f14683e;
                    c2440m = document2.f14885a.f12115v;
                    length = c2440m.f13126g.length;
                    for (i2 = 0; i2 < length; i2++) {
                        if (c2440m.f13126g[i2].f13071e == null) {
                            bdVar = c2440m.f13126g[i2].f13071e;
                            break;
                        }
                    }
                    bdVar = null;
                    heVar2.f14689e = bdVar;
                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                }
            } else if (obj17 == null) {
                ((hd) this.b).f14683e.f14685a = document2.m14617F();
                ((hd) this.b).f14683e.f14688d = C1608h.m9264h(this.t, i5);
                if (obj18 == null) {
                    ((hd) this.b).f14684f = new ha(this, aH);
                    this.f14664g = true;
                }
            } else if (TextUtils.isEmpty(fromHtml)) {
                ((hd) this.b).f14683e.f14685a = fromHtml.toString();
                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
            } else if (obj2 == null) {
                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.uninstall_blocked_warning);
                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
            } else if (obj4 == null) {
                ((hd) this.b).f14683e.f14685a = charSequence;
                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
            } else if (obj5 == null) {
                heVar2 = ((hd) this.b).f14683e;
                resources2 = C1473m.f7980a.f7981b.getResources();
                switch (this.f14662e.m14983a(document3, C1473m.f7980a.cY())) {
                    case 1:
                        string = resources2.getString(C7582R.string.testing_program_opted_out_propagating_warning_message);
                        break;
                    case 3:
                        string = resources2.getString(C7582R.string.testing_program_opted_in_warning_message);
                        break;
                    case 4:
                        string = resources2.getString(C7582R.string.testing_program_opted_in_propagating_warning_message);
                        break;
                    default:
                        FinskyLog.m21669e("Unexpected case for testing program message.", new Object[0]);
                        string = "";
                        break;
                }
                heVar2.f14685a = string;
                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
            } else if (!bW) {
                if (C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null) {
                }
                if ((C1473m.f7980a.mo2032L().mo2854a(document2.m14625N().f13171k) != null ? 1 : null) != null) {
                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_installed_warning_message);
                } else {
                    if (C1473m.f7980a.mo2045Y().m11647a(document2, this.D.mo2811a(C1473m.f7980a.cY()))) {
                    }
                    ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.early_access_warning_message);
                }
                heVar2 = ((hd) this.b).f14683e;
                if (((hd) this.b).f14683e.f14688d != null) {
                    drawable = ((hd) this.b).f14683e.f14688d;
                } else {
                    drawable = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                }
                heVar2.f14688d = drawable;
            } else if (obj6 == null) {
                ((hd) this.b).f14683e.f14685a = resources.getString(C7582R.string.testing_program_opted_out_uninstall_warning_message);
                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
            } else if (obj7 == null) {
                heVar2 = ((hd) this.b).f14683e;
                d = C1473m.f7980a.mo2244g().m15131d(document2.m14625N().f13171k);
                resources3 = C1473m.f7980a.f7981b.getResources();
                obj12 = -1;
                switch (d.hashCode()) {
                    case -1407668872:
                        if (d.equals("disabled_permanently")) {
                            obj12 = 2;
                            break;
                        }
                        break;
                    case -390411177:
                        if (d.equals("disabled_until_updated")) {
                            obj12 = 1;
                            break;
                        }
                        break;
                    case 1894318991:
                        if (d.equals("disabled_by_parent")) {
                            obj12 = null;
                            break;
                        }
                        break;
                }
                switch (obj12) {
                    case null:
                        string = resources3.getString(C7582R.string.unicorn_hidden_blocked_by_parent);
                        break;
                    case 1:
                        string = resources3.getString(C7582R.string.unicorn_hidden_need_update);
                        break;
                    case 2:
                        string = resources3.getString(C7582R.string.unicorn_hidden_not_available);
                        break;
                    default:
                        string = null;
                        break;
                }
                heVar2.f14685a = string;
                ((hd) this.b).f14683e.f14688d = C0216d.m1112a(this.t, (int) C7582R.drawable.ic_parental_controls_24dp);
            } else if (obj16 != null) {
                ((hd) this.b).f14683e.f14685a = document2.m14659n().f13069c;
                ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                ((hd) this.b).f14683e.f14692h = true;
            } else {
                if (obj9 == null) {
                }
                if (obj9 != null) {
                    ((hd) this.b).f14683e.f14685a = charSequence2;
                    ((hd) this.b).f14683e.f14688d = C1608h.m9246a(this.t, (int) C7582R.drawable.ic_warning, i5);
                    ((hd) this.b).f14683e.f14692h = true;
                }
                if (obj15 == null) {
                    fromHtml2 = Html.fromHtml(resources.getString(C7582R.string.pre_install_refund_policy_with_learn_more_link, new Object[]{C0955b.ii.m28964b()}));
                    if (obj9 != null) {
                        ((hd) this.b).f14683e.f14685a = TextUtils.concat(new CharSequence[]{((hd) this.b).f14683e.f14685a, "\n", fromHtml2});
                    } else {
                        ((hd) this.b).f14683e.f14685a = fromHtml2;
                    }
                    ((hd) this.b).f14683e.f14692h = true;
                    ((hd) this.b).f14683e.f14686b = true;
                    ((hd) this.b).f14683e.f14687c = false;
                    ((hd) this.b).f14683e.f14693i = C7582R.style.WarningMessageModuleRegularText;
                    ((hd) this.b).f14683e.f14688d = null;
                }
            }
        }
    }

    public final void mo2976b(View view, int i) {
        WarningMessageModuleView warningMessageModuleView = (WarningMessageModuleView) view;
        if (!warningMessageModuleView.f14214d || this.f14664g) {
            he heVar = ((hd) this.b).f14683e;
            hf hfVar = ((hd) this.b).f14684f;
            warningMessageModuleView.f14214d = true;
            CharSequence charSequence = heVar.f14685a;
            if (heVar.f14686b) {
                if (!heVar.f14687c) {
                    ColorStateList colorStateList = heVar.f14690f;
                    Spannable spannableString = new SpannableString(charSequence);
                    for (Object obj : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                        spannableString.setSpan(new C26311(colorStateList), spannableString.getSpanStart(obj), spannableString.getSpanEnd(obj), 0);
                    }
                    charSequence = spannableString;
                }
                warningMessageModuleView.f14211a.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                warningMessageModuleView.f14211a.setMovementMethod(null);
            }
            warningMessageModuleView.f14211a.setText(charSequence);
            if (heVar.f14688d == null && heVar.f14689e == null) {
                warningMessageModuleView.f14212b.setVisibility(8);
            } else {
                warningMessageModuleView.f14212b.setVisibility(0);
                if (heVar.f14689e != null) {
                    C1473m.f7980a.ar().m9287a(warningMessageModuleView.f14212b, heVar.f14689e, -1);
                } else {
                    warningMessageModuleView.f14212b.setImageDrawable(heVar.f14688d);
                }
            }
            if (heVar.f14690f != null) {
                warningMessageModuleView.f14211a.setTextColor(heVar.f14690f);
            }
            if (heVar.f14693i != 0) {
                warningMessageModuleView.f14211a.setTextAppearance(warningMessageModuleView.getContext(), heVar.f14693i);
            }
            if (heVar.f14692h) {
                warningMessageModuleView.setGravity(17);
                warningMessageModuleView.f14211a.setGravity(17);
                if (warningMessageModuleView.f14212b == null) {
                    ((MarginLayoutParams) warningMessageModuleView.f14211a.getLayoutParams()).setMargins(0, 0, 0, 0);
                }
            } else {
                warningMessageModuleView.setGravity(3);
            }
            int paddingTop = warningMessageModuleView.getPaddingTop();
            int paddingBottom = warningMessageModuleView.getPaddingBottom();
            int m = ai.f1848a.mo402m(warningMessageModuleView);
            int l = ai.f1848a.mo401l(warningMessageModuleView);
            warningMessageModuleView.setBackgroundDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(heVar.f14691g), C0216d.m1112a(warningMessageModuleView.getContext(), (int) C7582R.drawable.play_highlight_overlay_dark)}));
            ai.m1823a(warningMessageModuleView, l, paddingTop, m, paddingBottom);
            if (hfVar != null) {
                warningMessageModuleView.setClickable(true);
                warningMessageModuleView.setOnClickListener(warningMessageModuleView);
                warningMessageModuleView.f14213c = hfVar;
            } else {
                warningMessageModuleView.setClickable(false);
                warningMessageModuleView.f14213c = null;
            }
            this.f14664g = false;
            this.I.mo1219a(this);
        }
    }

    public final void mo2980h() {
        this.D.mo2819b(this);
        this.f14662e.m14988b((C1002e) this);
        C1473m.f7980a.bw().mo3484b((C1003o) this);
        if (C1473m.f7980a.dj().mo2294a(12616561)) {
            C1473m.f7980a.mo2254m().mo3819b(this);
        }
    }

    public final void mo1205a(C3369m c3369m) {
        if (c3369m.f17273c.f17153d == 6 || c3369m.f17273c.f17153d == 8) {
            m14429a();
        }
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        m14429a();
    }

    final void m14429a() {
        m14428b();
        if (((hd) this.b).f14681c) {
            this.u.mo3033a(this, true);
            this.f14664g = true;
            return;
        }
        this.u.mo3032a(this);
    }

    public final void mo1215d(String str, boolean z) {
        if (((hd) this.b).f14679a.f14885a.f12096c.equals(str)) {
            m14429a();
        }
    }

    public final void mo1175b(String str, boolean z) {
        if (((hd) this.b).f14679a.f14885a.f12096c.equals(str)) {
            m14429a();
        }
    }

    public final void mo1177d(String str) {
        if (((hd) this.b).f14679a.f14885a.f12096c.equals(str)) {
            m14429a();
        }
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1176c(String str, boolean z) {
        if (((hd) this.b).f14679a.f14885a.f12096c.equals(str)) {
            m14429a();
        }
    }

    public final void mo1178e(String str) {
    }

    public ce getPlayStoreUiElement() {
        if (this.f14663f == null) {
            this.f14663f = C2482j.m13283a(1865);
        }
        return this.f14663f;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}

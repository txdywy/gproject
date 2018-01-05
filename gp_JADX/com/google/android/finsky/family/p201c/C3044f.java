package com.google.android.finsky.family.p201c;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.billing.myaccount.C1995d;
import com.google.android.finsky.billing.myaccount.layout.AccountSimpleRowView;
import com.google.android.finsky.billing.myaccount.layout.C2014c;
import com.google.android.finsky.familycommon.FamilyEducationCard;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.utils.m;
import com.google.wireless.android.finsky.dfe.h.a.ak;
import com.google.wireless.android.finsky.dfe.h.a.al;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C3044f extends C1995d implements OnClickListener, m {
    public final C1557b f15905c = C1473m.f7980a.aY();
    public final C3748a f15906d;
    public final List f15907e;
    public final al[] f15908f;
    public final Activity f15909g;
    public int f15910h = 1;
    public boolean f15911o;

    public C3044f(Activity activity, C3748a c3748a, al[] alVarArr, List list, Bundle bundle, ad adVar, C2495w c2495w) {
        int i = 0;
        super(activity, bundle, adVar, c2495w);
        this.f15909g = activity;
        this.f15906d = c3748a;
        this.f15908f = alVarArr;
        this.f15907e = list;
        this.f15911o = this.f15905c.mo2313c().mo2327h();
        this.i.add(Integer.valueOf(0));
        if (this.f15905c.mo2313c().mo2333n()) {
            this.i.add(Integer.valueOf(2));
            this.f15910h++;
        }
        while (i < list.size()) {
            this.i.add(Integer.valueOf(1));
            i++;
        }
    }

    protected final int mo2572e(int i) {
        switch (i) {
            case 0:
                return C7582R.layout.header_list_spacer;
            case 1:
                return C7582R.layout.account_simple_row;
            case 2:
                return C7582R.layout.family_paused_education_card;
            default:
                throw new IllegalStateException("Unknown viewType " + i);
        }
    }

    protected final void mo2571a(View view, int i, int i2) {
        int i3;
        switch (i) {
            case 0:
                m10558a(view);
                return;
            case 1:
                int i4;
                String a;
                ak akVar = (ak) this.f15907e.get(i2 - this.f15910h);
                i3 = akVar.c;
                switch (i3) {
                    case 1:
                        i4 = 2677;
                        break;
                    case 3:
                        i4 = 2675;
                        break;
                    case 4:
                        i4 = 2676;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
                OnClickListener c3046h = new C3046h(this, akVar, i3);
                C2014c c2014c = new C2014c();
                c2014c.f10409b = akVar.e;
                c2014c.f10412e = C1608h.m9242a(i3, 0);
                c2014c.f10414g = C1608h.m9251b(i3);
                c2014c.f10418k = i4;
                c2014c.f10416i = c3046h;
                c2014c.f10417j = this.l;
                if (akVar.d) {
                    a = C3049j.m15706a(this.f15908f, 3, new Object[0]);
                } else {
                    a = C3049j.m15706a(this.f15908f, 4, new Object[0]);
                }
                c2014c.f10411d = a;
                c2014c.f10413f = C7582R.color.grey;
                m10561a(c2014c);
                ((AccountSimpleRowView) view).m10688a(c2014c, this.j);
                return;
            case 2:
                String a2;
                FamilyEducationCard familyEducationCard = (FamilyEducationCard) view.findViewById(C7582R.id.family_education_card);
                if (this.f15911o) {
                    i3 = 16;
                } else {
                    i3 = 17;
                }
                if (this.f15911o) {
                    a2 = C3049j.m15706a(this.f15908f, 19, new Object[0]);
                } else {
                    a2 = familyEducationCard.getContext().getString(C7582R.string.got_it_button);
                }
                familyEducationCard.m15888a(0, C3049j.m15706a(this.f15908f, 15, new Object[0]), C3049j.m15706a(this.f15908f, i3, new Object[0]), a2, this, this);
                if (this.f15911o) {
                    familyEducationCard.m15889a(C3049j.m15706a(this.f15908f, 18, new Object[0]), new C3045g(this));
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Unknown type for getView " + i);
        }
    }

    final void m15700b() {
        this.f15910h = 1;
        int indexOf = this.i.indexOf(Integer.valueOf(2));
        this.i.remove(indexOf);
        this.f15905c.mo2313c().mo2334o();
        m3633d(indexOf);
    }

    public final void onClick(View view) {
        if (this.f15911o) {
            this.f15906d.mo3629a(4, this.j);
        } else {
            m15700b();
        }
    }

    public final void m15699a(View view, String str) {
        C1473m.f7980a.as().m10992a(this.f15909g, "family_library_disabled", false);
    }
}

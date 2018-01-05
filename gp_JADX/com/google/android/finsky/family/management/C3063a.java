package com.google.android.finsky.family.management;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.billing.myaccount.C1995d;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.c;
import com.google.wireless.android.finsky.dfe.h.a.o;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C3063a extends C1995d {
    public final C1557b f15958c = C1473m.f7980a.aY();
    public C3065c f15959d;

    public C3063a(Context context, C3065c c3065c, List list, Bundle bundle, ad adVar, C2495w c2495w) {
        super(context, bundle, adVar, c2495w);
        this.f15959d = c3065c;
        this.i.add(Integer.valueOf(0));
        for (int i = 0; i < list.size(); i++) {
            switch (((Integer) list.get(i)).intValue()) {
                case 1:
                    this.i.add(Integer.valueOf(6));
                    this.i.add(Integer.valueOf(2));
                    break;
                case 2:
                    this.i.add(Integer.valueOf(6));
                    this.i.add(Integer.valueOf(3));
                    break;
                case 3:
                    this.i.add(Integer.valueOf(1));
                    break;
                case 4:
                    this.i.add(Integer.valueOf(4));
                    break;
                case 5:
                case 6:
                    this.i.add(Integer.valueOf(5));
                    break;
                default:
                    String valueOf = String.valueOf(list.get(i));
                    FinskyLog.m21669e(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unknown family option ").append(valueOf).toString(), new Object[0]);
                    break;
            }
        }
    }

    protected final int mo2572e(int i) {
        if (i == 0) {
            return C7582R.layout.header_list_spacer;
        }
        if (i == 6) {
            return C7582R.layout.family_avatar_view;
        }
        return C7582R.layout.account_simple_row;
    }

    protected final void mo2571a(View view, int i, int i2) {
        switch (i) {
            case 0:
                m10558a(view);
                return;
            case 1:
                m10560a(view, m15761f(1), C7582R.string.setup_family_library, C7582R.raw.ic_family_24px, C7582R.color.family_icon, 2671);
                return;
            case 2:
                m15760a(view, C7582R.string.manage_family_members);
                return;
            case 3:
                m15760a(view, C7582R.string.view_family);
                return;
            case 4:
                m10560a(view, m15761f(4), C7582R.string.family_library_settings, C7582R.raw.ic_family_settings_24px, C7582R.color.family_icon, 2674);
                return;
            case 5:
                Integer num;
                if (this.f15958c.mo2313c().mo2328i()) {
                    num = C1592a.f8452a;
                } else {
                    num = C1592a.f8453b;
                }
                View view2 = view;
                m10560a(view2, m15761f(5), num.intValue(), C7582R.raw.ic_approval_requests_24dp, C7582R.color.family_icon, 0);
                return;
            case 6:
                o c = this.f15958c.mo2313c().mo2322c();
                if (c != null) {
                    int i3;
                    bd a = c.a(c.d, 4);
                    if (a != null) {
                        C1473m.f7980a.ar().m9288a((FifeImageView) view.findViewById(C7582R.id.avatar), a.f11860f, a.f11863i);
                    }
                    ((TextView) view.findViewById(C7582R.id.display_name)).setText(c.d.f12100g);
                    TextView textView = (TextView) view.findViewById(C7582R.id.family_role);
                    switch (c.c) {
                        case 1:
                            i3 = C7582R.string.head_of_household_role;
                            break;
                        case 4:
                            i3 = C7582R.string.parent_role;
                            break;
                        default:
                            i3 = C7582R.string.family_member_role;
                            break;
                    }
                    textView.setText(i3);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Unknown type for getView " + i);
        }
    }

    private final OnClickListener m15761f(int i) {
        return new C3064b(this, i);
    }

    private final void m15760a(View view, int i) {
        m10560a(view, m15761f(2), i, C7582R.raw.ic_supervisor_account_24px, C7582R.color.family_icon, 2672);
    }
}

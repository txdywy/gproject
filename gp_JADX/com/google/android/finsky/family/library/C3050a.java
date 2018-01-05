package com.google.android.finsky.family.library;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.familycommon.FamilyEducationCard;
import com.google.android.finsky.stream.base.C1169s;
import com.squareup.leakcanary.C7582R;

public final class C3050a extends C1169s {
    public final OnClickListener f15922a;
    public final C1557b f15923b = C1473m.f7980a.aY();
    public boolean f15924c;

    public C3050a(OnClickListener onClickListener) {
        this.f15922a = onClickListener;
    }

    public final int mo1508a() {
        return this.f15924c ? 0 : 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.family_education_card;
    }

    public final void mo1510a(View view, int i) {
        FamilyEducationCard familyEducationCard = (FamilyEducationCard) view;
        familyEducationCard.m15887a(3, view.getContext().getString(C7582R.string.family_library_notification_education_card_title), view.getContext().getString(C7582R.string.family_library_notification_education_card_description), view.getContext().getString(C7582R.string.got_it_button), new C3051b(this));
        familyEducationCard.m15889a(view.getContext().getString(C7582R.string.family_library_notification_education_card_secondary_action), new C3052c(this));
    }

    public final void mo1511b(View view, int i) {
    }
}

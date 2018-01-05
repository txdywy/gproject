package com.google.android.play.drawer;

import android.accounts.Account;
import com.android.volley.C0660x;
import com.google.android.finsky.cv.p177a.le;

final class aw implements C0660x {
    public final /* synthetic */ String f31454a;
    public final /* synthetic */ PlayDrawerProfileInfoView f31455b;
    public final /* synthetic */ Account f31456c;
    public final /* synthetic */ ak f31457d;

    aw(ak akVar, String str, PlayDrawerProfileInfoView playDrawerProfileInfoView, Account account) {
        this.f31457d = akVar;
        this.f31454a = str;
        this.f31455b = playDrawerProfileInfoView;
        this.f31456c = account;
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f31457d.m28887a(((le) obj).f13004a, this.f31454a, this.f31455b, this.f31456c);
    }
}

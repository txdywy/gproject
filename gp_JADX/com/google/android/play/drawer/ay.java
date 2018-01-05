package com.google.android.play.drawer;

import android.accounts.Account;
import com.android.volley.C0660x;
import com.google.android.finsky.cv.p177a.hb;

final class ay implements C0660x {
    public final /* synthetic */ String f31458a;
    public final /* synthetic */ PlayDrawerProfileInfoView f31459b;
    public final /* synthetic */ Account f31460c;
    public final /* synthetic */ ak f31461d;

    ay(ak akVar, String str, PlayDrawerProfileInfoView playDrawerProfileInfoView, Account account) {
        this.f31461d = akVar;
        this.f31458a = str;
        this.f31459b = playDrawerProfileInfoView;
        this.f31460c = account;
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f31461d.m28887a(((hb) obj).f12532b, this.f31458a, this.f31459b, this.f31460c);
    }
}

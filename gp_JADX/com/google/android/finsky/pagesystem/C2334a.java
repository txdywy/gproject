package com.google.android.finsky.pagesystem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.C0404a;
import android.support.v7.app.aa;
import android.view.MenuItem;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recoverymode.C3982a;

public abstract class C2334a extends aa implements C1037e {
    public C3982a f11490q;

    public abstract Fragment mo2860n();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1408h) C3947d.m18649a(C1408h.class)).mo1874a(this);
        if (this.f11490q.mo3875b()) {
            this.f11490q.mo3879f();
            finish();
            return;
        }
        C0404a a = G_().mo500a();
        if (a != null) {
            a.mo566a(true);
        }
        if (H_().mo281a(16908290) == null) {
            H_().mo284a().mo325a(16908290, mo2860n()).mo334c();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public final C3748a y_() {
        return null;
    }

    public final C0950c mo1243l() {
        return null;
    }

    public final void mo1241c(String str) {
        G_().mo500a().mo565a((CharSequence) str);
    }

    public final void mo1237a(int i, boolean z) {
    }

    public final void mo1236a(int i, int i2, boolean z) {
    }

    public final void mo1235a(int i, int i2, int i3, boolean z) {
    }

    public final void mo1242d(String str) {
    }

    public final void mo1246z() {
    }

    public final void mo1240c(int i) {
    }

    public final void mo1244m() {
        onBackPressed();
    }

    public final void mo1238a(String str, String str2, C2495w c2495w) {
    }

    public final C4695b mo1234A() {
        return null;
    }

    public final void a_(C2495w c2495w) {
    }
}

package com.google.android.finsky.family.management;

import android.support.v4.app.Fragment;
import android.view.MenuItem;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.pagesystem.C1037e;

public class FamilyMemberSettingsActivity extends C1036b implements C1037e {
    protected final void mo1249b(boolean z) {
        String cZ;
        super.mo1249b(z);
        int intExtra = getIntent().getIntExtra("memberSettingTheme", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("purchaseSettingOnly", false);
        String stringExtra = getIntent().getStringExtra("accountName");
        if (stringExtra == null) {
            cZ = C1473m.f7980a.cZ();
        } else {
            cZ = stringExtra;
        }
        if (intExtra != 0) {
            setTheme(intExtra);
        }
        G_().mo500a().mo566a(true);
        if (H_().mo281a(16908290) == null) {
            Fragment a;
            if (booleanExtra) {
                a = C3070h.m15780a(cZ, null, -1, null);
            } else {
                a = new C3067e();
                a.m6259c(cZ);
            }
            H_().mo284a().mo325a(16908290, a).mo334c();
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
        finish();
    }

    public final void mo1238a(String str, String str2, C2495w c2495w) {
    }

    public final C4695b mo1234A() {
        return null;
    }

    public final void a_(C2495w c2495w) {
    }
}

package com.google.android.finsky.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aw;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.at.C1507b;
import com.google.android.finsky.layout.actionbar.C3658a;
import com.google.android.finsky.layout.actionbar.C3671m;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.pagesystem.C1037e;
import com.squareup.leakcanary.C7582R;

public class FlagItemDialog extends C1036b implements C1037e {
    public C3748a f6330G = C1473m.f7980a.mo2252k().mo3728c(this);
    public C3658a f6331H;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.dialog_when_large);
        Toolbar toolbar = (Toolbar) findViewById(C7582R.id.action_bar);
        if (toolbar != null) {
            if (toolbar instanceof FinskySearchToolbar) {
                ((FinskySearchToolbar) toolbar).a(new C3671m(this));
            }
            m2347a(toolbar);
        }
        String stringExtra = getIntent().getStringExtra("url");
        this.f6331H = new C3658a(this.f6330G, this);
        if (H_().mo281a((int) C7582R.id.content_frame) == null) {
            Fragment deVar = new de();
            deVar.m6319a(C1473m.f7980a.dn(), stringExtra);
            aw a = H_().mo284a();
            a.mo325a((int) C7582R.id.content_frame, deVar);
            a.mo334c();
        }
    }

    public final C3748a y_() {
        return null;
    }

    public final C0950c mo1243l() {
        return null;
    }

    public final void mo1244m() {
        finish();
    }

    public final void mo1238a(String str, String str2, C2495w c2495w) {
        C1507b.m8844a(H_(), null, str, str2, c2495w, 0);
    }

    public final void mo1241c(String str) {
        this.f6331H.m17385a(str);
    }

    public final void mo1237a(int i, boolean z) {
        this.f6331H.m17381a(i, z);
    }

    public final void mo1236a(int i, int i2, boolean z) {
        this.f6331H.m17381a(i, z);
        this.f6331H.m17379a(i2);
    }

    public final void mo1235a(int i, int i2, int i3, boolean z) {
    }

    public final void mo1242d(String str) {
    }

    public final void mo1246z() {
        this.f6331H.m17387a(false, -1);
    }

    public final void mo1240c(int i) {
        this.f6331H.m17387a(true, i);
    }

    public final void a_(C2495w c2495w) {
        this.f6331H.m17383a(c2495w);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final C4695b mo1234A() {
        return null;
    }
}

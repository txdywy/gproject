package com.google.android.finsky.contentfilterui;

import android.accounts.Account;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.p131e.C1822k;
import com.google.android.finsky.billing.p131e.C1829r;
import com.squareup.leakcanary.C7582R;

final class C2354r extends AsyncTask {
    public final /* synthetic */ Account f11557a;
    public final /* synthetic */ String f11558b;
    public final /* synthetic */ String f11559c;
    public final /* synthetic */ C2353q f11560d;

    C2354r(C2353q c2353q, Account account, String str, String str2) {
        this.f11560d = c2353q;
        this.f11557a = account;
        this.f11558b = str;
        this.f11559c = str2;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C1829r c1829r = (C1829r) obj;
        Fragment fragment = this.f11560d;
        if (fragment.m610k()) {
            int i = c1829r == null ? 900 : c1829r.f9412a;
            if (i == 0) {
                fragment.m603h().setResult(-1, new Intent().putExtra("result_key_extra_params", fragment.m603h().getIntent().getBundleExtra("result_key_extra_params")));
                fragment.m603h().finish();
                return;
            }
            if (i == 1100) {
                i = C7582R.string.password_incorrect;
            } else {
                i = C7582R.string.generic_get_app_error;
            }
            fragment.f11556h = false;
            fragment.ai();
            ae.m9219a(fragment.ah, fragment.m592c((int) C7582R.string.password_field_label), fragment.m592c(i));
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return new C1822k(this.f11560d.m603h(), this.f11560d.y_.m13184a(null)).m9844a(this.f11557a, this.f11558b, false, this.f11559c);
    }
}

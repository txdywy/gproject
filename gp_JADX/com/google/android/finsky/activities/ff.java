package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.p037h.C0313h;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.layout.ak;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;
import java.util.HashMap;

public final class ff extends ak {
    public final C1552e f6791a = C1473m.f7980a.dj();
    public final C0313h f6792b = this.f6791a.mo2290a();
    public final C0313h f6793c = this.f6791a.mo2302i();
    public final C0313h f6794d = this.f6791a.mo2303j();
    public Context f6795e;
    public int f6796f;
    public boolean[] f6797g;
    public final Runnable f6798h = new fg(this);

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f6795e = activity;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        getDialog().setTitle(C7582R.string.debug_override_client_experiments_title);
        this.f6785i.setHint(C7582R.string.debug_override_client_experiments_search_hint);
        int a = this.f6792b.m1681a();
        boolean[] zArr = new boolean[a];
        String[] strArr = new String[a];
        HashMap hashMap = new HashMap();
        for (i = 0; i < a; i++) {
            strArr[i] = (String) this.f6792b.m1686b(i);
            hashMap.put(strArr[i], strArr[i].toLowerCase());
        }
        Arrays.sort(strArr, new fh(hashMap));
        for (i = 0; i < a; i++) {
            long a2 = this.f6792b.m1683a(this.f6792b.m1682a(strArr[i]));
            boolean z = this.f6794d != null ? this.f6794d.m1690c(a2) >= 0 : this.f6793c.m1690c(a2) >= 0;
            zArr[i] = z;
        }
        m6560a(zArr, strArr);
        this.f6787k.setOnClickListener(new fi(this));
        this.f6788l.setOnClickListener(new fj(this));
        if (this.f6794d != null) {
            this.f6789m.setOnClickListener(new fk(this));
            this.m.setVisibility(0);
            return;
        }
        this.m.setVisibility(8);
    }

    private final void m6560a(boolean[] zArr, String[] strArr) {
        int i = 0;
        if (zArr.length != strArr.length) {
            FinskyLog.m21669e("Bind failure: The number of Checkboxes does not agree with the number of available descriptions.", new Object[0]);
            return;
        }
        this.f6796f = zArr.length;
        this.f6797g = zArr;
        this.n = strArr;
        this.f6786j.removeAllViews();
        while (i < this.f6796f) {
            View checkBox = new CheckBox(this.f6795e);
            checkBox.setText(this.n[i]);
            checkBox.setChecked(this.f6797g[i]);
            this.f6786j.addView(checkBox);
            i++;
        }
    }
}

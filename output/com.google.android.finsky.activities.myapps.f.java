package com.google.android.finsky.activities.myapps;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.cr;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.api.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.layout.WarmWelcomeCardLegacyButton;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bo;
import com.google.wireless.android.finsky.dfe.nano.fq;
import java.util.ArrayList;

public final class com.google.android.finsky.activities.myapps.f extends Fragment implements com.android.volley.w, com.android.volley.x
{

    public int a;
    public String b;
    public RecyclerView c;
    public android.support.v7.widget.em d;
    public ProgressBar e;
    public ArrayList f;
    public long g;
    public com.google.android.finsky.api.c h;

    f() {
        Fragment();
        this.a = 0;
    }

    private static void a(int p0, Throwable p1, com.google.android.finsky.api.c p2, long p3) {
        v2 = com.google.android.finsky.d.j.e();
        v2.a(125);
        if (p0 != -1)
            v2.b(p0);
        if (p1 != 0)
            v2.c(p1.getClass().getSimpleName());
        if (p3 != 0)
            v2.a(SystemClock.elapsedRealtime() - p3);
        com.google.android.finsky.m.a.f(p2.c()).a(v2, 0);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v2 = p0.inflate(2130969110, p1, 0);
        this.b = com.google.android.finsky.m.a.cZ();
        v1 = com.google.android.finsky.m.a.U().b(this.b);
        if (v1 == 0) {
            v3 = new Object[1];
            v3[0] = FinskyLog.a(this.b);
            FinskyLog.d("Received invalid account name: %s", v3);
        }
        else {
            this.h = com.google.android.finsky.m.a.b(v1.name);
            this.g = SystemClock.elapsedRealtime();
            this.h.c(this, this);
        }
        ((TextView)v2.findViewById(2131756265)).setText(2131953020);
        ((TextView)v2.findViewById(2131756266)).setText(2131953021);
        v0 = (WarmWelcomeCardLegacyButton)v2.findViewById(2131756608);
        v1 = (WarmWelcomeCardLegacyButton)v2.findViewById(2131756610);
        v3 = this.h().getResources();
        v0.a(v3.getString(2131953019), 2131558626, 0);
        v1.a(v3.getString(2131953022), 2131558777, 2131558626);
        v0.setOnClickListener(new com.google.android.finsky.activities.myapps.g(this));
        v1.setOnClickListener(new com.google.android.finsky.activities.myapps.h());
        this.e = (ProgressBar)v2.findViewById(2131755444);
        this.c = (RecyclerView)v2.findViewById(2131756267);
        return v2;
    }

    public final void a(VolleyError p0) {
        v0 = p0.getCause();
        v2 = new Object[2];
        v2[0] = "Unable to fetch backup devices";
        v2[1] = v0;
        FinskyLog.d("%s: %s", v2);
        com.google.android.finsky.activities.myapps.f.a(1, v0, this.h, this.g);
    }

    public final void b_(Object p0) {
        if (((com.google.wireless.android.finsky.dfe.nano.fq)p0).a == 0 || ((com.google.wireless.android.finsky.dfe.nano.fq)p0).a.length == 0)
            FinskyLog.a("getRestoreFlow returned empty", new Object[0]);
        else {
            v4 = new Object[1];
            v4[0] = Integer.valueOf(((com.google.wireless.android.finsky.dfe.nano.fq)p0).a.length);
            FinskyLog.a("getBackupDeviceChoices returned %d devices", v4);
        }
        com.google.android.finsky.activities.myapps.f.a(-1, 0, this.h, this.g);
        if (this.K != 0)
            return;
        this.c.setLayoutManager(new LinearLayoutManager());
        this.f = new ArrayList();
        v2 = 1;
        v0 = 0;
        while (v0 < ((com.google.wireless.android.finsky.dfe.nano.fq)p0).a.length) {
            this.f.add(new com.google.android.finsky.activities.myapps.i(this, v2, ((com.google.wireless.android.finsky.dfe.nano.fq)p0).a[v0]));
            v0 = v0 + 1;
            v2 = 0;
        }
        this.d = new com.google.android.finsky.activities.myapps.j(this, this.h(), this.f);
        this.c.setAdapter(this.d);
        this.d.a.b();
        this.e.setVisibility(8);
        this.c.setVisibility(0);
    }

}

package com.google.android.finsky.instantapps;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.Secure;
import android.support.v4.os.C0327a;
import android.support.v4.p028a.p029a.C0206f;
import android.support.v7.app.aa;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.finsky.instantapps.appmanagement.C3394m;
import com.google.android.finsky.instantapps.appmanagement.C3402v;
import com.google.android.finsky.instantapps.p212d.C3433j;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.instantapps.p218e.C3453i;
import com.google.android.finsky.instantapps.p220f.C3473a;
import com.google.android.finsky.instantapps.p220f.C3479f;
import com.google.android.finsky.instantapps.p220f.C3488n;
import com.google.android.finsky.instantapps.p220f.C3493r;
import com.google.android.finsky.instantapps.p220f.C3494s;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.instantapps.common.C3423l;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.gms.C5799y;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p219f.C5766c;
import com.google.android.instantapps.common.p219f.C5767d;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.squareup.leakcanary.C7582R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class SettingsActivity extends aa {
    public C5766c f17323A;
    public C3488n f17324B;
    public C3473a f17325C;
    public C3488n f17326D;
    public C3479f f17327E;
    public String f17328F;
    public String f17329G;
    public boolean f17330H;
    public Handler f17331q;
    public RecyclerView f17332r;
    public C5785k f17333s;
    public C3394m f17334t;
    public C3423l f17335u;
    public C3402v f17336v;
    public C5710a f17337w;
    public C3453i f17338x;
    public C3433j f17339y;
    public bf f17340z;

    protected void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3512a(this);
        this.f17331q = new Handler(getMainLooper());
        if (bundle != null) {
            this.f17328F = bundle.getString("STATE_SELECTED_ACCOUNT");
            this.f17329G = bundle.getString("STATE_PREVIOUS_ACCOUNT");
            this.f17330H = bundle.getBoolean("STATE_SHOW_EXCLUDED_APPS");
        } else {
            this.f17330H = ((Boolean) this.f17340z.mo5158a()).booleanValue();
        }
        this.f17339y.m16978a((Activity) this, this.f17337w);
        Intent intent = getIntent();
        if ("com.google.android.instantapps.SNOOZED_APPS".equalsIgnoreCase(intent.getAction()) && "gotoweb_settings_reminder_notification".equalsIgnoreCase(intent.getStringExtra("com.google.android.finsky.instantapps.launch.gotowebdelegate.SOURCE"))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f17337w.mo5136a(2907);
        }
        this.f17324B = new C3488n(this, 1, C7582R.string.instant_apps_settings_accounts_header, C7582R.string.instant_apps_settings_accounts_description, false);
        C3493r c3493r = new C3493r();
        this.f17325C = new C3473a(new C3527m(this));
        this.f17323A = m16872l().m27152a();
        getWindow().setStatusBarColor(C0206f.m1066b(getResources(), C7582R.color.instant_apps_settings_status_bar_color, getTheme()));
        setContentView((int) C7582R.layout.instant_apps_settings);
        m2347a((Toolbar) findViewById(C7582R.id.instant_apps_settings_toolbar));
        G_().mo500a().mo566a(true);
        this.f17332r = (RecyclerView) findViewById(C7582R.id.settings_list);
        this.f17332r.setItemAnimator(null);
        m16873m();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("STATE_SELECTED_ACCOUNT", this.f17328F);
        bundle.putString("STATE_PREVIOUS_ACCOUNT", this.f17329G);
        bundle.putBoolean("STATE_SHOW_EXCLUDED_APPS", this.f17330H);
    }

    public void onResume() {
        super.onResume();
        ((NotificationManager) getSystemService("notification")).cancel(170285722);
        this.f17325C.m17042a(this.f17328F);
        this.f17333s.m27186a(new C3544q(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C7582R.menu.instant_apps_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C7582R.id.action_help) {
            this.f17335u.mo3524a(this, "aia_settings_app_list", this.f17328F);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public final void m16871k() {
        C3402v c3402v = this.f17336v;
        List arrayList = new ArrayList();
        long a = C4678i.m21812a() + ((Long) c3402v.f17418d.mo5158a()).longValue();
        for (Entry entry : c3402v.m16902a().entrySet()) {
            if (((Long) entry.getValue()).longValue() > a) {
                arrayList.add((String) entry.getKey());
            }
        }
        this.f17326D = new C3488n(this, 3, C7582R.string.instant_apps_settings_excluded_apps_header, C7582R.string.instant_apps_settings_excluded_apps_description, true);
        C3494s c3494s = new C3494s();
        C3493r c3493r = new C3493r();
        this.f17327E = new C3479f(new C3546s(this), this.f17338x);
        C5767d l = m16872l();
        l.m27153a(this.f17326D).m27153a(this.f17327E);
        this.f17323A = l.m27152a();
        m16873m();
        this.f17327E.m17053a(arrayList);
    }

    final C5767d m16872l() {
        C5767d c5767d = new C5767d();
        c5767d.m27153a(this.f17324B).m27153a(this.f17325C);
        return c5767d;
    }

    final void m16873m() {
        this.f17332r.setAdapter(this.f17323A);
    }

    final void m16874n() {
        C5785k c5785k = this.f17333s;
        c5785k.f29224b.m27167a(new C5799y(c5785k, this.f17328F, new C3558u(this)));
    }

    static String m16870o() {
        Field declaredField;
        try {
            declaredField = Secure.class.getDeclaredField("INSTANT_APPS_ENABLED");
        } catch (NoSuchFieldException e) {
            try {
                declaredField = Secure.class.getDeclaredField("WEB_ACTION_ENABLED");
            } catch (NoSuchFieldException e2) {
                if (C0327a.m1722b()) {
                    FinskyLog.m21669e("Neither Secure.Setting field was found: INSTANT_APPS_ENABLED or WEB_ACTION_ENABLED ", new Object[0]);
                }
                return null;
            }
        }
        try {
            return (String) declaredField.get(null);
        } catch (IllegalAccessException e3) {
            return null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10) {
            if (i2 == -1) {
                this.f17337w.mo5136a(208);
                this.f17328F = intent.getStringExtra("authAccount");
                String o = m16870o();
                Object obj = (o == null || Secure.getInt(getContentResolver(), o, -1) == 0) ? null : 1;
                if (obj == null) {
                    new Builder(this).setTitle(getString(C7582R.string.instant_apps_settings_open_links_dialog_title)).setMessage(getString(C7582R.string.instant_apps_settings_open_links_dialog_description)).setPositiveButton(getString(C7582R.string.instant_apps_settings_open_links_dialog_ok).toUpperCase(), new C3561x(this)).setNegativeButton(getString(C7582R.string.instant_apps_settings_open_links_dialog_cancel).toUpperCase(), new C3560w()).create().show();
                }
                if (this.f17330H) {
                    m16871k();
                }
            } else {
                this.f17328F = this.f17329G;
            }
            this.f17325C.m17042a(this.f17328F);
            this.f17325C.f3433a.m3638b();
        }
        super.onActivityResult(i, i2, intent);
    }
}

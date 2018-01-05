package com.google.android.finsky.setup;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.C0254u;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.setup.SetupWizardNavBar.NavButton;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.bb;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.fo;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.squareup.leakcanary.C7582R;

public class SetupWizardSelectAppsForDeviceActivity extends C0254u implements ad {
    public static final ce f20631n = C2482j.m13283a(2500);
    public SetupWizardNavBar f20632A;
    public NavButton f20633B;
    public cp f20634C;
    public String f20635o;
    public fo f20636p;
    public fp[] f20637q;
    public C2482j f20638r;
    public boolean[] f20639s;
    public SetupWizardParams f20640t;
    public RecyclerView f20641u;
    public cn f20642v;
    public RelativeLayout f20643w;
    public AsyncTask f20644x;
    public boolean f20645y;
    public LinearLayoutManager f20646z;

    public static Intent m19117a(String str, fo foVar) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, SetupWizardSelectAppsForDeviceActivity.class);
        intent.putExtra("authAccount", str);
        Parcelable a = ParcelableProto.m21671a((C0757i) foVar);
        Bundle bundle = new Bundle();
        bundle.putParcelable("SetupWizardSelectAppsForDeviceActivity.backup_device_info", a);
        intent.putExtra("SetupWizardSelectAppsForDeviceActivity.backup_app_for_device_bundle", bundle);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f20640t = (SetupWizardParams) intent.getParcelableExtra("SetupWizardSelectDeviceActivity.setup_params");
        if (this.f20640t.f21126c) {
            i = C7582R.style.SetupWizardTheme.Light;
        } else {
            i = C7582R.style.SetupWizardTheme;
        }
        setTheme(i);
        this.f20635o = intent.getStringExtra("authAccount");
        this.f20636p = (fo) ParcelableProto.m21673a(intent.getBundleExtra("SetupWizardSelectAppsForDeviceActivity.backup_app_for_device_bundle"), "SetupWizardSelectAppsForDeviceActivity.backup_device_info");
        this.f20638r = C1473m.f7980a.mo2242f(this.f20635o);
        if (bundle == null) {
            this.f20638r.m13326a((ad) this);
        } else {
            this.f20639s = bundle.getBooleanArray("SetupWizardSelectAppsForDeviceActivity.current_selected_backup_docs");
            this.f20645y = bundle.getBoolean("SetupWizardSelectAppsForDeviceActivity.listExpanded", false);
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(C7582R.layout.setup_wizard_play_frame_app_select, null);
        setContentView(viewGroup);
        this.f20643w = (RelativeLayout) findViewById(C7582R.id.loading_indicator);
        cs.m19404b(this);
        CharSequence string = getResources().getString(C7582R.string.setup_wizard_select_device_apps_title, new Object[]{this.f20636p.d});
        ((TextView) findViewById(C7582R.id.title)).setText(string);
        setTitle(string);
        this.f20641u = (RecyclerView) layoutInflater.inflate(C7582R.layout.setup_wizard_restore_apps_for_device_view, viewGroup, false);
        this.f20642v = new cn(this);
        getApplicationContext();
        this.f20646z = new LinearLayoutManager();
        this.f20641u.setLayoutManager(this.f20646z);
        this.f20641u.setAdapter(this.f20642v);
        viewGroup = (ViewGroup) findViewById(C7582R.id.content_frame);
        viewGroup.removeAllViews();
        viewGroup.addView(this.f20641u);
        cs.m19399a(this, this.f20640t, 3, true);
        this.f20632A = cs.m19397a((Activity) this);
        if (this.f20632A != null) {
            this.f20633B = this.f20632A.f20629b;
            this.f20633B.setOnClickListener(new ck(this, this));
            this.f20633B.setEnabled(true);
            m19121h();
            NavButton navButton = this.f20632A.f20630c;
            navButton.setOnClickListener(new cl(this));
            navButton.setEnabled(true);
        }
    }

    protected void onResume() {
        super.onResume();
        m19119f();
        if (this.f20637q == null) {
            this.f20644x = new cj(this);
            bb.m21792a(this.f20644x, new Void[0]);
        }
    }

    protected void onPause() {
        if (this.f20644x != null) {
            this.f20644x.cancel(true);
        }
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBooleanArray("SetupWizardSelectAppsForDeviceActivity.current_selected_backup_docs", this.f20639s);
        bundle.putBoolean("SetupWizardSelectAppsForDeviceActivity.listExpanded", this.f20645y);
        bundle.putInt("SetupWizardSelectAppsForDeviceActivity.scrollPosition", this.f20646z.m3124j());
    }

    final void m19119f() {
        this.f20643w.setVisibility(this.f20637q == null ? 0 : 8);
        this.f20642v.f3433a.m3638b();
    }

    final int m19120g() {
        int i = 0;
        if (this.f20637q != null) {
            for (boolean z : this.f20639s) {
                if (z) {
                    i++;
                }
            }
        }
        return i;
    }

    final void m19121h() {
        int i;
        if (m19120g() == 0) {
            i = C7582R.string.setup_wizard_next_button_label;
        } else {
            i = C7582R.string.setup_wizard_nav_restore;
        }
        if (cs.m19406b()) {
            this.f20634C.f20944t.setText(i, BufferType.NORMAL);
        } else if (this.f20632A != null) {
            this.f20632A.f20629b.setText(i, BufferType.NORMAL);
        }
    }

    public ce getPlayStoreUiElement() {
        return f20631n;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }
}

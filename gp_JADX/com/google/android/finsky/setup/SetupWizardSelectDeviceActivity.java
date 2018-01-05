package com.google.android.finsky.setup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.C0254u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.setup.SetupWizardNavBar.NavButton;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.fo;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public class SetupWizardSelectDeviceActivity extends C0254u implements ad {
    public static final ce f20647n = C2482j.m13283a(2500);
    public fo f20648o;
    public String f20649p;
    public SetupWizardParams f20650q;
    public fo[] f20651r;
    public ParcelableProtoArray f20652s;
    public C2482j f20653t;
    public ViewGroup f20654u;
    public ArrayList f20655v;

    public static Intent m19122a(String str, fo[] foVarArr) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, SetupWizardSelectDeviceActivity.class);
        intent.putExtra("authAccount", str);
        Parcelable a = ParcelableProtoArray.m21675a(foVarArr);
        Bundle bundle = new Bundle();
        bundle.putParcelable("SetupWizardRestoreAppsActivity.backup_device_infos", a);
        intent.putExtra("SetupWizardRestoreAppsActivity.backup_device_infos_bundle", bundle);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f20649p = intent.getStringExtra("authAccount");
        Bundle bundleExtra = intent.getBundleExtra("SetupWizardRestoreAppsActivity.backup_device_infos_bundle");
        this.f20650q = new SetupWizardParams(intent);
        if (this.f20650q.f21126c) {
            i = C7582R.style.SetupWizardTheme.Light;
        } else {
            i = C7582R.style.SetupWizardTheme;
        }
        setTheme(i);
        this.f20653t = C1473m.f7980a.mo2242f(this.f20649p);
        this.f20652s = (ParcelableProtoArray) bundleExtra.getParcelable("SetupWizardRestoreAppsActivity.backup_device_infos");
        this.f20651r = (fo[]) this.f20652s.f24027a;
        if (bundle == null) {
            this.f20653t.m13326a((ad) this);
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(C7582R.layout.setup_wizard_play_frame, null);
        setContentView(viewGroup);
        cs.m19404b(this);
        ((TextView) viewGroup.findViewById(C7582R.id.title)).setText(C7582R.string.setup_wizard_select_device_header);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C7582R.id.content_frame);
        View inflate = layoutInflater.inflate(C7582R.layout.setup_wizard_restore_device_view, viewGroup, false);
        this.f20654u = (ViewGroup) inflate.findViewById(C7582R.id.device_list);
        viewGroup2.addView(inflate);
        cs.m19399a(this, this.f20650q, 2, true);
        this.f20654u.removeAllViews();
        this.f20655v = new ArrayList();
        Context context = this.f20654u.getContext();
        for (fo foVar : this.f20651r) {
            View inflate2 = ViewGroup.inflate(context, C7582R.layout.setup_wizard_restore_device_item_view, null);
            this.f20655v.add(new cr(this, inflate2, foVar));
            this.f20654u.addView(inflate2);
        }
        cr crVar = new cr(this, ViewGroup.inflate(context, C7582R.layout.setup_wizard_restore_device_item_view, null), null);
        this.f20655v.add(crVar);
        this.f20654u.addView(crVar.f20946a);
        SetupWizardNavBar a = cs.m19397a((Activity) this);
        if (a != null) {
            NavButton navButton = a.f20629b;
            navButton.setText("", BufferType.NORMAL);
            navButton.setOnClickListener(null);
            navButton.setEnabled(false);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            Intent intent2 = new Intent();
            intent2.putExtra("restoreToken", intent.getStringExtra("restoreToken"));
            setResult(-1, intent2);
            finish();
        }
    }

    public ce getPlayStoreUiElement() {
        return f20647n;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }
}

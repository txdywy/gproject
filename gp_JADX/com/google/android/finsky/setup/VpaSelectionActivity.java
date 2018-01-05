package com.google.android.finsky.setup;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.support.v4.app.C0254u;
import android.support.v4.p028a.C0221j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.layout.VpaSelectAllEntryLayout;
import com.google.android.finsky.layout.by;
import com.google.android.finsky.layout.cb;
import com.google.android.finsky.layout.cd;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.setup.SetupWizardNavBar.NavButton;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@TargetApi(21)
public class VpaSelectionActivity extends C0254u implements OnClickListener, ad, cb, cd {
    public static final ce f20674n = C2482j.m13283a(2520);
    public boolean f20675A;
    public SetupWizardParams f20676B;
    public C2482j f20677C;
    public VpaService f20678D;
    public boolean f20679E;
    public C0221j f20680F;
    public final ServiceConnection f20681G = new cy(this);
    public final dp f20682H = new cz(this);
    public final BroadcastReceiver f20683I = new db(this);
    public by[] f20684o;
    public ee[] f20685p;
    public ef[] f20686q;
    public String f20687r;
    public ViewGroup f20688s;
    public ViewGroup f20689t;
    public VpaSelectAllEntryLayout f20690u;
    public C4174g f20691v;
    public boolean[] f20692w;
    public View f20693x;
    public View f20694y;
    public boolean f20695z;

    public static Intent m19124a(String str) {
        return m19125a(str, null, null);
    }

    public static Intent m19125a(String str, ee[] eeVarArr, ef[] efVarArr) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, VpaSelectionActivity.class);
        intent.putExtra("authAccount", str);
        if (eeVarArr != null) {
            intent.putExtra("VpaSelectionActivity.preloads", ParcelableProtoArray.m21675a(eeVarArr));
        }
        if (efVarArr != null) {
            intent.putExtra("VpaSelectionActivity.preload_groups", ParcelableProtoArray.m21675a(efVarArr));
        }
        return intent;
    }

    protected boolean mo3917f() {
        return cs.m19406b();
    }

    protected void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f20676B = new SetupWizardParams(intent);
        if (this.f20676B.f21126c) {
            i = C7582R.style.SetupWizardTheme.Light;
        } else {
            i = C7582R.style.SetupWizardTheme;
        }
        setTheme(i);
        this.f20687r = intent.getStringExtra("authAccount");
        if (bundle != null) {
            this.f20685p = (ee[]) ParcelableProtoArray.m21677a(bundle, "VpaSelectionActivity.preloads");
            this.f20686q = (ef[]) ParcelableProtoArray.m21677a(bundle, "VpaSelectionActivity.preload_groups");
            this.f20692w = bundle.getBooleanArray("VpaSelectionActivity.current_selected_preloads");
        } else if (intent.hasExtra("VpaSelectionActivity.preloads")) {
            this.f20685p = (ee[]) ParcelableProtoArray.m21676a(intent, "VpaSelectionActivity.preloads");
            this.f20686q = (ef[]) ParcelableProtoArray.m21676a(intent, "VpaSelectionActivity.preload_groups");
        } else {
            this.f20687r = C1473m.f7980a.cZ();
        }
        this.f20677C = C1473m.f7980a.mo2242f(this.f20687r);
        if (bundle == null) {
            this.f20677C.m13326a((ad) this);
        }
        C2266a q = C1473m.f7980a.mo2258q();
        if (q.m11723e()) {
            this.f20679E = q.m11721c();
            this.f20680F = C0221j.m1129a((Context) this);
            this.f20680F.m1132a(this.f20683I, new IntentFilter("VpaDetailsActivity.detailsCheckboxToggled"));
            bindService(new Intent(this, VpaService.class), this.f20681G, 1);
            if (!this.f20695z) {
                int i2;
                this.f20695z = true;
                LayoutInflater from = LayoutInflater.from(this);
                this.f20688s = (ViewGroup) from.inflate(C7582R.layout.setup_wizard_play_frame, null);
                setContentView(this.f20688s);
                cs.m19404b(this);
                ((TextView) this.f20688s.findViewById(C7582R.id.title)).setText(C7582R.string.setup_wizard_optional_preloads_header);
                setTitle(C7582R.string.setup_wizard_optional_preloads_header);
                ViewGroup viewGroup = (ViewGroup) this.f20688s.findViewById(C7582R.id.content_frame);
                this.f20689t = (ViewGroup) from.inflate(C7582R.layout.setup_wizard_preloads_selection_view, this.f20688s, false);
                viewGroup.addView(this.f20689t);
                TextView textView = (TextView) this.f20689t.findViewById(C7582R.id.setup_wizard_optional_preloads_header);
                if (this.f20679E) {
                    i2 = C7582R.string.setup_wizard_optional_apps_title;
                } else {
                    i2 = C7582R.string.setup_wizard_optional_apps_data_only_title;
                }
                textView.setText(i2);
                cs.m19399a(this, this.f20676B, 1, mo3917f());
                this.f20690u = (VpaSelectAllEntryLayout) this.f20689t.findViewById(C7582R.id.setup_wizard_select_all_section);
                this.f20693x = this.f20689t.findViewById(C7582R.id.setup_wizard_preloads_loading_divider);
                this.f20694y = this.f20689t.findViewById(C7582R.id.setup_wizard_preloads_loading);
                m19130g();
                SetupWizardNavBar a = cs.m19397a((Activity) this);
                if (a != null) {
                    NavButton navButton = a.f20629b;
                    navButton.setText(C7582R.string.setup_wizard_ok_button_label);
                    navButton.setOnClickListener(this);
                    a.f20630c.setEnabled(true);
                    return;
                }
                Button button = (Button) findViewById(C7582R.id.suw_pai_button);
                button.setVisibility(0);
                button.setOnClickListener(this);
                return;
            }
            return;
        }
        Toast.makeText(this, C7582R.string.setup_wizard_preloads_no_connection, 1).show();
        finish();
    }

    protected void onDestroy() {
        if (this.f20680F != null) {
            this.f20680F.m1131a(this.f20683I);
            this.f20680F = null;
        }
        if (this.f20678D != null) {
            unbindService(this.f20681G);
            this.f20678D = null;
        }
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i;
        int i2 = 0;
        super.onSaveInstanceState(bundle);
        if (this.f20686q != null) {
            bundle.putParcelable("VpaSelectionActivity.preload_groups", ParcelableProtoArray.m21675a(this.f20686q));
        }
        bundle.putBoolean("VpaSelectionActivity.select_all_selection", this.f20690u.isSelected());
        if (this.f20684o != null) {
            int i3 = 0;
            for (by preloadsCount : this.f20684o) {
                i3 += preloadsCount.getPreloadsCount();
            }
            boolean[] zArr = new boolean[i3];
            by[] byVarArr = this.f20684o;
            int length = byVarArr.length;
            i = 0;
            int i4 = 0;
            while (i < length) {
                i3 = i4;
                for (boolean z : byVarArr[i].getSelectedStates()) {
                    zArr[i3] = z;
                    i3++;
                }
                i++;
                i4 = i3;
            }
            bundle.putBooleanArray("VpaSelectionActivity.current_selected_preloads", zArr);
        }
        if (this.f20684o != null) {
            ArrayList arrayList = new ArrayList();
            by[] byVarArr2 = this.f20684o;
            i = byVarArr2.length;
            while (i2 < i) {
                Collections.addAll(arrayList, byVarArr2[i2].getPreloads());
                i2++;
            }
            bundle.putParcelable("VpaSelectionActivity.preloads", ParcelableProtoArray.m21675a((ee[]) arrayList.toArray(new ee[arrayList.size()])));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m19130g() {
        /*
        r9 = this;
        r1 = 8;
        r2 = 0;
        r3 = r9.f20693x;
        r0 = r9.f20675A;
        if (r0 == 0) goto L_0x003b;
    L_0x0009:
        r0 = r1;
    L_0x000a:
        r3.setVisibility(r0);
        r3 = r9.f20694y;
        r0 = r9.f20675A;
        if (r0 == 0) goto L_0x003d;
    L_0x0013:
        r0 = r1;
    L_0x0014:
        r3.setVisibility(r0);
        r4 = r9.f20690u;
        r0 = r9.f20675A;
        if (r0 == 0) goto L_0x0048;
    L_0x001d:
        r5 = r9.f20684o;
        r6 = r5.length;
        r3 = r2;
    L_0x0021:
        if (r3 >= r6) goto L_0x0046;
    L_0x0023:
        r7 = r5[r3];
        r0 = r2;
    L_0x0026:
        r8 = r7.getPreloadsCount();
        if (r0 >= r8) goto L_0x0042;
    L_0x002c:
        r8 = r7.m17434a(r0);
        r8 = r8.h;
        if (r8 != 0) goto L_0x003f;
    L_0x0034:
        r0 = 1;
    L_0x0035:
        if (r0 == 0) goto L_0x0048;
    L_0x0037:
        r4.setVisibility(r2);
        return;
    L_0x003b:
        r0 = r2;
        goto L_0x000a;
    L_0x003d:
        r0 = r2;
        goto L_0x0014;
    L_0x003f:
        r0 = r0 + 1;
        goto L_0x0026;
    L_0x0042:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0021;
    L_0x0046:
        r0 = r2;
        goto L_0x0035;
    L_0x0048:
        r2 = r1;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.setup.VpaSelectionActivity.g():void");
    }

    protected boolean mo3918h() {
        return !C1473m.f7980a.bP().m14775a() && (VpaService.m19145c() || C1473m.f7980a.cK().mo3929a());
    }

    final void mo1274i() {
        if (mo3918h()) {
            Intent f = C1473m.f7980a.bo().mo2766f(getApplicationContext());
            f.addFlags(33554432);
            startActivity(f);
            finish();
            return;
        }
        setResult(-1);
        finish();
    }

    public void onClick(View view) {
        view.setOnClickListener(null);
        if (this.f20675A) {
            List arrayList = new ArrayList(this.f20691v.f21090b);
            for (by byVar : this.f20684o) {
                boolean[] selectedStates = byVar.getSelectedStates();
                for (int i = 0; i < selectedStates.length; i++) {
                    ee a = byVar.m17434a(i);
                    if (!a.h) {
                        if (selectedStates[i]) {
                            arrayList.add(a);
                        } else {
                            this.f20677C.m13319a(new C2474c(165).m13244b("restore_vpa").m13236a(a.c.f11833b).f13342a, null);
                        }
                    }
                }
            }
            C0954a.bg.m5763a(Boolean.valueOf(true));
            this.f20678D.m19150a(this.f20687r, arrayList);
        }
        mo1274i();
    }

    final void m19133j() {
        if (this.f20692w != null) {
            by[] byVarArr = this.f20684o;
            int length = byVarArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                by byVar = byVarArr[i];
                int preloadsCount = byVar.getPreloadsCount();
                boolean[] zArr = new boolean[preloadsCount];
                int i3 = i2;
                for (i2 = 0; i2 < preloadsCount; i2++) {
                    zArr[i2] = this.f20692w[i3];
                    i3++;
                }
                byVar.setSelectedStates(zArr);
                i++;
                i2 = i3;
            }
        }
    }

    final void m19134k() {
        for (by listener : this.f20684o) {
            listener.setListener(this);
        }
        this.f20690u.setListener(this);
    }

    final void m19135l() {
        boolean z = true;
        for (by byVar : this.f20684o) {
            int i;
            for (boolean z2 : byVar.f18554f) {
                if (!z2) {
                    i = 0;
                    break;
                }
            }
            i = 1;
            z &= i;
        }
        this.f20690u.setSelectAllCheckableWithoutNotify(z);
    }

    final boolean m19136m() {
        for (by preloadsCount : this.f20684o) {
            if (preloadsCount.getPreloadsCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void mo3915a(PreloadWrapper preloadWrapper, int i, boolean z) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, VpaDetailsActivity.class);
        intent.putExtra("VpaDetailsActivity.preloadWrapper", preloadWrapper);
        intent.putExtra("VpaDetailsActivity.preloadIndex", i);
        intent.putExtra("VpaDetailsActivity.isSelected", z);
        startActivity(intent);
    }

    public final void mo3914a() {
        m19135l();
    }

    public final void a_(boolean z) {
        if (this.f20684o != null) {
            for (by selectedStatesWithoutNotify : this.f20684o) {
                selectedStatesWithoutNotify.setSelectedStatesWithoutNotify(z);
            }
        }
    }

    public ce getPlayStoreUiElement() {
        return f20674n;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }
}

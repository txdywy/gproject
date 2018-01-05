package com.google.android.finsky.uninstall;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public class UninstallManagerActivityV2 extends C1036b implements ah {
    public final Runnable f23420G = new C4586a(this);
    public boolean f23421H;
    public String f23422I;
    public ArrayList f23423J = new ArrayList();
    public boolean f23424K = false;
    public String f23425L;
    public boolean f23426M;
    public C4594h f23427N;
    public View f23428O;
    public View f23429P;
    public View f23430Q;
    public boolean f23431R;
    public boolean f23432S;
    public Handler f23433T;
    public long f23434U;
    public boolean f23435V;
    public ce f23436W = C2482j.m13283a(5520);
    public C2495w f23437X;
    public final C2471a f23438t = C1473m.f7980a.aR();

    public static Intent m21251a(ArrayList arrayList, C2495w c2495w, boolean z) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, UninstallManagerActivityV2.class);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("uninstall_manager_activity_installing_package_names", arrayList);
        bundle.putBoolean("uninstall_manager_activity_confirmation_flag", false);
        bundle.putBoolean("uninstall_manager_activity_entry_selection_flag", z);
        c2495w.m13376a(intent);
        intent.putExtras(bundle);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        UninstallManagerActivityV2 uninstallManagerActivityV2;
        aw a;
        boolean z;
        UninstallManagerActivityV2 uninstallManagerActivityV22;
        super.onCreate(bundle);
        this.f23428O = View.inflate(this, C7582R.layout.uninstall_manager_activity_v2, null);
        setContentView(this.f23428O);
        Intent intent = getIntent();
        this.f23421H = intent.getBooleanExtra("uninstall_manager_activity_confirmation_flag", false);
        ArrayList stringArrayListExtra = intent.getStringArrayListExtra("uninstall_manager_activity_installing_package_names");
        if (bundle != null) {
            this.f23424K = bundle.getBoolean("UninstallManagerActivityV2.hasCurrentFragment");
            this.f23426M = bundle.getBoolean("UninstallManagerActivityV2.shouldStartOnConfirmation");
        } else {
            this.f23426M = this.f23421H;
        }
        if (intent.getBooleanExtra("uninstall_manager_activity_entry_selection_flag", false)) {
            this.f23422I = C1473m.f7980a.mo2040T().cZ();
            uninstallManagerActivityV2 = this;
        } else if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            FinskyLog.m21669e("Inputting list of package names is null or empty", new Object[0]);
            if (TextUtils.isEmpty(this.f23422I)) {
                finish();
                return;
            }
            if (bundle != null) {
                this.f23437X = this.f23438t.m13179a(bundle);
            } else {
                this.f23437X = this.f6316C.m13380b(this.f23422I);
            }
            this.f23430Q = this.f23428O.findViewById(C7582R.id.loading_spinner);
            this.f23429P = this.f23428O.findViewById(C7582R.id.uninstall_manager_content_frame);
            this.f23433T = new Handler(getMainLooper());
            this.f23435V = true;
            this.f23427N = (C4594h) H_().mo283a("uninstall_manager_base_fragment");
            if (this.f23427N != null || (this.f23427N != null && this.f23427N.f23609f)) {
                a = H_().mo284a();
                if (this.f23427N != null) {
                    a.mo327a(this.f23427N);
                }
                this.f23427N = C4594h.m21394a(stringArrayListExtra, this.f23421H, intent.getBooleanExtra("uninstall_manager_activity_entry_selection_flag", false));
                a.mo328a(this.f23427N, "uninstall_manager_base_fragment");
                a.mo334c();
            }
            switch (this.f23427N.f23605b) {
                case 0:
                    mo1276k();
                    return;
                case 2:
                    m21259z();
                    return;
                case 3:
                    m21253B();
                    return;
                case 5:
                    m21255a(C1290m.m7703b(this, null), C1290m.m7702a(this, null));
                    return;
                default:
                    return;
            }
        } else {
            String str;
            String str2 = (String) stringArrayListExtra.get(0);
            C2129c a2 = C1473m.f7980a.mo2029I().f18022b.mo2657a(str2);
            if (a2 != null) {
                str = a2.f10815i;
            } else {
                str = null;
            }
            this.f23422I = str;
            C3647b a3 = C1473m.f7980a.mo2029I().m17243a(str2);
            if (a3 == null || a3.f18028c == null) {
                uninstallManagerActivityV2 = this;
            } else {
                z = true;
                uninstallManagerActivityV22 = this;
                uninstallManagerActivityV22.f23432S = z;
                if (TextUtils.isEmpty(this.f23422I)) {
                    if (bundle != null) {
                        this.f23437X = this.f6316C.m13380b(this.f23422I);
                    } else {
                        this.f23437X = this.f23438t.m13179a(bundle);
                    }
                    this.f23430Q = this.f23428O.findViewById(C7582R.id.loading_spinner);
                    this.f23429P = this.f23428O.findViewById(C7582R.id.uninstall_manager_content_frame);
                    this.f23433T = new Handler(getMainLooper());
                    this.f23435V = true;
                    this.f23427N = (C4594h) H_().mo283a("uninstall_manager_base_fragment");
                    if (this.f23427N != null) {
                    }
                    a = H_().mo284a();
                    if (this.f23427N != null) {
                        a.mo327a(this.f23427N);
                    }
                    this.f23427N = C4594h.m21394a(stringArrayListExtra, this.f23421H, intent.getBooleanExtra("uninstall_manager_activity_entry_selection_flag", false));
                    a.mo328a(this.f23427N, "uninstall_manager_base_fragment");
                    a.mo334c();
                }
                finish();
                return;
            }
        }
        uninstallManagerActivityV22 = uninstallManagerActivityV2;
        z = false;
        uninstallManagerActivityV22.f23432S = z;
        if (TextUtils.isEmpty(this.f23422I)) {
            finish();
            return;
        }
        if (bundle != null) {
            this.f23437X = this.f23438t.m13179a(bundle);
        } else {
            this.f23437X = this.f6316C.m13380b(this.f23422I);
        }
        this.f23430Q = this.f23428O.findViewById(C7582R.id.loading_spinner);
        this.f23429P = this.f23428O.findViewById(C7582R.id.uninstall_manager_content_frame);
        this.f23433T = new Handler(getMainLooper());
        this.f23435V = true;
        this.f23427N = (C4594h) H_().mo283a("uninstall_manager_base_fragment");
        if (this.f23427N != null) {
        }
        a = H_().mo284a();
        if (this.f23427N != null) {
            a.mo327a(this.f23427N);
        }
        this.f23427N = C4594h.m21394a(stringArrayListExtra, this.f23421H, intent.getBooleanExtra("uninstall_manager_activity_entry_selection_flag", false));
        a.mo328a(this.f23427N, "uninstall_manager_base_fragment");
        a.mo334c();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("UninstallManagerActivityV2.hasCurrentFragment", this.f23424K);
        bundle.putBoolean("UninstallManagerActivityV2.shouldStartOnConfirmation", this.f23426M);
        this.f23437X.m13377a(bundle);
    }

    public void onStop() {
        this.f23428O.removeCallbacks(this.f23420G);
        super.onStop();
    }

    public final void mo1276k() {
        this.C = this.f23437X.m13365a();
        this.f23425L = "uninstall_manager_selection";
        Fragment bgVar = new bg();
        this.f23434U = C2482j.m13315j();
        bgVar.ai = this;
        m21256b(bgVar);
    }

    public final void m21259z() {
        if (this.f23426M) {
            this.C = this.f23437X.m13365a();
        }
        this.f23425L = "uninstall_manager_confirmation";
        this.f23423J = bl.m21377a().m21385d();
        Fragment a = C4596j.m21399a(this.f23422I, this.f23423J, Boolean.valueOf(this.f23432S));
        this.f23434U = C2482j.m13315j();
        a.af = this;
        m21256b(a);
    }

    public final void m21255a(String str, String str2) {
        this.f23425L = "uninstall_manager_error";
        Fragment a = ao.m21301a(str, str2);
        this.f23434U = C2482j.m13315j();
        a.f23501e = this;
        m21256b(a);
    }

    final void m21256b(Fragment fragment) {
        aw a = H_().mo284a();
        if (this.f23431R) {
            this.f23429P.setVisibility(4);
            this.f23428O.postDelayed(this.f23420G, 100);
        } else {
            if (this.f23424K) {
                a.mo323a((int) C7582R.anim.slide_in_right, (int) C7582R.anim.slide_out_left);
            }
            this.f23429P.setVisibility(0);
        }
        ab H_ = H_();
        if (H_.mo283a(this.f23425L) == null) {
            a.mo332b(C7582R.id.uninstall_manager_content_frame, fragment, this.f23425L);
            if (this.f23425L.equals("uninstall_manager_confirmation")) {
                if (this.f23426M) {
                    this.f23426M = false;
                } else {
                    a.mo330a(null);
                }
            }
            a.mo334c();
        } else if (this.f23425L.equals("uninstall_manager_selection")) {
            H_.mo292c();
        }
        this.f23424K = true;
        this.f23431R = false;
    }

    final void m21252A() {
        View view = this.f23430Q;
        Animation loadAnimation = AnimationUtils.loadAnimation(this, C7582R.anim.fade_out);
        loadAnimation.setAnimationListener(new C4588b(view));
        view.startAnimation(loadAnimation);
    }

    public final void m21253B() {
        if (!this.f23431R) {
            if (this.f23424K) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, C7582R.anim.slide_out_left);
                loadAnimation.setAnimationListener(new C4591c(this));
                this.f23429P.startAnimation(loadAnimation);
                this.f23430Q.setVisibility(0);
                this.f23430Q.startAnimation(AnimationUtils.loadAnimation(this, C7582R.anim.slide_in_right));
            } else {
                this.f23429P.setVisibility(4);
                this.f23430Q.setVisibility(0);
                this.f23430Q.startAnimation(AnimationUtils.loadAnimation(this, C7582R.anim.play_fade_in));
            }
            this.f23431R = true;
        }
    }

    public ce getPlayStoreUiElement() {
        return this.f23436W;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13288a(this.f23433T, this.f23434U, this, adVar, this.f6316C);
    }

    public final void o_() {
        this.f23434U = C2482j.m13315j();
    }

    public final void mo1222m() {
        C2482j.m13289a(this.f23433T, this.f23434U, (ah) this, this.f6316C);
    }
}

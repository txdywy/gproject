package com.google.android.finsky.uninstall;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.animation.AnimationUtils;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C4594h extends Fragment implements C1031w, br {
    public int f23604a;
    public int f23605b;
    public ArrayList f23606c;
    public bq f23607d;
    public boolean f23608e = false;
    public boolean f23609f;
    public C2495w f23610g;
    public String f23611h;
    public String f23612i;

    public static C4594h m21394a(ArrayList arrayList, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("uninstall_manager_fragment_confirmation_flag", z);
        bundle.putStringArrayList("uninstall_manager_fragment_installing_package_names", arrayList);
        bundle.putBoolean("uninstall_manager_fragment_need_entry_selection", z2);
        Fragment c4594h = new C4594h();
        c4594h.m600f(bundle);
        return c4594h;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        UninstallManagerActivityV2 uninstallManagerActivityV2 = (UninstallManagerActivityV2) m603h();
        if (uninstallManagerActivityV2 == null || !uninstallManagerActivityV2.f23435V) {
            this.f23609f = true;
            return;
        }
        this.f23609f = false;
        this.f740L = true;
        Bundle bundle2 = this.f760q;
        boolean z = bundle2.getBoolean("uninstall_manager_fragment_confirmation_flag");
        this.f23606c = bundle2.getStringArrayList("uninstall_manager_fragment_installing_package_names");
        if (z) {
            m21396a(2);
        } else if (bundle2.getBoolean("uninstall_manager_fragment_need_entry_selection")) {
            m21396a(1);
        } else {
            m21396a(0);
        }
        this.f23610g = uninstallManagerActivityV2.f6316C;
        m21393X();
        m21396a(3);
    }

    private final void m21393X() {
        this.f23607d = new C4605t(this.f23610g, this.f23606c, m603h().getApplicationContext());
        this.f23607d.mo4269a((C1031w) this);
        this.f23607d.mo4270a((br) this);
        this.f23607d.mo4275g();
    }

    public final void m_() {
        m21396a(4);
        this.f23608e = true;
        this.f23607d.mo4272b(this);
    }

    public final void mo968W() {
        Activity h = m603h();
        if (!(h == null || h.isFinishing())) {
            h.finish();
        }
        ArrayList e = this.f23607d.mo4274e();
        int size = e.size();
        int i = 0;
        while (i < size) {
            Object obj = e.get(i);
            i++;
            Document document = (Document) obj;
            new Handler(Looper.getMainLooper()).postDelayed(new C4595i(document.f14885a.f12100g, document.m14625N().f13171k, this.f23610g), 500);
        }
        this.f23607d.mo4270a(null);
    }

    public final void a_(VolleyError volleyError) {
        this.f23611h = C1290m.m7703b(m603h(), volleyError);
        this.f23612i = C1290m.m7702a(m603h(), volleyError);
        this.f23607d.mo4270a(null);
        m21396a(5);
    }

    public final void m21396a(int i) {
        while (true) {
            if (i == 3 && this.f23605b != 3) {
                this.f23604a = this.f23605b;
            }
            this.f23605b = i;
            UninstallManagerActivityV2 uninstallManagerActivityV2 = (UninstallManagerActivityV2) m603h();
            if (uninstallManagerActivityV2 != null && !uninstallManagerActivityV2.f6327x) {
                switch (this.f23605b) {
                    case 0:
                        uninstallManagerActivityV2.mo1276k();
                        return;
                    case 1:
                        uninstallManagerActivityV2.C = uninstallManagerActivityV2.f23437X.m13365a();
                        uninstallManagerActivityV2.f23425L = "uninstall_manager_selection";
                        Fragment amVar = new am();
                        uninstallManagerActivityV2.f23434U = C2482j.m13315j();
                        amVar.af = uninstallManagerActivityV2;
                        uninstallManagerActivityV2.m21256b(amVar);
                        return;
                    case 2:
                        uninstallManagerActivityV2.m21259z();
                        return;
                    case 3:
                        uninstallManagerActivityV2.m21253B();
                        return;
                    case 4:
                        if (uninstallManagerActivityV2.f23431R) {
                            if (uninstallManagerActivityV2.f23424K) {
                                uninstallManagerActivityV2.f23429P.setVisibility(0);
                                uninstallManagerActivityV2.f23429P.startAnimation(AnimationUtils.loadAnimation(uninstallManagerActivityV2, C7582R.anim.play_fade_in));
                                uninstallManagerActivityV2.m21252A();
                                uninstallManagerActivityV2.f23431R = false;
                            } else {
                                FinskyLog.m21669e("Illegal state: hideLoading called without fragment.", new Object[0]);
                            }
                        }
                        this.f23605b = this.f23604a;
                        return;
                    case 5:
                        uninstallManagerActivityV2.m21255a(this.f23611h, this.f23612i);
                        return;
                    case 6:
                        m21396a(0);
                        m21393X();
                        i = 3;
                    default:
                        return;
                }
            }
            return;
        }
    }
}

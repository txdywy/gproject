package com.google.android.finsky.uninstall;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.pagesystem.C1037e;
import com.squareup.leakcanary.C7582R;

public class UninstallManagerActivity extends C1036b implements C0998m, C1037e, as {
    public Document f23414G;
    public String f23415H;
    public View f23416I;
    public boolean f23417J;
    public int f23418K;
    public int f23419L;

    public static Intent m21236a(Document document, C2495w c2495w) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, UninstallManagerActivity.class);
        intent.putExtra("uninstall_manager_activity_installing_doc", document);
        c2495w.m13376a(intent);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23416I = View.inflate(this, C7582R.layout.uninstall_manager_activity, null);
        setContentView(this.f23416I);
        this.f23414G = (Document) getIntent().getParcelableExtra("uninstall_manager_activity_installing_doc");
        C1473m c1473m = C1473m.f7980a;
        String str = this.f23414G.m14625N().f13171k;
        C3646a I = c1473m.mo2029I();
        this.f23415H = c1473m.bt().m15626a(str).m15620a(c1473m.cZ());
        this.C = this.f6316C.m13380b(this.f23415H);
        C3647b a = I.m17243a(str);
        boolean z = (a == null || a.f18028c == null) ? false : true;
        this.f23417J = z;
        ab H_ = H_();
        if (H_.mo283a("uninstall_manager_confirmation_dialog") != null) {
            this.f23416I.setVisibility(8);
        } else if (H_.mo283a("uninstall_manager_app_selection_fragment") == null) {
            Parcelable parcelable = this.f23414G;
            str = this.f23415H;
            C2495w c2495w = this.f6316C;
            Fragment apVar = new ap();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("uninstall_manager_fragment_installing_doc", parcelable);
            bundle2.putString("uninstall_manager_fragment_account_name", str);
            apVar.m600f(bundle2);
            apVar.m6251a(C1473m.f7980a.dn());
            apVar.mo2580a(c2495w);
            aw a2 = H_().mo284a();
            a2.mo323a((int) C7582R.anim.play_fade_in, (int) C7582R.anim.fade_out);
            a2.mo326a(C7582R.id.main_layout, apVar, "uninstall_manager_app_selection_fragment");
            a2.mo334c();
        }
    }

    public final void mo4266d(int i) {
        switch (i) {
            case 1:
                int i2;
                if (VERSION.SDK_INT > 19) {
                    this.f23416I.setVisibility(8);
                } else {
                    LayoutParams layoutParams = this.f23416I.getLayoutParams();
                    this.f23418K = layoutParams.width;
                    this.f23419L = layoutParams.height;
                    layoutParams.width = 1;
                    layoutParams.height = 1;
                    this.f23416I.setLayoutParams(layoutParams);
                }
                ab H_ = H_();
                if (this.f23417J) {
                    i2 = C7582R.string.uninstall_manager_app_uninstallation_confirmation_update;
                } else {
                    i2 = C7582R.string.uninstall_manager_app_uninstallation_confirmation_install;
                }
                new C1508k().m8852a(getResources().getString(i2, new Object[]{this.f23414G.f14885a.f12100g})).m8849a(5522, null, 5525, 5526, this.f6316C.m13366a(C1473m.f7980a.mo2041U().mo1183b(this.f23415H))).m8860d((int) C7582R.string.continue_text).m8862e((int) C7582R.string.uninstall_manager_back_label).mo2272a().m625a(H_, "uninstall_manager_confirmation_dialog");
                return;
            case 2:
                C1473m.f7980a.bw().m16744a(new C3366j(this.f6316C.m13375a("single_install"), this.f23414G).m16815b(this.f23415H).m16806a());
                setResult(-1);
                finish();
                return;
            default:
                return;
        }
    }

    public final C3748a y_() {
        return null;
    }

    public final C0950c mo1243l() {
        return null;
    }

    public final void mo1241c(String str) {
    }

    public final void mo1237a(int i, boolean z) {
    }

    public final void mo1236a(int i, int i2, boolean z) {
    }

    public final void mo1235a(int i, int i2, int i3, boolean z) {
    }

    public final void mo1242d(String str) {
    }

    public final void mo1246z() {
    }

    public final void mo1240c(int i) {
    }

    public final void a_(C2495w c2495w) {
    }

    public final void mo1244m() {
    }

    public final void mo1238a(String str, String str2, C2495w c2495w) {
    }

    public final C4695b mo1234A() {
        return null;
    }

    public final void mo1202a(int i, Bundle bundle) {
        int i2;
        if (this.f23417J) {
            i2 = C7582R.string.uninstall_manager_app_uninstallation_progress_update;
        } else {
            i2 = C7582R.string.uninstall_manager_app_uninstallation_progress_install;
        }
        Toast.makeText(this, getResources().getString(i2, new Object[]{this.f23414G.f14885a.f12100g}), 1).show();
        ap apVar = (ap) H_().mo283a("uninstall_manager_app_selection_fragment");
        apVar.bw.m13367a(new C2474c(150).m13236a(apVar.f23504a.m14625N().f13171k));
        for (C4604s c4604s : apVar.ah) {
            apVar.f23507h.mo3445b(c4604s.f23653a, false);
        }
        if (apVar.f23506f != null) {
            apVar.f23506f.mo4266d(2);
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        if (VERSION.SDK_INT > 19) {
            this.f23416I.setVisibility(0);
            return;
        }
        LayoutParams layoutParams = this.f23416I.getLayoutParams();
        layoutParams.width = this.f23418K;
        layoutParams.height = this.f23419L;
        this.f23416I.setLayoutParams(layoutParams);
    }
}

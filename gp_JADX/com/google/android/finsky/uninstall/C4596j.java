package com.google.android.finsky.uninstall;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bn.C2131e;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C4596j extends Fragment implements ad, C1031w, C1056b {
    public ArrayList f23616a;
    public ad af;
    public ce ag = C2482j.m13283a(5522);
    public C2495w f23617b;
    public String f23618c;
    public ArrayList f23619d;
    public boolean f23620e;
    public C3300k f23621f = C1473m.f7980a.mo2256o();
    public LinearLayout f23622g;
    public ButtonBar f23623h;
    public TextView f23624i;

    public static C4596j m21399a(String str, ArrayList arrayList, Boolean bool) {
        Bundle bundle = new Bundle();
        Fragment c4596j = new C4596j();
        bundle.putSerializable("uninstall_manager_fragment_uninstalling_docs", arrayList);
        bundle.putString("uninstall_manager_fragment_account_name", str);
        bundle.putBoolean("uninstall_manager_fragment_update_flag", bool.booleanValue());
        c4596j.m600f(bundle);
        return c4596j;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        Bundle bundle2 = this.f760q;
        this.f23618c = bundle2.getString("uninstall_manager_fragment_account_name");
        this.f23619d = (ArrayList) bundle2.getSerializable("uninstall_manager_fragment_uninstalling_docs");
        this.f23620e = bundle2.getBoolean("uninstall_manager_fragment_update_flag");
        this.ag.e = new cf();
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23622g = (LinearLayout) layoutInflater.inflate(C7582R.layout.uninstall_manager_confirmation_fragment, viewGroup, false);
        this.f23623h = (ButtonBar) this.f23622g.findViewById(C7582R.id.uninstall_manager_button_bar);
        this.f23624i = (TextView) this.f23622g.findViewById(C7582R.id.uninstall_manager_confirmation_message);
        this.f23617b = ((UninstallManagerActivityV2) m603h()).f6316C;
        this.f23623h.setPositiveButtonTitle((int) C7582R.string.uninstall_manager_delete_label);
        this.f23623h.setNegativeButtonTitle((int) C7582R.string.uninstall_manager_back_label);
        this.f23623h.setClickListener(this);
        C4594h c4594h = ((UninstallManagerActivityV2) m603h()).f23427N;
        bq bqVar = c4594h.f23607d;
        if (c4594h.f23608e) {
            this.f23616a = bqVar.mo4274e();
            m21398W();
        } else if (bqVar != null) {
            bqVar.mo4269a((C1031w) this);
        }
        return this.f23622g;
    }

    public final void m_() {
        bq bqVar = ((UninstallManagerActivityV2) m603h()).f23427N.f23607d;
        this.f23616a = bqVar.mo4274e();
        bqVar.mo4272b(this);
        m21398W();
    }

    private final void m21398W() {
        int size = this.f23619d.size();
        if (size == 0) {
            FinskyLog.m21669e("Confirmation without any apps?", new Object[0]);
            return;
        }
        CharSequence string;
        String str = ((C4604s) this.f23619d.get(0)).f23654b;
        Resources i = m605i();
        if (size == 1) {
            string = i.getString(C7582R.string.uninstall_manager_confirmation_message_single_app, new Object[]{str});
        } else {
            string = i.getString(C7582R.string.uninstall_manager_confirmation_message_multiple_apps, new Object[]{str, Integer.valueOf(size - 1)});
        }
        this.f23624i.setText(string);
        this.af.mo1219a(this);
        this.f23622g.setVisibility(0);
    }

    public final void mo138d() {
        this.f23623h = null;
        this.f23622g = null;
        this.f23624i = null;
        super.mo138d();
    }

    public final void v_() {
        this.f23617b.m13379b(new C2475d(this).m13256a(5526));
        ((UninstallManagerActivityV2) m603h()).f23427N.m21396a(0);
    }

    public final void u_() {
        CharSequence string;
        int i = 0;
        this.f23617b.m13379b(new C2475d(this).m13256a(5525));
        Resources i2 = m605i();
        int size = this.f23616a.size();
        if (size == 0) {
            string = i2.getString(C7582R.string.uninstall_manager_cleanup_wizard_confirmation);
        } else if (this.f23620e) {
            string = i2.getQuantityString(C7582R.plurals.uninstall_manager_app_uninstallation_progress_updates_v2, size);
        } else {
            string = i2.getQuantityString(C7582R.plurals.uninstall_manager_app_uninstallation_progress_installs_v2, size);
        }
        Toast.makeText(m603h(), string, 1).show();
        ArrayList arrayList = this.f23616a;
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            this.f23617b.m13367a(new C2474c(150).m13236a(((Document) obj).m14625N().f13171k));
        }
        arrayList = this.f23619d;
        size2 = arrayList.size();
        i3 = 0;
        while (i3 < size2) {
            obj = arrayList.get(i3);
            i3++;
            C4604s c4604s = (C4604s) obj;
            C1473m.f7980a.mo2029I().f18022b.mo2660a(new C2131e(c4604s.f23653a).m11161a(this.f23617b.m13381c()));
            this.f23621f.mo3445b(c4604s.f23653a, false);
        }
        arrayList = this.f23616a;
        i3 = arrayList.size();
        while (i < i3) {
            obj = arrayList.get(i);
            i++;
            C1473m.f7980a.bw().m16744a(new C3366j(this.f23617b.m13375a("single_install"), (Document) obj).m16815b(this.f23618c).m16806a());
        }
        m603h().setResult(-1);
        m603h().finish();
    }

    public final ce getPlayStoreUiElement() {
        return this.ag;
    }

    public final ad getParentNode() {
        return this.af;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}

package com.google.android.finsky.uninstall.v2a;

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
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C4612e extends Fragment implements ad, C1031w, C1056b {
    public ArrayList f23749a;
    public ad af;
    public ce ag;
    public C2495w f23750b;
    public String f23751c;
    public ArrayList f23752d;
    public boolean f23753e;
    public C3300k f23754f = C1473m.f7980a.mo2256o();
    public LinearLayout f23755g;
    public ButtonBar f23756h;
    public TextView f23757i;

    public static C4612e m21530a(String str, ArrayList arrayList, Boolean bool) {
        Bundle bundle = new Bundle();
        Fragment c4612e = new C4612e();
        bundle.putSerializable("uninstall_manager_fragment_uninstalling_docs", arrayList);
        bundle.putString("uninstall_manager_fragment_account_name", str);
        bundle.putBoolean("uninstall_manager_fragment_update_flag", bool.booleanValue());
        c4612e.m600f(bundle);
        return c4612e;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        Bundle bundle2 = this.f760q;
        this.f23751c = bundle2.getString("uninstall_manager_fragment_account_name");
        this.f23752d = (ArrayList) bundle2.getSerializable("uninstall_manager_fragment_uninstalling_docs");
        this.f23753e = bundle2.getBoolean("uninstall_manager_fragment_update_flag");
        this.ag = C2482j.m13283a(m21529Z().f23823m.mo4288b());
        this.ag.e = new cf();
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23755g = (LinearLayout) layoutInflater.inflate(C7582R.layout.uninstall_manager_confirmation_fragment, viewGroup, false);
        this.f23756h = (ButtonBar) this.f23755g.findViewById(C7582R.id.uninstall_manager_button_bar);
        this.f23757i = (TextView) this.f23755g.findViewById(C7582R.id.uninstall_manager_confirmation_message);
        this.f23750b = m21529Z().f23821k;
        this.f23756h.setPositiveButtonTitle((int) C7582R.string.uninstall_manager_delete_label);
        this.f23756h.setNegativeButtonTitle((int) C7582R.string.uninstall_manager_back_label);
        this.f23756h.setClickListener(this);
        ak akVar = m21529Z().f23815e.f23835c;
        if (m21529Z().f23815e.mo968W()) {
            this.f23749a = akVar.mo4305d();
            m21528W();
        } else {
            akVar.mo4300a((C1031w) this);
        }
        return this.f23755g;
    }

    public final void m_() {
        ak akVar = m21529Z().f23815e.f23835c;
        this.f23749a = akVar.mo4305d();
        akVar.mo4303b(this);
        m21528W();
    }

    private final void m21528W() {
        CharSequence string;
        int size = this.f23752d.size();
        String str = ((am) this.f23752d.get(0)).f23735b;
        Resources i = m605i();
        if (size == 1) {
            string = i.getString(C7582R.string.uninstall_manager_confirmation_message_single_app, new Object[]{str});
        } else {
            string = i.getString(C7582R.string.uninstall_manager_confirmation_message_multiple_apps, new Object[]{str, Integer.valueOf(size - 1)});
        }
        this.f23757i.setText(string);
        this.af.mo1219a(this);
        this.f23755g.setVisibility(0);
    }

    public final void mo138d() {
        this.f23756h = null;
        this.f23755g = null;
        this.f23757i = null;
        super.mo138d();
    }

    public final void v_() {
        this.f23750b.m13379b(new C2475d(this).m13256a(m21529Z().f23823m.mo4292f()));
        m21529Z().m21571a(0);
    }

    public final void u_() {
        int i = 0;
        this.f23750b.m13379b(new C2475d(this).m13256a(m21529Z().f23823m.mo4291e()));
        Toast.makeText(m603h(), m21529Z().f23828r.mo4295a(this.f23753e, this.f23749a.size()), 1).show();
        ArrayList arrayList = this.f23749a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            this.f23750b.m13367a(new C2474c(m21529Z().f23823m.mo4293g()).m13236a(((Document) obj).m14625N().f13171k));
        }
        arrayList = this.f23752d;
        size = arrayList.size();
        i2 = 0;
        while (i2 < size) {
            obj = arrayList.get(i2);
            i2++;
            am amVar = (am) obj;
            C1473m.f7980a.mo2029I().f18022b.mo2660a(new C2131e(amVar.f23734a).m11161a(this.f23750b.m13381c()));
            this.f23754f.mo3445b(amVar.f23734a, false);
        }
        arrayList = this.f23749a;
        i2 = arrayList.size();
        while (i < i2) {
            obj = arrayList.get(i);
            i++;
            C1473m.f7980a.bw().m16744a(new C3366j(this.f23750b.m13375a("single_install"), (Document) obj).m16815b(this.f23751c).m16806a());
        }
        m603h().finish();
    }

    private final C4626s m21529Z() {
        return ((C4607w) m603h()).mo1276k();
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

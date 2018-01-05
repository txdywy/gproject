package com.google.android.finsky.detailspage;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C1002e;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.dn.C2834b;
import com.google.android.finsky.dn.C2836d;
import com.google.android.finsky.frameworkviews.AccessibleTextView;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class fd extends ck implements OnClickListener, C0999d, ad, C1002e {
    public final C2833a f14565d = C1473m.f7980a.mo2253l();
    public boolean f14566e;
    public ce f14567f = C2482j.m13283a(1850);

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.testing_program_module;
    }

    public final boolean mo2979f() {
        return this.b != null && this.f14566e;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (z && document2 != null && this.b == null && document2.bS()) {
            this.b = new ff();
            ((ff) this.b).f14568a = document2;
            this.f14566e = m14323b();
            this.D.mo2814a((C0999d) this);
            this.f14565d.m14984a((C1002e) this);
            m14322a();
        }
    }

    public final void mo2976b(View view, int i) {
        int i2;
        int i3 = 0;
        TestingProgramModuleLayout testingProgramModuleLayout = (TestingProgramModuleLayout) view.findViewById(C7582R.id.testing_program_card);
        if (((ff) this.b).f14569b) {
            i2 = 2;
        } else {
            i2 = this.f14565d.m14983a(((ff) this.b).f14568a, C1473m.f7980a.cY());
        }
        OnClickListener feVar = new fe();
        Resources resources = testingProgramModuleLayout.getResources();
        switch (i2) {
            case 0:
                testingProgramModuleLayout.f14076a.setText(resources.getString(C7582R.string.testing_program_section_opted_out_title));
                testingProgramModuleLayout.f14079d.setText(resources.getString(C7582R.string.testing_program_im_in).toUpperCase());
                testingProgramModuleLayout.f14077b.setText(resources.getString(C7582R.string.testing_program_section_opted_out_message));
                break;
            case 1:
                testingProgramModuleLayout.f14076a.setText(resources.getString(C7582R.string.testing_program_section_opted_out_propagating_title));
                testingProgramModuleLayout.f14079d.setText(resources.getString(C7582R.string.testing_program_rejoin).toUpperCase());
                testingProgramModuleLayout.f14077b.setText(resources.getString(C7582R.string.testing_program_section_opted_out_propagating_message));
                break;
            case 2:
                testingProgramModuleLayout.f14076a.setText(resources.getString(C7582R.string.testing_program_section_cap_reached_title));
                testingProgramModuleLayout.f14079d.setVisibility(8);
                testingProgramModuleLayout.f14077b.setText(resources.getString(C7582R.string.testing_program_section_cap_reached_message));
                break;
            case 3:
                testingProgramModuleLayout.f14076a.setText(resources.getString(C7582R.string.testing_program_section_opted_in_title));
                testingProgramModuleLayout.f14079d.setText(resources.getString(C7582R.string.testing_program_opt_out).toUpperCase());
                testingProgramModuleLayout.f14077b.setText(resources.getString(C7582R.string.testing_program_section_opted_in_message));
                break;
            case 4:
                testingProgramModuleLayout.f14076a.setText(resources.getString(C7582R.string.testing_program_section_opted_in_propagating_title));
                testingProgramModuleLayout.f14079d.setText(resources.getString(C7582R.string.testing_program_opt_out).toUpperCase());
                testingProgramModuleLayout.f14077b.setText(resources.getString(C7582R.string.testing_program_section_opted_in_propagating_message));
                break;
        }
        if (i2 == 3 || i2 == 4 || i2 == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        AccessibleTextView accessibleTextView = testingProgramModuleLayout.f14078c;
        if (i2 == 0) {
            i3 = 8;
        }
        accessibleTextView.setVisibility(i3);
        testingProgramModuleLayout.f14078c.setOnClickListener(feVar);
        testingProgramModuleLayout.f14079d.setOnClickListener(this);
        getParentNode().mo1219a(this);
    }

    public final void mo2980h() {
        this.D.mo2819b(this);
        this.f14565d.m14988b((C1002e) this);
    }

    public void onClick(View view) {
        C1508k c1508k = new C1508k();
        Resources resources = C1473m.f7980a.f7981b.getResources();
        switch (this.f14565d.m14983a(((ff) this.b).f14568a, C1473m.f7980a.cY())) {
            case 0:
            case 1:
                this.J.m13379b(new C2475d(this).m13256a(1851));
                c1508k.m8859c(resources.getString(C7582R.string.testing_program_opt_in_dialog_title)).m8852a(resources.getString(C7582R.string.testing_program_opt_in_dialog_message)).m8860d((int) C7582R.string.testing_program_opt_in).m8862e((int) C7582R.string.cancel).m8851a(this.A, 8, new Bundle());
                break;
            case 3:
            case 4:
                int i;
                this.J.m13379b(new C2475d(this).m13256a(1852));
                if (((ff) this.b).f14568a.bU()) {
                    i = C7582R.string.testing_program_opt_out_dialog_message_cap_reached;
                } else {
                    i = C7582R.string.testing_program_opt_out_dialog_message;
                }
                c1508k.m8859c(resources.getString(C7582R.string.testing_program_opt_out_dialog_title)).m8860d((int) C7582R.string.testing_program_opt_out).m8862e((int) C7582R.string.cancel).m8851a(this.A, 9, new Bundle()).m8852a(resources.getString(i));
                break;
            default:
                FinskyLog.m21669e("Unexpected opt status.", new Object[0]);
                break;
        }
        c1508k.mo2272a().m625a(this.z.mo3708j(), "BetaOptInModule.confirmDialog");
    }

    private final void m14322a() {
        int a = this.f14565d.m14983a(((ff) this.b).f14568a, C1473m.f7980a.cY());
        if (((ff) this.b).f14569b || a == 4 || a == 1) {
            this.x.mo1643d(this.B);
        }
    }

    private final boolean m14323b() {
        return C1473m.f7980a.mo2045Y().m11647a(((ff) this.b).f14568a, this.D.mo2811a(C1473m.f7980a.cY()));
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (i == 8 || i == 9) {
            C2833a c2833a = this.f14565d;
            Document document = ((ff) this.b).f14568a;
            C1254c c1254c = this.x;
            if (document == null) {
                FinskyLog.m21665c("Tried to opt in testing program but there is no document active", new Object[0]);
            } else if (!c2833a.m14987a(document.f14885a.f12096c)) {
                Account cY = c2833a.f15225d.cY();
                boolean b = c2833a.m14990b(document, cY);
                String str = document.f14885a.f12096c;
                Resources resources = c2833a.f15222a.getResources();
                C0660x c2834b = new C2834b(c2833a, resources, b, str, cY, document);
                C0657w c2836d = new C2836d(c2833a, resources, b, str);
                c2833a.f15228g.add(str);
                c2833a.m14985a(str, false);
                c1254c.mo1641d(str, !b, c2834b, c2836d);
            }
        }
    }

    public final void mo1215d(String str, boolean z) {
        if (((ff) this.b).f14568a.f14885a.f12096c.equals(str)) {
            this.u.mo3033a(this, false);
            ((ff) this.b).f14569b = z;
            m14322a();
        }
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        boolean b = m14323b();
        if (this.f14566e != b) {
            this.f14566e = b;
            if (this.f14566e) {
                this.u.mo3033a(this, true);
            } else {
                this.u.mo3032a(this);
            }
        }
    }

    public ce getPlayStoreUiElement() {
        return this.f14567f;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((ff) c2600d);
        if (this.b != null) {
            this.f14566e = m14323b();
            this.D.mo2814a((C0999d) this);
            this.f14565d.m14984a((C1002e) this);
        }
    }
}

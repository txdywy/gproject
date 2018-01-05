package com.google.android.finsky.dn;

import android.accounts.Account;
import android.content.res.Resources;
import android.widget.Toast;
import com.android.volley.C0660x;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.a.a.q;
import com.squareup.leakcanary.C7582R;

public final class C2834b implements C0660x {
    public final /* synthetic */ Resources f15229a;
    public final /* synthetic */ boolean f15230b;
    public final /* synthetic */ String f15231c;
    public final /* synthetic */ Account f15232d;
    public final /* synthetic */ Document f15233e;
    public final /* synthetic */ C2833a f15234f;

    public C2834b(C2833a c2833a, Resources resources, boolean z, String str, Account account, Document document) {
        this.f15234f = c2833a;
        this.f15229a = resources;
        this.f15230b = z;
        this.f15231c = str;
        this.f15232d = account;
        this.f15233e = document;
    }

    public final /* synthetic */ void b_(Object obj) {
        q qVar = (q) obj;
        if (((qVar.a & 1) != 0 ? 1 : 0) != 0) {
            boolean z;
            if (qVar.b == 1) {
                Toast.makeText(this.f15234f.f15222a, this.f15229a.getString(C7582R.string.testing_program_opt_in_cap_full_error), 1).show();
                z = true;
            } else if (qVar.b == 2) {
                Toast.makeText(this.f15234f.f15222a, this.f15229a.getString(C7582R.string.testing_program_opt_in_beta_ended_error), 1).show();
                z = false;
            } else if (qVar.b == 0) {
                int i;
                C2833a c2833a = this.f15234f;
                Resources resources = this.f15229a;
                if (this.f15230b) {
                    i = C7582R.string.testing_program_opt_out_error;
                } else {
                    i = C7582R.string.testing_program_opt_in_error;
                }
                Toast.makeText(c2833a.f15222a, resources.getString(i), 1).show();
                z = false;
            } else {
                FinskyLog.m21669e("Unknown opt status from TestingProgramOptResponse", new Object[0]);
                z = false;
            }
            this.f15234f.f15228g.remove(this.f15231c);
            this.f15234f.m14985a(this.f15231c, z);
            return;
        }
        this.f15234f.f15224c.mo2796a(this.f15232d, "modifed_testing_program", new C2835c(this), qVar.c);
    }
}

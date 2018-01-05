package com.google.android.finsky.preregistration;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.android.volley.C0657w;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.bn;

public final class C3930c extends C1128e implements OnDismissListener, OnCheckedChangeListener {
    public C3934g af;
    public C2162a ag;
    public PreregistrationDialogView am;

    public final Dialog mo143a(Bundle bundle) {
        Dialog a = super.mo143a(bundle);
        ((C1410q) C3947d.m18649a(C1410q.class)).mo1895a(this);
        this.am = (PreregistrationDialogView) this.al;
        if (this.am.m18622a()) {
            this.am.setCheckboxStateChangeListener(this);
        }
        a.setOnDismissListener(this);
        return a;
    }

    protected final void ab() {
        super.ab();
        ae();
    }

    protected final void mo968W() {
        super.mo968W();
        Document document = this.am.getDocument();
        if (document == null) {
            FinskyLog.m21669e("PreregistrationDialog unable to retrieve its document from its view", new Object[0]);
            return;
        }
        this.ag.mo2696a(m603h(), document.f14885a.f12117x, document.ae(), document.f14885a.f12100g);
        ae();
    }

    private final void ad() {
        boolean z;
        C3934g c3934g;
        C2495w c2495w;
        C0657w c3931d;
        bn e;
        int i = 1;
        PreregistrationDialogView preregistrationDialogView = this.am;
        if (preregistrationDialogView.f19884c == null) {
            FinskyLog.m21669e("checkbox should be there in prereg v2 dialog", new Object[0]);
        } else if (preregistrationDialogView.f19884c.getVisibility() == 0 && preregistrationDialogView.f19884c.isChecked()) {
            z = true;
            if (!z) {
                i = 2;
            }
            c3934g = this.af;
            c2495w = this.ai;
            c3931d = new C3931d(this, z);
            e = c3934g.f19904i.m15194e(c3934g.f19905j.cZ(), 2);
            if (e != null) {
                FinskyLog.m21669e("Couldn't find setting for PRE_REGISTRATION_AVAILABLE notifications", new Object[0]);
            }
            byte[] bArr = e.g;
            c3934g.f19904i.m15185a(c3934g.f19905j.cZ(), 2, i, new C3938k(c2495w, i, e.f, bArr), c3931d);
            return;
        }
        z = false;
        if (z) {
            i = 2;
        }
        c3934g = this.af;
        c2495w = this.ai;
        c3931d = new C3931d(this, z);
        e = c3934g.f19904i.m15194e(c3934g.f19905j.cZ(), 2);
        if (e != null) {
            byte[] bArr2 = e.g;
            c3934g.f19904i.m15185a(c3934g.f19905j.cZ(), 2, i, new C3938k(c2495w, i, e.f, bArr2), c3931d);
            return;
        }
        FinskyLog.m21669e("Couldn't find setting for PRE_REGISTRATION_AVAILABLE notifications", new Object[0]);
    }

    private final void ae() {
        if (!C3934g.m18633c(this.af.f19905j.cZ()) && this.am.m18622a()) {
            ad();
            this.af.m18635a();
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ad();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ae();
    }
}

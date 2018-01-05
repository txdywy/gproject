package com.google.android.finsky.preregistration;

import android.os.Bundle;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2471a;
import com.squareup.leakcanary.C7582R;

public final class C3932e {
    public final C2471a f19894a;

    public C3932e(C2471a c2471a) {
        this.f19894a = c2471a;
    }

    final C3930c m18627a(Document document, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        Bundle bundle = new Bundle();
        bundle.putParcelable("PreregistrationDialogView.document", document);
        C1128e c3930c = new C3930c();
        if (z) {
            bundle.putBoolean("PreregistrationDialogView.show_opt_in", z2);
            if (z2) {
                bundle.putBoolean("PreregistrationDialogView.check_checkbox", z3);
            }
            i = C7582R.layout.preregistration_dialog_v2;
            i2 = C7582R.string.ok;
            i3 = C7582R.string.preregistration_dialog_negative_button_v2;
        } else {
            i = C7582R.layout.preregistration_dialog;
            i2 = C7582R.string.preregistration_dialog_positive_button;
            i3 = C7582R.string.share;
        }
        C1508k c1508k = new C1508k();
        c1508k.m8855b(i).m8850a(bundle).m8860d(i2).m8862e(i3).m8857b(false).m8849a(321, null, -1, 202, this.f19894a.m13184a(null));
        c1508k.m8854a(c3930c);
        return c3930c;
    }
}

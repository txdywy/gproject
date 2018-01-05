package com.google.android.finsky.activities;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

final class cy implements OnClickListener {
    public final /* synthetic */ Document f6648a;
    public final /* synthetic */ Account f6649b;
    public final /* synthetic */ cu f6650c;

    cy(cu cuVar, Document document, Account account) {
        this.f6650c = cuVar;
        this.f6648a = document;
        this.f6649b = account;
    }

    public final void onClick(View view) {
        ab abVar = this.f6650c.f6516A.f730B;
        if (abVar.mo283a("DetailsSummaryViewBinder.confirm_cancel_dialog") == null) {
            this.f6650c.m6350d(235);
            String string = this.f6650c.f6517B.getResources().getString(C7582R.string.confirm_preorder_cancel, new Object[]{this.f6648a.f14885a.f12100g});
            C1508k c1508k = new C1508k();
            c1508k.m8852a(string).m8860d((int) C7582R.string.yes).m8862e((int) C7582R.string.no).m8849a(305, this.f6648a.f14885a.f12087D, 245, 246, this.f6650c.f6534S);
            Bundle bundle = new Bundle();
            bundle.putParcelable("DetailsSummaryViewBinder.doc", this.f6648a);
            bundle.putString("DetailsSummaryViewBinder.ownerAccountName", this.f6649b.name);
            c1508k.m8851a(this.f6650c.f6516A, 7, bundle);
            c1508k.mo2272a().m625a(abVar, "DetailsSummaryViewBinder.confirm_cancel_dialog");
        }
    }
}

package com.google.android.finsky.dialogbuilder;

import android.content.Context;
import android.support.v4.p037h.C0304u;
import android.support.v4.p037h.C0305a;
import android.support.v7.view.C0455e;
import android.view.LayoutInflater;
import com.google.wireless.android.finsky.dfe.c.a.ct;
import com.squareup.leakcanary.C7582R;

public final class C2795c {
    public LayoutInflater f15102a;
    public C0305a f15103b = new C0305a();

    public C2795c(LayoutInflater layoutInflater) {
        this.f15102a = layoutInflater;
    }

    public final LayoutInflater m14883a(ct ctVar) {
        int i = 0;
        if (ctVar != null) {
            i = ctVar.b;
        }
        if (!this.f15103b.containsKey(Integer.valueOf(i))) {
            int i2;
            C0304u c0304u = this.f15103b;
            Integer valueOf = Integer.valueOf(i);
            LayoutInflater layoutInflater = this.f15102a;
            Context context = this.f15102a.getContext();
            switch (i) {
                case 1:
                    i2 = C7582R.style.PurchaseDialog.Apps;
                    break;
                case 2:
                    i2 = C7582R.style.PurchaseDialog.Ocean;
                    break;
                case 3:
                    i2 = C7582R.style.PurchaseDialog.Magazines;
                    break;
                case 4:
                    i2 = C7582R.style.PurchaseDialog.Youtube;
                    break;
                case 5:
                    i2 = C7582R.style.PurchaseDialog.Music;
                    break;
                case 6:
                    i2 = C7582R.style.PurchaseDialog.Enterprise;
                    break;
                default:
                    i2 = C7582R.style.PurchaseDialog;
                    break;
            }
            c0304u.put(valueOf, layoutInflater.cloneInContext(new C0455e(context, i2)));
        }
        return (LayoutInflater) this.f15103b.get(Integer.valueOf(i));
    }
}

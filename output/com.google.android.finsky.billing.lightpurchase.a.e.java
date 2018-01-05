package com.google.android.finsky.billing.lightpurchase.a;

import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.wireless.android.finsky.a.a.ad;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.billing.lightpurchase.a.e implements Runnable
{

    public final List a;
    public final com.google.android.finsky.billing.lightpurchase.a.a b;

    e(com.google.android.finsky.billing.lightpurchase.a.a p0, List p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        v4 = this.a.iterator();
        while (v4.hasNext()) {
            v0 = (com.google.wireless.android.finsky.a.a.ad)v4.next();
            switch (v0.c) {
                case 1:
                    v3 = this.b.af;
                    v1 = v3.getHint().toString();
                    break;
                case 2:
                    v3 = this.b.ag;
                    v1 = v3.getHint().toString();
                    break;
                case 3:
                    v1 = 0;
                    v3 = 0;
                    break;
                case 4:
                    v3 = this.b.aj;
                    v1 = v3.getHint().toString();
                    break;
                case 5:
                    v1 = 0;
                    v3 = 0;
                    break;
                case 6:
                    v3 = this.b.ao;
                    v1 = this.b.an.getText().toString();
                    break;
                default:
                    v1 = 0;
                    v3 = 0;
                    break;
            }
            if (v3 != 0)
                com.google.android.finsky.bg.ae.a(v3, v1, v0.d);
        }
    }

}

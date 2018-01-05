package com.google.android.finsky.billing.profile;

import android.text.TextUtils;
import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.google.wireless.android.finsky.dfe.nano.v;

public final class com.google.android.finsky.billing.profile.h implements View$OnClickListener
{

    public final View a;
    public final com.google.wireless.android.finsky.dfe.nano.v b;
    public final com.google.android.finsky.billing.profile.c c;

    h(com.google.android.finsky.billing.profile.c p0, View p1, com.google.wireless.android.finsky.dfe.nano.v p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
  2:    v0 = 0;
 21:    if (this.c.e.al != 0) goto 51;
 27:    if (this.c.e.l == 8)
 31:        this.c.e.b(3, this.c.e.af);
        else
 47:        this.c.e.b(1, 0);
 34:    if (v0 != 0) {
 38:        v0.onClick(this.a);
 43:        this.c.aw = 0;
        }
 45:    return;
 56:    v2 = 0;
 57:    if (v2 >= this.c.e.al.d.length) goto 110;
 59:    v1 = this.c.e.al.d[v2];
 69:    if (!TextUtils.equals(v1.e, this.b.e)) goto 95;
 71:    if (v1 == 0) {
 88:        this.c.af.a(new com.google.android.finsky.d.c(392).b(this.b.h).a, 0);
 91:        this.c.e.b(3, 3);
        }
        else
107:        v0 = this.c.e.a(v1, this.c.e.al.e, this.c.getParentNode(), this.c.af).f;
 94:    goto 34;
 97:    v2 = v2 + 1;
 98:    goto 57;
110:    v1 = 0;
111:    goto 71;
    }

}

package com.google.android.finsky.billing.acquire.a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.billing.acquire.d;
import com.google.android.finsky.dialogbuilder.a.l;
import com.google.android.finsky.dialogbuilder.e;
import com.google.android.finsky.dialogbuilder.j;
import com.google.android.finsky.providers.d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.x;

public final class com.google.android.finsky.billing.acquire.a.i extends com.google.android.finsky.dialogbuilder.a.l
{

    public com.google.android.finsky.dialogbuilder.j a;
    public final com.google.wireless.android.finsky.dfe.c.a.x b;
    public TextView c;
    public FifeImageView d;

    i(LayoutInflater p0, com.google.wireless.android.finsky.dfe.c.a.x p1) {
        com.google.android.finsky.dialogbuilder.a.l(p0);
        ((com.google.android.finsky.billing.acquire.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.acquire.d)).a(this);
        this.b = p1;
    }

    public final int a() {
        return 2130969583;
    }

    public final void a(com.google.android.finsky.dialogbuilder.e p0, View p1) {
        this.a.a(this.b.a, (ImageView)p1.findViewById(2131755231), p0);
        this.a.a(this.b.b, (TextView)p1.findViewById(2131755114), p0, new Object[0]);
        this.c = (TextView)p1.findViewById(2131755312);
        this.a.a(this.b.c, (TextView)p1.findViewById(2131755312), p0, new Object[0]);
        this.c.setVisibility(8);
        this.d = (FifeImageView)p1.findViewById(2131756951);
        this.a.a(this.b.d, this.d, p0);
        if (this.b.c != 0)
            p1.setOnClickListener(new com.google.android.finsky.billing.acquire.a.j(this, p0));
    }

}

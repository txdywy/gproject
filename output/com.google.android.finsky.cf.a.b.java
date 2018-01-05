package com.google.android.finsky.cf.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.g;
import android.support.design.widget.x;
import android.widget.TextView;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.bg.h;
import java.util.Locale;

public final class com.google.android.finsky.cf.a.b implements Runnable
{

    public final Context a;
    public final Resources b;
    public final com.google.android.finsky.cf.a.a c;

    b(com.google.android.finsky.cf.a.a p0, Context p1, Resources p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        if (!com.google.android.finsky.cf.a.a.c(this.a) && !((Boolean)com.google.android.finsky.aa.a.E.a()).booleanValue()) {
            if (Build$VERSION.SDK_INT <= 22)
                v1 = 0;
            else
                v1 = 10000;
            this.c.g = Snackbar.a(this.c.c, 2131952609, v1);
            switch (this.c.d.a()) {
                case 1:
                    v0 = 2131558652;
                    break;
                case 2:
                    v0 = 2131558728;
                    break;
                case 3:
                    v0 = 2131558634;
                    break;
                case 4:
                    v0 = 2131558708;
                    break;
                case 5:
                    if (com.google.android.finsky.bg.h.b != 0)
                        v0 = 2131558634;
                    else
                        v0 = 2131558717;
                    break;
                case 6:
                    v0 = 2131558739;
                    break;
                default:
                    if (com.google.android.finsky.bg.h.b != 0)
                        v0 = 2131558634;
                    else
                        v0 = 2131558717;
                    break;
            }
            ((SnackbarContentLayout)this.c.g.e.getChildAt(0)).getActionView().setTextColor(this.b.getColor(v0));
            this.c.g.a(this.b.getString(2131952608).toUpperCase(Locale.getDefault()), new com.google.android.finsky.cf.a.c(this, com.google.android.finsky.aa.a.E, v1));
            this.c.g.a();
            if (this.c.f != 0)
                this.c.f.a();
        }
    }

}

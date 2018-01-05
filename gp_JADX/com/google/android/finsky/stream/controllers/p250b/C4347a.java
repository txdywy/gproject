package com.google.android.finsky.stream.controllers.p250b;

import android.view.View;
import com.google.android.finsky.frameworkviews.C1098i;
import com.google.android.finsky.frameworkviews.ErrorFooter;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.stream.base.C1169s;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C4347a extends C1169s implements C1098i {
    public int f21893a;
    public int f21894b;
    public String f21895c;
    public final C4233b f21896d;

    public C4347a(int i, C4233b c4233b) {
        this.f21894b = i;
        this.f21896d = c4233b;
    }

    public final int mo1508a() {
        if (this.f21893a == 0) {
            return 0;
        }
        return 1;
    }

    public final int mo1509a(int i) {
        switch (this.f21893a) {
            case 1:
                return C7582R.layout.loading_footer;
            case 2:
                return C7582R.layout.error_footer;
            case 3:
                return C7582R.layout.padding_footer;
            default:
                FinskyLog.m21669e("Unsupported Footer mode: %d.", Integer.valueOf(this.f21893a));
                return -1;
        }
    }

    public final void mo1510a(View view, int i) {
        if (view instanceof ErrorFooter) {
            ((ErrorFooter) view).m16021a(this.f21895c, this);
        }
    }

    public final void mo1511b(View view, int i) {
        if (view instanceof ae) {
            ((ae) view).Z_();
        }
    }

    public final void Q_() {
        this.f21896d.mo4033c();
    }

    public final void m20218b(int i) {
        if (this.f21893a != i) {
            int i2 = this.f21893a;
            this.f21893a = i;
            if (i == 0) {
                this.C.mo4088b(this, 0, 1);
            } else if (i2 == 0) {
                this.C.mo4086a(this, 0, 1);
            } else {
                this.C.mo4087a(this, 0, 1, true);
            }
        }
    }
}

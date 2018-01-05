package com.google.android.finsky.dialogbuilder.p137a;

import android.text.TextUtils;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.finsky.dialogbuilder.p154b.C2791f;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.wireless.android.finsky.dfe.c.a.cu;
import com.google.wireless.android.finsky.dfe.c.a.cv;

final class ab implements OnCheckedChangeListener {
    public final cu f15009a;
    public final String f15010b;
    public final C2792h f15011c;
    public final C2791f f15012d;
    public final String f15013e;

    ab(cv cvVar, int i, C2792h c2792h, C2791f c2791f) {
        this.f15009a = cvVar.b[i];
        this.f15010b = cvVar.c;
        this.f15011c = c2792h;
        this.f15012d = c2791f;
        this.f15013e = cvVar.e;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!TextUtils.isEmpty(this.f15010b) && z) {
            this.f15011c.m14870a(this.f15010b, this.f15009a.e);
            if (!TextUtils.isEmpty(this.f15013e)) {
                this.f15012d.m14868a(this.f15013e, true);
            }
        }
    }
}

package com.google.android.finsky.billing.addresschallenge;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.i;
import com.google.wireless.android.c.a.a.a;
import com.google.wireless.android.finsky.a.a.am;
import com.google.wireless.android.finsky.a.a.i;
import java.util.ArrayList;

public final class com.google.android.finsky.billing.addresschallenge.c implements com.google.android.finsky.billing.addresschallenge.i
{

    public final com.google.android.finsky.d.a a;
    public final com.google.android.finsky.billing.addresschallenge.d b;
    public final com.google.wireless.android.finsky.a.a.i c;
    public final Bundle d;
    public final boolean e;
    public int f;
    public com.google.android.finsky.d.w g;
    public com.google.android.finsky.billing.addresschallenge.e h;

    c(com.google.android.finsky.billing.addresschallenge.d p0, com.google.wireless.android.finsky.a.a.i p1, Bundle p2, com.google.android.finsky.d.w p3) {
        v0 = 0;
        this.a = com.google.android.finsky.m.a.aR();
        this.f = 0;
        this.b = p0;
        this.c = p1;
        this.d = p2;
        if (p2 != 0 && p2.getBoolean("AddressChallengeFlow.finishOnSwitchCountry"))
            v0 = 1;
        this.e = v0;
        if (p2 != 0 && p2.containsKey("AddressChallengeFlow.resultFormat"))
            this.f = p2.getInt("AddressChallengeFlow.resultFormat");
        this.g = p3;
    }

    private final void a(boolean p0, Bundle p1) {
        this.b.a(p0, p1);
    }

    public final void a(int p0, com.google.wireless.android.c.a.a.a p1, boolean[] p2) {
        if (p0 == 2) {
            this.a(1, 0);
            return;
        }
        if (p0 != 0) {
            if (p0 == 1)
                this.b.k();
            return;
        }
        v2 = new Bundle();
        if (this.f == 0)
            v2.putString(this.c.b, Base64.encodeToString(com.google.protobuf.nano.i.a(p1), 8));
        else if (this.f == 1)
            v2.putParcelable("AddressChallengeFlow.address", ParcelableProto.a(p1));
        v3 = new StringBuilder();
        v4 = new ArrayList();
        v0 = 0;
        while (v0 < p2.length) {
            if (v0 > 0)
                v3.append(44);
            v3.append(String.valueOf(p2[v0]));
            if (p2[v0] != 0)
                v4.add(this.c.f[v0].f);
            v0 = v0 + 1;
        }
        if (this.f == 0)
            v2.putString(this.c.c, v3.toString());
        else
            v2.putStringArrayList("AddressChallengeFlow.checkedCheckboxes", v4);
        this.a(0, v2);
    }

    public final void a(String p0, Bundle p1) {
        if (this.e != 0) {
            v0 = new Bundle();
            v0.putString("AddressChallengeFlow.switchCountry", p0);
            v0.putBundle("AddressChallengeFlow.currentState", p1);
            this.a(0, v0);
        }
    }

}

package com.google.android.finsky.billing.addresschallenge;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.c.a.a.a;
import com.google.wireless.android.finsky.a.a.i;
import java.util.ArrayList;

public final class C1733c implements C1732i {
    public final C2471a f9020a = C1473m.f7980a.aR();
    public final C1701d f9021b;
    public final i f9022c;
    public final Bundle f9023d;
    public final boolean f9024e;
    public int f9025f = 0;
    public C2495w f9026g;
    public C1734e f9027h;

    public C1733c(C1701d c1701d, i iVar, Bundle bundle, C2495w c2495w) {
        boolean z = false;
        this.f9021b = c1701d;
        this.f9022c = iVar;
        this.f9023d = bundle;
        if (bundle != null && bundle.getBoolean("AddressChallengeFlow.finishOnSwitchCountry")) {
            z = true;
        }
        this.f9024e = z;
        if (bundle != null && bundle.containsKey("AddressChallengeFlow.resultFormat")) {
            this.f9025f = bundle.getInt("AddressChallengeFlow.resultFormat");
        }
        this.f9026g = c2495w;
    }

    public final void mo2423a(int i, a aVar, boolean[] zArr) {
        if (i == 2) {
            m9626a(true, null);
        } else if (i == 0) {
            Bundle bundle = new Bundle();
            if (this.f9025f == 0) {
                bundle.putString(this.f9022c.b, Base64.encodeToString(C0757i.m4909a((C0757i) aVar), 8));
            } else if (this.f9025f == 1) {
                bundle.putParcelable("AddressChallengeFlow.address", ParcelableProto.m21671a((C0757i) aVar));
            }
            StringBuilder stringBuilder = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < zArr.length; i2++) {
                if (i2 > 0) {
                    stringBuilder.append(',');
                }
                stringBuilder.append(String.valueOf(zArr[i2]));
                if (zArr[i2]) {
                    arrayList.add(this.f9022c.f[i2].f);
                }
            }
            if (this.f9025f == 0) {
                bundle.putString(this.f9022c.c, stringBuilder.toString());
            } else {
                bundle.putStringArrayList("AddressChallengeFlow.checkedCheckboxes", arrayList);
            }
            m9626a(false, bundle);
        } else if (i == 1) {
            this.f9021b.mo1276k();
        }
    }

    public final void mo2424a(String str, Bundle bundle) {
        if (this.f9024e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("AddressChallengeFlow.switchCountry", str);
            bundle2.putBundle("AddressChallengeFlow.currentState", bundle);
            m9626a(false, bundle2);
        }
    }

    private final void m9626a(boolean z, Bundle bundle) {
        this.f9021b.mo2402a(z, bundle);
    }
}

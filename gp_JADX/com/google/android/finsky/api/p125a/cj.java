package com.google.android.finsky.api.p125a;

import com.google.android.finsky.cv.p177a.ax;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.c.a.w;
import com.google.wireless.android.finsky.dfe.nano.ew;
import com.google.wireless.android.finsky.dfe.nano.ez;
import java.util.Arrays;

final class cj implements dc {
    public String f7452a;
    public final /* synthetic */ ac f7453b;

    cj(ac acVar) {
        this.f7453b = acVar;
    }

    public final String mo1537a(String str) {
        Object obj = null;
        if (this.f7452a == null) {
            StringBuilder stringBuilder = new StringBuilder(str);
            if (this.f7453b.b != null) {
                w wVar = this.f7453b.b;
                if (wVar.c != null) {
                    ax axVar = wVar.c;
                    stringBuilder.append("/docid=").append(axVar.f11835d).append(",").append(axVar.f11834c).append(",").append(axVar.f11833b);
                }
                ez ezVar = this.f7453b.c;
                if (ezVar != null && ezVar.h.length > 0) {
                    stringBuilder.append("/extra=");
                    Arrays.sort(ezVar.h, new ck());
                    for (int i = 0; i < ezVar.h.length; i++) {
                        if (i != 0) {
                            stringBuilder.append("&");
                        }
                        ew ewVar = ezVar.h[i];
                        stringBuilder.append(ewVar.c).append("=");
                        if (ewVar.e()) {
                            stringBuilder.append(ewVar.d);
                        } else if (ewVar.f()) {
                            stringBuilder.append(ewVar.e);
                        } else if (ewVar.g()) {
                            stringBuilder.append(ewVar.f);
                        }
                    }
                }
            }
            if ((this.f7453b.a & 256) != 0) {
                obj = 1;
            }
            if (obj != null) {
                String str2 = "/context=";
                String valueOf = String.valueOf(this.f7453b.r);
                stringBuilder.append(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            } else if (this.f7453b.d()) {
                stringBuilder.append("/context=true");
            }
            this.f7452a = stringBuilder.toString();
        }
        return this.f7452a;
    }
}

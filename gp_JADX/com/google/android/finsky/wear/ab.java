package com.google.android.finsky.wear;

import android.os.Bundle;
import com.android.volley.C0660x;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.b;
import com.google.wireless.android.finsky.dfe.nano.dr;
import java.util.ArrayList;

final class ab implements C0660x {
    public final /* synthetic */ String f24767a;
    public final /* synthetic */ C4805z f24768b;

    ab(C4805z c4805z, String str) {
        this.f24768b = c4805z;
        this.f24767a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        dr drVar = (dr) obj;
        if (drVar.b == 1) {
            ArrayList arrayList = new ArrayList(drVar.c.length);
            for (b bVar : drVar.c) {
                Bundle bundle = new Bundle();
                bundle.putString("name", bVar.c);
                bundle.putLong("version", bVar.d);
                bundle.putLong("size", bVar.f);
                bundle.putString("hash_sha256", bVar.g);
                bundle.putString("download_url", bVar.h);
                if (bVar.k.length > 0) {
                    String str = bVar.k[0].b;
                    String str2 = bVar.k[0].c;
                    bundle.putString("download_auth_cookie", new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("=").append(str2).toString());
                }
                arrayList.add(bundle);
            }
            this.f24768b.m22581a(0, this.f24767a, arrayList);
            return;
        }
        FinskyLog.m21667d("Module delivery for node %s failed with error %d", this.f24768b.f25076d, Integer.valueOf(drVar.b));
        this.f24768b.m22581a(1, this.f24767a, null);
    }
}

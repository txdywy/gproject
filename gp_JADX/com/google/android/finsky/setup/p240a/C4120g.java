package com.google.android.finsky.setup.p240a;

import android.os.Bundle;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.bu;

public final class C4120g implements C2918a {
    public final String f20735a;
    public final int f20736b;
    public final int f20737c;

    public C4120g(String str, int i, int i2) {
        this.f20735a = str;
        this.f20736b = i;
        this.f20737c = i2;
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        bu buVar = (bu) obj;
        if (buVar == null || buVar.b == null) {
            return null;
        }
        Document document = new Document(buVar.b);
        Object bundle = new Bundle();
        bundle.putString("authAccount", this.f20735a);
        bundle.putString("package_name", document.f14885a.f12097d);
        bundle.putInt("version_code", document.m14653h());
        bundle.putString("title", document.f14885a.f12100g);
        bundle.putInt("priority", this.f20736b);
        bundle.putBoolean("is_visible", false);
        bundle.putInt("doc_type", 3);
        if (document.m14671z() != null) {
            bundle.putByteArray("install_details", C0757i.m4909a(document.m14671z()));
        }
        bundle.putInt("network_type", this.f20737c);
        return bundle;
    }
}

package com.google.android.finsky.setup.p240a;

import android.os.Bundle;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.setup.PackageSetupStatus;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;

public final class C4117d implements C2918a {
    private static PackageSetupStatus m19159a(Bundle bundle) {
        es esVar = null;
        boolean z = true;
        if (bundle == null) {
            return null;
        }
        try {
            byte[] byteArray = bundle.getByteArray("install_details");
            if (byteArray != null) {
                esVar = es.m12537a(byteArray);
            } else {
                FinskyLog.m21659a("Null install details for %s", bundle.getString("package_name"));
            }
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Failed to parse InstallDetails proto.", new Object[0]);
        }
        int i = bundle.getInt("network_type", 0);
        String string = bundle.getString("authAccount");
        String string2 = bundle.getString("package_name");
        int i2 = bundle.getInt("version_code", -1);
        String string3 = bundle.getString("title");
        int i3 = bundle.getInt("priority", 3);
        String string4 = bundle.getString("delivery_token");
        boolean z2 = bundle.getBoolean("is_visible", true);
        String string5 = bundle.getString("icon_url");
        if (bundle.getInt("doc_type", 3) != 1) {
            z = false;
        }
        return new PackageSetupStatus(string, string2, i2, string3, i3, string4, z2, string5, z, i, esVar);
    }
}

package com.google.android.finsky.verifier.impl;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.aq;
import com.google.android.finsky.dy.as;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.verifier.p259a.p260a.C4697a;
import com.google.android.finsky.verifier.p259a.p260a.aa;
import com.google.android.finsky.verifier.p259a.p260a.ab;
import java.util.ArrayList;
import java.util.List;

final /* synthetic */ class bt implements aq {
    public final br f24481a;

    bt(br brVar) {
        this.f24481a = brVar;
    }

    public final Object mo4346a(as asVar) {
        br brVar = this.f24481a;
        List arrayList = new ArrayList();
        List<aa> list = (List) ag.m15236a(asVar.mo3203e().mo1519a(new C1215q()));
        if (list != null) {
            for (aa aaVar : list) {
                if (!aaVar.f24099f) {
                    Object a = C4691w.m21842a(aaVar.f24095b);
                    C4697a c4697a = (C4697a) ag.m15236a(asVar.mo3200b().mo1521a(a));
                    if (c4697a != null) {
                        ab abVar = (ab) ag.m15236a(asVar.mo3199a().mo1521a(a));
                        if (abVar != null) {
                            Bundle bundle = new Bundle();
                            String str = c4697a.f24090c;
                            byte[] bArr = c4697a.f24089b;
                            bundle.putString("package_name", str);
                            bundle.putByteArray("sha256", bArr);
                            if (((c4697a.f24088a & 8) != 0 ? 1 : 0) != 0) {
                                bundle.putString("app_title", c4697a.f24092e);
                                bundle.putString("app_title_locale", c4697a.f24093f);
                            }
                            bundle.putLong("removed_time_ms", aaVar.f24096c);
                            bundle.putString("warning_string_text", abVar.f24105f);
                            bundle.putString("warning_string_locale", abVar.f24106g);
                            String str2 = "verifyapps://hiderequest/";
                            String valueOf = String.valueOf(str);
                            if (valueOf.length() != 0) {
                                valueOf = str2.concat(valueOf);
                            } else {
                                valueOf = new String(str2);
                            }
                            Intent intent = new Intent("com.google.android.vending.verifier.HIDE_REMOVED_APP", Uri.parse(valueOf), brVar.f24474j, PackageVerificationService.class);
                            intent.putExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME", str);
                            intent.putExtra("digest", bArr);
                            bundle.putParcelable("hide_removed_app_intent", PendingIntent.getService(brVar.f24474j, 0, intent, br.m22200d()));
                            arrayList.add(bundle);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}

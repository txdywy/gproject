package com.google.android.finsky.wear;

import android.content.Intent;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.common.api.C5058o;
import java.util.ArrayList;

final class bs implements Runnable {
    public int f24897a;
    public final /* synthetic */ Intent f24898b;
    public final /* synthetic */ WearSupportService f24899c;

    bs(WearSupportService wearSupportService, Intent intent) {
        this.f24899c = wearSupportService;
        this.f24898b = intent;
    }

    public final void run() {
        this.f24897a++;
        if (this.f24897a == 2) {
            this.f24899c.f24760g = this.f24899c.f24760g - 1;
            WearSupportService wearSupportService = this.f24899c;
            Intent intent = this.f24898b;
            String stringExtra = intent.getStringExtra("command");
            C5058o c5058o = wearSupportService.f24756c.f24792b;
            if (c5058o == null || !c5058o.mo4562j()) {
                FinskyLog.m21665c("Dropping command=%s due to Gms not connected", stringExtra);
                wearSupportService.m22422b();
                return;
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            boolean z = true;
            switch (stringExtra.hashCode()) {
                case -1698462290:
                    if (stringExtra.equals("send_installed_apps")) {
                        z = true;
                        break;
                    }
                    break;
                case -217674997:
                    if (stringExtra.equals("auto_install")) {
                        z = true;
                        break;
                    }
                    break;
                case 613085778:
                    if (stringExtra.equals("auto_uninstall")) {
                        z = true;
                        break;
                    }
                    break;
                case 1204097933:
                    if (stringExtra.equals("node_updates")) {
                        z = true;
                        break;
                    }
                    break;
                case 1373580873:
                    if (stringExtra.equals("hygiene")) {
                        z = false;
                        break;
                    }
                    break;
                case 1732245512:
                    if (stringExtra.equals("package_broadcast")) {
                        z = true;
                        break;
                    }
                    break;
            }
            String stringExtra2;
            switch (z) {
                case false:
                    wearSupportService.f24757d.m22466a(intent, wearSupportService.f24761h, wearSupportService.f24762i);
                    return;
                case true:
                    int i;
                    ArrayList stringArrayListExtra = intent.getStringArrayListExtra("changed_uri_list");
                    ArrayList stringArrayListExtra2 = intent.getStringArrayListExtra("deleted_uri_list");
                    if (stringArrayListExtra2 != null) {
                        int size = stringArrayListExtra2.size();
                        for (i = 0; i < size; i++) {
                            FinskyLog.m21659a("Handle delete %s", (String) stringArrayListExtra2.get(i));
                            wearSupportService.m22421a(stringExtra, true);
                        }
                    }
                    if (stringArrayListExtra != null) {
                        int size2 = stringArrayListExtra.size();
                        for (i = 0; i < size2; i++) {
                            FinskyLog.m21659a("Handle change %s", (String) stringArrayListExtra.get(i));
                            wearSupportService.m22421a(stringExtra, false);
                        }
                    }
                    wearSupportService.m22419a();
                    return;
                case true:
                    stringExtra = intent.getStringExtra("node_id");
                    stringExtra2 = intent.getStringExtra("package_name");
                    boolean booleanExtra = intent.getBooleanExtra("deleted", false);
                    wearSupportService.f24760g++;
                    C5058o c5058o2 = wearSupportService.f24756c.f24792b;
                    wearSupportService.f24756c.m22458b();
                    wearSupportService.f24758e.m22519a(c5058o2, false, new bw(wearSupportService, stringExtra, stringExtra2, booleanExtra));
                    return;
                case true:
                case true:
                    stringExtra2 = intent.getStringExtra("command");
                    String stringExtra3 = intent.getStringExtra("package_name");
                    if ("auto_install".equals(stringExtra2) && !((Boolean) C0955b.ew.m28964b()).booleanValue()) {
                        FinskyLog.m21659a("Wear auto install disabled for package %s", stringExtra3);
                        return;
                    } else if ("auto_uninstall".equals(stringExtra2) && !((Boolean) C0955b.ex.m28964b()).booleanValue()) {
                        FinskyLog.m21659a("Wear auto uninstall disabled for package %s", stringExtra3);
                        return;
                    } else if (!ck.m22514a(stringExtra3, C4680k.m21818a((String) C0955b.ey.m28964b()))) {
                        FinskyLog.m21659a("Skipping package %s, not in whitelist", stringExtra3);
                        return;
                    } else if (ck.m22513a(stringExtra3)) {
                        FinskyLog.m21659a("Skipping package %s, in blockedlist", stringExtra3);
                        return;
                    } else {
                        wearSupportService.f24760g++;
                        wearSupportService.f24758e.m22519a(wearSupportService.f24756c.f24792b, false, new ca(wearSupportService, stringExtra2, stringExtra3));
                        return;
                    }
                case true:
                    C2206c ah = C1473m.f7980a.ah();
                    C3646a I = C1473m.f7980a.mo2029I();
                    wearSupportService.f24760g++;
                    bb.m21792a(new bq(wearSupportService, ah, I), new Void[0]);
                    return;
                default:
                    FinskyLog.m21669e("Unexpected command %s", stringExtra);
                    wearSupportService.m22419a();
                    return;
            }
        }
    }
}

package com.google.android.finsky.wear;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.wearable.C5614b;
import com.google.android.gms.wearable.C5617e;

final class aj implements C1643x {
    public final /* synthetic */ String f24789a;
    public final /* synthetic */ ag f24790b;

    aj(ag agVar, String str) {
        this.f24790b = agVar;
        this.f24789a = str;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        boolean z;
        Context context;
        String str;
        String str2;
        C5614b c5614b = (C5614b) c4980w;
        if (c5614b.mo4505b().m23271a()) {
            C5617e a = c5614b.mo5120a();
            if (a != null) {
                C2322b a2 = ag.m22435a(a);
                this.f24790b.f24783f.put(a2.f11416a, a2);
                z = false;
                if (z || !("com.google.android.gms".equals(this.f24789a) || "com.android.vending".equals(this.f24789a))) {
                    if (z) {
                        this.f24790b.f24783f.remove(this.f24789a);
                    }
                    SystemClock.uptimeMillis();
                    context = this.f24790b.f24780c;
                    str = this.f24790b.f24782e;
                    str2 = this.f24789a;
                    if (C1473m.f7980a.dj().mo2294a(12624984)) {
                        context = context.getApplicationContext();
                        Intent intent = new Intent(context, WearSupportService.class);
                        String str3 = "wearsupportservice://package_broadcast/";
                        String valueOf = String.valueOf(str2);
                        intent.setData(Uri.parse(valueOf.length() == 0 ? str3.concat(valueOf) : new String(str3)));
                        intent.putExtra("command", "package_broadcast");
                        intent.putExtra("node_id", str);
                        intent.putExtra("package_name", str2);
                        intent.putExtra("deleted", z);
                        C1473m.f7980a.al().m22452a(context, intent);
                        return;
                    }
                    FinskyLog.m21659a("disabled", new Object[0]);
                }
                FinskyLog.m21659a("Ignoring deletion of %s from node %s", this.f24789a, this.f24790b.f24782e);
                return;
            }
        }
        z = true;
        if (z) {
        }
        if (z) {
            this.f24790b.f24783f.remove(this.f24789a);
        }
        SystemClock.uptimeMillis();
        context = this.f24790b.f24780c;
        str = this.f24790b.f24782e;
        str2 = this.f24789a;
        if (C1473m.f7980a.dj().mo2294a(12624984)) {
            context = context.getApplicationContext();
            Intent intent2 = new Intent(context, WearSupportService.class);
            String str32 = "wearsupportservice://package_broadcast/";
            String valueOf2 = String.valueOf(str2);
            if (valueOf2.length() == 0) {
            }
            intent2.setData(Uri.parse(valueOf2.length() == 0 ? str32.concat(valueOf2) : new String(str32)));
            intent2.putExtra("command", "package_broadcast");
            intent2.putExtra("node_id", str);
            intent2.putExtra("package_name", str2);
            intent2.putExtra("deleted", z);
            C1473m.f7980a.al().m22452a(context, intent2);
            return;
        }
        FinskyLog.m21659a("disabled", new Object[0]);
    }
}

package com.google.android.finsky.packagemanager.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C2554g;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.af;
import java.util.ArrayList;
import java.util.List;

public final class PackageMonitorReceiverImpl implements C3851f {
    public final C2320a f19225a;
    public final List f19226b = new ArrayList();

    public class RegisteredReceiver extends BroadcastReceiver {
        public C3851f f19224a;

        public void onReceive(Context context, Intent intent) {
            ((C1407o) C3947d.m18649a(C1407o.class)).mo1873a(this);
            this.f19224a.mo3816a(intent);
        }
    }

    public PackageMonitorReceiverImpl(C2320a c2320a) {
        this.f19225a = c2320a;
    }

    public final void mo3816a(Intent intent) {
        boolean z = true;
        int i = 0;
        String action = intent.getAction();
        boolean equals = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action);
        boolean equals2 = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action);
        if (equals || equals2) {
            String[] stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.changed_package_list");
            int length = stringArrayExtra.length;
            while (i < length) {
                this.f19225a.mo2856b(stringArrayExtra[i]);
                i++;
            }
            m18334a(new C3866p(stringArrayExtra), C0983h.class);
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (schemeSpecificPart != null) {
            this.f19225a.mo2856b(schemeSpecificPart);
        } else if (!"android.intent.action.MY_PACKAGE_REPLACED".equals(action)) {
            return;
        }
        Bundle extras;
        if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
            extras = intent.getExtras();
            if (extras == null || !extras.getBoolean("android.intent.extra.REPLACING", false)) {
                z = false;
            }
            m18334a(new C3867q(schemeSpecificPart, z), C0983h.class);
        } else if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
            extras = intent.getExtras();
            if (extras == null || !extras.getBoolean("android.intent.extra.REPLACING", false)) {
                z = false;
            }
            m18334a(new C3868r(schemeSpecificPart, z), C0983h.class);
        } else if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {
            m18334a(new C3869s(schemeSpecificPart), C0983h.class);
        } else if ("android.intent.action.PACKAGE_FIRST_LAUNCH".equals(action)) {
            m18334a(new C3870t(schemeSpecificPart), C0983h.class);
        } else if ("android.intent.action.MY_PACKAGE_REPLACED".equals(action)) {
            m18334a(new C3871u(), C2554g.class);
        } else {
            FinskyLog.m21665c("Unhandled intent type action type: %s", action);
        }
    }

    private final void m18334a(af afVar, Class cls) {
        for (int size = this.f19226b.size() - 1; size >= 0; size--) {
            if (cls.isInstance(this.f19226b.get(size))) {
                afVar.mo3827a(this.f19226b.get(size));
            }
        }
    }

    public final void mo3818a(C0983h c0983h) {
        this.f19226b.add(c0983h);
    }

    public final void mo3819b(C0983h c0983h) {
        this.f19226b.remove(c0983h);
    }

    public final void mo3817a(C2554g c2554g) {
        this.f19226b.add(c2554g);
    }
}

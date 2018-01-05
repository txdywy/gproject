package com.google.android.finsky.settings;

import com.squareup.leakcanary.C7582R;

enum C4110t implements C4109x {
    AUTO_UPDATE_NEVER(C7582R.string.auto_update_value_disabled),
    AUTO_UPDATE_ALWAYS(C7582R.string.auto_update_value_enabled),
    AUTO_UPDATE_WIFI(C7582R.string.auto_update_value_wifi_only);
    
    public final int f20539d;

    private C4110t(int i) {
        this.f20539d = i;
    }

    static C4110t m19063a(boolean z, boolean z2, boolean z3) {
        if (!z2) {
            return AUTO_UPDATE_NEVER;
        }
        if (z && z3) {
            return AUTO_UPDATE_WIFI;
        }
        return AUTO_UPDATE_ALWAYS;
    }

    public final int mo3912a() {
        return this.f20539d;
    }
}

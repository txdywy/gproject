package org.chromium.net;

import android.annotation.TargetApi;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.C7885d;
import org.chromium.base.C7888e;

final class C7928b extends PhoneStateListener implements C7885d {
    public final TelephonyManager f40673a = ((TelephonyManager) C7888e.f40514a.getSystemService("phone"));
    public final /* synthetic */ AndroidCellularSignalStrength f40674b;

    C7928b(AndroidCellularSignalStrength androidCellularSignalStrength) {
        this.f40674b = androidCellularSignalStrength;
        if (this.f40673a.getSimState() == 5) {
            ApplicationStatus.m37782a(this);
            int stateForApplication = ApplicationStatus.getStateForApplication();
            if (stateForApplication == 1) {
                this.f40673a.listen(this, 256);
            } else if (stateForApplication == 2) {
                this.f40674b.f40566a = Integer.MIN_VALUE;
                this.f40673a.listen(this, 0);
            }
        }
    }

    @TargetApi(23)
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        if (ApplicationStatus.getStateForApplication() == 1) {
            this.f40674b.f40566a = signalStrength.getLevel();
        }
    }
}

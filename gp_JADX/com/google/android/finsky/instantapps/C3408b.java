package com.google.android.finsky.instantapps;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.e;

final /* synthetic */ class C3408b implements Runnable {
    public final EphemeralInstallerActivity f17430a;

    C3408b(EphemeralInstallerActivity ephemeralInstallerActivity) {
        this.f17430a = ephemeralInstallerActivity;
    }

    public final void run() {
        EphemeralInstallerActivity ephemeralInstallerActivity = this.f17430a;
        ephemeralInstallerActivity.f17292J.mo5136a(634);
        e eVar = (e) ephemeralInstallerActivity.f17290H.mo1a();
        ephemeralInstallerActivity.f17292J.mo5136a(635);
        String str = (String) ephemeralInstallerActivity.f17291I.mo5158a();
        if (!str.isEmpty()) {
            ephemeralInstallerActivity.f17292J.mo5136a(638);
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) eVar.a(new URL(str));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    ephemeralInstallerActivity.f17292J.mo5136a(640);
                    return;
                }
            } catch (IOException e) {
            }
            ephemeralInstallerActivity.f17292J.mo5136a(639);
        }
    }
}

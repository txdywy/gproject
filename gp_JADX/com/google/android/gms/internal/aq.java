package com.google.android.gms.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@C5302b
public final class aq implements ao {
    public final String f26487a;

    public aq() {
        this(null);
    }

    public aq(String str) {
        this.f26487a = str;
    }

    public final void mo4697a(String str) {
        String valueOf;
        HttpURLConnection httpURLConnection;
        try {
            String str2 = "Pinging URL: ";
            valueOf = String.valueOf(str);
            ap.m24188a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            al alVar = xz.m25997a().f27732c;
            al.m24182a(httpURLConnection, this.f26487a);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                ap.m24193c(new StringBuilder(String.valueOf(str).length() + 65).append("Received non-success response code ").append(responseCode).append(" from pinging URL: ").append(str).toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            valueOf = e.getMessage();
            ap.m24193c(new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("Error while parsing ping URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (IOException e2) {
            valueOf = e2.getMessage();
            ap.m24193c(new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(valueOf).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (RuntimeException e3) {
            valueOf = e3.getMessage();
            ap.m24193c(new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(valueOf).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}

package com.google.android.finsky.dh;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Binder;
import android.util.Base64;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.p354b.C6321a;
import java.util.ArrayList;
import java.util.List;

public final class C2744a {
    public static List f14975a;

    public static String m14784a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return null;
        }
        String packageName = callingActivity.getPackageName();
        if (packageName != null) {
            return packageName;
        }
        FinskyLog.m21659a("Couldn't determine caller. Either use startActivityForResult or set FLAG_ACTIVITY_FORWARD_RESULT.", new Object[0]);
        return null;
    }

    public static boolean m14792b(Activity activity) {
        String a = C2744a.m14784a(activity);
        if (a == null) {
            return false;
        }
        if (a.equals(activity.getPackageName())) {
            return true;
        }
        return C2744a.m14788a((Context) activity, a);
    }

    private static boolean m14789a(Context context, String[] strArr) {
        for (String a : strArr) {
            if (C2744a.m14788a(context, a)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m14788a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkSignatures(str, context.getPackageName()) == 0) {
            return true;
        }
        C2744a.m14786a(context);
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (str.equals("com.quickoffice.android") && C2744a.m14790a("MIICVzCCAcCgAwIBAgIESVJ9+TANBgkqhkiG9w0BAQUFADBvMQswCQYDVQQGEwJVUzELMAkGA1UECBMCVFgxDzANBgNVBAcTBkRhbGxhczEUMBIGA1UEChMLUXVpY2tvZmZpY2UxDzANBgNVBAsTBlFPLURFVjEbMBkGA1UEAxMSQWxleGFuZGVyIFN0ZXBhbm92MCAXDTA4MTIyNDE4MjI0OVoYDzIwNjMwOTI3MTgyMjQ5WjBvMQswCQYDVQQGEwJVUzELMAkGA1UECBMCVFgxDzANBgNVBAcTBkRhbGxhczEUMBIGA1UEChMLUXVpY2tvZmZpY2UxDzANBgNVBAsTBlFPLURFVjEbMBkGA1UEAxMSQWxleGFuZGVyIFN0ZXBhbm92MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQChx/LvhUKzh2bdxAYelxtLR+EU7hWRFw/GmJHgTSvhAVKReWUZolS2bOk0xaybV499hHEAGutl2mX90KJ4EIZh3LZNk3qjy3terL8YDqoayWI+EZtSAifFEBbn3bPdhX6pqI/1v/SivKf/LQrw5VASStE2dylHtRAnLLJGbvOWeQIDAQABMA0GCSqGSIb3DQEBBQUAA4GBABU7YooXGdyniqWBK44g0XjN9NLTKTpXec856AVBQWv+PnqAvGS282KChu2tMYyJHRok0jxvTlYwgXZIa31Sw57372zJ6hDqgnBQdBdF7FnKDhyZZ+XPZHGEr+TXe/3jZwl5tZo7WmoWMAkWnMqda/CQ7TVgr+8gacujXGyhUsWv", packageInfo)) {
                return true;
            }
            if (((Boolean) C0955b.am.m28964b()).booleanValue() && str.equals("com.google.android.projection.gearhead") && C2744a.m14790a("MIIDvTCCAqWgAwIBAgIJAMePnkuTQTAGMA0GCSqGSIb3DQEBBQUAMHUxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDERMA8GA1UEAwwIZ2VhcmhlYWQwHhcNMTQwNTI3MjMwNTM0WhcNNDExMDEyMjMwNTM0WjB1MQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91bnRhaW4gVmlldzEUMBIGA1UECgwLR29vZ2xlIEluYy4xEDAOBgNVBAsMB0FuZHJvaWQxETAPBgNVBAMMCGdlYXJoZWFkMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA050XDkNIsVRMX2wTvVplpCu4OtnyNK2v5B7PS+DggmH2yuZiwpTurdKDQ9R9UzxH9U4lsC+mIxXkiBYKIWNVgMtiTgxkEy7cgWvdYHgNYpFu8IxZKYDyXes+02pfvpu63MIBD/PnvVFipo1oUrbfetj+mroEpjnA71gUS0Ok+H6XWWsmb8xFHQVMoZWEIzsUJ2nhm8EcnPkAPfNZAG++XLPROoRQCaswyYsd42JuYAP3CwZuhDcUbMWmk7rBi9BVQ8gmkrbwqo94A7qStLUp3NyCmlKSWHaZ05SspEPwsfctka0oXG5bhgT667EMCzQ+YsFN1oJRL7Qq+mMQjFJs3wIDAQABo1AwTjAdBgNVHQ4EFgQUGvBfYNeu6JSJUnJZCiaBGsnXztswHwYDVR0jBBgwFoAUGvBfYNeu6JSJUnJZCiaBGsnXztswDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQUFAAOCAQEAlGsDY0EPu3NBSH5k6iw/wJh9e3xMwS17ErKGlhyWogxJMzLjAN6g0aCPHxB40IQC+8qAl+RL7VQx6oxttf0m31yUGQPcNYbt2CxBTCAr885oLK5t2TAi5tQzhd6ZEYihWSUWUd/X8BQRouxboss9QbBA/iIx0OpDaxiAcq7Cb67TheXZDxGuQ8fmHYbLx84pEvm3DQOB/LIMkkpQSfEC1f+oP1zB3urPU/dSvED/LCgOdrpxZ5di7SwSyue+Vq/TZQy34tPygEzD2d8hFlh/yfhWkMizOeIXcayVAQdNn5zpBkuay1skGOjQQ5kTbDcDzigO2R2rqn6HCd9l5Z0WIQ==", packageInfo)) {
                return true;
            }
            if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                return false;
            }
            Signature signature = packageInfo.signatures[0];
            for (int i = 0; i < f14975a.size(); i++) {
                if (signature.equals(f14975a.get(i))) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException e) {
            FinskyLog.m21665c("Couldn't get info for package %s", str);
            return false;
        }
    }

    public static String m14791b(Context context, String str) {
        try {
            return C4688t.m21839a(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray(), "SHA-256", 11);
        } catch (NameNotFoundException e) {
            FinskyLog.m21665c("Couldn't get info for package %s", str);
            return "";
        }
    }

    private static boolean m14790a(String str, PackageInfo packageInfo) {
        Signature a = C2744a.m14783a(str);
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return false;
        }
        return a.equals(packageInfo.signatures[0]);
    }

    private static synchronized void m14786a(Context context) {
        synchronized (C2744a.class) {
            if (f14975a == null) {
                List arrayList = new ArrayList();
                f14975a = arrayList;
                arrayList.add(C2744a.m14783a("MIICUjCCAbsCBEk0mH4wDQYJKoZIhvcNAQEEBQAwcDELMAkGA1UEBhMCVVMxCzAJBgNVBAgTAkNBMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUsIEluYzEUMBIGA1UECxMLR29vZ2xlLCBJbmMxEDAOBgNVBAMTB1Vua25vd24wHhcNMDgxMjAyMDIwNzU4WhcNMzYwNDE5MDIwNzU4WjBwMQswCQYDVQQGEwJVUzELMAkGA1UECBMCQ0ExFjAUBgNVBAcTDU1vdW50YWluIFZpZXcxFDASBgNVBAoTC0dvb2dsZSwgSW5jMRQwEgYDVQQLEwtHb29nbGUsIEluYzEQMA4GA1UEAxMHVW5rbm93bjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEAn0gDGZD5sUcmOE4EU9GPjAu/jcd7JQSksSB8TGxEurwArcZhD6a2qy2oDjPy7vFrJqP2uFua+sqQn/u+s/TJT36BIqeY4OunXO090in6c2X0FRZBWqnBYX3Vg84Zuuigu9iF/BeptL0mQIBRIarbk3fetAATOBQYiC7FIoL8WA0CAwEAATANBgkqhkiG9w0BAQQFAAOBgQBAhmae1jHaQ4Td0GHSJuBzuYzEuZ34teS+njy+l1Aeg98cb6lZwM5gXE/SrG0chM7eIEdsurGb6PIgOv93F61lLY/MiQcI0SFtqERXWSZJ4OnTxLtM9Y2hnbHU/EG8uVhPZOZfQQ0FKf1baIOMFB0Km9HbEZHLKg33kOoMsS2zpA=="));
                f14975a.add(C2744a.m14783a("MIIDvzCCAqegAwIBAgIJANMZq7O4m8KgMA0GCSqGSIb3DQEBBQUAMHYxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDESMBAGA1UEAwwJdnJfaXRoYWNhMB4XDTE2MDEyODA4MTgwOFoXDTQzMDYxNTA4MTgwOFowdjELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxFDASBgNVBAoMC0dvb2dsZSBJbmMuMRAwDgYDVQQLDAdBbmRyb2lkMRIwEAYDVQQDDAl2cl9pdGhhY2EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCpLfrD84l7YPpmYkkELPnhhWRDHdtSgMDMFSDXdmqCNtVbaCbrCbmyuBZrtUKqDtFZbBmdVx8KLUqSfLPityiwUZRfRVRRRqizZk6f4pYcpGFmirAILKDh7Obadie+Xy4EyL14kU1V92TtTeiLYrYAOgD/IFHgAKQZAO4i7E6M+sDSFIw3ZrTs+ZOr4O8BloLcct91i1E3N78lhoWrB+S9HV94feuEek+Lj3V1fctVB8NX+jSOqLtRO0A3G3kuoQgfiSiNEn40LOVpee9xPU5UMpllgA81cisdSoJMqHGsELlYwU8nRwaJVrOhXF/NhLmChDzEEAtXH0tkBi5Prn6pAgMBAAGjUDBOMB0GA1UdDgQWBBQzJQgQEE0hTBKW7DPRHwenmAQ+azAfBgNVHSMEGDAWgBQzJQgQEE0hTBKW7DPRHwenmAQ+azAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQAEjUkNbxPh/uPSBb4eYovxUF11Cp4acGlQeYHuLdWV4GJeh0WKoMfosItijOpvBpPkQs3hlcK1EhDZljAMB1NLJTmVJBUhKLK1WrF6jEv2PclvqT5eg9uNobM4wP+zr18/BHBaf9YXPf6Zzv8/T1rY1DZvl5pqIz+8xNpoqASNmto2uJvdGpPziFidtCP1ZR8AVyk5/7HJAC0j7c1T1heXH/lSy9n+cmQ3+OUcMI7NVTOHkbzA0rqrc1X6fRO47NjKAjdqbdWfzL/c+J2CygkMQeCuTU1wEyDcF6R1zyJOUZLBs0wX2VjpFbI0QhRJdr5ES94xYCbOhaIY6Wv0fX7K"));
                f14975a.add(C2744a.m14783a("MIIDuzCCAqOgAwIBAgIJALfgiKtt7lSKMA0GCSqGSIb3DQEBBQUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDEQMA4GA1UEAwwHdW5pY29ybjAeFw0xNDA5MTYyMzUyMjlaFw00MjAyMDEyMzUyMjlaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDEQMA4GA1UEAwwHdW5pY29ybjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAK/0G397p0wUzliKKuOxLRIwLqVsRCQ4dEM3r6ZU5BjgX8RsfFGXv8PXnV4DL1nuhc5YBPOs1GldSAjAKUv396+xwuDgXk+I4nIumse6a5uMnVE1hYzySW4jRxrLDM29Aj0qJR9/842dfCR/1pTg+j1k7noBmiGxnsr4RpzsxBF/XTTt3a0XM7hBvIcPhfmQot1pg8u8t/jrXWhsfhSRfV2H9B688Y9m70nL6ZS+5jhKfXgmoe5pMhQUkqFdTvlwZkXJwu0p5E9IpfNYeYkDRZUjB/uJyfDA0vgeTW3jwo9Ok6eYRFJvtM2D1Ife427A1epDsx0BSs8PAQFfBP3LkuECAwEAAaNQME4wHQYDVR0OBBYEFIOdaOcde+YKnrrZAfnHb+jWwus1MB8GA1UdIwQYMBaAFIOdaOcde+YKnrrZAfnHb+jWwus1MAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADggEBACgnbe7ucRoChDyesrWfOrHobs6724NV+GEm7awrwJrPvZCnCv48FRGIZdzIDn0LvWY8NUPsMi6Qt13FheFJLrWbmWLCuwIt++NkuWIRsLXcrcTaFEYq9LIkmIYoZJ3e19OOVaHggrAtzGauEQh2pHJL3xAnNWxvhNIm9h8bGuf0xk9uHljWDlsAIhR7NSxKAXEjyIX0zZu6uAslI19LSRt+7Myz0yhxJ232rf+/V4QsfsE5JL6rDdIvBIoT/XCzPCbyYO+aTeDzkG7OXBbS6k4przUV2GKyO1FV4lnlBWMF6dFy//aHxkIjEr903Desfzf5M9HPxBEx4ODrQzrSo+Q="));
                f14975a.add(C2744a.m14783a("MIID3TCCAsWgAwIBAgIJAPtnMsAiwNAlMA0GCSqGSIb3DQEBCwUAMIGEMQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91bnRhaW4gVmlldzEUMBIGA1UECgwLR29vZ2xlIEluYy4xEDAOBgNVBAsMB0FuZHJvaWQxIDAeBgNVBAMMF2luc3RhbnRfYXBwc19zdXBlcnZpc29yMB4XDTE2MDcxMjAxMzIwN1oXDTQzMTEyODAxMzIwN1owgYQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDEgMB4GA1UEAwwXaW5zdGFudF9hcHBzX3N1cGVydmlzb3IwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCbFE6ThunO1hsgQJy4aKuGEDyj2vveUbgkRaFrof7gcl09yywwfiPzgFCz2gqUVRdfVPwg6QJEL3+8tzsXmJBR8xFX0ilLlT11/bjSfRUf5oAD41y0e/sPZ99Z2YQ6p7kGBUWoIA3RJxWLfz0EMLzR1BzWT7L0nRPk1leXugjGaGJ+o0B2AWIoqlnUK1KUy3XWxkotN0X6IkzSuXbLJOXH4BB7IPGwHnStZU3Ov1luaOo6vq3F4Sq3I5FpLV+NBEojjUi1m4L3MRkjUjdCUqGX4TDKfgsW/6vSUOV8UnQaSiZoVB+rnlzeGOzdpwWcpToFHOYj8cYJHNWncTmMT6XxAgMBAAGjUDBOMB0GA1UdDgQWBBR/iE2xvVPdAvighzyfs05Q7fifITAfBgNVHSMEGDAWgBR/iE2xvVPdAvighzyfs05Q7fifITAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBCwUAA4IBAQBeQ+kVG4BO7wTzWttsXedHB1ueZcgfdG3bUJ6P3NhHPaLloRsjBYnrSGz/bsI6IuU+GIQF5TfrMVsHRuq4Jm1ZzXKjNq1d10FzkmLGCE9a9SBSuZXkyXnNlJj+J9KLLC8DN/5YppMGHriFWGvyNcFEb9krByPQ2ItLSe/3ZqK3+Dp14x08DnwDspuSzHanlPIO25jFGoQnGlvl2FxnJgE1zgCVjVjjR1vP2potlsSITLxNQlA1y8FIZW5yLLqWWaBmilxaQQ7ND0v720aZ4gZY4Yzk6ODpRertu9sqaDnQiVtr3SpE2IGZEHF5yMfW+5Dyudyc02B8vqw0PzMVyHqn"));
                f14975a.add(C2744a.m14783a("MIIDhzCCAm+gAwIBAgIVALofx3UQfxhinlVvtC7/HuwgE51yMA0GCSqGSIb3DQEBCwUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAeFw0xNzAxMjQwNjI2MDNaFw00NzAxMjQwNjI2MDNaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAI9UAy6OuFP/kVls9sJG/tGK2ykgHW2s+yOVenSgGn9iM8+duPQO5qvXBu43LNSLTnLTk4PnfYxmJCxI4Nx6+BgJvCB+jMiMFPvlEajf2q7SCidwLoU9z6Qfd52YcA8KN4iOHVV2ZJJ/WQfdb587oGf5MD1gwnSKCj/mXq3L84LTn6EVs/QLK3H45LQP6ZsYa8ECfGmIB5fdUe7sqx84wlsSOa/aeCdHHVNAQxVBiafk8gNSwDbIEKlzxPkN7XMEbS55X2WvJlUgggvkj/gz92N1EEUDU5OmCqjTgx5KhDaxli5s5u5Dp3c2lNrbKnx1UCGKIB/q2NJWCDNM3n1ZHJsCAwEAAaMQMA4wDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQsFAAOCAQEALQm2rtMPRLJJsc0GA8/HV6H9ALL6BVczowPq8bnlLYMV02iClL3vV+btaDPnZHY48P8ENy2mc5XJTMaIWKZCvjbop0ybmd1vCGrpuvJDFIiC3+g5B6X7XiAvM1Fc15Jd840GgIMIVGpWIptGpN09RwT6JB8mjgtcVGSinENUlx2QD1QAwgDo1vOYVnhTVUSFe1otzilvrVvk4bMdKHqZcZSVvIPRQX4Jxy9cd2jcWhpEStU5obnRYuDxX/RvdzcAMSnUo8u8h7/g+FTAbjdM3+4mEzCjYc7TB7hKLi/bQncCt5oK7qF07j5H26HhccUXBKYGxpgFp7VQ81EjPlFsIQ=="));
                if (C2744a.m14793b(context)) {
                    FinskyLog.m21659a("Apps signed by first-party test keys will be allowed", new Object[0]);
                    f14975a.add(C2744a.m14783a("MIIEqDCCA5CgAwIBAgIJAIR+T/LWtd6OMA0GCSqGSIb3DQEBBQUAMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTAeFw0xMDAxMjAwMTAxMzVaFw0zNzA2MDcwMTAxMzVaMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBANgocXw20RcP1E0Kew8HESboW7/fM7A0YABalMz7ZaXboLJD32Cxkb+dBt8dilwKM+LRY/UT3x0iU0HqPDN5IuhcAuw0ztlMuAcjpiP/S6/7tOXv5nc7PqK+uLyyAmfP54VRH4Mu+YerdZT+HinPvE0IOh8SUgB3c5byFltpewCjoME6zDCKk/IhY8FunD1KshSfNkxFwEMUMnA58doJYJPxs/wYtlYQlcYiX8cQK5h8bxOkXSTj4MVOhZ1n41tnCCcT0tbwV900V9GfxP6N3eyMOk8/lyMFGacKKDY0rDWBo0q9oX2EWgoJhfv4BgsDaid4YIFj+gw3uefyoQ52vHcCAQOjgfwwgfkwHQYDVR0OBBYEFLXH+RJveA06+8plc3M/9SJrmxc3MIHJBgNVHSMEgcEwgb6AFLXH+RJveA06+8plc3M/9SJrmxc3oYGapIGXMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbYIJAIR+T/LWtd6OMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADggEBAEw+p2V9Jua71xEMjxnfH42hCX0zhg9p3r/K20ajfoflsw+7NHscdVW8uzyZVBSARpZfnHkqAtDb5aZHYbN5R6tr/7C6xqLBoM34Yvh3qWcN/W8GLkBuzhgGDGBJjfw2nycRcZjlb8uhUuYFjc6UzlkfxPSpmCszutgZbXdvVbfQGs8x3dcM7LeJeHYGZRD5SaVSSjExs8tlQc+LNUIOvMRSJVmWP0JmaQVyZmJPs5jP21IXiB0RHG4DRhb4USEY0KKmnRPXkvDNEdvVjiODWlSlSsJR59IsRGo/7hQSEOlER0tAYwe7JoQrT2vTVYIcc5ZR/6JgWwXiJJXXFdh6kfY="));
                    f14975a.add(C2744a.m14783a("MIIDvzCCAqegAwIBAgIJALEDDCh4WgGfMA0GCSqGSIb3DQEBBQUAMHYxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDESMBAGA1UEAwwJdnJfaXRoYWNhMB4XDTE2MDEyODA4MTgwMloXDTQzMDYxNTA4MTgwMlowdjELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxFDASBgNVBAoMC0dvb2dsZSBJbmMuMRAwDgYDVQQLDAdBbmRyb2lkMRIwEAYDVQQDDAl2cl9pdGhhY2EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDI8NCnZpMHuqAd1ZwAKwn8l/LeJBaipuASXw7qXsZSsIEcoyUnWgCWt4RzYJz2Bxv9XkgECjmu9NzqzncAYfAMFaS4aV2fg9EaZ7xBZrQYobB06iMK0+AhDIWHfOAODYYWSLJOhecHsw33H412OKZiZxLZekjWvto9Zz57sm6YncqoXrJBPrxWY1NMXpnb7S6kxSAgkuKN2n/tX/Dag+Qo/tZ25gmnwHPC4XwzqaRg2o3fwDoO1M7aXAU9HTfvWIyAN/3MC4YpdugQrTj9jQHuc5SUuYaQ+OyllpyFyK1qrgofkH+fcKEjGiQWtBkt5KWfxZQ8EQZo2ZP2vO+lt65vAgMBAAGjUDBOMB0GA1UdDgQWBBSNXhy0E+gusejiZTcJbnX0dCYHBTAfBgNVHSMEGDAWgBSNXhy0E+gusejiZTcJbnX0dCYHBTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQA9xkL3jjNz5gwHCxtHlM8OZS1lggmGTZCu1w81SlxINenmAbwAnED+ROA2K+a1i2pbI4Str+y4pte7GcSRSnoKvgmb8XCXXG1Uy7yrGbvCBSeLDPxeYEI5Tj/FhXJh0Pcn1Wsu5ejl1K5ojrveL0SrU+j6qFLMaXO2IUhJ6J5KdiyZJFsNSEdhyOwDsE8bdELvUuRhSlOhFejLZ+Po64ta4xRpVg0Y/+Ez45SnPMZRz41waME7OdBnFnWmMixG5VfC9hF8Lq3IE9QsgEs+H6arxwrh0nnV0SF0N9elUg6FSl8uUipMCUiOf1fYa8WAtSc+JaQkJFohhMfNXeOsk6io"));
                    f14975a.add(C2744a.m14783a("MIIDuzCCAqOgAwIBAgIJAJURNOAhwzr0MA0GCSqGSIb3DQEBBQUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDEQMA4GA1UEAwwHdW5pY29ybjAeFw0xNDA5MTYyMzUyMjZaFw00MjAyMDEyMzUyMjZaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDEQMA4GA1UEAwwHdW5pY29ybjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANEd2oaQGY/rOOT50B1NFMZUOw8LqPLhZwDzBuyDcq9x41nVZYBi1O/LQj4Wn2c8DPQpscI6sVGlkXqeMhCngSq1I2AVHrsB12XDlOglH66YHxXrW7Id++RIRQA1eJ583e9z/QUkzrVfZ1d9xaF5DSBlNBQm3WEhg0qhEgJ47PjYmN381I/ACsnOUr1SweSzZp5gg7SxvPOe+VS8W1QArBziLOJoKJufZRhNP0jlnPcIVNvAb9Vj1BW8bzn0y7TnrODVPF3EYwFMd6mMGJxKYH09sWvfIREOoU+1vabJ90g3kZujiqdcS5FgHWx1MoTpQ5x55nQUtJjSz3y+yvrC6LkCAwEAAaNQME4wHQYDVR0OBBYEFExlW6dRewZEGeYRVIlo9mPLO+GWMB8GA1UdIwQYMBaAFExlW6dRewZEGeYRVIlo9mPLO+GWMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADggEBAE/IMx5b7IrhAyPydN/1zYXJaicbLo2He7KVDcZU/d0K/enwUHOiOjexG5V3pl7wxvBcpkOAlU3CTkwGHYavs2zikYNt/bthqBCkTTzW2sCykfXmPxZAfcEpxI35eQTaOfEvUcm7nLvrzCRLrjmJVOhfnh4ntupljx5gG1+k7Uhlv19c0+BnummW4JrS4dF3T+Ha1vENaX0cvdL8znXSwilhy3NwxaG0nqwF/3CqGEJFBswzFer1jRYbtJJzCM8J61PaXDT/uuosO+bQ5IXCW4JXNtyEXvNdL/vuCMqvE+KIXDk5NRylslFxTqnLP/lZkaPiTHxaUOvlAZBR+vXTpHw="));
                    f14975a.add(C2744a.m14783a("MIID3TCCAsWgAwIBAgIJAP5BX2yEDS1sMA0GCSqGSIb3DQEBCwUAMIGEMQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91bnRhaW4gVmlldzEUMBIGA1UECgwLR29vZ2xlIEluYy4xEDAOBgNVBAsMB0FuZHJvaWQxIDAeBgNVBAMMF2luc3RhbnRfYXBwc19zdXBlcnZpc29yMB4XDTE2MDcxMjAxMzIwMFoXDTQzMTEyODAxMzIwMFowgYQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDEgMB4GA1UEAwwXaW5zdGFudF9hcHBzX3N1cGVydmlzb3IwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDEEq5Hm7ymhQsx3v/Cupgn5Kyh9ggM34q+bweYZq7ld11G5tesLKExu09tI19GuV3vIYOjhRampmKDP8qses8St3g9pkcblRa6Ju2mbhruh+v29O79EQAOe9QmVhxLOkiHyh9Kn/Q4HPxF4YAop+E4Vbia1megVVFtLGmNXGGHeHVECFm4VuVByVIz2F7TZY+5MIY+nKBTOf5zw0pA4I4BnAkn+rQax+yRXqAvh0OzICmQ1eGfhKEF9XocxSFxfUf/EkOb1l3hVWVgNxRmSvo8uf11zwGz+u4I5gXUwOvGhR+TMa+gR5OGVFqW0tvssij5GdWGxQSTWFBDIsjlurzxAgMBAAGjUDBOMB0GA1UdDgQWBBR7Ym/QxClHuRtTPxtDuRG1h0ihGzAfBgNVHSMEGDAWgBR7Ym/QxClHuRtTPxtDuRG1h0ihGzAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBCwUAA4IBAQCiW36qNjflc/cBZbxDxectMiPFkTCw7Y7YUd43pr5OXvZTz8WRfZDzpeprKlZrTkfAMj8g1UPhqmiDroLfcI2/cRj+BfQLq8IAn7ctvoTA30m2YsKoWnqQHufTmAWgTbRsSBgsj3lBTDC/XQBJYY9itNPkXprGocvFolkywAAzn70JvV8AwNruBwKhEb5rUIFCtqV75OuXuYzzciVI/i8dAVaAqH8MaItJa7uuEqa0zLlca0lrlJGFqQje4vdQ2MwTjmOeHCSMJwzN4zvxkTlJLc3l6YxSMachevrw8dVIp7KwiMIYAx2inR1b5CDJ06WR/FxUgfxGqMEhpMOXQNRy"));
                    f14975a.add(C2744a.m14783a("MIIDwzCCAqugAwIBAgIJANBe/alCjaz1MA0GCSqGSIb3DQEBCwUAMHgxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDEUMBIGA1UEAwwLcmVkLWFuZHJvaWQwHhcNMTcwMTI0MDYyNzIyWhcNNDQwNjExMDYyNzIyWjB4MQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91bnRhaW4gVmlldzEUMBIGA1UECgwLR29vZ2xlIEluYy4xEDAOBgNVBAsMB0FuZHJvaWQxFDASBgNVBAMMC3JlZC1hbmRyb2lkMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt40qew9XJOjLdYhK3U4fM3qny8g8KjMeRgce1lD8X+OFc4tSM3YFOLg5G2GxWnSBsIttCrwXKPAbGtHsCfXHpKy0YpixY+XX/MuYAuLYIbASR0kGtxrJ2LM0K3/AFMwqVMv33gnFtHrnCGsZCY73EqsBx0V0dbCkmtIvQG36PMw+vcWjqgs6921GBd4G9rGOqJwTc7AWR6AoHLCRgy4q3tK9tDaO4nKMEl4lQZhSOoB9BUfo0DARtyRItsFzaQuSf8yL3YjvZZ2OOqKlK5Vvn44hWv3uHgEale43qxd+RvqD+L8Oi0NJrxLR7ScIy5Mp9I3e6iJu1sMRLuZ8V8/dGQIDAQABo1AwTjAdBgNVHQ4EFgQU3k7Lc4t7sevj4jv3SuXhQkGQeccwHwYDVR0jBBgwFoAU3k7Lc4t7sevj4jv3SuXhQkGQeccwDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQsFAAOCAQEAeRyxfv5X6NaxEjPMCh+J62uVBiq2VrWtl6FuHIMZOxHiKP8Be3hhIV0LZZ0u1HenmAUAyVjjQugf73P/E7GsSCMgNlbQtLvN/ITSMW8DENIRkQ6ZdtDgU6ZP97zkZjaqH5phNO6pL+Ixnuc0EJEcO6m+HcDQQeaD8YtZM9IwqLRa3Y6CPfHxlFD2WJm+CSLN/dOV/KSHzQIqhJva9q94WONGvx3Z2oge+Fxu1ObqVVZW0blYbmt4gH2Jt9t1Q8R4gDsRPNJchwEuMF8KZgRUSN3ITsSm1/C0/5vfjqAoBQKtrZaK6hE9qk+KsVsaJNs31uCTzNqOWGYk/CtSXxD6tg=="));
                } else {
                    FinskyLog.m21659a("Will not allow first-party apps signed by test keys", new Object[0]);
                }
            }
        }
    }

    private static boolean m14793b(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            Signature a = C2744a.m14783a("MIIEqDCCA5CgAwIBAgIJANWFuGx90071MA0GCSqGSIb3DQEBBAUAMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTAeFw0wODA0MTUyMzM2NTZaFw0zNTA5MDEyMzM2NTZaMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBANbOLggKv+IxTdGNs8/TGFy0PTP6DHThvbbR24kT9ixcOd9W+EaBPWW+wPPKQmsHxajtWjmQwWfna8mZuSeJS48LIgAZlKkpFeVyxW0qMBujb8X8ETrWy550NaFtI6t9+u7hZeTfHwqNvacKhp1RbE6dBRGWynwMVX8XW8N1+UjFaq6GCJukT4qmpN2afb8sCjUigq0GuMwYXrFVee74bQgLHWGJwPmvmLHC69EH6kWr22ijx4OKXlSIx2xT1AsSHee70w5iDBiK4aph27yH3TxkXy9V89TDdexAcKk/cVHYNnDBapcavl7y0RiQ4biu8ymM8Ga/nmzhRKya6G0cGw8CAQOjgfwwgfkwHQYDVR0OBBYEFI0cxb6VTEM8YYY6FbBMvAPyT+CyMIHJBgNVHSMEgcEwgb6AFI0cxb6VTEM8YYY6FbBMvAPyT+CyoYGapIGXMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbYIJANWFuGx90071MAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEEBQADggEBABnTDPEF+3iSP0wNfdIjIz1AlnrPzgAIHVvXxunW7SBrDhEglQZBbKJEk5kT0mtKoOD1JMrSu1xuTKEBahWRbqHsXclaXjoBADb0kkjVEJu/Lh5hgYZnOjvlba8Ld7HCKePCVePoTJBdI4fvugnL8TsgK05aIskyY0hKI9L8KfqfGTl1lzOv2KoWD0KWwtAWPoGChZxmQ+nBli+gwYMzM1vAkP+aayLe0a1EQimlOalO762r0GXO0ks+UeXde2Z4e+8S/pf7pITEI/tP+MxJTALw9QUWEv9lKTk+jkbqxbsh8nfBUapfKqYn0eidpwq2AzVp3juYl7//fKnaPhJD9gs=");
            for (Object equals : signatureArr) {
                if (a.equals(equals)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Unable to look up our own PackageInfo", new Object[0]);
            return false;
        }
    }

    private static Signature m14783a(String str) {
        return new Signature(Base64.decode(str, 0));
    }

    public static String m14785a(Context context, String str, C6321a c6321a, C2482j c2482j, int i) {
        int callingUid = Binder.getCallingUid();
        PackageManager packageManager = context.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
        if (packagesForUid == null || packagesForUid.length == 0) {
            FinskyLog.m21667d("getPackagesForUid %d returned 0 packages", Integer.valueOf(callingUid));
            C2744a.m14787a(c2482j, i, str, 1300, null);
            return null;
        }
        String str2;
        if (packagesForUid.length == 1) {
            str2 = packagesForUid[0];
        } else {
            str2 = packageManager.getNameForUid(callingUid);
            if (str2 == null) {
                FinskyLog.m21667d("getNameForUid %d returned null", Integer.valueOf(callingUid));
                C2744a.m14787a(c2482j, i, str, 1301, null);
                return null;
            }
            String valueOf = String.valueOf("sharedUserId=");
            str2 = String.valueOf(str2);
            str2 = str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
        }
        if ((c6321a != null && ((Boolean) c6321a.m28964b()).booleanValue()) || C2744a.m14789a(context, packagesForUid)) {
            return str2;
        }
        FinskyLog.m21659a("Unable to authorize API access for %s", str2);
        C2744a.m14787a(c2482j, i, str, 1302, str2);
        return null;
    }

    public static void m14787a(C2482j c2482j, int i, String str, int i2, String str2) {
        c2482j.m13319a(new C2474c(i).m13236a(str).m13254g(i2).m13247c(str2).f13342a, null);
    }
}

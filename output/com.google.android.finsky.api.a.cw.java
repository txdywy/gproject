package com.google.android.finsky.api.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.a;
import com.google.android.play.dfe.api.DfeResponseVerifier$DfeResponseVerifierException;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.keyczar.c.e;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.o;
import org.keyczar.w;

public final class com.google.android.finsky.api.a.cw implements DfeResponseVerifier
{

    public static final SecureRandom a;
    public static final String b;
    public static final String c;
    public static org.keyczar.c.e d;
    public static boolean e;
    public static org.keyczar.c.e f;
    public final Context g;
    public boolean h;
    public byte[] i;

    static {
        com.google.android.finsky.api.a.cw.b = (String.valueOf(File.separator).length() + 21) + "keys" + File.separator + "dfe-response-auth";
        com.google.android.finsky.api.a.cw.c = (String.valueOf(File.separator).length() + 25) + "keys" + File.separator + "dfe-response-auth-dev";
        try {
            v0 = SecureRandom.getInstance("SHA1PRNG");
        }
        catch (NoSuchAlgorithmException ex) {
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.d("Could not initialize SecureRandom, SHA1PRNG not supported. %s", v2);
            v0 = 0;
        }
        com.google.android.finsky.api.a.cw.a = v0;
    }

    cw(Context p0) {
        this.i = new byte[256];
        this.g = p0;
    }

    private static synchronized org.keyczar.c.e a(Context p0) {
        enter com.google.android.finsky.api.a.cw;
        try {
            if (com.google.android.finsky.api.a.cw.d == 0)
                com.google.android.finsky.api.a.cw.d = new com.google.android.finsky.utils.a(p0.getResources(), com.google.android.finsky.api.a.cw.b);
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.api.a.cw;
            throw ex;
        }
        exit com.google.android.finsky.api.a.cw;
        return com.google.android.finsky.api.a.cw.d;
    }

    private static boolean a(org.keyczar.c.e p0, byte[] p1, byte[] p2, String p3) {
        v0 = 0;
        try {
            v3 = new byte[p1.length + p2.length];
            System.arraycopy(p1, 0, v3, 0, p1.length);
            System.arraycopy(p2, 0, v3, p1.length, p2.length);
            if (TextUtils.isEmpty(p3)) {
                FinskyLog.d("No signing response found.", new Object[0]);
                throw new DfeResponseVerifier$DfeResponseVerifierException("No signing response found.");
            }
        }
        catch (KeyczarException ex) {
            v3 = new Object[1];
            v3[v0] = ex;
            FinskyLog.c("Keyczar exception during signature verification: %s", v3);
            return v0;
        }
        try {
            v4 = p3.split(";");
            v1 = 0;
            while (true) {
                if (v1 >= v4.length) {
                    v1 = String.valueOf(p3);
                    if (v1.length() != 0)
                        v1 = "Signature not found in response: ".concat(v1);
                    else
                        v1 = new String("Signature not found in response: ");
                    throw new DfeResponseVerifier$DfeResponseVerifierException(v1);
                }
                v6 = v4[v1].trim();
                if (v6.startsWith("signature="))
                    break;
                v1 = v1 + 1;
            }
            v0 = new org.keyczar.w(p0).a(ByteBuffer.wrap(v3), ByteBuffer.wrap(Base64.decode(v6.substring(10), 11)));
            return v0;
        }
        catch (KeyczarException ex) {
            v3 = new Object[1];
            v3[v0] = ex;
            FinskyLog.c("Keyczar exception during signature verification: %s", v3);
            return v0;
        }
    }

    private static synchronized org.keyczar.c.e b(Context p0) {
        enter com.google.android.finsky.api.a.cw;
        try {
            if (com.google.android.finsky.api.a.cw.e == 0) {
                v0 = new File(p0.getFilesDir(), com.google.android.finsky.api.a.cw.c);
                if (v0.exists())
                    com.google.android.finsky.api.a.cw.f = new org.keyczar.o(v0.getAbsolutePath());
                com.google.android.finsky.api.a.cw.e = 1;
            }
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.api.a.cw;
            throw ex;
        }
        exit com.google.android.finsky.api.a.cw;
        return com.google.android.finsky.api.a.cw.f;
    }

    public final synchronized String a() {
        enter this;
        try {
            if (com.google.android.finsky.api.a.cw.a != 0) {
                try {
                    if (this.h == 0) {
                        com.google.android.finsky.api.a.cw.a.nextBytes(this.i);
                        this.h = 1;
                    }
                    v0 = String.valueOf(Base64.encodeToString(this.i, 11));
                    if (v0.length() != 0)
                        v0 = "nonce=".concat(v0);
                    else {
                        try {
                            v0 = new String("nonce=");
                        }
                        catch (Throwable ex) {
                            exit this;
                            throw ex;
                        }
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
                exit this;
                return v0;
            }
            throw new DfeResponseVerifier$DfeResponseVerifierException("Uninitialized SecureRandom.");
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    public final void a(byte[] p0, String p1) {
        v0 = com.google.android.finsky.api.a.cw.a(com.google.android.finsky.api.a.cw.a(this.g), this.i, p0, p1);
        if (v0 == 0) {
            v1 = com.google.android.finsky.api.a.cw.b(this.g);
            if (v1 != 0) {
                FinskyLog.a("Retry verification using fallback keys.", new Object[0]);
                v0 = com.google.android.finsky.api.a.cw.a(v1, this.i, p0, p1);
            }
        }
        if (v0 == 0) {
            v2 = new Object[1];
            v2[0] = Boolean.valueOf(v0);
            FinskyLog.a("Response signature verified: %b", v2);
            throw new DfeResponseVerifier$DfeResponseVerifierException("Response signature mismatch.");
        }
        v2 = new Object[1];
        v2[0] = Boolean.valueOf(v0);
        FinskyLog.b("Response signature verified: %b", v2);
    }

}

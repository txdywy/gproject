package com.google.android.finsky.api.p125a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.utils.C4669a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import com.google.android.play.dfe.api.DfeResponseVerifier.DfeResponseVerifierException;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.keyczar.c.e;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.o;
import org.keyczar.w;

public final class cw implements DfeResponseVerifier {
    public static final SecureRandom f7512a;
    public static final String f7513b;
    public static final String f7514c;
    public static e f7515d;
    public static boolean f7516e;
    public static e f7517f;
    public final Context f7518g;
    public boolean f7519h;
    public byte[] f7520i = new byte[256];

    public cw(Context context) {
        this.f7518g = context;
    }

    public final synchronized String mo1549a() {
        String str;
        String valueOf;
        if (f7512a == null) {
            throw new DfeResponseVerifierException("Uninitialized SecureRandom.");
        }
        if (!this.f7519h) {
            f7512a.nextBytes(this.f7520i);
            this.f7519h = true;
        }
        str = "nonce=";
        valueOf = String.valueOf(Base64.encodeToString(this.f7520i, 11));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public final void mo1550a(byte[] bArr, String str) {
        boolean a = cw.m7388a(cw.m7387a(this.f7518g), this.f7520i, bArr, str);
        if (!a) {
            e b = cw.m7389b(this.f7518g);
            if (b != null) {
                FinskyLog.m21659a("Retry verification using fallback keys.", new Object[0]);
                a = cw.m7388a(b, this.f7520i, bArr, str);
            }
        }
        if (a) {
            FinskyLog.m21662b("Response signature verified: %b", Boolean.valueOf(a));
            return;
        }
        FinskyLog.m21659a("Response signature verified: %b", Boolean.valueOf(a));
        throw new DfeResponseVerifierException("Response signature mismatch.");
    }

    private static boolean m7388a(e eVar, byte[] bArr, byte[] bArr2, String str) {
        try {
            w wVar = new w(eVar);
            Object obj = new byte[(bArr.length + bArr2.length)];
            System.arraycopy(bArr, 0, obj, 0, bArr.length);
            System.arraycopy(bArr2, 0, obj, bArr.length, bArr2.length);
            if (TextUtils.isEmpty(str)) {
                FinskyLog.m21667d("No signing response found.", new Object[0]);
                throw new DfeResponseVerifierException("No signing response found.");
            }
            for (String trim : str.split(";")) {
                String trim2 = trim2.trim();
                if (trim2.startsWith("signature=")) {
                    return wVar.a(ByteBuffer.wrap(obj), ByteBuffer.wrap(Base64.decode(trim2.substring(10), 11)));
                }
            }
            String str2 = "Signature not found in response: ";
            String valueOf = String.valueOf(str);
            throw new DfeResponseVerifierException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } catch (KeyczarException e) {
            FinskyLog.m21665c("Keyczar exception during signature verification: %s", e);
            return false;
        }
    }

    private static synchronized e m7387a(Context context) {
        e eVar;
        synchronized (cw.class) {
            if (f7515d == null) {
                f7515d = new C4669a(context.getResources(), f7513b);
            }
            eVar = f7515d;
        }
        return eVar;
    }

    private static synchronized e m7389b(Context context) {
        e eVar;
        synchronized (cw.class) {
            if (!f7516e) {
                File file = new File(context.getFilesDir(), f7514c);
                if (file.exists()) {
                    f7517f = new o(file.getAbsolutePath());
                }
                f7516e = true;
            }
            eVar = f7517f;
        }
        return eVar;
    }

    static {
        SecureRandom instance;
        String str = File.separator;
        f7513b = new StringBuilder(String.valueOf(str).length() + 21).append("keys").append(str).append("dfe-response-auth").toString();
        str = File.separator;
        f7514c = new StringBuilder(String.valueOf(str).length() + 25).append("keys").append(str).append("dfe-response-auth-dev").toString();
        try {
            instance = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            FinskyLog.m21667d("Could not initialize SecureRandom, SHA1PRNG not supported. %s", e);
            instance = null;
        }
        f7512a = instance;
    }
}

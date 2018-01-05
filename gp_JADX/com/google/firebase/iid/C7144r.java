package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.j;
import com.google.android.gms.common.util.l;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

final class C7144r {
    public SharedPreferences f34893a;
    public Context f34894b;

    public C7144r(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    private C7144r(Context context, String str) {
        this.f34894b = context;
        this.f34893a = context.getSharedPreferences(str, 0);
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("-no-backup");
        valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        Context context2 = this.f34894b;
        File file = new File(j.b() ? context2.getNoBackupFilesDir() : l.a(new File(context2.getApplicationInfo().dataDir, "no_backup")), valueOf2);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m32410a()) {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    FirebaseInstanceId.m32352a(this.f34894b, this);
                }
            } catch (IOException e) {
                if (Log.isLoggable("InstanceID/Store", 3)) {
                    valueOf = "InstanceID/Store";
                    String str2 = "Error creating file in no backup dir: ";
                    valueOf2 = String.valueOf(e.getMessage());
                    Log.d(valueOf, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                }
            }
        }
    }

    private static String m32404a(String str, String str2) {
        String str3 = "|S|";
        return new StringBuilder((String.valueOf(str).length() + String.valueOf(str3).length()) + String.valueOf(str2).length()).append(str).append(str3).append(str2).toString();
    }

    private static String m32405c(String str, String str2, String str3) {
        String str4 = "|T|";
        return new StringBuilder((((String.valueOf(str).length() + 1) + String.valueOf(str4).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(str4).append(str2).append("|").append(str3).toString();
    }

    private final void m32406e(String str) {
        Editor edit = this.f34893a.edit();
        for (String str2 : this.f34893a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    public final synchronized C7145s m32407a(String str, String str2, String str3) {
        return C7145s.m32416a(this.f34893a.getString(C7144r.m32405c(str, str2, str3), null));
    }

    final synchronized KeyPair m32408a(String str) {
        KeyPair a;
        a = C7132e.m32390a();
        long currentTimeMillis = System.currentTimeMillis();
        Editor edit = this.f34893a.edit();
        edit.putString(C7144r.m32404a(str, "|P|"), FirebaseInstanceId.m32351a(a.getPublic().getEncoded()));
        edit.putString(C7144r.m32404a(str, "|K|"), FirebaseInstanceId.m32351a(a.getPrivate().getEncoded()));
        edit.putString(C7144r.m32404a(str, "cre"), Long.toString(currentTimeMillis));
        edit.commit();
        return a;
    }

    public final synchronized void m32409a(String str, String str2, String str3, String str4, String str5) {
        String a = C7145s.m32417a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            Editor edit = this.f34893a.edit();
            edit.putString(C7144r.m32405c(str, str2, str3), a);
            edit.commit();
        }
    }

    public final synchronized boolean m32410a() {
        return this.f34893a.getAll().isEmpty();
    }

    public final synchronized void m32411b() {
        this.f34893a.edit().clear().commit();
    }

    final synchronized void m32412b(String str) {
        m32406e(String.valueOf(str).concat("|"));
    }

    public final synchronized void m32413b(String str, String str2, String str3) {
        String c = C7144r.m32405c(str, str2, str3);
        Editor edit = this.f34893a.edit();
        edit.remove(c);
        edit.commit();
    }

    public final synchronized void m32414c(String str) {
        m32406e(String.valueOf(str).concat("|T|"));
    }

    public final synchronized KeyPair m32415d(String str) {
        KeyPair keyPair;
        Object e;
        String string = this.f34893a.getString(C7144r.m32404a(str, "|P|"), null);
        String string2 = this.f34893a.getString(C7144r.m32404a(str, "|K|"), null);
        if (string == null || string2 == null) {
            keyPair = null;
        } else {
            try {
                byte[] decode = Base64.decode(string, 8);
                byte[] decode2 = Base64.decode(string2, 8);
                KeyFactory instance = KeyFactory.getInstance("RSA");
                keyPair = new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (InvalidKeySpecException e2) {
                e = e2;
                string = String.valueOf(e);
                Log.w("InstanceID/Store", new StringBuilder(String.valueOf(string).length() + 19).append("Invalid key stored ").append(string).toString());
                FirebaseInstanceId.m32352a(this.f34894b, this);
                keyPair = null;
                return keyPair;
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                string = String.valueOf(e);
                Log.w("InstanceID/Store", new StringBuilder(String.valueOf(string).length() + 19).append("Invalid key stored ").append(string).toString());
                FirebaseInstanceId.m32352a(this.f34894b, this);
                keyPair = null;
                return keyPair;
            }
        }
        return keyPair;
    }
}

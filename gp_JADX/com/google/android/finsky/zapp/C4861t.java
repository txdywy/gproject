package com.google.android.finsky.zapp;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import com.android.p2putils.ApkSignatureSchemeV2Verifier;
import com.android.p2putils.ApkSignatureSchemeV2Verifier.SignatureNotFoundException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public final class C4861t {
    public static X509Certificate[][] m22743a(File file) {
        try {
            return ApkSignatureSchemeV2Verifier.m4194a(file.getAbsolutePath());
        } catch (SignatureNotFoundException e) {
            return null;
        } catch (SecurityException e2) {
            return null;
        } catch (IOException e3) {
            return null;
        }
    }

    public static Signature[] m22741a(Context context) {
        return C4861t.m22742a(context, context.getPackageName());
    }

    public static List m22745b(Context context) {
        try {
            String[] list = context.getAssets().list("split_certs");
            if (list == null || list.length == 0) {
                Log.i("DynamicModuleDownloader", "No split certificates could be read from the relevant assets folder.");
                return null;
            }
            List arrayList = new ArrayList();
            for (String str : list) {
                String str2;
                if (str2.endsWith(".pem")) {
                    String valueOf = String.valueOf("split_certs/");
                    str2 = String.valueOf(str2);
                    X509Certificate b = C4861t.m22744b(context, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
            }
            return arrayList;
        } catch (IOException e) {
            Log.i("DynamicModuleDownloader", "An IOException is encountered while accessing the split certificates folder.");
            return null;
        }
    }

    private static X509Certificate m22744b(Context context, String str) {
        String str2;
        String str3;
        String valueOf;
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(context.getAssets().open(str));
        } catch (FileNotFoundException e) {
            str2 = "DynamicModuleDownloader";
            str3 = "Certificate file could not be found. Check: ";
            valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        } catch (CertificateException e2) {
            str2 = "DynamicModuleDownloader";
            str3 = "Certificate signature could not be extracted from file. Check: ";
            valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        } catch (IOException e3) {
            str2 = "DynamicModuleDownloader";
            str3 = "Certificate signature could not be read from file. Check: ";
            valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        return null;
    }

    static Signature[] m22742a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    static X509Certificate m22740a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e("DynamicModuleDownloader", "Cannot decode certificate.");
            return null;
        }
    }
}

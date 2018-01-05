package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sx {
    public static final Logger f27484a = Logger.getLogger(sx.class.getName());
    public static final List f27485b;
    public static final sx f27486c = new sx(new sz());
    public static final sx f27487d = new sx(new td());
    public static final sx f27488e = new sx(new ta());
    public static final sx f27489f = new sx(new tc());
    public sy f27490g;
    public List f27491h = f27485b;
    public boolean f27492i = true;

    static {
        if (tj.m25582a()) {
            String[] strArr = new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL"};
            List arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                Provider provider = Security.getProvider(strArr[i]);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f27484a.logp(Level.INFO, "com.google.cloud.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{r4}));
                }
            }
            f27485b = arrayList;
        } else {
            f27485b = new ArrayList();
        }
        sx sxVar = new sx(new tf());
        sxVar = new sx(new te());
        sxVar = new sx(new tb());
    }

    private sx(sy syVar) {
        this.f27490g = syVar;
    }

    private final boolean m25569a(String str, Provider provider) {
        try {
            this.f27490g.mo4865a(str, provider);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public final Object m25570a(String str) {
        for (Provider provider : this.f27491h) {
            if (m25569a(str, provider)) {
                return this.f27490g.mo4865a(str, provider);
            }
        }
        if (this.f27492i) {
            return this.f27490g.mo4865a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }
}

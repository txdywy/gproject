package com.google.firebase.iid;

import android.support.v7.widget.eq;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public final class C7132e {
    public static KeyPair m32390a() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(eq.FLAG_MOVED);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}

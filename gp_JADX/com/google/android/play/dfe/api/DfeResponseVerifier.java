package com.google.android.play.dfe.api;

public interface DfeResponseVerifier {

    public class DfeResponseVerifierException extends Exception {
        public DfeResponseVerifierException(String str) {
            super(str);
        }
    }

    String mo1549a();

    void mo1550a(byte[] bArr, String str);
}

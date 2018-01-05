package com.android.p2putils;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

class C0598f extends X509Certificate {
    public final X509Certificate f3939b;

    public C0598f(X509Certificate x509Certificate) {
        this.f3939b = x509Certificate;
    }

    public Set getCriticalExtensionOIDs() {
        return this.f3939b.getCriticalExtensionOIDs();
    }

    public byte[] getExtensionValue(String str) {
        return this.f3939b.getExtensionValue(str);
    }

    public Set getNonCriticalExtensionOIDs() {
        return this.f3939b.getNonCriticalExtensionOIDs();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.f3939b.hasUnsupportedCriticalExtension();
    }

    public void checkValidity() {
        this.f3939b.checkValidity();
    }

    public void checkValidity(Date date) {
        this.f3939b.checkValidity(date);
    }

    public int getVersion() {
        return this.f3939b.getVersion();
    }

    public BigInteger getSerialNumber() {
        return this.f3939b.getSerialNumber();
    }

    public Principal getIssuerDN() {
        return this.f3939b.getIssuerDN();
    }

    public Principal getSubjectDN() {
        return this.f3939b.getSubjectDN();
    }

    public Date getNotBefore() {
        return this.f3939b.getNotBefore();
    }

    public Date getNotAfter() {
        return this.f3939b.getNotAfter();
    }

    public byte[] getTBSCertificate() {
        return this.f3939b.getTBSCertificate();
    }

    public byte[] getSignature() {
        return this.f3939b.getSignature();
    }

    public String getSigAlgName() {
        return this.f3939b.getSigAlgName();
    }

    public String getSigAlgOID() {
        return this.f3939b.getSigAlgOID();
    }

    public byte[] getSigAlgParams() {
        return this.f3939b.getSigAlgParams();
    }

    public boolean[] getIssuerUniqueID() {
        return this.f3939b.getIssuerUniqueID();
    }

    public boolean[] getSubjectUniqueID() {
        return this.f3939b.getSubjectUniqueID();
    }

    public boolean[] getKeyUsage() {
        return this.f3939b.getKeyUsage();
    }

    public int getBasicConstraints() {
        return this.f3939b.getBasicConstraints();
    }

    public byte[] getEncoded() {
        return this.f3939b.getEncoded();
    }

    public void verify(PublicKey publicKey) {
        this.f3939b.verify(publicKey);
    }

    public void verify(PublicKey publicKey, String str) {
        this.f3939b.verify(publicKey, str);
    }

    public String toString() {
        return this.f3939b.toString();
    }

    public PublicKey getPublicKey() {
        return this.f3939b.getPublicKey();
    }
}

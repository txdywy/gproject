package com.android.p2putils;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

public class com.android.p2putils.f extends X509Certificate
{

    public final X509Certificate b;

    f(X509Certificate p0) {
        X509Certificate();
        this.b = p0;
    }

    public void checkValidity() {
        this.b.checkValidity();
    }

    public void checkValidity(Date p0) {
        this.b.checkValidity(p0);
    }

    public int getBasicConstraints() {
        return this.b.getBasicConstraints();
    }

    public Set getCriticalExtensionOIDs() {
        return this.b.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() {
        return this.b.getEncoded();
    }

    public byte[] getExtensionValue(String p0) {
        return this.b.getExtensionValue(p0);
    }

    public Principal getIssuerDN() {
        return this.b.getIssuerDN();
    }

    public boolean[] getIssuerUniqueID() {
        return this.b.getIssuerUniqueID();
    }

    public boolean[] getKeyUsage() {
        return this.b.getKeyUsage();
    }

    public Set getNonCriticalExtensionOIDs() {
        return this.b.getNonCriticalExtensionOIDs();
    }

    public Date getNotAfter() {
        return this.b.getNotAfter();
    }

    public Date getNotBefore() {
        return this.b.getNotBefore();
    }

    public PublicKey getPublicKey() {
        return this.b.getPublicKey();
    }

    public BigInteger getSerialNumber() {
        return this.b.getSerialNumber();
    }

    public String getSigAlgName() {
        return this.b.getSigAlgName();
    }

    public String getSigAlgOID() {
        return this.b.getSigAlgOID();
    }

    public byte[] getSigAlgParams() {
        return this.b.getSigAlgParams();
    }

    public byte[] getSignature() {
        return this.b.getSignature();
    }

    public Principal getSubjectDN() {
        return this.b.getSubjectDN();
    }

    public boolean[] getSubjectUniqueID() {
        return this.b.getSubjectUniqueID();
    }

    public byte[] getTBSCertificate() {
        return this.b.getTBSCertificate();
    }

    public int getVersion() {
        return this.b.getVersion();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.b.hasUnsupportedCriticalExtension();
    }

    public String toString() {
        return this.b.toString();
    }

    public void verify(PublicKey p0) {
        this.b.verify(p0);
    }

    public void verify(PublicKey p0, String p1) {
        this.b.verify(p0, p1);
    }

}

package org.keyczar.exceptions;

import com.squareup.haha.perflib.HprofParser;
import org.keyczar.p570b.C7985a;

public class KeyNotFoundException extends KeyczarException {
    public KeyNotFoundException(byte[] bArr) {
        super(C7985a.m38177a("KeyWithHashIdentifier", Integer.toHexString(((((bArr[0] & HprofParser.ROOT_UNKNOWN) << 24) | ((bArr[1] & HprofParser.ROOT_UNKNOWN) << 16)) | ((bArr[2] & HprofParser.ROOT_UNKNOWN) << 8)) | (bArr[3] & HprofParser.ROOT_UNKNOWN))));
    }
}

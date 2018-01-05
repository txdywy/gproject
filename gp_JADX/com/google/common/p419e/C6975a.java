package com.google.common.p419e;

import com.squareup.haha.perflib.HprofParser;

public final class C6975a {
    public static int m31829a(byte b, byte b2, byte b3, byte b4) {
        return (((b << 24) | ((b2 & HprofParser.ROOT_UNKNOWN) << 16)) | ((b3 & HprofParser.ROOT_UNKNOWN) << 8)) | (b4 & HprofParser.ROOT_UNKNOWN);
    }
}

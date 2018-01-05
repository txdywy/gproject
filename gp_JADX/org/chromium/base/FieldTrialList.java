package org.chromium.base;

public class FieldTrialList {
    private FieldTrialList() {
    }

    private static native String nativeFindFullName(String str);

    private static native String nativeGetVariationParameter(String str, String str2);

    private static native boolean nativeTrialExists(String str);
}

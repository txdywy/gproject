package com.google.android.wallet.common.util;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.protobuf.nano.i;

public final class C6595g {
    public static Bundle m29923a(Bundle bundle, int i, String str, String str2, ae aeVar, String str3, String str4) {
        if (TextUtils.isEmpty(str) || ((TextUtils.isEmpty(str2) && aeVar == null) || TextUtils.isEmpty(str4))) {
            String str5 = "Error title, message, and button text are required. Received values: title: %s  errorMessage: %s  infoMessage: %s  buttonText: %s";
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = aeVar == null ? null : aeVar.e;
            objArr[3] = str4;
            throw new IllegalArgumentException(String.format(str5, objArr));
        } else if (TextUtils.isEmpty(str2) || aeVar == null) {
            i aeVar2;
            bundle.putInt("ErrorUtils.KEY_TYPE", i);
            bundle.putString("ErrorUtils.KEY_TITLE", str);
            if (aeVar == null) {
                aeVar2 = new ae();
                aeVar2.e = str2;
            }
            bundle.putParcelable("ErrorUtils.KEY_ERROR_INFO_MESSAGE", ParcelableProto.m29885a(aeVar2));
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("ErrorUtils.KEY_ERROR_CODE", str3);
            }
            bundle.putString("ErrorUtils.KEY_ERROR_BUTTON_TEXT", str4);
            return bundle;
        } else {
            throw new IllegalArgumentException(String.format("Error message and InfoMessage may not both be set. Received values: message: %s infoMessage: %s", new Object[]{str2, aeVar.e}));
        }
    }
}

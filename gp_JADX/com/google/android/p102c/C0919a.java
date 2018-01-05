package com.google.android.p102c;

import android.content.Intent;

public final class C0919a {
    public static String m5642a(String str) {
        return "service_" + str;
    }

    static {
        new Intent().setPackage("com.google.android.gsf.login").setAction("com.google.android.gsf.action.GET_GLS").addCategory("android.intent.category.DEFAULT");
    }
}

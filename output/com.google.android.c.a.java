package com.google.android.c;

import android.content.Intent;

public static class com.google.android.c.a
{

    static {
        new Intent().setPackage("com.google.android.gsf.login").setAction("com.google.android.gsf.action.GET_GLS").addCategory("android.intent.category.DEFAULT");
    }

    public static String a(String p0) {
        return "service_" + p0;
    }

}

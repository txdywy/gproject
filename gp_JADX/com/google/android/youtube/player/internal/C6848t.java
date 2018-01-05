package com.google.android.youtube.player.internal;

import android.content.Context;
import android.content.res.Resources;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class C6848t {
    public final String f33853a;
    public final String f33854b;
    public final String f33855c;
    public final String f33856d;
    public final String f33857e;
    public final String f33858f;
    public final String f33859g;
    public final String f33860h;
    public final String f33861i;
    public final String f33862j;

    public C6848t(Context context) {
        Resources resources = context.getResources();
        Locale locale = (resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale;
        Map hashMap = new HashMap();
        hashMap.put("error_initializing_player", "An error occurred while initializing the YouTube player.");
        hashMap.put("get_youtube_app_title", "Get YouTube App");
        hashMap.put("get_youtube_app_text", "This app won't run without the YouTube App, which is missing from your device");
        hashMap.put("get_youtube_app_action", "Get YouTube App");
        hashMap.put("enable_youtube_app_title", "Enable YouTube App");
        hashMap.put("enable_youtube_app_text", "This app won't work unless you enable the YouTube App.");
        hashMap.put("enable_youtube_app_action", "Enable YouTube App");
        hashMap.put("update_youtube_app_title", "Update YouTube App");
        hashMap.put("update_youtube_app_text", "This app won't work unless you update the YouTube App.");
        hashMap.put("update_youtube_app_action", "Update YouTube App");
        ap.m31118a(hashMap, locale.getLanguage());
        String valueOf = String.valueOf(locale.getLanguage());
        String valueOf2 = String.valueOf(locale.getCountry());
        ap.m31118a(hashMap, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("_").append(valueOf2).toString());
        this.f33853a = (String) hashMap.get("error_initializing_player");
        this.f33854b = (String) hashMap.get("get_youtube_app_title");
        this.f33855c = (String) hashMap.get("get_youtube_app_text");
        this.f33856d = (String) hashMap.get("get_youtube_app_action");
        this.f33857e = (String) hashMap.get("enable_youtube_app_title");
        this.f33858f = (String) hashMap.get("enable_youtube_app_text");
        this.f33859g = (String) hashMap.get("enable_youtube_app_action");
        this.f33860h = (String) hashMap.get("update_youtube_app_title");
        this.f33861i = (String) hashMap.get("update_youtube_app_text");
        this.f33862j = (String) hashMap.get("update_youtube_app_action");
    }
}

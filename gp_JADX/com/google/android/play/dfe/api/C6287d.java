package com.google.android.play.dfe.api;

import android.net.Uri;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;

public interface C6287d {
    public static final Uri f31354a = Uri.parse("https://android.clients.google.com/fdfe/");
    public static final Uri f31355b = Uri.parse("api/plusProfile");
    public static final Uri f31356c = Uri.parse("api/userProfile");

    static {
        Uri.parse("api/experiments");
        Uri.parse("api/searchSuggest");
    }

    C0656n mo5376a(C0660x c0660x, C0657w c0657w);

    C0656n mo5377a(C0660x c0660x, C0657w c0657w, boolean z);

    void mo5378a();
}

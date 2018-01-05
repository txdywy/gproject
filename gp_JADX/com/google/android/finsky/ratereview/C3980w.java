package com.google.android.finsky.ratereview;

import android.text.TextUtils;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.kd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.protobuf.nano.C0757i;
import java.util.Map;

public final class C3980w {
    public final iu f20067a = new iu();
    public final String f20068b;
    public final String f20069c;
    public boolean f20070d = false;

    public C3980w(String str, int i, String str2, String str3, kd kdVar, Document document, String str4, long j) {
        iu iuVar = this.f20067a;
        iuVar.f12714b |= 2;
        iuVar.f12717e = i;
        iuVar = this.f20067a;
        if (str2 == null) {
            throw new NullPointerException();
        }
        iuVar.f12714b |= 4;
        iuVar.f12719g = str2;
        iuVar = this.f20067a;
        if (str3 == null) {
            throw new NullPointerException();
        }
        cv cvVar;
        iuVar.f12714b |= 8;
        iuVar.f12720h = str3;
        iu iuVar2 = this.f20067a;
        if (document != null) {
            cvVar = document.f14885a;
        } else {
            cvVar = null;
        }
        iuVar2.f12716d = cvVar;
        iuVar = this.f20067a;
        iuVar.f12714b |= 128;
        iuVar.f12724l = j;
        this.f20067a.f12730r = kdVar;
        this.f20068b = str;
        this.f20069c = str4;
    }

    public static C3980w m18697a(Map map, Document document) {
        if (map.containsKey("doc_id") && map.containsKey("rating") && map.containsKey("title") && map.containsKey("content") && map.containsKey("doc_timestamp") && map.containsKey("structured_reviews")) {
            try {
                String str;
                String str2 = (String) map.get("doc_id");
                int parseInt = Integer.parseInt((String) map.get("rating"));
                String str3 = (String) map.get("title");
                String str4 = (String) map.get("content");
                if (map.containsKey("doc_user_review_url_key")) {
                    str = (String) map.get("doc_user_review_url_key");
                } else {
                    str = null;
                }
                long parseLong = Long.parseLong((String) map.get("doc_timestamp"));
                String str5 = (String) map.get("structured_reviews");
                C0757i kdVar = TextUtils.isEmpty(str5) ? null : new kd();
                if (kdVar != null) {
                    ab.m21686a(str5, kdVar);
                }
                return new C3980w(str2, parseInt, str3, str4, kdVar, document, str, parseLong);
            } catch (NumberFormatException e) {
                FinskyLog.m21667d("Error parsing numbers from persisted cache: %s", e.toString());
                return null;
            }
        }
        FinskyLog.m21667d("Review badly persisted: %s", map.keySet().toString());
        return null;
    }
}

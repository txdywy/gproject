package com.google.android.finsky.ratereview;

import com.android.volley.C0660x;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.le;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Collection;
import java.util.Map;

final class C3978u implements C0660x {
    public final /* synthetic */ Collection f20064a;
    public final /* synthetic */ boolean f20065b;
    public final /* synthetic */ C3974q f20066c;

    C3978u(C3974q c3974q, Collection collection, boolean z) {
        this.f20066c = c3974q;
        this.f20064a = collection;
        this.f20065b = z;
    }

    public final /* synthetic */ void b_(Object obj) {
        le leVar = (le) obj;
        C3974q c3974q = this.f20066c;
        cv cvVar = leVar.f13004a;
        Collection<Map> collection = this.f20064a;
        Map map = this.f20065b ? c3974q.f20057f : c3974q.f20056e;
        if (cvVar == null) {
            FinskyLog.m21667d("Error getting user's g+ profile: %s", FinskyLog.m21655a(c3974q.f20053b));
            return;
        }
        Document document = new Document(cvVar);
        for (Map a : collection) {
            C3980w a2 = C3980w.m18697a(a, document);
            if (a2 != null) {
                map.put(a2.f20068b, a2);
            }
        }
    }
}

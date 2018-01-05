package com.google.android.finsky;

import com.android.volley.C0660x;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class C3639j implements C0660x {
    public final /* synthetic */ List f18004a;
    public final /* synthetic */ DfeNotificationManagerImpl f18005b;

    C3639j(DfeNotificationManagerImpl dfeNotificationManagerImpl, List list) {
        this.f18005b = dfeNotificationManagerImpl;
        this.f18004a = list;
    }

    public final /* synthetic */ void b_(Object obj) {
        FinskyLog.m21659a("Notifications [%s] successfully ack'd.", this.f18004a);
        this.f18005b.f5765c.removeAll(this.f18004a);
        this.f18005b.m5707a();
    }
}

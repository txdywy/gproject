package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.wearable.C5613a;
import com.google.android.gms.wearable.PutDataRequest;

public final class C5633j implements C5613a {
    public final C4954s mo5114a(C5058o c5058o) {
        return c5058o.mo4544a(new C5636m(c5058o));
    }

    public final C4954s mo5115a(C5058o c5058o, Uri uri) {
        return c5058o.mo4544a(new C5635l(c5058o, uri));
    }

    public final C4954s mo5116a(C5058o c5058o, Uri uri, int i) {
        boolean z = false;
        am.m23743b(uri != null, "uri must not be null");
        if (i == 0 || i == 1) {
            z = true;
        }
        am.m23743b(z, "invalid filter type");
        return c5058o.mo4544a(new C5637n(c5058o, uri, i));
    }

    public final C4954s mo5117a(C5058o c5058o, PutDataRequest putDataRequest) {
        return c5058o.mo4544a(new C5634k(c5058o, putDataRequest));
    }

    public final C4954s mo5118b(C5058o c5058o, Uri uri) {
        return mo5116a(c5058o, uri, 0);
    }

    public final C4954s mo5119c(C5058o c5058o, Uri uri) {
        am.m23743b(uri != null, "uri must not be null");
        am.m23743b(true, "invalid filter type");
        return c5058o.mo4544a(new C5638o(c5058o, uri));
    }
}

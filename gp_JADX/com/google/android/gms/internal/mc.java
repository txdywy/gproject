package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.C5323d;
import com.google.android.gms.safetynet.SafeBrowsingData;

final class mc implements C5323d {
    public Status f27167a;
    public final SafeBrowsingData f27168b;
    public String f27169c = null;

    public mc(Status status, SafeBrowsingData safeBrowsingData) {
        this.f27167a = status;
        this.f27168b = safeBrowsingData;
        if (this.f27168b != null) {
            this.f27169c = this.f27168b.f28487a;
        } else if (this.f27167a.m23271a()) {
            this.f27167a = new Status(8);
        }
    }

    public final String mo4818a() {
        return this.f27169c;
    }

    public final Status mo4505b() {
        return this.f27167a;
    }
}

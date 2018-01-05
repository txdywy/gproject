package com.google.android.finsky.instantappsquickinstall;

import com.android.volley.C0660x;
import com.google.android.finsky.dfemodel.Document;
import com.google.wireless.android.finsky.dfe.nano.by;

final class C3604a implements C0660x {
    public final /* synthetic */ InstantAppsInstallDialogActivity f17932a;

    C3604a(InstantAppsInstallDialogActivity instantAppsInstallDialogActivity) {
        this.f17932a = instantAppsInstallDialogActivity;
    }

    public final /* synthetic */ void b_(Object obj) {
        by byVar = (by) obj;
        this.f17932a.f17921H = new Document(byVar.c);
        InstantAppsInstallDialogActivity instantAppsInstallDialogActivity = this.f17932a;
        if (instantAppsInstallDialogActivity.f17921H == null) {
            instantAppsInstallDialogActivity.finish();
        }
        instantAppsInstallDialogActivity.f17922I.m17211a(instantAppsInstallDialogActivity.f17921H);
        this.f17932a.f17923J = null;
    }
}

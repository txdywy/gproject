package com.google.android.finsky.instantapps.p216c;

import com.google.android.finsky.instantapps.AppManagementService;
import com.google.android.finsky.instantapps.EphemeralInstallerActivity;
import com.google.android.finsky.instantapps.InstantAppHygieneService;
import com.google.android.finsky.instantapps.InstantAppsConfigChangeListener;
import com.google.android.finsky.instantapps.InstantAppsLoggingService;
import com.google.android.finsky.instantapps.PackageReplacedReceiver;
import com.google.android.finsky.instantapps.PhenotypeUpdateService;
import com.google.android.finsky.instantapps.SettingsActivity;
import com.google.android.finsky.instantapps.appmanagement.InstantAppRemoveMonitor;
import com.google.android.finsky.instantapps.metrics.AppUpgradeToInstalledService;
import com.google.android.finsky.instantapps.metrics.LogFlushJob;
import com.google.android.finsky.instantapps.statussync.StatusSyncService;
import com.google.android.finsky.instantappsbackendclient.p215b.C3409a;

public interface C3410c extends C3409a {
    void mo3504a();

    void mo3505a(AppManagementService appManagementService);

    void mo3506a(EphemeralInstallerActivity ephemeralInstallerActivity);

    void mo3507a(InstantAppHygieneService instantAppHygieneService);

    void mo3508a(InstantAppsConfigChangeListener instantAppsConfigChangeListener);

    void mo3509a(InstantAppsLoggingService instantAppsLoggingService);

    void mo3510a(PackageReplacedReceiver packageReplacedReceiver);

    void mo3511a(PhenotypeUpdateService phenotypeUpdateService);

    void mo3512a(SettingsActivity settingsActivity);

    void mo3513a(InstantAppRemoveMonitor instantAppRemoveMonitor);

    void mo3514a(AppUpgradeToInstalledService appUpgradeToInstalledService);

    void mo3515a(LogFlushJob logFlushJob);

    void mo3516a(StatusSyncService statusSyncService);
}

package com.google.android.finsky.instantapps;

import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.instantappsbackendclient.impl.UpdateContentFilterJob;
import com.google.android.finsky.utils.FinskyLog;

public class ContentFilterUpdatedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("com.google.android.finsky.action.CONTENT_FILTERS_CHANGED".equals(intent.getAction())) {
            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new Builder(156466975, new ComponentName(context, UpdateContentFilterJob.class)).setOverrideDeadline(0).build());
            FinskyLog.m21662b("Scheduled AIA content filter forceUpdate", new Object[0]);
        }
    }
}

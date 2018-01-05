package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.ApplicationErrorReport.CrashInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.List;

public final class ei extends C4951c {
    protected final String cu_() {
        throw new NoSuchMethodError();
    }

    protected final String mo4483b() {
        throw new NoSuchMethodError();
    }

    @TargetApi(14)
    public static ErrorReport m24333a(FeedbackOptions feedbackOptions, File file) {
        ErrorReport errorReport = new ErrorReport();
        if (feedbackOptions == null) {
            return errorReport;
        }
        if (feedbackOptions.f26182b != null && feedbackOptions.f26182b.size() > 0) {
            errorReport.f26132D = feedbackOptions.f26182b;
        }
        if (!TextUtils.isEmpty(feedbackOptions.f26181a)) {
            errorReport.f26130B = feedbackOptions.f26181a;
        }
        if (!TextUtils.isEmpty(feedbackOptions.f26183c)) {
            errorReport.f26156b = feedbackOptions.f26183c;
        }
        CrashInfo crashInfo = feedbackOptions.f26184d == null ? null : feedbackOptions.f26184d.crashInfo;
        if (crashInfo != null) {
            errorReport.f26141M = crashInfo.throwMethodName;
            errorReport.f26139K = crashInfo.throwLineNumber;
            errorReport.f26140L = crashInfo.throwClassName;
            errorReport.f26142N = crashInfo.stackTrace;
            errorReport.f26137I = crashInfo.exceptionClassName;
            errorReport.f26143O = crashInfo.exceptionMessage;
            errorReport.f26138J = crashInfo.throwFileName;
        }
        if (feedbackOptions.f26190j != null) {
            errorReport.f26153Y = feedbackOptions.f26190j;
        }
        if (!TextUtils.isEmpty(feedbackOptions.f26185e)) {
            errorReport.f26144P = feedbackOptions.f26185e;
        }
        if (!TextUtils.isEmpty(feedbackOptions.f26187g)) {
            errorReport.f26155a.packageName = feedbackOptions.f26187g;
        }
        if (file != null) {
            if (feedbackOptions.f26186f != null) {
                errorReport.f26147S = feedbackOptions.f26186f;
                BitmapTeleporter bitmapTeleporter = errorReport.f26147S;
                if (file == null) {
                    throw new NullPointerException("Cannot set null temp directory");
                }
                bitmapTeleporter.f25947f = file;
            }
            List list = feedbackOptions.f26188h;
            if (!(list == null || list.size() == 0)) {
                m24334a(list, file);
                errorReport.f26149U = (FileTeleporter[]) feedbackOptions.f26188h.toArray(new FileTeleporter[feedbackOptions.f26188h.size()]);
            }
        }
        if (feedbackOptions.f26191k != null) {
            errorReport.f26154Z = feedbackOptions.f26191k;
        }
        errorReport.f26151W = feedbackOptions.f26189i;
        errorReport.ae = feedbackOptions.f26192l;
        return errorReport;
    }

    private static void m24334a(List list, File file) {
        for (int i = 0; i < list.size(); i++) {
            FileTeleporter fileTeleporter = (FileTeleporter) list.get(i);
            if (fileTeleporter != null) {
                if (file == null) {
                    throw new NullPointerException("Cannot set null temp directory");
                }
                fileTeleporter.f26198e = file;
            }
        }
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        throw new NoSuchMethodError();
    }
}

package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public final class C5226i {
    public static Bitmap m24040a(Activity activity) {
        Object futureTask = new FutureTask(new C5227j(activity));
        activity.runOnUiThread(futureTask);
        try {
            return (Bitmap) futureTask.get();
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        Log.w("gH_Utils", "Taking screenshot failed!");
        return null;
    }

    static Bitmap m24041b(Activity activity) {
        int i = 0;
        Bitmap bitmap = null;
        try {
            View rootView = activity.getWindow().getDecorView().getRootView();
            View findViewById = rootView.findViewById(16908290);
            if (findViewById != null) {
                int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i = activity.getResources().getDimensionPixelSize(identifier);
                }
                i += findViewById.getTop();
                if (i < rootView.getHeight()) {
                    Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Config.RGB_565);
                    rootView.draw(new Canvas(createBitmap));
                    bitmap = Bitmap.createBitmap(createBitmap, 0, i, createBitmap.getWidth(), Math.min(createBitmap.getHeight() - i, findViewById.getHeight()));
                }
            }
        } catch (Throwable e) {
            Log.w("gH_Utils", "Get screenshot failed!", e);
        }
        return bitmap;
    }
}

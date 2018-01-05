package com.google.android.finsky.notification;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import p002a.C0002a;

public final class C3817p {
    public final Context f19143a;
    public final C0002a f19144b;

    public C3817p(Context context, C0002a c0002a) {
        this.f19143a = context;
        this.f19144b = c0002a;
    }

    public final void m18259a(C3816o c3816o, String str, C3806r c3806r) {
        if (c3816o == null) {
            c3806r.mo3812a(null);
        } else if (c3816o.f19141b != null && !TextUtils.isEmpty(c3816o.f19141b.f11860f)) {
            String str2 = c3816o.f19141b.f11860f;
            y c3818q = new C3818q(c3806r);
            x a = ((C1294w) this.f19144b.mo1a()).mo1671a(str2, this.f19143a.getResources().getDimensionPixelSize(17104901), this.f19143a.getResources().getDimensionPixelSize(17104902), c3818q);
            if (a.b() != null) {
                c3818q.a(a);
            }
        } else if (c3816o.f19140a != null) {
            c3806r.mo3812a(m18257a(this.f19143a.getResources().getDrawable(c3816o.f19140a.intValue()), str));
        } else if (c3816o.f19142c != null) {
            c3806r.mo3812a(m18258a(c3816o.f19142c));
        } else {
            FinskyLog.m21667d("NotificationImage is missing an image!", new Object[0]);
            c3806r.mo3812a(null);
        }
    }

    private final Bitmap m18258a(String str) {
        try {
            Drawable loadUnbadgedIcon;
            PackageManager packageManager = this.f19143a.getPackageManager();
            if (VERSION.SDK_INT >= 22) {
                loadUnbadgedIcon = packageManager.getApplicationInfo(str, MemoryMappedFileBuffer.DEFAULT_PADDING).loadUnbadgedIcon(packageManager);
            } else {
                loadUnbadgedIcon = packageManager.getApplicationIcon(str);
            }
            if (loadUnbadgedIcon != null) {
                return m18257a(loadUnbadgedIcon, str);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    private final synchronized Bitmap m18257a(Drawable drawable, String str) {
        Bitmap createBitmap;
        Resources resources = this.f19143a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(17104901);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(17104902);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > dimensionPixelSize || intrinsicHeight > dimensionPixelSize2 || !(drawable instanceof BitmapDrawable)) {
            FinskyLog.m21665c("Resource for %s is %s of size %d*%d", str, drawable.getClass().getName(), Integer.valueOf(intrinsicWidth), Integer.valueOf(intrinsicHeight));
            float min = Math.min(1.0f, Math.min(((float) dimensionPixelSize) / ((float) intrinsicWidth), ((float) dimensionPixelSize2) / ((float) intrinsicHeight)));
            dimensionPixelSize = (int) (((float) intrinsicWidth) * min);
            intrinsicWidth = (int) (min * ((float) intrinsicHeight));
            createBitmap = Bitmap.createBitmap(dimensionPixelSize, intrinsicWidth, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, dimensionPixelSize, intrinsicWidth);
            drawable.draw(canvas);
        } else {
            createBitmap = ((BitmapDrawable) drawable).getBitmap();
        }
        return createBitmap;
    }
}

package com.google.android.play.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Process;
import com.google.android.play.utils.C6449e;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.b.j;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.BlockingDeque;

final class at extends Thread {
    public final BlockingDeque f32024a;
    public final Map f32025b;
    public volatile boolean f32026c = false;
    public final /* synthetic */ as f32027d;

    public at(as asVar, BlockingDeque blockingDeque, Map map) {
        this.f32027d = asVar;
        this.f32024a = blockingDeque;
        this.f32025b = map;
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (!this.f32026c) {
            try {
                aw awVar = (aw) this.f32024a.takeFirst();
                this.f32025b.remove(awVar.f32035e);
                byte[] bArr = awVar.f32032b.f32007a;
                if (bArr == null || bArr.length == 0) {
                    this.f32027d.f32021c.post(new au(awVar));
                } else {
                    Bitmap decodeByteArray;
                    try {
                        double d;
                        double d2;
                        int length = bArr.length;
                        Options options = new Options();
                        options.inPreferredConfig = Config.RGB_565;
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(awVar.f32032b.f32007a, 0, awVar.f32032b.f32007a.length, options);
                        options.inJustDecodeBounds = false;
                        if (awVar.f32033c == 0) {
                            d = 1.0d;
                        } else {
                            d = (((double) options.outWidth) * 1.25d) / ((double) awVar.f32033c);
                        }
                        if (awVar.f32034d == 0) {
                            d2 = 1.0d;
                        } else {
                            d2 = (((double) options.outHeight) * 1.25d) / ((double) awVar.f32034d);
                        }
                        d = Math.min(d, d2);
                        float f = 1.0f;
                        while (((double) (2.0f * f)) <= d) {
                            f *= 2.0f;
                        }
                        options.inSampleSize = (int) f;
                        decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, length, options);
                    } catch (OutOfMemoryError e) {
                        PlayCommonLog.m29464e("OutOfMemoryError while decoding %s", awVar.f32031a);
                        decodeByteArray = null;
                    }
                    if (((Boolean) j.z.b()).booleanValue()) {
                        C6449e.m29500a(decodeByteArray, awVar.f32031a, bArr.length / MemoryMappedFileBuffer.DEFAULT_PADDING);
                    }
                    this.f32027d.f32021c.post(new av(awVar, decodeByteArray));
                    ag agVar = this.f32027d.f32022d;
                    agVar.o.a(awVar.f32031a, new WeakReference(decodeByteArray));
                }
            } catch (InterruptedException e2) {
                if (this.f32026c) {
                    return;
                }
            }
        }
    }
}

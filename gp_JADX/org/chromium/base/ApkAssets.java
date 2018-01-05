package org.chromium.base;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import java.io.IOException;
import org.chromium.base.annotations.CalledByNative;

public class ApkAssets {
    @CalledByNative
    public static long[] open(String str) {
        long[] jArr;
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = C7888e.f40514a.getAssets().openNonAssetFd(str);
            jArr = new long[]{(long) assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (Throwable e) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e);
                }
            }
        } catch (IOException e2) {
            if (!(e2.getMessage().equals("") || e2.getMessage().equals(str))) {
                Log.e("ApkAssets", "Error while loading asset " + str + ": " + e2);
            }
            jArr = new long[3];
            jArr = new long[]{-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (Throwable e3) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e3);
                }
            }
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (Throwable e32) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e32);
                }
            }
        }
        return jArr;
    }
}

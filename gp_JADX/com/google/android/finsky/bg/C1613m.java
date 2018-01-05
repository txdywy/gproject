package com.google.android.finsky.bg;

import android.content.res.Resources;
import com.squareup.leakcanary.C7582R;

public final class C1613m {
    public static String m9289a(long j, Resources resources) {
        long j2 = 0;
        if (j < 0) {
            return "";
        }
        String string;
        int i = 0;
        while (j >= 990) {
            j2 = 1023 & j;
            j >>= 10;
            i++;
        }
        switch (i) {
            case 0:
                if (resources != null) {
                    string = resources.getString(C7582R.string.byteShort);
                    break;
                }
                string = "B";
                break;
            case 1:
                if (resources != null) {
                    string = resources.getString(C7582R.string.kilobyteShort);
                    break;
                }
                string = "KB";
                break;
            case 2:
                if (resources != null) {
                    string = resources.getString(C7582R.string.megabyteShort);
                    break;
                }
                string = "MB";
                break;
            case 3:
                if (resources != null) {
                    string = resources.getString(C7582R.string.gigabyteShort);
                    break;
                }
                string = "GB";
                break;
            case 4:
                if (resources != null) {
                    string = resources.getString(C7582R.string.terabyteShort);
                    break;
                }
                string = "TB";
                break;
            case 5:
                if (resources != null) {
                    string = resources.getString(C7582R.string.petabyteShort);
                    break;
                }
                string = "PB";
                break;
            case 6:
                if (resources != null) {
                    string = resources.getString(C7582R.string.exabyteShort);
                    break;
                }
                string = "EB";
                break;
            default:
                string = "";
                break;
        }
        if (j >= 10) {
            return new StringBuilder(String.valueOf(string).length() + 12).append((int) Math.round((((double) j2) / 1024.0d) + ((double) j))).append(" ").append(string).toString();
        }
        return new StringBuilder(String.valueOf(string).length() + 25).append(((double) Math.round(((((double) j2) / 1024.0d) + ((double) j)) * 10.0d)) / 10.0d).append(" ").append(string).toString();
    }
}

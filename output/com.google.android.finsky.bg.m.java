package com.google.android.finsky.bg;

import android.content.res.Resources;

public static class com.google.android.finsky.bg.m
{

    public static String a(long p0, Resources p2) {
        v2 = 0;
        if (p0 < 0)
            v0 = "";
        else {
            v0 = 0;
            while (p0 >= 990) {
                v2 = 1023 & p0;
                p0 = p0 >> 10;
                v0 = v0 + 1;
            }
            switch (v0) {
                case 0:
                    if (p2 == 0)
                        v0 = "B";
                    else
                        v0 = p2.getString(2131951795);
                    break;
                case 1:
                    if (p2 == 0)
                        v0 = "KB";
                    else
                        v0 = p2.getString(2131952402);
                    break;
                case 2:
                    if (p2 == 0)
                        v0 = "MB";
                    else
                        v0 = p2.getString(2131952486);
                    break;
                case 3:
                    if (p2 == 0)
                        v0 = "GB";
                    else
                        v0 = p2.getString(2131952249);
                    break;
                case 4:
                    if (p2 == 0)
                        v0 = "TB";
                    else
                        v0 = p2.getString(2131953220);
                    break;
                case 5:
                    if (p2 == 0)
                        v0 = "PB";
                    else
                        v0 = p2.getString(2131952842);
                    break;
                case 6:
                    if (p2 == 0)
                        v0 = "EB";
                    else
                        v0 = p2.getString(2131952133);
                    break;
                default:
                    v0 = "";
                    break;
            }
            if (p0 >= 10)
                v0 = (String.valueOf(v0).length() + 12) + (int)Math.round((double)v2 / 4652218415073722368 + (double)p0) + " " + v0;
            else
                v0 = (String.valueOf(v0).length() + 25) + ((double)Math.round(((double)v2 / 4652218415073722368 + (double)p0) * 4621819117588971520) / 4621819117588971520) + " " + v0;
        }
        return v0;
    }

}

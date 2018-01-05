package com.google.android.play.image;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.b.j;
import com.google.android.play.utils.c.d;
import com.google.android.play.utils.f;
import com.google.android.play.utils.p146c.C6444c;
import java.util.List;

public final class bf {
    public static boolean f32052a;
    public static C6444c f32053b;

    public static void m29249a(C6444c c6444c) {
        f32053b = c6444c;
    }

    public static float m29246a(Context context) {
        if (bp.a().b != null) {
            return 1.0f;
        }
        C6444c c6444c = f32053b;
        if (c6444c == null) {
            return m29250b(context);
        }
        int i;
        if (d.a == null || d.a.a() == -1) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            return c6444c.mo5445a(d.a());
        }
        PlayCommonLog.m29460a("No latency prediction available, falling back to network type", new Object[0]);
        return m29250b(context);
    }

    public static float m29245a() {
        bq bqVar = bp.a().d;
        if (bqVar == null) {
            return 1.0f;
        }
        return bqVar.a();
    }

    private static float m29250b(Context context) {
        switch (f.a(context)) {
            case 1:
                return ((Float) j.K.b()).floatValue();
            case 2:
                return ((Float) j.J.b()).floatValue();
            case 3:
                return ((Float) j.I.b()).floatValue();
            case 4:
            case 6:
                return ((Float) j.H.b()).floatValue();
            default:
                return ((Float) j.J.b()).floatValue();
        }
    }

    public static String m29247a(String str, int i, int i2) {
        bs bsVar = bp.a().b;
        if (bsVar != null) {
            return m29248a(str, i, i2, bsVar.m29267a());
        }
        return m29248a(str, i, i2, -1);
    }

    public static String m29248a(String str, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (f32052a) {
            stringBuilder.append("rw");
        }
        if (i > 0) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append('-');
            }
            stringBuilder.append('w').append(i);
        }
        if (i2 > 0) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append('-');
            }
            stringBuilder.append('h').append(i2);
        }
        if (i3 >= 0) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append('-');
            }
            stringBuilder.append('v').append(i3);
        }
        if (stringBuilder.length() == 0) {
            return str;
        }
        String stringBuilder2 = stringBuilder.toString();
        Uri parse = Uri.parse(str);
        if (parse.getQueryParameter("fife") != null) {
            stringBuilder = new StringBuilder(str);
            if (str.indexOf(61) >= 0) {
                stringBuilder.append("-");
            } else {
                stringBuilder.append("=");
            }
            return stringBuilder.append(stringBuilder2).toString();
        }
        int i4;
        Object b;
        Uri a;
        List a2 = bg.m29253a(bg.f32055b.m29257a(parse.getPath()));
        int size = a2.size();
        if (a2.size() <= 1 || !((String) a2.get(0)).equals("image")) {
            i4 = size;
        } else {
            i4 = size - 1;
        }
        if (i4 >= 4 && i4 <= 6) {
            b = bg.m29254b(parse);
        } else if (i4 == 1) {
            a2 = bg.m29253a(bg.f32054a.m29257a(parse.getPath()));
            if (a2.size() > 1) {
                String str2 = (String) a2.get(1);
            } else {
                b = "";
            }
        } else {
            b = "";
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        if (!TextUtils.isEmpty(b)) {
            stringBuilder3.append(b).append('-');
        }
        stringBuilder3.append(stringBuilder2);
        stringBuilder2 = stringBuilder3.toString();
        a2 = bg.m29253a(bg.f32055b.m29257a(parse.getPath()));
        size = a2.size();
        if (a2.size() <= 1 || !((String) a2.get(0)).equals("image")) {
            i4 = size;
        } else {
            i4 = size - 1;
        }
        if (i4 >= 4 && i4 <= 6) {
            a = bg.m29251a(stringBuilder2, parse);
        } else if (i4 == 1) {
            str2 = (String) bg.m29253a(bg.f32054a.m29257a(parse.getPath())).get(0);
            a = parse.buildUpon().path(new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(stringBuilder2).length()).append(str2).append("=").append(stringBuilder2).toString()).build();
        } else {
            a = parse;
        }
        return bg.m29252a(a);
    }

    static {
        boolean z = ((Boolean) j.G.b()).booleanValue() && VERSION.SDK_INT >= 17;
        f32052a = z;
    }
}

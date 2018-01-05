package com.google.android.play.layout;

import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PointF;
import android.util.SparseArray;
import java.text.NumberFormat;

public final class C6399o {
    public static NumberFormat f32260a;
    public static SparseArray f32261b;

    public static double m29333a(double d) {
        return d / (1.0d + Math.sin(0.9424777960769379d));
    }

    public static double m29336b(double d) {
        return Math.sin(1.2566370614359172d) * d;
    }

    public static PointF[] m29337c(double d) {
        PointF[] pointFArr = new PointF[10];
        for (int i = 0; i < 10; i++) {
            pointFArr[i] = new PointF();
        }
        double sin = (Math.sin(0.39269908169872414d) * d) / Math.sin(2.1205750411731104d);
        double sin2 = Math.sin(0.6283185307179586d);
        double cos = Math.cos(0.6283185307179586d);
        double sin3 = Math.sin(1.2566370614359172d);
        double cos2 = Math.cos(1.2566370614359172d);
        pointFArr[0].x = 0.0f;
        pointFArr[0].y = -1.0f * ((float) d);
        pointFArr[1].x = (float) (sin * sin2);
        pointFArr[1].y = -1.0f * ((float) (sin * cos));
        pointFArr[2].x = (float) (d * sin3);
        pointFArr[2].y = -1.0f * ((float) (d * cos2));
        pointFArr[3].x = (float) (sin3 * sin);
        pointFArr[3].y = (float) (sin * cos2);
        pointFArr[4].x = (float) (sin2 * d);
        pointFArr[4].y = (float) (d * cos);
        pointFArr[5].x = 0.0f;
        pointFArr[5].y = (float) sin;
        pointFArr[6].x = -1.0f * pointFArr[4].x;
        pointFArr[6].y = pointFArr[4].y;
        pointFArr[7].x = -1.0f * pointFArr[3].x;
        pointFArr[7].y = pointFArr[3].y;
        pointFArr[8].x = -1.0f * pointFArr[2].x;
        pointFArr[8].y = pointFArr[2].y;
        pointFArr[9].x = -1.0f * pointFArr[1].x;
        pointFArr[9].y = pointFArr[1].y;
        return pointFArr;
    }

    public static Path m29334a(PointF[] pointFArr) {
        Path path = new Path();
        path.setFillType(FillType.EVEN_ODD);
        path.moveTo(pointFArr[0].x, pointFArr[0].y);
        for (int i = 1; i < pointFArr.length; i++) {
            path.lineTo(pointFArr[i].x, pointFArr[i].y);
        }
        path.close();
        return path;
    }

    public static String m29335a(float f) {
        if (f32260a == null) {
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            f32260a = numberInstance;
            numberInstance.setMinimumFractionDigits(1);
            f32260a.setMaximumFractionDigits(1);
            f32261b = new SparseArray();
        }
        int round = Math.round(10.0f * f);
        String str = (String) f32261b.get(round);
        if (str != null) {
            return str;
        }
        str = f32260a.format((double) f);
        f32261b.put(round, str);
        return str;
    }
}

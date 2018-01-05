package android.support.p011c.p012a;

import android.animation.TypeEvaluator;
import com.squareup.haha.perflib.HprofParser;

public final class C0052i implements TypeEvaluator {
    public static final C0052i f83a = new C0052i();

    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((float) ((intValue >> 24) & HprofParser.ROOT_UNKNOWN)) / 255.0f;
        float f3 = ((float) ((intValue >> 16) & HprofParser.ROOT_UNKNOWN)) / 255.0f;
        float f4 = ((float) ((intValue >> 8) & HprofParser.ROOT_UNKNOWN)) / 255.0f;
        float f5 = ((float) (intValue & HprofParser.ROOT_UNKNOWN)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f6 = ((float) ((intValue2 >> 24) & HprofParser.ROOT_UNKNOWN)) / 255.0f;
        float f7 = ((float) ((intValue2 >> 16) & HprofParser.ROOT_UNKNOWN)) / 255.0f;
        float f8 = ((float) ((intValue2 >> 8) & HprofParser.ROOT_UNKNOWN)) / 255.0f;
        f3 = (float) Math.pow((double) f3, 2.2d);
        f4 = (float) Math.pow((double) f4, 2.2d);
        f5 = (float) Math.pow((double) f5, 2.2d);
        return Integer.valueOf(Math.round(((float) Math.pow((double) (f5 + ((((float) Math.pow((double) (((float) (intValue2 & HprofParser.ROOT_UNKNOWN)) / 255.0f), 2.2d)) - f5) * f)), 0.45454545454545453d)) * 255.0f) | (((Math.round((f2 + ((f6 - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (f3 + ((((float) Math.pow((double) f7, 2.2d)) - f3) * f)), 0.45454545454545453d)) * 255.0f) << 16)) | (Math.round(((float) Math.pow((double) (f4 + ((((float) Math.pow((double) f8, 2.2d)) - f4) * f)), 0.45454545454545453d)) * 255.0f) << 8)));
    }
}

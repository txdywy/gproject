package android.support.p011c.p012a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.p013b.C0269b;
import android.support.v4.p013b.C0271d;
import android.support.v4.p028a.p029a.C0210j;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class C0050g {
    public static Animator m53a(Context context, Resources resources, Theme theme, int i) {
        NotFoundException notFoundException;
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            Animator a = C0050g.m54a(context, resources, theme, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0, 1.0f);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a;
        } catch (Throwable e) {
            notFoundException = new NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (Throwable e2) {
            notFoundException = new NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e2);
            throw notFoundException;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static PropertyValuesHolder m56a(TypedArray typedArray, int i, int i2, int i3, String str) {
        Object obj;
        TypedValue peekValue = typedArray.peekValue(i2);
        Object obj2 = peekValue != null ? 1 : null;
        int i4 = obj2 != null ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        Object obj3 = peekValue2 != null ? 1 : null;
        int i5 = obj3 != null ? peekValue2.type : 0;
        if (i == 4) {
            if ((obj2 == null || !C0050g.m61a(i4)) && (obj3 == null || !C0050g.m61a(i5))) {
                i = 0;
            } else {
                i = 3;
            }
        }
        if (i == 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0271d[] b = C0269b.m1551b(string);
            C0271d[] b2 = C0269b.m1551b(string2);
            if (!(b == null && b2 == null)) {
                if (b != null) {
                    TypeEvaluator c0051h = new C0051h();
                    if (b2 == null) {
                        return PropertyValuesHolder.ofObject(str, c0051h, new Object[]{b});
                    } else if (C0269b.m1548a(b, b2)) {
                        return PropertyValuesHolder.ofObject(str, c0051h, new Object[]{b, b2});
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else if (b2 != null) {
                    return PropertyValuesHolder.ofObject(str, new C0051h(), new Object[]{b2});
                }
            }
            return null;
        }
        PropertyValuesHolder ofFloat;
        TypeEvaluator typeEvaluator = null;
        if (i == 3) {
            typeEvaluator = C0052i.f83a;
        }
        if (obj != null) {
            float dimension;
            if (obj2 != null) {
                float dimension2;
                if (i4 == 5) {
                    dimension2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    dimension2 = typedArray.getFloat(i2, 0.0f);
                }
                if (obj3 != null) {
                    if (i5 == 5) {
                        dimension = typedArray.getDimension(i3, 0.0f);
                    } else {
                        dimension = typedArray.getFloat(i3, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension2, dimension});
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension2});
                }
            } else {
                if (i5 == 5) {
                    dimension = typedArray.getDimension(i3, 0.0f);
                } else {
                    dimension = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension});
            }
        } else if (obj2 != null) {
            int dimension3;
            if (i4 == 5) {
                dimension3 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (C0050g.m61a(i4)) {
                dimension3 = typedArray.getColor(i2, 0);
            } else {
                dimension3 = typedArray.getInt(i2, 0);
            }
            if (obj3 != null) {
                if (i5 == 5) {
                    i4 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (C0050g.m61a(i5)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                ofFloat = PropertyValuesHolder.ofInt(str, new int[]{dimension3, i4});
            } else {
                ofFloat = PropertyValuesHolder.ofInt(str, new int[]{dimension3});
            }
        } else if (obj3 != null) {
            if (i5 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (C0050g.m61a(i5)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            ofFloat = PropertyValuesHolder.ofInt(str, new int[]{i4});
        } else {
            ofFloat = null;
        }
        if (ofFloat == null || typeEvaluator == null) {
            return ofFloat;
        }
        ofFloat.setEvaluator(typeEvaluator);
        return ofFloat;
    }

    private static void m58a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long a = (long) C0210j.m1073a(typedArray, xmlPullParser, "duration", 1, 300);
        long a2 = (long) C0210j.m1073a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a3 = C0210j.m1073a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0210j.m1076a(xmlPullParser, "valueFrom") && C0210j.m1076a(xmlPullParser, "valueTo")) {
            if (a3 == 4) {
                TypedValue peekValue = typedArray.peekValue(5);
                Object obj = peekValue != null ? 1 : null;
                a3 = obj != null ? peekValue.type : 0;
                TypedValue peekValue2 = typedArray.peekValue(6);
                Object obj2 = peekValue2 != null ? 1 : null;
                int i = obj2 != null ? peekValue2.type : 0;
                if ((obj == null || !C0050g.m61a(a3)) && (obj2 == null || !C0050g.m61a(i))) {
                    a3 = 0;
                } else {
                    a3 = 3;
                }
            }
            if (C0050g.m56a(typedArray, a3, 5, 6, "") != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{C0050g.m56a(typedArray, a3, 5, 6, "")});
            }
        }
        valueAnimator.setDuration(a);
        valueAnimator.setStartDelay(a2);
        valueAnimator.setRepeatCount(C0210j.m1073a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0210j.m1073a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
            String b = C0210j.m1078b(typedArray2, xmlPullParser, "pathData", 1);
            if (b != null) {
                String b2 = C0210j.m1078b(typedArray2, xmlPullParser, "propertyXName", 2);
                String b3 = C0210j.m1078b(typedArray2, xmlPullParser, "propertyYName", 3);
                if (b2 == null && b3 == null) {
                    throw new InflateException(typedArray2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                C0050g.m59a(C0269b.m1546a(b), objectAnimator, 0.5f * f, b2, b3);
                return;
            }
            objectAnimator.setPropertyName(C0210j.m1078b(typedArray2, xmlPullParser, "propertyName", 0));
        }
    }

    private static void m59a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float f2 = 0.0f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        int i = 0;
        float f3 = f2 / ((float) (min - 1));
        int i2 = 0;
        f2 = 0.0f;
        while (i2 < min) {
            int i3;
            pathMeasure2.getPosTan(f2, fArr3, null);
            pathMeasure2.getPosTan(f2, fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            float f4 = f2 + f3;
            if (i + 1 >= arrayList.size() || f4 <= ((Float) arrayList.get(i + 1)).floatValue()) {
                f2 = f4;
                i3 = i;
            } else {
                f2 = f4 - ((Float) arrayList.get(i + 1)).floatValue();
                i3 = i + 1;
                pathMeasure2.nextContour();
            }
            i2++;
            i = i3;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        PropertyValuesHolder propertyValuesHolder2 = null;
        if (str != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str, fArr);
        }
        if (str2 != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
        } else if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else {
            objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder, propertyValuesHolder2});
        }
    }

    private static Animator m54a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        Animator animator = null;
        ArrayList arrayList = null;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    Object obj;
                    if (name.equals("objectAnimator")) {
                        Animator objectAnimator = new ObjectAnimator();
                        C0050g.m57a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
                        obj = null;
                        animator = objectAnimator;
                    } else if (name.equals("animator")) {
                        animator = C0050g.m57a(context, resources, theme, attributeSet, null, f, xmlPullParser);
                        obj = null;
                    } else if (name.equals("set")) {
                        Animator animatorSet2 = new AnimatorSet();
                        TypedArray a = C0210j.m1074a(resources, theme, attributeSet, C0042a.f65h);
                        Context context2 = context;
                        Resources resources2 = resources;
                        Theme theme2 = theme;
                        XmlPullParser xmlPullParser2 = xmlPullParser;
                        AttributeSet attributeSet2 = attributeSet;
                        C0050g.m54a(context2, resources2, theme2, xmlPullParser2, attributeSet2, (AnimatorSet) animatorSet2, C0210j.m1073a(a, xmlPullParser, "ordering", 0, 0), f);
                        a.recycle();
                        obj = null;
                        animator = animatorSet2;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] a2 = C0050g.m62a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (!(a2 == null || animator == null || !(animator instanceof ValueAnimator))) {
                            ((ValueAnimator) animator).setValues(a2);
                        }
                        obj = 1;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (animatorSet != null && r4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator);
                    }
                }
            }
        }
        if (!(animatorSet == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                int i4 = i2 + 1;
                animatorArr[i2] = (Animator) obj2;
                i2 = i4;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animator;
    }

    private static PropertyValuesHolder[] m62a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            int size;
            int i;
            if (eventType == 3 || eventType == 1) {
                if (arrayList == null) {
                    return null;
                }
                size = arrayList.size();
                PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
                for (i = 0; i < size; i++) {
                    propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
                }
                return propertyValuesHolderArr;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                ArrayList arrayList2;
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray a = C0210j.m1074a(resources, theme, attributeSet, C0042a.f66i);
                    String b = C0210j.m1078b(a, xmlPullParser, "propertyName", 3);
                    int a2 = C0210j.m1073a(a, xmlPullParser, "valueType", 2, 4);
                    ArrayList arrayList3 = null;
                    size = a2;
                    while (true) {
                        eventType = xmlPullParser.next();
                        Keyframe keyframe;
                        int i2;
                        if (eventType == 3 || eventType == 1) {
                            PropertyValuesHolder ofKeyframe;
                            Object a3;
                            PropertyValuesHolder propertyValuesHolder;
                            if (arrayList3 != null) {
                                int size2 = arrayList3.size();
                                if (size2 > 0) {
                                    Keyframe keyframe2 = (Keyframe) arrayList3.get(0);
                                    keyframe = (Keyframe) arrayList3.get(size2 - 1);
                                    float fraction = keyframe.getFraction();
                                    if (fraction >= 1.0f) {
                                        i2 = size2;
                                    } else if (fraction < 0.0f) {
                                        keyframe.setFraction(1.0f);
                                        i2 = size2;
                                    } else {
                                        arrayList3.add(arrayList3.size(), C0050g.m55a(keyframe, 1.0f));
                                        i2 = size2 + 1;
                                    }
                                    float fraction2 = keyframe2.getFraction();
                                    if (fraction2 != 0.0f) {
                                        if (fraction2 < 0.0f) {
                                            keyframe2.setFraction(0.0f);
                                        } else {
                                            arrayList3.add(0, C0050g.m55a(keyframe2, 0.0f));
                                            i2++;
                                        }
                                    }
                                    Keyframe[] keyframeArr = new Keyframe[i2];
                                    arrayList3.toArray(keyframeArr);
                                    for (size2 = 0; size2 < i2; size2++) {
                                        keyframe2 = keyframeArr[size2];
                                        if (keyframe2.getFraction() < 0.0f) {
                                            if (size2 == 0) {
                                                keyframe2.setFraction(0.0f);
                                            } else if (size2 == i2 - 1) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                eventType = size2 + 1;
                                                i = size2;
                                                while (eventType < i2 - 1 && keyframeArr[eventType].getFraction() < 0.0f) {
                                                    i = eventType;
                                                    eventType++;
                                                }
                                                C0050g.m60a(keyframeArr, keyframeArr[i + 1].getFraction() - keyframeArr[size2 - 1].getFraction(), size2, i);
                                            }
                                        }
                                    }
                                    ofKeyframe = PropertyValuesHolder.ofKeyframe(b, keyframeArr);
                                    if (size == 3) {
                                        ofKeyframe.setEvaluator(C0052i.f83a);
                                    }
                                    if (ofKeyframe != null) {
                                        a3 = C0050g.m56a(a, a2, 0, 1, b);
                                    } else {
                                        propertyValuesHolder = ofKeyframe;
                                    }
                                    if (a3 == null) {
                                        if (arrayList != null) {
                                            arrayList2 = new ArrayList();
                                        } else {
                                            arrayList2 = arrayList;
                                        }
                                        arrayList2.add(a3);
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                    a.recycle();
                                }
                            }
                            ofKeyframe = null;
                            if (ofKeyframe != null) {
                                propertyValuesHolder = ofKeyframe;
                            } else {
                                a3 = C0050g.m56a(a, a2, 0, 1, b);
                            }
                            if (a3 == null) {
                                arrayList2 = arrayList;
                            } else {
                                if (arrayList != null) {
                                    arrayList2 = arrayList;
                                } else {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(a3);
                            }
                            a.recycle();
                        } else {
                            if (xmlPullParser.getName().equals("keyframe")) {
                                if (size == 4) {
                                    TypedArray a4 = C0210j.m1074a(resources, theme, Xml.asAttributeSet(xmlPullParser), C0042a.f67j);
                                    TypedValue a5 = C0210j.m1075a(a4, xmlPullParser, "value");
                                    if ((a5 != null ? 1 : null) == null || !C0050g.m61a(a5.type)) {
                                        eventType = 0;
                                    } else {
                                        eventType = 3;
                                    }
                                    a4.recycle();
                                } else {
                                    eventType = size;
                                }
                                TypedArray a6 = C0210j.m1074a(resources, theme, Xml.asAttributeSet(xmlPullParser), C0042a.f67j);
                                keyframe = null;
                                float a7 = C0210j.m1071a(a6, xmlPullParser, "fraction", 3, -1.0f);
                                TypedValue a8 = C0210j.m1075a(a6, xmlPullParser, "value");
                                Object obj = a8 != null ? 1 : null;
                                if (eventType != 4) {
                                    size = eventType;
                                } else if (obj == null || !C0050g.m61a(a8.type)) {
                                    size = 0;
                                } else {
                                    size = 3;
                                }
                                if (obj != null) {
                                    switch (size) {
                                        case 0:
                                            keyframe = Keyframe.ofFloat(a7, C0210j.m1071a(a6, xmlPullParser, "value", 0, 0.0f));
                                            break;
                                        case 1:
                                        case 3:
                                            keyframe = Keyframe.ofInt(a7, C0210j.m1073a(a6, xmlPullParser, "value", 0, 0));
                                            break;
                                    }
                                } else if (size == 0) {
                                    keyframe = Keyframe.ofFloat(a7);
                                } else {
                                    keyframe = Keyframe.ofInt(a7);
                                }
                                size = C0210j.m1072a(a6, xmlPullParser, "interpolator", 1);
                                if (size > 0) {
                                    keyframe.setInterpolator(C0049f.m52a(context, size));
                                }
                                a6.recycle();
                                if (keyframe != null) {
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(keyframe);
                                }
                                xmlPullParser.next();
                                i2 = eventType;
                                arrayList2 = arrayList3;
                            } else {
                                arrayList2 = arrayList3;
                                i2 = size;
                            }
                            arrayList3 = arrayList2;
                            size = i2;
                        }
                    }
                } else {
                    arrayList2 = arrayList;
                }
                xmlPullParser.next();
                arrayList = arrayList2;
            }
        }
    }

    private static Keyframe m55a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static void m60a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static ValueAnimator m57a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0210j.m1074a(resources, theme, attributeSet, C0042a.f64g);
        TypedArray a2 = C0210j.m1074a(resources, theme, attributeSet, C0042a.f68k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        C0050g.m58a(valueAnimator, a, a2, f, xmlPullParser);
        int a3 = C0210j.m1072a(a, xmlPullParser, "interpolator", 0);
        if (a3 > 0) {
            valueAnimator.setInterpolator(C0049f.m52a(context, a3));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    private static boolean m61a(int i) {
        return i >= 28 && i <= 31;
    }
}

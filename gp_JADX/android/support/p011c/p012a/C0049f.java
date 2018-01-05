package android.support.p011c.p012a;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.support.v4.view.p039b.C0343a;
import android.support.v4.view.p039b.C0344b;
import android.support.v4.view.p039b.C0345c;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class C0049f {
    public static Interpolator m52a(Context context, int i) {
        Throwable e;
        NotFoundException notFoundException;
        NotFoundException notFoundException2;
        XmlResourceParser xmlResourceParser = null;
        if (VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser2;
        if (i == 17563663) {
            try {
                return new C0343a();
            } catch (XmlPullParserException e2) {
                e = e2;
                try {
                    notFoundException = new NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                } catch (Throwable th) {
                    e = th;
                    xmlResourceParser2 = xmlResourceParser;
                    if (xmlResourceParser2 != null) {
                        xmlResourceParser2.close();
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                xmlResourceParser2 = null;
                try {
                    notFoundException2 = new NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException2.initCause(e);
                    throw notFoundException2;
                } catch (Throwable th2) {
                    e = th2;
                    if (xmlResourceParser2 != null) {
                        xmlResourceParser2.close();
                    }
                    throw e;
                }
            } catch (Throwable th3) {
                e = th3;
                xmlResourceParser2 = null;
                if (xmlResourceParser2 != null) {
                    xmlResourceParser2.close();
                }
                throw e;
            }
        } else if (i == 17563661) {
            return new C0344b();
        } else {
            if (i == 17563662) {
                return new C0345c();
            }
            xmlResourceParser2 = context.getResources().getAnimation(i);
            try {
                context.getResources();
                context.getTheme();
                int depth = xmlResourceParser2.getDepth();
                Interpolator interpolator = null;
                while (true) {
                    int next = xmlResourceParser2.next();
                    if ((next != 3 || xmlResourceParser2.getDepth() > depth) && next != 1) {
                        if (next == 2) {
                            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
                            String name = xmlResourceParser2.getName();
                            if (name.equals("linearInterpolator")) {
                                interpolator = new LinearInterpolator();
                            } else if (name.equals("accelerateInterpolator")) {
                                interpolator = new AccelerateInterpolator(context, asAttributeSet);
                            } else if (name.equals("decelerateInterpolator")) {
                                interpolator = new DecelerateInterpolator(context, asAttributeSet);
                            } else if (name.equals("accelerateDecelerateInterpolator")) {
                                interpolator = new AccelerateDecelerateInterpolator();
                            } else if (name.equals("cycleInterpolator")) {
                                interpolator = new CycleInterpolator(context, asAttributeSet);
                            } else if (name.equals("anticipateInterpolator")) {
                                interpolator = new AnticipateInterpolator(context, asAttributeSet);
                            } else if (name.equals("overshootInterpolator")) {
                                interpolator = new OvershootInterpolator(context, asAttributeSet);
                            } else if (name.equals("anticipateOvershootInterpolator")) {
                                interpolator = new AnticipateOvershootInterpolator(context, asAttributeSet);
                            } else if (name.equals("bounceInterpolator")) {
                                interpolator = new BounceInterpolator();
                            } else if (name.equals("pathInterpolator")) {
                                interpolator = new C0053j(context, asAttributeSet, xmlResourceParser2);
                            } else {
                                throw new RuntimeException("Unknown interpolator name: " + xmlResourceParser2.getName());
                            }
                        }
                    }
                }
                if (xmlResourceParser2 == null) {
                    return interpolator;
                }
                xmlResourceParser2.close();
                return interpolator;
            } catch (XmlPullParserException e4) {
                e = e4;
                xmlResourceParser = xmlResourceParser2;
                notFoundException = new NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (IOException e5) {
                e = e5;
                notFoundException2 = new NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e);
                throw notFoundException2;
            }
        }
    }
}

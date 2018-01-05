package com.google.android.finsky.deviceconfig;

import android.opengl.GLES10;
import android.text.TextUtils;
import com.google.android.finsky.dl.C2831a;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashSet;
import java.util.Set;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class C2703p {
    public final C2831a f14859a;

    public C2703p(C2831a c2831a) {
        this.f14859a = c2831a;
    }

    private static void m14581a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int[] iArr, int[] iArr2, Set set) {
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr2);
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr);
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE) {
                egl10.eglDestroyContext(eGLDisplay, eglCreateContext);
                return;
            }
            egl10.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
            Object glGetString = GLES10.glGetString(7939);
            if (!TextUtils.isEmpty(glGetString)) {
                for (Object add : glGetString.split(" ")) {
                    set.add(add);
                }
            }
            egl10.eglMakeCurrent(eGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(eGLDisplay, eglCreatePbufferSurface);
            egl10.eglDestroyContext(eGLDisplay, eglCreateContext);
        }
    }

    static Set m14580a() {
        Set hashSet = new HashSet();
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        if (egl10 == null) {
            FinskyLog.m21667d("Couldn't get EGL", new Object[0]);
        } else {
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            if (egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
                if (egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr)) {
                    int[] iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                    int[] iArr3 = new int[]{12440, 2, 12344};
                    int[] iArr4 = new int[1];
                    for (int i = 0; i < iArr[0]; i++) {
                        egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i], 12327, iArr4);
                        if (iArr4[0] != 12368) {
                            egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i], 12339, iArr4);
                            if ((iArr4[0] & 1) != 0) {
                                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i], 12352, iArr4);
                                if ((iArr4[0] & 1) != 0) {
                                    C2703p.m14581a(egl10, eglGetDisplay, eGLConfigArr[i], iArr2, null, hashSet);
                                }
                                if ((iArr4[0] & 4) != 0) {
                                    C2703p.m14581a(egl10, eglGetDisplay, eGLConfigArr[i], iArr2, iArr3, hashSet);
                                }
                            }
                        }
                    }
                    egl10.eglTerminate(eglGetDisplay);
                } else {
                    FinskyLog.m21667d("Couldn't get EGL configs", new Object[0]);
                }
            } else {
                FinskyLog.m21667d("Couldn't get EGL config count", new Object[0]);
            }
        }
        return hashSet;
    }
}

package com.google.android.wallet.clientlog;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.h.a;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.a.a.a.a.b.a.c.e;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.C6591c;
import com.google.p443h.p451c.p455b.p456a.C7153b;
import com.google.p443h.p451c.p455b.p456a.C7154c;
import com.google.p443h.p451c.p455b.p456a.C7155d;
import com.google.p443h.p451c.p455b.p456a.C7156e;
import com.google.p443h.p451c.p455b.p456a.C7157f;
import com.google.p443h.p451c.p455b.p456a.C7159h;
import com.google.p443h.p451c.p455b.p456a.C7160i;
import com.google.p443h.p451c.p455b.p456a.C7164m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public final class C6537a {
    public static final a f32627a = new a();
    public final Session f32628b;
    public C6538b f32629c;

    private C6537a(C6538b c6538b, Session session) {
        this.f32629c = c6538b;
        this.f32628b = session;
    }

    public static void m29684a(LogContext logContext, int i, int[] iArr, boolean z) {
        if (logContext != null) {
            if (i == 0) {
                i = 2;
            }
            Session b = logContext.m29671b();
            if (b.f32622d == 0) {
                b.f32622d = i;
                b.f32623e = iArr;
                b.f32624f = z;
                return;
            } else if (b.f32622d != i) {
                Log.w("ClientLog", String.format(Locale.US, "setLogLevel unsuccessful (tried to change from %d to %d during a session)", new Object[]{Integer.valueOf(b.f32622d), Integer.valueOf(i)}));
                return;
            } else if (b.f32622d == 6 && !Arrays.equals(b.f32623e, iArr)) {
                Log.w("ClientLog", "setLogLevel unsuccessful (tried to change event list during a session)");
                return;
            } else if (b.f32624f != z) {
                Log.w("ClientLog", "setLogLevel unsuccessful (tried to change identifiers flag during a session)");
                return;
            } else {
                return;
            }
        }
        Log.e("ClientLog", "setLogLevel unsuccessful (null log context)");
    }

    public static Session m29677a(C6538b c6538b, boolean z) {
        Session session = new Session(C6539c.m29711a(), C6539c.f32630a.getAndIncrement());
        session.f32621c = z;
        C6537a.m29694a(c6538b, session);
        return session;
    }

    public static LogContext m29675a(long j, Session session) {
        C7156e a = C6537a.m29680a(session.f32619a, session.f32620b);
        a.f34952e = 1;
        a.f34955h = j;
        C6537a.m29693a(session, a);
        if (session == null) {
            Log.e("ClientLog", "Tried to log startSessionContext() in an invalid session.");
            return null;
        }
        C7156e a2 = C6537a.m29680a(session.f32619a, C6539c.f32630a.getAndIncrement());
        a2.f34952e = 3;
        a2.f34955h = j;
        C6537a.m29693a(session, a2);
        return new LogContext(session, j, a2.f34953f);
    }

    public static void m29694a(C6538b c6538b, Session session) {
        f32627a.put(session.f32619a, new C6537a(c6538b, session));
    }

    public static void m29682a(LogContext logContext, int i) {
        if (logContext == null) {
            Log.e("ClientLog", "Tried to end session with a null session context.");
        } else if (!logContext.m29669a()) {
            throw new IllegalArgumentException("Tried to end session with non-session context.");
        } else if (logContext.f32616f) {
            String str = "ClientLog";
            String str2 = "Tried to end session that has already ended: ";
            String valueOf = String.valueOf(logContext.m29671b().f32619a);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            C6537a.m29702c(logContext, i);
            C7156e a = C6537a.m29680a(logContext.m29671b().f32619a, C6539c.f32630a.getAndIncrement());
            a.f34954g = logContext.m29671b().f32620b;
            a.f34952e = 2;
            a.f34955h = logContext.f32614d;
            a.f34956i = i;
            a.f34957j = 0;
            C6537a.m29693a(logContext.m29671b(), a);
        }
    }

    public static void m29681a(LogContext logContext) {
        if (logContext == null) {
            Log.e("ClientLog", "Tried to drop ClientLog instance for a null session context.");
        } else {
            f32627a.remove(logContext.m29671b().f32619a);
        }
    }

    public static LogContext m29676a(LogContext logContext, long j) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 3;
            f.f34955h = j;
            C6537a.m29693a(logContext.m29671b(), f);
            return new LogContext(logContext, j, f.f34953f);
        }
        Log.e("ClientLog", "Tried to log startContext() in an invalid session.");
        return null;
    }

    public static void m29698b(LogContext logContext) {
        if (logContext == null) {
            Log.e("ClientLog", "Tried to log endContext() with a null context");
        } else if (logContext.m29669a()) {
            throw new IllegalArgumentException("Session contexts should be ended by calling endSession()");
        } else if (!C6537a.m29709g(logContext)) {
            Log.e("ClientLog", "Tried to log endContext() in an invalid session.");
        } else if (logContext.f32616f) {
            String valueOf = String.valueOf(logContext);
            Log.e("ClientLog", new StringBuilder(String.valueOf(valueOf).length() + 65).append("Tried to log endContext() with a context that has already ended: ").append(valueOf).toString());
        } else {
            C6537a.m29702c(logContext, 0);
        }
    }

    private static void m29702c(LogContext logContext, int i) {
        C7156e f;
        ArrayList arrayList = new ArrayList(logContext.f32613c);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LogContext logContext2 = (LogContext) arrayList.get(i2);
            if (!logContext2.f32616f) {
                C6537a.m29698b(logContext2);
            }
        }
        logContext.m29673c();
        if (logContext.f32612b != null) {
            f = C6537a.m29708f(logContext.f32612b);
        } else {
            f = C6537a.m29680a(logContext.m29671b().f32619a, C6539c.f32630a.getAndIncrement());
        }
        f.f34954g = logContext.f32615e;
        f.f34952e = 4;
        f.f34955h = logContext.f32614d;
        f.f34956i = i;
        f.f34957j = 0;
        C6537a.m29693a(logContext.m29671b(), f);
    }

    public static void m29701c(LogContext logContext) {
        if (logContext == null) {
            Log.e("ClientLog", "Tried to log resumeContext() with a null context");
        } else if (!C6537a.m29709g(logContext)) {
            Log.e("ClientLog", "Tried to log resumeContext() in an invalid session.");
        } else if (logContext.f32616f) {
            C7156e f;
            if (logContext.f32612b != null) {
                f = C6537a.m29708f(logContext.f32612b);
            } else {
                f = C6537a.m29680a(logContext.m29671b().f32619a, C6539c.f32630a.getAndIncrement());
            }
            f.f34954g = logContext.f32615e;
            f.f34952e = 11;
            f.f34955h = logContext.f32614d;
            C6537a.m29693a(logContext.m29671b(), f);
            logContext.m29674d();
        } else {
            String valueOf = String.valueOf(logContext);
            Log.e("ClientLog", new StringBuilder(String.valueOf(valueOf).length() + 64).append("Tried to log resumeContext() with a context that has not ended: ").append(valueOf).toString());
        }
    }

    public static TimedEvent m29696b(LogContext logContext, int i) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 9;
            f.m32450a(new C7153b());
            f.m32459f().f34934a = i;
            C6537a.m29693a(logContext.m29671b(), f);
            return new TimedEvent(f);
        }
        Log.e("ClientLog", "Tried to log startApiRequest() in an invalid session.");
        return null;
    }

    public static void m29690a(LogContext logContext, TimedEvent timedEvent, int i, int i2, e eVar) {
        if (timedEvent == null) {
            Log.e("ClientLog", "Tried to log endApiRequest() with a null startEvent.");
        } else if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34954g = timedEvent.f32625a.f34953f;
            f.f34952e = 10;
            f.f34956i = i;
            f.f34957j = i2;
            f.m32450a(new C7153b());
            f.m32459f().f34934a = timedEvent.f32625a.m32459f().f34934a;
            if (eVar != null) {
                f.m32459f().f34935b = eVar.a;
                f.m32459f().f34936c = eVar.c;
                f.m32459f().f34937d = eVar.f;
            }
            f.m32459f().f34939f = 0;
            C6537a.m29693a(logContext.m29671b(), f);
        } else {
            Log.e("ClientLog", "Tried to log endApiRequest() in an invalid session.");
        }
    }

    public static TimedEvent m29679a(LogContext logContext, String str, long j) {
        if (C6537a.m29709g(logContext)) {
            Session b = logContext.m29671b();
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 5;
            f.f34955h = j;
            f.m32452a(new C7157f());
            f.m32458e().f34968a = 1;
            if (b.f32624f) {
                f.m32458e().f34969b = str;
            }
            C6537a.m29693a(b, f);
            return new TimedEvent(f);
        }
        Log.e("ClientLog", "Tried to log startFocused() in an invalid session.");
        return null;
    }

    public static void m29688a(LogContext logContext, TimedEvent timedEvent) {
        if (timedEvent == null) {
            Log.e("ClientLog", "Tried to log endFocused() with a null startEvent.");
        } else if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34954g = timedEvent.f32625a.f34953f;
            f.f34952e = 6;
            f.f34955h = timedEvent.f32625a.f34955h;
            f.m32452a(new C7157f());
            f.m32458e().f34968a = timedEvent.f32625a.m32458e().f34968a;
            f.m32458e().f34969b = timedEvent.f32625a.m32458e().f34969b;
            C6537a.m29693a(logContext.m29671b(), f);
        } else {
            Log.e("ClientLog", "Tried to log endFocused() in an invalid session.");
        }
    }

    public static void m29686a(LogContext logContext, Context context) {
        if (C6537a.m29709g(logContext)) {
            int i;
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1000;
            C7155d c7155d = new C7155d();
            f.f34948a = -1;
            f.f34948a = 0;
            f.f34958k = c7155d;
            DisplayMetrics b = C6589a.m29898b(context);
            f.m32457d().f34941a = b.widthPixels;
            f.m32457d().f34942b = b.heightPixels;
            f.m32457d().f34943c = (int) b.xdpi;
            f.m32457d().f34944d = (int) b.ydpi;
            f.m32457d().f34945e = b.densityDpi;
            switch (context.getResources().getConfiguration().orientation) {
                case 1:
                    f.m32457d().f34946f = 1;
                    break;
                case 2:
                    f.m32457d().f34946f = 2;
                    break;
                default:
                    f.m32457d().f34946f = 0;
                    break;
            }
            C7155d d = f.m32457d();
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    switch (activeNetworkInfo.getType()) {
                        case 0:
                            i = 3;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 9:
                            i = 4;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                }
                i = 1;
            } else {
                i = 1;
            }
            d.f34947g = i;
            C6537a.m29693a(logContext.m29671b(), f);
            return;
        }
        Log.e("ClientLog", "Tried to log configuration() in an invalid session.");
    }

    public static void m29687a(LogContext logContext, e eVar) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1009;
            C7160i c7160i = new C7160i();
            f.f34948a = -1;
            f.f34948a = 6;
            f.f34964q = c7160i;
            if (eVar != null) {
                f.m32462i().f34979a = eVar.c;
                f.m32462i().f34980b = eVar.f;
            }
            C6537a.m29693a(logContext.m29671b(), f);
            return;
        }
        Log.e("ClientLog", "Tried to log prefetchedInitialize() in an invalid session.");
    }

    public static void m29700b(LogContext logContext, long j) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1002;
            f.f34955h = j;
            C6537a.m29693a(logContext.m29671b(), f);
            return;
        }
        Log.e("ClientLog", "Tried to log click() in an invalid session.");
    }

    public static void m29704c(LogContext logContext, long j) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1001;
            f.f34955h = j;
            C6537a.m29693a(logContext.m29671b(), f);
            return;
        }
        Log.e("ClientLog", "Tried to log impression() in an invalid session.");
    }

    public static void m29683a(LogContext logContext, int i, String str, long j) {
        if (C6537a.m29709g(logContext)) {
            Session b = logContext.m29671b();
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1001;
            f.f34955h = j;
            f.m32452a(new C7157f());
            f.m32458e().f34968a = i;
            if (b.f32624f) {
                f.m32458e().f34969b = str;
            }
            C6537a.m29693a(b, f);
            return;
        }
        Log.e("ClientLog", "Tried to log fieldImpression() in an invalid session.");
    }

    public static void m29692a(LogContext logContext, String str, long j, int i, int i2) {
        if (C6537a.m29709g(logContext)) {
            Session b = logContext.m29671b();
            C7156e f = C6537a.m29708f(logContext);
            if (!b.f32624f) {
                str = "";
            }
            f.f34952e = 1003;
            f.f34955h = j;
            f.m32452a(new C7157f());
            f.m32458e().f34968a = 1;
            f.m32458e().f34969b = str;
            f.m32458e().f34970c = new C7159h();
            f.m32458e().f34970c.f34974b = i;
            C7159h c7159h = f.m32458e().f34970c;
            c7159h.f34973a = -1;
            c7159h.f34977e = i2;
            c7159h.f34973a = 2;
            C6537a.m29693a(b, f);
            return;
        }
        Log.e("ClientLog", "Tried to log editTextValueChanged() in an invalid session.");
    }

    public static void m29699b(LogContext logContext, int i, String str, long j) {
        if (C6537a.m29709g(logContext)) {
            Session b = logContext.m29671b();
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1004;
            f.f34955h = j;
            f.m32452a(new C7157f());
            f.m32458e().f34968a = i;
            if (b.f32624f) {
                f.m32458e().f34969b = str;
            }
            C6537a.m29693a(b, f);
            return;
        }
        Log.e("ClientLog", "Tried to log clientValidationError() in an invalid session.");
    }

    public static void m29703c(LogContext logContext, int i, String str, long j) {
        if (C6537a.m29709g(logContext)) {
            Session b = logContext.m29671b();
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1005;
            f.f34955h = j;
            f.m32452a(new C7157f());
            f.m32458e().f34968a = i;
            if (b.f32624f) {
                f.m32458e().f34969b = str;
            }
            C6537a.m29693a(b, f);
            return;
        }
        Log.e("ClientLog", "Tried to log serverValidationError() in an invalid session.");
    }

    public static TimedEvent m29678a(LogContext logContext, String str) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 12;
            f.m32453a(new C7164m());
            f.m32460g().f34986a = str;
            C6537a.m29693a(logContext.m29671b(), f);
            return new TimedEvent(f);
        }
        Log.e("ClientLog", "Tried to log startWebViewPageLoad() in an invalid session.");
        return null;
    }

    public static void m29691a(LogContext logContext, TimedEvent timedEvent, boolean z, int i, int i2, String str) {
        if (timedEvent == null) {
            Log.e("ClientLog", "Tried to log endWebViewPageLoad() with a null startEvent.");
        } else if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34954g = timedEvent.f32625a.f34953f;
            f.f34952e = 13;
            if (i == 0) {
                f.f34956i = 1;
            } else {
                f.f34956i = 5;
                f.f34957j = i;
            }
            f.m32453a(new C7164m());
            f.m32460g().f34986a = timedEvent.f32625a.m32460g().f34986a;
            f.m32460g().f34987b = z;
            f.m32460g().f34988c = i2;
            if (!TextUtils.isEmpty(str)) {
                f.m32460g().f34989d = str;
            }
            C6537a.m29693a(logContext.m29671b(), f);
        } else {
            Log.e("ClientLog", "Tried to log endWebViewPageLoad() in an invalid session.");
        }
    }

    public static TimedEvent m29697b(LogContext logContext, String str) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 14;
            f.m32451a(new C7154c());
            f.m32461h().f34940a = str;
            C6537a.m29693a(logContext.m29671b(), f);
            return new TimedEvent(f);
        }
        Log.e("ClientLog", "Tried to log startAppValidation() in an invalid session.");
        return null;
    }

    public static void m29689a(LogContext logContext, TimedEvent timedEvent, int i) {
        if (timedEvent == null) {
            Log.e("ClientLog", "Tried to log endAppValidation() with a null startEvent.");
        } else if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34954g = timedEvent.f32625a.f34953f;
            f.f34952e = 15;
            if (i == 0) {
                f.f34956i = 1;
            } else {
                f.f34956i = 5;
                f.f34957j = i;
            }
            f.m32451a(new C7154c());
            f.m32461h().f34940a = timedEvent.f32625a.m32461h().f34940a;
            C6537a.m29693a(logContext.m29671b(), f);
        } else {
            Log.e("ClientLog", "Tried to log endAppValidation() in an invalid session.");
        }
    }

    public static void m29705c(LogContext logContext, String str) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1006;
            f.m32453a(new C7164m());
            f.m32460g().f34986a = str;
            C6537a.m29693a(logContext.m29671b(), f);
            return;
        }
        Log.e("ClientLog", "Tried to log landingMessageJavaScriptInjected() in an invalid session.");
    }

    public static void m29706d(LogContext logContext) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1007;
            C6537a.m29693a(logContext.m29671b(), f);
            return;
        }
        Log.e("ClientLog", "Tried to log landingMessageCallbackReceived() in an invalid session.");
    }

    public static void m29707e(LogContext logContext) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1010;
            C6537a.m29693a(logContext.m29671b(), f);
            return;
        }
        Log.e("ClientLog", "Tried to log redirectFormHostKilled() in an invalid session.");
    }

    public static void m29685a(LogContext logContext, long j, int i) {
        if (C6537a.m29709g(logContext)) {
            C7156e f = C6537a.m29708f(logContext);
            f.f34952e = 1013;
            f.f34955h = j;
            f.f34956i = i;
            C6537a.m29693a(logContext.m29671b(), f);
            return;
        }
        Log.e("ClientLog", "Tried to log dataUriImageDecoded() in an invalid session.");
    }

    private static C7156e m29708f(LogContext logContext) {
        C7156e c7156e = new C7156e();
        c7156e.f34953f = C6539c.f32630a.getAndIncrement();
        c7156e.f34949b = logContext.m29671b().f32619a;
        c7156e.f34951d = logContext.m29670a(0);
        c7156e.f34950c = logContext.f32615e;
        return c7156e;
    }

    private static C7156e m29680a(String str, int i) {
        C7156e c7156e = new C7156e();
        c7156e.f34953f = i;
        c7156e.f34949b = str;
        return c7156e;
    }

    private static boolean m29709g(LogContext logContext) {
        return (logContext == null || logContext.m29671b() == null || logContext.f32611a == null || logContext.f32611a.f32616f) ? false : true;
    }

    private static void m29693a(Session session, C7156e c7156e) {
        C6537a c6537a = (C6537a) f32627a.get(session.f32619a);
        if (c6537a == null) {
            int i = c7156e != null ? c7156e.f34952e : 0;
            Log.e("ClientLog", String.format(Locale.US, "Logger not initialized for eventName=%d. Must call initLogger before logging.", new Object[]{Integer.valueOf(i)}));
        } else if (c7156e.f34952e == 0) {
            Log.e("ClientLog", String.format(Locale.US, "Could not log invalid event: %s", new Object[]{c7156e}));
        } else if (c6537a.f32628b.f32621c && C6537a.m29695a(c6537a.f32628b, c7156e.f34952e) && c6537a.f32629c != null) {
            c6537a.f32629c.mo5516a(c7156e);
        }
    }

    public static boolean m29695a(Session session, int i) {
        int i2 = session.f32622d;
        int[] iArr = session.f32623e;
        switch (i2) {
            case 0:
            case 5:
                return true;
            case 6:
                switch (i) {
                    case 6:
                        i2 = 5;
                        break;
                    case 8:
                        i2 = 7;
                        break;
                    default:
                        i2 = i;
                        break;
                }
                if (C6591c.m29906a(iArr, i2)) {
                    return true;
                }
                break;
        }
        if (i == 1 || i == 2 || i == 3 || i == 11 || i == 4 || i == 9 || i == 10) {
            return true;
        }
        return false;
    }
}

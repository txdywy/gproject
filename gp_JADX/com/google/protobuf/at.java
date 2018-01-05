package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class at extends C7196a {
    public static Map f35179j = new ConcurrentHashMap();
    public dv f35180h = dv.f35365a;
    public int f35181i = -1;

    public abstract Object m32945a(ay ayVar, Object obj, Object obj2);

    public abstract Object m32947b();

    public final cs mo6117d() {
        return (cs) m32945a(ay.GET_PARSER, null, null);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ").append(obj);
        ci.m33072a(this, stringBuilder, 0);
        return stringBuilder.toString();
    }

    public int hashCode() {
        if (this.f != 0) {
            return this.f;
        }
        this.f = cu.f35284a.m33134a((Object) this).mo6155a(this);
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((at) m32945a(ay.GET_DEFAULT_INSTANCE, null, null)).getClass().isInstance(obj)) {
            return cu.f35284a.m33134a((Object) this).mo6159a((Object) this, (at) obj);
        }
        return false;
    }

    public final boolean mo6118e() {
        boolean z = true;
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) m32945a(ay.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        if (m32945a(ay.IS_INITIALIZED, Boolean.FALSE, null) == null) {
            z = false;
        }
        if (booleanValue) {
            Object obj;
            ay ayVar = ay.SET_MEMOIZED_IS_INITIALIZED;
            if (z) {
                obj = this;
            } else {
                obj = null;
            }
            m32945a(ayVar, obj, null);
        }
        return z;
    }

    public void mo6116a(CodedOutputStream codedOutputStream) {
        eq eqVar;
        de a = cu.f35284a.m33133a(getClass());
        if (codedOutputStream.f35082c != null) {
            eqVar = codedOutputStream.f35082c;
        } else {
            eqVar = new ad(codedOutputStream);
        }
        a.mo6158a((Object) this, eqVar);
    }

    public int mo6115a() {
        if (this.f35181i == -1) {
            this.f35181i = cu.f35284a.m33134a((Object) this).mo6160b(this);
        }
        return this.f35181i;
    }

    static at m32940a(Class cls) {
        at atVar = (at) f35179j.get(cls);
        if (atVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                atVar = (at) f35179j.get(cls);
            } catch (Throwable e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (atVar != null) {
            return atVar;
        }
        String str = "Unable to get default instance for: ";
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    static Object m32942a(Method method, Object obj, Object... objArr) {
        Throwable e;
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else if (e2 instanceof Error) {
                throw ((Error) e2);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", e2);
            }
        }
    }

    public static final boolean m32943a(at atVar, boolean z) {
        boolean z2 = true;
        byte byteValue = ((Byte) atVar.m32945a(ay.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        if (atVar.m32945a(ay.IS_INITIALIZED, Boolean.FALSE, null) == null) {
            z2 = false;
        }
        if (z) {
            Object obj;
            ay ayVar = ay.SET_MEMOIZED_IS_INITIALIZED;
            if (z2) {
                obj = atVar;
            } else {
                obj = null;
            }
            atVar.m32945a(ayVar, obj, null);
        }
        return z2;
    }

    public static bh m32941a(bh bhVar) {
        int size = bhVar.size();
        return bhVar.mo6094a(size == 0 ? 10 : size * 2);
    }

    static at m32937a(at atVar, C7225s c7225s, ah ahVar) {
        at atVar2 = (at) atVar.m32945a(ay.NEW_MUTABLE_INSTANCE, null, null);
        try {
            atVar2.m32945a(ay.MERGE_FROM_STREAM, (Object) c7225s, (Object) ahVar);
            atVar2.m32945a(ay.MAKE_IMMUTABLE, null, null);
            atVar2.f35180h.f35370f = false;
            return atVar2;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw e;
        }
    }

    public static at m32938a(at atVar, InputStream inputStream) {
        Object obj = 1;
        at a = m32939a(atVar, inputStream, ah.m32878a());
        if (a != null) {
            Object obj2;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.m32945a(ay.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
            if (byteValue == (byte) 1) {
                obj2 = 1;
            } else if (byteValue == (byte) 0) {
                obj2 = null;
            } else {
                if (a.m32945a(ay.IS_INITIALIZED, Boolean.FALSE, null) == null) {
                    obj = null;
                }
                if (booleanValue) {
                    ay ayVar = ay.SET_MEMOIZED_IS_INITIALIZED;
                    if (obj != null) {
                        obj2 = a;
                    } else {
                        obj2 = null;
                    }
                    a.m32945a(ayVar, obj2, null);
                }
                obj2 = obj;
            }
            if (obj2 == null) {
                InvalidProtocolBufferException a2 = new UninitializedMessageException().m32674a();
                if (a2 == null) {
                    throw null;
                }
                throw a2;
            }
        }
        return a;
    }

    private static at m32939a(at atVar, InputStream inputStream, ah ahVar) {
        int read = inputStream.read();
        if (read == -1) {
            return null;
        }
        if ((read & 128) != 0) {
            int read2;
            read &= 127;
            int i = 7;
            while (i < 32) {
                try {
                    read2 = inputStream.read();
                    if (read2 != -1) {
                        read |= (read2 & 127) << i;
                        if ((read2 & 128) == 0) {
                            break;
                        }
                        i += 7;
                    } else {
                        throw InvalidProtocolBufferException.m32664a();
                    }
                } catch (IOException e) {
                    throw new InvalidProtocolBufferException(e.getMessage());
                }
            }
            while (i < 64) {
                read2 = inputStream.read();
                if (read2 == -1) {
                    throw InvalidProtocolBufferException.m32664a();
                } else if ((read2 & 128) != 0) {
                    i += 7;
                }
            }
            throw InvalidProtocolBufferException.m32666c();
        }
        C7225s a = C7225s.m33628a(new C7201c(inputStream, read));
        at a2 = m32937a(atVar, a, ahVar);
        try {
            a.mo6234a(0);
            return a2;
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    public final /* synthetic */ cg mo6119f() {
        au auVar = (au) m32945a(ay.NEW_BUILDER, null, null);
        auVar.m32960a(this);
        return auVar;
    }

    public final /* synthetic */ cg mo6120g() {
        return (au) m32945a(ay.NEW_BUILDER, null, null);
    }

    public final /* synthetic */ cf mo6121h() {
        return (at) m32945a(ay.GET_DEFAULT_INSTANCE, null, null);
    }
}

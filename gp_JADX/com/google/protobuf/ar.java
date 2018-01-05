package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class ar {
    public static final Logger f35176a = Logger.getLogger(CodedOutputStream.class.getName());
    public static String f35177b = "com.google.protobuf.g";

    ar() {
    }

    protected abstract ah mo6221a();

    static ah m32931a(Class cls) {
        String str;
        ClassLoader classLoader = ar.class.getClassLoader();
        if (cls.equals(ah.class)) {
            str = f35177b;
        } else if (cls.getPackage().equals(ar.class.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (ah) cls.cast(((ar) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo6221a());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        } catch (Throwable e2) {
            throw new IllegalStateException(e2);
        } catch (Throwable e22) {
            throw new IllegalStateException(e22);
        } catch (Throwable e222) {
            throw new IllegalStateException(e222);
        } catch (ClassNotFoundException e3) {
            Iterator it = ServiceLoader.load(ar.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((ah) cls.cast(((ar) it.next()).mo6221a()));
                } catch (Throwable e4) {
                    Logger logger = f35176a;
                    Level level = Level.SEVERE;
                    String str2 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                    String str3 = "load";
                    String str4 = "Unable to load ";
                    String valueOf = String.valueOf(cls.getSimpleName());
                    if (valueOf.length() != 0) {
                        valueOf = str4.concat(valueOf);
                    } else {
                        valueOf = new String(str4);
                    }
                    logger.logp(level, str2, str3, valueOf, e4);
                }
            }
            if (arrayList.size() == 1) {
                return (ah) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (ah) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (Throwable e2222) {
                throw new IllegalStateException(e2222);
            } catch (Throwable e22222) {
                throw new IllegalStateException(e22222);
            } catch (Throwable e222222) {
                throw new IllegalStateException(e222222);
            }
        }
    }
}

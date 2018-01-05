package com.squareup.haha.perflib;

import com.google.p409c.p410a.p411a.p412a.p413a.C6918a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.File;
import java.io.PrintStream;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] strArr) {
        try {
            long nanoTime = System.nanoTime();
            Snapshot parse = new HprofParser(new MemoryMappedFileBuffer(new File(strArr[0]))).parse();
            testClassesQuery(parse);
            testAllClassesQuery(parse);
            testFindInstancesOf(parse);
            testFindAllInstancesOf(parse);
            PrintStream printStream = System.out;
            long freeMemory = Runtime.getRuntime().freeMemory();
            printStream.println("Memory stats: free=" + freeMemory + " / total=" + Runtime.getRuntime().totalMemory());
            System.out.println("Time: " + ((System.nanoTime() - nanoTime) / 1000000) + "ms");
        } catch (Throwable e) {
            C6918a.f34250a.mo5841a(e);
        }
    }

    private static void testClassesQuery(Snapshot snapshot) {
        Map classes = Queries.classes(snapshot, new String[]{"char[", "javax.", "org.xml.sax"});
        for (String str : classes.keySet()) {
            String str2;
            PrintStream printStream = System.out;
            String str3 = "------------------- ";
            String valueOf = String.valueOf(str2);
            printStream.println(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            for (ClassObj classObj : (Set) classes.get(str2)) {
                printStream = System.out;
                str3 = "     ";
                str2 = String.valueOf(classObj.mClassName);
                printStream.println(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    private static void testAllClassesQuery(Snapshot snapshot) {
        Map allClasses = Queries.allClasses(snapshot);
        for (String str : allClasses.keySet()) {
            String str2;
            PrintStream printStream = System.out;
            String str3 = "------------------- ";
            String valueOf = String.valueOf(str2);
            printStream.println(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            for (ClassObj classObj : (Set) allClasses.get(str2)) {
                printStream = System.out;
                str3 = "     ";
                str2 = String.valueOf(classObj.mClassName);
                printStream.println(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    private static void testFindInstancesOf(Snapshot snapshot) {
        Instance[] instancesOf = Queries.instancesOf(snapshot, "java.lang.String");
        System.out.println("There are " + instancesOf.length + " Strings.");
    }

    private static void testFindAllInstancesOf(Snapshot snapshot) {
        Instance[] allInstancesOf = Queries.allInstancesOf(snapshot, "android.graphics.drawable.Drawable");
        System.out.println("There are " + allInstancesOf.length + " instances of Drawables and its subclasses.");
    }
}

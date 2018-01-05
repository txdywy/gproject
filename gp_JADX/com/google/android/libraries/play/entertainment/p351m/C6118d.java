package com.google.android.libraries.play.entertainment.p351m;

import android.support.v7.widget.eq;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public final class C6118d {
    public static void m28110a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    public static String m28109a(InputStream inputStream) {
        if (inputStream instanceof C6117c) {
            C6117c c6117c = (C6117c) inputStream;
            return new String(c6117c.m28108a(), c6117c.f30289a, c6117c.f30290b, "UTF-8");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        Object allocate = CharBuffer.allocate(eq.FLAG_MOVED);
        StringBuilder stringBuilder = new StringBuilder();
        while (inputStreamReader.read(allocate) > 0) {
            allocate.flip();
            stringBuilder.append(allocate);
            allocate.clear();
        }
        inputStreamReader.close();
        return stringBuilder.toString();
    }
}

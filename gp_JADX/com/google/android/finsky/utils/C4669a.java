package com.google.android.finsky.utils;

import android.content.res.AssetManager;
import android.content.res.Resources;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.keyczar.c.e;
import org.keyczar.exceptions.KeyczarException;

public final class C4669a implements e {
    public static final Charset f24028a = Charset.forName("UTF-8");
    public final AssetManager f24029b;
    public final String f24030c;

    public C4669a(Resources resources, String str) {
        this.f24029b = resources.getAssets();
        this.f24030c = str;
    }

    public final String m21682a(int i) {
        return m21680a(String.valueOf(i));
    }

    public final String m21681a() {
        return m21680a("meta");
    }

    private final String m21680a(String str) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            char[] cArr = new char[MemoryMappedFileBuffer.DEFAULT_PADDING];
            AssetManager assetManager = this.f24029b;
            if (this.f24030c != null) {
                String str2 = this.f24030c;
                String str3 = File.separator;
                str = new StringBuilder((String.valueOf(str2).length() + String.valueOf(str3).length()) + String.valueOf(str).length()).append(str2).append(str3).append(str).toString();
            }
            InputStreamReader inputStreamReader = new InputStreamReader(assetManager.open(str), f24028a);
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read <= 0) {
                    return stringBuilder.toString();
                }
                stringBuilder.append(cArr, 0, read);
            }
        } catch (Throwable e) {
            throw new KeyczarException("Couldn't read Keyczar 'meta' file from assets/", e);
        }
    }
}

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;

public abstract class ea {
    public static final String f26672a = ea.class.getSimpleName();

    protected static HashMap m24312b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
            }
        } catch (IOException e) {
            Log.d(f26672a, "decode object failure");
            return null;
        } catch (ClassNotFoundException e2) {
            Log.d(f26672a, "decode object failure");
            return null;
        }
        return null;
    }

    protected abstract HashMap mo4715a();

    protected abstract void mo4716a(String str);

    public String toString() {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(mo4715a());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e) {
            return null;
        }
    }
}

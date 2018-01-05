package me.leolin.shortcutbadger.p567b;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;

public final class C7882b {
    public static void m37777a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public static void m37778a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}

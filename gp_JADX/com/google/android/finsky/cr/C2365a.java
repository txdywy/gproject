package com.google.android.finsky.cr;

import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public final class C2365a implements C2364b {
    public final File f11614a;
    public final String f11615b;

    public C2365a(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("A dataStoreId must be specified");
        }
        this.f11614a = file;
        this.f11615b = str;
    }

    public final void mo2869a(String str) {
        File file = this.f11614a;
        String valueOf = String.valueOf(this.f11615b);
        String valueOf2 = String.valueOf(str);
        if (!new File(file, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).delete()) {
            FinskyLog.m21667d("Attempt to delete '%s' failed!", str);
        }
    }

    public final Map mo2868a() {
        Map hashMap = new HashMap();
        File[] listFiles = this.f11614a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                try {
                    if (name.startsWith(this.f11615b)) {
                        InputStream fileInputStream = new FileInputStream(file);
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        String replace = name.replace(this.f11615b, "");
                        JSONObject jSONObject = new JSONObject(objectInputStream.readUTF());
                        fileInputStream.close();
                        hashMap.put(replace, C2365a.m12002a(jSONObject));
                    }
                } catch (IOException e) {
                    FinskyLog.m21665c("IOException when reading file '%s'. Deleting.", name);
                    if (!file.delete()) {
                        FinskyLog.m21667d("Attempt to delete '%s' failed!", name);
                    }
                } catch (JSONException e2) {
                    FinskyLog.m21667d("JSONException when reading file '%s'. Deleting. error=[%s]", name, e2.toString());
                    if (!file.delete()) {
                        FinskyLog.m21667d("Attempt to delete '%s' failed!", name);
                    }
                }
            }
        }
        return hashMap;
    }

    public final void mo2870a(String str, Map map) {
        FileOutputStream fileOutputStream;
        IOException e;
        FileOutputStream fileOutputStream2;
        Throwable th;
        ObjectOutputStream objectOutputStream = null;
        try {
            File file = this.f11614a;
            String valueOf = String.valueOf(this.f11615b);
            String valueOf2 = String.valueOf(str);
            fileOutputStream = new FileOutputStream(new File(file, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream2.writeUTF(new JSONObject(map).toString());
                    objectOutputStream2.flush();
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e2) {
                        FinskyLog.m21665c("Couldn't close output stream for key %s: %s", str, e2);
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    objectOutputStream = objectOutputStream2;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        FinskyLog.m21665c("Couldn't write value store for key %s: %s", str, e2);
                        if (objectOutputStream == null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e22) {
                                FinskyLog.m21665c("Couldn't close output stream for key %s: %s", str, e22);
                            }
                        } else if (fileOutputStream2 == null) {
                            fileOutputStream2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (objectOutputStream == null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e4) {
                                FinskyLog.m21665c("Couldn't close output stream for key %s: %s", str, e4);
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream == null) {
                        objectOutputStream.close();
                    } else if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e22 = e5;
                fileOutputStream2 = fileOutputStream;
                FinskyLog.m21665c("Couldn't write value store for key %s: %s", str, e22);
                if (objectOutputStream == null) {
                    objectOutputStream.close();
                } else if (fileOutputStream2 == null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th4) {
                th = th4;
                if (objectOutputStream == null) {
                    objectOutputStream.close();
                } else if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (IOException e6) {
            e22 = e6;
            fileOutputStream2 = null;
            FinskyLog.m21665c("Couldn't write value store for key %s: %s", str, e22);
            if (objectOutputStream == null) {
                objectOutputStream.close();
            } else if (fileOutputStream2 == null) {
                fileOutputStream2.close();
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            if (objectOutputStream == null) {
                objectOutputStream.close();
            } else if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    private static Map m12002a(JSONObject jSONObject) {
        Map hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (jSONObject.isNull(str)) {
                hashMap.put(str, null);
            } else {
                hashMap.put(str, jSONObject.getString(str));
            }
        }
        return hashMap;
    }
}

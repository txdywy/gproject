package com.android.ex.photo.p052e;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import com.android.ex.photo.C0572j;
import com.android.ex.photo.p050c.C0553c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

public final class C0559b {
    public static final Pattern f3760a = Pattern.compile("^(?:.*;)?base64,.*");
    public static final C0563e f3761b;

    public static C0553c m4092a(ContentResolver contentResolver, Uri uri, int i) {
        C0560f c0562d;
        C0553c c0553c = new C0553c();
        if ("data".equals(uri.getScheme())) {
            c0562d = new C0562d(contentResolver, uri);
        } else {
            c0562d = new C0561c(contentResolver, uri);
        }
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            C0559b.m4091a(c0562d, options);
            Point point = new Point(options.outWidth, options.outHeight);
            options = new Options();
            options.inSampleSize = Math.max(point.x / i, point.y / i);
            c0553c.f3752b = C0559b.m4091a(c0562d, options);
            c0553c.f3753c = 0;
            return c0553c;
        } catch (FileNotFoundException e) {
            return c0553c;
        } catch (IOException e2) {
            c0553c.f3753c = 1;
            return c0553c;
        } catch (IllegalArgumentException e3) {
            return c0553c;
        } catch (SecurityException e4) {
            c0553c.f3753c = 1;
            return c0553c;
        }
    }

    private static Bitmap m4091a(C0560f c0560f, Options options) {
        InputStream a;
        Throwable e;
        InputStream a2;
        try {
            int a3;
            a = c0560f.mo992a();
            try {
                a3 = C0558a.m4089a(a);
                if (a != null) {
                    a.close();
                }
                a2 = c0560f.mo992a();
            } catch (OutOfMemoryError e2) {
                e = e2;
                try {
                    Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", e);
                    if (a != null) {
                        try {
                            a.close();
                        } catch (IOException e3) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    e = th;
                    a2 = a;
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw e;
                }
            } catch (IOException e5) {
                e = e5;
                a2 = a;
                try {
                    Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", e);
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (IOException e6) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    e = th2;
                    if (a2 != null) {
                        a2.close();
                    }
                    throw e;
                }
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(a2, null, options);
                if (a2 != null && decodeStream == null && !options.inJustDecodeBounds) {
                    Log.w("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options): Image bytes cannot be decoded into a Bitmap");
                    throw new UnsupportedOperationException("Image bytes cannot be decoded into a Bitmap.");
                } else if (decodeStream != null && a3 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate((float) a3);
                    decodeStream = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                    if (a2 == null) {
                        return decodeStream;
                    }
                    try {
                        a2.close();
                        return decodeStream;
                    } catch (IOException e7) {
                        return decodeStream;
                    }
                } else if (a2 == null) {
                    return decodeStream;
                } else {
                    try {
                        a2.close();
                        return decodeStream;
                    } catch (IOException e8) {
                        return decodeStream;
                    }
                }
            } catch (OutOfMemoryError e9) {
                e = e9;
                a = a2;
                Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", e);
                if (a != null) {
                    a.close();
                }
                return null;
            } catch (IOException e10) {
                e = e10;
                Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", e);
                if (a2 != null) {
                    a2.close();
                }
                return null;
            }
        } catch (OutOfMemoryError e11) {
            e = e11;
            a = null;
            Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", e);
            if (a != null) {
                a.close();
            }
            return null;
        } catch (IOException e12) {
            e = e12;
            a2 = null;
            Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", e);
            if (a2 != null) {
                a2.close();
            }
            return null;
        } catch (Throwable th3) {
            e = th3;
            a2 = null;
            if (a2 != null) {
                a2.close();
            }
            throw e;
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f3761b = C0563e.NORMAL;
        } else if (((long) C0572j.f3795a) >= 32) {
            f3761b = C0563e.NORMAL;
        } else if (((long) C0572j.f3795a) >= 24) {
            f3761b = C0563e.SMALL;
        } else {
            f3761b = C0563e.EXTRA_SMALL;
        }
    }
}

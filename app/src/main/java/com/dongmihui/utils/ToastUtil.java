package com.dongmihui.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.dongmihui.common.AppContext;


public class ToastUtil
{

    public static void showShort(Context context, String text)
    {

        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public static void showShort(Context context, int resId)
    {

        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(Context context, String text)
    {

        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

    public static void showLong(Context context, int resId)
    {

        Toast.makeText(context, resId, Toast.LENGTH_LONG).show();
    }

    public static void LongToast(final String text)
    {

        new Handler(Looper.getMainLooper()).post(new Runnable()
        {

            @Override
            public void run()
            {

                Toast.makeText(AppContext.getInstance(), text, Toast.LENGTH_LONG).show();
            }
        });
    }

    public static void LongToast(final int stringId)
    {

        new Handler(Looper.getMainLooper()).post(new Runnable()
        {

            @Override
            public void run()
            {

                Toast.makeText(AppContext.getInstance(), stringId, Toast.LENGTH_LONG).show();
            }
        });
    }

    public static void ShortToast(final String text)
    {

        new Handler(Looper.getMainLooper()).post(new Runnable()
        {

            @Override
            public void run()
            {

                Toast.makeText(AppContext.getInstance(), text, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static void ShortToast(final int stringId)
    {

        new Handler(Looper.getMainLooper()).post(new Runnable()
        {

            @Override
            public void run()
            {

                Toast.makeText(AppContext.getInstance(), stringId, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

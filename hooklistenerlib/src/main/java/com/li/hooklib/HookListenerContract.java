package com.li.hooklib;

import android.view.View;

/**
 * Created by Mingwei Li
 * Data: 2016/10/18.
 */

public class HookListenerContract {
    public interface OnFocusChangeListener{
        void doInListener(View v, boolean hasFocus);
    };
    public interface OnClickListener{
        void doInListener(View v);
    };
    public interface OnLongClickListener{
        void doInListener(View v);
    };
}

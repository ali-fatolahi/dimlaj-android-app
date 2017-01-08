package com.dilmaj.android.handlers;

import android.text.TextWatcher;
import android.widget.EditText;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */

public final class HandlersSetup {
    public static void addEditTextWatcher(final EditText editText, final TextWatcher textWatcher) {
        editText.addTextChangedListener(textWatcher);
    }
}

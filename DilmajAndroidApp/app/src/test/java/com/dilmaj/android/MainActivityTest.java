package com.dilmaj.android;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextWatcher;
import android.widget.EditText;


import com.dilmaj.android.databinding.MainBinding;
import com.dilmaj.android.handlers.HandlersSetup;
import com.dilmaj.android.model.Translation;
import com.dilmaj.android.model.Word;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;


/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({DataBindingUtil.class, HandlersSetup.class, MainActivity.class})
public class MainActivityTest {
    @Test
    public void testOnCreate() throws Exception {
        Bundle bundle = mock(Bundle.class);
        MainActivity mainActivity = new MainActivity();

        MainBinding binding = mock(MainBinding.class);
        mockStatic(DataBindingUtil.class);
        when(DataBindingUtil.setContentView(eq(mainActivity), anyInt())).thenReturn(binding);

        Word word = mock(Word.class);
        Translation translation = mock(Translation.class);

        whenNew(Word.class).withAnyArguments().thenReturn(word);
        whenNew(Translation.class).withAnyArguments().thenReturn(translation);

        mockStatic(HandlersSetup.class);

        mainActivity.onCreate(bundle);

        verify(binding, times(1)).setWord(word);
        verify(binding, times(1)).setTranslation(translation);

        verifyStatic(times(2));
        HandlersSetup.addEditTextWatcher(any(EditText.class), any(TextWatcher.class));
    }
}

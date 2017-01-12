package com.dilmaj.android;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.dilmaj.android.databinding.MainBinding;
import com.dilmaj.android.observables.ObservableTranslation;
import com.dilmaj.android.observables.ObservableWord;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

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
@PrepareForTest({DataBindingUtil.class, MainActivity.class})
public class MainActivityTest {
    @Test
    public void testOnCreate() throws Exception {
        Bundle bundle = mock(Bundle.class);
        MainActivity mainActivity = new MainActivity();

        MainBinding binding = mock(MainBinding.class);
        mockStatic(DataBindingUtil.class);
        when(DataBindingUtil.setContentView(eq(mainActivity), anyInt())).thenReturn(binding);

        ObservableWord word = mock(ObservableWord.class);
        ObservableTranslation translation = mock(ObservableTranslation.class);

        whenNew(ObservableWord.class).withAnyArguments().thenReturn(word);
        whenNew(ObservableTranslation.class).withAnyArguments().thenReturn(translation);

        mainActivity.onCreate(bundle);

        verify(binding, times(1)).setWord(word);
        verify(binding, times(1)).setTranslation(translation);

        verifyStatic(times(2));
    }
}

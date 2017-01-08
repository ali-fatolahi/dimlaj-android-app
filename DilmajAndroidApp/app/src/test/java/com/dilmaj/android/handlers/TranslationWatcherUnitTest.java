package com.dilmaj.android.handlers;

import android.text.Editable;

import com.dilmaj.android.databinding.MainBinding;
import com.dilmaj.android.handlers.TranslationWatcher;
import com.dilmaj.android.handlers.WordWatcher;
import com.dilmaj.android.model.Translation;
import com.dilmaj.android.model.Word;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TranslationWatcherUnitTest {
    @Test
    public void testAfterTextChangedUpdatesBinding() throws Exception {
        MainBinding binding = mock(MainBinding.class);
        Editable editable = mock(Editable.class);

        TranslationWatcher translationWatcher = new TranslationWatcher(binding);
        translationWatcher.afterTextChanged(editable);

        verify(binding, times(1)).setTranslation(any(Translation.class));
    }
}
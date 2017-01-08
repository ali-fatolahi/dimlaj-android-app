package com.dilmaj.android.handlers;

import android.text.Editable;

import com.dilmaj.android.databinding.MainBinding;
import com.dilmaj.android.handlers.WordWatcher;
import com.dilmaj.android.model.Word;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.any;

@RunWith(MockitoJUnitRunner.class)
public class WordWatcherUnitTest {
    @Test
    public void testAfterTextChangedUpdatesBinding() throws Exception {
        MainBinding binding = mock(MainBinding.class);
        Editable editable = mock(Editable.class);

        WordWatcher wordWatcher = new WordWatcher(binding);
        wordWatcher.afterTextChanged(editable);

        verify(binding, times(1)).setWord(any(Word.class));
    }
}
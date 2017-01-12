package com.dilmaj.android.model;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */

public class WordUnitTest {
    @Test
    public void testDefaultConstructor() {
        Word word = new Word();
        Assert.assertThat(word.getContents(), is(""));
    }

    @Test
    public void testConstructor() {
        String expected = "contents";
        Word word = new Word(expected);
        Assert.assertThat(word.getContents(), is(expected));
    }

    @Test
    public void testSetter() {
        String expected = "contents";
        Word word = new Word();
        word.setContents(expected);
        Assert.assertThat(word.getContents(), is(expected));
    }
}

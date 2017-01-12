package com.dilmaj.android.model;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */

public class TranslationUnitTest {
    @Test
    public void testDefaultConstructor() {
        Translation translation = new Translation();
        Assert.assertThat(translation.getContents(), is(""));
    }

    @Test
    public void testConstructor() {
        String expected = "contents";
        Translation translation = new Translation(expected);
        Assert.assertThat(translation.getContents(), is(expected));
    }

    @Test
    public void testSetter() {
        String expected = "contents";
        Translation translation = new Translation();
        translation.setContents(expected);
        Assert.assertThat(translation.getContents(), is(expected));
    }
}

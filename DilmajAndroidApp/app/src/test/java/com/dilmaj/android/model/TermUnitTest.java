package com.dilmaj.android.model;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */

public class TermUnitTest {
    @Test
    public void testDefaultConstructor() {
        Term term = new Term();
        Assert.assertThat(term.getContents(), is(""));
    }

    @Test
    public void testConstructor() {
        String expected = "contents";
        Term term = new Term(expected);
        Assert.assertThat(term.getContents(), is(expected));
    }

    @Test
    public void testSetter() {
        String expected = "contents";
        Term term = new Term();
        term.setContents(expected);
        Assert.assertThat(term.getContents(), is(expected));
    }
}

package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight170Then80And5() {
        short in = 170;
        double expected = 80.5;
        double out  = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight200Then103And5() {
        short in = 200;
        double expected = 103.5;
        double out  = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
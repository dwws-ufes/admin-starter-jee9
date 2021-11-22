package br.ufes.inf.labes.adminstarterjee9;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class TestController implements Serializable {
    private static final String[] NAMES = {"AdminFaces", "Jakarta EE 9", "PrimeFaces 10"};

    private int idx;

    private int count;

    public String getName() {
        count++;
        idx = (idx + 1) % NAMES.length;
        return NAMES[idx];
    }

    public int getCount() {
        return count;
    }

    public void resetCount() {
        count = 0;
    }
}

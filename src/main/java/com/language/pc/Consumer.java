package com.language.pc;

/**
 * Created by sanjay.nayak on 9/27/17.
 */
public interface Consumer {

    boolean consumer(Item item);

    boolean finish();
}

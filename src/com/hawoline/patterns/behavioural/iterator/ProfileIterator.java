package com.hawoline.patterns.behavioural.iterator;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}

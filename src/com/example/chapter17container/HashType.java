package com.example.chapter17container;

import java.util.Objects;

public class HashType extends SetType {

    public HashType(int i) {
        super(i);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}

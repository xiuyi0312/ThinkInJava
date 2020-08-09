package com.example.chapter17container;

import java.util.Objects;

public class SetType {
    int i;

    public SetType(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetType setType = (SetType) o;
        return i == setType.i;
    }
}

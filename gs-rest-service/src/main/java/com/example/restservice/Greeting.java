package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Greeting {
    @JsonCreator
    static Greeting create(long id, String content) {
        return new AutoValue_Greeting(id, content);
    }

    public abstract long getId();

    public abstract String getContent();
}

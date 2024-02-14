package com.example.geektrust.model;

public class Pair<X, Y>
{
    private final X k;
    private final Y v;
    public Pair(X k, Y v)
    {
        this.k = k;
        this.v = v;
    }
    public X retrieveKey()
    {
        return this.k;
    }
    public Y retrieveVal()
    {
        return this.v;
    }
}

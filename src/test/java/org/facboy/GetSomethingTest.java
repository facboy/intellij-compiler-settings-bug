package org.facboy;

public class GetSomethingTest {

    private final GetSomething getSomething;

    public GetSomethingTest(GetSomething getSomething) {
        this.getSomething = getSomething;
    }

    void testGetSomething() {
        getSomething.getSomething();
    }

}

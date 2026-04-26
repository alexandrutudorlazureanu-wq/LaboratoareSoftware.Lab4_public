package ro.ulbs.proiectaresoftware.lab1.Lab5.advanced;

public abstract class ACalculator<T> {
    protected T state;

    public T result() {
        return state;
    }

    public void clear() {
        state = null;
    }

    public abstract ACalculator<T> init(T initialValue);
}
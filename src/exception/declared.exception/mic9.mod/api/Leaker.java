package api;




public interface Leaker {

    void leak(String parameter) throws LeakException;
}

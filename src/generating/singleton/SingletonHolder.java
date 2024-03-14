package generating.singleton;

public class SingletonHolder {
    private SingletonHolder() {
    }

    private static class Singleton {
        private final static SingletonHolder instance = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return Singleton.instance;
    }
}

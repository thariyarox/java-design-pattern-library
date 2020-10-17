class SingletonV1 {

    private static SingletonV1 con;

    //constructor
    private Singleton() {
        con = null;
    }

    public static SingletonV1 getConnection() {
        if (con == null) {
            con = new SingletonV1();
        }

        return con;
    }
}
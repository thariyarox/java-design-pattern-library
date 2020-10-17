class SingletonV1 {

    private static SingletonV1 con;

    //constructor
    private SingletonV1() {
        con = null;
    }

    public static SingletonV1 getInstance() {
        if (con == null) {
            con = new SingletonV1();
        }

        return con;
    }
}
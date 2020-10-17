class SingletonV2 {

    private static SingletonV2 con;

    //constructor
    private SingletonV2() {
        con = null;
    }

    public synchronized static SingletonV2 getInstance() {
        if (con == null) {
            con = new SingletonV2();
        }

        return con;
    }
}
class SingletonV3 {

    private static SingletonV3 con;

    //constructor
    private SingletonV3() {
        con = null;
    }

    public static SingletonV3 getInstance() {

        if (con == null) {

            synchronized(this) {
                con = new SingletonV3();
            }
        }

        return con;
    }
}
class SingletonV4 {

    private static volatile SingletonV4 con;

    //constructor
    private SingletonV4() {
        con = null;
    }

    public static SingletonV4 getConnection() {

        if (con == null) {

            synchronized(this) {
                if (con == null) {
                    con = new SingletonV4();
                }
            }
        }

        return con;
    }
}
package oop28;

public class program {
    public static void main(String[] args) {

    }
}
enum Operations{
    SUM{
        public int action(int x, int y){
            return x*y;
        }
    },
    MULTIPLAY,
    SUBTRCTHION{
        public int action(int x, int y){
            return x - y;
        }
    };
}

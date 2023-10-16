public class VariableCastingHomework {
    public static void main(String[] args) {
        byte byte1 = 5;
        short short1 = 19;
        int int1 = 75;
        long long1 = 56789;
        float float1 = 23456678.99F;
        double double1 = 987654323.67;

        byte1 = (byte)short1;
        short1 = (short)int1;
        int1 = (int)long1;
        long1 = (long)double1;
        float1 = (float) double1;

        System.out.println(byte1);
        System.out.println(short1);
        System.out.println(int1);
        System.out.println(long1);
        System.out.println(float1);
        System.out.println(double1);
    }
}

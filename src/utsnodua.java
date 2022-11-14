public class utsnodua {
    public static void main(String[] args) {
        float[]myNumber = new float[]{2.34f,4.56f,67.89f};
        pembulatankeatas(myNumber);
    }
    public static void pembulatankeatas(float[] myNumber){
        System.out.println(Math.ceil(myNumber[0]));
        System.out.println(Math.ceil(myNumber[1]));
        System.out.println(Math.ceil(myNumber[2]));
    }
}

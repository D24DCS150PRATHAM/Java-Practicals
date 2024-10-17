import java.io.FileInputStream;
import java.io.FileOutputStream;

class pr27_1{
    public static void main(String[] args) {
        pr27_1 sp=new pr27_1();
        sp.write();
        sp.read();
    }

    void write(){

        try {
            FileOutputStream fi=new FileOutputStream("ip.txt");

            String txt="Pratham Jadwani";
            byte[] a=txt.getBytes(); // Converting String to bytes

            System.out.println("Length of the text: " + txt.length());

            fi.write(a);
            System.out.println("Hello World");
        }catch (Exception e){
            System.out.println("error occur");
        }

    }

    void read(){
        try {
            FileInputStream fi=new FileInputStream("ip.txt");
            int i=0;
            while((i=fi.read())!=-1){
                System.out.print((char) i+ " ");
            }
            System.out.println();

            System.out.println("Hello Its Java");
        }catch (Exception e){
            System.out.println("Error Here!");
        }

    }

}
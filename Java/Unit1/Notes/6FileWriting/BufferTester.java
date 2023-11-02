public class BufferTester {
    public static void main(String[] args) {
       BufferWriter.writeString("Hello World");
       BufferWriter.saveAndClose(); 
       System.out.println(BufferWriter.readString());
    }
}

//import java.io.FileOutputStream;
//import java.io.FileInputStream;
// import java.io.DataOutputStream;
import java.io.DataInputStream;

class FileDemo
{
	public static void main(String[] args) throws Exception {

		// FileOutputStream fos = new FileOutputStream("demo.txt");
		// DataOutputStream dos = new DataOutputStream(fos);
		// dos.writeUTF("Demo content");


		FileInputStream fis = new FileIntputStream("demo.txt");
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);
		//dos.writeUTF("Demo content");

	}
}
package multithread;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class RecieveThread extends Thread{
	private Socket s;
    public RecieveThread(Socket s) {
        this.s = s;
    }
    public void run() {
        try {
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                String msg = dis.readUTF();
                System.out.println("���յ���"+msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

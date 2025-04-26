import java.io.*;

class WriterThread extends Thread {
    PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            pos.write("Hello from Writer Thread".getBytes());
            pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ReaderThread extends Thread {
    PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            int byteRead;
            while ((byteRead = pis.read()) != -1) {
                System.out.print((char) byteRead);
            }
            pis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Problem8 {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            writer.start();
            reader.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

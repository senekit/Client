

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocket extends Socket {
    /**
     * @Description:无参构造方法
     * @Author: LJZ
     * @Date: 2020/9/16 18:20
    []

     **/
    ClientSocket(){}
    /**
     * @Description:用指定ip和端口号创建客户端套接字对象
     * @Author: LJZ
     * @Date: 2020/9/16 18:21
    [port, ip]
     **/
    ClientSocket(String ip,int port) throws IOException {
        super(ip,port);
    }
    /**
     * @Description:用于发送String类型的消息
     * @Author: LJZ
     * @Date: 2020/9/16 18:28
    [message]
    void
     **/
    public void send(String message) throws IOException {
        OutputStream os = this.getOutputStream();
        os.write(message.getBytes());
        os.flush();
    }
    /**
     * @Description:接收套接字中信息，并进行处理
     * @Author: LJZ
     * @Date: 2020/9/16 18:36
    []
    java.lang.String
     **/
    public String[] accept() throws IOException {
        InputStream in = this.getInputStream();
        byte[] data=new byte[1024];
        in.read(data);
        String[] messages = new String[100];
        String message =new String(data);
        System.out.println(message);
        messages = message.split("/");
        return messages;
    }
}

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
    public void accept() throws IOException {
        InputStream in = this.getInputStream();
        byte[] data=new byte[1024];
        in.read(data);
        String message =new String(data);
        System.out.println(message);
//        String[] messages= new String[100];
//        int j=0,k=0;
//        for(int i=0;i<message.length();i++){
//            if(message.charAt(i)=='/'){
//                messages[k]=message.substring(j,i);
//                j=i+1;
//                k++;
//            }
//        }
//        switch (messages[0].charAt(0)){
//            case 'S':{
//                //弹出弹窗提示操作成功
//            }
//            case 'I':{
//                //从服务器获取收入信息
//            }
//            case 'E':{
//                //从服务器获取支出信息
//            }
//        }
    }
}

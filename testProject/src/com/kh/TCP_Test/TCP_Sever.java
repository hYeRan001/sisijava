package com.kh.TCP_Test;
import java.net.*;
import java.io.*;

public class TCP_Sever {
	  public static void main(String[] args) {
	      
	      System.out.println("server start");
	      
	      String serverIP = null;
	      // port는 1024번까지는 정해진 이미 사용되는 포트
	      // 1. 서버의 포트번호 정함
	      int port =  5000;
	      
	      // 2. 서버용 소켓 객체 생성
	      ServerSocket serverSocket = null;
	      
	      
	      try {
	         // serverSocket 객체 생성 => port를 정해줘야한다.
	         serverSocket = new ServerSocket(port);
	         // 생성된 serverSocket객체 에서 서버의 InetAddress(ip정보를 가진 객체)
	         // 가지고 온 뒤 IP를 확인한다.
	         serverIP = serverSocket.getInetAddress().getHostAddress();

	         // 3. 클라이언트 쪽에서 접속 요청이 오길 기다림
	         // 4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
	         // accept메서드는 클라이언트의 요청을 기다렸다가
	         // 요청이 도착하면 해당 소켓정보를 반환해준다.
	         System.out.println("요청대기중...");
	         Socket clientSocket = serverSocket.accept();
	         
	         // 생성된 clientSocket객체 에서 서버의 InetAddress(ip정보를 가진 객체)
	         // 가지고 온 뒤 IP를 확인한다.
	         String clientIP = clientSocket.getInetAddress().getHostAddress();
	         System.out.println("client 접속 확인 : " + clientIP);
	         
	         InputStream is = clientSocket.getInputStream();
	         BufferedInputStream br = new BufferedInputStream(is);
	         DataInputStream dis = new DataInputStream(br);
	               
	         // BufferedReader br = new BufferedReader(new InputStream(clientSocket.getInputStream();));
	         
	         OutputStream os = clientSocket.getOutputStream();
	         BufferedOutputStream bos = new BufferedOutputStream(os);
	         DataOutputStream dos = new DataOutputStream(bos);
	         
	         String str = dis.readUTF();
	         System.out.println(str);
	         dos.writeUTF("반갑습니다.");
	         dos.flush(); // 이 메서드를 호출해줘야 write 날라감
	         
	      } catch(IOException e) {
	         e.printStackTrace();
	      }
	         
	   
	      // 5. 연결된 클라이언트와 입출력 스트림 생성
	      // 6. 보조 스트림을 통해 성능 개선
	      // 7. 스트림을 통해 읽고 쓰기
	      // 8. 통신 종료
	      
	      
	      
	   }
	}
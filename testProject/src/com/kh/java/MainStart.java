package com.kh.java;
import java.util.Scanner;

// main메서드를 실행해주기위한 class
public class MainStart {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //최대 학생에 수는 30인 클레스(i, h, j)를 3개 만들어라
      
      Student[] iban = new Student[30];
      Student[] jban = new Student[30];
      Student[] hban = new Student[30];
      //선택한 반의 주소값을 가지고 있는 참조변수
      Student[] selectBan;
      
      while(true) {
         // 관리할 클레스를 선택해 주세요. (i j k 반중 선택) :
         System.out.print("관리할 클레스를 선택해 주세요. (i j h반 중 선택 다른키워드 입력시 종료) : ");
         
         switch(sc.next().charAt(0)) {
            case 'i':
               selectBan = iban;
               break;
            case 'j':
               selectBan = jban;
               break;
            case 'h':
               selectBan = hban;
               break;
            default:
               selectBan = null;
         }
         
         if (selectBan == null)
            break;
         
         // 1. 학생추가
         // 2. 학생제거
         // 3. 학생목록 확인
         // 기타입력시 뒤로 그전까지 반복
         boolean isTrue = true;
         while(isTrue) {
            System.out.println("1. 학생추가");
            System.out.println("2. 학생제거");
            System.out.println("3. 학생목록 확인");
            System.out.println("4. 학생조회");
            System.out.println(" 기타입력시 뒤로");
         
            switch(sc.nextInt()) {
               case 1: {
                  // selectBan의 마지막 빈자리를 찾는다.
                  int index = 0;
                  while(index < selectBan.length && selectBan[index] != null) {
                     index++;
                  }
                  
                  // selectBan에 자리가 있을 시 학생을 추가해 준다.
                  if (index == selectBan.length)
                     System.out.println("더이상 해당반에는 학생을 추가할 수 없습니다.");
                  else {
                     System.out.println("추가할 학생의 이름, 나이, 성별을 입력해 주세요.");
                     selectBan[index] =  new Student(sc.next(), sc.nextInt(), sc.next());
                  }
               }break;
               case 2: {
                  int index = 0;
                  while(index < selectBan.length && selectBan[index] != null) {
                     index++;
                  }
                  if (index == 0)
                     System.out.println("삭제할 학생이 없습니다.");
                  else {
                     selectBan[index - 1] = null;
                     Student.count--;
                  }
               }break;
               case 3: {
                  System.out.println("---------------------------");
                  System.out.println("이름\t나이\t성별");
                  for (int i = 0; i < selectBan.length; i++) {
                     if (selectBan[i] == null)
                        break;
                     selectBan[i].info();
                  }
                  System.out.println("---------------------------");
               }break;
               case 4: {
            	   //조회할 학생의 정보를 입력하세요(이름,나이,성별
            	   //해당 학생은 이미 등록 완료되엇습니다.
            	   //or 해당학생을 찾을 수 없습니다.
            	  System.out.println("조회 학생의 정보를 입력(이름, 나이, 성별) : ");
            	  String name = sc.next();
            	  int age = sc.nextInt();
            	  String gender = sc.next();
            	  Student tmp = null;
            	  for(int i = 0; i < selectBan.length; i++) {
            		  if(selectBan[i] == null)
            			  break;
            		  else if(selectBan[i].getAge() == age && selectBan[i].getName().equals(name)&& selectBan[i].getGender().equals(gender)) {
            			  tmp = selectBan[i];
            			  break;
            		  }
            	  }
               if (tmp != null)
            	   System.out.println("해당 학생은 이미 등록 완료되었습니다.");
               else
            	   System.out.println("해당학생을 찾을 수 업습니다.");
               }break;
               default:
                  isTrue = false;
            }
         }
         
      }
      
      
      System.out.print("총 학생 " + Student.count + "명을 등록 완료하였습니다.");
      
     
    	  
      
      
      
   }
}
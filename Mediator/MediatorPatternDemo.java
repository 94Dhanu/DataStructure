package Dj.Design.Mediator;


public class MediatorPatternDemo {  
      
    public static void main(String args[])  
    {  
          
          ApnaChatRoom chat = new ApnaChatRoomImpl();  
      
          User1 u1=new User1(chat);  
          u1.setname("Mahesh Aurad");  
          u1.sendMsg("Hi Dj! how are you?");  
        
                
          User2 u2=new User2(chat);  
          u2.setname("Dj");  
          u2.sendMsg("I am Fine ! You tell?");  
    }  
  
}

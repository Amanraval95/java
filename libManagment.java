import java.util.ArrayList;
import java.util.Scanner;
class Library{
    String book_name;

    void books(){
      ArrayList<String> book=new ArrayList<String>();      

    }
    public void Addbooks(String list){
        
        book.add(list);
        System.out.println(list);
    }

    void Deletebooks(){

    }

    Void Selectbook(){

    }
}
public class libManagment {
  static Library obj = new Library();
        public static void main(String[] args){ 
            obj.Addbooks("heyy");
          
        }
}

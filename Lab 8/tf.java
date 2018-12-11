import java.util.*;
import java.io.*;

class newThread implements Runnable{
  Thread t;
  String name;
  File file;
  newThread(String name){
    t=new Thread(this);
    this.name=name;
    file=new File(name);
    t.start();
  }
  public void run(){
    try{
      if(!file.exists())
        throw new FileNotFoundException();
    BufferedReader br=new BufferedReader(new FileReader(file));
    String c;
    while((c=br.readLine())!=null){
      System.out.println(c);
    }
  }
  catch(FileNotFoundException e){
    System.out.println("File "+name+" not found.");
  }
  catch(IOException e){
    System.out.println("IO error.");
  }
  }
}

class tf{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    newThread t1=new newThread(args[0]);
    try{
      t1.t.join();
    }
    catch(InterruptedException e){
      System.out.println("Interrupted Exception error");
    }
    newThread t2=new newThread(args[1]);

    try{
      t2.t.join();
    }
    catch(InterruptedException e){
      System.out.println("Interrupted Exception error");
    }
  }
}

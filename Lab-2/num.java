import java.util.*;
class operations{
  void printnum(){
    for(int i=0;i<10; i++)
      System.out.println(i+1);
      return;
  }

  double avg(){
    int sum=0;
    for(int i=1; i<=10; i++){
      sum+=(i);
    }
    return sum/10;
  }

  double sd(double mean){
    int s_sum=0;
    for (int i=0;i<10;i++ )
      s_sum+=((i+1-mean)*(i+1-mean));

      return Math.sqrt(s_sum/10);
      }
}

class num{
  public static void main(String[] args) {
    double mean, std_deviation;
    operations op=new operations();

    op.printnum();
    mean=op.avg();
    std_deviation=op.sd(mean);

    System.out.println("The mean of the above numbers is "+mean);
    System.out.println("The standard deviation of the above printed numbers is "+std_deviation);
  }
}

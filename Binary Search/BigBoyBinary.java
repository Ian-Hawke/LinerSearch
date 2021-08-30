import java.util.Arrays;
import java.lang.Integer;

public class BigBoyBinary {
  static int[] array = {1,2,3,4,5,6,7,8,9,10};

  public static void main(String[] args){

    for(int i = 0; i< array.length;i++)

    if (array[i]==7){
      System.out.println("Number:" + array[i] +"at index" + i + "is true");
      return;
    }
    else System.out.println("Number:" + array[i] + "at index" + i + "is false");
  }
}

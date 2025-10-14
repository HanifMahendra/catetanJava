public class Vowels {

  public static int getCount(String str) {
    int count = 0;
    for (char c : str.toCharArray()){
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args){
    System.out.println(getCount("Hai nama ku Yutori"));
  }

}
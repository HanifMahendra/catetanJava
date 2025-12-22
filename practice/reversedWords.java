package practice;

public class reversedWords {
  public static String reverseWords(final String original) {
    StringBuilder temp = new StringBuilder();
    StringBuilder hasil = new StringBuilder();
    
    for(int i = 0; i < original.length(); i++){ // Loop dari awal sampe akhir
      if(original.charAt(i) != ' '){ // Kalo didalam loop ketemu BUKAN spasi
        temp.append(original.charAt(i)); // Masukin ke variable temp
      } else if (original.charAt(i) == ' '){ // Kalo didalam loop ketemu spasi
        for(int j = temp.length() - 1; j >= 0; j--){ // Loop yang ada di temp dari belakang
          hasil.append(temp.charAt(j)); // Masukin "j" yang merupakan char reversed "temp" ke "hasil".
        } // Loop selesai
        hasil.append(' '); // Tambahin spasi di akhir "hasil".
        temp.setLength(0); // Kosongkan "temp"
      }
    }
    
    for(int j = temp.length() - 1; j >= 0; j--){ // Kalo kata 'terakhir' itu tidak ada spasi, berarti ga akan masuk ke 'else if' dan hanya berdiam di temp karena 'if'
      hasil.append(temp.charAt(j)); // Maka dari itu, balik kata yang ada di temp, lalu simpan ke hasil.
    }
    
    return hasil.toString();
  }

  public static void main(String[] args){
    System.out.println(reverseWords("This is Yutori learn time!"));
  }
}
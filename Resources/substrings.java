public class substrings {
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a string
        //                string.substring(start, end)

        String email = "Yutori@gmail.com";
        String username = email.substring(0,6); // substring digunakan untuk mengambil 'string' dari sebuah variable
        System.out.println("Your name is: " + username);

        String domain = email.substring(6, 16); // Bisa juga endIndexnya dikosongin, kalo mau sampe selesai
        System.out.println("Your domain is: " + domain);

        String name = email.substring(0, email.indexOf("@")); // Cara lain untuk mengambil nama dari variable email
        System.out.println("Your name is: " + name);

        String gmail = email.substring(email.indexOf("@")); // Cara lain buat ngambil dari domainnya saja
        System.out.println("Your domain is: " + gmail); // Bisa juga email.indexOf("@" + 1); -> kalau mau mulai dari setelah "@"
        
    }
}
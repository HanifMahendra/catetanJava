public class stringMethods {
    public static void main(String[] args) {
        String name = "Yutori - Yakitori";
        
        // String methods
        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(0); // angka index untuk mengambil string "keberapa"
        System.out.println(letter);

        int index = name.indexOf("i"); // untuk cari letak "stringnya"
        System.out.println(index);

        int lastIndex = name.lastIndexOf("i"); // Untuk mencari letak "string" terakhir
        System.out.println(lastIndex);

        name = name.toUpperCase(); // CAPSLOCK semua string
        System.out.println(name);

        name = name.toLowerCase(); // LowerCase semua string
        System.out.println(name);

        name = name.trim(); // Same as toLowerCase
        System.out.println(name);

        name = name.replace("yu","ko"); // replace huruf/kata
        System.out.println(name);

        System.out.println(name.isEmpty()); // Cek variablenya 'kosong' atau tidak -> Efektif if else -> print dalam boolean ('true' or 'false')

        if(name.contains(" ")) {
            System.out.println("Your name contains a space");
        }
        else {
            System.out.println("Your name doesn't contain any spaces");
        }

        if(name.equals("Yutori - Yakitori")) { // Tidak mengabaikan besar-kecil huruf (case-sensitive)
            System.out.println("Hi Yutori!");
        }
        else {
            System.out.println("Hi user!");
        }

        if(name.equalsIgnoreCase("password!")) { // Mengabaikan besar-kecil huruf (case-insensitive)
            System.out.println("Find another name!");
        }
        else {
            System.out.println("What sup?");
        }
    }
}

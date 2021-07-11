import java.util.ArrayList;


public class Main {
    
  public static String arrayToString(ArrayList<String> sources) {
        String results  = "";
        for (String source : sources) {
            results += (source + " ");
        }
        return results;
    }

    static ArrayList<String> textToArray(String text) {
        ArrayList<String> kata = new ArrayList<>();
        for(int i = 0; i < text.length(); i++) {
            if(!Character.toString(text.charAt(i)).toLowerCase().equals(" ")) {
                if(i == 0) {
                    kata.add(Character.toString(text.charAt(i)));
                } else {
                    if(Character.toString(text.charAt(i - 1)).toLowerCase().equals(" ")) {
                        kata.add(Character.toString(text.charAt(i)));
                    } else {
                        kata.set(kata.size() - 1, 
                        kata.get(kata.size() - 1) + text.charAt(i));
                    }
                }
            }
        }
        return kata;
    }

    static void insertToText(String text, String targetText, Integer targetIndex) {
        ArrayList<String> setelahditambah = textToArray(text);

        setelahditambah.add(targetIndex, targetText);

        System.out.println("kalimat awal : " + text);
        System.out.println("kalimat akhir : " + arrayToString(setelahditambah));
    }


    public static void main(String[] args) {
        insertToText("Saya sedang belajar struktur data", "pergi", 2);
        insertToText("Pemrograman itu sangat mudah", "dan menyenangkan", 4);
    }
}


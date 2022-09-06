import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static void main(String[] args) {
        System.out.println(greet("danish"));

    }

    public static String greet(String lang) {
        Map<String, String> mapList = new HashMap<>();
        mapList.put("english", "Welcome");
        mapList.put("czech", "Vitejte");
        mapList.put("danish", "Velkomst");
        mapList.put("dutch", "Welkom");
        mapList.put("estonian", "Tere tulemast");
        mapList.put("finnish", "Tervetuloa");
        mapList.put("flemish", "Welgekomen");
        mapList.put("french", "Bienvenue");
        mapList.put("german", "Willkommen");
        mapList.put("irish", "Failte");
        mapList.put("italian", "Benvenuto");
        mapList.put("lithuanian", "Laukiamas");
        mapList.put("polish", "Witamy");
        mapList.put("spanish", "Bienvenido");
        mapList.put("swedish", "Valkommen");
        mapList.put("welsh", "Croeso");

        if (mapList.containsKey(lang))
            return mapList.get(lang);
        else
            return mapList.get("english");
    }
}

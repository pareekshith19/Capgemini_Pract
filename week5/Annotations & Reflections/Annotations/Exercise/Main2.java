package Day3.Annotations.Exercise;
class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature in use");
    }

    public void newFeature() {
        System.out.println("New feature in use");
    }
}

public class Main2 {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        api.newFeature();
    }
}

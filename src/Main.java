public class Main {
    public static void main(String[] args) {
        Band band1 = new Band("ASIAN KUNG-FU GENERATION", -4);
        Band.live();
        System.out.println(band1.getName());
        band1.member();

        Band band2 = new Band("UNISON SQUARE GARDEN", 3);
        Band.live();
        System.out.println(band2.getName());
        band2.member();

        Band band3 = new Band("Rhythmic Toy World", 4);
        Band.live();
        System.out.println(band3.getName());
        band3.member();
    }
}

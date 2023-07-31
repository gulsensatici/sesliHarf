public class Main {
    public static void main(String[] args) {
        char harf = 'a';
        char buyukHarf = Character.toUpperCase(harf);

        switch (buyukHarf) {
            case 'A':
            case 'E':
            case 'I':
            case 'İ':
            case 'O':
            case 'Ö':
            case 'U':
            case 'Ü':
                System.out.println("Sesli harf girdiniz");
                break;
            default:
                System.out.println("sessiz harf girdiniz");
        }
    }
}
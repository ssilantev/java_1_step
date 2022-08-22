public class Practice3 {
    public static class main(string[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = ""
        while (name.length() == 0){
            System.out.print("Введите ваше имя: ");
            name = scanner.nextline();
            if (name.length() > 0){
                System.out.print("Привет, " + name + "!");
            }
        }
    }
}
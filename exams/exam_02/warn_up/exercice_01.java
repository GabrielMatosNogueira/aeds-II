import java.util.Scanner;

public class exercice_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue CompetitorQueue = new Queue();
        int quantityCompetitors = 0;
        String name = "";
        int weight = 0;

        quantityCompetitors = sc.nextInt();

        for (int i = 0; i < quantityCompetitors; i++) {

        }

        sc.close();
    }

    class Queue {
        public Competitor head;

        public Queue() {
            this.head = null;
        }

        public Competitor insert() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nome: ");
            String name = sc.nextLine().trim();
            System.out.print("Peso: ");
            int weight;
            try {
                weight = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                weight = 0;
            }
            Competitor c = new Competitor(name, weight);
            insert(c);
            return c;
        }

        public void insert(Competitor c) {
            if (this.head == null) {
                this.head = c;
            } else {
                Competitor cur = this.head;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = c;
            }
        }
    }

    class Competitor {
        public String name;
        public int weight;
        public Competitor next;

        public Competitor() {
            this.name = "";
            this.weight = 0;
            this.next = null;
        }

        public Competitor(String name, int weight) {
            this.name = name;
            this.weight = weight;
            this.next = null;
        }
    }
}
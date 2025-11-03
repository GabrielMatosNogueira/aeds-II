import java.util.Scanner;

class WeightCompetition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Queue competitorsQueue = new Queue();
        int competitorsNumber = 0;

        String name = "";
        int weight = 0;

        competitorsNumber = sc.nextInt();

        for(int i=0; i<competitorsNumber; i++)
        {
            name = sc.next();
            weight = sc.nextInt();
            competitorsQueue.insertEnd(name, weight);
        }

        competitorsQueue.mostrar();
        competitorsQueue.sortCompetitors(competitorsQueue);
        System.out.println("\n" + "Lista ordenada");
        competitorsQueue.mostrar();

        sc.close();
    }
}

class Competitor
{
    public String name;
    public int weight;
    public Competitor prev;
    public Competitor next;

    Competitor()
    {
        this.name = "";
        this.weight = -1;
    }

    Competitor(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }
}

class Queue
{
    private Competitor first;
    private Competitor last;

    Queue()
    {
        first = new Competitor();
        last = first;
    }

    public void insertEnd(String name, int weight)
    {
        Competitor novo = new Competitor(name, weight);
        last.next = novo;
        novo.prev = last;
        last = novo;
    }

    public void mostrar()
    {
        for(Competitor i = first.next; i != null; i = i.next)
        {
            System.out.println(i.name + " " + i.weight);
        }
    }

    public Queue sortCompetitors(Queue toSortQueue)
    {
        // cria uma nova fila que receberá os competidores ordenados
        Queue sortedQueue = new Queue();

        // percorre todos os competidores da fila a ordenar
        for (Competitor current = toSortQueue.first.next; current != null; current = current.next)
        {
            // copia do competidor atual (não altera a lista original)
            Competitor copy = new Competitor(current.name, current.weight);

            // encontra a posição correta em sortedQueue:
            // queremos ordem crescente por weight; em empate, por name (lexicográfico crescente)
            Competitor posPrev = sortedQueue.first; // nó fictício antes do primeiro real
            Competitor posNext = posPrev.next;      // primeiro elemento real a comparar

            // avança enquanto o elemento na lista ordenada for "menor ou igual"
            // em relação ao novo (ou seja, copy > posNext), para manter ordem crescente
            while (posNext != null &&
                   (copy.weight > posNext.weight ||
                    (copy.weight == posNext.weight && copy.name.compareTo(posNext.name) >= 0)))
            {
                posPrev = posNext;
                posNext = posNext.next;
            }

            // insere 'copy' entre posPrev e posNext
            posPrev.next = copy;
            copy.prev = posPrev;
            copy.next = posNext;

            if (posNext != null)
            {
                posNext.prev = copy;
            }
            else
            {
                // inserido no final: atualiza ponteiro last da fila ordenada
                sortedQueue.last = copy;
            }
        }

        // substitui o conteúdo da fila original pelo conteúdo ordenado
        toSortQueue.first = sortedQueue.first;
        toSortQueue.last = sortedQueue.last;

        return toSortQueue;
    }

    // método auxiliar para mostrar a lista secundária ordenada
    public void mostrarOrdenados()
    {
        for (Competitor i = first.next; i != null; i = i.next) {
            System.out.println(i.name + " " + i.weight);
        }
    }
}
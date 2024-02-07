import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        List<Agent> agents = new ArrayList<>();

        // names
        // .stream()
        // .map(string -> agents.add(new Agent(string.split(" ")[0], string.split("
        // ")[0])))
        // .toList();
        // Utilisation d'un Stream et de la méthode map avec une lambda pour transformer
        // la liste de noms en une liste d'objets Agent
        agents = names.stream()
                .map(name -> {
                    String[] nameParts = name.split(" ");
                    return new Agent(nameParts[0], nameParts[1]);
                })
                .collect(Collectors.toList());


        showAgents(agents);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}
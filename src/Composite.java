import java.util.ArrayList;
import java.util.List;

public class Composite implements OlympicsTeams {
    private String name ;
    private int numAth ;
    private int numGoldM ;

    private List<OlympicsTeams> olympicsTeam ;

    public Composite(String name, int numAth, int numGoldM) {
        this.name = name;
        this.numAth = numAth;
        this.numGoldM = numGoldM;
        this.olympicsTeam = new ArrayList<>() ;
    }
    public void addOlympicTeam(OlympicsTeams c){
        olympicsTeam.add(c) ;
    }
    public void removeOlympicTeam(OlympicsTeams c) {
        olympicsTeam.remove(c) ;
    }
    public void accept(OlympicsTeamVisitor v) {
        v.visit(this);

    }

    public List<OlympicsTeams> getOlympicsTeam() {
        return olympicsTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumAth() {
        return numAth;
    }

    public void setNumAth(int numAth) {
        this.numAth = numAth;
    }

    public int getNumGoldM() {
        return numGoldM;
    }

    public void setNumGoldM(int numGoldM) {
        this.numGoldM = numGoldM;
    }
}

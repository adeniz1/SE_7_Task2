public class Sports implements OlympicsTeams  {

    private String name ;
    private int numAth ;
    private int numGoldM ;

    public Sports(String name, int numAth, int numGoldM) {
        this.name = name;
        this.numAth = numAth;
        this.numGoldM = numGoldM;
    }

    public void accept(OlympicsTeamVisitor v) {
        v.visit(this);

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

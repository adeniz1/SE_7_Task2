public class PrintNumberAthletes implements OlympicsTeamVisitor  {

    public void visit(Composite c) {
        System.out.println("***Name of the Teams and Number of Athletes of : " + c.getName() + "***") ;
        for (int i = 0; i < c.getOlympicsTeam().size(); i++) {
            System.out.println("*" + "Team: " + c.getOlympicsTeam().get(i).getName() + " Number of Athletes: " + c.getOlympicsTeam().get(i).getNumAth() );
            if(c.getOlympicsTeam().get(i) instanceof  Composite) {
                visit((Composite) c.getOlympicsTeam().get(i));
            }
        }
    }

    public void visit(Sports s) {
        System.out.println("Team: " + s.getName() + " Number of Athletes: " + s.getNumAth() ) ;
    }
}

public class PrintGoldMedals implements OlympicsTeamVisitor{


    public void visit(Composite c) {
        System.out.println("***Name of the Teams and Number of Goldmedals of : " + c.getName() + "***") ;
        for (int i = 0; i < c.getOlympicsTeam().size(); i++) {
            System.out.println(" * " + "Team: " + c.getOlympicsTeam().get(i).getName() +
                    " Number of Goldmedals: " + c.getOlympicsTeam().get(i).getNumGoldM());
            if(c.getOlympicsTeam().get(i) instanceof  Composite) {
                visit((Composite) c.getOlympicsTeam().get(i));
            }
        }
    }

    public void visit(Sports s) {
        System.out.println("Team: " + s.getName() + " Number of Goldmedals: " + s.getNumGoldM()) ;
    }
}

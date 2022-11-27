public interface OlympicsTeams {
    public void accept(OlympicsTeamVisitor v);

    public String getName() ;
    public int getNumAth ();

    public int getNumGoldM() ;
}

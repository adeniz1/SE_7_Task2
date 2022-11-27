public class Main {

    public static void main (String [] args) {
        Composite olympic2024 = new Composite("Olympics2024", 180,23) ;
        Composite asiaTeam = new Composite("Asia-Team", 30,4) ;
        Composite europeTeam = new Composite("Europe-Team", 50,8) ;
        Composite africateam = new Composite("Africa-Team", 50,9);
        Composite southAmericaTeam = new Composite("southAmericaTeam",50,2) ;


        Composite chinaTeam = new Composite("China-Team", 20,2) ;
        Composite germanyTeam = new Composite("Germany-Team",25,5) ;
        Composite italyTeam = new Composite("Italy-Team",25,3) ;
        Composite  afghanistanTeam = new  Composite("Afghanistan-Team",10,2) ;


        Composite chinawomen =  new Composite("China-Women-Team",14,1) ;
        Composite chinamen  = new Composite("China-Men-Team", 6,1);
        Composite germanywomen = new  Composite("Germany-Women-Team",12,3) ;
        Composite germanymen = new Composite("Germany-Men-Team",15,2) ;


        OlympicsTeams teakwondo = new Sports("Teakwondo",4,0) ;
        OlympicsTeams waterpolo = new Sports("Waterpolo", 4,0) ;
        OlympicsTeams artisticgym = new Sports("Artistic Gymnastics",6,1 );
        OlympicsTeams shooting = new Sports("Shooting", 6,1) ;
        OlympicsTeams cycling = new Sports("Cycling",6,1) ;
        OlympicsTeams tennis = new Sports("Tennis",6,2) ;
        OlympicsTeams tabletennis = new Sports("Table Tennis", 6,1) ;
        OlympicsTeams football = new Sports("Football",9,1);

        chinawomen.addOlympicTeam(teakwondo); chinawomen.addOlympicTeam(waterpolo); chinawomen.addOlympicTeam(artisticgym);
        chinamen.addOlympicTeam(shooting);
        chinaTeam.addOlympicTeam(chinawomen);  chinaTeam.addOlympicTeam(chinamen);
        asiaTeam.addOlympicTeam(chinaTeam); asiaTeam.addOlympicTeam(afghanistanTeam);
        germanywomen.addOlympicTeam(cycling); germanywomen.addOlympicTeam(tennis);
        germanymen.addOlympicTeam(tabletennis); germanymen.addOlympicTeam(football);
        germanyTeam.addOlympicTeam(germanywomen); germanyTeam.addOlympicTeam(germanymen);
        europeTeam.addOlympicTeam(germanyTeam);
        olympic2024.addOlympicTeam(asiaTeam); olympic2024.addOlympicTeam(africateam); olympic2024.addOlympicTeam(europeTeam);
        olympic2024.addOlympicTeam(southAmericaTeam);



        PrintNumberAthletes visitorA = new PrintNumberAthletes() ;
        PrintGoldMedals visitorG=  new PrintGoldMedals() ;
        System.out.println("Task 4a: China-Women-Team,Number of Athletes") ;
        chinawomen.accept(visitorA); //task 4a
        System.out.println("_____________________________________________________________") ;
        System.out.println("Task 4b: Germany Team,Number of Gold Medals ") ;
        germanyTeam.accept(visitorG);
        System.out.println("_____________________________________________________________") ;
        System.out.println("Task 4c: Asia Team, Number of Gold Medals") ;
        asiaTeam.accept(visitorG);
        System.out.println("_____________________________________________________________") ;
        System.out.println("Task 4d: Teams in Olympic 2024, Number of Athletes ") ;
        olympic2024.accept(visitorA);
        System.out.println("_____________________________________________________________") ;



    }
}

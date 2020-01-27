/** Designed by LeeAnna Ewing 1/21/2020
CSC_251_91 Instructor: Dr Arrington

Review Project - Tenant Class

--------------------------------------------------------
|                       Arena                          |
--------------------------------------------------------
|-venueName: String                                    |
|-city: String                                         |
|-state: String                                        |
|-maxCapacity: int                                     |
|-yearOpened: int                                      |
|-team: Tenant                                         |
--------------------------------------------------------
|+Arena()                                              |
|+Arena(v: String, c: String, s: String, m: int,       |
|       y: int, teamName: String, sport: String,       |
|       league: String)                                |
|+setVenueName(v: String):void                         |
|+setCity(c: String):void                              |
|+setState(s: String):void                             |
|+setMaxCapacity(m: int):void                          |
|+setYearOpened(y: int):void                           |
|+getVenueName():String                                |
|+getCity():String                                     |
|+getState():String                                    |
|+getMaxCapacity():int                                 |
|+getYearOpened():int                                  |
|+toString():String                                    |
|                                                      |
--------------------------------------------------------
                         /\
                        /  \
                        \  / 
                         \/
                         ||
                         ||
                         ||
                         ||
--------------------------------------------------------
|                      Tenant                          |
--------------------------------------------------------
|-teamName: String                                     |
|-sport: String                                        |
|-league: String                                       |
--------------------------------------------------------
|+Tenant()                                             |
|+Tenant(t: String, s: String, l: String)              |
|+setTeamName(t: String):void                          |
|+setSport(s: String):void                             |
|+setLeague(l: String):void                            |
|+getTeamName():String                                 |
|+getSport():String                                    |
|+getLeague():String                                   |
|+toString():String                                    |
|                                                      |
--------------------------------------------------------

*/

public class Tenant
{

   private String teamName;
   private String sport;
   private String league;
   
   //overriding constructor
   public Tenant()
   {
      setTeamName("");
      setSport("");
      setLeague("");
   }
   
   //overloaded constructor
   public Tenant(String t, String s, String l)
   {
      setTeamName(t);
      setSport(s);
      setLeague(l);
   } 
   
   //copy constructor
    public Tenant(Tenant object2)
   {
      teamName = object2.teamName;
      sport = object2.sport;
      league = object2.league;
   }
   
   // setters 
   public void setTeamName(String t)
   {
      teamName = t;
   }
   
   public void setSport(String s)
   {
      sport = s;
   }
   
   public void setLeague(String l)
   {
      league = l;
   }
   
   // getters 
   public String getTeamName()
   {
      return teamName;
   }
   
   public String getSport()
   {
      return sport;
   }   
   
   public String getLeague()
   {
      return league;
   }
   
   public String toString()
   {
      return "\nTeam Name: \t\t" + getTeamName() +
             "\nSport: \t\t\t" + getSport() +
             "\nLeague: \t\t\t" + getLeague();
   }

}//class close

/** Designed by LeeAnna Ewing 1/21/2020
CSC_251_91 Instructor: Dr Arrington

Review Project - Arena Class

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

public class Arena
{
   //fields
   private String venueName;
   private String city;
   private String state;
   private int maxCapacity;
   private int yearOpened;
   private Tenant team; //aggregate field
   
   //no-arg constructor (overriding)
   public Arena()    
   {
      setVenueName("");
      setCity("");
      setState("");
      setMaxCapacity(0);
      setYearOpened(0);
      team = new Tenant();
   }
   
   //overloaded constructor
   public Arena(String v, String c, String s,
               int m, int y, String t, String sp,
               String l)
   {
      setVenueName(v);
      setCity(c);
      setState(s);
      setMaxCapacity(m);
      setYearOpened(y);
      team = new Tenant(t, sp, l);
   }
   
   // setters
   public void setVenueName(String v)
   {
      venueName = v;
   }
   
   public void setCity(String c)
   {
      city = c;
   }
   
   public void setState(String s)
   {
      state = s;
   }
   
   public void setMaxCapacity(int m)
   {
      maxCapacity = m;
   }
   
   public void setYearOpened(int y)
   {
      yearOpened = y;
   }
   
   public void setTenant(Tenant team)
   {
      team = new Tenant(team);
   }
   
   //getters
   public String getVenueName()
   {
      return venueName;
   }
   
   public String getCity()
   {
      return city;
   }

   public String getState()
   {
      return state;
   }
   
   public int getMaxCapacity()
   {
      return maxCapacity;
   }

   public int getYearOpened()
   {
      return yearOpened;
   }
   
     public Tenant getTenant()
   {
      return new Tenant(team); 
   }

   public String toString()
   {
      return "Venue: \t\t\t" + getVenueName() + 
             "\nLocation: \t\t" + getCity() + ", " + getState() +
             "\nCapacity: \t\t" + getMaxCapacity() +
             "\nYear Opened: \t" + getYearOpened() +
             team.toString();
   }
}//class close
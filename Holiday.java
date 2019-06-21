//1
public class Holiday {
     private String name;
     private int day;
     private String month;
       

  //a
  public Holiday(String name1, int day1, String month1) {
  name = name1;
  day = day1;
  month = month1;
  }
   
  //b
 public boolean inSameMonth(Holiday holiday){ 
      return this.month.equals(holiday.month); 
 }
 
 //c
 public static double avgDate(Holiday[] holiday) {
     int sum = 0; 
     for(int i = 0; i < holiday.length; i++) {
         sum = sum + holiday[i].day; 
     }
  return ((double) sum)/holiday.length;
 }

 //d
 Holiday holiday = new Holiday("Independence Day", 4, "July");
 

}


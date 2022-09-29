class Main {
  public static void main(String[] args) {
    gradeProject();
  }

  public static int[] add(int[] a, int[] b) {
    
  int f = a[0]+b[0];

    int s = a[1] + b[1];

    if(s>=100){
      s=s-100;
      f=f+1;

    }
  
    int[] sum = new int[]{f,s};
    
    return sum;

  }

  public static int[] sub(int[] a, int[] b) {
   int f = a[0]-b[0];

    int s = a[1] - b[1];
    if(s<0){
      s=s+100;
      f=f-1;
    }


    int[] sub = new int[]{f,s};
    
    return sub;
  }

  public static int[] mult(int[] m, int k) {
    int f = m[0]*k;

    int s =m[1]*k;
     if(s>100){
      s=s-200;
      f=f+2;
     }
    if(s==100){
      s=s-100;
      f=f+1;
    
    }
  
    int[] mult = new int[]{f,s};
    
    return mult;
    
  }
//----------------------------
   static String moneyToString(int[] m) {

    
    int f = m[0];
    int s = m[1];

  String shh=String.valueOf(s);

    int length = String.valueOf(shh).length();

    if(length==1){
      shh = ".0"+shh;
    }
    else{
      shh = "."+shh;
    }

    String total ="$"+ f+shh;
    return total;
    }

  

  
  

  public static boolean isEqual(int[] a, int[] b) {
    if((a[0] == b[0] )&&(a[1] == b[1])){
      return true;
    }
    else{
      return false;
    }
      
  }

  public static int moneyToCents(int[] a) {
    int dollar1 = a[0];
    dollar1 = dollar1*100;
    int totalA = dollar1+a[1];
    return totalA;
    
    }

  public static boolean isGreaterThan(int[] a, int[] b) {
    int dollar1 = a[0];
    int dollar2 = b[0];

    dollar1 = dollar1*100;
    dollar2 = dollar2*100;

    int totalA = dollar1+a[1];
    int totalB = dollar2+b[1];
    if(totalA > totalB){
      return true;
    }
    else{
      return false;
    }
  }

  public static boolean isLessThan(int[] a, int[] b) {
    int dollar1 = a[0];
    int dollar2 = b[0];

    dollar1 = dollar1*100;
    dollar2 = dollar2*100;

    int totalA = dollar1+a[1];
    int totalB = dollar2+b[1];
    if(totalA <= totalB){
      return true;
    }
    else{
      return false;
    }
  }

  public static boolean isGreaterThanOrEqual(int[] a, int[] b) {
    int dollar1 = a[0];
    int dollar2 = b[0];

    dollar1 = dollar1*100;
    dollar2 = dollar2*100;

    int totalA = dollar1+a[1];
    int totalB = dollar2+b[1];
    if(totalA >= totalB){
      return true;
    }
    else{
      return false;
    }
  
  }

  public static boolean isLessThanOrEqual(int[] a, int[] b) {
    int dollar1 = a[0];
    int dollar2 = b[0];

    dollar1 = dollar1*100;
    dollar2 = dollar2*100;

    int totalA = dollar1+a[1];
    int totalB = dollar2+b[1];
    if(totalA <= totalB){
      return true;
    }
    else{
      return false;
    }
  }

  public static void printAdditionProblem(int[] a, int[] b) {
    String moneyA = moneyToString(a);
    String moneyB = moneyToString(b);

    int total[] = add(a,b);
    String tot = moneyToString(total);

    System.out.println(" "+moneyA);
    System.out.println("+"+moneyB);
    System.out.println("-------");
    System.out.println(" "+tot);

  }

  public static int[] max(int[] a, int[] b, int[] c) {

  int totalA=moneyToCents(a);
  int totalB=moneyToCents(b);
  int totalC=moneyToCents(c);

    if(totalA>totalB && totalA>totalC){
      return a;
    }
    if(totalB>totalA && totalB>totalC){
      return b;
    }
    else{
      return c;
    }

  }

  public static void gradeProject() {
    
    int score = 0;
    int number = 1;
    try {
      number = 1;
      int[] m1 = { 1, 26 }, m2 = { 99, 75 }, m3 = { 3, 50 };
      int[] ans1 = add(m1, m2), ans2 = add(m2, m3), ans3 = add(m1, m3);
      boolean b = ans1[0] == 101 && ans1[1] == 1 && ans2[0] == 103 &&
          ans2[1] == 25 && ans3[0] == 4 && ans3[1] == 76;
      
      if (b)
        score++;
      System.out.println(number + ". add():\t\t\t\t\t" + b);
    } catch (Exception e1) {
      System.out.println("\n\n" + number + ". Your code crashed.");
    }
    try {
      number = 2;
      int[] m1 = { 1, 50 }, m2 = { 99, 75 }, m3 = { 3, 25 };
      int[] ans1 = sub(m2, m1), ans2 = sub(m3, m1);
      boolean b = ans1[0] == 98 && ans1[1] == 25 && ans2[0] == 1 &&
          ans2[1] == 75;
      if (b)
        score++;
      System.out.println(number + ". sub():\t\t\t\t\t" + b);
    } catch (Exception e1) {
      System.out.println("\n\n" + number + ". Your code crashed.");
    }
    try {
      number = 3;
      int[] m1 = { 1, 25 };
      int[] ans1 = mult(m1, 4), ans2 = mult(m1, 10);
      boolean b = ans1[0] == 5 && ans1[1] == 0 && ans2[0] == 12 && ans2[1] == 50;
      if (b)
        score++;
      System.out.println(number + ". mult():\t\t\t\t\t" + b);
    } catch (Exception e1) {
      System.out.println("\n\n" + number + ". Your code crashed.");
    }
    try {
      number = 4;
      int[] m1 = { 0, 26 }, m2 = { 99, 05 }, m3 = { 3, 0 };
      boolean b = moneyToString(m1).equals("$0.26") &&
          moneyToString(m2).equals("$99.05") && moneyToString(m3).equals("$3.00");
      if (b)
        score++;
      System.out.println(number + ". moneyToString():\t\t\t" + b);
    } catch (Exception e1) {
      System.out.println("\n\n" + number + ". Your code crashed.");
    }
    try {
      number = 5;
      int[] m1 = { 1, 26 }, m2 = { 1, 26 }, m3 = { 3, 50 };
      boolean b = isEqual(m1, m2) && !isEqual(m1, m3);
      if (b)
        score++;

      System.out.println(number + ". isEqual():\t\t\t\t" + b);
    } catch (Exception e1) {
      System.out.println("\n\n" + number + ". Your code crashed.");
    }
    try {
      number = 6;
      int[] m1 = { 1, 26 }, m2 = { 0, 99 }, m3 = { 5, 10 }, m4 = { 1, 26 };
      boolean b = isGreaterThan(m1, m2) && !isGreaterThan(m1, m3)
          && !isGreaterThan(m1, m4);
      if (b)
        score++;
      System.out.println(number + ". isGreaterThan():\t\t\t" + b);
    } catch (Exception e1) {
      System.out.println("\n\n" + number + ". Your code crashed.");
    }
    try {
      number = 7;
      int[] m1 = { 1, 26 }, m2 = { 0, 99 }, m3 = { 5, 10 }, m4 = { 1, 26 };
      int[] m5 = { 1, 26 }, m6 = { 0, 99 }, m7 = { 5, 10 }, m8 = { 1, 26 };
      boolean b = isLessThan(m2, m1) && isLessThan(m2, m3)
          && isGreaterThanOrEqual(m2, m6) && !isGreaterThanOrEqual(m5, m7)
          && isLessThanOrEqual(m6, m2) && !isLessThanOrEqual(m7, m5);
      if (b)
        score++;
      System.out.println(number + ". <,>=,<= :\t\t\t\t" + b);

     
    } catch (Exception e1) {
      System.out.println("\n\n" + number + ". Your code crashed.");
    }
    try {
      number = 8;
      int[] m1 = { 1, 26 }, m2 = { 99, 01 }, m3 = { 3, 50 }, m4 = { 99, 01 };
      int[] ans = max(m1, m2, m3);
      boolean b = isEqual(ans, m4);

      

      if (b)
        score++;
      System.out.println(number + ". max():\t\t\t\t\t" + b+"\n\n\n");
 printAdditionProblem(m1,m2);
      
    } catch (Exception e1) {
      System.out.println("\n\n" + number + ". Your code crashed.");
    }
    System.out.println("\nTotal: " + score + " / 8\n");
  }
}

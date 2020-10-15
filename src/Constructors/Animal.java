public class Animal {

    public String type;
    public String name;
    public String color;
    public int age;
    public String favoriteFood;
  
    public void animal() {
      type = "unkown";
      name = "unkown";
      color = "unkown";
      age = 0;
      favoriteFood = "unkown";
  
    }
  
    
    public void animal(String t, String n, String c, int a, String f) {
      type = t;
      name = n;
      color = c;
      age = a;
      favoriteFood = f;
  
    }
  
    public static void main(String[] args){
      Animal a = new Animal();
      a.type = "fish";
      a.age = 12;
      System.out.println(a.type);
      System.out.println(a.age);
      System.out.println(a.name);
    }
  }
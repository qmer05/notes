Conditionals
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."

Switch case
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)

While loop
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}

For loop
for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}

Nested for loop
// Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
} 

For each loop
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

Arrays
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4

ArrayList
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}

Array instantiere
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ømer", "Øcalan", "qmer05", 2143);

//instantiere og tilføje på samme tid:
customers.add(new Customer("Ømer", "Øcalan", "qmer05", 2143));
Array tilføjelse af instanser
    ArrayList<Customer> customers = new ArrayList();
        customers.add(customer1);

Loop through and Array
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}

Loop through an Array with for each
for (type variable : arrayname) {
  ...
}

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

Loop through an Array of objects with for each
public static void printCustomers(ArrayList<Customer> listToPrint) {
        for (Customer c : listToPrint) {
            System.out.println(c);
        }

Class
public class Customer {
    private String name;
    private int age;
    private ArrayList<String> cars;
    private ArrayList<Building> building;
}

Constructor
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

toString
    @Override
    public String toString() {
    return "Name: " + name + " age: " + age;
    }

Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String newname) {
        this.name = newName;
    }

    Player player1 = new Player(”Peter”);
    player1.getName()		// hente navnet på player1
    Name.setName(“Poul”)	// skifte navn med setName

Exceptions – try/catch
public class Main {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}

Exceptions – try/catch  - throw
public class Main {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}

Mangler
scanner , text, methods mm.
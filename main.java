// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
  
    //tempeture ranges till +5 wear super warm
    //+5 to 15 warm
    //15 to 30 normal
    //30 + cooling

    double temp = 25;

if (temp <= 5) { System.out.println("Wear super warm clothes!");
  }
else if (temp <= 15) { System.out.println("Wear warm clothes!");
   }
else if (temp <= 30) { System.out.println("Wear normal clothes!");
  }
else { System.out.println("You need cooling");
    }
  }
// if you use else if then we optimize code, computer doesn't have to check every condition//it stops when correct answer has been found
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}

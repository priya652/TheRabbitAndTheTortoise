package thread.tortoise;
import  javax.swing.*;
public class Tortoise {
 private static final int MILESTONE=5;
 public void run() {
  for (int index = 0; index < MILESTONES; index++) {
   switch (index) {
    case 0:
     System.out.println("The Tortoise has started from the start line!");
     break;
    case 1:
     System.out.println("The Tortoise has reached the cool River!");
     break;
    case 2:
     System.out.println("The Tortoise has reached the Mountain Hill!");
     break;
    case 3:
     System.out.println("The Tortoise has reached the big oak tree!");
     break;
    case 4:
     System.out.println("The Tortoise has reached the finish line!");
     break;
   }
   try {
    Thread.sleep(3000L);
   } catch (InterruptedException e) {
    System.err.println("The tortoise has lost the path!");
   }
  }
  JOptionPane.showConfirmDialog(
          null,
          "The Tortoise has completed the race!",
          "Tortoise",
          JOptionPane.OK_CANCEL_OPTION
  );
 }
 }
}

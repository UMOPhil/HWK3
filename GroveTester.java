
public class GroveTester{   
public static void main(String[] args) {

    //name the grove, print it, and use a for loop to plant 9 fir trees in the grove
        Grove grove1 = new Grove("Grove 1");
        System.out.println(grove1);
         for (int i = 0; i < 9; i++){
          Tree fir = new Tree(i, 12, "Fir");
            grove1.plantTree(fir);
         }
    //remove spot 2 and 4 and use toString & system out to count how many trees are in the grove then print that number.
    
            System.out.println(grove1);
            grove1.remove(2);
            grove1.remove(4);
            System.out.println(grove1);

            Tree pine = new Tree(100, 37, "Pine");
            grove1.plantTree(pine);
            System.out.println(grove1);

    // 0 - no trees planted
    // 9 - 9 fir trees planted
    // 7 - 9-2 = 7 because we removed spot 2 & 4
    // 8 - 7+1 = 8 planted a pine tree
    }
}




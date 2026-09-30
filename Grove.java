public class Grove{
    //Two instance variables (Name instance variable and create an array of trees)
    private String name;
    private Tree[] trees;
    //Implements a parameterized constructor that takes (and sets) a single parameter for the name
    //of the grove
    public Grove(String name){
        this.name = name;
        this.trees = new Tree[24]; //create array of Tree with 24 spots
    }


    //method for planting the tree & checking for empty spots in the array
    public int plantTree(Tree t) {
        for(int i = 0; i < trees.length; i++){
            if(trees[i] == null){
                trees[i] = t;
                return i;
            }
        }
        return -1;
    }


    //method for removing a tree by setting it back to null
    public Tree remove(int spot){
        Tree removed = trees[spot];
        trees[spot] = null;
        return removed;
    }

    //count the trees in the grove and return it
    public String toString() {
        int count = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] != null) {
            count++;
        }
    }
    return String.valueOf(count);
    }
}
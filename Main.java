// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
public static int diagonalDifference(List<List<Integer>> arr) {
    System.out.println(arr);
    int leftDiagonal = 0;
    int rightDiagonal = 0;

    for(int i = 0; i < arr.size(); i++){
        for(int j = 0; j < arr.size(); j++){
            if(i == j){
                leftDiagonal += arr.get(i).get(j);
            }
            if(i == arr.size() - j - 1){
                rightDiagonal += arr.get(i).get(j);
            }
        }
    }
    int sum = leftDiagonal - rightDiagonal;
    if(sum < 0) {
        return sum * -1;
    }
    return sum;

}

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}